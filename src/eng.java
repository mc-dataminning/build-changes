import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class eng extends enl<eng.a> {
   protected eng(dun $$0) {
      super(dcj.b, $$0, new eng.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kb.e($$0);
      duf $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kb.b(iz.a($$0)), kb.b(iz.b($$0)), kb.b(iz.c($$0)));
   }

   protected static final class a extends eni<eng.a> {
      public a(Long2ObjectOpenHashMap<duf> $$0) {
         super($$0);
      }

      public eng.a a() {
         return new eng.a(this.a.clone());
      }
   }
}
