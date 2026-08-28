import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class ens extends enx<ens.a> {
   protected ens(duu $$0) {
      super(dcp.b, $$0, new ens.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kc.e($$0);
      dum $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kc.b(ja.a($$0)), kc.b(ja.b($$0)), kc.b(ja.c($$0)));
   }

   protected static final class a extends enu<ens.a> {
      public a(Long2ObjectOpenHashMap<dum> $$0) {
         super($$0);
      }

      public ens.a a() {
         return new ens.a(this.a.clone());
      }
   }
}
