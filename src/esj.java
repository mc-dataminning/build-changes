import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class esj extends eso<esj.a> {
   protected esj(dzg $$0) {
      super(dgs.b, $$0, new esj.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kk.e($$0);
      dyy $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kk.b(ji.a($$0)), kk.b(ji.b($$0)), kk.b(ji.c($$0)));
   }

   protected static final class a extends esl<esj.a> {
      public a(Long2ObjectOpenHashMap<dyy> $$0) {
         super($$0);
      }

      public esj.a a() {
         return new esj.a(this.a.clone());
      }
   }
}
