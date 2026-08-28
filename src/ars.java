import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class ars implements aro {
   private final arq a;
   private final Long2ObjectOpenHashMap<duz> b = new Long2ObjectOpenHashMap();
   private dbh c = new dbh(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private ars(arq $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static ars b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static ars c(int $$0) {
      arq $$1 = arq.c($$0);
      int $$2 = aro.a($$0);
      int $$3 = $$0 + duz.b();
      int $$4 = aro.a($$3);
      return new ars($$1, $$2, $$3, $$4);
   }

   public static ars c() {
      return new ars(arq.c(), 0, 0, 0);
   }

   @Override
   public void a(dbh $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(dbh $$0, @Nullable duz $$1) {
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
   public duz a(int $$0, int $$1) {
      return (duz)this.b.get(dbh.c($$0 + this.c.e - this.e, $$1 + this.c.f - this.e));
   }
}
