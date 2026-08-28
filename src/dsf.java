import com.mojang.serialization.MapCodec;

public class dsf extends dkp {
   public static final MapCodec<dsf> n = b(dsf::new);

   @Override
   public MapCodec<dsf> a() {
      return n;
   }

   public dsf(dww.d $$0) {
      super(() -> dub.c, $$0);
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dvv($$0, $$1);
   }

   @Override
   protected awh<aku> c() {
      return awk.i.b(awk.ai);
   }

   @Override
   protected boolean f_(dwx $$0) {
      return true;
   }

   @Override
   protected int a(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return ayz.a(dug.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return $$3 == jn.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
