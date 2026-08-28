import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class epk extends epp<epk.a> {
   protected epk(dwj $$0) {
      super(deb.b, $$0, new epk.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kg.e($$0);
      dwb $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kg.b(je.a($$0)), kg.b(je.b($$0)), kg.b(je.c($$0)));
   }

   protected static final class a extends epm<epk.a> {
      public a(Long2ObjectOpenHashMap<dwb> $$0) {
         super($$0);
      }

      public epk.a a() {
         return new epk.a(this.a.clone());
      }
   }
}
