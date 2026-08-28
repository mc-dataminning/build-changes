import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dit extends djm implements dqs {
   public static final MapCodec<dit> a = b(dit::new);
   public static final dxo b = dxn.J;

   @Override
   public MapCodec<dit> a() {
      return a;
   }

   protected dit(dww.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dwx $$0) {
      return $$0.y().c();
   }

   @Override
   protected dpx a_(dwx $$0) {
      return dpx.a;
   }

   @Override
   protected float c(dwx $$0, dfn $$1, ji $$2) {
      return 1.0F;
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(b) ? eta.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == eta.c));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b);
   }

   @Override
   public cwp a(@Nullable cox $$0, dgj $$1, ji $$2, dwx $$3) {
      return $$0 != null && $$0.b() ? dqs.super.a($$0, $$1, $$2, $$3) : cwp.j;
   }

   @Override
   public boolean a(@Nullable cox $$0, dfn $$1, ji $$2, dwx $$3, esy $$4) {
      return $$0 != null && $$0.b() ? dqs.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
