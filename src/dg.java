import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dg(
   Optional<dg.b> b,
   Optional<jt<dfw>> c,
   Optional<jt<elr>> d,
   Optional<alg<dev>> e,
   Optional<Boolean> f,
   Optional<dd> g,
   Optional<aw> h,
   Optional<cd> i,
   Optional<Boolean> j
) {
   public static final Codec<dg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dg.b.a.optionalFieldOf("position").forGetter(dg::a),
               ke.a(ly.aG).optionalFieldOf("biomes").forGetter(dg::b),
               ke.a(ly.aS).optionalFieldOf("structures").forGetter(dg::c),
               alg.a(ly.bb).optionalFieldOf("dimension").forGetter(dg::d),
               Codec.BOOL.optionalFieldOf("smokey").forGetter(dg::e),
               dd.a.optionalFieldOf("light").forGetter(dg::f),
               aw.a.optionalFieldOf("block").forGetter(dg::g),
               cd.a.optionalFieldOf("fluid").forGetter(dg::h),
               Codec.BOOL.optionalFieldOf("can_see_sky").forGetter(dg::i)
            )
            .apply($$0, dg::new)
   );

   public boolean a(arm $$0, double $$1, double $$2, double $$3) {
      if (this.b.isPresent() && !this.b.get().a($$1, $$2, $$3)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$0.ag()) {
         return false;
      } else {
         jg $$4 = jg.a($$1, $$2, $$3);
         boolean $$5 = $$0.p($$4);
         if (!this.c.isPresent() || $$5 && this.c.get().a($$0.t($$4))) {
            if (!this.d.isPresent() || $$5 && $$0.a().a($$4, this.d.get()).b()) {
               if (!this.f.isPresent() || $$5 && this.f.get() == dim.a($$0, $$4)) {
                  if (this.g.isPresent() && !this.g.get().a($$0, $$4)) {
                     return false;
                  } else if (this.h.isPresent() && !this.h.get().a($$0, $$4)) {
                     return false;
                  } else {
                     return this.i.isPresent() && !this.i.get().a($$0, $$4) ? false : !this.j.isPresent() || this.j.get() == $$0.h($$4);
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   public Optional<dg.b> a() {
      return this.b;
   }

   public Optional<jt<dfw>> b() {
      return this.c;
   }

   public Optional<jt<elr>> c() {
      return this.d;
   }

   public Optional<alg<dev>> d() {
      return this.e;
   }

   public Optional<Boolean> e() {
      return this.f;
   }

   public Optional<dd> f() {
      return this.g;
   }

   public Optional<aw> g() {
      return this.h;
   }

   public Optional<cd> h() {
      return this.i;
   }

   public Optional<Boolean> i() {
      return this.j;
   }

   public static class a {
      private di.c a;
      private di.c b;
      private di.c c;
      private Optional<jt<dfw>> d;
      private Optional<jt<elr>> e;
      private Optional<alg<dev>> f;
      private Optional<Boolean> g;
      private Optional<dd> h;
      private Optional<aw> i;
      private Optional<cd> j;
      private Optional<Boolean> k;

      public a() {
         this.a = di.c.c;
         this.b = di.c.c;
         this.c = di.c.c;
         this.d = Optional.empty();
         this.e = Optional.empty();
         this.f = Optional.empty();
         this.g = Optional.empty();
         this.h = Optional.empty();
         this.i = Optional.empty();
         this.j = Optional.empty();
         this.k = Optional.empty();
      }

      public static dg.a a() {
         return new dg.a();
      }

      public static dg.a a(jp<dfw> $$0) {
         return a().a(jt.a($$0));
      }

      public static dg.a a(alg<dev> $$0) {
         return a().b($$0);
      }

      public static dg.a b(jp<elr> $$0) {
         return a().b(jt.a($$0));
      }

      public static dg.a a(di.c $$0) {
         return a().c($$0);
      }

      public dg.a b(di.c $$0) {
         this.a = $$0;
         return this;
      }

      public dg.a c(di.c $$0) {
         this.b = $$0;
         return this;
      }

      public dg.a d(di.c $$0) {
         this.c = $$0;
         return this;
      }

      public dg.a a(jt<dfw> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public dg.a b(jt<elr> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public dg.a b(alg<dev> $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public dg.a a(dd.a $$0) {
         this.h = Optional.of($$0.b());
         return this;
      }

      public dg.a a(aw.a $$0) {
         this.i = Optional.of($$0.b());
         return this;
      }

      public dg.a a(cd.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public dg.a a(boolean $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public dg.a b(boolean $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public dg b() {
         Optional<dg.b> $$0 = dg.b.a(this.a, this.b, this.c);
         return new dg($$0, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
      }
   }

   static record b(di.c b, di.c c, di.c d) {
      public static final Codec<dg.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  di.c.d.optionalFieldOf("x", di.c.c).forGetter(dg.b::a),
                  di.c.d.optionalFieldOf("y", di.c.c).forGetter(dg.b::b),
                  di.c.d.optionalFieldOf("z", di.c.c).forGetter(dg.b::c)
               )
               .apply($$0, dg.b::new)
      );

      static Optional<dg.b> a(di.c $$0, di.c $$1, di.c $$2) {
         return $$0.c() && $$1.c() && $$2.c() ? Optional.empty() : Optional.of(new dg.b($$0, $$1, $$2));
      }

      public boolean a(double $$0, double $$1, double $$2) {
         return this.b.d($$0) && this.c.d($$1) && this.d.d($$2);
      }

      public di.c a() {
         return this.b;
      }

      public di.c b() {
         return this.c;
      }

      public di.c c() {
         return this.d;
      }
   }
}
