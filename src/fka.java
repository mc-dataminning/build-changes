import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fka extends hhs {
   static final Logger a = LogUtils.getLogger();
   static final alp b = alp.b("widget/slot_frame");
   private static final xk c = xk.c("mco.template.button.select");
   private static final xk C = xk.c("mco.template.button.trailer");
   private static final xk D = xk.c("mco.template.button.publisher");
   private static final int E = 100;
   private static final int F = 10;
   private final frn G = new frn(this);
   final Consumer<fis> H;
   fka.b I;
   private final fic.d J;
   private fny K;
   private fny L;
   private fny M;
   @Nullable
   fis N = null;
   @Nullable
   String O;
   @Nullable
   private xk[] P;
   @Nullable
   List<fkr.a> Q;

   public fka(xk $$0, Consumer<fis> $$1, fic.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public fka(xk $$0, Consumer<fis> $$1, fic.d $$2, @Nullable fit $$3) {
      super($$0);
      this.H = $$1;
      this.J = $$2;
      if ($$3 == null) {
         this.I = new fka.b(this);
         this.a(new fit(10));
      } else {
         this.I = new fka.b(this, Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(xk... $$0) {
      this.P = $$0;
   }

   @Override
   public void aT_() {
      this.G.a(this.l, this.p);
      this.I = this.G.c(new fka.b(this, this.I.c()));
      frr $$0 = this.G.b(frr.e().a(10));
      $$0.c().b();
      this.L = $$0.a(fny.a(C, $$0x -> this.G()).a(100).a());
      this.K = $$0.a(fny.a(c, $$0x -> this.F()).a(100).a());
      $$0.a(fny.a(xj.e, $$0x -> this.aP_()).a(100).a());
      this.M = $$0.a(fny.a(D, $$0x -> this.J()).a(100).a());
      this.E();
      this.G.a($$1 -> {
         fnw var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.I.b(this.n, this.o - this.G.b() - this.K());
      this.G.a();
   }

   @Override
   public xk i() {
      List<xk> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.l);
      if (this.P != null) {
         $$0.addAll(Arrays.asList(this.P));
      }

      return xj.a($$0);
   }

   void E() {
      this.M.k = this.N != null && !this.N.e.isEmpty();
      this.L.k = this.N != null && !this.N.g.isEmpty();
      this.K.j = this.N != null;
   }

   @Override
   public void aP_() {
      this.H.accept(null);
   }

   private void F() {
      if (this.N != null) {
         this.H.accept(this.N);
      }
   }

   private void G() {
      if (this.N != null && !this.N.g.isBlank()) {
         fso.a(this, this.N.g);
      }
   }

   private void J() {
      if (this.N != null && !this.N.e.isBlank()) {
         fso.a(this, this.N.e);
      }
   }

   private void a(final fit $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            fit $$0 = $$0;
            fhb $$1 = fhb.a();

            while ($$0 != null) {
               Either<fit, Exception> $$2 = fka.this.a($$0, $$1);
               $$0 = fka.this.m.a(() -> {
                  if ($$2.right().isPresent()) {
                     fka.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (fka.this.I.b()) {
                        fka.this.Q = fkr.a(hcn.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     fit $$1x = (fit)$$2.left().get();

                     for (fis $$2x : $$1x.a) {
                        fka.this.I.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (fka.this.I.b()) {
                           String $$3 = hcn.a("mco.template.select.none", "%link");
                           fkr.b $$4 = fkr.b.a(hcn.a("mco.template.select.none.linkTitle"), ayq.t.toString());
                           fka.this.Q = fkr.a($$3, $$4);
                        }

                        return null;
                     } else {
                        return $$1x;
                     }
                  }
               }).join();
            }
         }
      }).start();
   }

   Either<fit, Exception> a(fit $$0, fhb $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.J));
      } catch (fix var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.O = null;
      if (this.Q != null) {
         this.a($$0, $$1, $$2, this.Q);
      }

      if (this.P != null) {
         for (int $$4 = 0; $$4 < this.P.length; $$4++) {
            xk $$5 = this.P[$$4];
            $$0.a(this.p, $$5, this.n / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(fnl $$0, int $$1, int $$2, List<fkr.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         fkr.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.p.b($$0x.a())).sum();
         int $$8 = this.n / 2 - $$7 / 2;

         for (fkr.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.p, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(xk.b($$9.c()));
               this.O = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int K() {
      return this.P != null ? g(1) : 33;
   }

   class a extends fov.a<fka.a> {
      private static final fpm c = new fpm(alp.b("icon/link"), alp.b("icon/link_highlighted"));
      private static final fpm d = new fpm(alp.b("icon/video_link"), alp.b("icon/video_link_highlighted"));
      private static final xk e = xk.c("mco.template.info.tooltip");
      private static final xk f = xk.c("mco.template.trailer.tooltip");
      public final fis a;
      private long g;
      @Nullable
      private fok h;
      @Nullable
      private fok i;

      public a(final fis $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new fok(15, 15, c, fso.b(fka.this, $$0.e), e);
            this.h.a(fpk.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new fok(15, 15, d, fso.b(fka.this, $$0.g), f);
            this.i.a(fpk.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fka.this.N = this.a;
         fka.this.E();
         if (ae.c() - this.g < 250L && this.aN_()) {
            fka.this.H.accept(this.a);
         }

         this.g = ae.c();
         if (this.h != null) {
            this.h.a($$0, $$1, $$2);
         }

         if (this.i != null) {
            this.i.a($$0, $$1, $$2);
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(glq::H, fkp.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(glq::H, fka.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = fka.this.p.b(this.a.c);
         if (this.h != null) {
            this.h.c($$3 + $$4 - $$11 - this.h.y() - 10, $$2);
            this.h.a($$0, $$6, $$7, $$9);
         }

         if (this.i != null) {
            this.i.c($$3 + $$4 - $$11 - this.i.y() * 2 - 15, $$2);
            this.i.a($$0, $$6, $$7, $$9);
         }

         int $$12 = $$3 + 45 + 20;
         int $$13 = $$2 + 5;
         $$0.b(fka.this.p, this.a.b, $$12, $$13, -1);
         $$0.b(fka.this.p, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644);
         $$0.b(fka.this.p, this.a.d, $$12, $$13 + 9 + 5, -6250336);
         if (!this.a.h.isBlank()) {
            $$0.b(fka.this.p, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268);
         }
      }

      @Override
      public xk a() {
         xk $$0 = xj.b(
            xk.b(this.a.b), xk.a("mco.template.select.narrate.authors", this.a.d), xk.b(this.a.h), xk.a("mco.template.select.narrate.version", this.a.c)
         );
         return xk.a("narrator.select", $$0);
      }
   }

   class b extends fov<fka.a> {
      public b(final fka param1) {
         this(var1, Collections.emptyList());
      }

      public b(final Iterable<fis> param1, final Iterable $$0) {
         super(flz.Q(), var1.n, var1.o - 33 - var1.K(), var1.K(), 46);
         this.a = var1;
         $$0.forEach(this::a);
      }

      public void a(fis $$0) {
         this.b(this.a.new a($$0));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.a.O != null) {
            fso.a(this.a, this.a.O);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable fka.a $$0) {
         super.a($$0);
         this.a.N = $$0 == null ? null : $$0.a;
         this.a.E();
      }

      @Override
      public int a() {
         return 300;
      }

      public boolean b() {
         return this.k() == 0;
      }

      public List<fis> c() {
         return this.aI_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
