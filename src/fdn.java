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

public class fdn extends gvm {
   static final Logger a = LogUtils.getLogger();
   static final akk b = new akk("widget/slot_frame");
   private static final wu c = wu.c("mco.template.button.select");
   private static final wu A = wu.c("mco.template.button.trailer");
   private static final wu B = wu.c("mco.template.button.publisher");
   private static final int C = 100;
   private static final int D = 10;
   private final fkz E = new fkz(this);
   final Consumer<fce> F;
   fdn.b G;
   private final fbn.d H;
   private fhm I;
   private fhm J;
   private fhm K;
   @Nullable
   fce L = null;
   @Nullable
   String M;
   @Nullable
   private wu[] N;
   @Nullable
   List<fee.a> O;

   public fdn(wu $$0, Consumer<fce> $$1, fbn.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public fdn(wu $$0, Consumer<fce> $$1, fbn.d $$2, @Nullable fcf $$3) {
      super($$0);
      this.F = $$1;
      this.H = $$2;
      if ($$3 == null) {
         this.G = new fdn.b(this);
         this.a(new fcf(10));
      } else {
         this.G = new fdn.b(this, Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(wu... $$0) {
      this.N = $$0;
   }

   @Override
   public void aO_() {
      this.E.a(this.k, this.o);
      this.G = this.E.c(new fdn.b(this, this.G.d()));
      fld $$0 = this.E.b(fld.e().a(10));
      $$0.c().b();
      this.J = $$0.a(fhm.a(A, $$0x -> this.G()).a(100).a());
      this.I = $$0.a(fhm.a(c, $$0x -> this.F()).a(100).a());
      $$0.a(fhm.a(wt.e, $$0x -> this.d()).a(100).a());
      this.K = $$0.a(fhm.a(B, $$0x -> this.J()).a(100).a());
      this.E();
      this.E.a($$1 -> {
         fhk var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.G.b(this.m, this.n - this.E.b() - this.K());
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

   void E() {
      this.K.k = this.L != null && !this.L.e.isEmpty();
      this.J.k = this.L != null && !this.L.g.isEmpty();
      this.I.j = this.L != null;
   }

   @Override
   public void d() {
      this.F.accept(null);
   }

   private void F() {
      if (this.L != null) {
         this.F.accept(this.L);
      }
   }

   private void G() {
      if (this.L != null && !this.L.g.isBlank()) {
         fma.a(this, this.L.g);
      }
   }

   private void J() {
      if (this.L != null && !this.L.e.isBlank()) {
         fma.a(this, this.L.e);
      }
   }

   private void a(final fcf $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            fcf $$0 = $$0;
            faw $$1 = faw.a();

            while ($$0 != null) {
               Either<fcf, Exception> $$2 = fdn.this.a($$0, $$1);
               $$0 = fdn.this.l.a(() -> {
                  if ($$2.right().isPresent()) {
                     fdn.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (fdn.this.G.c()) {
                        fdn.this.O = fee.a(gqo.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     fcf $$1x = (fcf)$$2.left().get();

                     for (fce $$2x : $$1x.a) {
                        fdn.this.G.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (fdn.this.G.c()) {
                           String $$3 = gqo.a("mco.template.select.none", "%link");
                           fee.b $$4 = fee.b.a(gqo.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           fdn.this.O = fee.a($$3, $$4);
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

   Either<fcf, Exception> a(fcf $$0, faw $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.H));
      } catch (fcj var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
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

   private void a(fgz $$0, int $$1, int $$2, List<fee.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         fee.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.o.b($$0x.a())).sum();
         int $$8 = this.m / 2 - $$7 / 2;

         for (fee.b $$9 : $$5.a) {
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

   int K() {
      return this.N != null ? g(1) : 33;
   }

   class a extends fii.a<fdn.a> {
      private static final fiz c = new fiz(new akk("icon/link"), new akk("icon/link_highlighted"));
      private static final fiz d = new fiz(new akk("icon/video_link"), new akk("icon/video_link_highlighted"));
      private static final wu e = wu.c("mco.template.info.tooltip");
      private static final wu f = wu.c("mco.template.trailer.tooltip");
      public final fce a;
      private long g;
      @Nullable
      private fhy h;
      @Nullable
      private fhy i;

      public a(final fce $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new fhy(15, 15, c, fma.b(fdn.this, $$0.e), e);
            this.h.a(fix.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new fhy(15, 15, d, fma.b(fdn.this, $$0.g), f);
            this.i.a(fix.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fdn.this.L = this.a;
         fdn.this.E();
         if (ac.c() - this.g < 250L && this.aJ_()) {
            fdn.this.F.accept(this.a);
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
      public void a(fgz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fec.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(fdn.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = fdn.this.o.b(this.a.c);
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
         $$0.a(fdn.this.o, this.a.b, $$12, $$13, -1, false);
         $$0.a(fdn.this.o, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(fdn.this.o, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(fdn.this.o, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
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

   class b extends gvl<fdn.a> {
      public b(final fdn param1) {
         this(var1, Collections.emptyList());
      }

      public b(final Iterable<fce> param1, final Iterable $$0) {
         super(var1.m, var1.n - 33 - var1.K(), var1.K(), 46);
         this.a = var1;
         $$0.forEach(this::a);
      }

      public void a(fce $$0) {
         this.a((fdn.a)(this.a.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.a.M != null) {
            fma.a(this.a, this.a.M);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable fdn.a $$0) {
         super.a($$0);
         this.a.L = $$0 == null ? null : $$0.a;
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

      public List<fce> d() {
         return this.aF_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
