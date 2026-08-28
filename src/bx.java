import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record bx(
   Optional<ca> c,
   Optional<bo> d,
   Optional<dm> e,
   bx.b f,
   Optional<dl> g,
   Optional<dn> h,
   Optional<bv> i,
   Optional<bu> j,
   Optional<by> k,
   Optional<Integer> l,
   Optional<bx> m,
   Optional<bx> n,
   Optional<bx> o,
   Optional<String> p,
   Optional<ed> q
) {
   public static final Codec<bx> a = Codec.recursive(
      "EntityPredicate",
      $$0 -> RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     ca.a.optionalFieldOf("type").forGetter(bx::a),
                     bo.a.optionalFieldOf("distance").forGetter(bx::b),
                     dm.a.optionalFieldOf("movement").forGetter(bx::c),
                     bx.b.a.forGetter(bx::d),
                     dl.a.optionalFieldOf("effects").forGetter(bx::e),
                     dn.a.optionalFieldOf("nbt").forGetter(bx::f),
                     bv.a.optionalFieldOf("flags").forGetter(bx::g),
                     bu.a.optionalFieldOf("equipment").forGetter(bx::h),
                     by.a.optionalFieldOf("type_specific").forGetter(bx::i),
                     ayi.m.optionalFieldOf("periodic_tick").forGetter(bx::j),
                     $$0.optionalFieldOf("vehicle").forGetter(bx::k),
                     $$0.optionalFieldOf("passenger").forGetter(bx::l),
                     $$0.optionalFieldOf("targeted_entity").forGetter(bx::m),
                     Codec.STRING.optionalFieldOf("team").forGetter(bx::n),
                     ed.a.optionalFieldOf("slots").forGetter(bx::o)
                  )
                  .apply($$1, bx::new)
         )
   );
   public static final Codec<bi> b = Codec.withAlternative(bi.a, a, bx::a);

   public static bi a(bx.a $$0) {
      return a($$0.b());
   }

   public static Optional<bi> a(Optional<bx> $$0) {
      return $$0.map(bx::a);
   }

   public static List<bi> a(bx.a... $$0) {
      return Stream.of($$0).map(bx::a).toList();
   }

   public static bi a(bx $$0) {
      eza $$1 = ezd.a(evr.b.a, $$0).build();
      return new bi(List.of($$1));
   }

   public boolean a(are $$0, @Nullable bul $$1) {
      return this.a($$0.y(), $$0.dt(), $$1);
   }

   public boolean a(ard $$0, @Nullable fba $$1, @Nullable bul $$2) {
      if ($$2 == null) {
         return false;
      } else if (this.c.isPresent() && !this.c.get().a($$2.aq())) {
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
            fba $$3 = $$2.ah();
            fba $$4 = $$3.c(20.0);
            if (!this.e.get().a($$4.d, $$4.e, $$4.f, (double)$$2.Z)) {
               return false;
            }
         }

         if (this.f.b.isPresent() && !this.f.b.get().a($$0, $$2.dA(), $$2.dC(), $$2.dG())) {
            return false;
         } else {
            if (this.f.c.isPresent()) {
               fba $$5 = fba.b($$2.aR());
               if (!this.f.c.get().a($$0, $$5.a(), $$5.b(), $$5.c())) {
                  return false;
               }
            }

            if (this.f.d.isPresent()) {
               fba $$6 = fba.b($$2.aQ());
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
            } else if (this.o.isPresent() && !this.o.get().a($$0, $$1, $$2 instanceof bvj ? ((bvj)$$2).O_() : null)) {
               return false;
            } else if (this.l.isPresent() && $$2.af % this.l.get() != 0) {
               return false;
            } else {
               if (this.p.isPresent()) {
                  fch $$7 = $$2.cr();
                  if ($$7 == null || !this.p.get().equals($$7.b())) {
                     return false;
                  }
               }

               return this.q.isPresent() && !this.q.get().a($$2) ? false : !this.h.isPresent() || this.h.get().a($$2);
            }
         }
      }
   }

   public static evr b(are $$0, bul $$1) {
      evu $$2 = new evu.a($$0.y()).a(eyl.a, $$1).a(eyl.f, $$0.dt()).a(eyk.n);
      return new evr.a($$2).a(Optional.empty());
   }

   public Optional<ca> a() {
      return this.c;
   }

   public Optional<bo> b() {
      return this.d;
   }

   public Optional<dm> c() {
      return this.e;
   }

   public bx.b d() {
      return this.f;
   }

   public Optional<dl> e() {
      return this.g;
   }

   public Optional<dn> f() {
      return this.h;
   }

   public Optional<bv> g() {
      return this.i;
   }

   public Optional<bu> h() {
      return this.j;
   }

   public Optional<by> i() {
      return this.k;
   }

   public Optional<Integer> j() {
      return this.l;
   }

   public Optional<bx> k() {
      return this.m;
   }

   public Optional<bx> l() {
      return this.n;
   }

   public Optional<bx> m() {
      return this.o;
   }

   public Optional<String> n() {
      return this.p;
   }

   public Optional<ed> o() {
      return this.q;
   }

   public static class a {
      private Optional<ca> a = Optional.empty();
      private Optional<bo> b = Optional.empty();
      private Optional<dm> c = Optional.empty();
      private Optional<di> d = Optional.empty();
      private Optional<di> e = Optional.empty();
      private Optional<di> f = Optional.empty();
      private Optional<dl> g = Optional.empty();
      private Optional<dn> h = Optional.empty();
      private Optional<bv> i = Optional.empty();
      private Optional<bu> j = Optional.empty();
      private Optional<by> k = Optional.empty();
      private Optional<Integer> l = Optional.empty();
      private Optional<bx> m = Optional.empty();
      private Optional<bx> n = Optional.empty();
      private Optional<bx> o = Optional.empty();
      private Optional<String> p = Optional.empty();
      private Optional<ed> q = Optional.empty();

      public static bx.a a() {
         return new bx.a();
      }

      public bx.a a(js<bus<?>> $$0, bus<?> $$1) {
         this.a = Optional.of(ca.a($$0, $$1));
         return this;
      }

      public bx.a a(js<bus<?>> $$0, axf<bus<?>> $$1) {
         this.a = Optional.of(ca.a($$0, $$1));
         return this;
      }

      public bx.a a(ca $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public bx.a a(bo $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public bx.a a(dm $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public bx.a a(di.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public bx.a b(di.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bx.a c(di.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public bx.a a(dl.a $$0) {
         this.g = $$0.b();
         return this;
      }

      public bx.a a(dn $$0) {
         this.h = Optional.of($$0);
         return this;
      }

      public bx.a a(bv.a $$0) {
         this.i = Optional.of($$0.b());
         return this;
      }

      public bx.a a(bu.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public bx.a a(bu $$0) {
         this.j = Optional.of($$0);
         return this;
      }

      public bx.a a(by $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public bx.a a(int $$0) {
         this.l = Optional.of($$0);
         return this;
      }

      public bx.a a(bx.a $$0) {
         this.m = Optional.of($$0.b());
         return this;
      }

      public bx.a b(bx.a $$0) {
         this.n = Optional.of($$0.b());
         return this;
      }

      public bx.a c(bx.a $$0) {
         this.o = Optional.of($$0.b());
         return this;
      }

      public bx.a a(String $$0) {
         this.p = Optional.of($$0);
         return this;
      }

      public bx.a a(ed $$0) {
         this.q = Optional.of($$0);
         return this;
      }

      public bx b() {
         return new bx(
            this.a, this.b, this.c, new bx.b(this.d, this.e, this.f), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q
         );
      }
   }

   public static record b(Optional<di> b, Optional<di> c, Optional<di> d) {
      public static final MapCodec<bx.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  di.a.optionalFieldOf("location").forGetter(bx.b::a),
                  di.a.optionalFieldOf("stepping_on").forGetter(bx.b::b),
                  di.a.optionalFieldOf("movement_affected_by").forGetter(bx.b::c)
               )
               .apply($$0, bx.b::new)
      );

      public Optional<di> a() {
         return this.b;
      }

      public Optional<di> b() {
         return this.c;
      }

      public Optional<di> c() {
         return this.d;
      }
   }
}
