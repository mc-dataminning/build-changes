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

public class eow extends gfb {
   static final Logger a = LogUtils.getLogger();
   static final aex b = new aex("widget/slot_frame");
   private static final tl c = tl.c("mco.template.button.select");
   private static final tl y = tl.c("mco.template.button.trailer");
   private static final tl z = tl.c("mco.template.button.publisher");
   private static final int A = 100;
   private static final int B = 10;
   private final evz C = new evz(this);
   final Consumer<enn> D;
   eow.b E;
   private final emw.c F;
   private esq G;
   private esq H;
   private esq I;
   @Nullable
   enn J = null;
   @Nullable
   String K;
   @Nullable
   private tl[] L;
   @Nullable
   List<epn.a> M;

   public eow(tl $$0, Consumer<enn> $$1, emw.c $$2) {
      this($$0, $$1, $$2, null);
   }

   public eow(tl $$0, Consumer<enn> $$1, emw.c $$2, @Nullable eno $$3) {
      super($$0);
      this.D = $$1;
      this.F = $$2;
      if ($$3 == null) {
         this.E = new eow.b();
         this.a(new eno(10));
      } else {
         this.E = new eow.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(tl... $$0) {
      this.L = $$0;
   }

   @Override
   public void aI_() {
      this.C.a(new etw(this.e, this.i));
      this.E = new eow.b(this.E.e());
      this.d(this.E);
      ewd $$0 = this.C.b(ewd.e().a(10));
      $$0.c().b();
      this.H = $$0.a(esq.a(y, $$0x -> this.E()).a(100).a());
      this.G = $$0.a(esq.a(c, $$0x -> this.D()).a(100).a());
      $$0.a(esq.a(tk.e, $$0x -> this.az_()).a(100).a());
      this.I = $$0.a(esq.a(z, $$0x -> this.F()).a(100).a());
      this.C();
      this.C.a($$1 -> {
         eso var10000 = this.d($$1);
      });
      this.b();
   }

   @Override
   protected void b() {
      this.E.a(this.g, this.h, this.G(), this.h - this.C.b());
      this.C.a();
   }

   @Override
   public tl g() {
      List<tl> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.e);
      if (this.L != null) {
         $$0.addAll(Arrays.asList(this.L));
      }

      return tk.a($$0);
   }

   @Override
   void C() {
      this.I.j = this.J != null && !this.J.e.isEmpty();
      this.H.j = this.J != null && !this.J.g.isEmpty();
      this.G.i = this.J != null;
   }

   @Override
   public void az_() {
      this.D.accept(null);
   }

   private void D() {
      if (this.J != null) {
         this.D.accept(this.J);
      }
   }

   private void E() {
      if (this.J != null && !this.J.g.isBlank()) {
         this.f.a(new exc($$0 -> {
            if ($$0) {
               ac.i().a(this.J.g);
            }

            this.f.a(this);
         }, this.J.g, true));
      }
   }

   private void F() {
      if (this.J != null && !this.J.e.isBlank()) {
         exc.a(this.J.e, this, true);
      }
   }

   private void a(final eno $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            eno $$0 = $$0;
            emf $$1 = emf.a();

            while ($$0 != null) {
               Either<eno, Exception> $$2 = eow.this.a($$0, $$1);
               $$0 = eow.this.f.a(() -> {
                  if ($$2.right().isPresent()) {
                     eow.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (eow.this.E.d()) {
                        eow.this.M = epn.a(gak.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     eno $$1x = (eno)$$2.left().get();

                     for (enn $$2x : $$1x.a) {
                        eow.this.E.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (eow.this.E.d()) {
                           String $$3 = gak.a("mco.template.select.none", "%link");
                           epn.b $$4 = epn.b.a(gak.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           eow.this.M = epn.a($$3, $$4);
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

   Either<eno, Exception> a(eno $$0, emf $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.F));
      } catch (ens var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.K = null;
      if (this.M != null) {
         this.a($$0, $$1, $$2, this.M);
      }

      if (this.L != null) {
         for (int $$4 = 0; $$4 < this.L.length; $$4++) {
            tl $$5 = this.L[$$4];
            $$0.a(this.i, $$5, this.g / 2, h(-1 + $$4), -6250336);
         }
      }
   }

   private void a(esf $$0, int $$1, int $$2, List<epn.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         epn.a $$5 = $$3.get($$4);
         int $$6 = h(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.i.b($$0x.a())).sum();
         int $$8 = this.g / 2 - $$7 / 2;

         for (epn.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.i, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(tl.b($$9.c()));
               this.K = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int G() {
      return this.L != null ? h(1) : 36;
   }

   class a extends etm.a<eow.a> {
      private static final euc c = new euc(new aex("icon/link"), new aex("icon/link_highlighted"));
      private static final euc d = new euc(new aex("icon/video_link"), new aex("icon/video_link_highlighted"));
      private static final tl e = tl.c("mco.template.info.tooltip");
      private static final tl f = tl.c("mco.template.trailer.tooltip");
      public final enn a;
      private long g;
      @Nullable
      private etc h;
      @Nullable
      private etc i;

      public a(enn $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new etc(15, 15, c, exc.b($$0.e, eow.this, true), e);
            this.h.a(eua.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new etc(15, 15, d, exc.b($$0.g, eow.this, true), f);
            this.i.a(eua.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if ($$2 == 0) {
            eow.this.J = this.a;
            eow.this.C();
            if (ac.b() - this.g < 250L && this.aD_()) {
               eow.this.D.accept(this.a);
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
      public void a(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(epl.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(eow.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = eow.this.i.b(this.a.c);
         if (this.h != null) {
            this.h.b($$3 + $$4 - $$11 - this.h.l() - 10, $$2);
            this.h.a($$0, $$6, $$7, $$9);
         }

         if (this.i != null) {
            this.i.b($$3 + $$4 - $$11 - this.i.l() * 2 - 15, $$2);
            this.i.a($$0, $$6, $$7, $$9);
         }

         int $$12 = $$3 + 45 + 20;
         int $$13 = $$2 + 5;
         $$0.a(eow.this.i, this.a.b, $$12, $$13, -1, false);
         $$0.a(eow.this.i, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(eow.this.i, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(eow.this.i, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public tl a() {
         tl $$0 = tk.b(
            tl.b(this.a.b), tl.a("mco.template.select.narrate.authors", this.a.d), tl.b(this.a.h), tl.a("mco.template.select.narrate.version", this.a.c)
         );
         return tl.a("narrator.select", $$0);
      }
   }

   class b extends gfa<eow.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<enn> $$0) {
         super(eow.this.g, eow.this.h, eow.this.G(), eow.this.h - 36, 46);
         $$0.forEach(this::a);
      }

      public void a(enn $$0) {
         this.a((eow.a)(eow.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (eow.this.K != null) {
            exc.a(eow.this.K, eow.this, true);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable eow.a $$0) {
         super.a($$0);
         eow.this.J = $$0 == null ? null : $$0.a;
         eow.this.C();
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

      public List<enn> e() {
         return this.i().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
