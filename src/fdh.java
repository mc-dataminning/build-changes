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

public class fdh extends gvi {
   static final Logger a = LogUtils.getLogger();
   static final alf b = new alf("widget/slot_frame");
   private static final xp c = xp.c("mco.template.button.select");
   private static final xp B = xp.c("mco.template.button.trailer");
   private static final xp C = xp.c("mco.template.button.publisher");
   private static final int D = 100;
   private static final int E = 10;
   private final fkt F = new fkt(this);
   final Consumer<fby> G;
   fdh.b H;
   private final fbh.d I;
   private fhg J;
   private fhg K;
   private fhg L;
   @Nullable
   fby M = null;
   @Nullable
   String N;
   @Nullable
   private xp[] O;
   @Nullable
   List<fdy.a> P;

   public fdh(xp $$0, Consumer<fby> $$1, fbh.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public fdh(xp $$0, Consumer<fby> $$1, fbh.d $$2, @Nullable fbz $$3) {
      super($$0);
      this.G = $$1;
      this.I = $$2;
      if ($$3 == null) {
         this.H = new fdh.b(this);
         this.a(new fbz(10));
      } else {
         this.H = new fdh.b(this, Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(xp... $$0) {
      this.O = $$0;
   }

   @Override
   public void aM_() {
      this.F.a(this.l, this.p);
      this.H = this.F.c(new fdh.b(this, this.H.d()));
      fkx $$0 = this.F.b(fkx.e().a(10));
      $$0.c().b();
      this.K = $$0.a(fhg.a(B, $$0x -> this.I()).a(100).a());
      this.J = $$0.a(fhg.a(c, $$0x -> this.F()).a(100).a());
      $$0.a(fhg.a(xo.e, $$0x -> this.d()).a(100).a());
      this.L = $$0.a(fhg.a(C, $$0x -> this.J()).a(100).a());
      this.E();
      this.F.a($$1 -> {
         fhe var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.H.b(this.n, this.o - this.F.b() - this.K());
      this.F.a();
   }

   @Override
   public xp i() {
      List<xp> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.l);
      if (this.O != null) {
         $$0.addAll(Arrays.asList(this.O));
      }

      return xo.a($$0);
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
         flw.a(this, this.M.g);
      }
   }

   private void J() {
      if (this.M != null && !this.M.e.isBlank()) {
         flw.a(this, this.M.e);
      }
   }

   private void a(final fbz $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            fbz $$0 = $$0;
            faq $$1 = faq.a();

            while ($$0 != null) {
               Either<fbz, Exception> $$2 = fdh.this.a($$0, $$1);
               $$0 = fdh.this.m.a(() -> {
                  if ($$2.right().isPresent()) {
                     fdh.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (fdh.this.H.c()) {
                        fdh.this.P = fdy.a(gqh.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     fbz $$1x = (fbz)$$2.left().get();

                     for (fby $$2x : $$1x.a) {
                        fdh.this.H.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (fdh.this.H.c()) {
                           String $$3 = gqh.a("mco.template.select.none", "%link");
                           fdy.b $$4 = fdy.b.a(gqh.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           fdh.this.P = fdy.a($$3, $$4);
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

   Either<fbz, Exception> a(fbz $$0, faq $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.I));
      } catch (fcd var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(fgt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.N = null;
      if (this.P != null) {
         this.a($$0, $$1, $$2, this.P);
      }

      if (this.O != null) {
         for (int $$4 = 0; $$4 < this.O.length; $$4++) {
            xp $$5 = this.O[$$4];
            $$0.a(this.p, $$5, this.n / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(fgt $$0, int $$1, int $$2, List<fdy.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         fdy.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.p.b($$0x.a())).sum();
         int $$8 = this.n / 2 - $$7 / 2;

         for (fdy.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.p, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(xp.b($$9.c()));
               this.N = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int K() {
      return this.O != null ? g(1) : 33;
   }

   class a extends fic.a<fdh.a> {
      private static final fit c = new fit(new alf("icon/link"), new alf("icon/link_highlighted"));
      private static final fit d = new fit(new alf("icon/video_link"), new alf("icon/video_link_highlighted"));
      private static final xp e = xp.c("mco.template.info.tooltip");
      private static final xp f = xp.c("mco.template.trailer.tooltip");
      public final fby a;
      private long g;
      @Nullable
      private fhs h;
      @Nullable
      private fhs i;

      public a(final fby $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new fhs(15, 15, c, flw.b(fdh.this, $$0.e), e);
            this.h.a(fir.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new fhs(15, 15, d, flw.b(fdh.this, $$0.g), f);
            this.i.a(fir.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fdh.this.M = this.a;
         fdh.this.E();
         if (ac.c() - this.g < 250L && this.aH_()) {
            fdh.this.G.accept(this.a);
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
      public void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fdw.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(fdh.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = fdh.this.p.b(this.a.c);
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
         $$0.a(fdh.this.p, this.a.b, $$12, $$13, -1, false);
         $$0.a(fdh.this.p, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(fdh.this.p, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(fdh.this.p, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public xp a() {
         xp $$0 = xo.b(
            xp.b(this.a.b), xp.a("mco.template.select.narrate.authors", this.a.d), xp.b(this.a.h), xp.a("mco.template.select.narrate.version", this.a.c)
         );
         return xp.a("narrator.select", $$0);
      }
   }

   class b extends gvh<fdh.a> {
      public b(final fdh param1) {
         this(var1, Collections.emptyList());
      }

      public b(final Iterable<fby> param1, final Iterable $$0) {
         super(var1.n, var1.o - 33 - var1.K(), var1.K(), 46);
         this.a = var1;
         $$0.forEach(this::a);
      }

      public void a(fby $$0) {
         this.a((fdh.a)(this.a.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.a.N != null) {
            flw.a(this.a, this.a.N);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable fdh.a $$0) {
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

      public List<fby> d() {
         return this.aD_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
