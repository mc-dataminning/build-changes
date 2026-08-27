import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbf extends dby implements diy {
   public static final MapCodec<dbf> a = b(dbf::new);
   public static final dpq b = dpp.C;

   @Override
   public MapCodec<dbf> a() {
      return a;
   }

   protected dbf(doy.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a_(doz $$0, cyd $$1, ib $$2) {
      return true;
   }

   @Override
   protected did b_(doz $$0) {
      return did.a;
   }

   @Override
   protected float d(doz $$0, cyd $$1, ib $$2) {
      return 1.0F;
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(b) ? ekt.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      return this.n().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == ekt.c));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }

   @Override
   public crj a(@Nullable cjt $$0, cyy $$1, ib $$2, doz $$3) {
      return $$0 != null && $$0.f() ? diy.super.a($$0, $$1, $$2, $$3) : crj.i;
   }

   @Override
   public boolean a(@Nullable cjt $$0, cyd $$1, ib $$2, doz $$3, ekr $$4) {
      return $$0 != null && $$0.f() ? diy.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
