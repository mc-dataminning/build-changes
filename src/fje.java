import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fje {
   private static final Logger a = LogUtils.getLogger();
   private static final bfx<Runnable> b = bfx.a(ac.f(), "server-list-io");
   private static final int c = 16;
   private final eqp d;
   private final List<fjd> e = Lists.newArrayList();
   private final List<fjd> f = Lists.newArrayList();

   public fje(eqp $$0) {
      this.d = $$0;
   }

   public void a() {
      try {
         this.e.clear();
         this.f.clear();
         qw $$0 = rh.b(new File(this.d.p, "servers.dat"));
         if ($$0 == null) {
            return;
         }

         rc $$1 = $$0.c("servers", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            qw $$3 = $$1.a($$2);
            fjd $$4 = fjd.a($$3);
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
         rc $$0 = new rc();

         for (fjd $$1 : this.e) {
            qw $$2 = $$1.a();
            $$2.a("hidden", false);
            $$0.add($$2);
         }

         for (fjd $$3 : this.f) {
            qw $$4 = $$3.a();
            $$4.a("hidden", true);
            $$0.add($$4);
         }

         qw $$5 = new qw();
         $$5.a("servers", $$0);
         File $$6 = File.createTempFile("servers", ".dat", this.d.p);
         rh.b($$5, $$6);
         File $$7 = new File(this.d.p, "servers.dat_old");
         File $$8 = new File(this.d.p, "servers.dat");
         ac.a($$8, $$6, $$7);
      } catch (Exception var6) {
         a.error("Couldn't save server list", var6);
      }
   }

   public fjd a(int $$0) {
      return this.e.get($$0);
   }

   @Nullable
   public fjd a(String $$0) {
      for (fjd $$1 : this.e) {
         if ($$1.b.equals($$0)) {
            return $$1;
         }
      }

      for (fjd $$2 : this.f) {
         if ($$2.b.equals($$0)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public fjd b(String $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         fjd $$2 = this.f.get($$1);
         if ($$2.b.equals($$0)) {
            this.f.remove($$1);
            this.e.add($$2);
            return $$2;
         }
      }

      return null;
   }

   public void a(fjd $$0) {
      if (!this.e.remove($$0)) {
         this.f.remove($$0);
      }
   }

   public void a(fjd $$0, boolean $$1) {
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
      fjd $$2 = this.a($$0);
      this.e.set($$0, this.a($$1));
      this.e.set($$1, $$2);
      this.b();
   }

   public void a(int $$0, fjd $$1) {
      this.e.set($$0, $$1);
   }

   private static boolean a(fjd $$0, List<fjd> $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         fjd $$3 = $$1.get($$2);
         if ($$3.a.equals($$0.a) && $$3.b.equals($$0.b)) {
            $$1.set($$2, $$0);
            return true;
         }
      }

      return false;
   }

   public static void b(fjd $$0) {
      b.a(() -> {
         fje $$1 = new fje(eqp.O());
         $$1.a();
         if (!a($$0, $$1.e)) {
            a($$0, $$1.f);
         }

         $$1.b();
      });
   }
}
