import com.mojang.serialization.MapCodec;

public abstract class dms extends dnc {
   private static final fgk a = dnc.b(4.0, 0.0, 10.0);

   protected dms(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dms> a();

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return a;
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return $$4 == jb.a && !this.a($$0, $$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return a($$1, $$2.e(), jb.b);
   }
}
