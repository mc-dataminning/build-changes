import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dit extends diz {
   public static final MapCodec<dit> a = b(dit::new);
   public static final dxv<jn> b = dxo.S;
   public static final dxp c = dxo.z;

   @Override
   public MapCodec<dit> a() {
      return a;
   }

   public dit(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if ($$1 instanceof ard $$5 && $$1.c_($$2) instanceof dtt $$6) {
         $$3.a($$6);
         $$3.a(awk.ar);
         cnn.a($$5, $$3, true);
      }

      return bsl.a;
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      bsh.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      dua $$4 = $$1.c_($$2);
      if ($$4 instanceof dtt) {
         ((dtt)$$4).k();
      }
   }

   @Nullable
   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dtt($$0, $$1);
   }

   @Override
   protected boolean c_(dwy $$0) {
      return true;
   }

   @Override
   protected int a(dwy $$0, dgj $$1, ji $$2) {
      return csd.a($$1.c_($$2));
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dwy a(dah $$0) {
      return this.m().b(b, $$0.d().g());
   }
}
