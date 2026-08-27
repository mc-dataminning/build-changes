import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class api implements ape {
   private final apg a;
   private final Long2ObjectOpenHashMap<dng> b = new Long2ObjectOpenHashMap();
   private cuu c = new cuu(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private api(apg $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static api b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static api c(int $$0) {
      apg $$1 = apg.c($$0);
      int $$2 = ape.a($$0);
      int $$3 = $$0 + dng.b();
      int $$4 = ape.a($$3);
      return new api($$1, $$2, $$3, $$4);
   }

   public static api c() {
      return new api(apg.c(), 0, 0, 0);
   }

   @Override
   public void a(cuu $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(cuu $$0, @Nullable dng $$1) {
      if (this.g) {
         this.a.a($$0, $$1);
         if ($$1 == null) {
            this.b.remove($$0.a());
         } else {
            this.b.put($$0.a(), $$1);
         }
      }
   }

   @Override
   public void a() {
      this.g = true;
      this.b.clear();
      this.a.a();
   }

   @Override
   public void b() {
      this.g = false;
      this.a.b();
   }

   public int d() {
      return this.d;
   }

   public int e() {
      return this.f;
   }

   public int f() {
      return this.a.d();
   }

   @Nullable
   public dng a(int $$0, int $$1) {
      return (dng)this.b.get(cuu.c($$0 + this.c.e - this.e, $$1 + this.c.f - this.e));
   }
}
