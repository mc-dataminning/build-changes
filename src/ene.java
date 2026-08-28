import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class ene extends enj<ene.a> {
   protected ene(dul $$0) {
      super(dch.b, $$0, new ene.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kb.e($$0);
      dud $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kb.b(iz.a($$0)), kb.b(iz.b($$0)), kb.b(iz.c($$0)));
   }

   protected static final class a extends eng<ene.a> {
      public a(Long2ObjectOpenHashMap<dud> $$0) {
         super($$0);
      }

      public ene.a a() {
         return new ene.a(this.a.clone());
      }
   }
}
