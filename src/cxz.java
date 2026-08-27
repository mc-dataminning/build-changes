import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxz extends cys implements dfs {
   public static final MapCodec<cxz> a = b(cxz::new);
   public static final dma b = dlz.C;

   @Override
   public MapCodec<cxz> a() {
      return a;
   }

   protected cxz(dli.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a_(dlj $$0, cux $$1, hz $$2) {
      return true;
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.a;
   }

   @Override
   protected float d(dlj $$0, cux $$1, hz $$2) {
      return 1.0F;
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(b) ? egx.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == egx.c));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b);
   }

   @Override
   public cpd a(@Nullable chl $$0, cvs $$1, hz $$2, dlj $$3) {
      return $$0 != null && $$0.f() ? dfs.super.a($$0, $$1, $$2, $$3) : cpd.h;
   }

   @Override
   public boolean a(@Nullable chl $$0, cux $$1, hz $$2, dlj $$3, egv $$4) {
      return $$0 != null && $$0.f() ? dfs.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
