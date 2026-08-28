import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record bu(
   Optional<bx> c,
   Optional<bl> d,
   Optional<dc> e,
   Optional<dc> f,
   Optional<df> g,
   Optional<dg> h,
   Optional<bs> i,
   Optional<br> j,
   Optional<bv> k,
   Optional<bu> l,
   Optional<bu> m,
   Optional<bu> n,
   Optional<String> o,
   Optional<dv> p
) {
   public static final Codec<bu> a = Codec.recursive(
      "EntityPredicate",
      $$0 -> RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     bx.a.optionalFieldOf("type").forGetter(bu::a),
                     bl.a.optionalFieldOf("distance").forGetter(bu::b),
                     dc.a.optionalFieldOf("location").forGetter(bu::c),
                     dc.a.optionalFieldOf("stepping_on").forGetter(bu::d),
                     df.a.optionalFieldOf("effects").forGetter(bu::e),
                     dg.a.optionalFieldOf("nbt").forGetter(bu::f),
                     bs.a.optionalFieldOf("flags").forGetter(bu::g),
                     br.a.optionalFieldOf("equipment").forGetter(bu::h),
                     bv.a.optionalFieldOf("type_specific").forGetter(bu::i),
                     $$0.optionalFieldOf("vehicle").forGetter(bu::j),
                     $$0.optionalFieldOf("passenger").forGetter(bu::k),
                     $$0.optionalFieldOf("targeted_entity").forGetter(bu::l),
                     Codec.STRING.optionalFieldOf("team").forGetter(bu::m),
                     dv.a.optionalFieldOf("slots").forGetter(bu::n)
                  )
                  .apply($$1, bu::new)
         )
   );
   public static final Codec<bf> b = Codec.withAlternative(bf.a, a, bu::a);

   public static bf a(bu.a $$0) {
      return a($$0.b());
   }

   public static Optional<bf> a(Optional<bu> $$0) {
      return $$0.map(bu::a);
   }

   public static List<bf> a(bu.a... $$0) {
      return Stream.of($$0).map(bu::a).toList();
   }

   public static bf a(bu $$0) {
      ets $$1 = etv.a(eqi.b.a, $$0).build();
      return new bf(List.of($$1));
   }

   public boolean a(arg $$0, @Nullable bsu $$1) {
      return this.a($$0.z(), $$0.dn(), $$1);
   }

   public boolean a(arf $$0, @Nullable evr $$1, @Nullable bsu $$2) {
      if ($$2 == null) {
         return false;
      } else if (this.c.isPresent() && !this.c.get().b($$2.ak())) {
         return false;
      } else {
         if ($$1 == null) {
            if (this.d.isPresent()) {
               return false;
            }
         } else if (this.d.isPresent() && !this.d.get().a($$1.c, $$1.d, $$1.e, $$2.du(), $$2.dw(), $$2.dA())) {
            return false;
         }

         if (this.e.isPresent() && !this.e.get().a($$0, $$2.du(), $$2.dw(), $$2.dA())) {
            return false;
         } else {
            if (this.f.isPresent()) {
               evr $$3 = evr.b($$2.aL());
               if (!this.f.get().a($$0, $$3.a(), $$3.b(), $$3.c())) {
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
            } else if (this.l.isPresent() && !this.l.get().a($$0, $$1, $$2.dc())) {
               return false;
            } else if (this.m.isPresent() && $$2.cS().stream().noneMatch($$2x -> this.m.get().a($$0, $$1, $$2x))) {
               return false;
            } else if (this.n.isPresent() && !this.n.get().a($$0, $$1, $$2 instanceof btr ? ((btr)$$2).p() : null)) {
               return false;
            } else {
               if (this.o.isPresent()) {
                  ewx $$4 = $$2.cj();
                  if ($$4 == null || !this.o.get().equals($$4.b())) {
                     return false;
                  }
               }

               return this.p.isPresent() && !this.p.get().a($$2) ? false : !this.h.isPresent() || this.h.get().a($$2);
            }
         }
      }
   }

   public static eqi b(arg $$0, bsu $$1) {
      eql $$2 = new eql.a($$0.z()).a(ete.a, $$1).a(ete.f, $$0.dn()).a(etd.n);
      return new eqi.a($$2).a(Optional.empty());
   }

   public Optional<bx> a() {
      return this.c;
   }

   public Optional<bl> b() {
      return this.d;
   }

   public Optional<dc> c() {
      return this.e;
   }

   public Optional<dc> d() {
      return this.f;
   }

   public Optional<df> e() {
      return this.g;
   }

   public Optional<dg> f() {
      return this.h;
   }

   public Optional<bs> g() {
      return this.i;
   }

   public Optional<br> h() {
      return this.j;
   }

   public Optional<bv> i() {
      return this.k;
   }

   public Optional<bu> j() {
      return this.l;
   }

   public Optional<bu> k() {
      return this.m;
   }

   public Optional<bu> l() {
      return this.n;
   }

   public Optional<String> m() {
      return this.o;
   }

   public Optional<dv> n() {
      return this.p;
   }

   public static class a {
      private Optional<bx> a = Optional.empty();
      private Optional<bl> b = Optional.empty();
      private Optional<dc> c = Optional.empty();
      private Optional<dc> d = Optional.empty();
      private Optional<df> e = Optional.empty();
      private Optional<dg> f = Optional.empty();
      private Optional<bs> g = Optional.empty();
      private Optional<br> h = Optional.empty();
      private Optional<bv> i = Optional.empty();
      private Optional<bu> j = Optional.empty();
      private Optional<bu> k = Optional.empty();
      private Optional<bu> l = Optional.empty();
      private Optional<String> m = Optional.empty();
      private Optional<dv> n = Optional.empty();

      public static bu.a a() {
         return new bu.a();
      }

      public bu.a a(bta<?> $$0) {
         this.a = Optional.of(bx.a($$0));
         return this;
      }

      public bu.a a(axf<bta<?>> $$0) {
         this.a = Optional.of(bx.a($$0));
         return this;
      }

      public bu.a a(bx $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public bu.a a(bl $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public bu.a a(dc.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bu.a b(dc.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public bu.a a(df.a $$0) {
         this.e = $$0.b();
         return this;
      }

      public bu.a a(dg $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public bu.a a(bs.a $$0) {
         this.g = Optional.of($$0.b());
         return this;
      }

      public bu.a a(br.a $$0) {
         this.h = Optional.of($$0.b());
         return this;
      }

      public bu.a a(br $$0) {
         this.h = Optional.of($$0);
         return this;
      }

      public bu.a a(bv $$0) {
         this.i = Optional.of($$0);
         return this;
      }

      public bu.a a(bu.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public bu.a b(bu.a $$0) {
         this.k = Optional.of($$0.b());
         return this;
      }

      public bu.a c(bu.a $$0) {
         this.l = Optional.of($$0.b());
         return this;
      }

      public bu.a a(String $$0) {
         this.m = Optional.of($$0);
         return this;
      }

      public bu.a a(dv $$0) {
         this.n = Optional.of($$0);
         return this;
      }

      public bu b() {
         return new bu(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
      }
   }
}
