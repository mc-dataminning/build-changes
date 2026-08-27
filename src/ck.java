import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ck(
   Optional<ck.b> b, Optional<ajg<cya>> c, Optional<ajg<ede>> d, Optional<ajg<cxb>> e, Optional<Boolean> f, Optional<ch> g, Optional<av> h, Optional<by> i
) {
   public static final Codec<ck> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awe.a(ck.b.a, "position").forGetter(ck::a),
               awe.a(ajg.a(kj.au), "biome").forGetter(ck::b),
               awe.a(ajg.a(kj.aE), "structure").forGetter(ck::c),
               awe.a(ajg.a(kj.aN), "dimension").forGetter(ck::d),
               awe.a(Codec.BOOL, "smokey").forGetter(ck::e),
               awe.a(ch.a, "light").forGetter(ck::f),
               awe.a(av.a, "block").forGetter(ck::g),
               awe.a(by.a, "fluid").forGetter(ck::h)
            )
            .apply($$0, ck::new)
   );

   private static Optional<ck> a(
      Optional<ck.b> $$0,
      Optional<ajg<cya>> $$1,
      Optional<ajg<ede>> $$2,
      Optional<ajg<cxb>> $$3,
      Optional<Boolean> $$4,
      Optional<ch> $$5,
      Optional<av> $$6,
      Optional<by> $$7
   ) {
      return $$0.isEmpty() && $$1.isEmpty() && $$2.isEmpty() && $$3.isEmpty() && $$4.isEmpty() && $$5.isEmpty() && $$6.isEmpty() && $$7.isEmpty()
         ? Optional.empty()
         : Optional.of(new ck($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public boolean a(apf $$0, double $$1, double $$2, double $$3) {
      if (this.b.isPresent() && !this.b.get().a($$1, $$2, $$3)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$0.ad()) {
         return false;
      } else {
         ib $$4 = ib.a($$1, $$2, $$3);
         boolean $$5 = $$0.p($$4);
         if (!this.c.isPresent() || $$5 && $$0.t($$4).a(this.c.get())) {
            if (!this.d.isPresent() || $$5 && $$0.a().a($$4, this.d.get()).b()) {
               if (!this.f.isPresent() || $$5 && this.f.get() == daq.a($$0, $$4)) {
                  if (this.g.isPresent() && !this.g.get().a($$0, $$4)) {
                     return false;
                  } else {
                     return this.h.isPresent() && !this.h.get().a($$0, $$4) ? false : !this.i.isPresent() || this.i.get().a($$0, $$4);
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

   public Optional<ck.b> a() {
      return this.b;
   }

   public Optional<ajg<cya>> b() {
      return this.c;
   }

   public Optional<ajg<ede>> c() {
      return this.d;
   }

   public Optional<ajg<cxb>> d() {
      return this.e;
   }

   public Optional<Boolean> e() {
      return this.f;
   }

   public Optional<ch> f() {
      return this.g;
   }

   public Optional<av> g() {
      return this.h;
   }

   public Optional<by> h() {
      return this.i;
   }

   public static class a {
      private cm.c a;
      private cm.c b;
      private cm.c c;
      private Optional<ajg<cya>> d;
      private Optional<ajg<ede>> e;
      private Optional<ajg<cxb>> f;
      private Optional<Boolean> g;
      private Optional<ch> h;
      private Optional<av> i;
      private Optional<by> j;

      public a() {
         this.a = cm.c.c;
         this.b = cm.c.c;
         this.c = cm.c.c;
         this.d = Optional.empty();
         this.e = Optional.empty();
         this.f = Optional.empty();
         this.g = Optional.empty();
         this.h = Optional.empty();
         this.i = Optional.empty();
         this.j = Optional.empty();
      }

      public static ck.a a() {
         return new ck.a();
      }

      public static ck.a a(ajg<cya> $$0) {
         return a().d($$0);
      }

      public static ck.a b(ajg<cxb> $$0) {
         return a().f($$0);
      }

      public static ck.a c(ajg<ede> $$0) {
         return a().e($$0);
      }

      public static ck.a a(cm.c $$0) {
         return a().c($$0);
      }

      public ck.a b(cm.c $$0) {
         this.a = $$0;
         return this;
      }

      public ck.a c(cm.c $$0) {
         this.b = $$0;
         return this;
      }

      public ck.a d(cm.c $$0) {
         this.c = $$0;
         return this;
      }

      public ck.a d(ajg<cya> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ck.a e(ajg<ede> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public ck.a f(ajg<cxb> $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public ck.a a(ch.a $$0) {
         this.h = Optional.of($$0.b());
         return this;
      }

      public ck.a a(av.a $$0) {
         this.i = Optional.of($$0.b());
         return this;
      }

      public ck.a a(by.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public ck.a a(boolean $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public ck b() {
         Optional<ck.b> $$0 = ck.b.a(this.a, this.b, this.c);
         return new ck($$0, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }

   static record b(cm.c b, cm.c c, cm.c d) {
      public static final Codec<ck.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awe.a(cm.c.d, "x", cm.c.c).forGetter(ck.b::a), awe.a(cm.c.d, "y", cm.c.c).forGetter(ck.b::b), awe.a(cm.c.d, "z", cm.c.c).forGetter(ck.b::c)
               )
               .apply($$0, ck.b::new)
      );

      static Optional<ck.b> a(cm.c $$0, cm.c $$1, cm.c $$2) {
         return $$0.c() && $$1.c() && $$2.c() ? Optional.empty() : Optional.of(new ck.b($$0, $$1, $$2));
      }

      public boolean a(double $$0, double $$1, double $$2) {
         return this.b.d($$0) && this.c.d($$1) && this.d.d($$2);
      }

      public cm.c a() {
         return this.b;
      }

      public cm.c b() {
         return this.c;
      }

      public cm.c c() {
         return this.d;
      }
   }
}
