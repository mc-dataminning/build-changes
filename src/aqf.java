import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class aqf implements aqb {
   private final aqd a;
   private final Long2ObjectOpenHashMap<dru> b = new Long2ObjectOpenHashMap();
   private cye c = new cye(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private aqf(aqd $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static aqf b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static aqf c(int $$0) {
      aqd $$1 = aqd.c($$0);
      int $$2 = aqb.a($$0);
      int $$3 = $$0 + dru.b();
      int $$4 = aqb.a($$3);
      return new aqf($$1, $$2, $$3, $$4);
   }

   public static aqf c() {
      return new aqf(aqd.c(), 0, 0, 0);
   }

   @Override
   public void a(cye $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(cye $$0, @Nullable dru $$1) {
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
   public dru a(int $$0, int $$1) {
      return (dru)this.b.get(cye.c($$0 + this.c.e - this.e, $$1 + this.c.f - this.e));
   }
}
