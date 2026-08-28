import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dof extends dkm implements drq {
   public static final MapCodec<dof> a = b(dof::new);
   private static final dym c = dyl.D;
   protected static final fcs b = dkm.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dof> a() {
      return a;
   }

   protected dof(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(c);
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(c) ? ety.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      dxv $$1 = super.a($$0);
      if ($$1 != null) {
         etx $$2 = $$0.q().b_($$0.a());
         return $$1.b(c, Boolean.valueOf($$2.a() == ety.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      jh $$3 = $$2.d();
      dxv $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, jm.a);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return b;
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$4 == jm.b && !this.a($$0, $$1, $$3)) {
         return dko.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, ety.c, ety.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
