import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpt extends dhj {
   public static final MapCodec<dpt> a = b(dpt::new);
   public static final dvf b = dve.B;

   @Override
   public MapCodec<dpt> a() {
      return a;
   }

   public dpt(dun.d $$0) {
      super($$0);
      this.l(this.o().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public duo a(deg $$0, je $$1, duo $$2, cnu $$3) {
      if (!$$0.w_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arh $$0, je $$1, ddy $$2) {
      ckf $$3 = new ckf($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b());
      int $$4 = $$3.o();
      $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
      $$0.b($$3);
   }

   public static void a(deg $$0, je $$1) {
      a($$0, $$1, null);
   }

   private static void a(deg $$0, je $$1, @Nullable buk $$2) {
      if (!$$0.B) {
         ckf $$3 = new ckf($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dx(), $$3.dz(), $$3.dD(), awe.zE, awf.e, 1.0F, 1.0F);
         $$0.a($$2, dzl.I, $$1);
      }
   }

   @Override
   protected brp a(cvp $$0, duo $$1, deg $$2, je $$3, cnu $$4, bro $$5, eyo $$6) {
      if (!$$0.a(cvt.ot) && !$$0.a(cvt.tY)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dhl.a.o(), 11);
         cvk $$7 = $$0.h();
         if ($$0.a(cvt.ot)) {
            $$0.a(1, $$4, buk.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(awo.c.b($$7));
         return brp.a;
      }
   }

   @Override
   protected void a(deg $$0, duo $$1, eyo $$2, coo $$3) {
      if (!$$0.B) {
         je $$4 = $$2.b();
         bto $$5 = $$3.s();
         if ($$3.bV() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof buk ? (buk)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(ddy $$0) {
      return false;
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }
}
