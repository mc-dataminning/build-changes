import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record bu(
   Optional<bx> c,
   Optional<bl> d,
   Optional<dg> e,
   Optional<dc> f,
   Optional<dc> g,
   Optional<df> h,
   Optional<dh> i,
   Optional<bs> j,
   Optional<br> k,
   Optional<bv> l,
   Optional<Integer> m,
   Optional<bu> n,
   Optional<bu> o,
   Optional<bu> p,
   Optional<String> q,
   Optional<dw> r
) {
   public static final Codec<bu> a = Codec.recursive(
      "EntityPredicate",
      $$0 -> RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     bx.a.optionalFieldOf("type").forGetter(bu::a),
                     bl.a.optionalFieldOf("distance").forGetter(bu::b),
                     dg.a.optionalFieldOf("movement").forGetter(bu::c),
                     dc.a.optionalFieldOf("location").forGetter(bu::d),
                     dc.a.optionalFieldOf("stepping_on").forGetter(bu::e),
                     df.a.optionalFieldOf("effects").forGetter(bu::f),
                     dh.a.optionalFieldOf("nbt").forGetter(bu::g),
                     bs.a.optionalFieldOf("flags").forGetter(bu::h),
                     br.a.optionalFieldOf("equipment").forGetter(bu::i),
                     bv.a.optionalFieldOf("type_specific").forGetter(bu::j),
                     axm.l.optionalFieldOf("periodic_tick").forGetter(bu::k),
                     $$0.optionalFieldOf("vehicle").forGetter(bu::l),
                     $$0.optionalFieldOf("passenger").forGetter(bu::m),
                     $$0.optionalFieldOf("targeted_entity").forGetter(bu::n),
                     Codec.STRING.optionalFieldOf("team").forGetter(bu::o),
                     dw.a.optionalFieldOf("slots").forGetter(bu::p)
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
      etz $$1 = euc.a(eqo.b.a, $$0).build();
      return new bf(List.of($$1));
   }

   public boolean a(aql $$0, @Nullable bsd $$1) {
      return this.a($$0.z(), $$0.dn(), $$1);
   }

   public boolean a(aqk $$0, @Nullable evz $$1, @Nullable bsd $$2) {
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

         if (this.e.isPresent()) {
            evz $$3 = $$2.ds();
            evz $$4 = $$3.a(20.0);
            if (!this.e.get().a($$4.c, $$4.d, $$4.e, (double)$$2.ac)) {
               return false;
            }
         }

         if (this.f.isPresent() && !this.f.get().a($$0, $$2.du(), $$2.dw(), $$2.dA())) {
            return false;
         } else {
            if (this.g.isPresent()) {
               evz $$5 = evz.b($$2.aL());
               if (!this.g.get().a($$0, $$5.a(), $$5.b(), $$5.c())) {
                  return false;
               }
            }

            if (this.h.isPresent() && !this.h.get().a($$2)) {
               return false;
            } else if (this.j.isPresent() && !this.j.get().a($$2)) {
               return false;
            } else if (this.k.isPresent() && !this.k.get().a($$2)) {
               return false;
            } else if (this.l.isPresent() && !this.l.get().a($$2, $$0, $$1)) {
               return false;
            } else if (this.n.isPresent() && !this.n.get().a($$0, $$1, $$2.dc())) {
               return false;
            } else if (this.o.isPresent() && $$2.cS().stream().noneMatch($$2x -> this.o.get().a($$0, $$1, $$2x))) {
               return false;
            } else if (this.p.isPresent() && !this.p.get().a($$0, $$1, $$2 instanceof bta ? ((bta)$$2).p() : null)) {
               return false;
            } else if (this.m.isPresent() && $$2.ai % this.m.get() != 0) {
               return false;
            } else {
               if (this.q.isPresent()) {
                  exf $$6 = $$2.cj();
                  if ($$6 == null || !this.q.get().equals($$6.b())) {
                     return false;
                  }
               }

               return this.r.isPresent() && !this.r.get().a($$2) ? false : !this.i.isPresent() || this.i.get().a($$2);
            }
         }
      }
   }

   public static eqo b(aql $$0, bsd $$1) {
      eqr $$2 = new eqr.a($$0.z()).a(etk.a, $$1).a(etk.f, $$0.dn()).a(etj.n);
      return new eqo.a($$2).a(Optional.empty());
   }

   public Optional<bx> a() {
      return this.c;
   }

   public Optional<bl> b() {
      return this.d;
   }

   public Optional<dg> c() {
      return this.e;
   }

   public Optional<dc> d() {
      return this.f;
   }

   public Optional<dc> e() {
      return this.g;
   }

   public Optional<df> f() {
      return this.h;
   }

   public Optional<dh> g() {
      return this.i;
   }

   public Optional<bs> h() {
      return this.j;
   }

   public Optional<br> i() {
      return this.k;
   }

   public Optional<bv> j() {
      return this.l;
   }

   public Optional<Integer> k() {
      return this.m;
   }

   public Optional<bu> l() {
      return this.n;
   }

   public Optional<bu> m() {
      return this.o;
   }

   public Optional<bu> n() {
      return this.p;
   }

   public Optional<String> o() {
      return this.q;
   }

   public Optional<dw> p() {
      return this.r;
   }

   public static class a {
      private Optional<bx> a = Optional.empty();
      private Optional<bl> b = Optional.empty();
      private Optional<bl> c = Optional.empty();
      private Optional<dg> d = Optional.empty();
      private Optional<dc> e = Optional.empty();
      private Optional<dc> f = Optional.empty();
      private Optional<df> g = Optional.empty();
      private Optional<dh> h = Optional.empty();
      private Optional<bs> i = Optional.empty();
      private Optional<br> j = Optional.empty();
      private Optional<bv> k = Optional.empty();
      private Optional<Integer> l = Optional.empty();
      private Optional<bu> m = Optional.empty();
      private Optional<bu> n = Optional.empty();
      private Optional<bu> o = Optional.empty();
      private Optional<String> p = Optional.empty();
      private Optional<dw> q = Optional.empty();

      public static bu.a a() {
         return new bu.a();
      }

      public bu.a a(bsj<?> $$0) {
         this.a = Optional.of(bx.a($$0));
         return this;
      }

      public bu.a a(awk<bsj<?>> $$0) {
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

      public bu.a a(dg $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public bu.a a(dc.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bu.a b(dc.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public bu.a a(df.a $$0) {
         this.g = $$0.b();
         return this;
      }

      public bu.a a(dh $$0) {
         this.h = Optional.of($$0);
         return this;
      }

      public bu.a a(bs.a $$0) {
         this.i = Optional.of($$0.b());
         return this;
      }

      public bu.a a(br.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public bu.a a(br $$0) {
         this.j = Optional.of($$0);
         return this;
      }

      public bu.a a(bv $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public bu.a a(int $$0) {
         this.l = Optional.of($$0);
         return this;
      }

      public bu.a a(bu.a $$0) {
         this.m = Optional.of($$0.b());
         return this;
      }

      public bu.a b(bu.a $$0) {
         this.n = Optional.of($$0.b());
         return this;
      }

      public bu.a c(bu.a $$0) {
         this.o = Optional.of($$0.b());
         return this;
      }

      public bu.a a(String $$0) {
         this.p = Optional.of($$0);
         return this;
      }

      public bu.a a(dw $$0) {
         this.q = Optional.of($$0);
         return this;
      }

      public bu b() {
         return new bu(this.a, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
      }
   }
}
