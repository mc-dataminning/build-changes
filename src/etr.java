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

public class etr extends gld {
   static final Logger a = LogUtils.getLogger();
   static final ahh b = new ahh("widget/slot_frame");
   private static final vg c = vg.c("mco.template.button.select");
   private static final vg v = vg.c("mco.template.button.trailer");
   private static final vg w = vg.c("mco.template.button.publisher");
   private static final int x = 100;
   private static final int y = 10;
   private final fbb z = new fbb(this);
   final Consumer<esi> A;
   etr.b B;
   private final err.d C;
   private exr D;
   private exr E;
   private exr F;
   @Nullable
   esi G = null;
   @Nullable
   String H;
   @Nullable
   private vg[] I;
   @Nullable
   List<eui.a> J;

   public etr(vg $$0, Consumer<esi> $$1, err.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public etr(vg $$0, Consumer<esi> $$1, err.d $$2, @Nullable esj $$3) {
      super($$0);
      this.A = $$1;
      this.C = $$2;
      if ($$3 == null) {
         this.B = new etr.b();
         this.a(new esj(10));
      } else {
         this.B = new etr.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(vg... $$0) {
      this.I = $$0;
   }

   @Override
   public void aP_() {
      this.z.a(new eyy(this.e, this.i));
      this.B = this.z.c(new etr.b(this.B.e()));
      fbf $$0 = this.z.b(fbf.e().a(10));
      $$0.c().b();
      this.E = $$0.a(exr.a(v, $$0x -> this.I()).a(100).a());
      this.D = $$0.a(exr.a(c, $$0x -> this.H()).a(100).a());
      $$0.a(exr.a(vf.e, $$0x -> this.d()).a(100).a());
      this.F = $$0.a(exr.a(w, $$0x -> this.J()).a(100).a());
      this.E();
      this.z.a($$1 -> {
         exp var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.B.b(this.g, this.h - this.z.b() - this.K());
      this.z.a();
   }

   @Override
   public vg i() {
      List<vg> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.e);
      if (this.I != null) {
         $$0.addAll(Arrays.asList(this.I));
      }

      return vf.a($$0);
   }

   void E() {
      this.F.k = this.G != null && !this.G.e.isEmpty();
      this.E.k = this.G != null && !this.G.g.isEmpty();
      this.D.j = this.G != null;
   }

   @Override
   public void d() {
      this.A.accept(null);
   }

   private void H() {
      if (this.G != null) {
         this.A.accept(this.G);
      }
   }

   private void I() {
      if (this.G != null && !this.G.g.isBlank()) {
         fce.a(this, this.G.g);
      }
   }

   private void J() {
      if (this.G != null && !this.G.e.isBlank()) {
         fce.a(this, this.G.e);
      }
   }

   private void a(final esj $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            esj $$0 = $$0;
            era $$1 = era.a();

            while ($$0 != null) {
               Either<esj, Exception> $$2 = etr.this.a($$0, $$1);
               $$0 = etr.this.f.a(() -> {
                  if ($$2.right().isPresent()) {
                     etr.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (etr.this.B.d()) {
                        etr.this.J = eui.a(ggg.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     esj $$1x = (esj)$$2.left().get();

                     for (esi $$2x : $$1x.a) {
                        etr.this.B.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (etr.this.B.d()) {
                           String $$3 = ggg.a("mco.template.select.none", "%link");
                           eui.b $$4 = eui.b.a(ggg.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           etr.this.J = eui.a($$3, $$4);
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

   Either<esj, Exception> a(esj $$0, era $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.C));
      } catch (esn var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.H = null;
      if (this.J != null) {
         this.a($$0, $$1, $$2, this.J);
      }

      if (this.I != null) {
         for (int $$4 = 0; $$4 < this.I.length; $$4++) {
            vg $$5 = this.I[$$4];
            $$0.a(this.i, $$5, this.g / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(exe $$0, int $$1, int $$2, List<eui.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         eui.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.i.b($$0x.a())).sum();
         int $$8 = this.g / 2 - $$7 / 2;

         for (eui.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.i, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(vg.b($$9.c()));
               this.H = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int K() {
      return this.I != null ? g(1) : 36;
   }

   class a extends eyn.a<etr.a> {
      private static final eze c = new eze(new ahh("icon/link"), new ahh("icon/link_highlighted"));
      private static final eze d = new eze(new ahh("icon/video_link"), new ahh("icon/video_link_highlighted"));
      private static final vg e = vg.c("mco.template.info.tooltip");
      private static final vg f = vg.c("mco.template.trailer.tooltip");
      public final esi a;
      private long g;
      @Nullable
      private eyd h;
      @Nullable
      private eyd i;

      public a(esi $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new eyd(15, 15, c, fce.b(etr.this, $$0.e), e);
            this.h.a(ezc.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new eyd(15, 15, d, fce.b(etr.this, $$0.g), f);
            this.i.a(ezc.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if ($$2 == 0) {
            etr.this.G = this.a;
            etr.this.E();
            if (ac.b() - this.g < 250L && this.aK_()) {
               etr.this.A.accept(this.a);
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
      public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(eug.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(etr.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = etr.this.i.b(this.a.c);
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
         $$0.a(etr.this.i, this.a.b, $$12, $$13, -1, false);
         $$0.a(etr.this.i, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(etr.this.i, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(etr.this.i, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public vg a() {
         vg $$0 = vf.b(
            vg.b(this.a.b), vg.a("mco.template.select.narrate.authors", this.a.d), vg.b(this.a.h), vg.a("mco.template.select.narrate.version", this.a.c)
         );
         return vg.a("narrator.select", $$0);
      }
   }

   class b extends glc<etr.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<esi> $$0) {
         super(etr.this.g, etr.this.h - 36 - etr.this.K(), etr.this.K(), 46);
         $$0.forEach(this::a);
      }

      public void a(esi $$0) {
         this.a((etr.a)(etr.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (etr.this.H != null) {
            fce.a(etr.this, etr.this.H);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable etr.a $$0) {
         super.a($$0);
         etr.this.G = $$0 == null ? null : $$0.a;
         etr.this.E();
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

      public List<esi> e() {
         return this.l().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
