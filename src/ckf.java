import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ckf extends ejs {
   private static final String a = "raids";
   private final Map<Integer, ckd> b = Maps.newHashMap();
   private final apf c;
   private int d;
   private int e;

   public static ejs.a<ckf> a(apf $$0) {
      return new ejs.a<>(() -> new ckf($$0), ($$1, $$2) -> a($$0, $$1), ayc.l);
   }

   public ckf(apf $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public ckd a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<ckd> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         ckd $$1 = $$0.next();
         if (this.c.Z().b(cwv.B)) {
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

      aew.a(this.c, this.b.values());
   }

   public static boolean a(cke $$0, ckd $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bA() && $$0.gA() && $$0.en() <= 2400 && $$0.dM().D_() == $$1.i().D_() : false;
   }

   @Nullable
   public ckd a(apg $$0) {
      if ($$0.N_()) {
         return null;
      } else if (this.c.Z().b(cwv.B)) {
         return null;
      } else {
         dqm $$1 = $$0.dM().D_();
         if (!$$1.c()) {
            return null;
         } else {
            ib $$2 = $$0.dm();
            List<cas> $$3 = this.c.y().c($$0x -> $$0x.a(auy.b), $$2, 64, car.b.b).toList();
            int $$4 = 0;
            epr $$5 = epr.b;

            for (cas $$6 : $$3) {
               ib $$7 = $$6.f();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            ib $$8;
            if ($$4 > 0) {
               $$5 = $$5.a(1.0 / (double)$$4);
               $$8 = ib.a($$5);
            } else {
               $$8 = $$2;
            }

            ckd $$10 = this.a($$0.z(), $$8);
            boolean $$11 = false;
            if (!$$10.j()) {
               if (!this.b.containsKey($$10.u())) {
                  this.b.put($$10.u(), $$10);
               }

               $$11 = true;
            } else if ($$10.m() < $$10.l()) {
               $$11 = true;
            } else {
               $$0.e(bol.E);
               $$0.d.b(new abq($$0, (byte)43));
            }

            if ($$11) {
               $$10.a((cis)$$0);
               $$0.d.b(new abq($$0, (byte)43));
               if (!$$10.c()) {
                  $$0.a(aui.aA);
                  am.J.a($$0);
               }
            }

            this.c();
            return $$10;
         }
      }
   }

   private ckd a(apf $$0, ib $$1) {
      ckd $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new ckd(this.b(), $$0, $$1);
   }

   public static ckf a(apf $$0, ta $$1) {
      ckf $$2 = new ckf($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      tg $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         ta $$5 = $$3.a($$4);
         ckd $$6 = new ckd($$0, $$5);
         $$2.b.put($$6.u(), $$6);
      }

      return $$2;
   }

   @Override
   public ta a(ta $$0, in.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      tg $$2 = new tg();

      for (ckd $$3 : this.b.values()) {
         ta $$4 = new ta();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(il<dqm> $$0) {
      return $$0.a(dqk.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public ckd a(ib $$0, int $$1) {
      ckd $$2 = null;
      double $$3 = (double)$$1;

      for (ckd $$4 : this.b.values()) {
         double $$5 = $$4.t().j($$0);
         if ($$4.v() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
