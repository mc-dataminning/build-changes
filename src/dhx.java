import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhx extends diq implements dpr {
   public static final MapCodec<dhx> a = b(dhx::new);
   public static final dwm b = dwl.C;

   @Override
   public MapCodec<dhx> a() {
      return a;
   }

   protected dhx(dvu.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dvv $$0) {
      return $$0.y().c();
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.a;
   }

   @Override
   protected float c(dvv $$0, der $$1, jh $$2) {
      return 1.0F;
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(b) ? erw.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == erw.c));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
   }

   @Override
   public cwm a(@Nullable cou $$0, dfn $$1, jh $$2, dvv $$3) {
      return $$0 != null && $$0.b() ? dpr.super.a($$0, $$1, $$2, $$3) : cwm.k;
   }

   @Override
   public boolean a(@Nullable cou $$0, der $$1, jh $$2, dvv $$3, eru $$4) {
      return $$0 != null && $$0.b() ? dpr.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
