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

public class ezy extends gru {
   static final Logger a = LogUtils.getLogger();
   static final ajv b = new ajv("widget/slot_frame");
   private static final wi c = wi.c("mco.template.button.select");
   private static final wi y = wi.c("mco.template.button.trailer");
   private static final wi z = wi.c("mco.template.button.publisher");
   private static final int A = 100;
   private static final int B = 10;
   private final fhl C = new fhl(this);
   final Consumer<eyp> D;
   ezy.b E;
   private final exy.d F;
   private fdy G;
   private fdy H;
   private fdy I;
   @Nullable
   eyp J = null;
   @Nullable
   String K;
   @Nullable
   private wi[] L;
   @Nullable
   List<fap.a> M;

   public ezy(wi $$0, Consumer<eyp> $$1, exy.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public ezy(wi $$0, Consumer<eyp> $$1, exy.d $$2, @Nullable eyq $$3) {
      super($$0);
      this.D = $$1;
      this.F = $$2;
      if ($$3 == null) {
         this.E = new ezy.b();
         this.a(new eyq(10));
      } else {
         this.E = new ezy.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(wi... $$0) {
      this.L = $$0;
   }

   @Override
   public void aM_() {
      this.C.a(this.i, this.m);
      this.E = this.C.c(new ezy.b(this.E.d()));
      fhp $$0 = this.C.b(fhp.e().a(10));
      $$0.c().b();
      this.H = $$0.a(fdy.a(y, $$0x -> this.E()).a(100).a());
      this.G = $$0.a(fdy.a(c, $$0x -> this.D()).a(100).a());
      $$0.a(fdy.a(wh.e, $$0x -> this.d()).a(100).a());
      this.I = $$0.a(fdy.a(z, $$0x -> this.F()).a(100).a());
      this.C();
      this.C.a($$1 -> {
         fdw var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.E.b(this.k, this.l - this.C.b() - this.I());
      this.C.a();
   }

   @Override
   public wi i() {
      List<wi> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.i);
      if (this.L != null) {
         $$0.addAll(Arrays.asList(this.L));
      }

      return wh.a($$0);
   }

   void C() {
      this.I.k = this.J != null && !this.J.e.isEmpty();
      this.H.k = this.J != null && !this.J.g.isEmpty();
      this.G.j = this.J != null;
   }

   @Override
   public void d() {
      this.D.accept(null);
   }

   private void D() {
      if (this.J != null) {
         this.D.accept(this.J);
      }
   }

   private void E() {
      if (this.J != null && !this.J.g.isBlank()) {
         fio.a(this, this.J.g);
      }
   }

   private void F() {
      if (this.J != null && !this.J.e.isBlank()) {
         fio.a(this, this.J.e);
      }
   }

   private void a(final eyq $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            eyq $$0 = $$0;
            exh $$1 = exh.a();

            while ($$0 != null) {
               Either<eyq, Exception> $$2 = ezy.this.a($$0, $$1);
               $$0 = ezy.this.j.a(() -> {
                  if ($$2.right().isPresent()) {
                     ezy.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (ezy.this.E.c()) {
                        ezy.this.M = fap.a(gmx.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     eyq $$1x = (eyq)$$2.left().get();

                     for (eyp $$2x : $$1x.a) {
                        ezy.this.E.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (ezy.this.E.c()) {
                           String $$3 = gmx.a("mco.template.select.none", "%link");
                           fap.b $$4 = fap.b.a(gmx.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           ezy.this.M = fap.a($$3, $$4);
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

   Either<eyq, Exception> a(eyq $$0, exh $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.F));
      } catch (eyu var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.K = null;
      if (this.M != null) {
         this.a($$0, $$1, $$2, this.M);
      }

      if (this.L != null) {
         for (int $$4 = 0; $$4 < this.L.length; $$4++) {
            wi $$5 = this.L[$$4];
            $$0.a(this.m, $$5, this.k / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(fdl $$0, int $$1, int $$2, List<fap.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         fap.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.m.b($$0x.a())).sum();
         int $$8 = this.k / 2 - $$7 / 2;

         for (fap.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.m, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(wi.b($$9.c()));
               this.K = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int I() {
      return this.L != null ? g(1) : 33;
   }

   class a extends feu.a<ezy.a> {
      private static final ffl c = new ffl(new ajv("icon/link"), new ajv("icon/link_highlighted"));
      private static final ffl d = new ffl(new ajv("icon/video_link"), new ajv("icon/video_link_highlighted"));
      private static final wi e = wi.c("mco.template.info.tooltip");
      private static final wi f = wi.c("mco.template.trailer.tooltip");
      public final eyp a;
      private long g;
      @Nullable
      private fek h;
      @Nullable
      private fek i;

      public a(eyp $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new fek(15, 15, c, fio.b(ezy.this, $$0.e), e);
            this.h.a(ffj.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new fek(15, 15, d, fio.b(ezy.this, $$0.g), f);
            this.i.a(ffj.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         ezy.this.J = this.a;
         ezy.this.C();
         if (ac.b() - this.g < 250L && this.aI_()) {
            ezy.this.D.accept(this.a);
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
      public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fan.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(ezy.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = ezy.this.m.b(this.a.c);
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
         $$0.a(ezy.this.m, this.a.b, $$12, $$13, -1, false);
         $$0.a(ezy.this.m, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(ezy.this.m, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(ezy.this.m, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public wi a() {
         wi $$0 = wh.b(
            wi.b(this.a.b), wi.a("mco.template.select.narrate.authors", this.a.d), wi.b(this.a.h), wi.a("mco.template.select.narrate.version", this.a.c)
         );
         return wi.a("narrator.select", $$0);
      }
   }

   class b extends grt<ezy.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<eyp> $$0) {
         super(ezy.this.k, ezy.this.l - 33 - ezy.this.I(), ezy.this.I(), 46);
         $$0.forEach(this::a);
      }

      public void a(eyp $$0) {
         this.a((ezy.a)(ezy.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (ezy.this.K != null) {
            fio.a(ezy.this, ezy.this.K);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable ezy.a $$0) {
         super.a($$0);
         ezy.this.J = $$0 == null ? null : $$0.a;
         ezy.this.C();
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

      public List<eyp> d() {
         return this.aE_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
