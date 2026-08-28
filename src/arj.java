import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class arj {
   private final arx b;
   private final dgg c;
   @Nullable
   private eaj d = null;
   public final eaj a;
   private volatile boolean e;
   private final List<CompletableFuture<arn<dzi>>> f = new ArrayList<>();
   private final bay<ary> g;
   private boolean h;

   private arj(arx $$0, eaj $$1, dgg $$2, bay<ary> $$3) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
      this.g = $$3;
   }

   public static arj a(arx $$0, eaj $$1, dgg $$2) {
      int $$3 = eai.a.a($$1).a(eaj.c);
      bay<ary> $$4 = bay.a($$2.g, $$2.h, $$3, ($$1x, $$2x) -> $$0.d(dgg.c($$1x, $$2x)));
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
      eaj $$0;
      if (this.d == null) {
         $$0 = eaj.c;
      } else if (!this.h && this.d == eaj.c && !this.f()) {
         this.h = true;
         $$0 = eaj.c;
      } else {
         $$0 = eaj.a().get(this.d.b() + 1);
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
      if (this.a == eaj.c) {
         return true;
      } else {
         eaj $$0 = this.g.a(this.c.g, this.c.h).p();
         if ($$0 != null && !$$0.d(this.a)) {
            eah $$1 = eai.b.a(this.a).c();
            int $$2 = $$1.c();

            for (int $$3 = this.c.g - $$2; $$3 <= this.c.g + $$2; $$3++) {
               for (int $$4 = this.c.h - $$2; $$4 <= this.c.h + $$2; $$4++) {
                  int $$5 = this.c.e($$3, $$4);
                  eaj $$6 = $$1.a($$5);
                  eaj $$7 = this.g.a($$3, $$4).p();
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

   private void a(eaj $$0, boolean $$1) {
      try (bpt $$2 = bpn.a().d("scheduleLayer")) {
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

   private int b(eaj $$0, boolean $$1) {
      eai $$2 = $$1 ? eai.a : eai.b;
      return $$2.a(this.a).a($$0);
   }

   private boolean a(eaj $$0, boolean $$1, ary $$2) {
      eaj $$3 = $$2.p();
      boolean $$4 = $$3 != null && $$0.b($$3);
      eai $$5 = $$4 ? eai.a : eai.b;
      if ($$4 && !$$1) {
         throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
      } else {
         CompletableFuture<arn<dzi>> $$6 = $$2.a($$5.a($$0), this.b, this.g);
         arn<dzi> $$7 = $$6.getNow(null);
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
         CompletableFuture<arn<dzi>> $$0 = this.f.getLast();
         arn<dzi> $$1 = $$0.getNow(null);
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
