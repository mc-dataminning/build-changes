import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class ewz extends exe<ewz.a> {
   protected ewz(edq $$0) {
      super(dki.b, $$0, new ewz.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = jz.e($$0);
      edi $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(jz.b(iw.a($$0)), jz.b(iw.b($$0)), jz.b(iw.c($$0)));
   }

   protected static final class a extends exb<ewz.a> {
      public a(Long2ObjectOpenHashMap<edi> $$0) {
         super($$0);
      }

      public ewz.a a() {
         return new ewz.a(this.a.clone());
      }
   }
}
