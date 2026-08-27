import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class aqu implements aqq {
   private final aqs a;
   private final Long2ObjectOpenHashMap<dtc> b = new Long2ObjectOpenHashMap();
   private czk c = new czk(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private aqu(aqs $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static aqu b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static aqu c(int $$0) {
      aqs $$1 = aqs.c($$0);
      int $$2 = aqq.a($$0);
      int $$3 = $$0 + dtc.b();
      int $$4 = aqq.a($$3);
      return new aqu($$1, $$2, $$3, $$4);
   }

   public static aqu c() {
      return new aqu(aqs.c(), 0, 0, 0);
   }

   @Override
   public void a(czk $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(czk $$0, @Nullable dtc $$1) {
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
   public dtc a(int $$0, int $$1) {
      return (dtc)this.b.get(czk.c($$0 + this.c.e - this.e, $$1 + this.c.f - this.e));
   }
}
