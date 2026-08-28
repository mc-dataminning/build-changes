import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class end extends eni<end.a> {
   protected end(duk $$0) {
      super(dcg.b, $$0, new end.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kb.e($$0);
      duc $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kb.b(iz.a($$0)), kb.b(iz.b($$0)), kb.b(iz.c($$0)));
   }

   protected static final class a extends enf<end.a> {
      public a(Long2ObjectOpenHashMap<duc> $$0) {
         super($$0);
      }

      public end.a a() {
         return new end.a(this.a.clone());
      }
   }
}
