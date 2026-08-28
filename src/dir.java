import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dir extends djk implements dqq {
   public static final MapCodec<dir> a = b(dir::new);
   public static final dxm b = dxl.J;

   @Override
   public MapCodec<dir> a() {
      return a;
   }

   protected dir(dwu.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dwv $$0) {
      return $$0.y().c();
   }

   @Override
   protected dpv a_(dwv $$0) {
      return dpv.a;
   }

   @Override
   protected float c(dwv $$0, dfl $$1, ji $$2) {
      return 1.0F;
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(b) ? esy.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == esy.c));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
   }

   @Override
   public cwn a(@Nullable cov $$0, dgh $$1, ji $$2, dwv $$3) {
      return $$0 != null && $$0.b() ? dqq.super.a($$0, $$1, $$2, $$3) : cwn.j;
   }

   @Override
   public boolean a(@Nullable cov $$0, dfl $$1, ji $$2, dwv $$3, esw $$4) {
      return $$0 != null && $$0.b() ? dqq.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
