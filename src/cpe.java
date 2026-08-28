import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cpe extends ern {
   private static final String a = "raids";
   private final Map<Integer, cpc> b = Maps.newHashMap();
   private final arg c;
   private int d;
   private int e;

   public static ern.a<cpe> a(arg $$0) {
      return new ern.a<>(() -> new cpe($$0), ($$1, $$2) -> a($$0, $$1), bal.l);
   }

   public cpe(arg $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public cpc a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cpc> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cpc $$1 = $$0.next();
         if (this.c.ac().b(ddo.B)) {
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

      agn.a(this.c, this.b.values());
   }

   public static boolean a(cpd $$0, cpc $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bI() && $$0.gB() && $$0.eq() <= 2400 && $$0.dS().B_() == $$1.i().B_() : false;
   }

   @Nullable
   public cpc a(arh $$0, je $$1) {
      if ($$0.P_()) {
         return null;
      } else if (this.c.ac().b(ddo.B)) {
         return null;
      } else {
         dxw $$2 = $$0.dS().B_();
         if (!$$2.c()) {
            return null;
         } else {
            List<cfj> $$3 = this.c.y().c($$0x -> $$0x.a(axd.b), $$1, 64, cfi.b.b).toList();
            int $$4 = 0;
            eye $$5 = eye.c;

            for (cfj $$6 : $$3) {
               je $$7 = $$6.g();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            je $$8;
            if ($$4 > 0) {
               $$5 = $$5.c(1.0 / (double)$$4);
               $$8 = je.a((jx)$$5);
            } else {
               $$8 = $$1;
            }

            cpc $$10 = this.a($$0.B(), $$8);
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

   private cpc a(arg $$0, je $$1) {
      cpc $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new cpc(this.b(), $$0, $$1);
   }

   public static cpe a(arg $$0, uf $$1) {
      cpe $$2 = new cpe($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      ul $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         uf $$5 = $$3.a($$4);
         cpc $$6 = new cpc($$0, $$5);
         $$2.b.put($$6.t(), $$6);
      }

      return $$2;
   }

   @Override
   public uf a(uf $$0, jp.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      ul $$2 = new ul();

      for (cpc $$3 : this.b.values()) {
         uf $$4 = new uf();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(jn<dxw> $$0) {
      return $$0.a(dxu.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cpc a(je $$0, int $$1) {
      cpc $$2 = null;
      double $$3 = (double)$$1;

      for (cpc $$4 : this.b.values()) {
         double $$5 = $$4.s().j($$0);
         if ($$4.u() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
