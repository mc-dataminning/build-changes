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
   Optional<dk> e,
   bv.b f,
   Optional<dj> g,
   Optional<dl> h,
   Optional<bt> i,
   Optional<bs> j,
   Optional<bw> k,
   Optional<Integer> l,
   Optional<bv> m,
   Optional<bv> n,
   Optional<bv> o,
   Optional<String> p,
   Optional<eb> q
) {
   public static final Codec<bv> a = Codec.recursive(
      "EntityPredicate",
      $$0 -> RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     by.a.optionalFieldOf("type").forGetter(bv::a),
                     bm.a.optionalFieldOf("distance").forGetter(bv::b),
                     dk.a.optionalFieldOf("movement").forGetter(bv::c),
                     bv.b.a.forGetter(bv::d),
                     dj.a.optionalFieldOf("effects").forGetter(bv::e),
                     dl.a.optionalFieldOf("nbt").forGetter(bv::f),
                     bt.a.optionalFieldOf("flags").forGetter(bv::g),
                     bs.a.optionalFieldOf("equipment").forGetter(bv::h),
                     bw.a.optionalFieldOf("type_specific").forGetter(bv::i),
                     ays.m.optionalFieldOf("periodic_tick").forGetter(bv::j),
                     $$0.optionalFieldOf("vehicle").forGetter(bv::k),
                     $$0.optionalFieldOf("passenger").forGetter(bv::l),
                     $$0.optionalFieldOf("targeted_entity").forGetter(bv::m),
                     Codec.STRING.optionalFieldOf("team").forGetter(bv::n),
                     eb.a.optionalFieldOf("slots").forGetter(bv::o)
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
      exh $$1 = exk.a(etw.b.a, $$0).build();
      return new bg(List.of($$1));
   }

   public boolean a(arn $$0, @Nullable btz $$1) {
      return this.a($$0.B(), $$0.dv(), $$1);
   }

   public boolean a(arm $$0, @Nullable ezh $$1, @Nullable btz $$2) {
      if ($$2 == null) {
         return false;
      } else if (this.c.isPresent() && !this.c.get().a($$2.aq())) {
         return false;
      } else {
         if ($$1 == null) {
            if (this.d.isPresent()) {
               return false;
            }
         } else if (this.d.isPresent() && !this.d.get().a($$1.d, $$1.e, $$1.f, $$2.dC(), $$2.dE(), $$2.dI())) {
            return false;
         }

         if (this.e.isPresent()) {
            ezh $$3 = $$2.ai();
            ezh $$4 = $$3.c(20.0);
            if (!this.e.get().a($$4.d, $$4.e, $$4.f, (double)$$2.aa)) {
               return false;
            }
         }

         if (this.f.b.isPresent() && !this.f.b.get().a($$0, $$2.dC(), $$2.dE(), $$2.dI())) {
            return false;
         } else {
            if (this.f.c.isPresent()) {
               ezh $$5 = ezh.b($$2.aR());
               if (!this.f.c.get().a($$0, $$5.a(), $$5.b(), $$5.c())) {
                  return false;
               }
            }

            if (this.f.d.isPresent()) {
               ezh $$6 = ezh.b($$2.aQ());
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
            } else if (this.n.isPresent() && $$2.da().stream().noneMatch($$2x -> this.n.get().a($$0, $$1, $$2x))) {
               return false;
            } else if (this.o.isPresent() && !this.o.get().a($$0, $$1, $$2 instanceof bux ? ((bux)$$2).m() : null)) {
               return false;
            } else if (this.l.isPresent() && $$2.ag % this.l.get() != 0) {
               return false;
            } else {
               if (this.p.isPresent()) {
                  fao $$7 = $$2.cs();
                  if ($$7 == null || !this.p.get().equals($$7.b())) {
                     return false;
                  }
               }

               return this.q.isPresent() && !this.q.get().a($$2) ? false : !this.h.isPresent() || this.h.get().a($$2);
            }
         }
      }
   }

   public static etw b(arn $$0, btz $$1) {
      etz $$2 = new etz.a($$0.B()).a(ews.a, $$1).a(ews.f, $$0.dv()).a(ewr.n);
      return new etw.a($$2).a(Optional.empty());
   }

   public Optional<by> a() {
      return this.c;
   }

   public Optional<bm> b() {
      return this.d;
   }

   public Optional<dk> c() {
      return this.e;
   }

   public bv.b d() {
      return this.f;
   }

   public Optional<dj> e() {
      return this.g;
   }

   public Optional<dl> f() {
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

   public Optional<eb> o() {
      return this.q;
   }

   public static class a {
      private Optional<by> a = Optional.empty();
      private Optional<bm> b = Optional.empty();
      private Optional<dk> c = Optional.empty();
      private Optional<dg> d = Optional.empty();
      private Optional<dg> e = Optional.empty();
      private Optional<dg> f = Optional.empty();
      private Optional<dj> g = Optional.empty();
      private Optional<dl> h = Optional.empty();
      private Optional<bt> i = Optional.empty();
      private Optional<bs> j = Optional.empty();
      private Optional<bw> k = Optional.empty();
      private Optional<Integer> l = Optional.empty();
      private Optional<bv> m = Optional.empty();
      private Optional<bv> n = Optional.empty();
      private Optional<bv> o = Optional.empty();
      private Optional<String> p = Optional.empty();
      private Optional<eb> q = Optional.empty();

      public static bv.a a() {
         return new bv.a();
      }

      public bv.a a(jq<bug<?>> $$0, bug<?> $$1) {
         this.a = Optional.of(by.a($$0, $$1));
         return this;
      }

      public bv.a a(jq<bug<?>> $$0, axp<bug<?>> $$1) {
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

      public bv.a a(dk $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public bv.a a(dg.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public bv.a b(dg.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bv.a c(dg.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public bv.a a(dj.a $$0) {
         this.g = $$0.b();
         return this;
      }

      public bv.a a(dl $$0) {
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

      public bv.a a(eb $$0) {
         this.q = Optional.of($$0);
         return this;
      }

      public bv b() {
         return new bv(
            this.a, this.b, this.c, new bv.b(this.d, this.e, this.f), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q
         );
      }
   }

   public static record b(Optional<dg> b, Optional<dg> c, Optional<dg> d) {
      public static final MapCodec<bv.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dg.a.optionalFieldOf("location").forGetter(bv.b::a),
                  dg.a.optionalFieldOf("stepping_on").forGetter(bv.b::b),
                  dg.a.optionalFieldOf("movement_affected_by").forGetter(bv.b::c)
               )
               .apply($$0, bv.b::new)
      );

      public Optional<dg> a() {
         return this.b;
      }

      public Optional<dg> b() {
         return this.c;
      }

      public Optional<dg> c() {
         return this.d;
      }
   }
}
