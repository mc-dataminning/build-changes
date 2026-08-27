import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class efy extends egd<efy.a> {
   protected efy(dnp $$0) {
      super(cvw.b, $$0, new efy.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = jb.e($$0);
      dnh $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(jb.b(hz.a($$0)), jb.b(hz.b($$0)), jb.b(hz.c($$0)));
   }

   protected static final class a extends ega<efy.a> {
      public a(Long2ObjectOpenHashMap<dnh> $$0) {
         super($$0);
      }

      public efy.a a() {
         return new efy.a(this.a.clone());
      }
   }
}
