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

public class fkf extends hhu {
   static final Logger a = LogUtils.getLogger();
   static final alz b = alz.b("widget/slot_frame");
   private static final xv c = xv.c("mco.template.button.select");
   private static final xv C = xv.c("mco.template.button.trailer");
   private static final xv D = xv.c("mco.template.button.publisher");
   private static final int E = 100;
   private static final int F = 10;
   private final frs G = new frs(this);
   final Consumer<fix> H;
   fkf.b I;
   private final fih.d J;
   private fod K;
   private fod L;
   private fod M;
   @Nullable
   fix N = null;
   @Nullable
   String O;
   @Nullable
   private xv[] P;
   @Nullable
   List<fkw.a> Q;

   public fkf(xv $$0, Consumer<fix> $$1, fih.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public fkf(xv $$0, Consumer<fix> $$1, fih.d $$2, @Nullable fiy $$3) {
      super($$0);
      this.H = $$1;
      this.J = $$2;
      if ($$3 == null) {
         this.I = new fkf.b(this);
         this.a(new fiy(10));
      } else {
         this.I = new fkf.b(this, Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(xv... $$0) {
      this.P = $$0;
   }

   @Override
   public void aT_() {
      this.G.a(this.l, this.p);
      this.I = this.G.c(new fkf.b(this, this.I.c()));
      frw $$0 = this.G.b(frw.e().a(10));
      $$0.c().b();
      this.L = $$0.a(fod.a(C, $$0x -> this.G()).a(100).a());
      this.K = $$0.a(fod.a(c, $$0x -> this.F()).a(100).a());
      $$0.a(fod.a(xu.e, $$0x -> this.aP_()).a(100).a());
      this.M = $$0.a(fod.a(D, $$0x -> this.J()).a(100).a());
      this.E();
      this.G.a($$1 -> {
         fob var10000 = this.c($$1);
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
         fst.a(this, this.N.g);
      }
   }

   private void J() {
      if (this.N != null && !this.N.e.isBlank()) {
         fst.a(this, this.N.e);
      }
   }

   private void a(final fiy $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            fiy $$0 = $$0;
            fhg $$1 = fhg.a();

            while ($$0 != null) {
               Either<fiy, Exception> $$2 = fkf.this.a($$0, $$1);
               $$0 = fkf.this.m.a(() -> {
                  if ($$2.right().isPresent()) {
                     fkf.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (fkf.this.I.b()) {
                        fkf.this.Q = fkw.a(hcq.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     fiy $$1x = (fiy)$$2.left().get();

                     for (fix $$2x : $$1x.a) {
                        fkf.this.I.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (fkf.this.I.b()) {
                           String $$3 = hcq.a("mco.template.select.none", "%link");
                           fkw.b $$4 = fkw.b.a(hcq.a("mco.template.select.none.linkTitle"), aza.t.toString());
                           fkf.this.Q = fkw.a($$3, $$4);
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

   Either<fiy, Exception> a(fiy $$0, fhg $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.J));
      } catch (fjc var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(fnq $$0, int $$1, int $$2, float $$3) {
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

   private void a(fnq $$0, int $$1, int $$2, List<fkw.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         fkw.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.p.b($$0x.a())).sum();
         int $$8 = this.n / 2 - $$7 / 2;

         for (fkw.b $$9 : $$5.a) {
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

   class a extends fpa.a<fkf.a> {
      private static final fpr c = new fpr(alz.b("icon/link"), alz.b("icon/link_highlighted"));
      private static final fpr d = new fpr(alz.b("icon/video_link"), alz.b("icon/video_link_highlighted"));
      private static final xv e = xv.c("mco.template.info.tooltip");
      private static final xv f = xv.c("mco.template.trailer.tooltip");
      public final fix a;
      private long g;
      @Nullable
      private fop h;
      @Nullable
      private fop i;

      public a(final fix $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new fop(15, 15, c, fst.b(fkf.this, $$0.e), e);
            this.h.a(fpp.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new fop(15, 15, d, fst.b(fkf.this, $$0.g), f);
            this.i.a(fpp.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fkf.this.N = this.a;
         fkf.this.E();
         if (ae.c() - this.g < 250L && this.aN_()) {
            fkf.this.H.accept(this.a);
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
      public void a(fnq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(glt::B, fku.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(glt::B, fkf.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = fkf.this.p.b(this.a.c);
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
         $$0.a(fkf.this.p, this.a.b, $$12, $$13, -1, false);
         $$0.a(fkf.this.p, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(fkf.this.p, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(fkf.this.p, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
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

   class b extends fpa<fkf.a> {
      public b(final fkf param1) {
         this(var1, Collections.emptyList());
      }

      public b(final Iterable<fix> param1, final Iterable $$0) {
         super(fme.Q(), var1.n, var1.o - 33 - var1.K(), var1.K(), 46);
         this.a = var1;
         $$0.forEach(this::a);
      }

      public void a(fix $$0) {
         this.b(this.a.new a($$0));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.a.O != null) {
            fst.a(this.a, this.a.O);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable fkf.a $$0) {
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

      public List<fix> c() {
         return this.aI_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
