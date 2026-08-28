import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class arq implements arm {
   private final aro a;
   private final Long2ObjectOpenHashMap<dzt> b = new Long2ObjectOpenHashMap();
   private dfo c = new dfo(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private arq(aro $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static arq b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static arq c(int $$0) {
      aro $$1 = aro.c($$0);
      int $$2 = arm.a($$0);
      int $$3 = $$0 + aqg.a;
      int $$4 = arm.a($$3);
      return new arq($$1, $$2, $$3, $$4);
   }

   public static arq c() {
      return new arq(aro.c(), 0, 0, 0);
   }

   @Override
   public void a(dfo $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(dfo $$0, @Nullable dzt $$1) {
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
   public dzt a(int $$0, int $$1) {
      return (dzt)this.b.get(dfo.c($$0 + this.c.h - this.e, $$1 + this.c.i - this.e));
   }
}
