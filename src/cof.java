import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cof extends eox {
   private static final String a = "raids";
   private final Map<Integer, cod> b = Maps.newHashMap();
   private final arb c;
   private int d;
   private int e;

   public static eox.a<cof> a(arb $$0) {
      return new eox.a<>(() -> new cof($$0), ($$1, $$2) -> a($$0, $$1), bab.l);
   }

   public cof(arb $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public cod a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cod> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cod $$1 = $$0.next();
         if (this.c.ab().b(dbp.B)) {
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

      agp.a(this.c, this.b.values());
   }

   public static boolean a(coe $$0, cod $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bD() && $$0.gD() && $$0.eq() <= 2400 && $$0.dP().D_() == $$1.i().D_() : false;
   }

   @Nullable
   public cod a(arc $$0, iz $$1) {
      if ($$0.N_()) {
         return null;
      } else if (this.c.ab().b(dbp.B)) {
         return null;
      } else {
         dvp $$2 = $$0.dP().D_();
         if (!$$2.c()) {
            return null;
         } else {
            List<cep> $$3 = this.c.y().c($$0x -> $$0x.a(aww.b), $$1, 64, ceo.b.b).toList();
            int $$4 = 0;
            evm $$5 = evm.b;

            for (cep $$6 : $$3) {
               iz $$7 = $$6.f();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            iz $$8;
            if ($$4 > 0) {
               $$5 = $$5.a(1.0 / (double)$$4);
               $$8 = iz.a($$5);
            } else {
               $$8 = $$1;
            }

            cod $$10 = this.a($$0.z(), $$8);
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

   private cod a(arb $$0, iz $$1) {
      cod $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new cod(this.b(), $$0, $$1);
   }

   public static cof a(arb $$0, ur $$1) {
      cof $$2 = new cof($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      ux $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         ur $$5 = $$3.a($$4);
         cod $$6 = new cod($$0, $$5);
         $$2.b.put($$6.t(), $$6);
      }

      return $$2;
   }

   @Override
   public ur a(ur $$0, jk.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      ux $$2 = new ux();

      for (cod $$3 : this.b.values()) {
         ur $$4 = new ur();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(ji<dvp> $$0) {
      return $$0.a(dvn.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cod a(iz $$0, int $$1) {
      cod $$2 = null;
      double $$3 = (double)$$1;

      for (cod $$4 : this.b.values()) {
         double $$5 = $$4.s().j($$0);
         if ($$4.u() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
