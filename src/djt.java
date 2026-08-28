import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djt extends dkm implements drq {
   public static final MapCodec<djt> a = b(djt::new);
   public static final dym b = dyl.D;

   @Override
   public MapCodec<djt> a() {
      return a;
   }

   protected djt(dxu.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dxv $$0) {
      return $$0.y().c();
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.a;
   }

   @Override
   protected float c(dxv $$0, dgn $$1, jh $$2) {
      return 1.0F;
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(b) ? ety.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == ety.c));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
   }

   @Override
   public cxp a(@Nullable cpx $$0, dhj $$1, jh $$2, dxv $$3) {
      return $$0 != null && $$0.b() ? drq.super.a($$0, $$1, $$2, $$3) : cxp.j;
   }

   @Override
   public boolean a(@Nullable cpx $$0, dgn $$1, jh $$2, dxv $$3, etw $$4) {
      return $$0 != null && $$0.b() ? drq.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
