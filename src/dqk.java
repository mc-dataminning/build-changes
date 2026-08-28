import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqk extends diz {
   public static final MapCodec<dqk> a = b(dqk::new);
   public static final dxp b = dxo.d;
   private final brq c = brn.a(5);

   @Override
   public MapCodec<dqk> a() {
      return a;
   }

   public dqk(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dvj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return $$0.C ? null : a($$2, duc.L, dvj::a);
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, cwq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
