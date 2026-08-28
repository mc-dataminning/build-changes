import com.mojang.serialization.MapCodec;

public class dsg extends dkq {
   public static final MapCodec<dsg> n = b(dsg::new);

   @Override
   public MapCodec<dsg> a() {
      return n;
   }

   public dsg(dwx.d $$0) {
      super(() -> duc.c, $$0);
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dvw($$0, $$1);
   }

   @Override
   protected awh<akv> c() {
      return awk.i.b(awk.ai);
   }

   @Override
   protected boolean f_(dwy $$0) {
      return true;
   }

   @Override
   protected int a(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      return ayz.a(duh.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      return $$3 == jn.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
