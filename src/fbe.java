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

public class fbe extends gtb {
   static final Logger a = LogUtils.getLogger();
   static final akh b = new akh("widget/slot_frame");
   private static final wu c = wu.c("mco.template.button.select");
   private static final wu B = wu.c("mco.template.button.trailer");
   private static final wu C = wu.c("mco.template.button.publisher");
   private static final int D = 100;
   private static final int E = 10;
   private final fir F = new fir(this);
   final Consumer<ezv> G;
   fbe.b H;
   private final eze.d I;
   private ffe J;
   private ffe K;
   private ffe L;
   @Nullable
   ezv M = null;
   @Nullable
   String N;
   @Nullable
   private wu[] O;
   @Nullable
   List<fbv.a> P;

   public fbe(wu $$0, Consumer<ezv> $$1, eze.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public fbe(wu $$0, Consumer<ezv> $$1, eze.d $$2, @Nullable ezw $$3) {
      super($$0);
      this.G = $$1;
      this.I = $$2;
      if ($$3 == null) {
         this.H = new fbe.b();
         this.a(new ezw(10));
      } else {
         this.H = new fbe.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(wu... $$0) {
      this.O = $$0;
   }

   @Override
   public void aM_() {
      this.F.a(this.l, this.p);
      this.H = this.F.c(new fbe.b(this.H.d()));
      fiv $$0 = this.F.b(fiv.e().a(10));
      $$0.c().b();
      this.K = $$0.a(ffe.a(B, $$0x -> this.E()).a(100).a());
      this.J = $$0.a(ffe.a(c, $$0x -> this.D()).a(100).a());
      $$0.a(ffe.a(wt.e, $$0x -> this.d()).a(100).a());
      this.L = $$0.a(ffe.a(C, $$0x -> this.F()).a(100).a());
      this.C();
      this.F.a($$1 -> {
         ffc var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.H.b(this.n, this.o - this.F.b() - this.I());
      this.F.a();
   }

   @Override
   public wu i() {
      List<wu> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.l);
      if (this.O != null) {
         $$0.addAll(Arrays.asList(this.O));
      }

      return wt.a($$0);
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
         fju.a(this, this.M.g);
      }
   }

   private void F() {
      if (this.M != null && !this.M.e.isBlank()) {
         fju.a(this, this.M.e);
      }
   }

   private void a(final ezw $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            ezw $$0 = $$0;
            eyn $$1 = eyn.a();

            while ($$0 != null) {
               Either<ezw, Exception> $$2 = fbe.this.a($$0, $$1);
               $$0 = fbe.this.m.a(() -> {
                  if ($$2.right().isPresent()) {
                     fbe.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (fbe.this.H.c()) {
                        fbe.this.P = fbv.a(goe.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     ezw $$1x = (ezw)$$2.left().get();

                     for (ezv $$2x : $$1x.a) {
                        fbe.this.H.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (fbe.this.H.c()) {
                           String $$3 = goe.a("mco.template.select.none", "%link");
                           fbv.b $$4 = fbv.b.a(goe.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           fbe.this.P = fbv.a($$3, $$4);
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

   Either<ezw, Exception> a(ezw $$0, eyn $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.I));
      } catch (faa var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.N = null;
      if (this.P != null) {
         this.a($$0, $$1, $$2, this.P);
      }

      if (this.O != null) {
         for (int $$4 = 0; $$4 < this.O.length; $$4++) {
            wu $$5 = this.O[$$4];
            $$0.a(this.p, $$5, this.n / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(fer $$0, int $$1, int $$2, List<fbv.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         fbv.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.p.b($$0x.a())).sum();
         int $$8 = this.n / 2 - $$7 / 2;

         for (fbv.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.p, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(wu.b($$9.c()));
               this.N = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int I() {
      return this.O != null ? g(1) : 33;
   }

   class a extends fga.a<fbe.a> {
      private static final fgr c = new fgr(new akh("icon/link"), new akh("icon/link_highlighted"));
      private static final fgr d = new fgr(new akh("icon/video_link"), new akh("icon/video_link_highlighted"));
      private static final wu e = wu.c("mco.template.info.tooltip");
      private static final wu f = wu.c("mco.template.trailer.tooltip");
      public final ezv a;
      private long g;
      @Nullable
      private ffq h;
      @Nullable
      private ffq i;

      public a(ezv $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new ffq(15, 15, c, fju.b(fbe.this, $$0.e), e);
            this.h.a(fgp.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new ffq(15, 15, d, fju.b(fbe.this, $$0.g), f);
            this.i.a(fgp.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fbe.this.M = this.a;
         fbe.this.C();
         if (ac.b() - this.g < 250L && this.aI_()) {
            fbe.this.G.accept(this.a);
         }

         this.g = ac.b();
         if (this.h != null) {
            this.h.a($$0, $$1, $$2);
         }

         if (this.i != null) {
            this.i.a($$0, $$1, $$2);
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fbt.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(fbe.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = fbe.this.p.b(this.a.c);
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
         $$0.a(fbe.this.p, this.a.b, $$12, $$13, -1, false);
         $$0.a(fbe.this.p, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(fbe.this.p, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(fbe.this.p, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
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

   class b extends gta<fbe.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<ezv> $$0) {
         super(fbe.this.n, fbe.this.o - 33 - fbe.this.I(), fbe.this.I(), 46);
         $$0.forEach(this::a);
      }

      public void a(ezv $$0) {
         this.a((fbe.a)(fbe.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (fbe.this.N != null) {
            fju.a(fbe.this, fbe.this.N);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable fbe.a $$0) {
         super.a($$0);
         fbe.this.M = $$0 == null ? null : $$0.a;
         fbe.this.C();
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

      public List<ezv> d() {
         return this.aE_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
