import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class eqc extends eqh<eqc.a> {
   protected eqc(dxb $$0) {
      super(des.b, $$0, new eqc.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kh.e($$0);
      dwt $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kh.b(jf.a($$0)), kh.b(jf.b($$0)), kh.b(jf.c($$0)));
   }

   protected static final class a extends eqe<eqc.a> {
      public a(Long2ObjectOpenHashMap<dwt> $$0) {
         super($$0);
      }

      public eqc.a a() {
         return new eqc.a(this.a.clone());
      }
   }
}
