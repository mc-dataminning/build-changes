import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class crl extends evi {
   private static final String a = "raids";
   private final Map<Integer, crj> b = Maps.newHashMap();
   private final ash c;
   private int d;
   private int e;

   public static evi.a<crl> a(ash $$0) {
      return new evi.a<>(() -> new crl($$0), ($$1, $$2) -> a($$0, $$1), bbs.l);
   }

   public crl(ash $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public crj a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<crj> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         crj $$1 = $$0.next();
         if (this.c.N().b(dhd.C)) {
            $$1.n();
         }

         if ($$1.d()) {
            $$0.remove();
            this.c();
         } else {
            $$1.o();
         }
      }

      if (this.e % 200 == 0) {
         this.c();
      }

      ahj.a(this.c, this.b.values());
   }

   public static boolean a(crk $$0, crj $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bL() && $$0.gy() && $$0.et() <= 2400 && $$0.dV().G_() == $$1.i().G_() : false;
   }

   @Nullable
   public crj a(asi $$0, jh $$1) {
      if ($$0.aa_()) {
         return null;
      } else if (this.c.N().b(dhd.C)) {
         return null;
      } else {
         ebp $$2 = $$0.dV().G_();
         if (!$$2.c()) {
            return null;
         } else {
            List<chk> $$3 = this.c.z().c($$0x -> $$0x.a(ayf.b), $$1, 64, chj.b.b).toList();
            int $$4 = 0;
            fbx $$5 = fbx.c;

            for (chk $$6 : $$3) {
               jh $$7 = $$6.g();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            jh $$8;
            if ($$4 > 0) {
               $$5 = $$5.c(1.0 / (double)$$4);
               $$8 = jh.a((ka)$$5);
            } else {
               $$8 = $$1;
            }

            crj $$10 = this.a($$0.y(), $$8);
            if (!$$10.j() && !this.b.containsKey($$10.t())) {
               this.b.put($$10.t(), $$10);
            }

            if (!$$10.j() || $$10.m() < $$10.l()) {
               $$10.a($$0);
            }

            this.c();
            return $$10;
         }
      }
   }

   private crj a(ash $$0, jh $$1) {
      crj $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new crj(this.b(), $$0, $$1);
   }

   public static crl a(ash $$0, ux $$1) {
      crl $$2 = new crl($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      vd $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         ux $$5 = $$3.a($$4);
         crj $$6 = new crj($$0, $$5);
         $$2.b.put($$6.t(), $$6);
      }

      return $$2;
   }

   @Override
   public ux a(ux $$0, js.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      vd $$2 = new vd();

      for (crj $$3 : this.b.values()) {
         ux $$4 = new ux();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(jq<ebp> $$0) {
      return $$0.a(ebn.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public crj a(jh $$0, int $$1) {
      crj $$2 = null;
      double $$3 = (double)$$1;

      for (crj $$4 : this.b.values()) {
         double $$5 = $$4.s().j($$0);
         if ($$4.u() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
