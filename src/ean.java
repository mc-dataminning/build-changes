import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class ean extends eas<ean.a> {
   protected ean(dil $$0) {
      super(cri.b, $$0, new ean.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = iu.e($$0);
      did $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(iu.b(ht.a($$0)), iu.b(ht.b($$0)), iu.b(ht.c($$0)));
   }

   protected static final class a extends eap<ean.a> {
      public a(Long2ObjectOpenHashMap<did> $$0) {
         super($$0);
      }

      public ean.a a() {
         return new ean.a(this.a.clone());
      }
   }
}
