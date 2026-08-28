import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record bw(
   Optional<bz> c,
   Optional<bn> d,
   Optional<dl> e,
   bw.b f,
   Optional<dk> g,
   Optional<dm> h,
   Optional<bu> i,
   Optional<bt> j,
   Optional<bx> k,
   Optional<Integer> l,
   Optional<bw> m,
   Optional<bw> n,
   Optional<bw> o,
   Optional<String> p,
   Optional<ec> q
) {
   public static final Codec<bw> a = Codec.recursive(
      "EntityPredicate",
      $$0 -> RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     bz.a.optionalFieldOf("type").forGetter(bw::a),
                     bn.a.optionalFieldOf("distance").forGetter(bw::b),
                     dl.a.optionalFieldOf("movement").forGetter(bw::c),
                     bw.b.a.forGetter(bw::d),
                     dk.a.optionalFieldOf("effects").forGetter(bw::e),
                     dm.a.optionalFieldOf("nbt").forGetter(bw::f),
                     bu.a.optionalFieldOf("flags").forGetter(bw::g),
                     bt.a.optionalFieldOf("equipment").forGetter(bw::h),
                     bx.a.optionalFieldOf("type_specific").forGetter(bw::i),
                     azd.m.optionalFieldOf("periodic_tick").forGetter(bw::j),
                     $$0.optionalFieldOf("vehicle").forGetter(bw::k),
                     $$0.optionalFieldOf("passenger").forGetter(bw::l),
                     $$0.optionalFieldOf("targeted_entity").forGetter(bw::m),
                     Codec.STRING.optionalFieldOf("team").forGetter(bw::n),
                     ec.a.optionalFieldOf("slots").forGetter(bw::o)
                  )
                  .apply($$1, bw::new)
         )
   );
   public static final Codec<bh> b = Codec.withAlternative(bh.a, a, bw::a);

   public static bh a(bw.a $$0) {
      return a($$0.b());
   }

   public static Optional<bh> a(Optional<bw> $$0) {
      return $$0.map(bw::a);
   }

   public static List<bh> a(bw.a... $$0) {
      return Stream.of($$0).map(bw::a).toList();
   }

   public static bh a(bw $$0) {
      ezr $$1 = ezu.a(ewi.b.a, $$0).build();
      return new bh(List.of($$1));
   }

   public boolean a(ary $$0, @Nullable bvb $$1) {
      return this.a($$0.y(), $$0.du(), $$1);
   }

   public boolean a(arx $$0, @Nullable fbr $$1, @Nullable bvb $$2) {
      if ($$2 == null) {
         return false;
      } else if (this.c.isPresent() && !this.c.get().a($$2.aq())) {
         return false;
      } else {
         if ($$1 == null) {
            if (this.d.isPresent()) {
               return false;
            }
         } else if (this.d.isPresent() && !this.d.get().a($$1.d, $$1.e, $$1.f, $$2.dB(), $$2.dD(), $$2.dH())) {
            return false;
         }

         if (this.e.isPresent()) {
            fbr $$3 = $$2.ah();
            fbr $$4 = $$3.c(20.0);
            if (!this.e.get().a($$4.d, $$4.e, $$4.f, (double)$$2.Z)) {
               return false;
            }
         }

         if (this.f.b.isPresent() && !this.f.b.get().a($$0, $$2.dB(), $$2.dD(), $$2.dH())) {
            return false;
         } else {
            if (this.f.c.isPresent()) {
               fbr $$5 = fbr.b($$2.aR());
               if (!this.f.c.get().a($$0, $$5.a(), $$5.b(), $$5.c())) {
                  return false;
               }
            }

            if (this.f.d.isPresent()) {
               fbr $$6 = fbr.b($$2.aQ());
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
            } else if (this.m.isPresent() && !this.m.get().a($$0, $$1, $$2.dl())) {
               return false;
            } else if (this.n.isPresent() && $$2.cZ().stream().noneMatch($$2x -> this.n.get().a($$0, $$1, $$2x))) {
               return false;
            } else if (this.o.isPresent() && !this.o.get().a($$0, $$1, $$2 instanceof bvz ? ((bvz)$$2).O_() : null)) {
               return false;
            } else if (this.l.isPresent() && $$2.af % this.l.get() != 0) {
               return false;
            } else {
               if (this.p.isPresent()) {
                  fcy $$7 = $$2.cr();
                  if ($$7 == null || !this.p.get().equals($$7.b())) {
                     return false;
                  }
               }

               return this.q.isPresent() && !this.q.get().a($$2) ? false : !this.h.isPresent() || this.h.get().a($$2);
            }
         }
      }
   }

   public static ewi b(ary $$0, bvb $$1) {
      ewl $$2 = new ewl.a($$0.y()).a(ezc.a, $$1).a(ezc.f, $$0.du()).a(ezb.n);
      return new ewi.a($$2).a(Optional.empty());
   }

   public Optional<bz> a() {
      return this.c;
   }

   public Optional<bn> b() {
      return this.d;
   }

   public Optional<dl> c() {
      return this.e;
   }

   public bw.b d() {
      return this.f;
   }

   public Optional<dk> e() {
      return this.g;
   }

   public Optional<dm> f() {
      return this.h;
   }

   public Optional<bu> g() {
      return this.i;
   }

   public Optional<bt> h() {
      return this.j;
   }

   public Optional<bx> i() {
      return this.k;
   }

   public Optional<Integer> j() {
      return this.l;
   }

   public Optional<bw> k() {
      return this.m;
   }

   public Optional<bw> l() {
      return this.n;
   }

   public Optional<bw> m() {
      return this.o;
   }

   public Optional<String> n() {
      return this.p;
   }

   public Optional<ec> o() {
      return this.q;
   }

   public static class a {
      private Optional<bz> a = Optional.empty();
      private Optional<bn> b = Optional.empty();
      private Optional<dl> c = Optional.empty();
      private Optional<dh> d = Optional.empty();
      private Optional<dh> e = Optional.empty();
      private Optional<dh> f = Optional.empty();
      private Optional<dk> g = Optional.empty();
      private Optional<dm> h = Optional.empty();
      private Optional<bu> i = Optional.empty();
      private Optional<bt> j = Optional.empty();
      private Optional<bx> k = Optional.empty();
      private Optional<Integer> l = Optional.empty();
      private Optional<bw> m = Optional.empty();
      private Optional<bw> n = Optional.empty();
      private Optional<bw> o = Optional.empty();
      private Optional<String> p = Optional.empty();
      private Optional<ec> q = Optional.empty();

      public static bw.a a() {
         return new bw.a();
      }

      public bw.a a(jr<bvi<?>> $$0, bvi<?> $$1) {
         this.a = Optional.of(bz.a($$0, $$1));
         return this;
      }

      public bw.a a(jr<bvi<?>> $$0, aya<bvi<?>> $$1) {
         this.a = Optional.of(bz.a($$0, $$1));
         return this;
      }

      public bw.a a(bz $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public bw.a a(bn $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public bw.a a(dl $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public bw.a a(dh.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public bw.a b(dh.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bw.a c(dh.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public bw.a a(dk.a $$0) {
         this.g = $$0.b();
         return this;
      }

      public bw.a a(dm $$0) {
         this.h = Optional.of($$0);
         return this;
      }

      public bw.a a(bu.a $$0) {
         this.i = Optional.of($$0.b());
         return this;
      }

      public bw.a a(bt.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public bw.a a(bt $$0) {
         this.j = Optional.of($$0);
         return this;
      }

      public bw.a a(bx $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public bw.a a(int $$0) {
         this.l = Optional.of($$0);
         return this;
      }

      public bw.a a(bw.a $$0) {
         this.m = Optional.of($$0.b());
         return this;
      }

      public bw.a b(bw.a $$0) {
         this.n = Optional.of($$0.b());
         return this;
      }

      public bw.a c(bw.a $$0) {
         this.o = Optional.of($$0.b());
         return this;
      }

      public bw.a a(String $$0) {
         this.p = Optional.of($$0);
         return this;
      }

      public bw.a a(ec $$0) {
         this.q = Optional.of($$0);
         return this;
      }

      public bw b() {
         return new bw(
            this.a, this.b, this.c, new bw.b(this.d, this.e, this.f), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q
         );
      }
   }

   public static record b(Optional<dh> b, Optional<dh> c, Optional<dh> d) {
      public static final MapCodec<bw.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dh.a.optionalFieldOf("location").forGetter(bw.b::a),
                  dh.a.optionalFieldOf("stepping_on").forGetter(bw.b::b),
                  dh.a.optionalFieldOf("movement_affected_by").forGetter(bw.b::c)
               )
               .apply($$0, bw.b::new)
      );

      public Optional<dh> a() {
         return this.b;
      }

      public Optional<dh> b() {
         return this.c;
      }

      public Optional<dh> c() {
         return this.d;
      }
   }
}
