import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record bs(
   Optional<bv> c,
   Optional<bj> d,
   Optional<cs> e,
   Optional<cs> f,
   Optional<cv> g,
   Optional<cw> h,
   Optional<bq> i,
   Optional<bp> j,
   Optional<bt> k,
   Optional<bs> l,
   Optional<bs> m,
   Optional<bs> n,
   Optional<String> o,
   Optional<dl> p
) {
   public static final Codec<bs> a = axu.a(
      "EntityPredicate",
      $$0 -> RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     axu.a(bv.a, "type").forGetter(bs::a),
                     axu.a(bj.a, "distance").forGetter(bs::b),
                     axu.a(cs.a, "location").forGetter(bs::c),
                     axu.a(cs.a, "stepping_on").forGetter(bs::d),
                     axu.a(cv.a, "effects").forGetter(bs::e),
                     axu.a(cw.c, "nbt").forGetter(bs::f),
                     axu.a(bq.a, "flags").forGetter(bs::g),
                     axu.a(bp.a, "equipment").forGetter(bs::h),
                     axu.a(bt.a, "type_specific").forGetter(bs::i),
                     axu.a($$0, "vehicle").forGetter(bs::j),
                     axu.a($$0, "passenger").forGetter(bs::k),
                     axu.a($$0, "targeted_entity").forGetter(bs::l),
                     axu.a(Codec.STRING, "team").forGetter(bs::m),
                     axu.a(dl.a, "slots").forGetter(bs::n)
                  )
                  .apply($$1, bs::new)
         )
   );
   public static final Codec<bd> b = axu.a(bd.a, a, bs::a);

   public static bd a(bs.a $$0) {
      return a($$0.b());
   }

   public static Optional<bd> a(Optional<bs> $$0) {
      return $$0.map(bs::a);
   }

   public static List<bd> a(bs.a... $$0) {
      return Stream.of($$0).map(bs::a).toList();
   }

   public static bd a(bs $$0) {
      euu $$1 = eux.a(erp.b.a, $$0).build();
      return new bd(List.of($$1));
   }

   public boolean a(aqu $$0, @Nullable brv $$1) {
      return this.a($$0.B(), $$0.ds(), $$1);
   }

   public boolean a(aqt $$0, @Nullable ewu $$1, @Nullable brv $$2) {
      if ($$2 == null) {
         return false;
      } else if (this.c.isPresent() && !this.c.get().b($$2.ak())) {
         return false;
      } else {
         if ($$1 == null) {
            if (this.d.isPresent()) {
               return false;
            }
         } else if (this.d.isPresent() && !this.d.get().a($$1.c, $$1.d, $$1.e, $$2.dz(), $$2.dB(), $$2.dF())) {
            return false;
         }

         if (this.e.isPresent() && !this.e.get().a($$0, $$2.dz(), $$2.dB(), $$2.dF())) {
            return false;
         } else {
            if (this.f.isPresent()) {
               ewu $$3 = ewu.b($$2.aO());
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
            } else if (this.l.isPresent() && !this.l.get().a($$0, $$1, $$2.dh())) {
               return false;
            } else if (this.m.isPresent() && $$2.cX().stream().noneMatch($$2x -> this.m.get().a($$0, $$1, $$2x))) {
               return false;
            } else if (this.n.isPresent() && !this.n.get().a($$0, $$1, $$2 instanceof bsq ? ((bsq)$$2).p() : null)) {
               return false;
            } else {
               if (this.o.isPresent()) {
                  eya $$4 = $$2.co();
                  if ($$4 == null || !this.o.get().equals($$4.b())) {
                     return false;
                  }
               }

               return this.h.isPresent() && !this.h.get().a($$2) ? false : !this.p.isPresent() || this.p.get().a($$2);
            }
         }
      }
   }

   public static erp b(aqu $$0, brv $$1) {
      ers $$2 = new ers.a($$0.B()).a(eug.a, $$1).a(eug.f, $$0.ds()).a(euf.m);
      return new erp.a($$2).a(Optional.empty());
   }

   public Optional<bv> a() {
      return this.c;
   }

   public Optional<bj> b() {
      return this.d;
   }

   public Optional<cs> c() {
      return this.e;
   }

   public Optional<cs> d() {
      return this.f;
   }

   public Optional<cv> e() {
      return this.g;
   }

   public Optional<cw> f() {
      return this.h;
   }

   public Optional<bq> g() {
      return this.i;
   }

   public Optional<bp> h() {
      return this.j;
   }

   public Optional<bt> i() {
      return this.k;
   }

   public Optional<bs> j() {
      return this.l;
   }

   public Optional<bs> k() {
      return this.m;
   }

   public Optional<bs> l() {
      return this.n;
   }

   public Optional<String> m() {
      return this.o;
   }

   public Optional<dl> n() {
      return this.p;
   }

   public static class a {
      private Optional<bv> a = Optional.empty();
      private Optional<bj> b = Optional.empty();
      private Optional<cs> c = Optional.empty();
      private Optional<cs> d = Optional.empty();
      private Optional<cv> e = Optional.empty();
      private Optional<cw> f = Optional.empty();
      private Optional<bq> g = Optional.empty();
      private Optional<bp> h = Optional.empty();
      private Optional<bt> i = Optional.empty();
      private Optional<bs> j = Optional.empty();
      private Optional<bs> k = Optional.empty();
      private Optional<bs> l = Optional.empty();
      private Optional<String> m = Optional.empty();
      private Optional<dl> n = Optional.empty();

      public static bs.a a() {
         return new bs.a();
      }

      public bs.a a(bsb<?> $$0) {
         this.a = Optional.of(bv.a($$0));
         return this;
      }

      public bs.a a(awt<bsb<?>> $$0) {
         this.a = Optional.of(bv.a($$0));
         return this;
      }

      public bs.a a(bv $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public bs.a a(bj $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public bs.a a(cs.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bs.a b(cs.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public bs.a a(cv.a $$0) {
         this.e = $$0.b();
         return this;
      }

      public bs.a a(cw $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public bs.a a(bq.a $$0) {
         this.g = Optional.of($$0.b());
         return this;
      }

      public bs.a a(bp.a $$0) {
         this.h = Optional.of($$0.b());
         return this;
      }

      public bs.a a(bp $$0) {
         this.h = Optional.of($$0);
         return this;
      }

      public bs.a a(bt $$0) {
         this.i = Optional.of($$0);
         return this;
      }

      public bs.a a(bs.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public bs.a b(bs.a $$0) {
         this.k = Optional.of($$0.b());
         return this;
      }

      public bs.a c(bs.a $$0) {
         this.l = Optional.of($$0.b());
         return this;
      }

      public bs.a a(String $$0) {
         this.m = Optional.of($$0);
         return this;
      }

      public bs.a a(dl $$0) {
         this.n = Optional.of($$0);
         return this;
      }

      public bs b() {
         return new bs(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
      }
   }
}
