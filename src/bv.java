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
   Optional<ea> q
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
                     ayo.l.optionalFieldOf("periodic_tick").forGetter(bv::j),
                     $$0.optionalFieldOf("vehicle").forGetter(bv::k),
                     $$0.optionalFieldOf("passenger").forGetter(bv::l),
                     $$0.optionalFieldOf("targeted_entity").forGetter(bv::m),
                     Codec.STRING.optionalFieldOf("team").forGetter(bv::n),
                     ea.a.optionalFieldOf("slots").forGetter(bv::o)
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
      eww $$1 = ewz.a(etl.b.a, $$0).build();
      return new bg(List.of($$1));
   }

   public boolean a(ark $$0, @Nullable btr $$1) {
      return this.a($$0.B(), $$0.dq(), $$1);
   }

   public boolean a(arj $$0, @Nullable eyw $$1, @Nullable btr $$2) {
      if ($$2 == null) {
         return false;
      } else if (this.c.isPresent() && !this.c.get().a($$2.ao())) {
         return false;
      } else {
         if ($$1 == null) {
            if (this.d.isPresent()) {
               return false;
            }
         } else if (this.d.isPresent() && !this.d.get().a($$1.d, $$1.e, $$1.f, $$2.dx(), $$2.dz(), $$2.dD())) {
            return false;
         }

         if (this.e.isPresent()) {
            eyw $$3 = $$2.ai();
            eyw $$4 = $$3.c(20.0);
            if (!this.e.get().a($$4.d, $$4.e, $$4.f, (double)$$2.aa)) {
               return false;
            }
         }

         if (this.f.b.isPresent() && !this.f.b.get().a($$0, $$2.dx(), $$2.dz(), $$2.dD())) {
            return false;
         } else {
            if (this.f.c.isPresent()) {
               eyw $$5 = eyw.b($$2.aP());
               if (!this.f.c.get().a($$0, $$5.a(), $$5.b(), $$5.c())) {
                  return false;
               }
            }

            if (this.f.d.isPresent()) {
               eyw $$6 = eyw.b($$2.aO());
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
            } else if (this.m.isPresent() && !this.m.get().a($$0, $$1, $$2.dg())) {
               return false;
            } else if (this.n.isPresent() && $$2.cW().stream().noneMatch($$2x -> this.n.get().a($$0, $$1, $$2x))) {
               return false;
            } else if (this.o.isPresent() && !this.o.get().a($$0, $$1, $$2 instanceof bup ? ((bup)$$2).m() : null)) {
               return false;
            } else if (this.l.isPresent() && $$2.ag % this.l.get() != 0) {
               return false;
            } else {
               if (this.p.isPresent()) {
                  fad $$7 = $$2.co();
                  if ($$7 == null || !this.p.get().equals($$7.b())) {
                     return false;
                  }
               }

               return this.q.isPresent() && !this.q.get().a($$2) ? false : !this.h.isPresent() || this.h.get().a($$2);
            }
         }
      }
   }

   public static etl b(ark $$0, btr $$1) {
      eto $$2 = new eto.a($$0.B()).a(ewh.a, $$1).a(ewh.f, $$0.dq()).a(ewg.n);
      return new etl.a($$2).a(Optional.empty());
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

   public Optional<ea> o() {
      return this.q;
   }

   public static class a {
      private Optional<by> a = Optional.empty();
      private Optional<bm> b = Optional.empty();
      private Optional<dj> c = Optional.empty();
      private Optional<df> d = Optional.empty();
      private Optional<df> e = Optional.empty();
      private Optional<df> f = Optional.empty();
      private Optional<di> g = Optional.empty();
      private Optional<dk> h = Optional.empty();
      private Optional<bt> i = Optional.empty();
      private Optional<bs> j = Optional.empty();
      private Optional<bw> k = Optional.empty();
      private Optional<Integer> l = Optional.empty();
      private Optional<bv> m = Optional.empty();
      private Optional<bv> n = Optional.empty();
      private Optional<bv> o = Optional.empty();
      private Optional<String> p = Optional.empty();
      private Optional<ea> q = Optional.empty();

      public static bv.a a() {
         return new bv.a();
      }

      public bv.a a(jp<bty<?>> $$0, bty<?> $$1) {
         this.a = Optional.of(by.a($$0, $$1));
         return this;
      }

      public bv.a a(jp<bty<?>> $$0, axl<bty<?>> $$1) {
         this.a = Optional.of(by.a($$0, $$1));
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
         this.c = Optional.of($$0);
         return this;
      }

      public bv.a a(df.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public bv.a b(df.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bv.a c(df.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public bv.a a(di.a $$0) {
         this.g = $$0.b();
         return this;
      }

      public bv.a a(dk $$0) {
         this.h = Optional.of($$0);
         return this;
      }

      public bv.a a(bt.a $$0) {
         this.i = Optional.of($$0.b());
         return this;
      }

      public bv.a a(bs.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public bv.a a(bs $$0) {
         this.j = Optional.of($$0);
         return this;
      }

      public bv.a a(bw $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public bv.a a(int $$0) {
         this.l = Optional.of($$0);
         return this;
      }

      public bv.a a(bv.a $$0) {
         this.m = Optional.of($$0.b());
         return this;
      }

      public bv.a b(bv.a $$0) {
         this.n = Optional.of($$0.b());
         return this;
      }

      public bv.a c(bv.a $$0) {
         this.o = Optional.of($$0.b());
         return this;
      }

      public bv.a a(String $$0) {
         this.p = Optional.of($$0);
         return this;
      }

      public bv.a a(ea $$0) {
         this.q = Optional.of($$0);
         return this;
      }

      public bv b() {
         return new bv(
            this.a, this.b, this.c, new bv.b(this.d, this.e, this.f), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q
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
