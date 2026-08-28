import com.mojang.serialization.MapCodec;

public abstract class dmu extends dne {
   private static final fgm a = dne.b(4.0, 0.0, 10.0);

   protected dmu(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmu> a();

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return a;
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return $$4 == jc.a && !this.a($$0, $$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return a($$1, $$2.e(), jc.b);
   }
}
