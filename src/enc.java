import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class enc extends enh<enc.a> {
   protected enc(duj $$0) {
      super(dcf.b, $$0, new enc.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kb.e($$0);
      dub $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kb.b(iz.a($$0)), kb.b(iz.b($$0)), kb.b(iz.c($$0)));
   }

   protected static final class a extends ene<enc.a> {
      public a(Long2ObjectOpenHashMap<dub> $$0) {
         super($$0);
      }

      public enc.a a() {
         return new enc.a(this.a.clone());
      }
   }
}
