import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class esy extends etd<esy.a> {
   protected esy(dzv $$0) {
      super(dhj.b, $$0, new esy.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kj.e($$0);
      dzn $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kj.b(jh.a($$0)), kj.b(jh.b($$0)), kj.b(jh.c($$0)));
   }

   protected static final class a extends eta<esy.a> {
      public a(Long2ObjectOpenHashMap<dzn> $$0) {
         super($$0);
      }

      public esy.a a() {
         return new esy.a(this.a.clone());
      }
   }
}
