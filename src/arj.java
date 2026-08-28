import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class arj {
   private final arx b;
   private final dgn c;
   @Nullable
   private eaq d = null;
   public final eaq a;
   private volatile boolean e;
   private final List<CompletableFuture<arn<dzp>>> f = new ArrayList<>();
   private final bay<ary> g;
   private boolean h;

   private arj(arx $$0, eaq $$1, dgn $$2, bay<ary> $$3) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
      this.g = $$3;
   }

   public static arj a(arx $$0, eaq $$1, dgn $$2) {
      int $$3 = eap.a.a($$1).a(eaq.c);
      bay<ary> $$4 = bay.a($$2.g, $$2.h, $$3, ($$1x, $$2x) -> $$0.d(dgn.c($$1x, $$2x)));
      return new arj($$0, $$1, $$2, $$4);
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
      eaq $$0;
      if (this.d == null) {
         $$0 = eaq.c;
      } else if (!this.h && this.d == eaq.c && !this.f()) {
         this.h = true;
         $$0 = eaq.c;
      } else {
         $$0 = eaq.a().get(this.d.b() + 1);
      }

      this.a($$0, this.h);
      this.d = $$0;
   }

   public void b() {
      this.e = true;
   }

   private void e() {
      ary $$0 = this.g.a(this.c.g, this.c.h);
      $$0.a(this);
      this.g.a(this.b::a);
   }

   private boolean f() {
      if (this.a == eaq.c) {
         return true;
      } else {
         eaq $$0 = this.g.a(this.c.g, this.c.h).p();
         if ($$0 != null && !$$0.d(this.a)) {
            eao $$1 = eap.b.a(this.a).c();
            int $$2 = $$1.c();

            for (int $$3 = this.c.g - $$2; $$3 <= this.c.g + $$2; $$3++) {
               for (int $$4 = this.c.h - $$2; $$4 <= this.c.h + $$2; $$4++) {
                  int $$5 = this.c.e($$3, $$4);
                  eaq $$6 = $$1.a($$5);
                  eaq $$7 = this.g.a($$3, $$4).p();
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

   public ary c() {
      return this.g.a(this.c.g, this.c.h);
   }

   private void a(eaq $$0, boolean $$1) {
      try (bpx $$2 = bpr.a().d("scheduleLayer")) {
         $$2.a($$0::f);
         int $$3 = this.b($$0, $$1);

         for (int $$4 = this.c.g - $$3; $$4 <= this.c.g + $$3; $$4++) {
            for (int $$5 = this.c.h - $$3; $$5 <= this.c.h + $$3; $$5++) {
               ary $$6 = this.g.a($$4, $$5);
               if (this.e || !this.a($$0, $$1, $$6)) {
                  return;
               }
            }
         }
      }
   }

   private int b(eaq $$0, boolean $$1) {
      eap $$2 = $$1 ? eap.a : eap.b;
      return $$2.a(this.a).a($$0);
   }

   private boolean a(eaq $$0, boolean $$1, ary $$2) {
      eaq $$3 = $$2.p();
      boolean $$4 = $$3 != null && $$0.b($$3);
      eap $$5 = $$4 ? eap.a : eap.b;
      if ($$4 && !$$1) {
         throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
      } else {
         CompletableFuture<arn<dzp>> $$6 = $$2.a($$5.a($$0), this.b, this.g);
         arn<dzp> $$7 = $$6.getNow(null);
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
         CompletableFuture<arn<dzp>> $$0 = this.f.getLast();
         arn<dzp> $$1 = $$0.getNow(null);
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
