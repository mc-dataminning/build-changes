import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class enf extends enk<enf.a> {
   protected enf(dum $$0) {
      super(dci.b, $$0, new enf.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kb.e($$0);
      due $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kb.b(iz.a($$0)), kb.b(iz.b($$0)), kb.b(iz.c($$0)));
   }

   protected static final class a extends enh<enf.a> {
      public a(Long2ObjectOpenHashMap<due> $$0) {
         super($$0);
      }

      public enf.a a() {
         return new enf.a(this.a.clone());
      }
   }
}
