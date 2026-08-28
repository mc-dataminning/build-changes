import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record bu(
   Optional<bx> c,
   Optional<bl> d,
   Optional<dg> e,
   bu.b f,
   Optional<df> g,
   Optional<dh> h,
   Optional<bs> i,
   Optional<br> j,
   Optional<bv> k,
   Optional<Integer> l,
   Optional<bu> m,
   Optional<bu> n,
   Optional<bu> o,
   Optional<String> p,
   Optional<dw> q
) {
   public static final Codec<bu> a = Codec.recursive(
      "EntityPredicate",
      $$0 -> RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     bx.a.optionalFieldOf("type").forGetter(bu::a),
                     bl.a.optionalFieldOf("distance").forGetter(bu::b),
                     dg.a.optionalFieldOf("movement").forGetter(bu::c),
                     bu.b.a.forGetter(bu::d),
                     df.a.optionalFieldOf("effects").forGetter(bu::e),
                     dh.a.optionalFieldOf("nbt").forGetter(bu::f),
                     bs.a.optionalFieldOf("flags").forGetter(bu::g),
                     br.a.optionalFieldOf("equipment").forGetter(bu::h),
                     bv.a.optionalFieldOf("type_specific").forGetter(bu::i),
                     axo.l.optionalFieldOf("periodic_tick").forGetter(bu::j),
                     $$0.optionalFieldOf("vehicle").forGetter(bu::k),
                     $$0.optionalFieldOf("passenger").forGetter(bu::l),
                     $$0.optionalFieldOf("targeted_entity").forGetter(bu::m),
                     Codec.STRING.optionalFieldOf("team").forGetter(bu::n),
                     dw.a.optionalFieldOf("slots").forGetter(bu::o)
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
      euh $$1 = euk.a(eqw.b.a, $$0).build();
      return new bf(List.of($$1));
   }

   public boolean a(aqn $$0, @Nullable bsh $$1) {
      return this.a($$0.A(), $$0.dp(), $$1);
   }

   public boolean a(aqm $$0, @Nullable ewh $$1, @Nullable bsh $$2) {
      if ($$2 == null) {
         return false;
      } else if (this.c.isPresent() && !this.c.get().b($$2.am())) {
         return false;
      } else {
         if ($$1 == null) {
            if (this.d.isPresent()) {
               return false;
            }
         } else if (this.d.isPresent() && !this.d.get().a($$1.c, $$1.d, $$1.e, $$2.dw(), $$2.dy(), $$2.dC())) {
            return false;
         }

         if (this.e.isPresent()) {
            ewh $$3 = $$2.ag();
            ewh $$4 = $$3.a(20.0);
            if (!this.e.get().a($$4.c, $$4.d, $$4.e, (double)$$2.ac)) {
               return false;
            }
         }

         if (this.f.b.isPresent() && !this.f.b.get().a($$0, $$2.dw(), $$2.dy(), $$2.dC())) {
            return false;
         } else {
            if (this.f.c.isPresent()) {
               ewh $$5 = ewh.b($$2.aN());
               if (!this.f.c.get().a($$0, $$5.a(), $$5.b(), $$5.c())) {
                  return false;
               }
            }

            if (this.f.d.isPresent()) {
               ewh $$6 = ewh.b($$2.aM());
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
            } else if (this.m.isPresent() && !this.m.get().a($$0, $$1, $$2.de())) {
               return false;
            } else if (this.n.isPresent() && $$2.cU().stream().noneMatch($$2x -> this.n.get().a($$0, $$1, $$2x))) {
               return false;
            } else if (this.o.isPresent() && !this.o.get().a($$0, $$1, $$2 instanceof bte ? ((bte)$$2).p() : null)) {
               return false;
            } else if (this.l.isPresent() && $$2.ai % this.l.get() != 0) {
               return false;
            } else {
               if (this.p.isPresent()) {
                  exn $$7 = $$2.cl();
                  if ($$7 == null || !this.p.get().equals($$7.b())) {
                     return false;
                  }
               }

               return this.q.isPresent() && !this.q.get().a($$2) ? false : !this.h.isPresent() || this.h.get().a($$2);
            }
         }
      }
   }

   public static eqw b(aqn $$0, bsh $$1) {
      eqz $$2 = new eqz.a($$0.A()).a(ets.a, $$1).a(ets.f, $$0.dp()).a(etr.n);
      return new eqw.a($$2).a(Optional.empty());
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

   public bu.b d() {
      return this.f;
   }

   public Optional<df> e() {
      return this.g;
   }

   public Optional<dh> f() {
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

   public Optional<Integer> j() {
      return this.l;
   }

   public Optional<bu> k() {
      return this.m;
   }

   public Optional<bu> l() {
      return this.n;
   }

   public Optional<bu> m() {
      return this.o;
   }

   public Optional<String> n() {
      return this.p;
   }

   public Optional<dw> o() {
      return this.q;
   }

   public static class a {
      private Optional<bx> a = Optional.empty();
      private Optional<bl> b = Optional.empty();
      private Optional<bl> c = Optional.empty();
      private Optional<dg> d = Optional.empty();
      private Optional<bu.b> e = Optional.empty();
      private Optional<dc> f = Optional.empty();
      private Optional<dc> g = Optional.empty();
      private Optional<dc> h = Optional.empty();
      private Optional<df> i = Optional.empty();
      private Optional<dh> j = Optional.empty();
      private Optional<bs> k = Optional.empty();
      private Optional<br> l = Optional.empty();
      private Optional<bv> m = Optional.empty();
      private Optional<Integer> n = Optional.empty();
      private Optional<bu> o = Optional.empty();
      private Optional<bu> p = Optional.empty();
      private Optional<bu> q = Optional.empty();
      private Optional<String> r = Optional.empty();
      private Optional<dw> s = Optional.empty();

      public static bu.a a() {
         return new bu.a();
      }

      public bu.a a(bsn<?> $$0) {
         this.a = Optional.of(bx.a($$0));
         return this;
      }

      public bu.a a(awm<bsn<?>> $$0) {
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
         this.f = Optional.of($$0.b());
         return this;
      }

      public bu.a b(dc.a $$0) {
         this.g = Optional.of($$0.b());
         return this;
      }

      public bu.a c(dc.a $$0) {
         this.h = Optional.of($$0.b());
         return this;
      }

      public bu.a a(df.a $$0) {
         this.i = $$0.b();
         return this;
      }

      public bu.a a(dh $$0) {
         this.j = Optional.of($$0);
         return this;
      }

      public bu.a a(bs.a $$0) {
         this.k = Optional.of($$0.b());
         return this;
      }

      public bu.a a(br.a $$0) {
         this.l = Optional.of($$0.b());
         return this;
      }

      public bu.a a(br $$0) {
         this.l = Optional.of($$0);
         return this;
      }

      public bu.a a(bv $$0) {
         this.m = Optional.of($$0);
         return this;
      }

      public bu.a a(int $$0) {
         this.n = Optional.of($$0);
         return this;
      }

      public bu.a a(bu.a $$0) {
         this.o = Optional.of($$0.b());
         return this;
      }

      public bu.a b(bu.a $$0) {
         this.p = Optional.of($$0.b());
         return this;
      }

      public bu.a c(bu.a $$0) {
         this.q = Optional.of($$0.b());
         return this;
      }

      public bu.a a(String $$0) {
         this.r = Optional.of($$0);
         return this;
      }

      public bu.a a(dw $$0) {
         this.s = Optional.of($$0);
         return this;
      }

      public bu b() {
         return new bu(
            this.a, this.b, this.d, new bu.b(this.f, this.g, this.h), this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s
         );
      }
   }

   public static record b(Optional<dc> b, Optional<dc> c, Optional<dc> d) {
      public static final MapCodec<bu.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dc.a.optionalFieldOf("location").forGetter(bu.b::a),
                  dc.a.optionalFieldOf("stepping_on").forGetter(bu.b::b),
                  dc.a.optionalFieldOf("movement_affected_by").forGetter(bu.b::c)
               )
               .apply($$0, bu.b::new)
      );

      public Optional<dc> a() {
         return this.b;
      }

      public Optional<dc> b() {
         return this.c;
      }

      public Optional<dc> c() {
         return this.d;
      }
   }
}
