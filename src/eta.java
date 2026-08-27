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

public class eta extends gkc {
   static final Logger a = LogUtils.getLogger();
   static final ahd b = new ahd("widget/slot_frame");
   private static final vd c = vd.c("mco.template.button.select");
   private static final vd v = vd.c("mco.template.button.trailer");
   private static final vd w = vd.c("mco.template.button.publisher");
   private static final int x = 100;
   private static final int y = 10;
   private final fai z = new fai(this);
   final Consumer<err> A;
   eta.b B;
   private final era.d C;
   private ewy D;
   private ewy E;
   private ewy F;
   @Nullable
   err G = null;
   @Nullable
   String H;
   @Nullable
   private vd[] I;
   @Nullable
   List<etr.a> J;

   public eta(vd $$0, Consumer<err> $$1, era.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public eta(vd $$0, Consumer<err> $$1, era.d $$2, @Nullable ers $$3) {
      super($$0);
      this.A = $$1;
      this.C = $$2;
      if ($$3 == null) {
         this.B = new eta.b();
         this.a(new ers(10));
      } else {
         this.B = new eta.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(vd... $$0) {
      this.I = $$0;
   }

   @Override
   public void aN_() {
      this.z.a(new eyf(this.e, this.i));
      this.B = this.z.c(new eta.b(this.B.e()));
      fam $$0 = this.z.b(fam.e().a(10));
      $$0.c().b();
      this.E = $$0.a(ewy.a(v, $$0x -> this.E()).a(100).a());
      this.D = $$0.a(ewy.a(c, $$0x -> this.D()).a(100).a());
      $$0.a(ewy.a(vc.e, $$0x -> this.aE_()).a(100).a());
      this.F = $$0.a(ewy.a(w, $$0x -> this.H()).a(100).a());
      this.C();
      this.z.a($$1 -> {
         eww var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.B.b(this.g, this.h - this.z.b() - this.I());
      this.z.a();
   }

   @Override
   public vd h() {
      List<vd> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.e);
      if (this.I != null) {
         $$0.addAll(Arrays.asList(this.I));
      }

      return vc.a($$0);
   }

   @Override
   void C() {
      this.F.k = this.G != null && !this.G.e.isEmpty();
      this.E.k = this.G != null && !this.G.g.isEmpty();
      this.D.j = this.G != null;
   }

   @Override
   public void aE_() {
      this.A.accept(null);
   }

   private void D() {
      if (this.G != null) {
         this.A.accept(this.G);
      }
   }

   private void E() {
      if (this.G != null && !this.G.g.isBlank()) {
         fbl.a(this, this.G.g);
      }
   }

   private void H() {
      if (this.G != null && !this.G.e.isBlank()) {
         fbl.a(this, this.G.e);
      }
   }

   private void a(final ers $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            ers $$0 = $$0;
            eqj $$1 = eqj.a();

            while ($$0 != null) {
               Either<ers, Exception> $$2 = eta.this.a($$0, $$1);
               $$0 = eta.this.f.a(() -> {
                  if ($$2.right().isPresent()) {
                     eta.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (eta.this.B.d()) {
                        eta.this.J = etr.a(gfl.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     ers $$1x = (ers)$$2.left().get();

                     for (err $$2x : $$1x.a) {
                        eta.this.B.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (eta.this.B.d()) {
                           String $$3 = gfl.a("mco.template.select.none", "%link");
                           etr.b $$4 = etr.b.a(gfl.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           eta.this.J = etr.a($$3, $$4);
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

   Either<ers, Exception> a(ers $$0, eqj $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.C));
      } catch (erw var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.H = null;
      if (this.J != null) {
         this.a($$0, $$1, $$2, this.J);
      }

      if (this.I != null) {
         for (int $$4 = 0; $$4 < this.I.length; $$4++) {
            vd $$5 = this.I[$$4];
            $$0.a(this.i, $$5, this.g / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(ewm $$0, int $$1, int $$2, List<etr.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         etr.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.i.b($$0x.a())).sum();
         int $$8 = this.g / 2 - $$7 / 2;

         for (etr.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.i, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(vd.b($$9.c()));
               this.H = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int I() {
      return this.I != null ? g(1) : 36;
   }

   class a extends exu.a<eta.a> {
      private static final eyl c = new eyl(new ahd("icon/link"), new ahd("icon/link_highlighted"));
      private static final eyl d = new eyl(new ahd("icon/video_link"), new ahd("icon/video_link_highlighted"));
      private static final vd e = vd.c("mco.template.info.tooltip");
      private static final vd f = vd.c("mco.template.trailer.tooltip");
      public final err a;
      private long g;
      @Nullable
      private exk h;
      @Nullable
      private exk i;

      public a(err $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new exk(15, 15, c, fbl.b(eta.this, $$0.e), e);
            this.h.a(eyj.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new exk(15, 15, d, fbl.b(eta.this, $$0.g), f);
            this.i.a(eyj.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if ($$2 == 0) {
            eta.this.G = this.a;
            eta.this.C();
            if (ac.b() - this.g < 250L && this.aI_()) {
               eta.this.A.accept(this.a);
            }

            this.g = ac.b();
            if (this.h != null) {
               this.h.a($$0, $$1, $$2);
            }

            if (this.i != null) {
               this.i.a($$0, $$1, $$2);
            }

            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      @Override
      public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(etp.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(eta.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = eta.this.i.b(this.a.c);
         if (this.h != null) {
            this.h.c($$3 + $$4 - $$11 - this.h.w() - 10, $$2);
            this.h.a($$0, $$6, $$7, $$9);
         }

         if (this.i != null) {
            this.i.c($$3 + $$4 - $$11 - this.i.w() * 2 - 15, $$2);
            this.i.a($$0, $$6, $$7, $$9);
         }

         int $$12 = $$3 + 45 + 20;
         int $$13 = $$2 + 5;
         $$0.a(eta.this.i, this.a.b, $$12, $$13, -1, false);
         $$0.a(eta.this.i, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(eta.this.i, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(eta.this.i, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public vd a() {
         vd $$0 = vc.b(
            vd.b(this.a.b), vd.a("mco.template.select.narrate.authors", this.a.d), vd.b(this.a.h), vd.a("mco.template.select.narrate.version", this.a.c)
         );
         return vd.a("narrator.select", $$0);
      }
   }

   class b extends gkb<eta.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<err> $$0) {
         super(eta.this.g, eta.this.h - 36 - eta.this.I(), eta.this.I(), 46);
         $$0.forEach(this::a);
      }

      public void a(err $$0) {
         this.a((eta.a)(eta.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (eta.this.H != null) {
            fbl.a(eta.this, eta.this.H);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable eta.a $$0) {
         super.a($$0);
         eta.this.G = $$0 == null ? null : $$0.a;
         eta.this.C();
      }

      @Override
      public int a() {
         return this.n() * 46;
      }

      @Override
      public int b() {
         return 300;
      }

      public boolean d() {
         return this.n() == 0;
      }

      public List<err> e() {
         return this.l().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
