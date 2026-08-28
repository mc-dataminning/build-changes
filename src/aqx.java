import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class aqx implements aqt {
   private final aqv a;
   private final Long2ObjectOpenHashMap<dvc> b = new Long2ObjectOpenHashMap();
   private dbk c = new dbk(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private aqx(aqv $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static aqx b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static aqx c(int $$0) {
      aqv $$1 = aqv.c($$0);
      int $$2 = aqt.a($$0);
      int $$3 = $$0 + dvc.b();
      int $$4 = aqt.a($$3);
      return new aqx($$1, $$2, $$3, $$4);
   }

   public static aqx c() {
      return new aqx(aqv.c(), 0, 0, 0);
   }

   @Override
   public void a(dbk $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(dbk $$0, @Nullable dvc $$1) {
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
   public dvc a(int $$0, int $$1) {
      return (dvc)this.b.get(dbk.c($$0 + this.c.e - this.e, $$1 + this.c.f - this.e));
   }
}
