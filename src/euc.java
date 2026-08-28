import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class euc extends euh<euc.a> {
   protected euc(eaw $$0) {
      super(dhy.b, $$0, new euc.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kl.e($$0);
      eao $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kl.b(jj.a($$0)), kl.b(jj.b($$0)), kl.b(jj.c($$0)));
   }

   protected static final class a extends eue<euc.a> {
      public a(Long2ObjectOpenHashMap<eao> $$0) {
         super($$0);
      }

      public euc.a a() {
         return new euc.a(this.a.clone());
      }
   }
}
