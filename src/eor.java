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

public class eor extends gew {
   static final Logger a = LogUtils.getLogger();
   static final aeu b = new aeu("widget/slot_frame");
   private static final ti c = ti.c("mco.template.button.select");
   private static final ti y = ti.c("mco.template.button.trailer");
   private static final ti z = ti.c("mco.template.button.publisher");
   private static final int A = 100;
   private static final int B = 10;
   private final evu C = new evu(this);
   final Consumer<eni> D;
   eor.b E;
   private final emr.c F;
   private esl G;
   private esl H;
   private esl I;
   @Nullable
   eni J = null;
   @Nullable
   String K;
   @Nullable
   private ti[] L;
   @Nullable
   List<epi.a> M;

   public eor(ti $$0, Consumer<eni> $$1, emr.c $$2) {
      this($$0, $$1, $$2, null);
   }

   public eor(ti $$0, Consumer<eni> $$1, emr.c $$2, @Nullable enj $$3) {
      super($$0);
      this.D = $$1;
      this.F = $$2;
      if ($$3 == null) {
         this.E = new eor.b();
         this.a(new enj(10));
      } else {
         this.E = new eor.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(ti... $$0) {
      this.L = $$0;
   }

   @Override
   public void aD_() {
      this.C.a(new etr(this.e, this.i));
      this.E = new eor.b(this.E.e());
      this.d(this.E);
      evy $$0 = this.C.b(evy.e().a(10));
      $$0.c().b();
      this.H = $$0.a(esl.a(y, $$0x -> this.E()).a(100).a());
      this.G = $$0.a(esl.a(c, $$0x -> this.D()).a(100).a());
      $$0.a(esl.a(th.e, $$0x -> this.au_()).a(100).a());
      this.I = $$0.a(esl.a(z, $$0x -> this.F()).a(100).a());
      this.C();
      this.C.a($$1 -> {
         esj var10000 = this.d($$1);
      });
      this.b();
   }

   @Override
   protected void b() {
      this.E.a(this.g, this.h, this.G(), this.h - this.C.b());
      this.C.a();
   }

   @Override
   public ti g() {
      List<ti> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.e);
      if (this.L != null) {
         $$0.addAll(Arrays.asList(this.L));
      }

      return th.a($$0);
   }

   @Override
   void C() {
      this.I.j = this.J != null && !this.J.e.isEmpty();
      this.H.j = this.J != null && !this.J.g.isEmpty();
      this.G.i = this.J != null;
   }

   @Override
   public void au_() {
      this.D.accept(null);
   }

   private void D() {
      if (this.J != null) {
         this.D.accept(this.J);
      }
   }

   private void E() {
      if (this.J != null && !this.J.g.isBlank()) {
         this.f.a(new ewx($$0 -> {
            if ($$0) {
               ac.i().a(this.J.g);
            }

            this.f.a(this);
         }, this.J.g, true));
      }
   }

   private void F() {
      if (this.J != null && !this.J.e.isBlank()) {
         ewx.a(this.J.e, this, true);
      }
   }

   private void a(final enj $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            enj $$0 = $$0;
            ema $$1 = ema.a();

            while ($$0 != null) {
               Either<enj, Exception> $$2 = eor.this.a($$0, $$1);
               $$0 = eor.this.f.a(() -> {
                  if ($$2.right().isPresent()) {
                     eor.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (eor.this.E.d()) {
                        eor.this.M = epi.a(gaf.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     enj $$1x = (enj)$$2.left().get();

                     for (eni $$2x : $$1x.a) {
                        eor.this.E.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (eor.this.E.d()) {
                           String $$3 = gaf.a("mco.template.select.none", "%link");
                           epi.b $$4 = epi.b.a(gaf.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           eor.this.M = epi.a($$3, $$4);
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

   Either<enj, Exception> a(enj $$0, ema $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.F));
      } catch (enn var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.K = null;
      if (this.M != null) {
         this.a($$0, $$1, $$2, this.M);
      }

      if (this.L != null) {
         for (int $$4 = 0; $$4 < this.L.length; $$4++) {
            ti $$5 = this.L[$$4];
            $$0.a(this.i, $$5, this.g / 2, h(-1 + $$4), -6250336);
         }
      }
   }

   private void a(esa $$0, int $$1, int $$2, List<epi.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         epi.a $$5 = $$3.get($$4);
         int $$6 = h(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.i.b($$0x.a())).sum();
         int $$8 = this.g / 2 - $$7 / 2;

         for (epi.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.i, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(ti.b($$9.c()));
               this.K = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int G() {
      return this.L != null ? h(1) : 36;
   }

   class a extends eth.a<eor.a> {
      private static final etx c = new etx(new aeu("icon/link"), new aeu("icon/link_highlighted"));
      private static final etx d = new etx(new aeu("icon/video_link"), new aeu("icon/video_link_highlighted"));
      private static final ti e = ti.c("mco.template.info.tooltip");
      private static final ti f = ti.c("mco.template.trailer.tooltip");
      public final eni a;
      private long g;
      @Nullable
      private esx h;
      @Nullable
      private esx i;

      public a(eni $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new esx(15, 15, c, ewx.b($$0.e, eor.this, true), e);
            this.h.a(etv.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new esx(15, 15, d, ewx.b($$0.g, eor.this, true), f);
            this.i.a(etv.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if ($$2 == 0) {
            eor.this.J = this.a;
            eor.this.C();
            if (ac.b() - this.g < 250L && this.ay_()) {
               eor.this.D.accept(this.a);
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
      public void a(esa $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(epg.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(eor.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = eor.this.i.b(this.a.c);
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
         $$0.a(eor.this.i, this.a.b, $$12, $$13, -1, false);
         $$0.a(eor.this.i, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(eor.this.i, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(eor.this.i, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public ti a() {
         ti $$0 = th.b(
            ti.b(this.a.b), ti.a("mco.template.select.narrate.authors", this.a.d), ti.b(this.a.h), ti.a("mco.template.select.narrate.version", this.a.c)
         );
         return ti.a("narrator.select", $$0);
      }
   }

   class b extends gev<eor.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<eni> $$0) {
         super(eor.this.g, eor.this.h, eor.this.G(), eor.this.h - 36, 46);
         $$0.forEach(this::a);
      }

      public void a(eni $$0) {
         this.a((eor.a)(eor.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (eor.this.K != null) {
            ewx.a(eor.this.K, eor.this, true);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable eor.a $$0) {
         super.a($$0);
         eor.this.J = $$0 == null ? null : $$0.a;
         eor.this.C();
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

      public List<eni> e() {
         return this.i().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
