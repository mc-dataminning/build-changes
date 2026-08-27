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

public class exg extends gpb {
   static final Logger a = LogUtils.getLogger();
   static final ajh b = new ajh("widget/slot_frame");
   private static final vu c = vu.c("mco.template.button.select");
   private static final vu v = vu.c("mco.template.button.trailer");
   private static final vu w = vu.c("mco.template.button.publisher");
   private static final int x = 100;
   private static final int y = 10;
   private final fet z = new fet(this);
   final Consumer<evx> A;
   exg.b B;
   private final evg.d C;
   private fbg D;
   private fbg E;
   private fbg F;
   @Nullable
   evx G = null;
   @Nullable
   String H;
   @Nullable
   private vu[] I;
   @Nullable
   List<exx.a> J;

   public exg(vu $$0, Consumer<evx> $$1, evg.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public exg(vu $$0, Consumer<evx> $$1, evg.d $$2, @Nullable evy $$3) {
      super($$0);
      this.A = $$1;
      this.C = $$2;
      if ($$3 == null) {
         this.B = new exg.b();
         this.a(new evy(10));
      } else {
         this.B = new exg.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(vu... $$0) {
      this.I = $$0;
   }

   @Override
   public void aO_() {
      this.z.a(new fcn(this.e, this.i));
      this.B = this.z.c(new exg.b(this.B.e()));
      fex $$0 = this.z.b(fex.e().a(10));
      $$0.c().b();
      this.E = $$0.a(fbg.a(v, $$0x -> this.I()).a(100).a());
      this.D = $$0.a(fbg.a(c, $$0x -> this.H()).a(100).a());
      $$0.a(fbg.a(vt.e, $$0x -> this.d()).a(100).a());
      this.F = $$0.a(fbg.a(w, $$0x -> this.J()).a(100).a());
      this.E();
      this.z.a($$1 -> {
         fbe var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.B.b(this.g, this.h - this.z.b() - this.K());
      this.z.a();
   }

   @Override
   public vu i() {
      List<vu> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.e);
      if (this.I != null) {
         $$0.addAll(Arrays.asList(this.I));
      }

      return vt.a($$0);
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
         ffw.a(this, this.G.g);
      }
   }

   private void J() {
      if (this.G != null && !this.G.e.isBlank()) {
         ffw.a(this, this.G.e);
      }
   }

   private void a(final evy $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            evy $$0 = $$0;
            eup $$1 = eup.a();

            while ($$0 != null) {
               Either<evy, Exception> $$2 = exg.this.a($$0, $$1);
               $$0 = exg.this.f.a(() -> {
                  if ($$2.right().isPresent()) {
                     exg.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (exg.this.B.d()) {
                        exg.this.J = exx.a(gke.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     evy $$1x = (evy)$$2.left().get();

                     for (evx $$2x : $$1x.a) {
                        exg.this.B.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (exg.this.B.d()) {
                           String $$3 = gke.a("mco.template.select.none", "%link");
                           exx.b $$4 = exx.b.a(gke.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           exg.this.J = exx.a($$3, $$4);
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

   Either<evy, Exception> a(evy $$0, eup $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.C));
      } catch (ewc var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.H = null;
      if (this.J != null) {
         this.a($$0, $$1, $$2, this.J);
      }

      if (this.I != null) {
         for (int $$4 = 0; $$4 < this.I.length; $$4++) {
            vu $$5 = this.I[$$4];
            $$0.a(this.i, $$5, this.g / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(fat $$0, int $$1, int $$2, List<exx.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         exx.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.i.b($$0x.a())).sum();
         int $$8 = this.g / 2 - $$7 / 2;

         for (exx.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.i, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(vu.b($$9.c()));
               this.H = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int K() {
      return this.I != null ? g(1) : 36;
   }

   class a extends fcc.a<exg.a> {
      private static final fct c = new fct(new ajh("icon/link"), new ajh("icon/link_highlighted"));
      private static final fct d = new fct(new ajh("icon/video_link"), new ajh("icon/video_link_highlighted"));
      private static final vu e = vu.c("mco.template.info.tooltip");
      private static final vu f = vu.c("mco.template.trailer.tooltip");
      public final evx a;
      private long g;
      @Nullable
      private fbs h;
      @Nullable
      private fbs i;

      public a(evx $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new fbs(15, 15, c, ffw.b(exg.this, $$0.e), e);
            this.h.a(fcr.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new fbs(15, 15, d, ffw.b(exg.this, $$0.g), f);
            this.i.a(fcr.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if ($$2 == 0) {
            exg.this.G = this.a;
            exg.this.E();
            if (ac.b() - this.g < 250L && this.aJ_()) {
               exg.this.A.accept(this.a);
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
      public void a(fat $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(exv.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(exg.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = exg.this.i.b(this.a.c);
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
         $$0.a(exg.this.i, this.a.b, $$12, $$13, -1, false);
         $$0.a(exg.this.i, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(exg.this.i, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(exg.this.i, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public vu a() {
         vu $$0 = vt.b(
            vu.b(this.a.b), vu.a("mco.template.select.narrate.authors", this.a.d), vu.b(this.a.h), vu.a("mco.template.select.narrate.version", this.a.c)
         );
         return vu.a("narrator.select", $$0);
      }
   }

   class b extends gpa<exg.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<evx> $$0) {
         super(exg.this.g, exg.this.h - 36 - exg.this.K(), exg.this.K(), 46);
         $$0.forEach(this::a);
      }

      public void a(evx $$0) {
         this.a((exg.a)(exg.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (exg.this.H != null) {
            ffw.a(exg.this, exg.this.H);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable exg.a $$0) {
         super.a($$0);
         exg.this.G = $$0 == null ? null : $$0.a;
         exg.this.E();
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

      public List<evx> e() {
         return this.l().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
