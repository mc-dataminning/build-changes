import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class arg implements arc {
   private final are a;
   private final Long2ObjectOpenHashMap<dvx> b = new Long2ObjectOpenHashMap();
   private dcb c = new dcb(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private arg(are $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static arg b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static arg c(int $$0) {
      are $$1 = are.c($$0);
      int $$2 = arc.a($$0);
      int $$3 = $$0 + apz.a;
      int $$4 = arc.a($$3);
      return new arg($$1, $$2, $$3, $$4);
   }

   public static arg c() {
      return new arg(are.c(), 0, 0, 0);
   }

   @Override
   public void a(dcb $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(dcb $$0, @Nullable dvx $$1) {
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
   public dvx a(int $$0, int $$1) {
      return (dvx)this.b.get(dcb.c($$0 + this.c.e - this.e, $$1 + this.c.f - this.e));
   }
}
