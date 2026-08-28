import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class aru implements arq {
   private final ars a;
   private final Long2ObjectOpenHashMap<dxl> b = new Long2ObjectOpenHashMap();
   private ddm c = new ddm(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private aru(ars $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static aru b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static aru c(int $$0) {
      ars $$1 = ars.c($$0);
      int $$2 = arq.a($$0);
      int $$3 = $$0 + aqm.a;
      int $$4 = arq.a($$3);
      return new aru($$1, $$2, $$3, $$4);
   }

   public static aru c() {
      return new aru(ars.c(), 0, 0, 0);
   }

   @Override
   public void a(ddm $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(ddm $$0, @Nullable dxl $$1) {
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
   public dxl a(int $$0, int $$1) {
      return (dxl)this.b.get(ddm.c($$0 + this.c.e - this.e, $$1 + this.c.f - this.e));
   }
}
