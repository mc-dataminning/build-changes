import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class esi extends esn<esi.a> {
   protected esi(dzf $$0) {
      super(dgr.b, $$0, new esi.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kk.e($$0);
      dyx $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kk.b(ji.a($$0)), kk.b(ji.b($$0)), kk.b(ji.c($$0)));
   }

   protected static final class a extends esk<esi.a> {
      public a(Long2ObjectOpenHashMap<dyx> $$0) {
         super($$0);
      }

      public esi.a a() {
         return new esi.a(this.a.clone());
      }
   }
}
