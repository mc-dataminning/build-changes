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

public class fop extends hrc {
   static final Logger a = LogUtils.getLogger();
   static final alr b = alr.b("widget/slot_frame");
   private static final xg c = xg.c("mco.template.button.select");
   private static final xg C = xg.c("mco.template.button.trailer");
   private static final xg D = xg.c("mco.template.button.publisher");
   private static final int E = 100;
   private static final int F = 10;
   private final fxm G = new fxm(this);
   final Consumer<fnh> H;
   fop.b I;
   private final fmr.d J;
   private fty K;
   private fty L;
   private fty M;
   @Nullable
   fnh N = null;
   @Nullable
   String O;
   @Nullable
   private xg[] P;
   @Nullable
   List<fph.a> Q;

   public fop(xg $$0, Consumer<fnh> $$1, fmr.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public fop(xg $$0, Consumer<fnh> $$1, fmr.d $$2, @Nullable fni $$3) {
      super($$0);
      this.H = $$1;
      this.J = $$2;
      if ($$3 == null) {
         this.I = new fop.b(this);
         this.a(new fni(10));
      } else {
         this.I = new fop.b(this, Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(xg... $$0) {
      this.P = $$0;
   }

   @Override
   public void aO_() {
      this.G.a(this.l, this.p);
      this.I = this.G.c(new fop.b(this, this.I.c()));
      fxq $$0 = this.G.b(fxq.e().a(10));
      $$0.c().b();
      this.L = $$0.a(fty.a(C, $$0x -> this.G()).a(100).a());
      this.K = $$0.a(fty.a(c, $$0x -> this.F()).a(100).a());
      $$0.a(fty.a(xf.e, $$0x -> this.aL_()).a(100).a());
      this.M = $$0.a(fty.a(D, $$0x -> this.H()).a(100).a());
      this.E();
      this.G.a($$1 -> {
         ftw var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.I.b(this.n, this.o - this.G.b() - this.I());
      this.G.a();
   }

   @Override
   public xg i() {
      List<xg> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.l);
      if (this.P != null) {
         $$0.addAll(Arrays.asList(this.P));
      }

      return xf.a($$0);
   }

   void E() {
      this.M.k = this.N != null && !this.N.e.isEmpty();
      this.L.k = this.N != null && !this.N.g.isEmpty();
      this.K.j = this.N != null;
   }

   @Override
   public void aL_() {
      this.H.accept(null);
   }

   private void F() {
      if (this.N != null) {
         this.H.accept(this.N);
      }
   }

   private void G() {
      if (this.N != null && !this.N.g.isBlank()) {
         fyn.a(this, this.N.g);
      }
   }

   private void H() {
      if (this.N != null && !this.N.e.isBlank()) {
         fyn.a(this, this.N.e);
      }
   }

   private void a(final fni $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            fni $$0 = $$0;
            flq $$1 = flq.a();

            while ($$0 != null) {
               Either<fni, Exception> $$2 = fop.this.a($$0, $$1);
               $$0 = fop.this.m.a(() -> {
                  if ($$2.right().isPresent()) {
                     fop.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (fop.this.I.b()) {
                        fop.this.Q = fph.a(hly.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     fni $$1x = (fni)$$2.left().get();

                     for (fnh $$2x : $$1x.a) {
                        fop.this.I.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (fop.this.I.b()) {
                           String $$3 = hly.a("mco.template.select.none", "%link");
                           fph.b $$4 = fph.b.a(hly.a("mco.template.select.none.linkTitle"), ayt.t.toString());
                           fop.this.Q = fph.a($$3, $$4);
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

   Either<fni, Exception> a(fni $$0, flq $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.J));
      } catch (fnm var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.O = null;
      if (this.Q != null) {
         this.a($$0, $$1, $$2, this.Q);
      }

      if (this.P != null) {
         for (int $$4 = 0; $$4 < this.P.length; $$4++) {
            xg $$5 = this.P[$$4];
            $$0.a(this.p, $$5, this.n / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(ftk $$0, int $$1, int $$2, List<fph.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         fph.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.p.b($$0x.a())).sum();
         int $$8 = this.n / 2 - $$7 / 2;

         for (fph.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.p, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(xg.b($$9.c()));
               this.O = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int I() {
      return this.P != null ? g(1) : 33;
   }

   class a extends fuu.a<fop.a> {
      private static final fvl c = new fvl(alr.b("icon/link"), alr.b("icon/link_highlighted"));
      private static final fvl d = new fvl(alr.b("icon/video_link"), alr.b("icon/video_link_highlighted"));
      private static final xg e = xg.c("mco.template.info.tooltip");
      private static final xg f = xg.c("mco.template.trailer.tooltip");
      public final fnh a;
      private long g;
      @Nullable
      private fuk h;
      @Nullable
      private fuk i;

      public a(final fnh $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new fuk(15, 15, c, fyn.b(fop.this, $$0.e), e);
            this.h.a(fvj.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new fuk(15, 15, d, fyn.b(fop.this, $$0.g), f);
            this.i.a(fvj.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fop.this.N = this.a;
         fop.this.E();
         if (ag.c() - this.g < 250L && this.aJ_()) {
            fop.this.H.accept(this.a);
         }

         this.g = ag.c();
         if (this.h != null) {
            this.h.a($$0, $$1, $$2);
         }

         if (this.i != null) {
            this.i.a($$0, $$1, $$2);
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gry::H, fpf.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(gry::H, fop.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = fop.this.p.b(this.a.c);
         if (this.h != null) {
            this.h.c($$3 + $$4 - $$11 - this.h.A() - 10, $$2);
            this.h.a($$0, $$6, $$7, $$9);
         }

         if (this.i != null) {
            this.i.c($$3 + $$4 - $$11 - this.i.A() * 2 - 15, $$2);
            this.i.a($$0, $$6, $$7, $$9);
         }

         int $$12 = $$3 + 45 + 20;
         int $$13 = $$2 + 5;
         $$0.b(fop.this.p, this.a.b, $$12, $$13, -1);
         $$0.b(fop.this.p, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644);
         $$0.b(fop.this.p, this.a.d, $$12, $$13 + 9 + 5, -6250336);
         if (!this.a.h.isBlank()) {
            $$0.b(fop.this.p, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268);
         }
      }

      @Override
      public xg a() {
         xg $$0 = xf.b(
            xg.b(this.a.b), xg.a("mco.template.select.narrate.authors", this.a.d), xg.b(this.a.h), xg.a("mco.template.select.narrate.version", this.a.c)
         );
         return xg.a("narrator.select", $$0);
      }
   }

   class b extends fuu<fop.a> {
      public b(final fop param1) {
         this(var1, Collections.emptyList());
      }

      public b(final Iterable<fnh> param1, final Iterable $$0) {
         super(fqq.Q(), var1.n, var1.o - 33 - var1.I(), var1.I(), 46);
         this.a = var1;
         $$0.forEach(this::a);
      }

      public void a(fnh $$0) {
         this.b(this.a.new a($$0));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.a.O != null) {
            fyn.a(this.a, this.a.O);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable fop.a $$0) {
         super.a($$0);
         this.a.N = $$0 == null ? null : $$0.a;
         this.a.E();
      }

      @Override
      public int a() {
         return 300;
      }

      public boolean b() {
         return this.t() == 0;
      }

      public List<fnh> c() {
         return this.aE_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
