import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class aro implements ark {
   private final arm a;
   private final Long2ObjectOpenHashMap<dus> b = new Long2ObjectOpenHashMap();
   private dba c = new dba(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private aro(arm $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static aro b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static aro c(int $$0) {
      arm $$1 = arm.c($$0);
      int $$2 = ark.a($$0);
      int $$3 = $$0 + dus.b();
      int $$4 = ark.a($$3);
      return new aro($$1, $$2, $$3, $$4);
   }

   public static aro c() {
      return new aro(arm.c(), 0, 0, 0);
   }

   @Override
   public void a(dba $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(dba $$0, @Nullable dus $$1) {
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
   public dus a(int $$0, int $$1) {
      return (dus)this.b.get(dba.c($$0 + this.c.e - this.e, $$1 + this.c.f - this.e));
   }
}
