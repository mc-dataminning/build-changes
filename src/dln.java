import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dln extends drb implements drq {
   public static final MapCodec<dln> a = b(dln::new);
   public static final dym b = dyl.D;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final fcs e = dkm.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final fcs f = dkm.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final fcs g = dkm.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dln> a() {
      return a;
   }

   public dln(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(i, jm.a.b));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      switch ((jm.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      etx $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ety.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(b) ? ety.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }
}
