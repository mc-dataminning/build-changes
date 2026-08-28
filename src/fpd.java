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

public class fpd extends hrm {
   static final Logger a = LogUtils.getLogger();
   static final ali b = ali.b("widget/slot_frame");
   private static final xa c = xa.c("mco.template.button.select");
   private static final xa C = xa.c("mco.template.button.trailer");
   private static final xa D = xa.c("mco.template.button.publisher");
   private static final int E = 100;
   private static final int F = 10;
   private final fxz G = new fxz(this);
   final Consumer<fnu> H;
   fpd.b I;
   private final fne.d J;
   private ful K;
   private ful L;
   private ful M;
   @Nullable
   fnu N = null;
   @Nullable
   String O;
   @Nullable
   private xa[] P;
   @Nullable
   List<fpu.a> Q;

   public fpd(xa $$0, Consumer<fnu> $$1, fne.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public fpd(xa $$0, Consumer<fnu> $$1, fne.d $$2, @Nullable fnv $$3) {
      super($$0);
      this.H = $$1;
      this.J = $$2;
      if ($$3 == null) {
         this.I = new fpd.b(this);
         this.a(new fnv(10));
      } else {
         this.I = new fpd.b(this, Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(xa... $$0) {
      this.P = $$0;
   }

   @Override
   public void aS_() {
      this.G.a(this.l, this.p);
      this.I = this.G.c(new fpd.b(this, this.I.c()));
      fyd $$0 = this.G.b(fyd.e().a(10));
      $$0.c().b();
      this.L = $$0.a(ful.a(C, $$0x -> this.G()).a(100).a());
      this.K = $$0.a(ful.a(c, $$0x -> this.F()).a(100).a());
      $$0.a(ful.a(wz.e, $$0x -> this.aP_()).a(100).a());
      this.M = $$0.a(ful.a(D, $$0x -> this.H()).a(100).a());
      this.E();
      this.G.a($$1 -> {
         fuj var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.I.b(this.n, this.o - this.G.b() - this.I());
      this.G.a();
   }

   @Override
   public xa i() {
      List<xa> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.l);
      if (this.P != null) {
         $$0.addAll(Arrays.asList(this.P));
      }

      return wz.a($$0);
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
         fza.a(this, this.N.g);
      }
   }

   private void H() {
      if (this.N != null && !this.N.e.isBlank()) {
         fza.a(this, this.N.e);
      }
   }

   private void a(final fnv $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            fnv $$0 = $$0;
            fmd $$1 = fmd.a();

            while ($$0 != null) {
               Either<fnv, Exception> $$2 = fpd.this.a($$0, $$1);
               $$0 = fpd.this.m.a(() -> {
                  if ($$2.right().isPresent()) {
                     fpd.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (fpd.this.I.b()) {
                        fpd.this.Q = fpu.a(hmi.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     fnv $$1x = (fnv)$$2.left().get();

                     for (fnu $$2x : $$1x.a) {
                        fpd.this.I.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (fpd.this.I.b()) {
                           String $$3 = hmi.a("mco.template.select.none", "%link");
                           fpu.b $$4 = fpu.b.a(hmi.a("mco.template.select.none.linkTitle"), ayj.t.toString());
                           fpd.this.Q = fpu.a($$3, $$4);
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

   Either<fnv, Exception> a(fnv $$0, fmd $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.J));
      } catch (fnz var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.O = null;
      if (this.Q != null) {
         this.a($$0, $$1, $$2, this.Q);
      }

      if (this.P != null) {
         for (int $$4 = 0; $$4 < this.P.length; $$4++) {
            xa $$5 = this.P[$$4];
            $$0.a(this.p, $$5, this.n / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(ftx $$0, int $$1, int $$2, List<fpu.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         fpu.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.p.b($$0x.a())).sum();
         int $$8 = this.n / 2 - $$7 / 2;

         for (fpu.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.p, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(xa.b($$9.c()));
               this.O = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int I() {
      return this.P != null ? g(1) : 33;
   }

   class a extends fvh.a<fpd.a> {
      private static final fvy c = new fvy(ali.b("icon/link"), ali.b("icon/link_highlighted"));
      private static final fvy d = new fvy(ali.b("icon/video_link"), ali.b("icon/video_link_highlighted"));
      private static final xa e = xa.c("mco.template.info.tooltip");
      private static final xa f = xa.c("mco.template.trailer.tooltip");
      public final fnu a;
      private long g;
      @Nullable
      private fux h;
      @Nullable
      private fux i;

      public a(final fnu $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new fux(15, 15, c, fza.b(fpd.this, $$0.e), e);
            this.h.a(fvw.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new fux(15, 15, d, fza.b(fpd.this, $$0.g), f);
            this.i.a(fvw.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fpd.this.N = this.a;
         fpd.this.E();
         if (ag.c() - this.g < 250L && this.aN_()) {
            fpd.this.H.accept(this.a);
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
      public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gsl::H, fps.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(gsl::H, fpd.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = fpd.this.p.b(this.a.c);
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
         $$0.b(fpd.this.p, this.a.b, $$12, $$13, -1);
         $$0.b(fpd.this.p, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644);
         $$0.b(fpd.this.p, this.a.d, $$12, $$13 + 9 + 5, -6250336);
         if (!this.a.h.isBlank()) {
            $$0.b(fpd.this.p, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268);
         }
      }

      @Override
      public xa a() {
         xa $$0 = wz.b(
            xa.b(this.a.b), xa.a("mco.template.select.narrate.authors", this.a.d), xa.b(this.a.h), xa.a("mco.template.select.narrate.version", this.a.c)
         );
         return xa.a("narrator.select", $$0);
      }
   }

   class b extends fvh<fpd.a> {
      public b(final fpd param1) {
         this(var1, Collections.emptyList());
      }

      public b(final Iterable<fnu> param1, final Iterable $$0) {
         super(frd.Q(), var1.n, var1.o - 33 - var1.I(), var1.I(), 46);
         this.a = var1;
         $$0.forEach(this::a);
      }

      public void a(fnu $$0) {
         this.b(this.a.new a($$0));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.a.O != null) {
            fza.a(this.a, this.a.O);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable fpd.a $$0) {
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

      public List<fnu> c() {
         return this.aI_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
