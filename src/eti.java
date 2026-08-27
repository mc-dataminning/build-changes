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

public class eti extends gkp {
   static final Logger a = LogUtils.getLogger();
   static final ahg b = new ahg("widget/slot_frame");
   private static final vf c = vf.c("mco.template.button.select");
   private static final vf v = vf.c("mco.template.button.trailer");
   private static final vf w = vf.c("mco.template.button.publisher");
   private static final int x = 100;
   private static final int y = 10;
   private final faq z = new faq(this);
   final Consumer<erz> A;
   eti.b B;
   private final eri.d C;
   private exg D;
   private exg E;
   private exg F;
   @Nullable
   erz G = null;
   @Nullable
   String H;
   @Nullable
   private vf[] I;
   @Nullable
   List<etz.a> J;

   public eti(vf $$0, Consumer<erz> $$1, eri.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public eti(vf $$0, Consumer<erz> $$1, eri.d $$2, @Nullable esa $$3) {
      super($$0);
      this.A = $$1;
      this.C = $$2;
      if ($$3 == null) {
         this.B = new eti.b();
         this.a(new esa(10));
      } else {
         this.B = new eti.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(vf... $$0) {
      this.I = $$0;
   }

   @Override
   public void aN_() {
      this.z.a(new eyn(this.e, this.i));
      this.B = this.z.c(new eti.b(this.B.e()));
      fau $$0 = this.z.b(fau.e().a(10));
      $$0.c().b();
      this.E = $$0.a(exg.a(v, $$0x -> this.H()).a(100).a());
      this.D = $$0.a(exg.a(c, $$0x -> this.E()).a(100).a());
      $$0.a(exg.a(ve.e, $$0x -> this.aE_()).a(100).a());
      this.F = $$0.a(exg.a(w, $$0x -> this.I()).a(100).a());
      this.D();
      this.z.a($$1 -> {
         exe var10000 = this.d($$1);
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
         fbt.a(this, this.G.g);
      }
   }

   private void I() {
      if (this.G != null && !this.G.e.isBlank()) {
         fbt.a(this, this.G.e);
      }
   }

   private void a(final esa $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            esa $$0 = $$0;
            eqr $$1 = eqr.a();

            while ($$0 != null) {
               Either<esa, Exception> $$2 = eti.this.a($$0, $$1);
               $$0 = eti.this.f.a(() -> {
                  if ($$2.right().isPresent()) {
                     eti.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (eti.this.B.d()) {
                        eti.this.J = etz.a(gfs.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     esa $$1x = (esa)$$2.left().get();

                     for (erz $$2x : $$1x.a) {
                        eti.this.B.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (eti.this.B.d()) {
                           String $$3 = gfs.a("mco.template.select.none", "%link");
                           etz.b $$4 = etz.b.a(gfs.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           eti.this.J = etz.a($$3, $$4);
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

   Either<esa, Exception> a(esa $$0, eqr $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.C));
      } catch (ese var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
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

   private void a(ewu $$0, int $$1, int $$2, List<etz.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         etz.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.i.b($$0x.a())).sum();
         int $$8 = this.g / 2 - $$7 / 2;

         for (etz.b $$9 : $$5.a) {
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

   class a extends eyc.a<eti.a> {
      private static final eyt c = new eyt(new ahg("icon/link"), new ahg("icon/link_highlighted"));
      private static final eyt d = new eyt(new ahg("icon/video_link"), new ahg("icon/video_link_highlighted"));
      private static final vf e = vf.c("mco.template.info.tooltip");
      private static final vf f = vf.c("mco.template.trailer.tooltip");
      public final erz a;
      private long g;
      @Nullable
      private exs h;
      @Nullable
      private exs i;

      public a(erz $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new exs(15, 15, c, fbt.b(eti.this, $$0.e), e);
            this.h.a(eyr.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new exs(15, 15, d, fbt.b(eti.this, $$0.g), f);
            this.i.a(eyr.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if ($$2 == 0) {
            eti.this.G = this.a;
            eti.this.D();
            if (ac.b() - this.g < 250L && this.aI_()) {
               eti.this.A.accept(this.a);
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
      public void a(ewu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(etx.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(eti.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = eti.this.i.b(this.a.c);
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
         $$0.a(eti.this.i, this.a.b, $$12, $$13, -1, false);
         $$0.a(eti.this.i, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(eti.this.i, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(eti.this.i, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
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

   class b extends gko<eti.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<erz> $$0) {
         super(eti.this.g, eti.this.h - 36 - eti.this.J(), eti.this.J(), 46);
         $$0.forEach(this::a);
      }

      public void a(erz $$0) {
         this.a((eti.a)(eti.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (eti.this.H != null) {
            fbt.a(eti.this, eti.this.H);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable eti.a $$0) {
         super.a($$0);
         eti.this.G = $$0 == null ? null : $$0.a;
         eti.this.D();
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

      public List<erz> e() {
         return this.l().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
