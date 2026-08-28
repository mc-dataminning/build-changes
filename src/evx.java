import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class evx extends ewc<evx.a> {
   protected evx(ecr $$0) {
      super(djj.b, $$0, new evx.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = jx.e($$0);
      ecj $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(jx.b(iu.a($$0)), jx.b(iu.b($$0)), jx.b(iu.c($$0)));
   }

   protected static final class a extends evz<evx.a> {
      public a(Long2ObjectOpenHashMap<ecj> $$0) {
         super($$0);
      }

      public evx.a a() {
         return new evx.a(this.a.clone());
      }
   }
}
