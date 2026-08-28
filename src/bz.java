import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record bz(
   Optional<cc> c,
   Optional<bq> d,
   Optional<cz> e,
   bz.b f,
   Optional<cy> g,
   Optional<da> h,
   Optional<bx> i,
   Optional<bw> j,
   Optional<ca> k,
   Optional<Integer> l,
   Optional<bz> m,
   Optional<bz> n,
   Optional<bz> o,
   Optional<String> p,
   Optional<dq> q,
   bo r
) {
   public static final Codec<bz> a = Codec.recursive(
      "EntityPredicate",
      $$0 -> RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     cc.a.optionalFieldOf("type").forGetter(bz::a),
                     bq.a.optionalFieldOf("distance").forGetter(bz::b),
                     cz.a.optionalFieldOf("movement").forGetter(bz::c),
                     bz.b.a.forGetter(bz::d),
                     cy.a.optionalFieldOf("effects").forGetter(bz::e),
                     da.a.optionalFieldOf("nbt").forGetter(bz::f),
                     bx.a.optionalFieldOf("flags").forGetter(bz::g),
                     bw.a.optionalFieldOf("equipment").forGetter(bz::h),
                     ca.a.optionalFieldOf("type_specific").forGetter(bz::i),
                     ayy.m.optionalFieldOf("periodic_tick").forGetter(bz::j),
                     $$0.optionalFieldOf("vehicle").forGetter(bz::k),
                     $$0.optionalFieldOf("passenger").forGetter(bz::l),
                     $$0.optionalFieldOf("targeted_entity").forGetter(bz::m),
                     Codec.STRING.optionalFieldOf("team").forGetter(bz::n),
                     dq.a.optionalFieldOf("slots").forGetter(bz::o),
                     bo.b.forGetter(bz::p)
                  )
                  .apply($$1, bz::new)
         )
   );
   public static final Codec<bj> b = Codec.withAlternative(bj.a, a, bz::a);

   public static bj a(bz.a $$0) {
      return a($$0.b());
   }

   public static Optional<bj> a(Optional<bz> $$0) {
      return $$0.map(bz::a);
   }

   public static List<bj> a(bz.a... $$0) {
      return Stream.of($$0).map(bz::a).toList();
   }

   public static bj a(bz $$0) {
      fds $$1 = fdv.a(faj.b.a, $$0).build();
      return new bj(List.of($$1));
   }

   public boolean a(arv $$0, @Nullable bwv $$1) {
      return this.a($$0.y(), $$0.dt(), $$1);
   }

   public boolean a(aru $$0, @Nullable ffs $$1, @Nullable bwv $$2) {
      if ($$2 == null) {
         return false;
      } else if (this.c.isPresent() && !this.c.get().a($$2.an())) {
         return false;
      } else {
         if ($$1 == null) {
            if (this.d.isPresent()) {
               return false;
            }
         } else if (this.d.isPresent() && !this.d.get().a($$1.d, $$1.e, $$1.f, $$2.dA(), $$2.dC(), $$2.dG())) {
            return false;
         }

         if (this.e.isPresent()) {
            ffs $$3 = $$2.ae();
            ffs $$4 = $$3.c(20.0);
            if (!this.e.get().a($$4.d, $$4.e, $$4.f, $$2.Z)) {
               return false;
            }
         }

         if (this.f.b.isPresent() && !this.f.b.get().a($$0, $$2.dA(), $$2.dC(), $$2.dG())) {
            return false;
         } else {
            if (this.f.c.isPresent()) {
               ffs $$5 = ffs.b($$2.aQ());
               if (!$$2.aH() || !this.f.c.get().a($$0, $$5.a(), $$5.b(), $$5.c())) {
                  return false;
               }
            }

            if (this.f.d.isPresent()) {
               ffs $$6 = ffs.b($$2.aP());
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
            } else if (this.m.isPresent() && !this.m.get().a($$0, $$1, $$2.dk())) {
               return false;
            } else if (this.n.isPresent() && $$2.cY().stream().noneMatch($$2x -> this.n.get().a($$0, $$1, $$2x))) {
               return false;
            } else if (this.o.isPresent() && !this.o.get().a($$0, $$1, $$2 instanceof bxy ? ((bxy)$$2).f() : null)) {
               return false;
            } else if (this.l.isPresent() && $$2.af % this.l.get() != 0) {
               return false;
            } else {
               if (this.p.isPresent()) {
                  fgz $$7 = $$2.cq();
                  if ($$7 == null || !this.p.get().equals($$7.c())) {
                     return false;
                  }
               }

               if (this.q.isPresent() && !this.q.get().a($$2)) {
                  return false;
               } else {
                  return !this.r.a($$2) ? false : this.h.isEmpty() || this.h.get().a($$2);
               }
            }
         }
      }
   }

   public static faj b(arv $$0, bwv $$1) {
      fam $$2 = new fam.a($$0.y()).a(fdd.a, $$1).a(fdd.f, $$0.dt()).a(fdc.n);
      return new faj.a($$2).a(Optional.empty());
   }

   public Optional<cc> a() {
      return this.c;
   }

   public Optional<bq> b() {
      return this.d;
   }

   public Optional<cz> c() {
      return this.e;
   }

   public bz.b d() {
      return this.f;
   }

   public Optional<cy> e() {
      return this.g;
   }

   public Optional<da> f() {
      return this.h;
   }

   public Optional<bx> g() {
      return this.i;
   }

   public Optional<bw> h() {
      return this.j;
   }

   public Optional<ca> i() {
      return this.k;
   }

   public Optional<Integer> j() {
      return this.l;
   }

   public Optional<bz> k() {
      return this.m;
   }

   public Optional<bz> l() {
      return this.n;
   }

   public Optional<bz> m() {
      return this.o;
   }

   public Optional<String> n() {
      return this.p;
   }

   public Optional<dq> o() {
      return this.q;
   }

   public bo p() {
      return this.r;
   }

   public static class a {
      private Optional<cc> a = Optional.empty();
      private Optional<bq> b = Optional.empty();
      private Optional<cz> c = Optional.empty();
      private Optional<cv> d = Optional.empty();
      private Optional<cv> e = Optional.empty();
      private Optional<cv> f = Optional.empty();
      private Optional<cy> g = Optional.empty();
      private Optional<da> h = Optional.empty();
      private Optional<bx> i = Optional.empty();
      private Optional<bw> j = Optional.empty();
      private Optional<ca> k = Optional.empty();
      private Optional<Integer> l = Optional.empty();
      private Optional<bz> m = Optional.empty();
      private Optional<bz> n = Optional.empty();
      private Optional<bz> o = Optional.empty();
      private Optional<String> p = Optional.empty();
      private Optional<dq> q = Optional.empty();
      private bo r = bo.a;

      public static bz.a a() {
         return new bz.a();
      }

      public bz.a a(jh<bxe<?>> $$0, bxe<?> $$1) {
         this.a = Optional.of(cc.a($$0, $$1));
         return this;
      }

      public bz.a a(jh<bxe<?>> $$0, axv<bxe<?>> $$1) {
         this.a = Optional.of(cc.a($$0, $$1));
         return this;
      }

      public bz.a a(cc $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public bz.a a(bq $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public bz.a a(cz $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public bz.a a(cv.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public bz.a b(cv.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bz.a c(cv.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public bz.a a(cy.a $$0) {
         this.g = $$0.b();
         return this;
      }

      public bz.a a(da $$0) {
         this.h = Optional.of($$0);
         return this;
      }

      public bz.a a(bx.a $$0) {
         this.i = Optional.of($$0.b());
         return this;
      }

      public bz.a a(bw.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public bz.a a(bw $$0) {
         this.j = Optional.of($$0);
         return this;
      }

      public bz.a a(ca $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public bz.a a(int $$0) {
         this.l = Optional.of($$0);
         return this;
      }

      public bz.a a(bz.a $$0) {
         this.m = Optional.of($$0.b());
         return this;
      }

      public bz.a b(bz.a $$0) {
         this.n = Optional.of($$0.b());
         return this;
      }

      public bz.a c(bz.a $$0) {
         this.o = Optional.of($$0.b());
         return this;
      }

      public bz.a a(String $$0) {
         this.p = Optional.of($$0);
         return this;
      }

      public bz.a a(dq $$0) {
         this.q = Optional.of($$0);
         return this;
      }

      public bz.a a(bo $$0) {
         this.r = $$0;
         return this;
      }

      public bz b() {
         return new bz(
            this.a,
            this.b,
            this.c,
            new bz.b(this.d, this.e, this.f),
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

   public static record b(Optional<cv> b, Optional<cv> c, Optional<cv> d) {
      public static final MapCodec<bz.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cv.a.optionalFieldOf("location").forGetter(bz.b::a),
                  cv.a.optionalFieldOf("stepping_on").forGetter(bz.b::b),
                  cv.a.optionalFieldOf("movement_affected_by").forGetter(bz.b::c)
               )
               .apply($$0, bz.b::new)
      );

      public Optional<cv> a() {
         return this.b;
      }

      public Optional<cv> b() {
         return this.c;
      }

      public Optional<cv> c() {
         return this.d;
      }
   }
}
