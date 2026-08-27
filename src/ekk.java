import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class ekk extends ekp<ekk.a> {
   protected ekk(drr $$0) {
      super(czp.b, $$0, new ekk.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = jg.e($$0);
      drj $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(jg.b(id.a($$0)), jg.b(id.b($$0)), jg.b(id.c($$0)));
   }

   protected static final class a extends ekm<ekk.a> {
      public a(Long2ObjectOpenHashMap<drj> $$0) {
         super($$0);
      }

      public ekk.a a() {
         return new ekk.a(this.a.clone());
      }
   }
}
