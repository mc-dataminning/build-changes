import com.mojang.serialization.MapCodec;

public class dse extends dko {
   public static final MapCodec<dse> n = b(dse::new);

   @Override
   public MapCodec<dse> a() {
      return n;
   }

   public dse(dwv.d $$0) {
      super(() -> dua.c, $$0);
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new dvu($$0, $$1);
   }

   @Override
   protected awh<akv> c() {
      return awk.i.b(awk.ai);
   }

   @Override
   protected boolean f_(dww $$0) {
      return true;
   }

   @Override
   protected int a(dww $$0, dfm $$1, ji $$2, jn $$3) {
      return ayz.a(duf.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dww $$0, dfm $$1, ji $$2, jn $$3) {
      return $$3 == jn.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
