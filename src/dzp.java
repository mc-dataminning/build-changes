import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class dzp extends dzu<dzp.a> {
   protected dzp(dhn $$0) {
      super(cqk.b, $$0, new dzp.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = hw.e($$0);
      dhf $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(hw.b(gw.a($$0)), hw.b(gw.b($$0)), hw.b(gw.c($$0)));
   }

   protected static final class a extends dzr<dzp.a> {
      public a(Long2ObjectOpenHashMap<dhf> $$0) {
         super($$0);
      }

      public dzp.a a() {
         return new dzp.a(this.a.clone());
      }
   }
}
