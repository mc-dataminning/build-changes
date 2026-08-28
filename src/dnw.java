import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dnw extends dpn implements dko, drp {
   public static final MapCodec<dnw> a = b(dnw::new);
   private static final dyl c = dyk.D;
   private final dpo d = new dpo(this);

   @Override
   public MapCodec<dnw> a() {
      return a;
   }

   public dnw(dxt.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dxu> b(int $$0) {
      return $$1 -> dpn.q($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxu $$0, dbf $$1) {
      return !$$1.n().a(cxs.gj) || super.a($$0, $$1);
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      return jm.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(c) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dxu $$0) {
      return $$0.y().c();
   }

   @Override
   public dpo c() {
      return this.d;
   }
}
