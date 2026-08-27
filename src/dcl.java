import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcl extends dde implements dkf {
   public static final MapCodec<dcl> a = b(dcl::new);
   public static final dqy b = dqx.C;

   @Override
   public MapCodec<dcl> a() {
      return a;
   }

   protected dcl(dqg.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a_(dqh $$0, czj $$1, in $$2) {
      return true;
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.a;
   }

   @Override
   protected float d(dqh $$0, czj $$1, in $$2) {
      return 1.0F;
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(b) ? emb.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      return this.n().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == emb.c));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }

   @Override
   public csz a(@Nullable clh $$0, dae $$1, in $$2, dqh $$3) {
      return $$0 != null && $$0.f() ? dkf.super.a($$0, $$1, $$2, $$3) : csz.i;
   }

   @Override
   public boolean a(@Nullable clh $$0, czj $$1, in $$2, dqh $$3, elz $$4) {
      return $$0 != null && $$0.f() ? dkf.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
