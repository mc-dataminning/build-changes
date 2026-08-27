import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class ecg extends ecl<ecg.a> {
   protected ecg(djx $$0) {
      super(cso.b, $$0, new ecg.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = iy.e($$0);
      djp $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(iy.b(hx.a($$0)), iy.b(hx.b($$0)), iy.b(hx.c($$0)));
   }

   protected static final class a extends eci<ecg.a> {
      public a(Long2ObjectOpenHashMap<djp> $$0) {
         super($$0);
      }

      public ecg.a a() {
         return new ecg.a(this.a.clone());
      }
   }
}
