import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class def extends dey implements dlz {
   public static final MapCodec<def> a = b(def::new);
   public static final dss b = dsr.C;

   @Override
   public MapCodec<def> a() {
      return a;
   }

   protected def(dsa.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a_(dsb $$0, dbd $$1, iz $$2) {
      return $$0.u().c();
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.a;
   }

   @Override
   protected float d(dsb $$0, dbd $$1, iz $$2) {
      return 1.0F;
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(b) ? env.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == env.c));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
   }

   @Override
   public cuo a(@Nullable cmw $$0, dby $$1, iz $$2, dsb $$3) {
      return $$0 != null && $$0.f() ? dlz.super.a($$0, $$1, $$2, $$3) : cuo.l;
   }

   @Override
   public boolean a(@Nullable cmw $$0, dbd $$1, iz $$2, dsb $$3, ent $$4) {
      return $$0 != null && $$0.f() ? dlz.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
