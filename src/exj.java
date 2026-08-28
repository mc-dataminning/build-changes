import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class exj extends exo<exj.a> {
   protected exj(eea $$0) {
      super(dks.b, $$0, new exj.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = jz.e($$0);
      eds $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(jz.b(iw.a($$0)), jz.b(iw.b($$0)), jz.b(iw.c($$0)));
   }

   protected static final class a extends exl<exj.a> {
      public a(Long2ObjectOpenHashMap<eds> $$0) {
         super($$0);
      }

      public exj.a a() {
         return new exj.a(this.a.clone());
      }
   }
}
