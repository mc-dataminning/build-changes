import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbo extends dch implements djh {
   public static final MapCodec<dbo> a = b(dbo::new);
   public static final dpz b = dpy.C;

   @Override
   public MapCodec<dbo> a() {
      return a;
   }

   protected dbo(dph.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a_(dpi $$0, cym $$1, id $$2) {
      return true;
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.a;
   }

   @Override
   protected float d(dpi $$0, cym $$1, id $$2) {
      return 1.0F;
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(b) ? elc.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      return this.n().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == elc.c));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }

   @Override
   public crs a(@Nullable cka $$0, czh $$1, id $$2, dpi $$3) {
      return $$0 != null && $$0.f() ? djh.super.a($$0, $$1, $$2, $$3) : crs.i;
   }

   @Override
   public boolean a(@Nullable cka $$0, cym $$1, id $$2, dpi $$3, ela $$4) {
      return $$0 != null && $$0.f() ? djh.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
