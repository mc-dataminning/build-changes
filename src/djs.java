import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djs extends dkl implements drp {
   public static final MapCodec<djs> a = b(djs::new);
   public static final dyl b = dyk.D;

   @Override
   public MapCodec<djs> a() {
      return a;
   }

   protected djs(dxt.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dxu $$0) {
      return $$0.y().c();
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.a;
   }

   @Override
   protected float c(dxu $$0, dgm $$1, jh $$2) {
      return 1.0F;
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(b) ? etx.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == etx.c));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b);
   }

   @Override
   public cxo a(@Nullable cpw $$0, dhi $$1, jh $$2, dxu $$3) {
      return $$0 != null && $$0.b() ? drp.super.a($$0, $$1, $$2, $$3) : cxo.k;
   }

   @Override
   public boolean a(@Nullable cpw $$0, dgm $$1, jh $$2, dxu $$3, etv $$4) {
      return $$0 != null && $$0.b() ? drp.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
