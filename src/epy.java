import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class epy extends eqd<epy.a> {
   protected epy(dwx $$0) {
      super(dep.b, $$0, new epy.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kg.e($$0);
      dwp $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kg.b(je.a($$0)), kg.b(je.b($$0)), kg.b(je.c($$0)));
   }

   protected static final class a extends eqa<epy.a> {
      public a(Long2ObjectOpenHashMap<dwp> $$0) {
         super($$0);
      }

      public epy.a a() {
         return new epy.a(this.a.clone());
      }
   }
}
