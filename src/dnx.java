import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dnx extends dpo implements dkp, drq {
   public static final MapCodec<dnx> a = b(dnx::new);
   private static final dym c = dyl.D;
   private final dpp d = new dpp(this);

   @Override
   public MapCodec<dnx> a() {
      return a;
   }

   public dnx(dxu.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dxv> b(int $$0) {
      return $$1 -> dpo.q($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxv $$0, dbg $$1) {
      return !$$1.n().a(cxt.gj) || super.a($$0, $$1);
   }

   @Override
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
      return jm.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(c) ? ety.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dxv $$0) {
      return $$0.y().c();
   }

   @Override
   public dpp c() {
      return this.d;
   }
}
