import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diu extends djn implements dqt {
   public static final MapCodec<diu> a = b(diu::new);
   public static final dxp b = dxo.J;

   @Override
   public MapCodec<diu> a() {
      return a;
   }

   protected diu(dwx.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dwy $$0) {
      return $$0.y().c();
   }

   @Override
   protected dpy a_(dwy $$0) {
      return dpy.a;
   }

   @Override
   protected float c(dwy $$0, dfo $$1, ji $$2) {
      return 1.0F;
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(b) ? etb.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == etb.c));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b);
   }

   @Override
   public cwq a(@Nullable coy $$0, dgk $$1, ji $$2, dwy $$3) {
      return $$0 != null && $$0.b() ? dqt.super.a($$0, $$1, $$2, $$3) : cwq.j;
   }

   @Override
   public boolean a(@Nullable coy $$0, dfo $$1, ji $$2, dwy $$3, esz $$4) {
      return $$0 != null && $$0.b() ? dqt.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
