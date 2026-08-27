import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class dwn extends dws<dwn.a> {
   protected dwn(del $$0) {
      super(cmv.b, $$0, new dwn.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = hx.e($$0);
      ded $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(hx.b(gu.a($$0)), hx.b(gu.b($$0)), hx.b(gu.c($$0)));
   }

   protected static final class a extends dwp<dwn.a> {
      public a(Long2ObjectOpenHashMap<ded> $$0) {
         super($$0);
      }

      public dwn.a a() {
         return new dwn.a(this.a.clone());
      }
   }
}
