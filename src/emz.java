import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class emz extends ene<emz.a> {
   protected emz(dug $$0) {
      super(dcc.b, $$0, new emz.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kb.e($$0);
      dty $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kb.b(iz.a($$0)), kb.b(iz.b($$0)), kb.b(iz.c($$0)));
   }

   protected static final class a extends enb<emz.a> {
      public a(Long2ObjectOpenHashMap<dty> $$0) {
         super($$0);
      }

      public emz.a a() {
         return new emz.a(this.a.clone());
      }
   }
}
