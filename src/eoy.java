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

public class eoy extends gfd {
   static final Logger a = LogUtils.getLogger();
   static final aey b = new aey("widget/slot_frame");
   private static final tn c = tn.c("mco.template.button.select");
   private static final tn y = tn.c("mco.template.button.trailer");
   private static final tn z = tn.c("mco.template.button.publisher");
   private static final int A = 100;
   private static final int B = 10;
   private final ewb C = new ewb(this);
   final Consumer<enp> D;
   eoy.b E;
   private final emy.c F;
   private ess G;
   private ess H;
   private ess I;
   @Nullable
   enp J = null;
   @Nullable
   String K;
   @Nullable
   private tn[] L;
   @Nullable
   List<epp.a> M;

   public eoy(tn $$0, Consumer<enp> $$1, emy.c $$2) {
      this($$0, $$1, $$2, null);
   }

   public eoy(tn $$0, Consumer<enp> $$1, emy.c $$2, @Nullable enq $$3) {
      super($$0);
      this.D = $$1;
      this.F = $$2;
      if ($$3 == null) {
         this.E = new eoy.b();
         this.a(new enq(10));
      } else {
         this.E = new eoy.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(tn... $$0) {
      this.L = $$0;
   }

   @Override
   public void aH_() {
      this.C.a(new ety(this.e, this.i));
      this.E = new eoy.b(this.E.e());
      this.d(this.E);
      ewf $$0 = this.C.b(ewf.e().a(10));
      $$0.c().b();
      this.H = $$0.a(ess.a(y, $$0x -> this.F()).a(100).a());
      this.G = $$0.a(ess.a(c, $$0x -> this.E()).a(100).a());
      $$0.a(ess.a(tm.e, $$0x -> this.az_()).a(100).a());
      this.I = $$0.a(ess.a(z, $$0x -> this.G()).a(100).a());
      this.D();
      this.C.a($$1 -> {
         esq var10000 = this.d($$1);
      });
      this.b();
   }

   @Override
   protected void b() {
      this.E.a(this.g, this.h, this.H(), this.h - this.C.b());
      this.C.a();
   }

   @Override
   public tn g() {
      List<tn> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.e);
      if (this.L != null) {
         $$0.addAll(Arrays.asList(this.L));
      }

      return tm.a($$0);
   }

   @Override
   void D() {
      this.I.j = this.J != null && !this.J.e.isEmpty();
      this.H.j = this.J != null && !this.J.g.isEmpty();
      this.G.i = this.J != null;
   }

   @Override
   public void az_() {
      this.D.accept(null);
   }

   private void E() {
      if (this.J != null) {
         this.D.accept(this.J);
      }
   }

   private void F() {
      if (this.J != null && !this.J.g.isBlank()) {
         this.f.a(new exe($$0 -> {
            if ($$0) {
               ac.i().a(this.J.g);
            }

            this.f.a(this);
         }, this.J.g, true));
      }
   }

   private void G() {
      if (this.J != null && !this.J.e.isBlank()) {
         exe.a(this.J.e, this, true);
      }
   }

   private void a(final enq $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            enq $$0 = $$0;
            emh $$1 = emh.a();

            while ($$0 != null) {
               Either<enq, Exception> $$2 = eoy.this.a($$0, $$1);
               $$0 = eoy.this.f.a(() -> {
                  if ($$2.right().isPresent()) {
                     eoy.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (eoy.this.E.d()) {
                        eoy.this.M = epp.a(gam.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     enq $$1x = (enq)$$2.left().get();

                     for (enp $$2x : $$1x.a) {
                        eoy.this.E.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (eoy.this.E.d()) {
                           String $$3 = gam.a("mco.template.select.none", "%link");
                           epp.b $$4 = epp.b.a(gam.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           eoy.this.M = epp.a($$3, $$4);
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

   Either<enq, Exception> a(enq $$0, emh $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.F));
      } catch (enu var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.K = null;
      if (this.M != null) {
         this.a($$0, $$1, $$2, this.M);
      }

      if (this.L != null) {
         for (int $$4 = 0; $$4 < this.L.length; $$4++) {
            tn $$5 = this.L[$$4];
            $$0.a(this.i, $$5, this.g / 2, h(-1 + $$4), -6250336);
         }
      }
   }

   private void a(esh $$0, int $$1, int $$2, List<epp.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         epp.a $$5 = $$3.get($$4);
         int $$6 = h(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.i.b($$0x.a())).sum();
         int $$8 = this.g / 2 - $$7 / 2;

         for (epp.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.i, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(tn.b($$9.c()));
               this.K = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int H() {
      return this.L != null ? h(1) : 36;
   }

   class a extends eto.a<eoy.a> {
      private static final eue c = new eue(new aey("icon/link"), new aey("icon/link_highlighted"));
      private static final eue d = new eue(new aey("icon/video_link"), new aey("icon/video_link_highlighted"));
      private static final tn e = tn.c("mco.template.info.tooltip");
      private static final tn f = tn.c("mco.template.trailer.tooltip");
      public final enp a;
      private long g;
      @Nullable
      private ete h;
      @Nullable
      private ete i;

      public a(enp $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new ete(15, 15, c, exe.b($$0.e, eoy.this, true), e);
            this.h.a(euc.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new ete(15, 15, d, exe.b($$0.g, eoy.this, true), f);
            this.i.a(euc.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if ($$2 == 0) {
            eoy.this.J = this.a;
            eoy.this.D();
            if (ac.b() - this.g < 250L && this.aC_()) {
               eoy.this.D.accept(this.a);
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
      public void a(esh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(epn.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(eoy.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = eoy.this.i.b(this.a.c);
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
         $$0.a(eoy.this.i, this.a.b, $$12, $$13, -1, false);
         $$0.a(eoy.this.i, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(eoy.this.i, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(eoy.this.i, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public tn a() {
         tn $$0 = tm.b(
            tn.b(this.a.b), tn.a("mco.template.select.narrate.authors", this.a.d), tn.b(this.a.h), tn.a("mco.template.select.narrate.version", this.a.c)
         );
         return tn.a("narrator.select", $$0);
      }
   }

   class b extends gfc<eoy.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<enp> $$0) {
         super(eoy.this.g, eoy.this.h, eoy.this.H(), eoy.this.h - 36, 46);
         $$0.forEach(this::a);
      }

      public void a(enp $$0) {
         this.a((eoy.a)(eoy.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (eoy.this.K != null) {
            exe.a(eoy.this.K, eoy.this, true);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable eoy.a $$0) {
         super.a($$0);
         eoy.this.J = $$0 == null ? null : $$0.a;
         eoy.this.D();
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

      public List<enp> e() {
         return this.i().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
