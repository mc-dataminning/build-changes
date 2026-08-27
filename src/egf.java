import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class egf extends egk<egf.a> {
   protected egf(dnt $$0) {
      super(cwa.b, $$0, new egf.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = jb.e($$0);
      dnl $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(jb.b(hz.a($$0)), jb.b(hz.b($$0)), jb.b(hz.c($$0)));
   }

   protected static final class a extends egh<egf.a> {
      public a(Long2ObjectOpenHashMap<dnl> $$0) {
         super($$0);
      }

      public egf.a a() {
         return new egf.a(this.a.clone());
      }
   }
}
