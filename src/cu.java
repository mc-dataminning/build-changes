import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cu(
   Optional<cu.b> b,
   Optional<jj<dla>> c,
   Optional<jj<esb>> d,
   Optional<alh<djx>> e,
   Optional<Boolean> f,
   Optional<cr> g,
   Optional<az> h,
   Optional<cg> i,
   Optional<Boolean> j
) {
   public static final Codec<cu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cu.b.a.optionalFieldOf("position").forGetter(cu::a),
               ju.a(mh.aG).optionalFieldOf("biomes").forGetter(cu::b),
               ju.a(mh.be).optionalFieldOf("structures").forGetter(cu::c),
               alh.a(mh.bp).optionalFieldOf("dimension").forGetter(cu::d),
               Codec.BOOL.optionalFieldOf("smokey").forGetter(cu::e),
               cr.a.optionalFieldOf("light").forGetter(cu::f),
               az.a.optionalFieldOf("block").forGetter(cu::g),
               cg.a.optionalFieldOf("fluid").forGetter(cu::h),
               Codec.BOOL.optionalFieldOf("can_see_sky").forGetter(cu::i)
            )
            .apply($$0, cu::new)
   );

   public boolean a(ars $$0, double $$1, double $$2, double $$3) {
      if (this.b.isPresent() && !this.b.get().a($$1, $$2, $$3)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$0.aj()) {
         return false;
      } else {
         iv $$4 = iv.a($$1, $$2, $$3);
         boolean $$5 = $$0.p($$4);
         if (!this.c.isPresent() || $$5 && this.c.get().a($$0.u($$4))) {
            if (!this.d.isPresent() || $$5 && $$0.b().a($$4, this.d.get()).b()) {
               if (!this.f.isPresent() || $$5 && this.f.get() == dns.a($$0, $$4)) {
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

   public Optional<cu.b> a() {
      return this.b;
   }

   public Optional<jj<dla>> b() {
      return this.c;
   }

   public Optional<jj<esb>> c() {
      return this.d;
   }

   public Optional<alh<djx>> d() {
      return this.e;
   }

   public Optional<Boolean> e() {
      return this.f;
   }

   public Optional<cr> f() {
      return this.g;
   }

   public Optional<az> g() {
      return this.h;
   }

   public Optional<cg> h() {
      return this.i;
   }

   public Optional<Boolean> i() {
      return this.j;
   }

   public static class a {
      private cw.c a;
      private cw.c b;
      private cw.c c;
      private Optional<jj<dla>> d;
      private Optional<jj<esb>> e;
      private Optional<alh<djx>> f;
      private Optional<Boolean> g;
      private Optional<cr> h;
      private Optional<az> i;
      private Optional<cg> j;
      private Optional<Boolean> k;

      public a() {
         this.a = cw.c.c;
         this.b = cw.c.c;
         this.c = cw.c.c;
         this.d = Optional.empty();
         this.e = Optional.empty();
         this.f = Optional.empty();
         this.g = Optional.empty();
         this.h = Optional.empty();
         this.i = Optional.empty();
         this.j = Optional.empty();
         this.k = Optional.empty();
      }

      public static cu.a a() {
         return new cu.a();
      }

      public static cu.a a(jf<dla> $$0) {
         return a().a(jj.a($$0));
      }

      public static cu.a a(alh<djx> $$0) {
         return a().b($$0);
      }

      public static cu.a b(jf<esb> $$0) {
         return a().b(jj.a($$0));
      }

      public static cu.a a(cw.c $$0) {
         return a().c($$0);
      }

      public cu.a b(cw.c $$0) {
         this.a = $$0;
         return this;
      }

      public cu.a c(cw.c $$0) {
         this.b = $$0;
         return this;
      }

      public cu.a d(cw.c $$0) {
         this.c = $$0;
         return this;
      }

      public cu.a a(jj<dla> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public cu.a b(jj<esb> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public cu.a b(alh<djx> $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public cu.a a(cr.a $$0) {
         this.h = Optional.of($$0.b());
         return this;
      }

      public cu.a a(az.a $$0) {
         this.i = Optional.of($$0.b());
         return this;
      }

      public cu.a a(cg.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public cu.a a(boolean $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public cu.a b(boolean $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public cu b() {
         Optional<cu.b> $$0 = cu.b.a(this.a, this.b, this.c);
         return new cu($$0, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
      }
   }

   static record b(cw.c b, cw.c c, cw.c d) {
      public static final Codec<cu.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cw.c.d.optionalFieldOf("x", cw.c.c).forGetter(cu.b::a),
                  cw.c.d.optionalFieldOf("y", cw.c.c).forGetter(cu.b::b),
                  cw.c.d.optionalFieldOf("z", cw.c.c).forGetter(cu.b::c)
               )
               .apply($$0, cu.b::new)
      );

      static Optional<cu.b> a(cw.c $$0, cw.c $$1, cw.c $$2) {
         return $$0.c() && $$1.c() && $$2.c() ? Optional.empty() : Optional.of(new cu.b($$0, $$1, $$2));
      }

      public boolean a(double $$0, double $$1, double $$2) {
         return this.b.d($$0) && this.c.d($$1) && this.d.d($$2);
      }

      public cw.c a() {
         return this.b;
      }

      public cw.c b() {
         return this.c;
      }

      public cw.c c() {
         return this.d;
      }
   }
}
