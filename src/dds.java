import com.mojang.serialization.MapCodec;

public class dds extends cwi {
   public static final MapCodec<dds> n = b(dds::new);

   @Override
   public MapCodec<dds> a() {
      return n;
   }

   public dds(dhm.d $$0) {
      super($$0, () -> dfk.c);
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dha($$0, $$1);
   }

   @Override
   protected arc<agm> c() {
      return arf.i.b(arf.ai);
   }

   @Override
   public boolean f_(dhn $$0) {
      return true;
   }

   @Override
   public int a(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return atq.a(dfp.a($$1, $$2), 0, 15);
   }

   @Override
   public int b(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return $$3 == ib.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
