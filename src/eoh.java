import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class eoh extends eom<eoh.a> {
   protected eoh(dvj $$0) {
      super(ddd.b, $$0, new eoh.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kf.e($$0);
      dvb $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kf.b(jd.a($$0)), kf.b(jd.b($$0)), kf.b(jd.c($$0)));
   }

   protected static final class a extends eoj<eoh.a> {
      public a(Long2ObjectOpenHashMap<dvb> $$0) {
         super($$0);
      }

      public eoh.a a() {
         return new eoh.a(this.a.clone());
      }
   }
}
