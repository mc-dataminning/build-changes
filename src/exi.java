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

public class exi extends gpe {
   static final Logger a = LogUtils.getLogger();
   static final ajh b = new ajh("widget/slot_frame");
   private static final vu c = vu.c("mco.template.button.select");
   private static final vu v = vu.c("mco.template.button.trailer");
   private static final vu w = vu.c("mco.template.button.publisher");
   private static final int x = 100;
   private static final int y = 10;
   private final fev z = new fev(this);
   final Consumer<evz> A;
   exi.b B;
   private final evi.d C;
   private fbi D;
   private fbi E;
   private fbi F;
   @Nullable
   evz G = null;
   @Nullable
   String H;
   @Nullable
   private vu[] I;
   @Nullable
   List<exz.a> J;

   public exi(vu $$0, Consumer<evz> $$1, evi.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public exi(vu $$0, Consumer<evz> $$1, evi.d $$2, @Nullable ewa $$3) {
      super($$0);
      this.A = $$1;
      this.C = $$2;
      if ($$3 == null) {
         this.B = new exi.b();
         this.a(new ewa(10));
      } else {
         this.B = new exi.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(vu... $$0) {
      this.I = $$0;
   }

   @Override
   public void aO_() {
      this.z.a(new fcp(this.e, this.i));
      this.B = this.z.c(new exi.b(this.B.e()));
      fez $$0 = this.z.b(fez.e().a(10));
      $$0.c().b();
      this.E = $$0.a(fbi.a(v, $$0x -> this.I()).a(100).a());
      this.D = $$0.a(fbi.a(c, $$0x -> this.H()).a(100).a());
      $$0.a(fbi.a(vt.e, $$0x -> this.d()).a(100).a());
      this.F = $$0.a(fbi.a(w, $$0x -> this.J()).a(100).a());
      this.E();
      this.z.a($$1 -> {
         fbg var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.B.b(this.g, this.h - this.z.b() - this.K());
      this.z.a();
   }

   @Override
   public vu i() {
      List<vu> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.e);
      if (this.I != null) {
         $$0.addAll(Arrays.asList(this.I));
      }

      return vt.a($$0);
   }

   void E() {
      this.F.k = this.G != null && !this.G.e.isEmpty();
      this.E.k = this.G != null && !this.G.g.isEmpty();
      this.D.j = this.G != null;
   }

   @Override
   public void d() {
      this.A.accept(null);
   }

   private void H() {
      if (this.G != null) {
         this.A.accept(this.G);
      }
   }

   private void I() {
      if (this.G != null && !this.G.g.isBlank()) {
         ffy.a(this, this.G.g);
      }
   }

   private void J() {
      if (this.G != null && !this.G.e.isBlank()) {
         ffy.a(this, this.G.e);
      }
   }

   private void a(final ewa $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            ewa $$0 = $$0;
            eur $$1 = eur.a();

            while ($$0 != null) {
               Either<ewa, Exception> $$2 = exi.this.a($$0, $$1);
               $$0 = exi.this.f.a(() -> {
                  if ($$2.right().isPresent()) {
                     exi.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (exi.this.B.d()) {
                        exi.this.J = exz.a(gkh.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     ewa $$1x = (ewa)$$2.left().get();

                     for (evz $$2x : $$1x.a) {
                        exi.this.B.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (exi.this.B.d()) {
                           String $$3 = gkh.a("mco.template.select.none", "%link");
                           exz.b $$4 = exz.b.a(gkh.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           exi.this.J = exz.a($$3, $$4);
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

   Either<ewa, Exception> a(ewa $$0, eur $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.C));
      } catch (ewe var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.H = null;
      if (this.J != null) {
         this.a($$0, $$1, $$2, this.J);
      }

      if (this.I != null) {
         for (int $$4 = 0; $$4 < this.I.length; $$4++) {
            vu $$5 = this.I[$$4];
            $$0.a(this.i, $$5, this.g / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(fav $$0, int $$1, int $$2, List<exz.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         exz.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.i.b($$0x.a())).sum();
         int $$8 = this.g / 2 - $$7 / 2;

         for (exz.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.i, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(vu.b($$9.c()));
               this.H = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int K() {
      return this.I != null ? g(1) : 36;
   }

   class a extends fce.a<exi.a> {
      private static final fcv c = new fcv(new ajh("icon/link"), new ajh("icon/link_highlighted"));
      private static final fcv d = new fcv(new ajh("icon/video_link"), new ajh("icon/video_link_highlighted"));
      private static final vu e = vu.c("mco.template.info.tooltip");
      private static final vu f = vu.c("mco.template.trailer.tooltip");
      public final evz a;
      private long g;
      @Nullable
      private fbu h;
      @Nullable
      private fbu i;

      public a(evz $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new fbu(15, 15, c, ffy.b(exi.this, $$0.e), e);
            this.h.a(fct.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new fbu(15, 15, d, ffy.b(exi.this, $$0.g), f);
            this.i.a(fct.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if ($$2 == 0) {
            exi.this.G = this.a;
            exi.this.E();
            if (ac.b() - this.g < 250L && this.aJ_()) {
               exi.this.A.accept(this.a);
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
      public void a(fav $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(exx.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(exi.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = exi.this.i.b(this.a.c);
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
         $$0.a(exi.this.i, this.a.b, $$12, $$13, -1, false);
         $$0.a(exi.this.i, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(exi.this.i, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(exi.this.i, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public vu a() {
         vu $$0 = vt.b(
            vu.b(this.a.b), vu.a("mco.template.select.narrate.authors", this.a.d), vu.b(this.a.h), vu.a("mco.template.select.narrate.version", this.a.c)
         );
         return vu.a("narrator.select", $$0);
      }
   }

   class b extends gpd<exi.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<evz> $$0) {
         super(exi.this.g, exi.this.h - 36 - exi.this.K(), exi.this.K(), 46);
         $$0.forEach(this::a);
      }

      public void a(evz $$0) {
         this.a((exi.a)(exi.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (exi.this.H != null) {
            ffy.a(exi.this, exi.this.H);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable exi.a $$0) {
         super.a($$0);
         exi.this.G = $$0 == null ? null : $$0.a;
         exi.this.E();
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

      public List<evz> e() {
         return this.l().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
