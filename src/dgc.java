import com.mojang.serialization.MapCodec;

public class dgc extends cyf {
   public static final MapCodec<dgc> c = b(dgc::new);

   @Override
   public MapCodec<dgc> a() {
      return c;
   }

   public dgc(dli.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : cyu.a.o();
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      return m($$1.a_($$2.d()));
   }

   public static boolean m(dlj $$0) {
      return $$0.a(aua.aS);
   }

   @Override
   protected boolean f(dlj $$0) {
      return true;
   }
}
