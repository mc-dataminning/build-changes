import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class ere extends erj<ere.a> {
   protected ere(dyd $$0) {
      super(dfv.b, $$0, new ere.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kj.e($$0);
      dxv $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kj.b(jh.a($$0)), kj.b(jh.b($$0)), kj.b(jh.c($$0)));
   }

   protected static final class a extends erg<ere.a> {
      public a(Long2ObjectOpenHashMap<dxv> $$0) {
         super($$0);
      }

      public ere.a a() {
         return new ere.a(this.a.clone());
      }
   }
}
