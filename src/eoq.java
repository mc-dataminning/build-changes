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

public class eoq extends gex {
   static final Logger a = LogUtils.getLogger();
   static final aez b = new aez("widget/slot_frame");
   private static final tl c = tl.c("mco.template.button.select");
   private static final tl y = tl.c("mco.template.button.trailer");
   private static final tl z = tl.c("mco.template.button.publisher");
   private static final int A = 100;
   private static final int B = 10;
   private final evu C = new evu(this);
   final Consumer<enh> D;
   eoq.b E;
   private final emq.c F;
   private esk G;
   private esk H;
   private esk I;
   @Nullable
   enh J = null;
   @Nullable
   String K;
   @Nullable
   private tl[] L;
   @Nullable
   List<eph.a> M;

   public eoq(tl $$0, Consumer<enh> $$1, emq.c $$2) {
      this($$0, $$1, $$2, null);
   }

   public eoq(tl $$0, Consumer<enh> $$1, emq.c $$2, @Nullable eni $$3) {
      super($$0);
      this.D = $$1;
      this.F = $$2;
      if ($$3 == null) {
         this.E = new eoq.b();
         this.a(new eni(10));
      } else {
         this.E = new eoq.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(tl... $$0) {
      this.L = $$0;
   }

   @Override
   public void aH_() {
      this.C.a(new etr(this.e, this.i));
      this.E = new eoq.b(this.E.e());
      this.d(this.E);
      evy $$0 = this.C.b(evy.e().a(10));
      $$0.c().b();
      this.H = $$0.a(esk.a(y, $$0x -> this.F()).a(100).a());
      this.G = $$0.a(esk.a(c, $$0x -> this.E()).a(100).a());
      $$0.a(esk.a(tk.e, $$0x -> this.az_()).a(100).a());
      this.I = $$0.a(esk.a(z, $$0x -> this.G()).a(100).a());
      this.D();
      this.C.a($$1 -> {
         esi var10000 = this.d($$1);
      });
      this.b();
   }

   @Override
   protected void b() {
      this.E.a(this.g, this.h, this.H(), this.h - this.C.b());
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
         this.f.a(new ewx($$0 -> {
            if ($$0) {
               ac.i().a(this.J.g);
            }

            this.f.a(this);
         }, this.J.g, true));
      }
   }

   private void G() {
      if (this.J != null && !this.J.e.isBlank()) {
         ewx.a(this.J.e, this, true);
      }
   }

   private void a(final eni $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            eni $$0 = $$0;
            elz $$1 = elz.a();

            while ($$0 != null) {
               Either<eni, Exception> $$2 = eoq.this.a($$0, $$1);
               $$0 = eoq.this.f.a(() -> {
                  if ($$2.right().isPresent()) {
                     eoq.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (eoq.this.E.d()) {
                        eoq.this.M = eph.a(gag.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     eni $$1x = (eni)$$2.left().get();

                     for (enh $$2x : $$1x.a) {
                        eoq.this.E.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (eoq.this.E.d()) {
                           String $$3 = gag.a("mco.template.select.none", "%link");
                           eph.b $$4 = eph.b.a(gag.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           eoq.this.M = eph.a($$3, $$4);
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

   Either<eni, Exception> a(eni $$0, elz $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.F));
      } catch (enm var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
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

   private void a(erz $$0, int $$1, int $$2, List<eph.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         eph.a $$5 = $$3.get($$4);
         int $$6 = h(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.i.b($$0x.a())).sum();
         int $$8 = this.g / 2 - $$7 / 2;

         for (eph.b $$9 : $$5.a) {
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

   int H() {
      return this.L != null ? h(1) : 36;
   }

   class a extends etg.a<eoq.a> {
      private static final etx c = new etx(new aez("icon/link"), new aez("icon/link_highlighted"));
      private static final etx d = new etx(new aez("icon/video_link"), new aez("icon/video_link_highlighted"));
      private static final tl e = tl.c("mco.template.info.tooltip");
      private static final tl f = tl.c("mco.template.trailer.tooltip");
      public final enh a;
      private long g;
      @Nullable
      private esw h;
      @Nullable
      private esw i;

      public a(enh $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new esw(15, 15, c, ewx.b($$0.e, eoq.this, true), e);
            this.h.a(etv.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new esw(15, 15, d, ewx.b($$0.g, eoq.this, true), f);
            this.i.a(etv.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if ($$2 == 0) {
            eoq.this.J = this.a;
            eoq.this.D();
            if (ac.b() - this.g < 250L && this.aC_()) {
               eoq.this.D.accept(this.a);
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
      public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(epf.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(eoq.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = eoq.this.i.b(this.a.c);
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
         $$0.a(eoq.this.i, this.a.b, $$12, $$13, -1, false);
         $$0.a(eoq.this.i, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(eoq.this.i, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(eoq.this.i, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
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

   class b extends gew<eoq.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<enh> $$0) {
         super(eoq.this.g, eoq.this.h, eoq.this.H(), eoq.this.h - 36, 46);
         $$0.forEach(this::a);
      }

      public void a(enh $$0) {
         this.a((eoq.a)(eoq.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (eoq.this.K != null) {
            ewx.a(eoq.this.K, eoq.this, true);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable eoq.a $$0) {
         super.a($$0);
         eoq.this.J = $$0 == null ? null : $$0.a;
         eoq.this.D();
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

      public List<enh> e() {
         return this.i().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
