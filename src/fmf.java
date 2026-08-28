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

public class fmf extends hol {
   static final Logger a = LogUtils.getLogger();
   static final ale b = ale.b("widget/slot_frame");
   private static final ww c = ww.c("mco.template.button.select");
   private static final ww C = ww.c("mco.template.button.trailer");
   private static final ww D = ww.c("mco.template.button.publisher");
   private static final int E = 100;
   private static final int F = 10;
   private final fve G = new fve(this);
   final Consumer<fkx> H;
   fmf.b I;
   private final fkh.d J;
   private frq K;
   private frq L;
   private frq M;
   @Nullable
   fkx N = null;
   @Nullable
   String O;
   @Nullable
   private ww[] P;
   @Nullable
   List<fmw.a> Q;

   public fmf(ww $$0, Consumer<fkx> $$1, fkh.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public fmf(ww $$0, Consumer<fkx> $$1, fkh.d $$2, @Nullable fky $$3) {
      super($$0);
      this.H = $$1;
      this.J = $$2;
      if ($$3 == null) {
         this.I = new fmf.b(this);
         this.a(new fky(10));
      } else {
         this.I = new fmf.b(this, Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(ww... $$0) {
      this.P = $$0;
   }

   @Override
   public void aN_() {
      this.G.a(this.l, this.p);
      this.I = this.G.c(new fmf.b(this, this.I.c()));
      fvi $$0 = this.G.b(fvi.e().a(10));
      $$0.c().b();
      this.L = $$0.a(frq.a(C, $$0x -> this.G()).a(100).a());
      this.K = $$0.a(frq.a(c, $$0x -> this.F()).a(100).a());
      $$0.a(frq.a(wv.e, $$0x -> this.aK_()).a(100).a());
      this.M = $$0.a(frq.a(D, $$0x -> this.H()).a(100).a());
      this.E();
      this.G.a($$1 -> {
         fro var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.I.b(this.n, this.o - this.G.b() - this.I());
      this.G.a();
   }

   @Override
   public ww i() {
      List<ww> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.l);
      if (this.P != null) {
         $$0.addAll(Arrays.asList(this.P));
      }

      return wv.a($$0);
   }

   void E() {
      this.M.k = this.N != null && !this.N.e.isEmpty();
      this.L.k = this.N != null && !this.N.g.isEmpty();
      this.K.j = this.N != null;
   }

   @Override
   public void aK_() {
      this.H.accept(null);
   }

   private void F() {
      if (this.N != null) {
         this.H.accept(this.N);
      }
   }

   private void G() {
      if (this.N != null && !this.N.g.isBlank()) {
         fwf.a(this, this.N.g);
      }
   }

   private void H() {
      if (this.N != null && !this.N.e.isBlank()) {
         fwf.a(this, this.N.e);
      }
   }

   private void a(final fky $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            fky $$0 = $$0;
            fjg $$1 = fjg.a();

            while ($$0 != null) {
               Either<fky, Exception> $$2 = fmf.this.a($$0, $$1);
               $$0 = fmf.this.m.a(() -> {
                  if ($$2.right().isPresent()) {
                     fmf.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (fmf.this.I.b()) {
                        fmf.this.Q = fmw.a(hjg.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     fky $$1x = (fky)$$2.left().get();

                     for (fkx $$2x : $$1x.a) {
                        fmf.this.I.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (fmf.this.I.b()) {
                           String $$3 = hjg.a("mco.template.select.none", "%link");
                           fmw.b $$4 = fmw.b.a(hjg.a("mco.template.select.none.linkTitle"), ayf.t.toString());
                           fmf.this.Q = fmw.a($$3, $$4);
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

   Either<fky, Exception> a(fky $$0, fjg $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.J));
      } catch (flc var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.O = null;
      if (this.Q != null) {
         this.a($$0, $$1, $$2, this.Q);
      }

      if (this.P != null) {
         for (int $$4 = 0; $$4 < this.P.length; $$4++) {
            ww $$5 = this.P[$$4];
            $$0.a(this.p, $$5, this.n / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(frc $$0, int $$1, int $$2, List<fmw.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         fmw.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.p.b($$0x.a())).sum();
         int $$8 = this.n / 2 - $$7 / 2;

         for (fmw.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.p, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(ww.b($$9.c()));
               this.O = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int I() {
      return this.P != null ? g(1) : 33;
   }

   class a extends fsm.a<fmf.a> {
      private static final ftd c = new ftd(ale.b("icon/link"), ale.b("icon/link_highlighted"));
      private static final ftd d = new ftd(ale.b("icon/video_link"), ale.b("icon/video_link_highlighted"));
      private static final ww e = ww.c("mco.template.info.tooltip");
      private static final ww f = ww.c("mco.template.trailer.tooltip");
      public final fkx a;
      private long g;
      @Nullable
      private fsc h;
      @Nullable
      private fsc i;

      public a(final fkx $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new fsc(15, 15, c, fwf.b(fmf.this, $$0.e), e);
            this.h.a(ftb.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new fsc(15, 15, d, fwf.b(fmf.this, $$0.g), f);
            this.i.a(ftb.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fmf.this.N = this.a;
         fmf.this.E();
         if (af.c() - this.g < 250L && this.aI_()) {
            fmf.this.H.accept(this.a);
         }

         this.g = af.c();
         if (this.h != null) {
            this.h.a($$0, $$1, $$2);
         }

         if (this.i != null) {
            this.i.a($$0, $$1, $$2);
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gpn::H, fmu.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(gpn::H, fmf.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = fmf.this.p.b(this.a.c);
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
         $$0.b(fmf.this.p, this.a.b, $$12, $$13, -1);
         $$0.b(fmf.this.p, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644);
         $$0.b(fmf.this.p, this.a.d, $$12, $$13 + 9 + 5, -6250336);
         if (!this.a.h.isBlank()) {
            $$0.b(fmf.this.p, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268);
         }
      }

      @Override
      public ww a() {
         ww $$0 = wv.b(
            ww.b(this.a.b), ww.a("mco.template.select.narrate.authors", this.a.d), ww.b(this.a.h), ww.a("mco.template.select.narrate.version", this.a.c)
         );
         return ww.a("narrator.select", $$0);
      }
   }

   class b extends fsm<fmf.a> {
      public b(final fmf param1) {
         this(var1, Collections.emptyList());
      }

      public b(final Iterable<fkx> param1, final Iterable $$0) {
         super(fof.Q(), var1.n, var1.o - 33 - var1.I(), var1.I(), 46);
         this.a = var1;
         $$0.forEach(this::a);
      }

      public void a(fkx $$0) {
         this.b(this.a.new a($$0));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.a.O != null) {
            fwf.a(this.a, this.a.O);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable fmf.a $$0) {
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

      public List<fkx> c() {
         return this.aD_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
