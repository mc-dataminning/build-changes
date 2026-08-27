import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record br(
   Optional<bu> c,
   Optional<bi> d,
   Optional<cq> e,
   Optional<cq> f,
   Optional<ct> g,
   Optional<cu> h,
   Optional<bp> i,
   Optional<bo> j,
   Optional<bs> k,
   Optional<br> l,
   Optional<br> m,
   Optional<br> n,
   Optional<String> o,
   Optional<dh> p
) {
   public static final Codec<br> a = axe.a(
      "EntityPredicate",
      $$0 -> RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     axe.a(bu.a, "type").forGetter(br::a),
                     axe.a(bi.a, "distance").forGetter(br::b),
                     axe.a(cq.a, "location").forGetter(br::c),
                     axe.a(cq.a, "stepping_on").forGetter(br::d),
                     axe.a(ct.a, "effects").forGetter(br::e),
                     axe.a(cu.a, "nbt").forGetter(br::f),
                     axe.a(bp.a, "flags").forGetter(br::g),
                     axe.a(bo.a, "equipment").forGetter(br::h),
                     axe.a(bs.a, "type_specific").forGetter(br::i),
                     axe.a($$0, "vehicle").forGetter(br::j),
                     axe.a($$0, "passenger").forGetter(br::k),
                     axe.a($$0, "targeted_entity").forGetter(br::l),
                     axe.a(Codec.STRING, "team").forGetter(br::m),
                     axe.a(dh.a, "slots").forGetter(br::n)
                  )
                  .apply($$1, br::new)
         )
   );
   public static final Codec<bc> b = axe.a(bc.a, a, br::a);

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
      erh $$1 = erk.a(eoa.b.a, $$0).build();
      return new bc(List.of($$1));
   }

   public boolean a(aqf $$0, @Nullable bql $$1) {
      return this.a($$0.z(), $$0.dl(), $$1);
   }

   public boolean a(aqe $$0, @Nullable etf $$1, @Nullable bql $$2) {
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
               etf $$3 = etf.b($$2.aJ());
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
            } else if (this.n.isPresent() && !this.n.get().a($$0, $$1, $$2 instanceof brg ? ((brg)$$2).p() : null)) {
               return false;
            } else {
               if (this.o.isPresent()) {
                  eul $$4 = $$2.ch();
                  if ($$4 == null || !this.o.get().equals($$4.b())) {
                     return false;
                  }
               }

               return this.h.isPresent() && !this.h.get().a($$2) ? false : !this.p.isPresent() || this.p.get().a($$2);
            }
         }
      }
   }

   public static eoa b(aqf $$0, bql $$1) {
      eog $$2 = new eog.a($$0.z()).a(eqt.a, $$1).a(eqt.f, $$0.dl()).a(eqs.m);
      return new eoa.a($$2).a(Optional.empty());
   }

   public Optional<bu> a() {
      return this.c;
   }

   public Optional<bi> b() {
      return this.d;
   }

   public Optional<cq> c() {
      return this.e;
   }

   public Optional<cq> d() {
      return this.f;
   }

   public Optional<ct> e() {
      return this.g;
   }

   public Optional<cu> f() {
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

   public Optional<dh> n() {
      return this.p;
   }

   public static class a {
      private Optional<bu> a = Optional.empty();
      private Optional<bi> b = Optional.empty();
      private Optional<cq> c = Optional.empty();
      private Optional<cq> d = Optional.empty();
      private Optional<ct> e = Optional.empty();
      private Optional<cu> f = Optional.empty();
      private Optional<bp> g = Optional.empty();
      private Optional<bo> h = Optional.empty();
      private Optional<bs> i = Optional.empty();
      private Optional<br> j = Optional.empty();
      private Optional<br> k = Optional.empty();
      private Optional<br> l = Optional.empty();
      private Optional<String> m = Optional.empty();
      private Optional<dh> n = Optional.empty();

      public static br.a a() {
         return new br.a();
      }

      public br.a a(bqr<?> $$0) {
         this.a = Optional.of(bu.a($$0));
         return this;
      }

      public br.a a(awd<bqr<?>> $$0) {
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

      public br.a a(cq.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public br.a b(cq.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public br.a a(ct.a $$0) {
         this.e = $$0.b();
         return this;
      }

      public br.a a(cu $$0) {
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

      public br.a a(dh $$0) {
         this.n = Optional.of($$0);
         return this;
      }

      public br b() {
         return new br(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
      }
   }
}
