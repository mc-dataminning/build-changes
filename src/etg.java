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

public class etg extends gkn {
   static final Logger a = LogUtils.getLogger();
   static final ahg b = new ahg("widget/slot_frame");
   private static final vf c = vf.c("mco.template.button.select");
   private static final vf v = vf.c("mco.template.button.trailer");
   private static final vf w = vf.c("mco.template.button.publisher");
   private static final int x = 100;
   private static final int y = 10;
   private final fao z = new fao(this);
   final Consumer<erx> A;
   etg.b B;
   private final erg.d C;
   private exe D;
   private exe E;
   private exe F;
   @Nullable
   erx G = null;
   @Nullable
   String H;
   @Nullable
   private vf[] I;
   @Nullable
   List<etx.a> J;

   public etg(vf $$0, Consumer<erx> $$1, erg.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public etg(vf $$0, Consumer<erx> $$1, erg.d $$2, @Nullable ery $$3) {
      super($$0);
      this.A = $$1;
      this.C = $$2;
      if ($$3 == null) {
         this.B = new etg.b();
         this.a(new ery(10));
      } else {
         this.B = new etg.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(vf... $$0) {
      this.I = $$0;
   }

   @Override
   public void aN_() {
      this.z.a(new eyl(this.e, this.i));
      this.B = this.z.c(new etg.b(this.B.e()));
      fas $$0 = this.z.b(fas.e().a(10));
      $$0.c().b();
      this.E = $$0.a(exe.a(v, $$0x -> this.E()).a(100).a());
      this.D = $$0.a(exe.a(c, $$0x -> this.D()).a(100).a());
      $$0.a(exe.a(ve.e, $$0x -> this.aE_()).a(100).a());
      this.F = $$0.a(exe.a(w, $$0x -> this.H()).a(100).a());
      this.C();
      this.z.a($$1 -> {
         exc var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.B.b(this.g, this.h - this.z.b() - this.I());
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
         fbr.a(this, this.G.g);
      }
   }

   private void H() {
      if (this.G != null && !this.G.e.isBlank()) {
         fbr.a(this, this.G.e);
      }
   }

   private void a(final ery $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            ery $$0 = $$0;
            eqp $$1 = eqp.a();

            while ($$0 != null) {
               Either<ery, Exception> $$2 = etg.this.a($$0, $$1);
               $$0 = etg.this.f.a(() -> {
                  if ($$2.right().isPresent()) {
                     etg.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (etg.this.B.d()) {
                        etg.this.J = etx.a(gfq.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     ery $$1x = (ery)$$2.left().get();

                     for (erx $$2x : $$1x.a) {
                        etg.this.B.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (etg.this.B.d()) {
                           String $$3 = gfq.a("mco.template.select.none", "%link");
                           etx.b $$4 = etx.b.a(gfq.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           etg.this.J = etx.a($$3, $$4);
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

   Either<ery, Exception> a(ery $$0, eqp $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.C));
      } catch (esc var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(ews $$0, int $$1, int $$2, float $$3) {
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

   private void a(ews $$0, int $$1, int $$2, List<etx.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         etx.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.i.b($$0x.a())).sum();
         int $$8 = this.g / 2 - $$7 / 2;

         for (etx.b $$9 : $$5.a) {
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

   int I() {
      return this.I != null ? g(1) : 36;
   }

   class a extends eya.a<etg.a> {
      private static final eyr c = new eyr(new ahg("icon/link"), new ahg("icon/link_highlighted"));
      private static final eyr d = new eyr(new ahg("icon/video_link"), new ahg("icon/video_link_highlighted"));
      private static final vf e = vf.c("mco.template.info.tooltip");
      private static final vf f = vf.c("mco.template.trailer.tooltip");
      public final erx a;
      private long g;
      @Nullable
      private exq h;
      @Nullable
      private exq i;

      public a(erx $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new exq(15, 15, c, fbr.b(etg.this, $$0.e), e);
            this.h.a(eyp.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new exq(15, 15, d, fbr.b(etg.this, $$0.g), f);
            this.i.a(eyp.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if ($$2 == 0) {
            etg.this.G = this.a;
            etg.this.C();
            if (ac.b() - this.g < 250L && this.aI_()) {
               etg.this.A.accept(this.a);
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
      public void a(ews $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(etv.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(etg.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = etg.this.i.b(this.a.c);
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
         $$0.a(etg.this.i, this.a.b, $$12, $$13, -1, false);
         $$0.a(etg.this.i, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(etg.this.i, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(etg.this.i, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
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

   class b extends gkm<etg.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<erx> $$0) {
         super(etg.this.g, etg.this.h - 36 - etg.this.I(), etg.this.I(), 46);
         $$0.forEach(this::a);
      }

      public void a(erx $$0) {
         this.a((etg.a)(etg.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (etg.this.H != null) {
            fbr.a(etg.this, etg.this.H);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable etg.a $$0) {
         super.a($$0);
         etg.this.G = $$0 == null ? null : $$0.a;
         etg.this.C();
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

      public List<erx> e() {
         return this.l().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
