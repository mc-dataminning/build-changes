import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class aps implements apo {
   private final apq a;
   private final Long2ObjectOpenHashMap<dpc> b = new Long2ObjectOpenHashMap();
   private cwi c = new cwi(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private aps(apq $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static aps b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static aps c(int $$0) {
      apq $$1 = apq.c($$0);
      int $$2 = apo.a($$0);
      int $$3 = $$0 + dpc.b();
      int $$4 = apo.a($$3);
      return new aps($$1, $$2, $$3, $$4);
   }

   public static aps c() {
      return new aps(apq.c(), 0, 0, 0);
   }

   @Override
   public void a(cwi $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(cwi $$0, @Nullable dpc $$1) {
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
   public dpc a(int $$0, int $$1) {
      return (dpc)this.b.get(cwi.c($$0 + this.c.e - this.e, $$1 + this.c.f - this.e));
   }
}
