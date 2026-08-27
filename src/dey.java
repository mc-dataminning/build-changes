import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dey extends cwq {
   public static final MapCodec<dey> a = b(dey::new);
   public static final djy b = djx.B;

   @Override
   public MapCodec<dey> a() {
      return a;
   }

   public dey(djg.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cwq $$3, hx $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public djh a(ctp $$0, hx $$1, djh $$2, cfi $$3) {
      if (!$$0.y_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ctp $$0, hx $$1, cth $$2) {
      if (!$$0.B) {
         cbv $$3 = new cbv($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.s();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(ctp $$0, hx $$1) {
      a($$0, $$1, null);
   }

   private static void a(ctp $$0, hx $$1, @Nullable bml $$2) {
      if (!$$0.B) {
         cbv $$3 = new cbv($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dr(), $$3.dt(), $$3.dx(), ars.yB, art.e, 1.0F, 1.0F);
         $$0.a($$2, dnr.I, $$1);
      }
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      cmy $$6 = $$3.b($$4);
      if (!$$6.a(cnb.op) && !$$6.a(cnb.tS)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         a($$1, $$2, $$3);
         $$1.a($$2, cws.a.o(), 11);
         cmt $$7 = $$6.d();
         if (!$$3.f()) {
            if ($$6.a(cnb.op)) {
               $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            } else {
               $$6.h(1);
            }
         }

         $$3.b(asc.c.b($$7));
         return bkb.a($$1.B);
      }
   }

   @Override
   public void a(ctp $$0, djh $$1, elp $$2, cga $$3) {
      if (!$$0.B) {
         hx $$4 = $$2.a();
         blv $$5 = $$3.w();
         if ($$3.bN() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bml ? (bml)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(cth $$0) {
      return false;
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b);
   }
}
