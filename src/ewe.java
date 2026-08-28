import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class ewe extends ewj<ewe.a> {
   protected ewe(ecy $$0) {
      super(djq.b, $$0, new ewe.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = jy.e($$0);
      ecq $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(jy.b(iv.a($$0)), jy.b(iv.b($$0)), jy.b(iv.c($$0)));
   }

   protected static final class a extends ewg<ewe.a> {
      public a(Long2ObjectOpenHashMap<ecq> $$0) {
         super($$0);
      }

      public ewe.a a() {
         return new ewe.a(this.a.clone());
      }
   }
}
