import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;

public class fjp {
   private final ali a;
   private final ali b;
   private final ali c;
   private final gsr d;
   private final List<String> e;
   private final List<fjp.c> f;
   private final fjw g;
   private final fkh h;
   private final boolean i;
   private final fkc j;
   private final Optional<fjl> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;
   private final fls o;
   private final fls.c p;
   private final float q;
   private final float r;

   protected fjp(
      ali $$0,
      ali $$1,
      ali $$2,
      gsr $$3,
      List<String> $$4,
      List<fjp.c> $$5,
      Optional<fjl> $$6,
      fjw $$7,
      fkh $$8,
      boolean $$9,
      boolean $$10,
      boolean $$11,
      boolean $$12,
      fkc $$13,
      fls $$14,
      fls.c $$15,
      float $$16,
      float $$17
   ) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$7;
      this.h = $$8;
      this.i = $$9;
      this.k = $$6;
      this.l = $$10;
      this.m = $$11;
      this.n = $$12;
      this.j = $$13;
      this.o = $$14;
      this.p = $$15;
      this.q = $$16;
      this.r = $$17;
   }

   @Override
   public String toString() {
      return this.a.toString();
   }

   public fjw a() {
      return this.g;
   }

   public fkh b() {
      return this.h;
   }

   public boolean c() {
      return this.i;
   }

   public fkc d() {
      return this.j;
   }

   public Optional<fjl> e() {
      return this.k;
   }

   public boolean f() {
      return this.l;
   }

   public boolean g() {
      return this.m;
   }

   public boolean h() {
      return this.n;
   }

   public float i() {
      return this.q;
   }

   public float j() {
      return this.r;
   }

   public ali k() {
      return this.a;
   }

   public fls l() {
      return this.o;
   }

   public fls.c m() {
      return this.p;
   }

   public ali n() {
      return this.b;
   }

   public ali o() {
      return this.c;
   }

   public gsr p() {
      return this.d;
   }

   public List<String> q() {
      return this.e;
   }

   public List<fjp.c> r() {
      return this.f;
   }

   public boolean s() {
      return this.g != fjw.a || this.r != 0.0F || this.q != 0.0F || this.n;
   }

   public static fjp.a a(fjp.b... $$0) {
      fjp.a $$1 = new fjp.a();

      for (fjp.b $$2 : $$0) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static class a {
      private Optional<ali> a = Optional.empty();
      private Optional<ali> b = Optional.empty();
      private Optional<ali> c = Optional.empty();
      private Optional<gsr.a> d = Optional.empty();
      private Optional<List<String>> e = Optional.empty();
      private Optional<List<fjp.c>> f = Optional.empty();
      private Optional<fjw> g = Optional.empty();
      private Optional<fkh> h = Optional.empty();
      private Optional<Boolean> i = Optional.empty();
      private Optional<Boolean> j = Optional.empty();
      private Optional<Boolean> k = Optional.empty();
      private Optional<Boolean> l = Optional.empty();
      private Optional<fkc> m = Optional.empty();
      private Optional<fjl> n = Optional.empty();
      private Optional<fls> o = Optional.empty();
      private Optional<fls.c> p = Optional.empty();
      private float q;
      private float r;

      a() {
      }

      public fjp.a a(String $$0) {
         this.a = Optional.of(ali.b($$0));
         return this;
      }

      public fjp.a a(ali $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fjp.a b(String $$0) {
         this.b = Optional.of(ali.b($$0));
         return this;
      }

      public fjp.a b(ali $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public fjp.a c(String $$0) {
         this.c = Optional.of(ali.b($$0));
         return this;
      }

      public fjp.a c(ali $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public fjp.a d(String $$0) {
         if (this.d.isEmpty()) {
            this.d = Optional.of(gsr.a());
         }

         this.d.get().a($$0);
         return this;
      }

      public fjp.a a(String $$0, int $$1) {
         if (this.d.isEmpty()) {
            this.d = Optional.of(gsr.a());
         }

         this.d.get().a($$0, $$1);
         return this;
      }

      public fjp.a a(String $$0, float $$1) {
         if (this.d.isEmpty()) {
            this.d = Optional.of(gsr.a());
         }

         this.d.get().a($$0, $$1);
         return this;
      }

      public fjp.a e(String $$0) {
         if (this.e.isEmpty()) {
            this.e = Optional.of(new ArrayList<>());
         }

         this.e.get().add($$0);
         return this;
      }

      public fjp.a a(String $$0, fkx $$1) {
         if (this.f.isEmpty()) {
            this.f = Optional.of(new ArrayList<>());
         }

         this.f.get().add(new fjp.c($$0, $$1));
         return this;
      }

      public fjp.a a(fjw $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public fjp.a a(fkh $$0) {
         this.h = Optional.of($$0);
         return this;
      }

      public fjp.a a(boolean $$0) {
         this.i = Optional.of($$0);
         return this;
      }

      public fjp.a a(fjl $$0) {
         this.n = Optional.of($$0);
         return this;
      }

      public fjp.a a() {
         this.n = Optional.empty();
         return this;
      }

      public fjp.a b(boolean $$0) {
         this.j = Optional.of($$0);
         this.k = Optional.of($$0);
         return this;
      }

      public fjp.a a(boolean $$0, boolean $$1) {
         this.j = Optional.of($$0);
         this.k = Optional.of($$1);
         return this;
      }

      public fjp.a c(boolean $$0) {
         this.l = Optional.of($$0);
         return this;
      }

      public fjp.a a(fkc $$0) {
         this.m = Optional.of($$0);
         return this;
      }

      public fjp.a a(fls $$0, fls.c $$1) {
         this.o = Optional.of($$0);
         this.p = Optional.of($$1);
         return this;
      }

      public fjp.a a(float $$0, float $$1) {
         this.q = $$0;
         this.r = $$1;
         return this;
      }

      void a(fjp.b $$0) {
         if ($$0.a.isPresent()) {
            this.c = $$0.a;
         }

         if ($$0.b.isPresent()) {
            this.b = $$0.b;
         }

         if ($$0.c.isPresent()) {
            if (this.d.isEmpty()) {
               this.d = Optional.of(gsr.a());
            }

            gsr $$1 = $$0.c.get();

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

         if ($$0.m.isPresent()) {
            this.m = $$0.m;
         }

         if ($$0.f.isPresent()) {
            this.n = $$0.f;
         }

         if ($$0.n.isPresent()) {
            this.o = $$0.n;
         }

         if ($$0.o.isPresent()) {
            this.p = $$0.o;
         }
      }

      public fjp.b b() {
         return new fjp.b(
            this.c,
            this.b,
            this.d.map(gsr.a::a),
            this.e.map(Collections::unmodifiableList),
            this.f.map(Collections::unmodifiableList),
            this.n,
            this.g,
            this.h,
            this.i,
            this.j,
            this.k,
            this.l,
            this.m,
            this.o,
            this.p
         );
      }

      public fjp c() {
         if (this.a.isEmpty()) {
            throw new IllegalStateException("Missing location");
         } else if (this.c.isEmpty()) {
            throw new IllegalStateException("Missing vertex shader");
         } else if (this.b.isEmpty()) {
            throw new IllegalStateException("Missing fragment shader");
         } else if (this.o.isEmpty()) {
            throw new IllegalStateException("Missing vertex buffer format");
         } else if (this.p.isEmpty()) {
            throw new IllegalStateException("Missing vertex mode");
         } else {
            return new fjp(
               this.a.get(),
               this.c.get(),
               this.b.get(),
               this.d.orElse(gsr.a()).a(),
               List.copyOf(this.e.orElse(new ArrayList<>())),
               this.f.orElse(Collections.emptyList()),
               this.n,
               this.g.orElse(fjw.c),
               this.h.orElse(fkh.a),
               this.i.orElse(true),
               this.j.orElse(true),
               this.k.orElse(true),
               this.l.orElse(true),
               this.m.orElse(fkc.a),
               this.o.get(),
               this.p.get(),
               this.q,
               this.r
            );
         }
      }
   }

   public static record b(
      Optional<ali> a,
      Optional<ali> b,
      Optional<gsr> c,
      Optional<List<String>> d,
      Optional<List<fjp.c>> e,
      Optional<fjl> f,
      Optional<fjw> g,
      Optional<fkh> h,
      Optional<Boolean> i,
      Optional<Boolean> j,
      Optional<Boolean> k,
      Optional<Boolean> l,
      Optional<fkc> m,
      Optional<fls> n,
      Optional<fls.c> o
   ) {
   }

   public static record c(String a, fkx b) {
   }
}
