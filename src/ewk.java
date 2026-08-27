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

public class ewk extends gob {
   static final Logger a = LogUtils.getLogger();
   static final ajc b = new ajc("widget/slot_frame");
   private static final vs c = vs.c("mco.template.button.select");
   private static final vs v = vs.c("mco.template.button.trailer");
   private static final vs w = vs.c("mco.template.button.publisher");
   private static final int x = 100;
   private static final int y = 10;
   private final fdw z = new fdw(this);
   final Consumer<evb> A;
   ewk.b B;
   private final euk.d C;
   private fak D;
   private fak E;
   private fak F;
   @Nullable
   evb G = null;
   @Nullable
   String H;
   @Nullable
   private vs[] I;
   @Nullable
   List<exb.a> J;

   public ewk(vs $$0, Consumer<evb> $$1, euk.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public ewk(vs $$0, Consumer<evb> $$1, euk.d $$2, @Nullable evc $$3) {
      super($$0);
      this.A = $$1;
      this.C = $$2;
      if ($$3 == null) {
         this.B = new ewk.b();
         this.a(new evc(10));
      } else {
         this.B = new ewk.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(vs... $$0) {
      this.I = $$0;
   }

   @Override
   public void aP_() {
      this.z.a(new fbr(this.e, this.i));
      this.B = this.z.c(new ewk.b(this.B.e()));
      fea $$0 = this.z.b(fea.e().a(10));
      $$0.c().b();
      this.E = $$0.a(fak.a(v, $$0x -> this.I()).a(100).a());
      this.D = $$0.a(fak.a(c, $$0x -> this.H()).a(100).a());
      $$0.a(fak.a(vr.e, $$0x -> this.d()).a(100).a());
      this.F = $$0.a(fak.a(w, $$0x -> this.J()).a(100).a());
      this.E();
      this.z.a($$1 -> {
         fai var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.B.b(this.g, this.h - this.z.b() - this.K());
      this.z.a();
   }

   @Override
   public vs i() {
      List<vs> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.e);
      if (this.I != null) {
         $$0.addAll(Arrays.asList(this.I));
      }

      return vr.a($$0);
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
         fez.a(this, this.G.g);
      }
   }

   private void J() {
      if (this.G != null && !this.G.e.isBlank()) {
         fez.a(this, this.G.e);
      }
   }

   private void a(final evc $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            evc $$0 = $$0;
            ett $$1 = ett.a();

            while ($$0 != null) {
               Either<evc, Exception> $$2 = ewk.this.a($$0, $$1);
               $$0 = ewk.this.f.a(() -> {
                  if ($$2.right().isPresent()) {
                     ewk.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (ewk.this.B.d()) {
                        ewk.this.J = exb.a(gje.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     evc $$1x = (evc)$$2.left().get();

                     for (evb $$2x : $$1x.a) {
                        ewk.this.B.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (ewk.this.B.d()) {
                           String $$3 = gje.a("mco.template.select.none", "%link");
                           exb.b $$4 = exb.b.a(gje.a("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator");
                           ewk.this.J = exb.a($$3, $$4);
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

   Either<evc, Exception> a(evc $$0, ett $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.C));
      } catch (evg var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.H = null;
      if (this.J != null) {
         this.a($$0, $$1, $$2, this.J);
      }

      if (this.I != null) {
         for (int $$4 = 0; $$4 < this.I.length; $$4++) {
            vs $$5 = this.I[$$4];
            $$0.a(this.i, $$5, this.g / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(ezx $$0, int $$1, int $$2, List<exb.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         exb.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.i.b($$0x.a())).sum();
         int $$8 = this.g / 2 - $$7 / 2;

         for (exb.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.i, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(vs.b($$9.c()));
               this.H = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int K() {
      return this.I != null ? g(1) : 36;
   }

   class a extends fbg.a<ewk.a> {
      private static final fbx c = new fbx(new ajc("icon/link"), new ajc("icon/link_highlighted"));
      private static final fbx d = new fbx(new ajc("icon/video_link"), new ajc("icon/video_link_highlighted"));
      private static final vs e = vs.c("mco.template.info.tooltip");
      private static final vs f = vs.c("mco.template.trailer.tooltip");
      public final evb a;
      private long g;
      @Nullable
      private faw h;
      @Nullable
      private faw i;

      public a(evb $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new faw(15, 15, c, fez.b(ewk.this, $$0.e), e);
            this.h.a(fbv.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new faw(15, 15, d, fez.b(ewk.this, $$0.g), f);
            this.i.a(fbv.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if ($$2 == 0) {
            ewk.this.G = this.a;
            ewk.this.E();
            if (ac.b() - this.g < 250L && this.aK_()) {
               ewk.this.A.accept(this.a);
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
      public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(ewz.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(ewk.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = ewk.this.i.b(this.a.c);
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
         $$0.a(ewk.this.i, this.a.b, $$12, $$13, -1, false);
         $$0.a(ewk.this.i, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(ewk.this.i, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(ewk.this.i, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public vs a() {
         vs $$0 = vr.b(
            vs.b(this.a.b), vs.a("mco.template.select.narrate.authors", this.a.d), vs.b(this.a.h), vs.a("mco.template.select.narrate.version", this.a.c)
         );
         return vs.a("narrator.select", $$0);
      }
   }

   class b extends goa<ewk.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(Iterable<evb> $$0) {
         super(ewk.this.g, ewk.this.h - 36 - ewk.this.K(), ewk.this.K(), 46);
         $$0.forEach(this::a);
      }

      public void a(evb $$0) {
         this.a((ewk.a)(ewk.this.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (ewk.this.H != null) {
            fez.a(ewk.this, ewk.this.H);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable ewk.a $$0) {
         super.a($$0);
         ewk.this.G = $$0 == null ? null : $$0.a;
         ewk.this.E();
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

      public List<evb> e() {
         return this.l().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
