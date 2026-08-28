import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class aqt {
   private final arh b;
   private final del c;
   @Nullable
   private dyk d = null;
   public final dyk a;
   private volatile boolean e;
   private final List<CompletableFuture<aqx<dxj>>> f = new ArrayList<>();
   private final bah<ari> g;
   private boolean h;

   private aqt(arh $$0, dyk $$1, del $$2, bah<ari> $$3) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
      this.g = $$3;
   }

   public static aqt a(arh $$0, dyk $$1, del $$2) {
      int $$3 = dyj.a.a($$1).a(dyk.c);
      bah<ari> $$4 = bah.a($$2.g, $$2.h, $$3, ($$1x, $$2x) -> $$0.d(del.c($$1x, $$2x)));
      return new aqt($$0, $$1, $$2, $$4);
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
      dyk $$0;
      if (this.d == null) {
         $$0 = dyk.c;
      } else if (!this.h && this.d == dyk.c && !this.f()) {
         this.h = true;
         $$0 = dyk.c;
      } else {
         $$0 = dyk.a().get(this.d.b() + 1);
      }

      this.a($$0, this.h);
      this.d = $$0;
   }

   public void b() {
      this.e = true;
   }

   private void e() {
      ari $$0 = this.g.a(this.c.g, this.c.h);
      $$0.a(this);
      this.g.a(this.b::a);
   }

   private boolean f() {
      if (this.a == dyk.c) {
         return true;
      } else {
         dyk $$0 = this.g.a(this.c.g, this.c.h).p();
         if ($$0 != null && !$$0.d(this.a)) {
            dyi $$1 = dyj.b.a(this.a).c();
            int $$2 = $$1.c();

            for (int $$3 = this.c.g - $$2; $$3 <= this.c.g + $$2; $$3++) {
               for (int $$4 = this.c.h - $$2; $$4 <= this.c.h + $$2; $$4++) {
                  int $$5 = this.c.e($$3, $$4);
                  dyk $$6 = $$1.a($$5);
                  dyk $$7 = this.g.a($$3, $$4).p();
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

   public ari c() {
      return this.g.a(this.c.g, this.c.h);
   }

   private void a(dyk $$0, boolean $$1) {
      try (bow $$2 = boq.a().d("scheduleLayer")) {
         $$2.a($$0::f);
         int $$3 = this.b($$0, $$1);

         for (int $$4 = this.c.g - $$3; $$4 <= this.c.g + $$3; $$4++) {
            for (int $$5 = this.c.h - $$3; $$5 <= this.c.h + $$3; $$5++) {
               ari $$6 = this.g.a($$4, $$5);
               if (this.e || !this.a($$0, $$1, $$6)) {
                  return;
               }
            }
         }
      }
   }

   private int b(dyk $$0, boolean $$1) {
      dyj $$2 = $$1 ? dyj.a : dyj.b;
      return $$2.a(this.a).a($$0);
   }

   private boolean a(dyk $$0, boolean $$1, ari $$2) {
      dyk $$3 = $$2.p();
      boolean $$4 = $$3 != null && $$0.b($$3);
      dyj $$5 = $$4 ? dyj.a : dyj.b;
      if ($$4 && !$$1) {
         throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
      } else {
         CompletableFuture<aqx<dxj>> $$6 = $$2.a($$5.a($$0), this.b, this.g);
         aqx<dxj> $$7 = $$6.getNow(null);
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
         CompletableFuture<aqx<dxj>> $$0 = this.f.getLast();
         aqx<dxj> $$1 = $$0.getNow(null);
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
