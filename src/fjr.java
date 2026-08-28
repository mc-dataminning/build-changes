import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;

public class fjr {
   private final alk a;
   private final alk b;
   private final alk c;
   private final gst d;
   private final List<String> e;
   private final List<fjr.c> f;
   private final fjy g;
   private final fkj h;
   private final boolean i;
   private final fke j;
   private final Optional<fjn> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;
   private final flu o;
   private final flu.c p;
   private final float q;
   private final float r;

   protected fjr(
      alk $$0,
      alk $$1,
      alk $$2,
      gst $$3,
      List<String> $$4,
      List<fjr.c> $$5,
      Optional<fjn> $$6,
      fjy $$7,
      fkj $$8,
      boolean $$9,
      boolean $$10,
      boolean $$11,
      boolean $$12,
      fke $$13,
      flu $$14,
      flu.c $$15,
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

   public fjy a() {
      return this.g;
   }

   public fkj b() {
      return this.h;
   }

   public boolean c() {
      return this.i;
   }

   public fke d() {
      return this.j;
   }

   public Optional<fjn> e() {
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

   public alk k() {
      return this.a;
   }

   public flu l() {
      return this.o;
   }

   public flu.c m() {
      return this.p;
   }

   public alk n() {
      return this.b;
   }

   public alk o() {
      return this.c;
   }

   public gst p() {
      return this.d;
   }

   public List<String> q() {
      return this.e;
   }

   public List<fjr.c> r() {
      return this.f;
   }

   public boolean s() {
      return this.g != fjy.a || this.r != 0.0F || this.q != 0.0F || this.n;
   }

   public static fjr.a a(fjr.b... $$0) {
      fjr.a $$1 = new fjr.a();

      for (fjr.b $$2 : $$0) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static class a {
      private Optional<alk> a = Optional.empty();
      private Optional<alk> b = Optional.empty();
      private Optional<alk> c = Optional.empty();
      private Optional<gst.a> d = Optional.empty();
      private Optional<List<String>> e = Optional.empty();
      private Optional<List<fjr.c>> f = Optional.empty();
      private Optional<fjy> g = Optional.empty();
      private Optional<fkj> h = Optional.empty();
      private Optional<Boolean> i = Optional.empty();
      private Optional<Boolean> j = Optional.empty();
      private Optional<Boolean> k = Optional.empty();
      private Optional<Boolean> l = Optional.empty();
      private Optional<fke> m = Optional.empty();
      private Optional<fjn> n = Optional.empty();
      private Optional<flu> o = Optional.empty();
      private Optional<flu.c> p = Optional.empty();
      private float q;
      private float r;

      a() {
      }

      public fjr.a a(String $$0) {
         this.a = Optional.of(alk.b($$0));
         return this;
      }

      public fjr.a a(alk $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fjr.a b(String $$0) {
         this.b = Optional.of(alk.b($$0));
         return this;
      }

      public fjr.a b(alk $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public fjr.a c(String $$0) {
         this.c = Optional.of(alk.b($$0));
         return this;
      }

      public fjr.a c(alk $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public fjr.a d(String $$0) {
         if (this.d.isEmpty()) {
            this.d = Optional.of(gst.a());
         }

         this.d.get().a($$0);
         return this;
      }

      public fjr.a a(String $$0, int $$1) {
         if (this.d.isEmpty()) {
            this.d = Optional.of(gst.a());
         }

         this.d.get().a($$0, $$1);
         return this;
      }

      public fjr.a a(String $$0, float $$1) {
         if (this.d.isEmpty()) {
            this.d = Optional.of(gst.a());
         }

         this.d.get().a($$0, $$1);
         return this;
      }

      public fjr.a e(String $$0) {
         if (this.e.isEmpty()) {
            this.e = Optional.of(new ArrayList<>());
         }

         this.e.get().add($$0);
         return this;
      }

      public fjr.a a(String $$0, fkz $$1) {
         if (this.f.isEmpty()) {
            this.f = Optional.of(new ArrayList<>());
         }

         this.f.get().add(new fjr.c($$0, $$1));
         return this;
      }

      public fjr.a a(fjy $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public fjr.a a(fkj $$0) {
         this.h = Optional.of($$0);
         return this;
      }

      public fjr.a a(boolean $$0) {
         this.i = Optional.of($$0);
         return this;
      }

      public fjr.a a(fjn $$0) {
         this.n = Optional.of($$0);
         return this;
      }

      public fjr.a a() {
         this.n = Optional.empty();
         return this;
      }

      public fjr.a b(boolean $$0) {
         this.j = Optional.of($$0);
         this.k = Optional.of($$0);
         return this;
      }

      public fjr.a a(boolean $$0, boolean $$1) {
         this.j = Optional.of($$0);
         this.k = Optional.of($$1);
         return this;
      }

      public fjr.a c(boolean $$0) {
         this.l = Optional.of($$0);
         return this;
      }

      public fjr.a a(fke $$0) {
         this.m = Optional.of($$0);
         return this;
      }

      public fjr.a a(flu $$0, flu.c $$1) {
         this.o = Optional.of($$0);
         this.p = Optional.of($$1);
         return this;
      }

      public fjr.a a(float $$0, float $$1) {
         this.q = $$0;
         this.r = $$1;
         return this;
      }

      void a(fjr.b $$0) {
         if ($$0.a.isPresent()) {
            this.c = $$0.a;
         }

         if ($$0.b.isPresent()) {
            this.b = $$0.b;
         }

         if ($$0.c.isPresent()) {
            if (this.d.isEmpty()) {
               this.d = Optional.of(gst.a());
            }

            gst $$1 = $$0.c.get();

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

      public fjr.b b() {
         return new fjr.b(
            this.c,
            this.b,
            this.d.map(gst.a::a),
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

      public fjr c() {
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
            return new fjr(
               this.a.get(),
               this.c.get(),
               this.b.get(),
               this.d.orElse(gst.a()).a(),
               List.copyOf(this.e.orElse(new ArrayList<>())),
               this.f.orElse(Collections.emptyList()),
               this.n,
               this.g.orElse(fjy.c),
               this.h.orElse(fkj.a),
               this.i.orElse(true),
               this.j.orElse(true),
               this.k.orElse(true),
               this.l.orElse(true),
               this.m.orElse(fke.a),
               this.o.get(),
               this.p.get(),
               this.q,
               this.r
            );
         }
      }
   }

   public static record b(
      Optional<alk> a,
      Optional<alk> b,
      Optional<gst> c,
      Optional<List<String>> d,
      Optional<List<fjr.c>> e,
      Optional<fjn> f,
      Optional<fjy> g,
      Optional<fkj> h,
      Optional<Boolean> i,
      Optional<Boolean> j,
      Optional<Boolean> k,
      Optional<Boolean> l,
      Optional<fke> m,
      Optional<flu> n,
      Optional<flu.c> o
   ) {
   }

   public static record c(String a, fkz b) {
   }
}
