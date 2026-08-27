import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class elj extends elo<elj.a> {
   protected elj(dsq $$0) {
      super(dam.b, $$0, new elj.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = jp.e($$0);
      dsi $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(jp.b(in.a($$0)), jp.b(in.b($$0)), jp.b(in.c($$0)));
   }

   protected static final class a extends ell<elj.a> {
      public a(Long2ObjectOpenHashMap<dsi> $$0) {
         super($$0);
      }

      public elj.a a() {
         return new elj.a(this.a.clone());
      }
   }
}
