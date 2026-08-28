import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class aqz implements aqv {
   private final aqx a;
   private final Long2ObjectOpenHashMap<dvi> b = new Long2ObjectOpenHashMap();
   private dbn c = new dbn(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private aqz(aqx $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static aqz b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static aqz c(int $$0) {
      aqx $$1 = aqx.c($$0);
      int $$2 = aqv.a($$0);
      int $$3 = $$0 + aps.a;
      int $$4 = aqv.a($$3);
      return new aqz($$1, $$2, $$3, $$4);
   }

   public static aqz c() {
      return new aqz(aqx.c(), 0, 0, 0);
   }

   @Override
   public void a(dbn $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(dbn $$0, @Nullable dvi $$1) {
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
   public dvi a(int $$0, int $$1) {
      return (dvi)this.b.get(dbn.c($$0 + this.c.e - this.e, $$1 + this.c.f - this.e));
   }
}
