import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ccv extends ebh {
   private static final String a = "raids";
   private final Map<Integer, cct> b = Maps.newHashMap();
   private final akk c;
   private int d;
   private int e;

   public static ebh.a<ccv> a(akk $$0) {
      return new ebh.a<>(() -> new ccv($$0), $$1 -> a($$0, $$1), ass.l);
   }

   public ccv(akk $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public cct a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cct> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cct $$1 = $$0.next();
         if (this.c.X().b(cph.z)) {
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

   public static boolean a(ccu $$0, cct $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bv() && $$0.gn() && $$0.ej() <= 2400 && $$0.dK().x_() == $$1.i().x_() : false;
   }

   @Nullable
   public cct a(akl $$0) {
      if ($$0.G_()) {
         return null;
      } else if (this.c.X().b(cph.z)) {
         return null;
      } else {
         dii $$1 = $$0.dK().x_();
         if (!$$1.c()) {
            return null;
         } else {
            gu $$2 = $$0.dk();
            List<bty> $$3 = this.c.w().c($$0x -> $$0x.a(apv.b), $$2, 64, btx.b.b).toList();
            int $$4 = 0;
            ehd $$5 = ehd.b;

            for (bty $$6 : $$3) {
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

            cct $$10 = this.a($$0.x(), $$8);
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
               $$10.a((cbm)$$0);
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

   private cct a(akk $$0, gu $$1) {
      cct $$2 = $$0.c($$1);
      return $$2 != null ? $$2 : new cct(this.b(), $$0, $$1);
   }

   public static ccv a(akk $$0, qr $$1) {
      ccv $$2 = new ccv($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      qx $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         qr $$5 = $$3.a($$4);
         cct $$6 = new cct($$0, $$5);
         $$2.b.put($$6.u(), $$6);
      }

      return $$2;
   }

   @Override
   public qr a(qr $$0) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      qx $$1 = new qx();

      for (cct $$2 : this.b.values()) {
         qr $$3 = new qr();
         $$2.a($$3);
         $$1.add($$3);
      }

      $$0.a("Raids", $$1);
      return $$0;
   }

   public static String a(he<dii> $$0) {
      return $$0.a(dig.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cct a(gu $$0, int $$1) {
      cct $$2 = null;
      double $$3 = (double)$$1;

      for (cct $$4 : this.b.values()) {
         double $$5 = $$4.t().j($$0);
         if ($$4.v() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
