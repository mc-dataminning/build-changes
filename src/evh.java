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

public class evh extends gmw {
   static final Logger a = LogUtils.getLogger();
   static final aiy b = new aiy("widget/slot_frame");
   private static final vq c = vq.c("mco.template.button.select");
   private static final vq v = vq.c("mco.template.button.trailer");
   private static final vq w = vq.c("mco.template.button.publisher");
   private static final int x = 100;
   private static final int y = 10;
   private final fct z = new fct(this);
   final Consumer<ety> A;
   evh.b B;
   private final eth.d C;
   private ezh D;
   private ezh E;
   private ezh F;
   @Nullable
   ety G = null;
   @Nullable
   String H;
   @Nullable
   private vq[] I;
   @Nullable
   List<evy.a> J;

   public evh(vq $$0, Consumer<ety> $$1, eth.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public evh(vq $$0, Consumer<ety> $$1, eth.d $$2, @Nullable etz $$3) {
      super($$0);
      this.A = $$1;
      this.C = $$2;
      if ($$3 == null) {
         this.B = new evh.b();
         this.a(new etz(10));
      } else {
         this.B = new evh.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(vq... $$0) {
      this.I = $$0;
   }

   @Override
   public void aQ_() {
      this.z.a(new fao(this.e, this.i));
      this.B = this.z.c(new evh.b(this.B.e()));
      fcx $$0 = this.z.b(fcx.e().a(10));
      $$0.c().b();
      this.E = $$0.a(ezh.a(v, $$0x -> this.I()).a(100).a());
      this.D = $$0.a(ezh.a(c, $$0x -> this.H()).a(100).a());
      $$0.a(ezh.a(vp.e, $$0x -> this.d()).a(100).a());
      this.F = $$0.a(ezh.a(w, $$0x -> this.J()).a(100).a());
      this.E();
      this.z.a($$1 -> {
         ezf var10000 = this.d($$1);
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
         fdw.a(this, this.G.g);
      }
   }

   private void J() {
      if (this.G != null && !this.G.e.isBlank()) {
         fdw.a(this, this.G.e);
      }
   }

   private void a(final etz $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            etz $$0 = $$0;
            esq $$1 = esq.a();

            while ($$0 != null) {
               Either<etz, Exception> $$2 = evh.this.a($$0, $$1);
               $$0 = evh.this.f.a(() -> {
                  if ($$2.right().isPresent()) {
                     evh.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (evh.this.B.d()) {
                        evh.this.J = evy.a(ghz.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     etz $$1x = (etz)$$2.left().get();

                     for (ety $$2x : $$1x.a) {
                        evh.this.B.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (evh.this.B.d()) {
                           String $$3 = ghz.a("mco.template.select.none", "%link");
                           evy.b $$4 = evy.b.a(ghz.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           evh.this.J = evy.a($$3, $$4);
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

   Either<etz, Exception> a(etz $$0, esq $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.C));
      } catch (eud var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
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

   private void a(eyu $$0, int $$1, int $$2, List<evy.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         evy.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.i.b($$0x.a())).sum();
         int $$8 = this.g / 2 - $$7 / 2;

         for (evy.b $$9 : $$5.a) {
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

   class a extends fad.a<evh.a> {
      private static final fau c = new fau(new aiy("icon/link"), new aiy("icon/link_highlighted"));
      private static final fau d = new fau(new aiy("icon/video_link"), new aiy("icon/video_link_highlighted"));
      private static final vq e = vq.c("mco.template.info.tooltip");
      private static final vq f = vq.c("mco.template.trailer.tooltip");
      public final ety a;
      private long g;
      @Nullable
      private ezt h;
      @Nullable
      private ezt i;

      public a(ety $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new ezt(15, 15, c, fdw.b(evh.this, $$0.e), e);
            this.h.a(fas.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new ezt(15, 15, d, fdw.b(evh.this, $$0.g), f);
            this.i.a(fas.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if ($$2 == 0) {
            evh.this.G = this.a;
            evh.this.E();
            if (ac.b() - this.g < 250L && this.aL_()) {
               evh.this.A.accept(this.a);
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
      public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(evw.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(evh.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = evh.this.i.b(this.a.c);
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
         $$0.a(evh.this.i, this.a.b, $$12, $$13, -1, false);
         $$0.a(evh.this.i, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(evh.this.i, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(evh.this.i, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
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

   class b extends gmv<evh.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<ety> $$0) {
         super(evh.this.g, evh.this.h - 36 - evh.this.K(), evh.this.K(), 46);
         $$0.forEach(this::a);
      }

      public void a(ety $$0) {
         this.a((evh.a)(evh.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (evh.this.H != null) {
            fdw.a(evh.this, evh.this.H);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable evh.a $$0) {
         super.a($$0);
         evh.this.G = $$0 == null ? null : $$0.a;
         evh.this.E();
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

      public List<ety> e() {
         return this.l().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
