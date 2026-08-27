import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class ebp extends ebu<ebp.a> {
   protected ebp(djg $$0) {
      super(csb.b, $$0, new ebp.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = iu.e($$0);
      diy $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(iu.b(ht.a($$0)), iu.b(ht.b($$0)), iu.b(ht.c($$0)));
   }

   protected static final class a extends ebr<ebp.a> {
      public a(Long2ObjectOpenHashMap<diy> $$0) {
         super($$0);
      }

      public ebp.a a() {
         return new ebp.a(this.a.clone());
      }
   }
}
