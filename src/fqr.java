import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqr {
   private static final Logger a = LogUtils.getLogger();
   private static final bkp<Runnable> b = bkp.a(ac.f(), "server-list-io");
   private static final int c = 16;
   private final exo d;
   private final List<fqq> e = Lists.newArrayList();
   private final List<fqq> f = Lists.newArrayList();

   public fqr(exo $$0) {
      this.d = $$0;
   }

   public void a() {
      try {
         this.e.clear();
         this.f.clear();
         sw $$0 = tj.a(this.d.p.toPath().resolve("servers.dat"));
         if ($$0 == null) {
            return;
         }

         tc $$1 = $$0.c("servers", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            sw $$3 = $$1.a($$2);
            fqq $$4 = fqq.a($$3);
            if ($$3.q("hidden")) {
               this.f.add($$4);
            } else {
               this.e.add($$4);
            }
         }
      } catch (Exception var6) {
         a.error("Couldn't load server list", var6);
      }
   }

   public void b() {
      try {
         tc $$0 = new tc();

         for (fqq $$1 : this.e) {
            sw $$2 = $$1.a();
            $$2.a("hidden", false);
            $$0.add($$2);
         }

         for (fqq $$3 : this.f) {
            sw $$4 = $$3.a();
            $$4.a("hidden", true);
            $$0.add($$4);
         }

         sw $$5 = new sw();
         $$5.a("servers", $$0);
         Path $$6 = this.d.p.toPath();
         Path $$7 = Files.createTempFile($$6, "servers", ".dat");
         tj.b($$5, $$7);
         Path $$8 = $$6.resolve("servers.dat_old");
         Path $$9 = $$6.resolve("servers.dat");
         ac.a($$9, $$7, $$8);
      } catch (Exception var7) {
         a.error("Couldn't save server list", var7);
      }
   }

   public fqq a(int $$0) {
      return this.e.get($$0);
   }

   @Nullable
   public fqq a(String $$0) {
      for (fqq $$1 : this.e) {
         if ($$1.b.equals($$0)) {
            return $$1;
         }
      }

      for (fqq $$2 : this.f) {
         if ($$2.b.equals($$0)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public fqq b(String $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         fqq $$2 = this.f.get($$1);
         if ($$2.b.equals($$0)) {
            this.f.remove($$1);
            this.e.add($$2);
            return $$2;
         }
      }

      return null;
   }

   public void a(fqq $$0) {
      if (!this.e.remove($$0)) {
         this.f.remove($$0);
      }
   }

   public void a(fqq $$0, boolean $$1) {
      if ($$1) {
         this.f.add(0, $$0);

         while (this.f.size() > 16) {
            this.f.remove(this.f.size() - 1);
         }
      } else {
         this.e.add($$0);
      }
   }

   public int c() {
      return this.e.size();
   }

   public void a(int $$0, int $$1) {
      fqq $$2 = this.a($$0);
      this.e.set($$0, this.a($$1));
      this.e.set($$1, $$2);
      this.b();
   }

   public void a(int $$0, fqq $$1) {
      this.e.set($$0, $$1);
   }

   private static boolean a(fqq $$0, List<fqq> $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         fqq $$3 = $$1.get($$2);
         if ($$3.a.equals($$0.a) && $$3.b.equals($$0.b)) {
            $$1.set($$2, $$0);
            return true;
         }
      }

      return false;
   }

   public static void b(fqq $$0) {
      b.a(() -> {
         fqr $$1 = new fqr(exo.P());
         $$1.a();
         if (!a($$0, $$1.e)) {
            a($$0, $$1.f);
         }

         $$1.b();
      });
   }
}
