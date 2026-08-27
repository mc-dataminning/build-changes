import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class edi extends edn<edi.a> {
   protected edi(dkz $$0) {
      super(cth.b, $$0, new edi.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = ix.e($$0);
      dkr $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(ix.b(hv.a($$0)), ix.b(hv.b($$0)), ix.b(hv.c($$0)));
   }

   protected static final class a extends edk<edi.a> {
      public a(Long2ObjectOpenHashMap<dkr> $$0) {
         super($$0);
      }

      public edi.a a() {
         return new edi.a(this.a.clone());
      }
   }
}
