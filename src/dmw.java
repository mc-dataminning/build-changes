import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmw extends diy<dvp> implements drl {
   public static final MapCodec<dmw> b = b(dmw::new);
   public static final dyo<jn> c = dod.e;
   public static final dyh d = dyg.I;
   private static final fcr e = dke.b(14.0, 0.0, 14.0);
   private static final wp f = wp.c("container.enderchest");

   @Override
   public MapCodec<dmw> a() {
      return b;
   }

   protected dmw(dxp.d $$0) {
      super($$0, () -> duu.d);
      this.l(this.B.b().b(c, jn.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dmm.c<? extends duz> a(dxq $$0, dgz $$1, ji $$2, boolean $$3) {
      return dmm.b::b;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return e;
   }

   @Override
   public dxq a(dax $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == etx.c));
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      cuk $$5 = $$3.gz();
      if ($$5 != null && $$1.c_($$2) instanceof dvp $$7) {
         ji $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return bsy.a;
         } else {
            if ($$1 instanceof ard $$10) {
               $$5.a($$7);
               $$3.a(new btg(($$1x, $$2x, $$3x) -> ctf.a($$1x, $$2x, $$5), f));
               $$3.a(awk.aj);
               cog.a($$10, $$3, true);
            }

            return bsy.a;
         }
      } else {
         return bsy.a;
      }
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dvp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return $$0.C ? a($$2, duu.d, dvp::a) : null;
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(lt.af, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(d) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      dus $$4 = $$1.c_($$2);
      if ($$4 instanceof dvp) {
         ((dvp)$$4).b();
      }
   }
}
