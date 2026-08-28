import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.ClosedByInterruptException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class ami {
   private static final Logger a = LogUtils.getLogger();
   private final String b;
   private final int c;
   private final avh d;
   private final int e;
   private volatile boolean f;
   @Nullable
   private ServerSocket g;
   private final CopyOnWriteArrayList<Socket> h = new CopyOnWriteArrayList<>();

   public ami(String $$0, int $$1, avh $$2, int $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public void a() throws IOException {
      if (this.g != null && !this.g.isClosed()) {
         a.warn("Remote control server was asked to start, but it is already running. Will ignore.");
      } else {
         this.f = true;
         this.g = new ServerSocket(this.c, 50, InetAddress.getByName(this.b));
         Thread $$0 = new Thread(this::d, "chase-server-acceptor");
         $$0.setDaemon(true);
         $$0.start();
         Thread $$1 = new Thread(this::c, "chase-server-sender");
         $$1.setDaemon(true);
         $$1.start();
      }
   }

   private void c() {
      ami.a $$0 = null;

      while (this.f) {
         if (!this.h.isEmpty()) {
            ami.a $$1 = this.e();
            if ($$1 != null && !$$1.equals($$0)) {
               $$0 = $$1;
               byte[] $$2 = $$1.g().getBytes(StandardCharsets.US_ASCII);

               for (Socket $$3 : this.h) {
                  if (!$$3.isClosed()) {
                     ad.h().submit(() -> {
                        try {
                           OutputStream $$2x = $$3.getOutputStream();
                           $$2x.write($$2);
                           $$2x.flush();
                        } catch (IOException var3x) {
                           a.info("Remote control client socket got an IO exception and will be closed", var3x);
                           IOUtils.closeQuietly($$3);
                        }
                     });
                  }
               }
            }

            List<Socket> $$4 = this.h.stream().filter(Socket::isClosed).collect(Collectors.toList());
            this.h.removeAll($$4);
         }

         if (this.f) {
            try {
               Thread.sleep((long)this.e);
            } catch (InterruptedException var6) {
            }
         }
      }
   }

   public void b() {
      this.f = false;
      IOUtils.closeQuietly(this.g);
      this.g = null;
   }

   private void d() {
      try {
         while (this.f) {
            if (this.g != null) {
               a.info("Remote control server is listening for connections on port {}", this.c);
               Socket $$0 = this.g.accept();
               a.info("Remote control server received client connection on port {}", $$0.getPort());
               this.h.add($$0);
            }
         }
      } catch (ClosedByInterruptException var6) {
         if (this.f) {
            a.info("Remote control server closed by interrupt");
         }
      } catch (IOException var7) {
         if (this.f) {
            a.error("Remote control server closed because of an IO exception", var7);
         }
      } finally {
         IOUtils.closeQuietly(this.g);
      }

      a.info("Remote control server is now stopped");
      this.f = false;
   }

   @Nullable
   private ami.a e() {
      List<ari> $$0 = this.d.t();
      if ($$0.isEmpty()) {
         return null;
      } else {
         ari $$1 = $$0.get(0);
         String $$2 = (String)amq.a.inverse().get($$1.dS().ag());
         return $$2 == null ? null : new ami.a($$2, $$1.dx(), $$1.dz(), $$1.dD(), $$1.dI(), $$1.dK());
      }
   }

   static record a(String a, double b, double c, double d, float e, float f) {
      String g() {
         return String.format(Locale.ROOT, "t %s %.2f %.2f %.2f %.2f %.2f\n", this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }
}
