import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class aqh implements aqd {
   private final aqf a;
   private final Long2ObjectOpenHashMap<dsd> b = new Long2ObjectOpenHashMap();
   private cyn c = new cyn(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private aqh(aqf $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static aqh b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static aqh c(int $$0) {
      aqf $$1 = aqf.c($$0);
      int $$2 = aqd.a($$0);
      int $$3 = $$0 + dsd.b();
      int $$4 = aqd.a($$3);
      return new aqh($$1, $$2, $$3, $$4);
   }

   public static aqh c() {
      return new aqh(aqf.c(), 0, 0, 0);
   }

   @Override
   public void a(cyn $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(cyn $$0, @Nullable dsd $$1) {
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
   public dsd a(int $$0, int $$1) {
      return (dsd)this.b.get(cyn.c($$0 + this.c.e - this.e, $$1 + this.c.f - this.e));
   }
}
