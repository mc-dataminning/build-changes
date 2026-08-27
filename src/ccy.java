import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ccy extends ebm {
   private static final String a = "raids";
   private final Map<Integer, ccw> b = Maps.newHashMap();
   private final akn c;
   private int d;
   private int e;

   public static ebm.a<ccy> a(akn $$0) {
      return new ebm.a<>(() -> new ccy($$0), $$1 -> a($$0, $$1), asv.l);
   }

   public ccy(akn $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public ccw a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<ccw> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         ccw $$1 = $$0.next();
         if (this.c.X().b(cpm.z)) {
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

      aay.a(this.c, this.b.values());
   }

   public static boolean a(ccx $$0, ccw $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bv() && $$0.gn() && $$0.ej() <= 2400 && $$0.dK().x_() == $$1.i().x_() : false;
   }

   @Nullable
   public ccw a(ako $$0) {
      if ($$0.G_()) {
         return null;
      } else if (this.c.X().b(cpm.z)) {
         return null;
      } else {
         din $$1 = $$0.dK().x_();
         if (!$$1.c()) {
            return null;
         } else {
            gw $$2 = $$0.dk();
            List<bub> $$3 = this.c.w().c($$0x -> $$0x.a(apy.b), $$2, 64, bua.b.b).toList();
            int $$4 = 0;
            ehi $$5 = ehi.b;

            for (bub $$6 : $$3) {
               gw $$7 = $$6.f();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            gw $$8;
            if ($$4 > 0) {
               $$5 = $$5.a(1.0 / (double)$$4);
               $$8 = gw.a($$5);
            } else {
               $$8 = $$2;
            }

            ccw $$10 = this.a($$0.x(), $$8);
            boolean $$11 = false;
            if (!$$10.j()) {
               if (!this.b.containsKey($$10.u())) {
                  this.b.put($$10.u(), $$10);
               }

               $$11 = true;
            } else if ($$10.m() < $$10.l()) {
               $$11 = true;
            } else {
               $$0.d(bia.E);
               $$0.c.b(new xv($$0, (byte)43));
            }

            if ($$11) {
               $$10.a((cbp)$$0);
               $$0.c.b(new xv($$0, (byte)43));
               if (!$$10.c()) {
                  $$0.a(apj.aA);
                  al.I.a($$0);
               }
            }

            this.c();
            return $$10;
         }
      }
   }

   private ccw a(akn $$0, gw $$1) {
      ccw $$2 = $$0.c($$1);
      return $$2 != null ? $$2 : new ccw(this.b(), $$0, $$1);
   }

   public static ccy a(akn $$0, qu $$1) {
      ccy $$2 = new ccy($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      ra $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         qu $$5 = $$3.a($$4);
         ccw $$6 = new ccw($$0, $$5);
         $$2.b.put($$6.u(), $$6);
      }

      return $$2;
   }

   @Override
   public qu a(qu $$0) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      ra $$1 = new ra();

      for (ccw $$2 : this.b.values()) {
         qu $$3 = new qu();
         $$2.a($$3);
         $$1.add($$3);
      }

      $$0.a("Raids", $$1);
      return $$0;
   }

   public static String a(hg<din> $$0) {
      return $$0.a(dil.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public ccw a(gw $$0, int $$1) {
      ccw $$2 = null;
      double $$3 = (double)$$1;

      for (ccw $$4 : this.b.values()) {
         double $$5 = $$4.t().j($$0);
         if ($$4.v() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
