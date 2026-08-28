import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record by(
   Optional<cb> c,
   Optional<bp> d,
   Optional<cy> e,
   by.b f,
   Optional<cx> g,
   Optional<cz> h,
   Optional<bw> i,
   Optional<bv> j,
   Optional<bz> k,
   Optional<Integer> l,
   Optional<by> m,
   Optional<by> n,
   Optional<by> o,
   Optional<String> p,
   Optional<dp> q,
   Optional<ke> r
) {
   public static final Codec<by> a = Codec.recursive(
      "EntityPredicate",
      $$0 -> RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     cb.a.optionalFieldOf("type").forGetter(by::a),
                     bp.a.optionalFieldOf("distance").forGetter(by::b),
                     cy.a.optionalFieldOf("movement").forGetter(by::c),
                     by.b.a.forGetter(by::d),
                     cx.a.optionalFieldOf("effects").forGetter(by::e),
                     cz.a.optionalFieldOf("nbt").forGetter(by::f),
                     bw.a.optionalFieldOf("flags").forGetter(by::g),
                     bv.a.optionalFieldOf("equipment").forGetter(by::h),
                     bz.a.optionalFieldOf("type_specific").forGetter(by::i),
                     ayu.m.optionalFieldOf("periodic_tick").forGetter(by::j),
                     $$0.optionalFieldOf("vehicle").forGetter(by::k),
                     $$0.optionalFieldOf("passenger").forGetter(by::l),
                     $$0.optionalFieldOf("targeted_entity").forGetter(by::m),
                     Codec.STRING.optionalFieldOf("team").forGetter(by::n),
                     dp.a.optionalFieldOf("slots").forGetter(by::o),
                     ke.a.optionalFieldOf("components").forGetter(by::p)
                  )
                  .apply($$1, by::new)
         )
   );
   public static final Codec<bj> b = Codec.withAlternative(bj.a, a, by::a);

   public static bj a(by.a $$0) {
      return a($$0.b());
   }

   public static Optional<bj> a(Optional<by> $$0) {
      return $$0.map(by::a);
   }

   public static List<bj> a(by.a... $$0) {
      return Stream.of($$0).map(by::a).toList();
   }

   public static bj a(by $$0) {
      fcx $$1 = fda.a(ezo.b.a, $$0).build();
      return new bj(List.of($$1));
   }

   public boolean a(arr $$0, @Nullable bwi $$1) {
      return this.a($$0.y(), $$0.ds(), $$1);
   }

   public boolean a(arq $$0, @Nullable fex $$1, @Nullable bwi $$2) {
      if ($$2 == null) {
         return false;
      } else if (this.c.isPresent() && !this.c.get().a($$2.an())) {
         return false;
      } else {
         if ($$1 == null) {
            if (this.d.isPresent()) {
               return false;
            }
         } else if (this.d.isPresent() && !this.d.get().a($$1.d, $$1.e, $$1.f, $$2.dz(), $$2.dB(), $$2.dF())) {
            return false;
         }

         if (this.e.isPresent()) {
            fex $$3 = $$2.ae();
            fex $$4 = $$3.c(20.0);
            if (!this.e.get().a($$4.d, $$4.e, $$4.f, $$2.Z)) {
               return false;
            }
         }

         if (this.f.b.isPresent() && !this.f.b.get().a($$0, $$2.dz(), $$2.dB(), $$2.dF())) {
            return false;
         } else {
            if (this.f.c.isPresent()) {
               fex $$5 = fex.b($$2.aP());
               if (!$$2.aH() || !this.f.c.get().a($$0, $$5.a(), $$5.b(), $$5.c())) {
                  return false;
               }
            }

            if (this.f.d.isPresent()) {
               fex $$6 = fex.b($$2.aO());
               if (!this.f.d.get().a($$0, $$6.a(), $$6.b(), $$6.c())) {
                  return false;
               }
            }

            if (this.g.isPresent() && !this.g.get().a($$2)) {
               return false;
            } else if (this.i.isPresent() && !this.i.get().a($$2)) {
               return false;
            } else if (this.j.isPresent() && !this.j.get().a($$2)) {
               return false;
            } else if (this.k.isPresent() && !this.k.get().a($$2, $$0, $$1)) {
               return false;
            } else if (this.m.isPresent() && !this.m.get().a($$0, $$1, $$2.dj())) {
               return false;
            } else if (this.n.isPresent() && $$2.cX().stream().noneMatch($$2x -> this.n.get().a($$0, $$1, $$2x))) {
               return false;
            } else if (this.o.isPresent() && !this.o.get().a($$0, $$1, $$2 instanceof bxl ? ((bxl)$$2).f() : null)) {
               return false;
            } else if (this.l.isPresent() && $$2.af % this.l.get() != 0) {
               return false;
            } else {
               if (this.p.isPresent()) {
                  fge $$7 = $$2.cp();
                  if ($$7 == null || !this.p.get().equals($$7.c())) {
                     return false;
                  }
               }

               if (this.q.isPresent() && !this.q.get().a($$2)) {
                  return false;
               } else {
                  return this.r.isPresent() && !this.r.get().a($$2) ? false : this.h.isEmpty() || this.h.get().a($$2);
               }
            }
         }
      }
   }

   public static ezo b(arr $$0, bwi $$1) {
      ezr $$2 = new ezr.a($$0.y()).a(fci.a, $$1).a(fci.f, $$0.ds()).a(fch.n);
      return new ezo.a($$2).a(Optional.empty());
   }

   public Optional<cb> a() {
      return this.c;
   }

   public Optional<bp> b() {
      return this.d;
   }

   public Optional<cy> c() {
      return this.e;
   }

   public by.b d() {
      return this.f;
   }

   public Optional<cx> e() {
      return this.g;
   }

   public Optional<cz> f() {
      return this.h;
   }

   public Optional<bw> g() {
      return this.i;
   }

   public Optional<bv> h() {
      return this.j;
   }

   public Optional<bz> i() {
      return this.k;
   }

   public Optional<Integer> j() {
      return this.l;
   }

   public Optional<by> k() {
      return this.m;
   }

   public Optional<by> l() {
      return this.n;
   }

   public Optional<by> m() {
      return this.o;
   }

   public Optional<String> n() {
      return this.p;
   }

   public Optional<dp> o() {
      return this.q;
   }

   public Optional<ke> p() {
      return this.r;
   }

   public static class a {
      private Optional<cb> a = Optional.empty();
      private Optional<bp> b = Optional.empty();
      private Optional<cy> c = Optional.empty();
      private Optional<cu> d = Optional.empty();
      private Optional<cu> e = Optional.empty();
      private Optional<cu> f = Optional.empty();
      private Optional<cx> g = Optional.empty();
      private Optional<cz> h = Optional.empty();
      private Optional<bw> i = Optional.empty();
      private Optional<bv> j = Optional.empty();
      private Optional<bz> k = Optional.empty();
      private Optional<Integer> l = Optional.empty();
      private Optional<by> m = Optional.empty();
      private Optional<by> n = Optional.empty();
      private Optional<by> o = Optional.empty();
      private Optional<String> p = Optional.empty();
      private Optional<dp> q = Optional.empty();
      private Optional<ke> r = Optional.empty();

      public static by.a a() {
         return new by.a();
      }

      public by.a a(jg<bwr<?>> $$0, bwr<?> $$1) {
         this.a = Optional.of(cb.a($$0, $$1));
         return this;
      }

      public by.a a(jg<bwr<?>> $$0, axr<bwr<?>> $$1) {
         this.a = Optional.of(cb.a($$0, $$1));
         return this;
      }

      public by.a a(cb $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public by.a a(bp $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public by.a a(cy $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public by.a a(cu.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public by.a b(cu.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public by.a c(cu.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public by.a a(cx.a $$0) {
         this.g = $$0.b();
         return this;
      }

      public by.a a(cz $$0) {
         this.h = Optional.of($$0);
         return this;
      }

      public by.a a(bw.a $$0) {
         this.i = Optional.of($$0.b());
         return this;
      }

      public by.a a(bv.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public by.a a(bv $$0) {
         this.j = Optional.of($$0);
         return this;
      }

      public by.a a(bz $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public by.a a(int $$0) {
         this.l = Optional.of($$0);
         return this;
      }

      public by.a a(by.a $$0) {
         this.m = Optional.of($$0.b());
         return this;
      }

      public by.a b(by.a $$0) {
         this.n = Optional.of($$0.b());
         return this;
      }

      public by.a c(by.a $$0) {
         this.o = Optional.of($$0.b());
         return this;
      }

      public by.a a(String $$0) {
         this.p = Optional.of($$0);
         return this;
      }

      public by.a a(dp $$0) {
         this.q = Optional.of($$0);
         return this;
      }

      public by.a a(ke $$0) {
         this.r = Optional.of($$0);
         return this;
      }

      public by b() {
         return new by(
            this.a,
            this.b,
            this.c,
            new by.b(this.d, this.e, this.f),
            this.g,
            this.h,
            this.i,
            this.j,
            this.k,
            this.l,
            this.m,
            this.n,
            this.o,
            this.p,
            this.q,
            this.r
         );
      }
   }

   public static record b(Optional<cu> b, Optional<cu> c, Optional<cu> d) {
      public static final MapCodec<by.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cu.a.optionalFieldOf("location").forGetter(by.b::a),
                  cu.a.optionalFieldOf("stepping_on").forGetter(by.b::b),
                  cu.a.optionalFieldOf("movement_affected_by").forGetter(by.b::c)
               )
               .apply($$0, by.b::new)
      );

      public Optional<cu> a() {
         return this.b;
      }

      public Optional<cu> b() {
         return this.c;
      }

      public Optional<cu> c() {
         return this.d;
      }
   }
}
