import com.mojang.serialization.MapCodec;

public class dlj extends ddl {
   public static final MapCodec<dlj> c = b(dlj::new);

   @Override
   public MapCodec<dlj> a() {
      return c;
   }

   public dlj(dra.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return this.a($$0, $$3, $$4) ? this.n() : dea.a.n();
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      return m($$1.a_($$2.d()));
   }

   public static boolean m(drb $$0) {
      return $$0.a(avw.aT);
   }

   @Override
   protected boolean f(drb $$0) {
      return true;
   }
}
