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

public class evo extends gnd {
   static final Logger a = LogUtils.getLogger();
   static final aiy b = new aiy("widget/slot_frame");
   private static final vq c = vq.c("mco.template.button.select");
   private static final vq v = vq.c("mco.template.button.trailer");
   private static final vq w = vq.c("mco.template.button.publisher");
   private static final int x = 100;
   private static final int y = 10;
   private final fda z = new fda(this);
   final Consumer<euf> A;
   evo.b B;
   private final eto.d C;
   private ezo D;
   private ezo E;
   private ezo F;
   @Nullable
   euf G = null;
   @Nullable
   String H;
   @Nullable
   private vq[] I;
   @Nullable
   List<ewf.a> J;

   public evo(vq $$0, Consumer<euf> $$1, eto.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public evo(vq $$0, Consumer<euf> $$1, eto.d $$2, @Nullable eug $$3) {
      super($$0);
      this.A = $$1;
      this.C = $$2;
      if ($$3 == null) {
         this.B = new evo.b();
         this.a(new eug(10));
      } else {
         this.B = new evo.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(vq... $$0) {
      this.I = $$0;
   }

   @Override
   public void aQ_() {
      this.z.a(new fav(this.e, this.i));
      this.B = this.z.c(new evo.b(this.B.e()));
      fde $$0 = this.z.b(fde.e().a(10));
      $$0.c().b();
      this.E = $$0.a(ezo.a(v, $$0x -> this.I()).a(100).a());
      this.D = $$0.a(ezo.a(c, $$0x -> this.H()).a(100).a());
      $$0.a(ezo.a(vp.e, $$0x -> this.d()).a(100).a());
      this.F = $$0.a(ezo.a(w, $$0x -> this.J()).a(100).a());
      this.E();
      this.z.a($$1 -> {
         ezm var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.B.b(this.g, this.h - this.z.b() - this.K());
      this.z.a();
   }

   @Override
   public vq i() {
      List<vq> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.e);
      if (this.I != null) {
         $$0.addAll(Arrays.asList(this.I));
      }

      return vp.a($$0);
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
         fed.a(this, this.G.g);
      }
   }

   private void J() {
      if (this.G != null && !this.G.e.isBlank()) {
         fed.a(this, this.G.e);
      }
   }

   private void a(final eug $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            eug $$0 = $$0;
            esx $$1 = esx.a();

            while ($$0 != null) {
               Either<eug, Exception> $$2 = evo.this.a($$0, $$1);
               $$0 = evo.this.f.a(() -> {
                  if ($$2.right().isPresent()) {
                     evo.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (evo.this.B.d()) {
                        evo.this.J = ewf.a(gig.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     eug $$1x = (eug)$$2.left().get();

                     for (euf $$2x : $$1x.a) {
                        evo.this.B.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (evo.this.B.d()) {
                           String $$3 = gig.a("mco.template.select.none", "%link");
                           ewf.b $$4 = ewf.b.a(gig.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           evo.this.J = ewf.a($$3, $$4);
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

   Either<eug, Exception> a(eug $$0, esx $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.C));
      } catch (euk var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.H = null;
      if (this.J != null) {
         this.a($$0, $$1, $$2, this.J);
      }

      if (this.I != null) {
         for (int $$4 = 0; $$4 < this.I.length; $$4++) {
            vq $$5 = this.I[$$4];
            $$0.a(this.i, $$5, this.g / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(ezb $$0, int $$1, int $$2, List<ewf.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         ewf.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.i.b($$0x.a())).sum();
         int $$8 = this.g / 2 - $$7 / 2;

         for (ewf.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.i, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(vq.b($$9.c()));
               this.H = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int K() {
      return this.I != null ? g(1) : 36;
   }

   class a extends fak.a<evo.a> {
      private static final fbb c = new fbb(new aiy("icon/link"), new aiy("icon/link_highlighted"));
      private static final fbb d = new fbb(new aiy("icon/video_link"), new aiy("icon/video_link_highlighted"));
      private static final vq e = vq.c("mco.template.info.tooltip");
      private static final vq f = vq.c("mco.template.trailer.tooltip");
      public final euf a;
      private long g;
      @Nullable
      private faa h;
      @Nullable
      private faa i;

      public a(euf $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new faa(15, 15, c, fed.b(evo.this, $$0.e), e);
            this.h.a(faz.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new faa(15, 15, d, fed.b(evo.this, $$0.g), f);
            this.i.a(faz.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if ($$2 == 0) {
            evo.this.G = this.a;
            evo.this.E();
            if (ac.b() - this.g < 250L && this.aL_()) {
               evo.this.A.accept(this.a);
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
      public void a(ezb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(ewd.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(evo.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = evo.this.i.b(this.a.c);
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
         $$0.a(evo.this.i, this.a.b, $$12, $$13, -1, false);
         $$0.a(evo.this.i, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(evo.this.i, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(evo.this.i, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public vq a() {
         vq $$0 = vp.b(
            vq.b(this.a.b), vq.a("mco.template.select.narrate.authors", this.a.d), vq.b(this.a.h), vq.a("mco.template.select.narrate.version", this.a.c)
         );
         return vq.a("narrator.select", $$0);
      }
   }

   class b extends gnc<evo.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<euf> $$0) {
         super(evo.this.g, evo.this.h - 36 - evo.this.K(), evo.this.K(), 46);
         $$0.forEach(this::a);
      }

      public void a(euf $$0) {
         this.a((evo.a)(evo.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (evo.this.H != null) {
            fed.a(evo.this, evo.this.H);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable evo.a $$0) {
         super.a($$0);
         evo.this.G = $$0 == null ? null : $$0.a;
         evo.this.E();
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

      public List<euf> e() {
         return this.l().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
