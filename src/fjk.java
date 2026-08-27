import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjk {
   private static final Logger a = LogUtils.getLogger();
   private static final bft<Runnable> b = bft.a(ac.f(), "server-list-io");
   private static final int c = 16;
   private final eqx d;
   private final List<fjj> e = Lists.newArrayList();
   private final List<fjj> f = Lists.newArrayList();

   public fjk(eqx $$0) {
      this.d = $$0;
   }

   public void a() {
      try {
         this.e.clear();
         this.f.clear();
         qy $$0 = rj.b(new File(this.d.p, "servers.dat"));
         if ($$0 == null) {
            return;
         }

         re $$1 = $$0.c("servers", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            qy $$3 = $$1.a($$2);
            fjj $$4 = fjj.a($$3);
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
         re $$0 = new re();

         for (fjj $$1 : this.e) {
            qy $$2 = $$1.a();
            $$2.a("hidden", false);
            $$0.add($$2);
         }

         for (fjj $$3 : this.f) {
            qy $$4 = $$3.a();
            $$4.a("hidden", true);
            $$0.add($$4);
         }

         qy $$5 = new qy();
         $$5.a("servers", $$0);
         File $$6 = File.createTempFile("servers", ".dat", this.d.p);
         rj.b($$5, $$6);
         File $$7 = new File(this.d.p, "servers.dat_old");
         File $$8 = new File(this.d.p, "servers.dat");
         ac.a($$8, $$6, $$7);
      } catch (Exception var6) {
         a.error("Couldn't save server list", var6);
      }
   }

   public fjj a(int $$0) {
      return this.e.get($$0);
   }

   @Nullable
   public fjj a(String $$0) {
      for (fjj $$1 : this.e) {
         if ($$1.b.equals($$0)) {
            return $$1;
         }
      }

      for (fjj $$2 : this.f) {
         if ($$2.b.equals($$0)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public fjj b(String $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         fjj $$2 = this.f.get($$1);
         if ($$2.b.equals($$0)) {
            this.f.remove($$1);
            this.e.add($$2);
            return $$2;
         }
      }

      return null;
   }

   public void a(fjj $$0) {
      if (!this.e.remove($$0)) {
         this.f.remove($$0);
      }
   }

   public void a(fjj $$0, boolean $$1) {
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
      fjj $$2 = this.a($$0);
      this.e.set($$0, this.a($$1));
      this.e.set($$1, $$2);
      this.b();
   }

   public void a(int $$0, fjj $$1) {
      this.e.set($$0, $$1);
   }

   private static boolean a(fjj $$0, List<fjj> $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         fjj $$3 = $$1.get($$2);
         if ($$3.a.equals($$0.a) && $$3.b.equals($$0.b)) {
            $$1.set($$2, $$0);
            return true;
         }
      }

      return false;
   }

   public static void b(fjj $$0) {
      b.a(() -> {
         fjk $$1 = new fjk(eqx.O());
         $$1.a();
         if (!a($$0, $$1.e)) {
            a($$0, $$1.f);
         }

         $$1.b();
      });
   }
}
