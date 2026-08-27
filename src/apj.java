import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class apj implements apf {
   private final aph a;
   private final Long2ObjectOpenHashMap<dnk> b = new Long2ObjectOpenHashMap();
   private cuy c = new cuy(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private apj(aph $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static apj b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static apj c(int $$0) {
      aph $$1 = aph.c($$0);
      int $$2 = apf.a($$0);
      int $$3 = $$0 + dnk.b();
      int $$4 = apf.a($$3);
      return new apj($$1, $$2, $$3, $$4);
   }

   public static apj c() {
      return new apj(aph.c(), 0, 0, 0);
   }

   @Override
   public void a(cuy $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(cuy $$0, @Nullable dnk $$1) {
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
   public dnk a(int $$0, int $$1) {
      return (dnk)this.b.get(cuy.c($$0 + this.c.e - this.e, $$1 + this.c.f - this.e));
   }
}
