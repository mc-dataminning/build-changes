import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class edz extends eee<edz.a> {
   protected edz(dlq $$0) {
      super(ctx.b, $$0, new edz.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = iz.e($$0);
      dli $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(iz.b(hx.a($$0)), iz.b(hx.b($$0)), iz.b(hx.c($$0)));
   }

   protected static final class a extends eeb<edz.a> {
      public a(Long2ObjectOpenHashMap<dli> $$0) {
         super($$0);
      }

      public edz.a a() {
         return new edz.a(this.a.clone());
      }
   }
}
