import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cpn extends esf {
   private static final String a = "raids";
   private final Map<Integer, cpl> b = Maps.newHashMap();
   private final arj c;
   private int d;
   private int e;

   public static esf.a<cpn> a(arj $$0) {
      return new esf.a<>(() -> new cpn($$0), ($$1, $$2) -> a($$0, $$1), bao.l);
   }

   public cpn(arj $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public cpl a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cpl> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cpl $$1 = $$0.next();
         if (this.c.ac().b(def.B)) {
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

      ago.a(this.c, this.b.values());
   }

   public static boolean a(cpm $$0, cpl $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bI() && $$0.gB() && $$0.er() <= 2400 && $$0.dS().C_() == $$1.i().C_() : false;
   }

   @Nullable
   public cpl a(ark $$0, jf $$1) {
      if ($$0.Q_()) {
         return null;
      } else if (this.c.ac().b(def.B)) {
         return null;
      } else {
         dyo $$2 = $$0.dS().C_();
         if (!$$2.c()) {
            return null;
         } else {
            List<cfr> $$3 = this.c.y().c($$0x -> $$0x.a(axg.b), $$1, 64, cfq.b.b).toList();
            int $$4 = 0;
            eyw $$5 = eyw.c;

            for (cfr $$6 : $$3) {
               jf $$7 = $$6.g();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            jf $$8;
            if ($$4 > 0) {
               $$5 = $$5.c(1.0 / (double)$$4);
               $$8 = jf.a((jy)$$5);
            } else {
               $$8 = $$1;
            }

            cpl $$10 = this.a($$0.B(), $$8);
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

   private cpl a(arj $$0, jf $$1) {
      cpl $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new cpl(this.b(), $$0, $$1);
   }

   public static cpn a(arj $$0, ug $$1) {
      cpn $$2 = new cpn($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      um $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         ug $$5 = $$3.a($$4);
         cpl $$6 = new cpl($$0, $$5);
         $$2.b.put($$6.t(), $$6);
      }

      return $$2;
   }

   @Override
   public ug a(ug $$0, jq.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      um $$2 = new um();

      for (cpl $$3 : this.b.values()) {
         ug $$4 = new ug();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(jo<dyo> $$0) {
      return $$0.a(dym.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cpl a(jf $$0, int $$1) {
      cpl $$2 = null;
      double $$3 = (double)$$1;

      for (cpl $$4 : this.b.values()) {
         double $$5 = $$4.s().j($$0);
         if ($$4.u() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
