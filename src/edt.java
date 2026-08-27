import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class edt extends edy<edt.a> {
   protected edt(dlk $$0) {
      super(ctr.b, $$0, new edt.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = iz.e($$0);
      dlc $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(iz.b(hx.a($$0)), iz.b(hx.b($$0)), iz.b(hx.c($$0)));
   }

   protected static final class a extends edv<edt.a> {
      public a(Long2ObjectOpenHashMap<dlc> $$0) {
         super($$0);
      }

      public edt.a a() {
         return new edt.a(this.a.clone());
      }
   }
}
