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

public class eon extends gei {
   static final aer a = new aer("widget/slot_frame");
   static final aer b = new aer("icon/link_highlighted");
   static final aer c = new aer("icon/link");
   static final aer y = new aer("icon/video_link_highlighted");
   static final aer z = new aer("icon/video_link");
   static final Logger A = LogUtils.getLogger();
   static final tf B = tf.c("mco.template.info.tooltip");
   static final tf C = tf.c("mco.template.trailer.tooltip");
   private final Consumer<ene> D;
   eon.b E;
   int F = -1;
   private esh G;
   private esh H;
   private esh I;
   @Nullable
   tf J;
   @Nullable
   String K;
   private final emn.c L;
   int M;
   @Nullable
   tf[] N;
   @Nullable
   List<epe.a> O;

   public eon(tf $$0, Consumer<ene> $$1, emn.c $$2) {
      this($$0, $$1, $$2, null);
   }

   public eon(tf $$0, Consumer<ene> $$1, emn.c $$2, @Nullable enf $$3) {
      super($$0);
      this.D = $$1;
      this.L = $$2;
      if ($$3 == null) {
         this.E = new eon.b();
         this.a(new enf(10));
      } else {
         this.E = new eon.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(tf... $$0) {
      this.N = $$0;
   }

   @Override
   public void aE_() {
      this.E = new eon.b(this.E.e());
      this.H = this.d((esh)esh.a(tf.c("mco.template.button.trailer"), $$0x -> this.I()).a(this.g / 2 - 206, this.h - 32, 100, 20).a());
      this.G = this.d((esh)esh.a(tf.c("mco.template.button.select"), $$0x -> this.G()).a(this.g / 2 - 100, this.h - 32, 100, 20).a());
      tf $$0 = this.L == emn.c.b ? te.e : te.k;
      esh $$1 = esh.a($$0, $$0x -> this.au_()).a(this.g / 2 + 6, this.h - 32, 100, 20).a();
      this.d((esh)$$1);
      this.I = this.d((esh)esh.a(tf.c("mco.template.button.publisher"), $$0x -> this.J()).a(this.g / 2 + 112, this.h - 32, 100, 20).a());
      this.G.i = false;
      this.H.j = false;
      this.I.j = false;
      this.e(this.E);
      this.b(this.E);
   }

   @Override
   public tf e() {
      List<tf> $$0 = Lists.newArrayListWithCapacity(2);
      if (this.e != null) {
         $$0.add(this.e);
      }

      if (this.N != null) {
         $$0.addAll(Arrays.asList(this.N));
      }

      return te.a($$0);
   }

   @Override
   void B() {
      this.I.j = this.D();
      this.H.j = this.F();
      this.G.i = this.C();
   }

   private boolean C() {
      return this.F != -1;
   }

   private boolean D() {
      return this.F != -1 && !this.E().e.isEmpty();
   }

   private ene E() {
      return this.E.b(this.F);
   }

   private boolean F() {
      return this.F != -1 && !this.E().g.isEmpty();
   }

   @Override
   public void c() {
      super.c();
      this.M--;
      if (this.M < 0) {
         this.M = 0;
      }
   }

   @Override
   public void au_() {
      this.D.accept(null);
   }

   void G() {
      if (this.H()) {
         this.D.accept(this.E());
      }
   }

   private boolean H() {
      return this.F >= 0 && this.F < this.E.k();
   }

   private void I() {
      if (this.H()) {
         ene $$0 = this.E();
         if (!"".equals($$0.g)) {
            ac.i().a($$0.g);
         }
      }
   }

   private void J() {
      if (this.H()) {
         ene $$0 = this.E();
         if (!"".equals($$0.e)) {
            ac.i().a($$0.e);
         }
      }
   }

   private void a(final enf $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            enf $$0 = $$0;
            elw $$1 = elw.a();

            while ($$0 != null) {
               Either<enf, Exception> $$2 = eon.this.a($$0, $$1);
               $$0 = eon.this.f.a(() -> {
                  if ($$2.right().isPresent()) {
                     eon.A.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (eon.this.E.d()) {
                        eon.this.O = epe.a(fzr.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     enf $$1x = (enf)$$2.left().get();

                     for (ene $$2x : $$1x.a) {
                        eon.this.E.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (eon.this.E.d()) {
                           String $$3 = fzr.a("mco.template.select.none", "%link");
                           epe.b $$4 = epe.b.a(fzr.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           eon.this.O = epe.a($$3, $$4);
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

   Either<enf, Exception> a(enf $$0, elw $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.L));
      } catch (enj var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.J = null;
      this.K = null;
      this.E.a($$0, $$1, $$2, $$3);
      if (this.O != null) {
         this.a($$0, $$1, $$2, this.O);
      }

      $$0.a(this.i, this.e, this.g / 2, 13, -1);
      if (this.N != null) {
         for (int $$4 = 0; $$4 < this.N.length; $$4++) {
            tf $$5 = this.N[$$4];
            $$0.a(this.i, $$5, this.g / 2, h(-1 + $$4), -6250336);
         }
      }

      if (this.J != null) {
         $$0.a(this.i, this.J, $$1, $$2);
      }
   }

   private void a(erw $$0, int $$1, int $$2, List<epe.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         epe.a $$5 = $$3.get($$4);
         int $$6 = h(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.i.b($$0x.a())).sum();
         int $$8 = this.g / 2 - $$7 / 2;

         for (epe.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.i, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.J = tf.b($$9.c());
               this.K = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   class a extends etd.a<eon.a> {
      final ene b;

      public a(ene $$0) {
         this.b = $$0;
      }

      @Override
      public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.b, $$3, $$2, $$6, $$7);
      }

      private void a(erw $$0, ene $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 + 45 + 20;
         $$0.a(eon.this.i, $$1.b, $$6, $$3 + 2, -1, false);
         $$0.a(eon.this.i, $$1.d, $$6, $$3 + 15, 7105644, false);
         $$0.a(eon.this.i, $$1.c, $$6 + 227 - eon.this.i.b($$1.c), $$3 + 1, 7105644, false);
         if (!"".equals($$1.e) || !"".equals($$1.g) || !"".equals($$1.h)) {
            this.a($$0, $$6 - 1, $$3 + 25, $$4, $$5, $$1.e, $$1.g, $$1.h);
         }

         this.a($$0, $$2, $$3 + 1, $$4, $$5, $$1);
      }

      private void a(erw $$0, int $$1, int $$2, int $$3, int $$4, ene $$5) {
         $$0.a(epc.a($$5.a, $$5.f), $$1 + 1, $$2 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(eon.a, $$1, $$2, 40, 40);
      }

      private void a(erw $$0, int $$1, int $$2, int $$3, int $$4, String $$5, String $$6, String $$7) {
         if (!"".equals($$7)) {
            $$0.a(eon.this.i, $$7, $$1, $$2 + 4, 5000268, false);
         }

         int $$8 = "".equals($$7) ? 0 : eon.this.i.b($$7) + 2;
         boolean $$9 = false;
         boolean $$10 = false;
         boolean $$11 = "".equals($$5);
         if ($$3 >= $$1 + $$8 && $$3 <= $$1 + $$8 + 32 && $$4 >= $$2 && $$4 <= $$2 + 15 && $$4 < eon.this.h - 15 && $$4 > 32) {
            if ($$3 <= $$1 + 15 + $$8 && $$3 > $$8) {
               if ($$11) {
                  $$10 = true;
               } else {
                  $$9 = true;
               }
            } else if (!$$11) {
               $$10 = true;
            }
         }

         if (!$$11) {
            $$0.a($$9 ? eon.b : eon.c, $$1 + $$8, $$2, 15, 15);
         }

         if (!"".equals($$6)) {
            int $$12 = $$1 + $$8 + ($$11 ? 0 : 17);
            $$0.a($$10 ? eon.y : eon.z, $$12, $$2, 15, 15);
         }

         if ($$9) {
            eon.this.J = eon.B;
            eon.this.K = $$5;
         } else if ($$10 && !"".equals($$6)) {
            eon.this.J = eon.C;
            eon.this.K = $$6;
         }
      }

      @Override
      public tf a() {
         tf $$0 = te.b(
            tf.b(this.b.b), tf.a("mco.template.select.narrate.authors", this.b.d), tf.b(this.b.h), tf.a("mco.template.select.narrate.version", this.b.c)
         );
         return tf.a("narrator.select", $$0);
      }
   }

   class b extends geh<eon.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<ene> $$0) {
         super(eon.this.g, eon.this.h, eon.this.N != null ? eon.h(1) : 32, eon.this.h - 40, 46);
         $$0.forEach(this::a);
      }

      public void a(ene $$0) {
         this.a((eon.a)(eon.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if ($$2 == 0 && $$1 >= (double)this.g && $$1 <= (double)this.h) {
            int $$3 = this.e / 2 - 150;
            if (eon.this.K != null) {
               ac.i().a(eon.this.K);
            }

            int $$4 = (int)Math.floor($$1 - (double)this.g) - this.l + (int)this.l() - 4;
            int $$5 = $$4 / this.d;
            if ($$0 >= (double)$$3 && $$0 < (double)this.c() && $$5 >= 0 && $$4 >= 0 && $$5 < this.k()) {
               this.a($$5);
               this.a($$4, $$5, $$0, $$1, this.e, $$2);
               if ($$5 >= eon.this.E.k()) {
                  return super.a($$0, $$1, $$2);
               }

               eon.this.M += 7;
               if (eon.this.M >= 10) {
                  eon.this.G();
               }

               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      public void a(@Nullable eon.a $$0) {
         super.a($$0);
         eon.this.F = this.i().indexOf($$0);
         eon.this.B();
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

      public ene b(int $$0) {
         return this.i().get($$0).b;
      }

      public List<ene> e() {
         return this.i().stream().map($$0 -> $$0.b).collect(Collectors.toList());
      }
   }
}
