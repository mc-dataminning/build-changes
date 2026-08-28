import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record bv(
   Optional<by> c,
   Optional<bm> d,
   Optional<dj> e,
   bv.b f,
   Optional<di> g,
   Optional<dk> h,
   Optional<bt> i,
   Optional<bs> j,
   Optional<bw> k,
   Optional<Integer> l,
   Optional<bv> m,
   Optional<bv> n,
   Optional<bv> o,
   Optional<String> p,
   Optional<dz> q
) {
   public static final Codec<bv> a = Codec.recursive(
      "EntityPredicate",
      $$0 -> RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     by.a.optionalFieldOf("type").forGetter(bv::a),
                     bm.a.optionalFieldOf("distance").forGetter(bv::b),
                     dj.a.optionalFieldOf("movement").forGetter(bv::c),
                     bv.b.a.forGetter(bv::d),
                     di.a.optionalFieldOf("effects").forGetter(bv::e),
                     dk.a.optionalFieldOf("nbt").forGetter(bv::f),
                     bt.a.optionalFieldOf("flags").forGetter(bv::g),
                     bs.a.optionalFieldOf("equipment").forGetter(bv::h),
                     bw.a.optionalFieldOf("type_specific").forGetter(bv::i),
                     axw.l.optionalFieldOf("periodic_tick").forGetter(bv::j),
                     $$0.optionalFieldOf("vehicle").forGetter(bv::k),
                     $$0.optionalFieldOf("passenger").forGetter(bv::l),
                     $$0.optionalFieldOf("targeted_entity").forGetter(bv::m),
                     Codec.STRING.optionalFieldOf("team").forGetter(bv::n),
                     dz.a.optionalFieldOf("slots").forGetter(bv::o)
                  )
                  .apply($$1, bv::new)
         )
   );
   public static final Codec<bg> b = Codec.withAlternative(bg.a, a, bv::a);

   public static bg a(bv.a $$0) {
      return a($$0.b());
   }

   public static Optional<bg> a(Optional<bv> $$0) {
      return $$0.map(bv::a);
   }

   public static List<bg> a(bv.a... $$0) {
      return Stream.of($$0).map(bv::a).toList();
   }

   public static bg a(bv $$0) {
      eva $$1 = evd.a(erp.b.a, $$0).build();
      return new bg(List.of($$1));
   }

   public boolean a(aqv $$0, @Nullable bsr $$1) {
      return this.a($$0.A(), $$0.dn(), $$1);
   }

   public boolean a(aqu $$0, @Nullable exa $$1, @Nullable bsr $$2) {
      if ($$2 == null) {
         return false;
      } else if (this.c.isPresent() && !this.c.get().b($$2.am())) {
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
            exa $$3 = $$2.ag();
            exa $$4 = $$3.a(20.0);
            if (!this.e.get().a($$4.c, $$4.d, $$4.e, (double)$$2.ac)) {
               return false;
            }
         }

         if (this.f.b.isPresent() && !this.f.b.get().a($$0, $$2.du(), $$2.dw(), $$2.dA())) {
            return false;
         } else {
            if (this.f.c.isPresent()) {
               exa $$5 = exa.b($$2.aM());
               if (!this.f.c.get().a($$0, $$5.a(), $$5.b(), $$5.c())) {
                  return false;
               }
            }

            if (this.f.d.isPresent()) {
               exa $$6 = exa.b($$2.aL());
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
            } else if (this.m.isPresent() && !this.m.get().a($$0, $$1, $$2.dd())) {
               return false;
            } else if (this.n.isPresent() && $$2.cT().stream().noneMatch($$2x -> this.n.get().a($$0, $$1, $$2x))) {
               return false;
            } else if (this.o.isPresent() && !this.o.get().a($$0, $$1, $$2 instanceof btp ? ((btp)$$2).p() : null)) {
               return false;
            } else if (this.l.isPresent() && $$2.ai % this.l.get() != 0) {
               return false;
            } else {
               if (this.p.isPresent()) {
                  eyg $$7 = $$2.ck();
                  if ($$7 == null || !this.p.get().equals($$7.b())) {
                     return false;
                  }
               }

               return this.q.isPresent() && !this.q.get().a($$2) ? false : !this.h.isPresent() || this.h.get().a($$2);
            }
         }
      }
   }

   public static erp b(aqv $$0, bsr $$1) {
      ers $$2 = new ers.a($$0.A()).a(eul.a, $$1).a(eul.f, $$0.dn()).a(euk.n);
      return new erp.a($$2).a(Optional.empty());
   }

   public Optional<by> a() {
      return this.c;
   }

   public Optional<bm> b() {
      return this.d;
   }

   public Optional<dj> c() {
      return this.e;
   }

   public bv.b d() {
      return this.f;
   }

   public Optional<di> e() {
      return this.g;
   }

   public Optional<dk> f() {
      return this.h;
   }

   public Optional<bt> g() {
      return this.i;
   }

   public Optional<bs> h() {
      return this.j;
   }

   public Optional<bw> i() {
      return this.k;
   }

   public Optional<Integer> j() {
      return this.l;
   }

   public Optional<bv> k() {
      return this.m;
   }

   public Optional<bv> l() {
      return this.n;
   }

   public Optional<bv> m() {
      return this.o;
   }

   public Optional<String> n() {
      return this.p;
   }

   public Optional<dz> o() {
      return this.q;
   }

   public static class a {
      private Optional<by> a = Optional.empty();
      private Optional<bm> b = Optional.empty();
      private Optional<bm> c = Optional.empty();
      private Optional<dj> d = Optional.empty();
      private Optional<bv.b> e = Optional.empty();
      private Optional<df> f = Optional.empty();
      private Optional<df> g = Optional.empty();
      private Optional<df> h = Optional.empty();
      private Optional<di> i = Optional.empty();
      private Optional<dk> j = Optional.empty();
      private Optional<bt> k = Optional.empty();
      private Optional<bs> l = Optional.empty();
      private Optional<bw> m = Optional.empty();
      private Optional<Integer> n = Optional.empty();
      private Optional<bv> o = Optional.empty();
      private Optional<bv> p = Optional.empty();
      private Optional<bv> q = Optional.empty();
      private Optional<String> r = Optional.empty();
      private Optional<dz> s = Optional.empty();

      public static bv.a a() {
         return new bv.a();
      }

      public bv.a a(bsx<?> $$0) {
         this.a = Optional.of(by.a($$0));
         return this;
      }

      public bv.a a(awu<bsx<?>> $$0) {
         this.a = Optional.of(by.a($$0));
         return this;
      }

      public bv.a a(by $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public bv.a a(bm $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public bv.a a(dj $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public bv.a a(df.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public bv.a b(df.a $$0) {
         this.g = Optional.of($$0.b());
         return this;
      }

      public bv.a c(df.a $$0) {
         this.h = Optional.of($$0.b());
         return this;
      }

      public bv.a a(di.a $$0) {
         this.i = $$0.b();
         return this;
      }

      public bv.a a(dk $$0) {
         this.j = Optional.of($$0);
         return this;
      }

      public bv.a a(bt.a $$0) {
         this.k = Optional.of($$0.b());
         return this;
      }

      public bv.a a(bs.a $$0) {
         this.l = Optional.of($$0.b());
         return this;
      }

      public bv.a a(bs $$0) {
         this.l = Optional.of($$0);
         return this;
      }

      public bv.a a(bw $$0) {
         this.m = Optional.of($$0);
         return this;
      }

      public bv.a a(int $$0) {
         this.n = Optional.of($$0);
         return this;
      }

      public bv.a a(bv.a $$0) {
         this.o = Optional.of($$0.b());
         return this;
      }

      public bv.a b(bv.a $$0) {
         this.p = Optional.of($$0.b());
         return this;
      }

      public bv.a c(bv.a $$0) {
         this.q = Optional.of($$0.b());
         return this;
      }

      public bv.a a(String $$0) {
         this.r = Optional.of($$0);
         return this;
      }

      public bv.a a(dz $$0) {
         this.s = Optional.of($$0);
         return this;
      }

      public bv b() {
         return new bv(
            this.a, this.b, this.d, new bv.b(this.f, this.g, this.h), this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s
         );
      }
   }

   public static record b(Optional<df> b, Optional<df> c, Optional<df> d) {
      public static final MapCodec<bv.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  df.a.optionalFieldOf("location").forGetter(bv.b::a),
                  df.a.optionalFieldOf("stepping_on").forGetter(bv.b::b),
                  df.a.optionalFieldOf("movement_affected_by").forGetter(bv.b::c)
               )
               .apply($$0, bv.b::new)
      );

      public Optional<df> a() {
         return this.b;
      }

      public Optional<df> b() {
         return this.c;
      }

      public Optional<df> c() {
         return this.d;
      }
   }
}
