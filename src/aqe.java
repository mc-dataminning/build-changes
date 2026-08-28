import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class aqe {
   private final aqs b;
   private final dgg c;
   @Nullable
   private ean d = null;
   public final ean a;
   private volatile boolean e;
   private final List<CompletableFuture<aqi<dzm>>> f = new ArrayList<>();
   private final azt<aqt> g;
   private boolean h;

   private aqe(aqs $$0, ean $$1, dgg $$2, azt<aqt> $$3) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
      this.g = $$3;
   }

   public static aqe a(aqs $$0, ean $$1, dgg $$2) {
      int $$3 = eam.a.a($$1).a(ean.c);
      azt<aqt> $$4 = azt.a($$2.h, $$2.i, $$3, ($$1x, $$2x) -> $$0.d(dgg.c($$1x, $$2x)));
      return new aqe($$0, $$1, $$2, $$4);
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
      ean $$0;
      if (this.d == null) {
         $$0 = ean.c;
      } else if (!this.h && this.d == ean.c && !this.f()) {
         this.h = true;
         $$0 = ean.c;
      } else {
         $$0 = ean.a().get(this.d.b() + 1);
      }

      this.a($$0, this.h);
      this.d = $$0;
   }

   public void b() {
      this.e = true;
   }

   private void e() {
      aqt $$0 = this.g.a(this.c.h, this.c.i);
      $$0.a(this);
      this.g.a(this.b::a);
   }

   private boolean f() {
      if (this.a == ean.c) {
         return true;
      } else {
         ean $$0 = this.g.a(this.c.h, this.c.i).q();
         if ($$0 != null && !$$0.d(this.a)) {
            eal $$1 = eam.b.a(this.a).c();
            int $$2 = $$1.c();

            for (int $$3 = this.c.h - $$2; $$3 <= this.c.h + $$2; $$3++) {
               for (int $$4 = this.c.i - $$2; $$4 <= this.c.i + $$2; $$4++) {
                  int $$5 = this.c.e($$3, $$4);
                  ean $$6 = $$1.a($$5);
                  ean $$7 = this.g.a($$3, $$4).q();
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

   public aqt c() {
      return this.g.a(this.c.h, this.c.i);
   }

   private void a(ean $$0, boolean $$1) {
      try (bpo $$2 = bpi.a().d("scheduleLayer")) {
         $$2.a($$0::f);
         int $$3 = this.b($$0, $$1);

         for (int $$4 = this.c.h - $$3; $$4 <= this.c.h + $$3; $$4++) {
            for (int $$5 = this.c.i - $$3; $$5 <= this.c.i + $$3; $$5++) {
               aqt $$6 = this.g.a($$4, $$5);
               if (this.e || !this.a($$0, $$1, $$6)) {
                  return;
               }
            }
         }
      }
   }

   private int b(ean $$0, boolean $$1) {
      eam $$2 = $$1 ? eam.a : eam.b;
      return $$2.a(this.a).a($$0);
   }

   private boolean a(ean $$0, boolean $$1, aqt $$2) {
      ean $$3 = $$2.q();
      boolean $$4 = $$3 != null && $$0.b($$3);
      eam $$5 = $$4 ? eam.a : eam.b;
      if ($$4 && !$$1) {
         throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
      } else {
         CompletableFuture<aqi<dzm>> $$6 = $$2.a($$5.a($$0), this.b, this.g);
         aqi<dzm> $$7 = $$6.getNow(null);
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
         CompletableFuture<aqi<dzm>> $$0 = this.f.getLast();
         aqi<dzm> $$1 = $$0.getNow(null);
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
