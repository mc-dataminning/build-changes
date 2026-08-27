import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class aqr implements aqn {
   private final aqp a;
   private final Long2ObjectOpenHashMap<dst> b = new Long2ObjectOpenHashMap();
   private czb c = new czb(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private aqr(aqp $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static aqr b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static aqr c(int $$0) {
      aqp $$1 = aqp.c($$0);
      int $$2 = aqn.a($$0);
      int $$3 = $$0 + dst.b();
      int $$4 = aqn.a($$3);
      return new aqr($$1, $$2, $$3, $$4);
   }

   public static aqr c() {
      return new aqr(aqp.c(), 0, 0, 0);
   }

   @Override
   public void a(czb $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(czb $$0, @Nullable dst $$1) {
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
   public dst a(int $$0, int $$1) {
      return (dst)this.b.get(czb.c($$0 + this.c.e - this.e, $$1 + this.c.f - this.e));
   }
}
