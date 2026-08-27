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

public class epo extends gfx {
   static final Logger a = LogUtils.getLogger();
   static final afw b = new afw("widget/slot_frame");
   private static final ui c = ui.c("mco.template.button.select");
   private static final ui y = ui.c("mco.template.button.trailer");
   private static final ui z = ui.c("mco.template.button.publisher");
   private static final int A = 100;
   private static final int B = 10;
   private final ewt C = new ewt(this);
   final Consumer<eof> D;
   epo.b E;
   private final eno.d F;
   private etj G;
   private etj H;
   private etj I;
   @Nullable
   eof J = null;
   @Nullable
   String K;
   @Nullable
   private ui[] L;
   @Nullable
   List<eqf.a> M;

   public epo(ui $$0, Consumer<eof> $$1, eno.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public epo(ui $$0, Consumer<eof> $$1, eno.d $$2, @Nullable eog $$3) {
      super($$0);
      this.D = $$1;
      this.F = $$2;
      if ($$3 == null) {
         this.E = new epo.b();
         this.a(new eog(10));
      } else {
         this.E = new epo.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(ui... $$0) {
      this.L = $$0;
   }

   @Override
   public void aM_() {
      this.C.a(new euq(this.e, this.i));
      this.E = new epo.b(this.E.e());
      this.d(this.E);
      ewx $$0 = this.C.b(ewx.e().a(10));
      $$0.c().b();
      this.H = $$0.a(etj.a(y, $$0x -> this.E()).a(100).a());
      this.G = $$0.a(etj.a(c, $$0x -> this.D()).a(100).a());
      $$0.a(etj.a(uh.e, $$0x -> this.aC_()).a(100).a());
      this.I = $$0.a(etj.a(z, $$0x -> this.F()).a(100).a());
      this.C();
      this.C.a($$1 -> {
         eth var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.E.a(this.g, this.h, this.G(), this.h - this.C.b());
      this.C.a();
   }

   @Override
   public ui h() {
      List<ui> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.e);
      if (this.L != null) {
         $$0.addAll(Arrays.asList(this.L));
      }

      return uh.a($$0);
   }

   @Override
   void C() {
      this.I.j = this.J != null && !this.J.e.isEmpty();
      this.H.j = this.J != null && !this.J.g.isEmpty();
      this.G.i = this.J != null;
   }

   @Override
   public void aC_() {
      this.D.accept(null);
   }

   private void D() {
      if (this.J != null) {
         this.D.accept(this.J);
      }
   }

   private void E() {
      if (this.J != null && !this.J.g.isBlank()) {
         this.f.a(new exw($$0 -> {
            if ($$0) {
               ac.i().a(this.J.g);
            }

            this.f.a(this);
         }, this.J.g, true));
      }
   }

   private void F() {
      if (this.J != null && !this.J.e.isBlank()) {
         exw.a(this.J.e, this, true);
      }
   }

   private void a(final eog $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            eog $$0 = $$0;
            emx $$1 = emx.a();

            while ($$0 != null) {
               Either<eog, Exception> $$2 = epo.this.a($$0, $$1);
               $$0 = epo.this.f.a(() -> {
                  if ($$2.right().isPresent()) {
                     epo.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (epo.this.E.d()) {
                        epo.this.M = eqf.a(gbg.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     eog $$1x = (eog)$$2.left().get();

                     for (eof $$2x : $$1x.a) {
                        epo.this.E.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (epo.this.E.d()) {
                           String $$3 = gbg.a("mco.template.select.none", "%link");
                           eqf.b $$4 = eqf.b.a(gbg.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           epo.this.M = eqf.a($$3, $$4);
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

   Either<eog, Exception> a(eog $$0, emx $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.F));
      } catch (eok var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.K = null;
      if (this.M != null) {
         this.a($$0, $$1, $$2, this.M);
      }

      if (this.L != null) {
         for (int $$4 = 0; $$4 < this.L.length; $$4++) {
            ui $$5 = this.L[$$4];
            $$0.a(this.i, $$5, this.g / 2, h(-1 + $$4), -6250336);
         }
      }
   }

   private void a(esy $$0, int $$1, int $$2, List<eqf.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         eqf.a $$5 = $$3.get($$4);
         int $$6 = h(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.i.b($$0x.a())).sum();
         int $$8 = this.g / 2 - $$7 / 2;

         for (eqf.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.i, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(ui.b($$9.c()));
               this.K = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int G() {
      return this.L != null ? h(1) : 36;
   }

   class a extends euf.a<epo.a> {
      private static final euw c = new euw(new afw("icon/link"), new afw("icon/link_highlighted"));
      private static final euw d = new euw(new afw("icon/video_link"), new afw("icon/video_link_highlighted"));
      private static final ui e = ui.c("mco.template.info.tooltip");
      private static final ui f = ui.c("mco.template.trailer.tooltip");
      public final eof a;
      private long g;
      @Nullable
      private etv h;
      @Nullable
      private etv i;

      public a(eof $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new etv(15, 15, c, exw.b($$0.e, epo.this, true), e);
            this.h.a(euu.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new etv(15, 15, d, exw.b($$0.g, epo.this, true), f);
            this.i.a(euu.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if ($$2 == 0) {
            epo.this.J = this.a;
            epo.this.C();
            if (ac.b() - this.g < 250L && this.aG_()) {
               epo.this.D.accept(this.a);
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
      public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(eqd.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(epo.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = epo.this.i.b(this.a.c);
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
         $$0.a(epo.this.i, this.a.b, $$12, $$13, -1, false);
         $$0.a(epo.this.i, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(epo.this.i, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(epo.this.i, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public ui a() {
         ui $$0 = uh.b(
            ui.b(this.a.b), ui.a("mco.template.select.narrate.authors", this.a.d), ui.b(this.a.h), ui.a("mco.template.select.narrate.version", this.a.c)
         );
         return ui.a("narrator.select", $$0);
      }
   }

   class b extends gfw<epo.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<eof> $$0) {
         super(epo.this.g, epo.this.h, epo.this.G(), epo.this.h - 36, 46);
         $$0.forEach(this::a);
      }

      public void a(eof $$0) {
         this.a((epo.a)(epo.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (epo.this.K != null) {
            exw.a(epo.this.K, epo.this, true);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable epo.a $$0) {
         super.a($$0);
         epo.this.J = $$0 == null ? null : $$0.a;
         epo.this.C();
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

      public List<eof> e() {
         return this.i().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
