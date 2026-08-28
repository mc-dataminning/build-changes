import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class asb implements arx {
   private final arz a;
   private final Long2ObjectOpenHashMap<ebk> b = new Long2ObjectOpenHashMap();
   private dgw c = new dgw(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private asb(arz $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static asb b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static asb c(int $$0) {
      arz $$1 = arz.c($$0);
      int $$2 = arx.a($$0);
      int $$3 = $$0 + aqq.a;
      int $$4 = arx.a($$3);
      return new asb($$1, $$2, $$3, $$4);
   }

   public static asb c() {
      return new asb(arz.c(), 0, 0, 0);
   }

   @Override
   public void a(dgw $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(dgw $$0, @Nullable ebk $$1) {
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
   public ebk a(int $$0, int $$1) {
      return (ebk)this.b.get(dgw.c($$0 + this.c.h - this.e, $$1 + this.c.i - this.e));
   }
}
