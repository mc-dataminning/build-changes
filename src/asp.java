import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class asp implements asl {
   private final asn a;
   private final Long2ObjectOpenHashMap<eeo> b = new Long2ObjectOpenHashMap();
   private djo c = new djo(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private asp(asn $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static asp b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static asp c(int $$0) {
      asn $$1 = asn.c($$0);
      int $$2 = asl.a($$0);
      int $$3 = $$0 + are.a;
      int $$4 = asl.a($$3);
      return new asp($$1, $$2, $$3, $$4);
   }

   public static asp c() {
      return new asp(asn.c(), 0, 0, 0);
   }

   @Override
   public void a(djo $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(djo $$0, @Nullable eeo $$1) {
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
   public eeo a(int $$0, int $$1) {
      return (eeo)this.b.get(djo.c($$0 + this.c.h - this.e, $$1 + this.c.i - this.e));
   }
}
