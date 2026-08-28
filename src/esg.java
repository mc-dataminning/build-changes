import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class esg extends esl<esg.a> {
   protected esg(dzd $$0) {
      super(dgp.b, $$0, new esg.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kk.e($$0);
      dyv $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kk.b(ji.a($$0)), kk.b(ji.b($$0)), kk.b(ji.c($$0)));
   }

   protected static final class a extends esi<esg.a> {
      public a(Long2ObjectOpenHashMap<dyv> $$0) {
         super($$0);
      }

      public esg.a a() {
         return new esg.a(this.a.clone());
      }
   }
}
