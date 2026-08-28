import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class asv implements asr {
   private final ast a;
   private final Long2ObjectOpenHashMap<eaj> b = new Long2ObjectOpenHashMap();
   private dgg c = new dgg(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private asv(ast $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static asv b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static asv c(int $$0) {
      ast $$1 = ast.c($$0);
      int $$2 = asr.a($$0);
      int $$3 = $$0 + arl.a;
      int $$4 = asr.a($$3);
      return new asv($$1, $$2, $$3, $$4);
   }

   public static asv c() {
      return new asv(ast.c(), 0, 0, 0);
   }

   @Override
   public void a(dgg $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(dgg $$0, @Nullable eaj $$1) {
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
   public eaj a(int $$0, int $$1) {
      return (eaj)this.b.get(dgg.c($$0 + this.c.g - this.e, $$1 + this.c.h - this.e));
   }
}
