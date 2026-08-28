import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class art implements arp {
   private final arr a;
   private final Long2ObjectOpenHashMap<dwx> b = new Long2ObjectOpenHashMap();
   private dcy c = new dcy(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private art(arr $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static art b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static art c(int $$0) {
      arr $$1 = arr.c($$0);
      int $$2 = arp.a($$0);
      int $$3 = $$0 + aql.a;
      int $$4 = arp.a($$3);
      return new art($$1, $$2, $$3, $$4);
   }

   public static art c() {
      return new art(arr.c(), 0, 0, 0);
   }

   @Override
   public void a(dcy $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(dcy $$0, @Nullable dwx $$1) {
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
   public dwx a(int $$0, int $$1) {
      return (dwx)this.b.get(dcy.c($$0 + this.c.e - this.e, $$1 + this.c.f - this.e));
   }
}
