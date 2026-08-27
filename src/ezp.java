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

public class ezp extends grl {
   static final Logger a = LogUtils.getLogger();
   static final ajt b = new ajt("widget/slot_frame");
   private static final wg c = wg.c("mco.template.button.select");
   private static final wg y = wg.c("mco.template.button.trailer");
   private static final wg z = wg.c("mco.template.button.publisher");
   private static final int A = 100;
   private static final int B = 10;
   private final fhc C = new fhc(this);
   final Consumer<eyg> D;
   ezp.b E;
   private final exp.d F;
   private fdp G;
   private fdp H;
   private fdp I;
   @Nullable
   eyg J = null;
   @Nullable
   String K;
   @Nullable
   private wg[] L;
   @Nullable
   List<fag.a> M;

   public ezp(wg $$0, Consumer<eyg> $$1, exp.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public ezp(wg $$0, Consumer<eyg> $$1, exp.d $$2, @Nullable eyh $$3) {
      super($$0);
      this.D = $$1;
      this.F = $$2;
      if ($$3 == null) {
         this.E = new ezp.b();
         this.a(new eyh(10));
      } else {
         this.E = new ezp.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(wg... $$0) {
      this.L = $$0;
   }

   @Override
   public void aN_() {
      this.C.a(this.i, this.m);
      this.E = this.C.c(new ezp.b(this.E.d()));
      fhg $$0 = this.C.b(fhg.e().a(10));
      $$0.c().b();
      this.H = $$0.a(fdp.a(y, $$0x -> this.E()).a(100).a());
      this.G = $$0.a(fdp.a(c, $$0x -> this.D()).a(100).a());
      $$0.a(fdp.a(wf.e, $$0x -> this.d()).a(100).a());
      this.I = $$0.a(fdp.a(z, $$0x -> this.F()).a(100).a());
      this.C();
      this.C.a($$1 -> {
         fdn var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.E.b(this.k, this.l - this.C.b() - this.I());
      this.C.a();
   }

   @Override
   public wg i() {
      List<wg> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.i);
      if (this.L != null) {
         $$0.addAll(Arrays.asList(this.L));
      }

      return wf.a($$0);
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
         fif.a(this, this.J.g);
      }
   }

   private void F() {
      if (this.J != null && !this.J.e.isBlank()) {
         fif.a(this, this.J.e);
      }
   }

   private void a(final eyh $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            eyh $$0 = $$0;
            ewy $$1 = ewy.a();

            while ($$0 != null) {
               Either<eyh, Exception> $$2 = ezp.this.a($$0, $$1);
               $$0 = ezp.this.j.a(() -> {
                  if ($$2.right().isPresent()) {
                     ezp.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (ezp.this.E.c()) {
                        ezp.this.M = fag.a(gmo.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     eyh $$1x = (eyh)$$2.left().get();

                     for (eyg $$2x : $$1x.a) {
                        ezp.this.E.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (ezp.this.E.c()) {
                           String $$3 = gmo.a("mco.template.select.none", "%link");
                           fag.b $$4 = fag.b.a(gmo.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           ezp.this.M = fag.a($$3, $$4);
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

   Either<eyh, Exception> a(eyh $$0, ewy $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.F));
      } catch (eyl var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.K = null;
      if (this.M != null) {
         this.a($$0, $$1, $$2, this.M);
      }

      if (this.L != null) {
         for (int $$4 = 0; $$4 < this.L.length; $$4++) {
            wg $$5 = this.L[$$4];
            $$0.a(this.m, $$5, this.k / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(fdc $$0, int $$1, int $$2, List<fag.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         fag.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.m.b($$0x.a())).sum();
         int $$8 = this.k / 2 - $$7 / 2;

         for (fag.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.m, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(wg.b($$9.c()));
               this.K = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int I() {
      return this.L != null ? g(1) : 33;
   }

   class a extends fel.a<ezp.a> {
      private static final ffc c = new ffc(new ajt("icon/link"), new ajt("icon/link_highlighted"));
      private static final ffc d = new ffc(new ajt("icon/video_link"), new ajt("icon/video_link_highlighted"));
      private static final wg e = wg.c("mco.template.info.tooltip");
      private static final wg f = wg.c("mco.template.trailer.tooltip");
      public final eyg a;
      private long g;
      @Nullable
      private feb h;
      @Nullable
      private feb i;

      public a(eyg $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new feb(15, 15, c, fif.b(ezp.this, $$0.e), e);
            this.h.a(ffa.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new feb(15, 15, d, fif.b(ezp.this, $$0.g), f);
            this.i.a(ffa.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         ezp.this.J = this.a;
         ezp.this.C();
         if (ac.b() - this.g < 250L && this.aJ_()) {
            ezp.this.D.accept(this.a);
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
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fae.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(ezp.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = ezp.this.m.b(this.a.c);
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
         $$0.a(ezp.this.m, this.a.b, $$12, $$13, -1, false);
         $$0.a(ezp.this.m, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(ezp.this.m, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(ezp.this.m, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public wg a() {
         wg $$0 = wf.b(
            wg.b(this.a.b), wg.a("mco.template.select.narrate.authors", this.a.d), wg.b(this.a.h), wg.a("mco.template.select.narrate.version", this.a.c)
         );
         return wg.a("narrator.select", $$0);
      }
   }

   class b extends grk<ezp.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<eyg> $$0) {
         super(ezp.this.k, ezp.this.l - 33 - ezp.this.I(), ezp.this.I(), 46);
         $$0.forEach(this::a);
      }

      public void a(eyg $$0) {
         this.a((ezp.a)(ezp.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (ezp.this.K != null) {
            fif.a(ezp.this, ezp.this.K);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable ezp.a $$0) {
         super.a($$0);
         ezp.this.J = $$0 == null ? null : $$0.a;
         ezp.this.C();
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

      public List<eyg> d() {
         return this.aF_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
