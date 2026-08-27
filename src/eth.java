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

public class eth extends gko {
   static final Logger a = LogUtils.getLogger();
   static final ahg b = new ahg("widget/slot_frame");
   private static final vf c = vf.c("mco.template.button.select");
   private static final vf v = vf.c("mco.template.button.trailer");
   private static final vf w = vf.c("mco.template.button.publisher");
   private static final int x = 100;
   private static final int y = 10;
   private final fap z = new fap(this);
   final Consumer<ery> A;
   eth.b B;
   private final erh.d C;
   private exf D;
   private exf E;
   private exf F;
   @Nullable
   ery G = null;
   @Nullable
   String H;
   @Nullable
   private vf[] I;
   @Nullable
   List<ety.a> J;

   public eth(vf $$0, Consumer<ery> $$1, erh.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public eth(vf $$0, Consumer<ery> $$1, erh.d $$2, @Nullable erz $$3) {
      super($$0);
      this.A = $$1;
      this.C = $$2;
      if ($$3 == null) {
         this.B = new eth.b();
         this.a(new erz(10));
      } else {
         this.B = new eth.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(vf... $$0) {
      this.I = $$0;
   }

   @Override
   public void aN_() {
      this.z.a(new eym(this.e, this.i));
      this.B = this.z.c(new eth.b(this.B.e()));
      fat $$0 = this.z.b(fat.e().a(10));
      $$0.c().b();
      this.E = $$0.a(exf.a(v, $$0x -> this.H()).a(100).a());
      this.D = $$0.a(exf.a(c, $$0x -> this.E()).a(100).a());
      $$0.a(exf.a(ve.e, $$0x -> this.aE_()).a(100).a());
      this.F = $$0.a(exf.a(w, $$0x -> this.I()).a(100).a());
      this.D();
      this.z.a($$1 -> {
         exd var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.B.b(this.g, this.h - this.z.b() - this.J());
      this.z.a();
   }

   @Override
   public vf h() {
      List<vf> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.e);
      if (this.I != null) {
         $$0.addAll(Arrays.asList(this.I));
      }

      return ve.a($$0);
   }

   void D() {
      this.F.k = this.G != null && !this.G.e.isEmpty();
      this.E.k = this.G != null && !this.G.g.isEmpty();
      this.D.j = this.G != null;
   }

   @Override
   public void aE_() {
      this.A.accept(null);
   }

   private void E() {
      if (this.G != null) {
         this.A.accept(this.G);
      }
   }

   private void H() {
      if (this.G != null && !this.G.g.isBlank()) {
         fbs.a(this, this.G.g);
      }
   }

   private void I() {
      if (this.G != null && !this.G.e.isBlank()) {
         fbs.a(this, this.G.e);
      }
   }

   private void a(final erz $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            erz $$0 = $$0;
            eqq $$1 = eqq.a();

            while ($$0 != null) {
               Either<erz, Exception> $$2 = eth.this.a($$0, $$1);
               $$0 = eth.this.f.a(() -> {
                  if ($$2.right().isPresent()) {
                     eth.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (eth.this.B.d()) {
                        eth.this.J = ety.a(gfr.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     erz $$1x = (erz)$$2.left().get();

                     for (ery $$2x : $$1x.a) {
                        eth.this.B.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (eth.this.B.d()) {
                           String $$3 = gfr.a("mco.template.select.none", "%link");
                           ety.b $$4 = ety.b.a(gfr.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           eth.this.J = ety.a($$3, $$4);
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

   Either<erz, Exception> a(erz $$0, eqq $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.C));
      } catch (esd var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.H = null;
      if (this.J != null) {
         this.a($$0, $$1, $$2, this.J);
      }

      if (this.I != null) {
         for (int $$4 = 0; $$4 < this.I.length; $$4++) {
            vf $$5 = this.I[$$4];
            $$0.a(this.i, $$5, this.g / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(ewt $$0, int $$1, int $$2, List<ety.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         ety.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.i.b($$0x.a())).sum();
         int $$8 = this.g / 2 - $$7 / 2;

         for (ety.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.i, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(vf.b($$9.c()));
               this.H = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int J() {
      return this.I != null ? g(1) : 36;
   }

   class a extends eyb.a<eth.a> {
      private static final eys c = new eys(new ahg("icon/link"), new ahg("icon/link_highlighted"));
      private static final eys d = new eys(new ahg("icon/video_link"), new ahg("icon/video_link_highlighted"));
      private static final vf e = vf.c("mco.template.info.tooltip");
      private static final vf f = vf.c("mco.template.trailer.tooltip");
      public final ery a;
      private long g;
      @Nullable
      private exr h;
      @Nullable
      private exr i;

      public a(ery $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new exr(15, 15, c, fbs.b(eth.this, $$0.e), e);
            this.h.a(eyq.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new exr(15, 15, d, fbs.b(eth.this, $$0.g), f);
            this.i.a(eyq.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if ($$2 == 0) {
            eth.this.G = this.a;
            eth.this.D();
            if (ac.b() - this.g < 250L && this.aI_()) {
               eth.this.A.accept(this.a);
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
      public void a(ewt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(etw.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(eth.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = eth.this.i.b(this.a.c);
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
         $$0.a(eth.this.i, this.a.b, $$12, $$13, -1, false);
         $$0.a(eth.this.i, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(eth.this.i, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(eth.this.i, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public vf a() {
         vf $$0 = ve.b(
            vf.b(this.a.b), vf.a("mco.template.select.narrate.authors", this.a.d), vf.b(this.a.h), vf.a("mco.template.select.narrate.version", this.a.c)
         );
         return vf.a("narrator.select", $$0);
      }
   }

   class b extends gkn<eth.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<ery> $$0) {
         super(eth.this.g, eth.this.h - 36 - eth.this.J(), eth.this.J(), 46);
         $$0.forEach(this::a);
      }

      public void a(ery $$0) {
         this.a((eth.a)(eth.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (eth.this.H != null) {
            fbs.a(eth.this, eth.this.H);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable eth.a $$0) {
         super.a($$0);
         eth.this.G = $$0 == null ? null : $$0.a;
         eth.this.D();
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

      public List<ery> e() {
         return this.l().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
