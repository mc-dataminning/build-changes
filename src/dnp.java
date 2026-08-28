import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dnp extends dpg implements dkh, dri {
   public static final MapCodec<dnp> a = b(dnp::new);
   private static final dye c = dyd.D;
   private final dph d = new dph(this);

   @Override
   public MapCodec<dnp> a() {
      return a;
   }

   public dnp(dxm.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dxn> b(int $$0) {
      return $$1 -> dpg.q($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxn $$0, dbb $$1) {
      return !$$1.n().a(cxo.gj) || super.a($$0, $$1);
   }

   @Override
   public boolean b(dhd $$0, jh $$1, dxn $$2) {
      return jm.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dha $$0, bam $$1, jh $$2, dxn $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxn $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(c) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dxn $$0) {
      return $$0.y().c();
   }

   @Override
   public dph c() {
      return this.d;
   }
}
