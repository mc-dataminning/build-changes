import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class eqt extends eqy<eqt.a> {
   protected eqt(dxs $$0) {
      super(dfk.b, $$0, new eqt.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kj.e($$0);
      dxk $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kj.b(jh.a($$0)), kj.b(jh.b($$0)), kj.b(jh.c($$0)));
   }

   protected static final class a extends eqv<eqt.a> {
      public a(Long2ObjectOpenHashMap<dxk> $$0) {
         super($$0);
      }

      public eqt.a a() {
         return new eqt.a(this.a.clone());
      }
   }
}
