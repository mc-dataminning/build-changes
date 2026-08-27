import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cis extends ehu {
   private static final String a = "raids";
   private final Map<Integer, ciq> b = Maps.newHashMap();
   private final aov c;
   private int d;
   private int e;

   public static ehu.a<cis> a(aov $$0) {
      return new ehu.a<>(() -> new cis($$0), $$1 -> a($$0, $$1), axo.l);
   }

   public cis(aov $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public ciq a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<ciq> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         ciq $$1 = $$0.next();
         if (this.c.Z().b(cvj.B)) {
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

      aep.a(this.c, this.b.values());
   }

   public static boolean a(cir $$0, ciq $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bx() && $$0.gt() && $$0.em() <= 2400 && $$0.dM().E_() == $$1.i().E_() : false;
   }

   @Nullable
   public ciq a(aow $$0) {
      if ($$0.P_()) {
         return null;
      } else if (this.c.Z().b(cvj.B)) {
         return null;
      } else {
         doo $$1 = $$0.dM().E_();
         if (!$$1.c()) {
            return null;
         } else {
            hz $$2 = $$0.dm();
            List<bzi> $$3 = this.c.y().c($$0x -> $$0x.a(auj.b), $$2, 64, bzh.b.b).toList();
            int $$4 = 0;
            ens $$5 = ens.b;

            for (bzi $$6 : $$3) {
               hz $$7 = $$6.f();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            hz $$8;
            if ($$4 > 0) {
               $$5 = $$5.a(1.0 / (double)$$4);
               $$8 = hz.a($$5);
            } else {
               $$8 = $$2;
            }

            ciq $$10 = this.a($$0.z(), $$8);
            boolean $$11 = false;
            if (!$$10.j()) {
               if (!this.b.containsKey($$10.u())) {
                  this.b.put($$10.u(), $$10);
               }

               $$11 = true;
            } else if ($$10.m() < $$10.l()) {
               $$11 = true;
            } else {
               $$0.e(bnd.E);
               $$0.d.b(new abj($$0, (byte)43));
            }

            if ($$11) {
               $$10.a((chh)$$0);
               $$0.d.b(new abj($$0, (byte)43));
               if (!$$10.c()) {
                  $$0.a(atu.aA);
                  am.J.a($$0);
               }
            }

            this.c();
            return $$10;
         }
      }
   }

   private ciq a(aov $$0, hz $$1) {
      ciq $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new ciq(this.b(), $$0, $$1);
   }

   public static cis a(aov $$0, sw $$1) {
      cis $$2 = new cis($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      tc $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         sw $$5 = $$3.a($$4);
         ciq $$6 = new ciq($$0, $$5);
         $$2.b.put($$6.u(), $$6);
      }

      return $$2;
   }

   @Override
   public sw a(sw $$0) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      tc $$1 = new tc();

      for (ciq $$2 : this.b.values()) {
         sw $$3 = new sw();
         $$2.a($$3);
         $$1.add($$3);
      }

      $$0.a("Raids", $$1);
      return $$0;
   }

   public static String a(ij<doo> $$0) {
      return $$0.a(dom.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public ciq a(hz $$0, int $$1) {
      ciq $$2 = null;
      double $$3 = (double)$$1;

      for (ciq $$4 : this.b.values()) {
         double $$5 = $$4.t().j($$0);
         if ($$4.v() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
