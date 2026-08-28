import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class enk extends enp<enk.a> {
   protected enk(duq $$0) {
      super(dcm.b, $$0, new enk.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kc.e($$0);
      dui $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kc.b(ja.a($$0)), kc.b(ja.b($$0)), kc.b(ja.c($$0)));
   }

   protected static final class a extends enm<enk.a> {
      public a(Long2ObjectOpenHashMap<dui> $$0) {
         super($$0);
      }

      public enk.a a() {
         return new enk.a(this.a.clone());
      }
   }
}
