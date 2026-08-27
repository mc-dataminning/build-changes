import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class bzx extends dyj {
   private static final String a = "raids";
   private final Map<Integer, bzv> b = Maps.newHashMap();
   private final aif c;
   private int d;
   private int e;

   public bzx(aif $$0) {
      this.c = $$0;
      this.d = 1;
      this.b();
   }

   public bzv a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<bzv> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         bzv $$1 = $$0.next();
         if (this.c.X().b(cmi.z)) {
            $$1.n();
         }

         if ($$1.d()) {
            $$0.remove();
            this.b();
         } else {
            $$1.o();
         }
      }

      if (this.e % 200 == 0) {
         this.b();
      }

      za.a(this.c, this.b.values());
   }

   public static boolean a(bzw $$0, bzv $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bs() && $$0.gl() && $$0.eh() <= 2400 && $$0.dI().x_() == $$1.i().x_() : false;
   }

   @Nullable
   public bzv a(aig $$0) {
      if ($$0.G_()) {
         return null;
      } else if (this.c.X().b(cmi.z)) {
         return null;
      } else {
         dfk $$1 = $$0.dI().x_();
         if (!$$1.c()) {
            return null;
         } else {
            gu $$2 = $$0.di();
            List<bra> $$3 = this.c.w().c($$0x -> $$0x.a(ang.b), $$2, 64, bqz.b.b).toList();
            int $$4 = 0;
            eei $$5 = eei.b;

            for (bra $$6 : $$3) {
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

            bzv $$10 = this.a($$0.x(), $$8);
            boolean $$11 = false;
            if (!$$10.j()) {
               if (!this.b.containsKey($$10.u())) {
                  this.b.put($$10.u(), $$10);
               }

               $$11 = true;
            } else if ($$10.m() < $$10.l()) {
               $$11 = true;
            } else {
               $$0.d(bfc.E);
               $$0.c.a(new vu($$0, (byte)43));
            }

            if ($$11) {
               $$10.a((byo)$$0);
               $$0.c.a(new vu($$0, (byte)43));
               if (!$$10.c()) {
                  $$0.a(amr.aA);
                  ai.I.a($$0);
               }
            }

            this.b();
            return $$10;
         }
      }
   }

   private bzv a(aif $$0, gu $$1) {
      bzv $$2 = $$0.c($$1);
      return $$2 != null ? $$2 : new bzv(this.d(), $$0, $$1);
   }

   public static bzx a(aif $$0, qr $$1) {
      bzx $$2 = new bzx($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      qx $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         qr $$5 = $$3.a($$4);
         bzv $$6 = new bzv($$0, $$5);
         $$2.b.put($$6.u(), $$6);
      }

      return $$2;
   }

   @Override
   public qr a(qr $$0) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      qx $$1 = new qx();

      for (bzv $$2 : this.b.values()) {
         qr $$3 = new qr();
         $$2.a($$3);
         $$1.add($$3);
      }

      $$0.a("Raids", $$1);
      return $$0;
   }

   public static String a(he<dfk> $$0) {
      return $$0.a(dfi.c) ? "raids_end" : "raids";
   }

   private int d() {
      return ++this.d;
   }

   @Nullable
   public bzv a(gu $$0, int $$1) {
      bzv $$2 = null;
      double $$3 = (double)$$1;

      for (bzv $$4 : this.b.values()) {
         double $$5 = $$4.t().j($$0);
         if ($$4.v() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
