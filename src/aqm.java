import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class aqm {
   private final ara b;
   private final ddp c;
   @Nullable
   private dxp d = null;
   public final dxp a;
   private volatile boolean e;
   private final List<CompletableFuture<aqq<dwo>>> f = new ArrayList<>();
   private final azz<arb> g;
   private boolean h;

   private aqm(ara $$0, dxp $$1, ddp $$2, azz<arb> $$3) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
      this.g = $$3;
   }

   public static aqm a(ara $$0, dxp $$1, ddp $$2) {
      int $$3 = dxo.a.a($$1).a(dxp.c);
      azz<arb> $$4 = azz.a($$2.e, $$2.f, $$3, ($$1x, $$2x) -> $$0.d(ddp.c($$1x, $$2x)));
      return new aqm($$0, $$1, $$2, $$4);
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
      dxp $$0;
      if (this.d == null) {
         $$0 = dxp.c;
      } else if (!this.h && this.d == dxp.c && !this.f()) {
         this.h = true;
         $$0 = dxp.c;
      } else {
         $$0 = dxp.a().get(this.d.b() + 1);
      }

      this.a($$0, this.h);
      this.d = $$0;
   }

   public void b() {
      this.e = true;
   }

   private void e() {
      arb $$0 = this.g.a(this.c.e, this.c.f);
      $$0.a(this);
      this.g.a(this.b::a);
   }

   private boolean f() {
      if (this.a == dxp.c) {
         return true;
      } else {
         dxp $$0 = this.g.a(this.c.e, this.c.f).q();
         if ($$0 != null && !$$0.d(this.a)) {
            dxn $$1 = dxo.b.a(this.a).c();
            int $$2 = $$1.c();

            for (int $$3 = this.c.e - $$2; $$3 <= this.c.e + $$2; $$3++) {
               for (int $$4 = this.c.f - $$2; $$4 <= this.c.f + $$2; $$4++) {
                  int $$5 = this.c.e($$3, $$4);
                  dxp $$6 = $$1.a($$5);
                  dxp $$7 = this.g.a($$3, $$4).q();
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

   public arb c() {
      return this.g.a(this.c.e, this.c.f);
   }

   private void a(dxp $$0, boolean $$1) {
      int $$2 = this.b($$0, $$1);

      for (int $$3 = this.c.e - $$2; $$3 <= this.c.e + $$2; $$3++) {
         for (int $$4 = this.c.f - $$2; $$4 <= this.c.f + $$2; $$4++) {
            arb $$5 = this.g.a($$3, $$4);
            if (this.e || !this.a($$0, $$1, $$5)) {
               return;
            }
         }
      }
   }

   private int b(dxp $$0, boolean $$1) {
      dxo $$2 = $$1 ? dxo.a : dxo.b;
      return $$2.a(this.a).a($$0);
   }

   private boolean a(dxp $$0, boolean $$1, arb $$2) {
      dxp $$3 = $$2.q();
      boolean $$4 = $$3 != null && $$0.b($$3);
      dxo $$5 = $$4 ? dxo.a : dxo.b;
      if ($$4 && !$$1) {
         throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
      } else {
         CompletableFuture<aqq<dwo>> $$6 = $$2.a($$5.a($$0), this.b, this.g);
         aqq<dwo> $$7 = $$6.getNow(null);
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
         CompletableFuture<aqq<dwo>> $$0 = this.f.getLast();
         aqq<dwo> $$1 = $$0.getNow(null);
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
