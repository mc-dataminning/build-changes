import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class dzk extends dzp<dzk.a> {
   protected dzk(dhi $$0) {
      super(cpt.b, $$0, new dzk.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = hy.e($$0);
      dha $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(hy.b(gv.a($$0)), hy.b(gv.b($$0)), hy.b(gv.c($$0)));
   }

   protected static final class a extends dzm<dzk.a> {
      public a(Long2ObjectOpenHashMap<dha> $$0) {
         super($$0);
      }

      public dzk.a a() {
         return new dzk.a(this.a.clone());
      }
   }
}
