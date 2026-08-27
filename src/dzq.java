import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class dzq extends dzv<dzq.a> {
   protected dzq(dho $$0) {
      super(cpz.b, $$0, new dzq.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = hz.e($$0);
      dhg $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(hz.b(gw.a($$0)), hz.b(gw.b($$0)), hz.b(gw.c($$0)));
   }

   protected static final class a extends dzs<dzq.a> {
      public a(Long2ObjectOpenHashMap<dhg> $$0) {
         super($$0);
      }

      public dzq.a a() {
         return new dzq.a(this.a.clone());
      }
   }
}
