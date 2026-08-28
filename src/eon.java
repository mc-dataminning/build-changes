import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class eon extends eos<eon.a> {
   protected eon(dvl $$0) {
      super(ddf.b, $$0, new eon.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kf.e($$0);
      dvd $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kf.b(jd.a($$0)), kf.b(jd.b($$0)), kf.b(jd.c($$0)));
   }

   protected static final class a extends eop<eon.a> {
      public a(Long2ObjectOpenHashMap<dvd> $$0) {
         super($$0);
      }

      public eon.a a() {
         return new eon.a(this.a.clone());
      }
   }
}
