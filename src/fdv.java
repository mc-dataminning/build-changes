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

public class fdv extends gvu {
   static final Logger a = LogUtils.getLogger();
   static final akk b = new akk("widget/slot_frame");
   private static final wu c = wu.c("mco.template.button.select");
   private static final wu A = wu.c("mco.template.button.trailer");
   private static final wu B = wu.c("mco.template.button.publisher");
   private static final int C = 100;
   private static final int D = 10;
   private final flh E = new flh(this);
   final Consumer<fcm> F;
   fdv.b G;
   private final fbv.d H;
   private fhu I;
   private fhu J;
   private fhu K;
   @Nullable
   fcm L = null;
   @Nullable
   String M;
   @Nullable
   private wu[] N;
   @Nullable
   List<fem.a> O;

   public fdv(wu $$0, Consumer<fcm> $$1, fbv.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public fdv(wu $$0, Consumer<fcm> $$1, fbv.d $$2, @Nullable fcn $$3) {
      super($$0);
      this.F = $$1;
      this.H = $$2;
      if ($$3 == null) {
         this.G = new fdv.b(this);
         this.a(new fcn(10));
      } else {
         this.G = new fdv.b(this, Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(wu... $$0) {
      this.N = $$0;
   }

   @Override
   public void aP_() {
      this.E.a(this.k, this.o);
      this.G = this.E.c(new fdv.b(this, this.G.d()));
      fll $$0 = this.E.b(fll.e().a(10));
      $$0.c().b();
      this.J = $$0.a(fhu.a(A, $$0x -> this.F()).a(100).a());
      this.I = $$0.a(fhu.a(c, $$0x -> this.E()).a(100).a());
      $$0.a(fhu.a(wt.e, $$0x -> this.d()).a(100).a());
      this.K = $$0.a(fhu.a(B, $$0x -> this.G()).a(100).a());
      this.D();
      this.E.a($$1 -> {
         fhs var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.G.b(this.m, this.n - this.E.b() - this.J());
      this.E.a();
   }

   @Override
   public wu i() {
      List<wu> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.k);
      if (this.N != null) {
         $$0.addAll(Arrays.asList(this.N));
      }

      return wt.a($$0);
   }

   void D() {
      this.K.k = this.L != null && !this.L.e.isEmpty();
      this.J.k = this.L != null && !this.L.g.isEmpty();
      this.I.j = this.L != null;
   }

   @Override
   public void d() {
      this.F.accept(null);
   }

   private void E() {
      if (this.L != null) {
         this.F.accept(this.L);
      }
   }

   private void F() {
      if (this.L != null && !this.L.g.isBlank()) {
         fmi.a(this, this.L.g);
      }
   }

   private void G() {
      if (this.L != null && !this.L.e.isBlank()) {
         fmi.a(this, this.L.e);
      }
   }

   private void a(final fcn $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            fcn $$0 = $$0;
            fbe $$1 = fbe.a();

            while ($$0 != null) {
               Either<fcn, Exception> $$2 = fdv.this.a($$0, $$1);
               $$0 = fdv.this.l.a(() -> {
                  if ($$2.right().isPresent()) {
                     fdv.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (fdv.this.G.c()) {
                        fdv.this.O = fem.a(gqw.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     fcn $$1x = (fcn)$$2.left().get();

                     for (fcm $$2x : $$1x.a) {
                        fdv.this.G.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (fdv.this.G.c()) {
                           String $$3 = gqw.a("mco.template.select.none", "%link");
                           fem.b $$4 = fem.b.a(gqw.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           fdv.this.O = fem.a($$3, $$4);
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

   Either<fcn, Exception> a(fcn $$0, fbe $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.H));
      } catch (fcr var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.M = null;
      if (this.O != null) {
         this.a($$0, $$1, $$2, this.O);
      }

      if (this.N != null) {
         for (int $$4 = 0; $$4 < this.N.length; $$4++) {
            wu $$5 = this.N[$$4];
            $$0.a(this.o, $$5, this.m / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(fhh $$0, int $$1, int $$2, List<fem.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         fem.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.o.b($$0x.a())).sum();
         int $$8 = this.m / 2 - $$7 / 2;

         for (fem.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.o, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(wu.b($$9.c()));
               this.M = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int J() {
      return this.N != null ? g(1) : 33;
   }

   class a extends fiq.a<fdv.a> {
      private static final fjh c = new fjh(new akk("icon/link"), new akk("icon/link_highlighted"));
      private static final fjh d = new fjh(new akk("icon/video_link"), new akk("icon/video_link_highlighted"));
      private static final wu e = wu.c("mco.template.info.tooltip");
      private static final wu f = wu.c("mco.template.trailer.tooltip");
      public final fcm a;
      private long g;
      @Nullable
      private fig h;
      @Nullable
      private fig i;

      public a(final fcm $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new fig(15, 15, c, fmi.b(fdv.this, $$0.e), e);
            this.h.a(fjf.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new fig(15, 15, d, fmi.b(fdv.this, $$0.g), f);
            this.i.a(fjf.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fdv.this.L = this.a;
         fdv.this.D();
         if (ac.c() - this.g < 250L && this.aK_()) {
            fdv.this.F.accept(this.a);
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
      public void a(fhh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fek.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(fdv.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = fdv.this.o.b(this.a.c);
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
         $$0.a(fdv.this.o, this.a.b, $$12, $$13, -1, false);
         $$0.a(fdv.this.o, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(fdv.this.o, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(fdv.this.o, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public wu a() {
         wu $$0 = wt.b(
            wu.b(this.a.b), wu.a("mco.template.select.narrate.authors", this.a.d), wu.b(this.a.h), wu.a("mco.template.select.narrate.version", this.a.c)
         );
         return wu.a("narrator.select", $$0);
      }
   }

   class b extends gvt<fdv.a> {
      public b(final fdv param1) {
         this(var1, Collections.emptyList());
      }

      public b(final Iterable<fcm> param1, final Iterable $$0) {
         super(var1.m, var1.n - 33 - var1.J(), var1.J(), 46);
         this.a = var1;
         $$0.forEach(this::a);
      }

      public void a(fcm $$0) {
         this.a((fdv.a)(this.a.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.a.M != null) {
            fmi.a(this.a, this.a.M);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable fdv.a $$0) {
         super.a($$0);
         this.a.L = $$0 == null ? null : $$0.a;
         this.a.D();
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

      public List<fcm> d() {
         return this.aG_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
