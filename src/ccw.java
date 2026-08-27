import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ccw extends ebi {
   private static final String a = "raids";
   private final Map<Integer, ccu> b = Maps.newHashMap();
   private final akk c;
   private int d;
   private int e;

   public static ebi.a<ccw> a(akk $$0) {
      return new ebi.a<>(() -> new ccw($$0), $$1 -> a($$0, $$1), ass.l);
   }

   public ccw(akk $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public ccu a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<ccu> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         ccu $$1 = $$0.next();
         if (this.c.X().b(cpi.z)) {
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

      aav.a(this.c, this.b.values());
   }

   public static boolean a(ccv $$0, ccu $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bv() && $$0.gm() && $$0.ej() <= 2400 && $$0.dK().x_() == $$1.i().x_() : false;
   }

   @Nullable
   public ccu a(akl $$0) {
      if ($$0.G_()) {
         return null;
      } else if (this.c.X().b(cpi.z)) {
         return null;
      } else {
         dij $$1 = $$0.dK().x_();
         if (!$$1.c()) {
            return null;
         } else {
            gu $$2 = $$0.dk();
            List<btz> $$3 = this.c.w().c($$0x -> $$0x.a(apv.b), $$2, 64, bty.b.b).toList();
            int $$4 = 0;
            ehe $$5 = ehe.b;

            for (btz $$6 : $$3) {
               gu $$7 = $$6.f();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            gu $$8;
            if ($$4 > 0) {
               $$5 = $$5.a(1.0 / (double)$$4);
               $$8 = gu.a($$5);
            } else {
               $$8 = $$2;
            }

            ccu $$10 = this.a($$0.x(), $$8);
            boolean $$11 = false;
            if (!$$10.j()) {
               if (!this.b.containsKey($$10.u())) {
                  this.b.put($$10.u(), $$10);
               }

               $$11 = true;
            } else if ($$10.m() < $$10.l()) {
               $$11 = true;
            } else {
               $$0.d(bhx.E);
               $$0.c.b(new xs($$0, (byte)43));
            }

            if ($$11) {
               $$10.a((cbn)$$0);
               $$0.c.b(new xs($$0, (byte)43));
               if (!$$10.c()) {
                  $$0.a(apg.aA);
                  ai.I.a($$0);
               }
            }

            this.c();
            return $$10;
         }
      }
   }

   private ccu a(akk $$0, gu $$1) {
      ccu $$2 = $$0.c($$1);
      return $$2 != null ? $$2 : new ccu(this.b(), $$0, $$1);
   }

   public static ccw a(akk $$0, qr $$1) {
      ccw $$2 = new ccw($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      qx $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         qr $$5 = $$3.a($$4);
         ccu $$6 = new ccu($$0, $$5);
         $$2.b.put($$6.u(), $$6);
      }

      return $$2;
   }

   @Override
   public qr a(qr $$0) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      qx $$1 = new qx();

      for (ccu $$2 : this.b.values()) {
         qr $$3 = new qr();
         $$2.a($$3);
         $$1.add($$3);
      }

      $$0.a("Raids", $$1);
      return $$0;
   }

   public static String a(he<dij> $$0) {
      return $$0.a(dih.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public ccu a(gu $$0, int $$1) {
      ccu $$2 = null;
      double $$3 = (double)$$1;

      for (ccu $$4 : this.b.values()) {
         double $$5 = $$4.t().j($$0);
         if ($$4.v() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
