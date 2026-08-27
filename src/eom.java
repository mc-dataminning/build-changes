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

public class eom extends ger {
   static final Logger a = LogUtils.getLogger();
   static final aer b = new aer("widget/slot_frame");
   private static final tf c = tf.c("mco.template.button.select");
   private static final tf y = tf.c("mco.template.button.trailer");
   private static final tf z = tf.c("mco.template.button.publisher");
   private static final int A = 100;
   private static final int B = 10;
   private final evp C = new evp(this);
   final Consumer<end> D;
   eom.b E;
   private final emm.c F;
   private esg G;
   private esg H;
   private esg I;
   @Nullable
   end J = null;
   @Nullable
   String K;
   @Nullable
   private tf[] L;
   @Nullable
   List<epd.a> M;

   public eom(tf $$0, Consumer<end> $$1, emm.c $$2) {
      this($$0, $$1, $$2, null);
   }

   public eom(tf $$0, Consumer<end> $$1, emm.c $$2, @Nullable ene $$3) {
      super($$0);
      this.D = $$1;
      this.F = $$2;
      if ($$3 == null) {
         this.E = new eom.b();
         this.a(new ene(10));
      } else {
         this.E = new eom.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(tf... $$0) {
      this.L = $$0;
   }

   @Override
   public void aC_() {
      this.C.a(new etm(this.e, this.i));
      this.E = new eom.b(this.E.e());
      this.d(this.E);
      evt $$0 = this.C.b(evt.e().a(10));
      $$0.c().b();
      this.H = $$0.a(esg.a(y, $$0x -> this.E()).a(100).a());
      this.G = $$0.a(esg.a(c, $$0x -> this.D()).a(100).a());
      $$0.a(esg.a(te.e, $$0x -> this.at_()).a(100).a());
      this.I = $$0.a(esg.a(z, $$0x -> this.F()).a(100).a());
      this.C();
      this.C.a($$1 -> {
         ese var10000 = this.d($$1);
      });
      this.b();
   }

   @Override
   protected void b() {
      this.E.a(this.g, this.h, this.G(), this.h - this.C.b());
      this.C.a();
   }

   @Override
   public tf e() {
      List<tf> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.e);
      if (this.L != null) {
         $$0.addAll(Arrays.asList(this.L));
      }

      return te.a($$0);
   }

   @Override
   void C() {
      this.I.j = this.J != null && !this.J.e.isEmpty();
      this.H.j = this.J != null && !this.J.g.isEmpty();
      this.G.i = this.J != null;
   }

   @Override
   public void at_() {
      this.D.accept(null);
   }

   private void D() {
      if (this.J != null) {
         this.D.accept(this.J);
      }
   }

   private void E() {
      if (this.J != null && !this.J.g.isBlank()) {
         this.f.a(new ews($$0 -> {
            if ($$0) {
               ac.i().a(this.J.g);
            }

            this.f.a(this);
         }, this.J.g, true));
      }
   }

   private void F() {
      if (this.J != null && !this.J.e.isBlank()) {
         ews.a(this.J.e, this, true);
      }
   }

   private void a(final ene $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            ene $$0 = $$0;
            elv $$1 = elv.a();

            while ($$0 != null) {
               Either<ene, Exception> $$2 = eom.this.a($$0, $$1);
               $$0 = eom.this.f.a(() -> {
                  if ($$2.right().isPresent()) {
                     eom.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (eom.this.E.d()) {
                        eom.this.M = epd.a(gaa.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     ene $$1x = (ene)$$2.left().get();

                     for (end $$2x : $$1x.a) {
                        eom.this.E.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (eom.this.E.d()) {
                           String $$3 = gaa.a("mco.template.select.none", "%link");
                           epd.b $$4 = epd.b.a(gaa.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           eom.this.M = epd.a($$3, $$4);
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

   Either<ene, Exception> a(ene $$0, elv $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.F));
      } catch (eni var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.K = null;
      if (this.M != null) {
         this.a($$0, $$1, $$2, this.M);
      }

      if (this.L != null) {
         for (int $$4 = 0; $$4 < this.L.length; $$4++) {
            tf $$5 = this.L[$$4];
            $$0.a(this.i, $$5, this.g / 2, h(-1 + $$4), -6250336);
         }
      }
   }

   private void a(erv $$0, int $$1, int $$2, List<epd.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         epd.a $$5 = $$3.get($$4);
         int $$6 = h(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.i.b($$0x.a())).sum();
         int $$8 = this.g / 2 - $$7 / 2;

         for (epd.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.i, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(tf.b($$9.c()));
               this.K = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int G() {
      return this.L != null ? h(1) : 36;
   }

   class a extends etc.a<eom.a> {
      private static final ets c = new ets(new aer("icon/link"), new aer("icon/link_highlighted"));
      private static final ets d = new ets(new aer("icon/video_link"), new aer("icon/video_link_highlighted"));
      private static final tf e = tf.c("mco.template.info.tooltip");
      private static final tf f = tf.c("mco.template.trailer.tooltip");
      public final end a;
      private long g;
      @Nullable
      private ess h;
      @Nullable
      private ess i;

      public a(end $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new ess(15, 15, c, ews.b($$0.e, eom.this, true), e);
            this.h.a(etq.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new ess(15, 15, d, ews.b($$0.g, eom.this, true), f);
            this.i.a(etq.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if ($$2 == 0) {
            eom.this.J = this.a;
            eom.this.C();
            if (ac.b() - this.g < 250L && this.aw_()) {
               eom.this.D.accept(this.a);
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
      public void a(erv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(epb.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(eom.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = eom.this.i.b(this.a.c);
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
         $$0.a(eom.this.i, this.a.b, $$12, $$13, -1, false);
         $$0.a(eom.this.i, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(eom.this.i, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(eom.this.i, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public tf a() {
         tf $$0 = te.b(
            tf.b(this.a.b), tf.a("mco.template.select.narrate.authors", this.a.d), tf.b(this.a.h), tf.a("mco.template.select.narrate.version", this.a.c)
         );
         return tf.a("narrator.select", $$0);
      }
   }

   class b extends geq<eom.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<end> $$0) {
         super(eom.this.g, eom.this.h, eom.this.G(), eom.this.h - 36, 46);
         $$0.forEach(this::a);
      }

      public void a(end $$0) {
         this.a((eom.a)(eom.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if ($$2 == 0 && eom.this.K != null) {
            ews.a(eom.this.K, eom.this, true);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable eom.a $$0) {
         super.a($$0);
         eom.this.J = $$0 == null ? null : $$0.a;
         eom.this.C();
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

      public List<end> e() {
         return this.i().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
