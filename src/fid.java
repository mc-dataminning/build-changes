import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class fid {
   private final alg a;
   private final alg b;
   private final alg c;
   private final grd d;
   private final List<String> e;
   private final List<fid.c> f;
   private final gpx g;
   private final boolean h;
   private final GlStateManager.h i;
   private final Optional<fia> j;
   private final boolean k;
   private final boolean l;
   private final boolean m;
   private final fkd n;
   private final fkd.c o;

   protected fid(
      alg $$0,
      alg $$1,
      alg $$2,
      grd $$3,
      List<String> $$4,
      List<fid.c> $$5,
      Optional<fia> $$6,
      gpx $$7,
      boolean $$8,
      boolean $$9,
      boolean $$10,
      boolean $$11,
      GlStateManager.h $$12,
      fkd $$13,
      fkd.c $$14
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
      if (this.g != gpx.a) {
         RenderSystem.enableDepthTest();
         RenderSystem.depthFunc(this.a(this.g));
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
   public gpv b() {
      return fpo.Q().ab().a(this);
   }

   public void c() {
      if (this.g != gpx.a) {
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

   private int a(gpx $$0) {
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

   public fkd f() {
      return this.n;
   }

   public fkd.c g() {
      return this.o;
   }

   public alg h() {
      return this.b;
   }

   public alg i() {
      return this.c;
   }

   public grd j() {
      return this.d;
   }

   public List<String> k() {
      return this.e;
   }

   public List<fid.c> l() {
      return this.f;
   }

   public static fid.a a(fid.b... $$0) {
      fid.a $$1 = new fid.a();

      for (fid.b $$2 : $$0) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static class a {
      private Optional<alg> a = Optional.empty();
      private Optional<alg> b = Optional.empty();
      private Optional<alg> c = Optional.empty();
      private Optional<grd.a> d = Optional.empty();
      private Optional<List<String>> e = Optional.empty();
      private Optional<List<fid.c>> f = Optional.empty();
      private Optional<gpx> g = Optional.empty();
      private Optional<Boolean> h = Optional.empty();
      private Optional<Boolean> i = Optional.empty();
      private Optional<Boolean> j = Optional.empty();
      private Optional<Boolean> k = Optional.empty();
      private Optional<GlStateManager.h> l = Optional.empty();
      private Optional<fia> m = Optional.empty();
      private Optional<fkd> n = Optional.empty();
      private Optional<fkd.c> o = Optional.empty();

      a() {
      }

      public fid.a a(String $$0) {
         this.a = Optional.of(alg.b($$0));
         return this;
      }

      public fid.a a(alg $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fid.a b(String $$0) {
         this.b = Optional.of(alg.b($$0));
         return this;
      }

      public fid.a b(alg $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public fid.a c(String $$0) {
         this.c = Optional.of(alg.b($$0));
         return this;
      }

      public fid.a c(alg $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public fid.a d(String $$0) {
         if (this.d.isEmpty()) {
            this.d = Optional.of(grd.a());
         }

         this.d.get().a($$0);
         return this;
      }

      public fid.a a(String $$0, int $$1) {
         if (this.d.isEmpty()) {
            this.d = Optional.of(grd.a());
         }

         this.d.get().a($$0, $$1);
         return this;
      }

      public fid.a a(String $$0, float $$1) {
         if (this.d.isEmpty()) {
            this.d = Optional.of(grd.a());
         }

         this.d.get().a($$0, $$1);
         return this;
      }

      public fid.a e(String $$0) {
         if (this.e.isEmpty()) {
            this.e = Optional.of(new ArrayList<>());
         }

         this.e.get().add($$0);
         return this;
      }

      public fid.a a(String $$0, fjl.a $$1) {
         if (this.f.isEmpty()) {
            this.f = Optional.of(new ArrayList<>());
         }

         this.f.get().add(new fid.c($$0, $$1));
         return this;
      }

      public fid.a a(gpx $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public fid.a a(boolean $$0) {
         this.h = Optional.of($$0);
         return this;
      }

      public fid.a a(fia $$0) {
         this.m = Optional.of($$0);
         return this;
      }

      public fid.a a() {
         this.m = Optional.empty();
         return this;
      }

      public fid.a b(boolean $$0) {
         this.i = Optional.of($$0);
         this.j = Optional.of($$0);
         return this;
      }

      public fid.a a(boolean $$0, boolean $$1) {
         this.i = Optional.of($$0);
         this.j = Optional.of($$1);
         return this;
      }

      public fid.a c(boolean $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public fid.a a(GlStateManager.h $$0) {
         this.l = Optional.of($$0);
         return this;
      }

      public fid.a a(fkd $$0, fkd.c $$1) {
         this.n = Optional.of($$0);
         this.o = Optional.of($$1);
         return this;
      }

      void a(fid.b $$0) {
         if ($$0.a.isPresent()) {
            this.c = $$0.a;
         }

         if ($$0.b.isPresent()) {
            this.b = $$0.b;
         }

         if ($$0.c.isPresent()) {
            if (this.d.isEmpty()) {
               this.d = Optional.of(grd.a());
            }

            grd $$1 = $$0.c.get();

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

      public fid.b b() {
         return new fid.b(
            this.c,
            this.b,
            this.d.map(grd.a::a),
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

      public fid c() {
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
            return new fid(
               this.a.get(),
               this.c.get(),
               this.b.get(),
               this.d.orElse(grd.a()).a(),
               List.copyOf(this.e.orElse(new ArrayList<>())),
               this.f.orElse(Collections.emptyList()),
               this.m,
               this.g.orElse(gpx.c),
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
      Optional<grd> c,
      Optional<List<String>> d,
      Optional<List<fid.c>> e,
      Optional<fia> f,
      Optional<gpx> g,
      Optional<Boolean> h,
      Optional<Boolean> i,
      Optional<Boolean> j,
      Optional<Boolean> k,
      Optional<GlStateManager.h> l,
      Optional<fkd> m,
      Optional<fkd.c> n
   ) {
   }

   public static record c(String a, fjl.a b) {
   }
}
