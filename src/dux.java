import com.mojang.serialization.MapCodec;

public class dux extends dmp {
   public static final MapCodec<dux> b = b(dux::new);

   @Override
   public MapCodec<dux> a() {
      return b;
   }

   public dux(ebd.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return this.a($$0, $$1, $$3) ? this.m() : dne.a.m();
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(ebe $$0) {
      return $$0.a(axe.aV);
   }

   @Override
   protected boolean g(ebe $$0) {
      return true;
   }
}
