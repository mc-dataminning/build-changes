import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cpx extends esq {
   private static final String a = "raids";
   private final Map<Integer, cpv> b = Maps.newHashMap();
   private final arm c;
   private int d;
   private int e;

   public static esq.a<cpx> a(arm $$0) {
      return new esq.a<>(() -> new cpx($$0), ($$1, $$2) -> a($$0, $$1), bas.l);
   }

   public cpx(arm $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public cpv a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cpv> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cpv $$1 = $$0.next();
         if (this.c.ac().b(der.B)) {
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

      agr.a(this.c, this.b.values());
   }

   public static boolean a(cpw $$0, cpv $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bM() && $$0.gI() && $$0.ew() <= 2400 && $$0.dX().D_() == $$1.i().D_() : false;
   }

   @Nullable
   public cpv a(arn $$0, jg $$1) {
      if ($$0.R_()) {
         return null;
      } else if (this.c.ac().b(der.B)) {
         return null;
      } else {
         dyz $$2 = $$0.dX().D_();
         if (!$$2.c()) {
            return null;
         } else {
            List<cga> $$3 = this.c.y().c($$0x -> $$0x.a(axk.b), $$1, 64, cfz.b.b).toList();
            int $$4 = 0;
            ezh $$5 = ezh.c;

            for (cga $$6 : $$3) {
               jg $$7 = $$6.g();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            jg $$8;
            if ($$4 > 0) {
               $$5 = $$5.c(1.0 / (double)$$4);
               $$8 = jg.a((jz)$$5);
            } else {
               $$8 = $$1;
            }

            cpv $$10 = this.a($$0.B(), $$8);
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

   private cpv a(arm $$0, jg $$1) {
      cpv $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new cpv(this.b(), $$0, $$1);
   }

   public static cpx a(arm $$0, uj $$1) {
      cpx $$2 = new cpx($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      up $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         uj $$5 = $$3.a($$4);
         cpv $$6 = new cpv($$0, $$5);
         $$2.b.put($$6.t(), $$6);
      }

      return $$2;
   }

   @Override
   public uj a(uj $$0, jr.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      up $$2 = new up();

      for (cpv $$3 : this.b.values()) {
         uj $$4 = new uj();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(jp<dyz> $$0) {
      return $$0.a(dyx.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cpv a(jg $$0, int $$1) {
      cpv $$2 = null;
      double $$3 = (double)$$1;

      for (cpv $$4 : this.b.values()) {
         double $$5 = $$4.s().j($$0);
         if ($$4.u() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
