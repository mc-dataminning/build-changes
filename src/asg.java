import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class asg implements asc {
   private final ase a;
   private final Long2ObjectOpenHashMap<eec> b = new Long2ObjectOpenHashMap();
   private djc c = new djc(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private asg(ase $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static asg b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static asg c(int $$0) {
      ase $$1 = ase.c($$0);
      int $$2 = asc.a($$0);
      int $$3 = $$0 + aqv.a;
      int $$4 = asc.a($$3);
      return new asg($$1, $$2, $$3, $$4);
   }

   public static asg c() {
      return new asg(ase.c(), 0, 0, 0);
   }

   @Override
   public void a(djc $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(djc $$0, @Nullable eec $$1) {
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
   public eec a(int $$0, int $$1) {
      return (eec)this.b.get(djc.c($$0 + this.c.h - this.e, $$1 + this.c.i - this.e));
   }
}
