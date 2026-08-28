import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class asa implements arw {
   private final ary a;
   private final Long2ObjectOpenHashMap<dya> b = new Long2ObjectOpenHashMap();
   private deb c = new deb(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private asa(ary $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static asa b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static asa c(int $$0) {
      ary $$1 = ary.c($$0);
      int $$2 = arw.a($$0);
      int $$3 = $$0 + aqr.a;
      int $$4 = arw.a($$3);
      return new asa($$1, $$2, $$3, $$4);
   }

   public static asa c() {
      return new asa(ary.c(), 0, 0, 0);
   }

   @Override
   public void a(deb $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(deb $$0, @Nullable dya $$1) {
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
   public dya a(int $$0, int $$1) {
      return (dya)this.b.get(deb.c($$0 + this.c.e - this.e, $$1 + this.c.f - this.e));
   }
}
