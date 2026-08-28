import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class fii {
   private final alg a;
   private final alg b;
   private final alg c;
   private final gri d;
   private final List<String> e;
   private final List<fii.c> f;
   private final gqc g;
   private final boolean h;
   private final GlStateManager.h i;
   private final Optional<fif> j;
   private final boolean k;
   private final boolean l;
   private final boolean m;
   private final fki n;
   private final fki.c o;

   protected fii(
      alg $$0,
      alg $$1,
      alg $$2,
      gri $$3,
      List<String> $$4,
      List<fii.c> $$5,
      Optional<fif> $$6,
      gqc $$7,
      boolean $$8,
      boolean $$9,
      boolean $$10,
      boolean $$11,
      GlStateManager.h $$12,
      fki $$13,
      fki.c $$14
   ) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$7;
      this.h = $$8;
      this.j = $$6;
      this.k = $$9;
      this.l = $$10;
      this.m = $$11;
      this.i = $$12;
      this.n = $$13;
      this.o = $$14;
   }

   @Override
   public String toString() {
      return this.a.toString();
   }

   public void a() {
      if (this.g != gqc.a) {
         RenderSystem.enableDepthTest();
         RenderSystem.depthFunc(this.a(this.g));
      } else {
         RenderSystem.disableDepthTest();
      }

      if (!this.h) {
         RenderSystem.disableCull();
      }

      if (this.j.isPresent()) {
         RenderSystem.enableBlend();
         this.j.get().a();
      } else {
         RenderSystem.disableBlend();
      }

      if (!this.m) {
         RenderSystem.depthMask(this.m);
      }

      RenderSystem.colorMask(this.k, this.k, this.k, this.l);
      switch (this.i) {
         case a:
            RenderSystem.disableColorLogicOp();
            break;
         case o:
            RenderSystem.enableColorLogicOp();
            RenderSystem.logicOp(GlStateManager.h.o);
      }
   }

   @Nullable
   public gqa b() {
      return fpt.Q().ab().a(this);
   }

   public void c() {
      if (this.g != gqc.a) {
         RenderSystem.disableDepthTest();
         RenderSystem.depthFunc(515);
      }

      if (!this.h) {
         RenderSystem.enableCull();
      }

      if (this.j.isPresent()) {
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }

      if (!this.m) {
         RenderSystem.depthMask(true);
      }

      if (!this.k) {
         RenderSystem.colorMask(true, true, true, true);
      }

      if (this.i == GlStateManager.h.o) {
         RenderSystem.disableColorLogicOp();
      }
   }

   private int a(gqc $$0) {
      return switch ($$0) {
         case a -> 519;
         case b -> 514;
         case d -> 516;
         default -> 515;
      };
   }

   public alg d() {
      return this.a;
   }

   public Boolean e() {
      return this.h;
   }

   public fki f() {
      return this.n;
   }

   public fki.c g() {
      return this.o;
   }

   public alg h() {
      return this.b;
   }

   public alg i() {
      return this.c;
   }

   public gri j() {
      return this.d;
   }

   public List<String> k() {
      return this.e;
   }

   public List<fii.c> l() {
      return this.f;
   }

   public static fii.a a(fii.b... $$0) {
      fii.a $$1 = new fii.a();

      for (fii.b $$2 : $$0) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static class a {
      private Optional<alg> a = Optional.empty();
      private Optional<alg> b = Optional.empty();
      private Optional<alg> c = Optional.empty();
      private Optional<gri.a> d = Optional.empty();
      private Optional<List<String>> e = Optional.empty();
      private Optional<List<fii.c>> f = Optional.empty();
      private Optional<gqc> g = Optional.empty();
      private Optional<Boolean> h = Optional.empty();
      private Optional<Boolean> i = Optional.empty();
      private Optional<Boolean> j = Optional.empty();
      private Optional<Boolean> k = Optional.empty();
      private Optional<GlStateManager.h> l = Optional.empty();
      private Optional<fif> m = Optional.empty();
      private Optional<fki> n = Optional.empty();
      private Optional<fki.c> o = Optional.empty();

      a() {
      }

      public fii.a a(String $$0) {
         this.a = Optional.of(alg.b($$0));
         return this;
      }

      public fii.a a(alg $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fii.a b(String $$0) {
         this.b = Optional.of(alg.b($$0));
         return this;
      }

      public fii.a b(alg $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public fii.a c(String $$0) {
         this.c = Optional.of(alg.b($$0));
         return this;
      }

      public fii.a c(alg $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public fii.a d(String $$0) {
         if (this.d.isEmpty()) {
            this.d = Optional.of(gri.a());
         }

         this.d.get().a($$0);
         return this;
      }

      public fii.a a(String $$0, int $$1) {
         if (this.d.isEmpty()) {
            this.d = Optional.of(gri.a());
         }

         this.d.get().a($$0, $$1);
         return this;
      }

      public fii.a a(String $$0, float $$1) {
         if (this.d.isEmpty()) {
            this.d = Optional.of(gri.a());
         }

         this.d.get().a($$0, $$1);
         return this;
      }

      public fii.a e(String $$0) {
         if (this.e.isEmpty()) {
            this.e = Optional.of(new ArrayList<>());
         }

         this.e.get().add($$0);
         return this;
      }

      public fii.a a(String $$0, fjq.a $$1) {
         if (this.f.isEmpty()) {
            this.f = Optional.of(new ArrayList<>());
         }

         this.f.get().add(new fii.c($$0, $$1));
         return this;
      }

      public fii.a a(gqc $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public fii.a a(boolean $$0) {
         this.h = Optional.of($$0);
         return this;
      }

      public fii.a a(fif $$0) {
         this.m = Optional.of($$0);
         return this;
      }

      public fii.a a() {
         this.m = Optional.empty();
         return this;
      }

      public fii.a b(boolean $$0) {
         this.i = Optional.of($$0);
         this.j = Optional.of($$0);
         return this;
      }

      public fii.a a(boolean $$0, boolean $$1) {
         this.i = Optional.of($$0);
         this.j = Optional.of($$1);
         return this;
      }

      public fii.a c(boolean $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public fii.a a(GlStateManager.h $$0) {
         this.l = Optional.of($$0);
         return this;
      }

      public fii.a a(fki $$0, fki.c $$1) {
         this.n = Optional.of($$0);
         this.o = Optional.of($$1);
         return this;
      }

      void a(fii.b $$0) {
         if ($$0.a.isPresent()) {
            this.c = $$0.a;
         }

         if ($$0.b.isPresent()) {
            this.b = $$0.b;
         }

         if ($$0.c.isPresent()) {
            if (this.d.isEmpty()) {
               this.d = Optional.of(gri.a());
            }

            gri $$1 = $$0.c.get();

            for (Entry<String, String> $$2 : $$1.d().entrySet()) {
               this.d.get().a($$2.getKey(), $$2.getValue());
            }

            for (String $$3 : $$1.e()) {
               this.d.get().a($$3);
            }
         }

         $$0.d.ifPresent($$0x -> {
            if (this.e.isPresent()) {
               this.e.get().addAll($$0x);
            } else {
               this.e = Optional.of(new ArrayList<>($$0x));
            }
         });
         $$0.e.ifPresent($$0x -> {
            if (this.f.isPresent()) {
               this.f.get().addAll($$0x);
            } else {
               this.f = Optional.of(new ArrayList<>($$0x));
            }
         });
         if ($$0.g.isPresent()) {
            this.g = $$0.g;
         }

         if ($$0.h.isPresent()) {
            this.h = $$0.h;
         }

         if ($$0.i.isPresent()) {
            this.i = $$0.i;
         }

         if ($$0.j.isPresent()) {
            this.j = $$0.j;
         }

         if ($$0.k.isPresent()) {
            this.k = $$0.k;
         }

         if ($$0.l.isPresent()) {
            this.l = $$0.l;
         }

         if ($$0.f.isPresent()) {
            this.m = $$0.f;
         }

         if ($$0.m.isPresent()) {
            this.n = $$0.m;
         }

         if ($$0.n.isPresent()) {
            this.o = $$0.n;
         }
      }

      public fii.b b() {
         return new fii.b(
            this.c,
            this.b,
            this.d.map(gri.a::a),
            this.e.map(Collections::unmodifiableList),
            this.f.map(Collections::unmodifiableList),
            this.m,
            this.g,
            this.h,
            this.i,
            this.j,
            this.k,
            this.l,
            this.n,
            this.o
         );
      }

      public fii c() {
         if (this.a.isEmpty()) {
            throw new IllegalStateException("Missing location");
         } else if (this.c.isEmpty()) {
            throw new IllegalStateException("Missing vertex shader");
         } else if (this.b.isEmpty()) {
            throw new IllegalStateException("Missing fragment shader");
         } else if (this.n.isEmpty()) {
            throw new IllegalStateException("Missing vertex buffer format");
         } else if (this.o.isEmpty()) {
            throw new IllegalStateException("Missing vertex mode");
         } else {
            return new fii(
               this.a.get(),
               this.c.get(),
               this.b.get(),
               this.d.orElse(gri.a()).a(),
               List.copyOf(this.e.orElse(new ArrayList<>())),
               this.f.orElse(Collections.emptyList()),
               this.m,
               this.g.orElse(gqc.c),
               this.h.orElse(true),
               this.i.orElse(true),
               this.j.orElse(true),
               this.k.orElse(true),
               this.l.orElse(GlStateManager.h.a),
               this.n.get(),
               this.o.get()
            );
         }
      }
   }

   public static record b(
      Optional<alg> a,
      Optional<alg> b,
      Optional<gri> c,
      Optional<List<String>> d,
      Optional<List<fii.c>> e,
      Optional<fif> f,
      Optional<gqc> g,
      Optional<Boolean> h,
      Optional<Boolean> i,
      Optional<Boolean> j,
      Optional<Boolean> k,
      Optional<GlStateManager.h> l,
      Optional<fki> m,
      Optional<fki.c> n
   ) {
   }

   public static record c(String a, fjq.a b) {
   }
}
