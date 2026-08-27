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

public class eri extends ghw {
   static final Logger a = LogUtils.getLogger();
   static final agm b = new agm("widget/slot_frame");
   private static final uv c = uv.c("mco.template.button.select");
   private static final uv v = uv.c("mco.template.button.trailer");
   private static final uv w = uv.c("mco.template.button.publisher");
   private static final int x = 100;
   private static final int y = 10;
   private final eyo z = new eyo(this);
   final Consumer<epz> A;
   eri.b B;
   private final epi.d C;
   private eve D;
   private eve E;
   private eve F;
   @Nullable
   epz G = null;
   @Nullable
   String H;
   @Nullable
   private uv[] I;
   @Nullable
   List<erz.a> J;

   public eri(uv $$0, Consumer<epz> $$1, epi.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public eri(uv $$0, Consumer<epz> $$1, epi.d $$2, @Nullable eqa $$3) {
      super($$0);
      this.A = $$1;
      this.C = $$2;
      if ($$3 == null) {
         this.B = new eri.b();
         this.a(new eqa(10));
      } else {
         this.B = new eri.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(uv... $$0) {
      this.I = $$0;
   }

   @Override
   public void aQ_() {
      this.z.a(new ewl(this.e, this.i));
      this.B = new eri.b(this.B.e());
      this.d(this.B);
      eys $$0 = this.z.b(eys.e().a(10));
      $$0.c().b();
      this.E = $$0.a(eve.a(v, $$0x -> this.E()).a(100).a());
      this.D = $$0.a(eve.a(c, $$0x -> this.D()).a(100).a());
      $$0.a(eve.a(uu.e, $$0x -> this.aG_()).a(100).a());
      this.F = $$0.a(eve.a(w, $$0x -> this.F()).a(100).a());
      this.C();
      this.z.a($$1 -> {
         evc var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.B.a(this.g, this.h, this.G(), this.h - this.z.b());
      this.z.a();
   }

   @Override
   public uv h() {
      List<uv> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.e);
      if (this.I != null) {
         $$0.addAll(Arrays.asList(this.I));
      }

      return uu.a($$0);
   }

   @Override
   void C() {
      this.F.j = this.G != null && !this.G.e.isEmpty();
      this.E.j = this.G != null && !this.G.g.isEmpty();
      this.D.i = this.G != null;
   }

   @Override
   public void aG_() {
      this.A.accept(null);
   }

   private void D() {
      if (this.G != null) {
         this.A.accept(this.G);
      }
   }

   private void E() {
      if (this.G != null && !this.G.g.isBlank()) {
         ezr.a(this, this.G.g);
      }
   }

   private void F() {
      if (this.G != null && !this.G.e.isBlank()) {
         ezr.a(this, this.G.e);
      }
   }

   private void a(final eqa $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            eqa $$0 = $$0;
            eor $$1 = eor.a();

            while ($$0 != null) {
               Either<eqa, Exception> $$2 = eri.this.a($$0, $$1);
               $$0 = eri.this.f.a(() -> {
                  if ($$2.right().isPresent()) {
                     eri.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (eri.this.B.d()) {
                        eri.this.J = erz.a(gdf.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     eqa $$1x = (eqa)$$2.left().get();

                     for (epz $$2x : $$1x.a) {
                        eri.this.B.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (eri.this.B.d()) {
                           String $$3 = gdf.a("mco.template.select.none", "%link");
                           erz.b $$4 = erz.b.a(gdf.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           eri.this.J = erz.a($$3, $$4);
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

   Either<eqa, Exception> a(eqa $$0, eor $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.C));
      } catch (eqe var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.H = null;
      if (this.J != null) {
         this.a($$0, $$1, $$2, this.J);
      }

      if (this.I != null) {
         for (int $$4 = 0; $$4 < this.I.length; $$4++) {
            uv $$5 = this.I[$$4];
            $$0.a(this.i, $$5, this.g / 2, h(-1 + $$4), -6250336);
         }
      }
   }

   private void a(eut $$0, int $$1, int $$2, List<erz.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         erz.a $$5 = $$3.get($$4);
         int $$6 = h(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.i.b($$0x.a())).sum();
         int $$8 = this.g / 2 - $$7 / 2;

         for (erz.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.i, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(uv.b($$9.c()));
               this.H = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int G() {
      return this.I != null ? h(1) : 36;
   }

   class a extends ewa.a<eri.a> {
      private static final ewr c = new ewr(new agm("icon/link"), new agm("icon/link_highlighted"));
      private static final ewr d = new ewr(new agm("icon/video_link"), new agm("icon/video_link_highlighted"));
      private static final uv e = uv.c("mco.template.info.tooltip");
      private static final uv f = uv.c("mco.template.trailer.tooltip");
      public final epz a;
      private long g;
      @Nullable
      private evq h;
      @Nullable
      private evq i;

      public a(epz $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new evq(15, 15, c, ezr.b(eri.this, $$0.e), e);
            this.h.a(ewp.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new evq(15, 15, d, ezr.b(eri.this, $$0.g), f);
            this.i.a(ewp.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if ($$2 == 0) {
            eri.this.G = this.a;
            eri.this.C();
            if (ac.b() - this.g < 250L && this.aK_()) {
               eri.this.A.accept(this.a);
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
      public void a(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(erx.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(eri.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = eri.this.i.b(this.a.c);
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
         $$0.a(eri.this.i, this.a.b, $$12, $$13, -1, false);
         $$0.a(eri.this.i, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(eri.this.i, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(eri.this.i, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public uv a() {
         uv $$0 = uu.b(
            uv.b(this.a.b), uv.a("mco.template.select.narrate.authors", this.a.d), uv.b(this.a.h), uv.a("mco.template.select.narrate.version", this.a.c)
         );
         return uv.a("narrator.select", $$0);
      }
   }

   class b extends ghv<eri.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<epz> $$0) {
         super(eri.this.g, eri.this.h, eri.this.G(), eri.this.h - 36, 46);
         $$0.forEach(this::a);
      }

      public void a(epz $$0) {
         this.a((eri.a)(eri.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (eri.this.H != null) {
            ezr.a(eri.this, eri.this.H);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable eri.a $$0) {
         super.a($$0);
         eri.this.G = $$0 == null ? null : $$0.a;
         eri.this.C();
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

      public List<epz> e() {
         return this.i().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
