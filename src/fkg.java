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

public class fkg extends hhv {
   static final Logger a = LogUtils.getLogger();
   static final alz b = alz.b("widget/slot_frame");
   private static final xv c = xv.c("mco.template.button.select");
   private static final xv C = xv.c("mco.template.button.trailer");
   private static final xv D = xv.c("mco.template.button.publisher");
   private static final int E = 100;
   private static final int F = 10;
   private final frt G = new frt(this);
   final Consumer<fiy> H;
   fkg.b I;
   private final fii.d J;
   private foe K;
   private foe L;
   private foe M;
   @Nullable
   fiy N = null;
   @Nullable
   String O;
   @Nullable
   private xv[] P;
   @Nullable
   List<fkx.a> Q;

   public fkg(xv $$0, Consumer<fiy> $$1, fii.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public fkg(xv $$0, Consumer<fiy> $$1, fii.d $$2, @Nullable fiz $$3) {
      super($$0);
      this.H = $$1;
      this.J = $$2;
      if ($$3 == null) {
         this.I = new fkg.b(this);
         this.a(new fiz(10));
      } else {
         this.I = new fkg.b(this, Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(xv... $$0) {
      this.P = $$0;
   }

   @Override
   public void aT_() {
      this.G.a(this.l, this.p);
      this.I = this.G.c(new fkg.b(this, this.I.c()));
      frx $$0 = this.G.b(frx.e().a(10));
      $$0.c().b();
      this.L = $$0.a(foe.a(C, $$0x -> this.G()).a(100).a());
      this.K = $$0.a(foe.a(c, $$0x -> this.F()).a(100).a());
      $$0.a(foe.a(xu.e, $$0x -> this.aP_()).a(100).a());
      this.M = $$0.a(foe.a(D, $$0x -> this.J()).a(100).a());
      this.E();
      this.G.a($$1 -> {
         foc var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.I.b(this.n, this.o - this.G.b() - this.K());
      this.G.a();
   }

   @Override
   public xv i() {
      List<xv> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.l);
      if (this.P != null) {
         $$0.addAll(Arrays.asList(this.P));
      }

      return xu.a($$0);
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
         fsu.a(this, this.N.g);
      }
   }

   private void J() {
      if (this.N != null && !this.N.e.isBlank()) {
         fsu.a(this, this.N.e);
      }
   }

   private void a(final fiz $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            fiz $$0 = $$0;
            fhh $$1 = fhh.a();

            while ($$0 != null) {
               Either<fiz, Exception> $$2 = fkg.this.a($$0, $$1);
               $$0 = fkg.this.m.a(() -> {
                  if ($$2.right().isPresent()) {
                     fkg.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (fkg.this.I.b()) {
                        fkg.this.Q = fkx.a(hcr.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     fiz $$1x = (fiz)$$2.left().get();

                     for (fiy $$2x : $$1x.a) {
                        fkg.this.I.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (fkg.this.I.b()) {
                           String $$3 = hcr.a("mco.template.select.none", "%link");
                           fkx.b $$4 = fkx.b.a(hcr.a("mco.template.select.none.linkTitle"), aza.t.toString());
                           fkg.this.Q = fkx.a($$3, $$4);
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

   Either<fiz, Exception> a(fiz $$0, fhh $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.J));
      } catch (fjd var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(fnr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.O = null;
      if (this.Q != null) {
         this.a($$0, $$1, $$2, this.Q);
      }

      if (this.P != null) {
         for (int $$4 = 0; $$4 < this.P.length; $$4++) {
            xv $$5 = this.P[$$4];
            $$0.a(this.p, $$5, this.n / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(fnr $$0, int $$1, int $$2, List<fkx.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         fkx.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.p.b($$0x.a())).sum();
         int $$8 = this.n / 2 - $$7 / 2;

         for (fkx.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.p, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(xv.b($$9.c()));
               this.O = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int K() {
      return this.P != null ? g(1) : 33;
   }

   class a extends fpb.a<fkg.a> {
      private static final fps c = new fps(alz.b("icon/link"), alz.b("icon/link_highlighted"));
      private static final fps d = new fps(alz.b("icon/video_link"), alz.b("icon/video_link_highlighted"));
      private static final xv e = xv.c("mco.template.info.tooltip");
      private static final xv f = xv.c("mco.template.trailer.tooltip");
      public final fiy a;
      private long g;
      @Nullable
      private foq h;
      @Nullable
      private foq i;

      public a(final fiy $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new foq(15, 15, c, fsu.b(fkg.this, $$0.e), e);
            this.h.a(fpq.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new foq(15, 15, d, fsu.b(fkg.this, $$0.g), f);
            this.i.a(fpq.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fkg.this.N = this.a;
         fkg.this.E();
         if (ae.c() - this.g < 250L && this.aN_()) {
            fkg.this.H.accept(this.a);
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
      public void a(fnr $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(glu::C, fkv.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(glu::C, fkg.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = fkg.this.p.b(this.a.c);
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
         $$0.a(fkg.this.p, this.a.b, $$12, $$13, -1, false);
         $$0.a(fkg.this.p, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(fkg.this.p, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(fkg.this.p, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public xv a() {
         xv $$0 = xu.b(
            xv.b(this.a.b), xv.a("mco.template.select.narrate.authors", this.a.d), xv.b(this.a.h), xv.a("mco.template.select.narrate.version", this.a.c)
         );
         return xv.a("narrator.select", $$0);
      }
   }

   class b extends fpb<fkg.a> {
      public b(final fkg param1) {
         this(var1, Collections.emptyList());
      }

      public b(final Iterable<fiy> param1, final Iterable $$0) {
         super(fmf.Q(), var1.n, var1.o - 33 - var1.K(), var1.K(), 46);
         this.a = var1;
         $$0.forEach(this::a);
      }

      public void a(fiy $$0) {
         this.b(this.a.new a($$0));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.a.O != null) {
            fsu.a(this.a, this.a.O);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable fkg.a $$0) {
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

      public List<fiy> c() {
         return this.aI_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
