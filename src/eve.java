import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class eve extends evj<eve.a> {
   protected eve(eby $$0) {
      super(diy.b, $$0, new eve.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = jx.e($$0);
      ebq $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(jx.b(iu.a($$0)), jx.b(iu.b($$0)), jx.b(iu.c($$0)));
   }

   protected static final class a extends evg<eve.a> {
      public a(Long2ObjectOpenHashMap<ebq> $$0) {
         super($$0);
      }

      public eve.a a() {
         return new eve.a(this.a.clone());
      }
   }
}
