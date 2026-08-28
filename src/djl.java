import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djl extends dke implements dri {
   public static final MapCodec<djl> a = b(djl::new);
   public static final dye b = dyd.D;

   @Override
   public MapCodec<djl> a() {
      return a;
   }

   protected djl(dxm.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dxn $$0) {
      return $$0.y().c();
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.a;
   }

   @Override
   protected float c(dxn $$0, dgf $$1, jh $$2) {
      return 1.0F;
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(b) ? etq.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == etq.c));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b);
   }

   @Override
   public cxk a(@Nullable cps $$0, dhb $$1, jh $$2, dxn $$3) {
      return $$0 != null && $$0.b() ? dri.super.a($$0, $$1, $$2, $$3) : cxk.k;
   }

   @Override
   public boolean a(@Nullable cps $$0, dgf $$1, jh $$2, dxn $$3, eto $$4) {
      return $$0 != null && $$0.b() ? dri.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
