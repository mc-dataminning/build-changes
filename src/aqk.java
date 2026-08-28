import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class aqk {
   private final aqy b;
   private final ddm c;
   @Nullable
   private dxl d = null;
   public final dxl a;
   private volatile boolean e;
   private final List<CompletableFuture<aqo<dwk>>> f = new ArrayList<>();
   private final azx<aqz> g;
   private boolean h;

   private aqk(aqy $$0, dxl $$1, ddm $$2, azx<aqz> $$3) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
      this.g = $$3;
   }

   public static aqk a(aqy $$0, dxl $$1, ddm $$2) {
      int $$3 = dxk.a.a($$1).a(dxl.c);
      azx<aqz> $$4 = azx.a($$2.e, $$2.f, $$3, ($$1x, $$2x) -> $$0.d(ddm.c($$1x, $$2x)));
      return new aqk($$0, $$1, $$2, $$4);
   }

   @Nullable
   public CompletableFuture<?> a() {
      while (true) {
         CompletableFuture<?> $$0 = this.g();
         if ($$0 != null) {
            return $$0;
         }

         if (this.e || this.d == this.a) {
            this.e();
            return null;
         }

         this.d();
      }
   }

   private void d() {
      dxl $$0;
      if (this.d == null) {
         $$0 = dxl.c;
      } else if (!this.h && this.d == dxl.c && !this.f()) {
         this.h = true;
         $$0 = dxl.c;
      } else {
         $$0 = dxl.a().get(this.d.b() + 1);
      }

      this.a($$0, this.h);
      this.d = $$0;
   }

   public void b() {
      this.e = true;
   }

   private void e() {
      aqz $$0 = this.g.a(this.c.e, this.c.f);
      $$0.a(this);
      this.g.a(this.b::a);
   }

   private boolean f() {
      if (this.a == dxl.c) {
         return true;
      } else {
         dxl $$0 = this.g.a(this.c.e, this.c.f).q();
         if ($$0 != null && !$$0.d(this.a)) {
            dxj $$1 = dxk.b.a(this.a).c();
            int $$2 = $$1.c();

            for (int $$3 = this.c.e - $$2; $$3 <= this.c.e + $$2; $$3++) {
               for (int $$4 = this.c.f - $$2; $$4 <= this.c.f + $$2; $$4++) {
                  int $$5 = this.c.e($$3, $$4);
                  dxl $$6 = $$1.a($$5);
                  dxl $$7 = this.g.a($$3, $$4).q();
                  if ($$7 == null || $$7.d($$6)) {
                     return false;
                  }
               }
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public aqz c() {
      return this.g.a(this.c.e, this.c.f);
   }

   private void a(dxl $$0, boolean $$1) {
      int $$2 = this.b($$0, $$1);

      for (int $$3 = this.c.e - $$2; $$3 <= this.c.e + $$2; $$3++) {
         for (int $$4 = this.c.f - $$2; $$4 <= this.c.f + $$2; $$4++) {
            aqz $$5 = this.g.a($$3, $$4);
            if (this.e || !this.a($$0, $$1, $$5)) {
               return;
            }
         }
      }
   }

   private int b(dxl $$0, boolean $$1) {
      dxk $$2 = $$1 ? dxk.a : dxk.b;
      return $$2.a(this.a).a($$0);
   }

   private boolean a(dxl $$0, boolean $$1, aqz $$2) {
      dxl $$3 = $$2.q();
      boolean $$4 = $$3 != null && $$0.b($$3);
      dxk $$5 = $$4 ? dxk.a : dxk.b;
      if ($$4 && !$$1) {
         throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
      } else {
         CompletableFuture<aqo<dwk>> $$6 = $$2.a($$5.a($$0), this.b, this.g);
         aqo<dwk> $$7 = $$6.getNow(null);
         if ($$7 == null) {
            this.f.add($$6);
            return true;
         } else if ($$7.a()) {
            return true;
         } else {
            this.b();
            return false;
         }
      }
   }

   @Nullable
   private CompletableFuture<?> g() {
      while (!this.f.isEmpty()) {
         CompletableFuture<aqo<dwk>> $$0 = this.f.getLast();
         aqo<dwk> $$1 = $$0.getNow(null);
         if ($$1 == null) {
            return $$0;
         }

         this.f.removeLast();
         if (!$$1.a()) {
            this.b();
         }
      }

      return null;
   }
}
