import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class dzl extends dzq<dzl.a> {
   protected dzl(dhj $$0) {
      super(cpu.b, $$0, new dzl.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = hx.e($$0);
      dhb $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(hx.b(gu.a($$0)), hx.b(gu.b($$0)), hx.b(gu.c($$0)));
   }

   protected static final class a extends dzn<dzl.a> {
      public a(Long2ObjectOpenHashMap<dhb> $$0) {
         super($$0);
      }

      public dzl.a a() {
         return new dzl.a(this.a.clone());
      }
   }
}
