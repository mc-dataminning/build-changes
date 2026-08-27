import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record br(
   Optional<bu> c,
   Optional<bi> d,
   Optional<cr> e,
   Optional<cr> f,
   Optional<cu> g,
   Optional<cv> h,
   Optional<bp> i,
   Optional<bo> j,
   Optional<bs> k,
   Optional<br> l,
   Optional<br> m,
   Optional<br> n,
   Optional<String> o,
   Optional<di> p
) {
   public static final Codec<br> a = axh.a(
      "EntityPredicate",
      $$0 -> RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     axh.a(bu.a, "type").forGetter(br::a),
                     axh.a(bi.a, "distance").forGetter(br::b),
                     axh.a(cr.a, "location").forGetter(br::c),
                     axh.a(cr.a, "stepping_on").forGetter(br::d),
                     axh.a(cu.a, "effects").forGetter(br::e),
                     axh.a(cv.c, "nbt").forGetter(br::f),
                     axh.a(bp.a, "flags").forGetter(br::g),
                     axh.a(bo.a, "equipment").forGetter(br::h),
                     axh.a(bs.a, "type_specific").forGetter(br::i),
                     axh.a($$0, "vehicle").forGetter(br::j),
                     axh.a($$0, "passenger").forGetter(br::k),
                     axh.a($$0, "targeted_entity").forGetter(br::l),
                     axh.a(Codec.STRING, "team").forGetter(br::m),
                     axh.a(di.a, "slots").forGetter(br::n)
                  )
                  .apply($$1, br::new)
         )
   );
   public static final Codec<bc> b = axh.a(bc.a, a, br::a);

   public static bc a(br.a $$0) {
      return a($$0.b());
   }

   public static Optional<bc> a(Optional<br> $$0) {
      return $$0.map(br::a);
   }

   public static List<bc> a(br.a... $$0) {
      return Stream.of($$0).map(br::a).toList();
   }

   public static bc a(br $$0) {
      erq $$1 = ert.a(eol.b.a, $$0).build();
      return new bc(List.of($$1));
   }

   public boolean a(aqi $$0, @Nullable brh $$1) {
      return this.a($$0.z(), $$0.dl(), $$1);
   }

   public boolean a(aqh $$0, @Nullable etp $$1, @Nullable brh $$2) {
      if ($$2 == null) {
         return false;
      } else if (this.c.isPresent() && !this.c.get().b($$2.ai())) {
         return false;
      } else {
         if ($$1 == null) {
            if (this.d.isPresent()) {
               return false;
            }
         } else if (this.d.isPresent() && !this.d.get().a($$1.c, $$1.d, $$1.e, $$2.ds(), $$2.du(), $$2.dy())) {
            return false;
         }

         if (this.e.isPresent() && !this.e.get().a($$0, $$2.ds(), $$2.du(), $$2.dy())) {
            return false;
         } else {
            if (this.f.isPresent()) {
               etp $$3 = etp.b($$2.aJ());
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
            } else if (this.l.isPresent() && !this.l.get().a($$0, $$1, $$2.da())) {
               return false;
            } else if (this.m.isPresent() && $$2.cQ().stream().noneMatch($$2x -> this.m.get().a($$0, $$1, $$2x))) {
               return false;
            } else if (this.n.isPresent() && !this.n.get().a($$0, $$1, $$2 instanceof bsc ? ((bsc)$$2).p() : null)) {
               return false;
            } else {
               if (this.o.isPresent()) {
                  euv $$4 = $$2.ch();
                  if ($$4 == null || !this.o.get().equals($$4.b())) {
                     return false;
                  }
               }

               return this.h.isPresent() && !this.h.get().a($$2) ? false : !this.p.isPresent() || this.p.get().a($$2);
            }
         }
      }
   }

   public static eol b(aqi $$0, brh $$1) {
      eoo $$2 = new eoo.a($$0.z()).a(erc.a, $$1).a(erc.f, $$0.dl()).a(erb.m);
      return new eol.a($$2).a(Optional.empty());
   }

   public Optional<bu> a() {
      return this.c;
   }

   public Optional<bi> b() {
      return this.d;
   }

   public Optional<cr> c() {
      return this.e;
   }

   public Optional<cr> d() {
      return this.f;
   }

   public Optional<cu> e() {
      return this.g;
   }

   public Optional<cv> f() {
      return this.h;
   }

   public Optional<bp> g() {
      return this.i;
   }

   public Optional<bo> h() {
      return this.j;
   }

   public Optional<bs> i() {
      return this.k;
   }

   public Optional<br> j() {
      return this.l;
   }

   public Optional<br> k() {
      return this.m;
   }

   public Optional<br> l() {
      return this.n;
   }

   public Optional<String> m() {
      return this.o;
   }

   public Optional<di> n() {
      return this.p;
   }

   public static class a {
      private Optional<bu> a = Optional.empty();
      private Optional<bi> b = Optional.empty();
      private Optional<cr> c = Optional.empty();
      private Optional<cr> d = Optional.empty();
      private Optional<cu> e = Optional.empty();
      private Optional<cv> f = Optional.empty();
      private Optional<bp> g = Optional.empty();
      private Optional<bo> h = Optional.empty();
      private Optional<bs> i = Optional.empty();
      private Optional<br> j = Optional.empty();
      private Optional<br> k = Optional.empty();
      private Optional<br> l = Optional.empty();
      private Optional<String> m = Optional.empty();
      private Optional<di> n = Optional.empty();

      public static br.a a() {
         return new br.a();
      }

      public br.a a(brn<?> $$0) {
         this.a = Optional.of(bu.a($$0));
         return this;
      }

      public br.a a(awg<brn<?>> $$0) {
         this.a = Optional.of(bu.a($$0));
         return this;
      }

      public br.a a(bu $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public br.a a(bi $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public br.a a(cr.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public br.a b(cr.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public br.a a(cu.a $$0) {
         this.e = $$0.b();
         return this;
      }

      public br.a a(cv $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public br.a a(bp.a $$0) {
         this.g = Optional.of($$0.b());
         return this;
      }

      public br.a a(bo.a $$0) {
         this.h = Optional.of($$0.b());
         return this;
      }

      public br.a a(bo $$0) {
         this.h = Optional.of($$0);
         return this;
      }

      public br.a a(bs $$0) {
         this.i = Optional.of($$0);
         return this;
      }

      public br.a a(br.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public br.a b(br.a $$0) {
         this.k = Optional.of($$0.b());
         return this;
      }

      public br.a c(br.a $$0) {
         this.l = Optional.of($$0.b());
         return this;
      }

      public br.a a(String $$0) {
         this.m = Optional.of($$0);
         return this;
      }

      public br.a a(di $$0) {
         this.n = Optional.of($$0);
         return this;
      }

      public br b() {
         return new br(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
      }
   }
}
