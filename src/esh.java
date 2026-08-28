import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class esh extends esm<esh.a> {
   protected esh(dze $$0) {
      super(dgq.b, $$0, new esh.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kk.e($$0);
      dyw $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kk.b(ji.a($$0)), kk.b(ji.b($$0)), kk.b(ji.c($$0)));
   }

   protected static final class a extends esj<esh.a> {
      public a(Long2ObjectOpenHashMap<dyw> $$0) {
         super($$0);
      }

      public esh.a a() {
         return new esh.a(this.a.clone());
      }
   }
}
