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

public class esk extends gjl {
   static final Logger a = LogUtils.getLogger();
   static final agt b = new agt("widget/slot_frame");
   private static final vb c = vb.c("mco.template.button.select");
   private static final vb v = vb.c("mco.template.button.trailer");
   private static final vb w = vb.c("mco.template.button.publisher");
   private static final int x = 100;
   private static final int y = 10;
   private final ezr z = new ezr(this);
   final Consumer<erb> A;
   esk.b B;
   private final eqk.d C;
   private ewh D;
   private ewh E;
   private ewh F;
   @Nullable
   erb G = null;
   @Nullable
   String H;
   @Nullable
   private vb[] I;
   @Nullable
   List<etb.a> J;

   public esk(vb $$0, Consumer<erb> $$1, eqk.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public esk(vb $$0, Consumer<erb> $$1, eqk.d $$2, @Nullable erc $$3) {
      super($$0);
      this.A = $$1;
      this.C = $$2;
      if ($$3 == null) {
         this.B = new esk.b();
         this.a(new erc(10));
      } else {
         this.B = new esk.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(vb... $$0) {
      this.I = $$0;
   }

   @Override
   public void aP_() {
      this.z.a(new exo(this.e, this.i));
      this.B = new esk.b(this.B.e());
      this.d(this.B);
      ezv $$0 = this.z.b(ezv.e().a(10));
      $$0.c().b();
      this.E = $$0.a(ewh.a(v, $$0x -> this.E()).a(100).a());
      this.D = $$0.a(ewh.a(c, $$0x -> this.D()).a(100).a());
      $$0.a(ewh.a(va.e, $$0x -> this.aF_()).a(100).a());
      this.F = $$0.a(ewh.a(w, $$0x -> this.F()).a(100).a());
      this.C();
      this.z.a($$1 -> {
         ewf var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.B.a(this.g, this.h, this.G(), this.h - this.z.b());
      this.z.a();
   }

   @Override
   public vb h() {
      List<vb> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.e);
      if (this.I != null) {
         $$0.addAll(Arrays.asList(this.I));
      }

      return va.a($$0);
   }

   @Override
   void C() {
      this.F.j = this.G != null && !this.G.e.isEmpty();
      this.E.j = this.G != null && !this.G.g.isEmpty();
      this.D.i = this.G != null;
   }

   @Override
   public void aF_() {
      this.A.accept(null);
   }

   private void D() {
      if (this.G != null) {
         this.A.accept(this.G);
      }
   }

   private void E() {
      if (this.G != null && !this.G.g.isBlank()) {
         fau.a(this, this.G.g);
      }
   }

   private void F() {
      if (this.G != null && !this.G.e.isBlank()) {
         fau.a(this, this.G.e);
      }
   }

   private void a(final erc $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            erc $$0 = $$0;
            ept $$1 = ept.a();

            while ($$0 != null) {
               Either<erc, Exception> $$2 = esk.this.a($$0, $$1);
               $$0 = esk.this.f.a(() -> {
                  if ($$2.right().isPresent()) {
                     esk.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (esk.this.B.d()) {
                        esk.this.J = etb.a(geu.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     erc $$1x = (erc)$$2.left().get();

                     for (erb $$2x : $$1x.a) {
                        esk.this.B.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (esk.this.B.d()) {
                           String $$3 = geu.a("mco.template.select.none", "%link");
                           etb.b $$4 = etb.b.a(geu.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           esk.this.J = etb.a($$3, $$4);
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

   Either<erc, Exception> a(erc $$0, ept $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.C));
      } catch (erg var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.H = null;
      if (this.J != null) {
         this.a($$0, $$1, $$2, this.J);
      }

      if (this.I != null) {
         for (int $$4 = 0; $$4 < this.I.length; $$4++) {
            vb $$5 = this.I[$$4];
            $$0.a(this.i, $$5, this.g / 2, h(-1 + $$4), -6250336);
         }
      }
   }

   private void a(evw $$0, int $$1, int $$2, List<etb.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         etb.a $$5 = $$3.get($$4);
         int $$6 = h(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.i.b($$0x.a())).sum();
         int $$8 = this.g / 2 - $$7 / 2;

         for (etb.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.i, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(vb.b($$9.c()));
               this.H = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int G() {
      return this.I != null ? h(1) : 36;
   }

   class a extends exd.a<esk.a> {
      private static final exu c = new exu(new agt("icon/link"), new agt("icon/link_highlighted"));
      private static final exu d = new exu(new agt("icon/video_link"), new agt("icon/video_link_highlighted"));
      private static final vb e = vb.c("mco.template.info.tooltip");
      private static final vb f = vb.c("mco.template.trailer.tooltip");
      public final erb a;
      private long g;
      @Nullable
      private ewt h;
      @Nullable
      private ewt i;

      public a(erb $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new ewt(15, 15, c, fau.b(esk.this, $$0.e), e);
            this.h.a(exs.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new ewt(15, 15, d, fau.b(esk.this, $$0.g), f);
            this.i.a(exs.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if ($$2 == 0) {
            esk.this.G = this.a;
            esk.this.C();
            if (ac.b() - this.g < 250L && this.aJ_()) {
               esk.this.A.accept(this.a);
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
      public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(esz.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(esk.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = esk.this.i.b(this.a.c);
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
         $$0.a(esk.this.i, this.a.b, $$12, $$13, -1, false);
         $$0.a(esk.this.i, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(esk.this.i, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(esk.this.i, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public vb a() {
         vb $$0 = va.b(
            vb.b(this.a.b), vb.a("mco.template.select.narrate.authors", this.a.d), vb.b(this.a.h), vb.a("mco.template.select.narrate.version", this.a.c)
         );
         return vb.a("narrator.select", $$0);
      }
   }

   class b extends gjk<esk.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<erb> $$0) {
         super(esk.this.g, esk.this.h, esk.this.G(), esk.this.h - 36, 46);
         $$0.forEach(this::a);
      }

      public void a(erb $$0) {
         this.a((esk.a)(esk.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (esk.this.H != null) {
            fau.a(esk.this, esk.this.H);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable esk.a $$0) {
         super.a($$0);
         esk.this.G = $$0 == null ? null : $$0.a;
         esk.this.C();
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

      public List<erb> e() {
         return this.i().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
