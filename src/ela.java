import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class ela extends elf<ela.a> {
   protected ela(dsh $$0) {
      super(dad.b, $$0, new ela.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = jo.e($$0);
      drz $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(jo.b(im.a($$0)), jo.b(im.b($$0)), jo.b(im.c($$0)));
   }

   protected static final class a extends elc<ela.a> {
      public a(Long2ObjectOpenHashMap<drz> $$0) {
         super($$0);
      }

      public ela.a a() {
         return new ela.a(this.a.clone());
      }
   }
}
