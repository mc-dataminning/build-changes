import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fli {
   private static final Logger a = LogUtils.getLogger();
   private static final bhj<Runnable> b = bhj.a(ac.f(), "server-list-io");
   private static final int c = 16;
   private final esr d;
   private final List<flh> e = Lists.newArrayList();
   private final List<flh> f = Lists.newArrayList();

   public fli(esr $$0) {
      this.d = $$0;
   }

   public void a() {
      try {
         this.e.clear();
         this.f.clear();
         rz $$0 = sm.a(new File(this.d.p, "servers.dat"));
         if ($$0 == null) {
            return;
         }

         sf $$1 = $$0.c("servers", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            rz $$3 = $$1.a($$2);
            flh $$4 = flh.a($$3);
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
         sf $$0 = new sf();

         for (flh $$1 : this.e) {
            rz $$2 = $$1.a();
            $$2.a("hidden", false);
            $$0.add($$2);
         }

         for (flh $$3 : this.f) {
            rz $$4 = $$3.a();
            $$4.a("hidden", true);
            $$0.add($$4);
         }

         rz $$5 = new rz();
         $$5.a("servers", $$0);
         File $$6 = File.createTempFile("servers", ".dat", this.d.p);
         sm.b($$5, $$6);
         File $$7 = new File(this.d.p, "servers.dat_old");
         File $$8 = new File(this.d.p, "servers.dat");
         ac.a($$8, $$6, $$7);
      } catch (Exception var6) {
         a.error("Couldn't save server list", var6);
      }
   }

   public flh a(int $$0) {
      return this.e.get($$0);
   }

   @Nullable
   public flh a(String $$0) {
      for (flh $$1 : this.e) {
         if ($$1.b.equals($$0)) {
            return $$1;
         }
      }

      for (flh $$2 : this.f) {
         if ($$2.b.equals($$0)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public flh b(String $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         flh $$2 = this.f.get($$1);
         if ($$2.b.equals($$0)) {
            this.f.remove($$1);
            this.e.add($$2);
            return $$2;
         }
      }

      return null;
   }

   public void a(flh $$0) {
      if (!this.e.remove($$0)) {
         this.f.remove($$0);
      }
   }

   public void a(flh $$0, boolean $$1) {
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
      flh $$2 = this.a($$0);
      this.e.set($$0, this.a($$1));
      this.e.set($$1, $$2);
      this.b();
   }

   public void a(int $$0, flh $$1) {
      this.e.set($$0, $$1);
   }

   private static boolean a(flh $$0, List<flh> $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         flh $$3 = $$1.get($$2);
         if ($$3.a.equals($$0.a) && $$3.b.equals($$0.b)) {
            $$1.set($$2, $$0);
            return true;
         }
      }

      return false;
   }

   public static void b(flh $$0) {
      b.a(() -> {
         fli $$1 = new fli(esr.N());
         $$1.a();
         if (!a($$0, $$1.e)) {
            a($$0, $$1.f);
         }

         $$1.b();
      });
   }
}
