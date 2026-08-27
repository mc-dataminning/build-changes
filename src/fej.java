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

public class fej extends gxb {
   static final Logger a = LogUtils.getLogger();
   static final akt b = new akt("widget/slot_frame");
   private static final xe c = xe.c("mco.template.button.select");
   private static final xe B = xe.c("mco.template.button.trailer");
   private static final xe C = xe.c("mco.template.button.publisher");
   private static final int D = 100;
   private static final int E = 10;
   private final fma F = new fma(this);
   final Consumer<fda> G;
   fej.b H;
   private final fcj.d I;
   private fin J;
   private fin K;
   private fin L;
   @Nullable
   fda M = null;
   @Nullable
   String N;
   @Nullable
   private xe[] O;
   @Nullable
   List<ffa.a> P;

   public fej(xe $$0, Consumer<fda> $$1, fcj.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public fej(xe $$0, Consumer<fda> $$1, fcj.d $$2, @Nullable fdb $$3) {
      super($$0);
      this.G = $$1;
      this.I = $$2;
      if ($$3 == null) {
         this.H = new fej.b();
         this.a(new fdb(10));
      } else {
         this.H = new fej.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(xe... $$0) {
      this.O = $$0;
   }

   @Override
   public void aN_() {
      this.F.a(this.l, this.p);
      this.H = this.F.c(new fej.b(this.H.d()));
      fme $$0 = this.F.b(fme.e().a(10));
      $$0.c().b();
      this.K = $$0.a(fin.a(B, $$0x -> this.E()).a(100).a());
      this.J = $$0.a(fin.a(c, $$0x -> this.D()).a(100).a());
      $$0.a(fin.a(xd.e, $$0x -> this.d()).a(100).a());
      this.L = $$0.a(fin.a(C, $$0x -> this.F()).a(100).a());
      this.C();
      this.F.a($$1 -> {
         fil var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.H.b(this.n, this.o - this.F.b() - this.I());
      this.F.a();
   }

   @Override
   public xe i() {
      List<xe> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.l);
      if (this.O != null) {
         $$0.addAll(Arrays.asList(this.O));
      }

      return xd.a($$0);
   }

   void C() {
      this.L.k = this.M != null && !this.M.e.isEmpty();
      this.K.k = this.M != null && !this.M.g.isEmpty();
      this.J.j = this.M != null;
   }

   @Override
   public void d() {
      this.G.accept(null);
   }

   private void D() {
      if (this.M != null) {
         this.G.accept(this.M);
      }
   }

   private void E() {
      if (this.M != null && !this.M.g.isBlank()) {
         fnd.a(this, this.M.g);
      }
   }

   private void F() {
      if (this.M != null && !this.M.e.isBlank()) {
         fnd.a(this, this.M.e);
      }
   }

   private void a(final fdb $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            fdb $$0 = $$0;
            fbs $$1 = fbs.a();

            while ($$0 != null) {
               Either<fdb, Exception> $$2 = fej.this.a($$0, $$1);
               $$0 = fej.this.m.a(() -> {
                  if ($$2.right().isPresent()) {
                     fej.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (fej.this.H.c()) {
                        fej.this.P = ffa.a(gse.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     fdb $$1x = (fdb)$$2.left().get();

                     for (fda $$2x : $$1x.a) {
                        fej.this.H.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (fej.this.H.c()) {
                           String $$3 = gse.a("mco.template.select.none", "%link");
                           ffa.b $$4 = ffa.b.a(gse.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           fej.this.P = ffa.a($$3, $$4);
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

   Either<fdb, Exception> a(fdb $$0, fbs $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.I));
      } catch (fdf var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.N = null;
      if (this.P != null) {
         this.a($$0, $$1, $$2, this.P);
      }

      if (this.O != null) {
         for (int $$4 = 0; $$4 < this.O.length; $$4++) {
            xe $$5 = this.O[$$4];
            $$0.a(this.p, $$5, this.n / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(fia $$0, int $$1, int $$2, List<ffa.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         ffa.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.p.b($$0x.a())).sum();
         int $$8 = this.n / 2 - $$7 / 2;

         for (ffa.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.p, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(xe.b($$9.c()));
               this.N = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int I() {
      return this.O != null ? g(1) : 33;
   }

   class a extends fjj.a<fej.a> {
      private static final fka c = new fka(new akt("icon/link"), new akt("icon/link_highlighted"));
      private static final fka d = new fka(new akt("icon/video_link"), new akt("icon/video_link_highlighted"));
      private static final xe e = xe.c("mco.template.info.tooltip");
      private static final xe f = xe.c("mco.template.trailer.tooltip");
      public final fda a;
      private long g;
      @Nullable
      private fiz h;
      @Nullable
      private fiz i;

      public a(fda $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new fiz(15, 15, c, fnd.b(fej.this, $$0.e), e);
            this.h.a(fjy.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new fiz(15, 15, d, fnd.b(fej.this, $$0.g), f);
            this.i.a(fjy.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fej.this.M = this.a;
         fej.this.C();
         if (ad.b() - this.g < 250L && this.aI_()) {
            fej.this.G.accept(this.a);
         }

         this.g = ad.b();
         if (this.h != null) {
            this.h.a($$0, $$1, $$2);
         }

         if (this.i != null) {
            this.i.a($$0, $$1, $$2);
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fey.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(fej.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = fej.this.p.b(this.a.c);
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
         $$0.a(fej.this.p, this.a.b, $$12, $$13, -1, false);
         $$0.a(fej.this.p, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(fej.this.p, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(fej.this.p, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public xe a() {
         xe $$0 = xd.b(
            xe.b(this.a.b), xe.a("mco.template.select.narrate.authors", this.a.d), xe.b(this.a.h), xe.a("mco.template.select.narrate.version", this.a.c)
         );
         return xe.a("narrator.select", $$0);
      }
   }

   class b extends gxa<fej.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<fda> $$0) {
         super(fej.this.n, fej.this.o - 33 - fej.this.I(), fej.this.I(), 46);
         $$0.forEach(this::a);
      }

      public void a(fda $$0) {
         this.a((fej.a)(fej.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (fej.this.N != null) {
            fnd.a(fej.this, fej.this.N);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable fej.a $$0) {
         super.a($$0);
         fej.this.M = $$0 == null ? null : $$0.a;
         fej.this.C();
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

      public List<fda> d() {
         return this.aE_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
