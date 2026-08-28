import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dis extends diy {
   public static final MapCodec<dis> a = b(dis::new);
   public static final dxu<jn> b = dxn.S;
   public static final dxo c = dxn.z;

   @Override
   public MapCodec<dis> a() {
      return a;
   }

   public dis(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bsk a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if ($$1 instanceof ard $$5 && $$1.c_($$2) instanceof dts $$6) {
         $$3.a($$6);
         $$3.a(awk.ar);
         cnm.a($$5, $$3, true);
      }

      return bsk.a;
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      bsg.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dwx $$0, ard $$1, ji $$2, azh $$3) {
      dtz $$4 = $$1.c_($$2);
      if ($$4 instanceof dts) {
         ((dts)$$4).k();
      }
   }

   @Nullable
   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dts($$0, $$1);
   }

   @Override
   protected boolean c_(dwx $$0) {
      return true;
   }

   @Override
   protected int a(dwx $$0, dgi $$1, ji $$2) {
      return csc.a($$1.c_($$2));
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dwx a(dag $$0) {
      return this.m().b(b, $$0.d().g());
   }
}
