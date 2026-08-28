import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class asl implements ash {
   private final asj a;
   private final Long2ObjectOpenHashMap<eak> b = new Long2ObjectOpenHashMap();
   private dgf c = new dgf(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private asl(asj $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static asl b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static asl c(int $$0) {
      asj $$1 = asj.c($$0);
      int $$2 = ash.a($$0);
      int $$3 = $$0 + arb.a;
      int $$4 = ash.a($$3);
      return new asl($$1, $$2, $$3, $$4);
   }

   public static asl c() {
      return new asl(asj.c(), 0, 0, 0);
   }

   @Override
   public void a(dgf $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(dgf $$0, @Nullable eak $$1) {
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
   public eak a(int $$0, int $$1) {
      return (eak)this.b.get(dgf.c($$0 + this.c.h - this.e, $$1 + this.c.i - this.e));
   }
}
