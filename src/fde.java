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

public class fde extends gvf {
   static final Logger a = LogUtils.getLogger();
   static final ale b = new ale("widget/slot_frame");
   private static final xo c = xo.c("mco.template.button.select");
   private static final xo B = xo.c("mco.template.button.trailer");
   private static final xo C = xo.c("mco.template.button.publisher");
   private static final int D = 100;
   private static final int E = 10;
   private final fkq F = new fkq(this);
   final Consumer<fbv> G;
   fde.b H;
   private final fbe.d I;
   private fhd J;
   private fhd K;
   private fhd L;
   @Nullable
   fbv M = null;
   @Nullable
   String N;
   @Nullable
   private xo[] O;
   @Nullable
   List<fdv.a> P;

   public fde(xo $$0, Consumer<fbv> $$1, fbe.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public fde(xo $$0, Consumer<fbv> $$1, fbe.d $$2, @Nullable fbw $$3) {
      super($$0);
      this.G = $$1;
      this.I = $$2;
      if ($$3 == null) {
         this.H = new fde.b(this);
         this.a(new fbw(10));
      } else {
         this.H = new fde.b(this, Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(xo... $$0) {
      this.O = $$0;
   }

   @Override
   public void aM_() {
      this.F.a(this.l, this.p);
      this.H = this.F.c(new fde.b(this, this.H.d()));
      fku $$0 = this.F.b(fku.e().a(10));
      $$0.c().b();
      this.K = $$0.a(fhd.a(B, $$0x -> this.I()).a(100).a());
      this.J = $$0.a(fhd.a(c, $$0x -> this.F()).a(100).a());
      $$0.a(fhd.a(xn.e, $$0x -> this.d()).a(100).a());
      this.L = $$0.a(fhd.a(C, $$0x -> this.J()).a(100).a());
      this.E();
      this.F.a($$1 -> {
         fhb var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.H.b(this.n, this.o - this.F.b() - this.K());
      this.F.a();
   }

   @Override
   public xo i() {
      List<xo> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.l);
      if (this.O != null) {
         $$0.addAll(Arrays.asList(this.O));
      }

      return xn.a($$0);
   }

   void E() {
      this.L.k = this.M != null && !this.M.e.isEmpty();
      this.K.k = this.M != null && !this.M.g.isEmpty();
      this.J.j = this.M != null;
   }

   @Override
   public void d() {
      this.G.accept(null);
   }

   private void F() {
      if (this.M != null) {
         this.G.accept(this.M);
      }
   }

   private void I() {
      if (this.M != null && !this.M.g.isBlank()) {
         flt.a(this, this.M.g);
      }
   }

   private void J() {
      if (this.M != null && !this.M.e.isBlank()) {
         flt.a(this, this.M.e);
      }
   }

   private void a(final fbw $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            fbw $$0 = $$0;
            fan $$1 = fan.a();

            while ($$0 != null) {
               Either<fbw, Exception> $$2 = fde.this.a($$0, $$1);
               $$0 = fde.this.m.a(() -> {
                  if ($$2.right().isPresent()) {
                     fde.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (fde.this.H.c()) {
                        fde.this.P = fdv.a(gqe.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     fbw $$1x = (fbw)$$2.left().get();

                     for (fbv $$2x : $$1x.a) {
                        fde.this.H.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (fde.this.H.c()) {
                           String $$3 = gqe.a("mco.template.select.none", "%link");
                           fdv.b $$4 = fdv.b.a(gqe.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           fde.this.P = fdv.a($$3, $$4);
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

   Either<fbw, Exception> a(fbw $$0, fan $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.I));
      } catch (fca var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(fgq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.N = null;
      if (this.P != null) {
         this.a($$0, $$1, $$2, this.P);
      }

      if (this.O != null) {
         for (int $$4 = 0; $$4 < this.O.length; $$4++) {
            xo $$5 = this.O[$$4];
            $$0.a(this.p, $$5, this.n / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(fgq $$0, int $$1, int $$2, List<fdv.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         fdv.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.p.b($$0x.a())).sum();
         int $$8 = this.n / 2 - $$7 / 2;

         for (fdv.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.p, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(xo.b($$9.c()));
               this.N = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int K() {
      return this.O != null ? g(1) : 33;
   }

   class a extends fhz.a<fde.a> {
      private static final fiq c = new fiq(new ale("icon/link"), new ale("icon/link_highlighted"));
      private static final fiq d = new fiq(new ale("icon/video_link"), new ale("icon/video_link_highlighted"));
      private static final xo e = xo.c("mco.template.info.tooltip");
      private static final xo f = xo.c("mco.template.trailer.tooltip");
      public final fbv a;
      private long g;
      @Nullable
      private fhp h;
      @Nullable
      private fhp i;

      public a(final fbv $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new fhp(15, 15, c, flt.b(fde.this, $$0.e), e);
            this.h.a(fio.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new fhp(15, 15, d, flt.b(fde.this, $$0.g), f);
            this.i.a(fio.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fde.this.M = this.a;
         fde.this.E();
         if (ac.c() - this.g < 250L && this.aH_()) {
            fde.this.G.accept(this.a);
         }

         this.g = ac.c();
         if (this.h != null) {
            this.h.a($$0, $$1, $$2);
         }

         if (this.i != null) {
            this.i.a($$0, $$1, $$2);
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fdt.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(fde.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = fde.this.p.b(this.a.c);
         if (this.h != null) {
            this.h.c($$3 + $$4 - $$11 - this.h.x() - 10, $$2);
            this.h.a($$0, $$6, $$7, $$9);
         }

         if (this.i != null) {
            this.i.c($$3 + $$4 - $$11 - this.i.x() * 2 - 15, $$2);
            this.i.a($$0, $$6, $$7, $$9);
         }

         int $$12 = $$3 + 45 + 20;
         int $$13 = $$2 + 5;
         $$0.a(fde.this.p, this.a.b, $$12, $$13, -1, false);
         $$0.a(fde.this.p, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(fde.this.p, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(fde.this.p, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public xo a() {
         xo $$0 = xn.b(
            xo.b(this.a.b), xo.a("mco.template.select.narrate.authors", this.a.d), xo.b(this.a.h), xo.a("mco.template.select.narrate.version", this.a.c)
         );
         return xo.a("narrator.select", $$0);
      }
   }

   class b extends gve<fde.a> {
      public b(final fde param1) {
         this(var1, Collections.emptyList());
      }

      public b(final Iterable<fbv> param1, final Iterable $$0) {
         super(var1.n, var1.o - 33 - var1.K(), var1.K(), 46);
         this.a = var1;
         $$0.forEach(this::a);
      }

      public void a(fbv $$0) {
         this.a((fde.a)(this.a.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.a.N != null) {
            flt.a(this.a, this.a.N);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable fde.a $$0) {
         super.a($$0);
         this.a.M = $$0 == null ? null : $$0.a;
         this.a.E();
      }

      @Override
      public int a() {
         return this.l() * 46;
      }

      @Override
      public int b() {
         return 300;
      }

      public boolean c() {
         return this.l() == 0;
      }

      public List<fbv> d() {
         return this.aD_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
