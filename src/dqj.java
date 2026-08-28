import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqj extends diy {
   public static final MapCodec<dqj> a = b(dqj::new);
   public static final dxo b = dxn.d;
   private final brp c = brm.a(5);

   @Override
   public MapCodec<dqj> a() {
      return a;
   }

   public dqj(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dwx $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dvi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return $$0.C ? null : a($$2, dub.L, dvi::a);
   }

   @Override
   protected void a(dwx $$0, ard $$1, ji $$2, cwp $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
