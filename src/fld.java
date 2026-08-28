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

public class fld extends hne {
   static final Logger a = LogUtils.getLogger();
   static final ald b = ald.b("widget/slot_frame");
   private static final wv c = wv.c("mco.template.button.select");
   private static final wv C = wv.c("mco.template.button.trailer");
   private static final wv D = wv.c("mco.template.button.publisher");
   private static final int E = 100;
   private static final int F = 10;
   private final fub G = new fub(this);
   final Consumer<fjv> H;
   fld.b I;
   private final fjf.d J;
   private fqn K;
   private fqn L;
   private fqn M;
   @Nullable
   fjv N = null;
   @Nullable
   String O;
   @Nullable
   private wv[] P;
   @Nullable
   List<flu.a> Q;

   public fld(wv $$0, Consumer<fjv> $$1, fjf.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public fld(wv $$0, Consumer<fjv> $$1, fjf.d $$2, @Nullable fjw $$3) {
      super($$0);
      this.H = $$1;
      this.J = $$2;
      if ($$3 == null) {
         this.I = new fld.b(this);
         this.a(new fjw(10));
      } else {
         this.I = new fld.b(this, Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(wv... $$0) {
      this.P = $$0;
   }

   @Override
   public void aN_() {
      this.G.a(this.l, this.p);
      this.I = this.G.c(new fld.b(this, this.I.c()));
      fuf $$0 = this.G.b(fuf.e().a(10));
      $$0.c().b();
      this.L = $$0.a(fqn.a(C, $$0x -> this.G()).a(100).a());
      this.K = $$0.a(fqn.a(c, $$0x -> this.F()).a(100).a());
      $$0.a(fqn.a(wu.e, $$0x -> this.aK_()).a(100).a());
      this.M = $$0.a(fqn.a(D, $$0x -> this.H()).a(100).a());
      this.E();
      this.G.a($$1 -> {
         fql var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.I.b(this.n, this.o - this.G.b() - this.I());
      this.G.a();
   }

   @Override
   public wv i() {
      List<wv> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.l);
      if (this.P != null) {
         $$0.addAll(Arrays.asList(this.P));
      }

      return wu.a($$0);
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
         fvc.a(this, this.N.g);
      }
   }

   private void H() {
      if (this.N != null && !this.N.e.isBlank()) {
         fvc.a(this, this.N.e);
      }
   }

   private void a(final fjw $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            fjw $$0 = $$0;
            fie $$1 = fie.a();

            while ($$0 != null) {
               Either<fjw, Exception> $$2 = fld.this.a($$0, $$1);
               $$0 = fld.this.m.a(() -> {
                  if ($$2.right().isPresent()) {
                     fld.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (fld.this.I.b()) {
                        fld.this.Q = flu.a(hia.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     fjw $$1x = (fjw)$$2.left().get();

                     for (fjv $$2x : $$1x.a) {
                        fld.this.I.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (fld.this.I.b()) {
                           String $$3 = hia.a("mco.template.select.none", "%link");
                           flu.b $$4 = flu.b.a(hia.a("mco.template.select.none.linkTitle"), ayf.t.toString());
                           fld.this.Q = flu.a($$3, $$4);
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

   Either<fjw, Exception> a(fjw $$0, fie $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.J));
      } catch (fka var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.O = null;
      if (this.Q != null) {
         this.a($$0, $$1, $$2, this.Q);
      }

      if (this.P != null) {
         for (int $$4 = 0; $$4 < this.P.length; $$4++) {
            wv $$5 = this.P[$$4];
            $$0.a(this.p, $$5, this.n / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(fpz $$0, int $$1, int $$2, List<flu.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         flu.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.p.b($$0x.a())).sum();
         int $$8 = this.n / 2 - $$7 / 2;

         for (flu.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.p, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(wv.b($$9.c()));
               this.O = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int I() {
      return this.P != null ? g(1) : 33;
   }

   class a extends frj.a<fld.a> {
      private static final fsa c = new fsa(ald.b("icon/link"), ald.b("icon/link_highlighted"));
      private static final fsa d = new fsa(ald.b("icon/video_link"), ald.b("icon/video_link_highlighted"));
      private static final wv e = wv.c("mco.template.info.tooltip");
      private static final wv f = wv.c("mco.template.trailer.tooltip");
      public final fjv a;
      private long g;
      @Nullable
      private fqz h;
      @Nullable
      private fqz i;

      public a(final fjv $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new fqz(15, 15, c, fvc.b(fld.this, $$0.e), e);
            this.h.a(fry.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new fqz(15, 15, d, fvc.b(fld.this, $$0.g), f);
            this.i.a(fry.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fld.this.N = this.a;
         fld.this.E();
         if (af.c() - this.g < 250L && this.aI_()) {
            fld.this.H.accept(this.a);
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
      public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(goi::H, fls.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(goi::H, fld.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = fld.this.p.b(this.a.c);
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
         $$0.b(fld.this.p, this.a.b, $$12, $$13, -1);
         $$0.b(fld.this.p, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644);
         $$0.b(fld.this.p, this.a.d, $$12, $$13 + 9 + 5, -6250336);
         if (!this.a.h.isBlank()) {
            $$0.b(fld.this.p, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268);
         }
      }

      @Override
      public wv a() {
         wv $$0 = wu.b(
            wv.b(this.a.b), wv.a("mco.template.select.narrate.authors", this.a.d), wv.b(this.a.h), wv.a("mco.template.select.narrate.version", this.a.c)
         );
         return wv.a("narrator.select", $$0);
      }
   }

   class b extends frj<fld.a> {
      public b(final fld param1) {
         this(var1, Collections.emptyList());
      }

      public b(final Iterable<fjv> param1, final Iterable $$0) {
         super(fnd.Q(), var1.n, var1.o - 33 - var1.I(), var1.I(), 46);
         this.a = var1;
         $$0.forEach(this::a);
      }

      public void a(fjv $$0) {
         this.b(this.a.new a($$0));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.a.O != null) {
            fvc.a(this.a, this.a.O);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable fld.a $$0) {
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

      public List<fjv> c() {
         return this.aD_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
