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

public class eqr extends ghe {
   static final Logger a = LogUtils.getLogger();
   static final agg b = new agg("widget/slot_frame");
   private static final ur c = ur.c("mco.template.button.select");
   private static final ur v = ur.c("mco.template.button.trailer");
   private static final ur w = ur.c("mco.template.button.publisher");
   private static final int x = 100;
   private static final int y = 10;
   private final exw z = new exw(this);
   final Consumer<epi> A;
   eqr.b B;
   private final eor.d C;
   private eum D;
   private eum E;
   private eum F;
   @Nullable
   epi G = null;
   @Nullable
   String H;
   @Nullable
   private ur[] I;
   @Nullable
   List<eri.a> J;

   public eqr(ur $$0, Consumer<epi> $$1, eor.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public eqr(ur $$0, Consumer<epi> $$1, eor.d $$2, @Nullable epj $$3) {
      super($$0);
      this.A = $$1;
      this.C = $$2;
      if ($$3 == null) {
         this.B = new eqr.b();
         this.a(new epj(10));
      } else {
         this.B = new eqr.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(ur... $$0) {
      this.I = $$0;
   }

   @Override
   public void aO_() {
      this.z.a(new evt(this.e, this.i));
      this.B = new eqr.b(this.B.e());
      this.d(this.B);
      eya $$0 = this.z.b(eya.e().a(10));
      $$0.c().b();
      this.E = $$0.a(eum.a(v, $$0x -> this.E()).a(100).a());
      this.D = $$0.a(eum.a(c, $$0x -> this.D()).a(100).a());
      $$0.a(eum.a(uq.e, $$0x -> this.aE_()).a(100).a());
      this.F = $$0.a(eum.a(w, $$0x -> this.F()).a(100).a());
      this.C();
      this.z.a($$1 -> {
         euk var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.B.a(this.g, this.h, this.G(), this.h - this.z.b());
      this.z.a();
   }

   @Override
   public ur h() {
      List<ur> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.e);
      if (this.I != null) {
         $$0.addAll(Arrays.asList(this.I));
      }

      return uq.a($$0);
   }

   @Override
   void C() {
      this.F.j = this.G != null && !this.G.e.isEmpty();
      this.E.j = this.G != null && !this.G.g.isEmpty();
      this.D.i = this.G != null;
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
         eyz.a(this, this.G.g);
      }
   }

   private void F() {
      if (this.G != null && !this.G.e.isBlank()) {
         eyz.a(this, this.G.e);
      }
   }

   private void a(final epj $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            epj $$0 = $$0;
            eoa $$1 = eoa.a();

            while ($$0 != null) {
               Either<epj, Exception> $$2 = eqr.this.a($$0, $$1);
               $$0 = eqr.this.f.a(() -> {
                  if ($$2.right().isPresent()) {
                     eqr.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (eqr.this.B.d()) {
                        eqr.this.J = eri.a(gcn.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     epj $$1x = (epj)$$2.left().get();

                     for (epi $$2x : $$1x.a) {
                        eqr.this.B.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (eqr.this.B.d()) {
                           String $$3 = gcn.a("mco.template.select.none", "%link");
                           eri.b $$4 = eri.b.a(gcn.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           eqr.this.J = eri.a($$3, $$4);
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

   Either<epj, Exception> a(epj $$0, eoa $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.C));
      } catch (epn var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.H = null;
      if (this.J != null) {
         this.a($$0, $$1, $$2, this.J);
      }

      if (this.I != null) {
         for (int $$4 = 0; $$4 < this.I.length; $$4++) {
            ur $$5 = this.I[$$4];
            $$0.a(this.i, $$5, this.g / 2, h(-1 + $$4), -6250336);
         }
      }
   }

   private void a(eub $$0, int $$1, int $$2, List<eri.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         eri.a $$5 = $$3.get($$4);
         int $$6 = h(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.i.b($$0x.a())).sum();
         int $$8 = this.g / 2 - $$7 / 2;

         for (eri.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.i, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(ur.b($$9.c()));
               this.H = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int G() {
      return this.I != null ? h(1) : 36;
   }

   class a extends evi.a<eqr.a> {
      private static final evz c = new evz(new agg("icon/link"), new agg("icon/link_highlighted"));
      private static final evz d = new evz(new agg("icon/video_link"), new agg("icon/video_link_highlighted"));
      private static final ur e = ur.c("mco.template.info.tooltip");
      private static final ur f = ur.c("mco.template.trailer.tooltip");
      public final epi a;
      private long g;
      @Nullable
      private euy h;
      @Nullable
      private euy i;

      public a(epi $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new euy(15, 15, c, eyz.b(eqr.this, $$0.e), e);
            this.h.a(evx.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new euy(15, 15, d, eyz.b(eqr.this, $$0.g), f);
            this.i.a(evx.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if ($$2 == 0) {
            eqr.this.G = this.a;
            eqr.this.C();
            if (ac.b() - this.g < 250L && this.aI_()) {
               eqr.this.A.accept(this.a);
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
      public void a(eub $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(erg.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(eqr.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = eqr.this.i.b(this.a.c);
         if (this.h != null) {
            this.h.b($$3 + $$4 - $$11 - this.h.k() - 10, $$2);
            this.h.a($$0, $$6, $$7, $$9);
         }

         if (this.i != null) {
            this.i.b($$3 + $$4 - $$11 - this.i.k() * 2 - 15, $$2);
            this.i.a($$0, $$6, $$7, $$9);
         }

         int $$12 = $$3 + 45 + 20;
         int $$13 = $$2 + 5;
         $$0.a(eqr.this.i, this.a.b, $$12, $$13, -1, false);
         $$0.a(eqr.this.i, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(eqr.this.i, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(eqr.this.i, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public ur a() {
         ur $$0 = uq.b(
            ur.b(this.a.b), ur.a("mco.template.select.narrate.authors", this.a.d), ur.b(this.a.h), ur.a("mco.template.select.narrate.version", this.a.c)
         );
         return ur.a("narrator.select", $$0);
      }
   }

   class b extends ghd<eqr.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<epi> $$0) {
         super(eqr.this.g, eqr.this.h, eqr.this.G(), eqr.this.h - 36, 46);
         $$0.forEach(this::a);
      }

      public void a(epi $$0) {
         this.a((eqr.a)(eqr.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (eqr.this.H != null) {
            eyz.a(eqr.this, eqr.this.H);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable eqr.a $$0) {
         super.a($$0);
         eqr.this.G = $$0 == null ? null : $$0.a;
         eqr.this.C();
      }

      @Override
      public int a() {
         return this.k() * 46;
      }

      @Override
      public int b() {
         return 300;
      }

      public boolean d() {
         return this.k() == 0;
      }

      public List<epi> e() {
         return this.i().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
