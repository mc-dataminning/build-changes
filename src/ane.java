import com.google.common.base.Charsets;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.Socket;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class ane {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 5;
   private final String c;
   private final int d;
   private final MinecraftServer e;
   private volatile boolean f;
   @Nullable
   private Socket g;
   @Nullable
   private Thread h;

   public ane(String $$0, int $$1, MinecraftServer $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public void a() {
      if (this.h != null && this.h.isAlive()) {
         a.warn("Remote control client was asked to start, but it is already running. Will ignore.");
      }

      this.f = true;
      this.h = new Thread(this::c, "chase-client");
      this.h.setDaemon(true);
      this.h.start();
   }

   public void b() {
      this.f = false;
      IOUtils.closeQuietly(this.g);
      this.g = null;
      this.h = null;
   }

   public void c() {
      String $$0 = this.c + ":" + this.d;

      while (this.f) {
         try {
            a.info("Connecting to remote control server {}", $$0);
            this.g = new Socket(this.c, this.d);
            a.info("Connected to remote control server! Will continuously execute the command broadcasted by that server.");

            try (BufferedReader $$1 = new BufferedReader(new InputStreamReader(this.g.getInputStream(), Charsets.US_ASCII))) {
               while (this.f) {
                  String $$2 = $$1.readLine();
                  if ($$2 == null) {
                     a.warn("Lost connection to remote control server {}. Will retry in {}s.", $$0, 5);
                     break;
                  }

                  this.a($$2);
               }
            } catch (IOException var8) {
               a.warn("Lost connection to remote control server {}. Will retry in {}s.", $$0, 5);
            }
         } catch (IOException var9) {
            a.warn("Failed to connect to remote control server {}. Will retry in {}s.", $$0, 5);
         }

         if (this.f) {
            try {
               Thread.sleep(5000L);
            } catch (InterruptedException var5) {
            }
         }
      }
   }

   private void a(String $$0) {
      try (Scanner $$1 = new Scanner(new StringReader($$0))) {
         $$1.useLocale(Locale.ROOT);
         String $$2 = $$1.next();
         if ("t".equals($$2)) {
            this.a($$1);
         } else {
            a.warn("Unknown message type '{}'", $$2);
         }
      } catch (NoSuchElementException var7) {
         a.warn("Could not parse message '{}', ignoring", $$0);
      }
   }

   private void a(Scanner $$0) {
      this.b($$0)
         .ifPresent(
            $$0x -> this.b(
                  String.format(Locale.ROOT, "execute in %s run tp @s %.3f %.3f %.3f %.3f %.3f", $$0x.a.a(), $$0x.b.d, $$0x.b.e, $$0x.b.f, $$0x.c.j, $$0x.c.i)
               )
         );
   }

   private Optional<ane.a> b(Scanner $$0) {
      aly<dha> $$1 = (aly<dha>)ann.a.get($$0.next());
      if ($$1 == null) {
         return Optional.empty();
      } else {
         float $$2 = $$0.nextFloat();
         float $$3 = $$0.nextFloat();
         float $$4 = $$0.nextFloat();
         float $$5 = $$0.nextFloat();
         float $$6 = $$0.nextFloat();
         return Optional.of(new ane.a($$1, new fbs((double)$$2, (double)$$3, (double)$$4), new fbr($$6, $$5)));
      }
   }

   private void b(String $$0) {
      this.e.execute(() -> {
         List<asi> $$1 = this.e.ag().t();
         if (!$$1.isEmpty()) {
            asi $$2 = $$1.get(0);
            ash $$3 = this.e.J();
            ew $$4 = new ew($$2.z(), fbs.a($$3.Y()), fbr.a, $$3, 4, "", xu.a, this.e, $$2);
            ex $$5 = this.e.aG();
            $$5.a($$4, $$0);
         }
      });
   }

   static record a(aly<dha> a, fbs b, fbr c) {
   }
}
