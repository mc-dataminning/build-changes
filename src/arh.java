import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class arh implements ard {
   private final arf a;
   private final Long2ObjectOpenHashMap<dvz> b = new Long2ObjectOpenHashMap();
   private dcd c = new dcd(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private arh(arf $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static arh b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static arh c(int $$0) {
      arf $$1 = arf.c($$0);
      int $$2 = ard.a($$0);
      int $$3 = $$0 + aqa.a;
      int $$4 = ard.a($$3);
      return new arh($$1, $$2, $$3, $$4);
   }

   public static arh c() {
      return new arh(arf.c(), 0, 0, 0);
   }

   @Override
   public void a(dcd $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(dcd $$0, @Nullable dvz $$1) {
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
   public dvz a(int $$0, int $$1) {
      return (dvz)this.b.get(dcd.c($$0 + this.c.e - this.e, $$1 + this.c.f - this.e));
   }
}
