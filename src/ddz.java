import com.mojang.serialization.MapCodec;

public class ddz extends cwc {
   public static final MapCodec<ddz> c = b(ddz::new);

   @Override
   public MapCodec<ddz> a() {
      return c;
   }

   public ddz(djf.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : cwr.a.o();
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      return h($$1.a_($$2.d()));
   }

   public static boolean h(djg $$0) {
      return $$0.a(asg.aS);
   }

   @Override
   protected boolean f(djg $$0) {
      return true;
   }
}
