import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public abstract class eth<M extends eth<M>> {
   private static final int b = 2;
   private final long[] c = new long[2];
   private final dzu[] d = new dzu[2];
   private boolean e;
   protected final Long2ObjectOpenHashMap<dzu> a;

   protected eth(Long2ObjectOpenHashMap<dzu> $$0) {
      this.a = $$0;
      this.c();
      this.e = true;
   }

   public abstract M b();

   public dzu a(long $$0) {
      dzu $$1 = ((dzu)this.a.get($$0)).b();
      this.a.put($$0, $$1);
      this.c();
      return $$1;
   }

   public boolean b(long $$0) {
      return this.a.containsKey($$0);
   }

   @Nullable
   public dzu c(long $$0) {
      if (this.e) {
         for (int $$1 = 0; $$1 < 2; $$1++) {
            if ($$0 == this.c[$$1]) {
               return this.d[$$1];
            }
         }
      }

      dzu $$2 = (dzu)this.a.get($$0);
      if ($$2 == null) {
         return null;
      } else {
         if (this.e) {
            for (int $$3 = 1; $$3 > 0; $$3--) {
               this.c[$$3] = this.c[$$3 - 1];
               this.d[$$3] = this.d[$$3 - 1];
            }

            this.c[0] = $$0;
            this.d[0] = $$2;
         }

         return $$2;
      }
   }

   @Nullable
   public dzu d(long $$0) {
      return (dzu)this.a.remove($$0);
   }

   public void a(long $$0, dzu $$1) {
      this.a.put($$0, $$1);
   }

   public void c() {
      for (int $$0 = 0; $$0 < 2; $$0++) {
         this.c[$$0] = Long.MAX_VALUE;
         this.d[$$0] = null;
      }
   }

   public void d() {
      this.e = false;
   }
}
