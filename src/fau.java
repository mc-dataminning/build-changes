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

public class fau extends gsq {
   static final Logger a = LogUtils.getLogger();
   static final akf b = new akf("widget/slot_frame");
   private static final ws c = ws.c("mco.template.button.select");
   private static final ws B = ws.c("mco.template.button.trailer");
   private static final ws C = ws.c("mco.template.button.publisher");
   private static final int D = 100;
   private static final int E = 10;
   private final fih F = new fih(this);
   final Consumer<ezl> G;
   fau.b H;
   private final eyu.d I;
   private feu J;
   private feu K;
   private feu L;
   @Nullable
   ezl M = null;
   @Nullable
   String N;
   @Nullable
   private ws[] O;
   @Nullable
   List<fbl.a> P;

   public fau(ws $$0, Consumer<ezl> $$1, eyu.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public fau(ws $$0, Consumer<ezl> $$1, eyu.d $$2, @Nullable ezm $$3) {
      super($$0);
      this.G = $$1;
      this.I = $$2;
      if ($$3 == null) {
         this.H = new fau.b();
         this.a(new ezm(10));
      } else {
         this.H = new fau.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(ws... $$0) {
      this.O = $$0;
   }

   @Override
   public void aM_() {
      this.F.a(this.l, this.p);
      this.H = this.F.c(new fau.b(this.H.d()));
      fil $$0 = this.F.b(fil.e().a(10));
      $$0.c().b();
      this.K = $$0.a(feu.a(B, $$0x -> this.E()).a(100).a());
      this.J = $$0.a(feu.a(c, $$0x -> this.D()).a(100).a());
      $$0.a(feu.a(wr.e, $$0x -> this.d()).a(100).a());
      this.L = $$0.a(feu.a(C, $$0x -> this.F()).a(100).a());
      this.C();
      this.F.a($$1 -> {
         fes var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.H.b(this.n, this.o - this.F.b() - this.I());
      this.F.a();
   }

   @Override
   public ws i() {
      List<ws> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.l);
      if (this.O != null) {
         $$0.addAll(Arrays.asList(this.O));
      }

      return wr.a($$0);
   }

   void C() {
      this.L.k = this.M != null && !this.M.e.isEmpty();
      this.K.k = this.M != null && !this.M.g.isEmpty();
      this.J.j = this.M != null;
   }

   @Override
   public void d() {
      this.G.accept(null);
   }

   private void D() {
      if (this.M != null) {
         this.G.accept(this.M);
      }
   }

   private void E() {
      if (this.M != null && !this.M.g.isBlank()) {
         fjk.a(this, this.M.g);
      }
   }

   private void F() {
      if (this.M != null && !this.M.e.isBlank()) {
         fjk.a(this, this.M.e);
      }
   }

   private void a(final ezm $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            ezm $$0 = $$0;
            eyd $$1 = eyd.a();

            while ($$0 != null) {
               Either<ezm, Exception> $$2 = fau.this.a($$0, $$1);
               $$0 = fau.this.m.a(() -> {
                  if ($$2.right().isPresent()) {
                     fau.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (fau.this.H.c()) {
                        fau.this.P = fbl.a(gnt.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     ezm $$1x = (ezm)$$2.left().get();

                     for (ezl $$2x : $$1x.a) {
                        fau.this.H.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (fau.this.H.c()) {
                           String $$3 = gnt.a("mco.template.select.none", "%link");
                           fbl.b $$4 = fbl.b.a(gnt.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           fau.this.P = fbl.a($$3, $$4);
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

   Either<ezm, Exception> a(ezm $$0, eyd $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.I));
      } catch (ezq var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.N = null;
      if (this.P != null) {
         this.a($$0, $$1, $$2, this.P);
      }

      if (this.O != null) {
         for (int $$4 = 0; $$4 < this.O.length; $$4++) {
            ws $$5 = this.O[$$4];
            $$0.a(this.p, $$5, this.n / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(feh $$0, int $$1, int $$2, List<fbl.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         fbl.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.p.b($$0x.a())).sum();
         int $$8 = this.n / 2 - $$7 / 2;

         for (fbl.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.p, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(ws.b($$9.c()));
               this.N = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int I() {
      return this.O != null ? g(1) : 33;
   }

   class a extends ffq.a<fau.a> {
      private static final fgh c = new fgh(new akf("icon/link"), new akf("icon/link_highlighted"));
      private static final fgh d = new fgh(new akf("icon/video_link"), new akf("icon/video_link_highlighted"));
      private static final ws e = ws.c("mco.template.info.tooltip");
      private static final ws f = ws.c("mco.template.trailer.tooltip");
      public final ezl a;
      private long g;
      @Nullable
      private ffg h;
      @Nullable
      private ffg i;

      public a(ezl $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new ffg(15, 15, c, fjk.b(fau.this, $$0.e), e);
            this.h.a(fgf.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new ffg(15, 15, d, fjk.b(fau.this, $$0.g), f);
            this.i.a(fgf.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fau.this.M = this.a;
         fau.this.C();
         if (ac.b() - this.g < 250L && this.aI_()) {
            fau.this.G.accept(this.a);
         }

         this.g = ac.b();
         if (this.h != null) {
            this.h.a($$0, $$1, $$2);
         }

         if (this.i != null) {
            this.i.a($$0, $$1, $$2);
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fbj.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(fau.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = fau.this.p.b(this.a.c);
         if (this.h != null) {
            this.h.c($$3 + $$4 - $$11 - this.h.x() - 10, $$2);
            this.h.a($$0, $$6, $$7, $$9);
         }

         if (this.i != null) {
            this.i.c($$3 + $$4 - $$11 - this.i.x() * 2 - 15, $$2);
            this.i.a($$0, $$6, $$7, $$9);
         }

         int $$12 = $$3 + 45 + 20;
         int $$13 = $$2 + 5;
         $$0.a(fau.this.p, this.a.b, $$12, $$13, -1, false);
         $$0.a(fau.this.p, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(fau.this.p, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(fau.this.p, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public ws a() {
         ws $$0 = wr.b(
            ws.b(this.a.b), ws.a("mco.template.select.narrate.authors", this.a.d), ws.b(this.a.h), ws.a("mco.template.select.narrate.version", this.a.c)
         );
         return ws.a("narrator.select", $$0);
      }
   }

   class b extends gsp<fau.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<ezl> $$0) {
         super(fau.this.n, fau.this.o - 33 - fau.this.I(), fau.this.I(), 46);
         $$0.forEach(this::a);
      }

      public void a(ezl $$0) {
         this.a((fau.a)(fau.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (fau.this.N != null) {
            fjk.a(fau.this, fau.this.N);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable fau.a $$0) {
         super.a($$0);
         fau.this.M = $$0 == null ? null : $$0.a;
         fau.this.C();
      }

      @Override
      public int a() {
         return this.l() * 46;
      }

      @Override
      public int b() {
         return 300;
      }

      public boolean c() {
         return this.l() == 0;
      }

      public List<ezl> d() {
         return this.aE_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
