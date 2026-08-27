import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record br(
   Optional<bt> c,
   Optional<bi> d,
   Optional<ck> e,
   Optional<ck> f,
   Optional<cn> g,
   Optional<co> h,
   Optional<bp> i,
   Optional<bo> j,
   Optional<bs> k,
   Optional<br> l,
   Optional<br> m,
   Optional<br> n,
   Optional<String> o
) {
   public static final Codec<br> a = awe.a(
      "EntityPredicate",
      $$0 -> RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     awe.a(bt.a, "type").forGetter(br::a),
                     awe.a(bi.a, "distance").forGetter(br::b),
                     awe.a(ck.a, "location").forGetter(br::c),
                     awe.a(ck.a, "stepping_on").forGetter(br::d),
                     awe.a(cn.a, "effects").forGetter(br::e),
                     awe.a(co.a, "nbt").forGetter(br::f),
                     awe.a(bp.a, "flags").forGetter(br::g),
                     awe.a(bo.a, "equipment").forGetter(br::h),
                     awe.a(bs.a, "type_specific").forGetter(br::i),
                     awe.a($$0, "vehicle").forGetter(br::j),
                     awe.a($$0, "passenger").forGetter(br::k),
                     awe.a($$0, "targeted_entity").forGetter(br::l),
                     awe.a(Codec.STRING, "team").forGetter(br::m)
                  )
                  .apply($$1, br::new)
         )
   );
   public static final Codec<bc> b = awe.a(bc.a, a, br::a);

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
      env $$1 = eny.a(ekw.b.a, $$0).build();
      return new bc(List.of($$1));
   }

   public boolean a(apg $$0, @Nullable box $$1) {
      return this.a($$0.z(), $$0.dk(), $$1);
   }

   public boolean a(apf $$0, @Nullable ept $$1, @Nullable box $$2) {
      if ($$2 == null) {
         return false;
      } else if (this.c.isPresent() && !this.c.get().b($$2.ai())) {
         return false;
      } else {
         if ($$1 == null) {
            if (this.d.isPresent()) {
               return false;
            }
         } else if (this.d.isPresent() && !this.d.get().a($$1.c, $$1.d, $$1.e, $$2.dr(), $$2.dt(), $$2.dx())) {
            return false;
         }

         if (this.e.isPresent() && !this.e.get().a($$0, $$2.dr(), $$2.dt(), $$2.dx())) {
            return false;
         } else {
            if (this.f.isPresent()) {
               ept $$3 = ept.b($$2.aJ());
               if (!this.f.get().a($$0, $$3.a(), $$3.b(), $$3.c())) {
                  return false;
               }
            }

            if (this.g.isPresent() && !this.g.get().a($$2)) {
               return false;
            } else if (this.h.isPresent() && !this.h.get().a($$2)) {
               return false;
            } else if (this.i.isPresent() && !this.i.get().a($$2)) {
               return false;
            } else if (this.j.isPresent() && !this.j.get().a($$2)) {
               return false;
            } else if (this.k.isPresent() && !this.k.get().a($$2, $$0, $$1)) {
               return false;
            } else if (this.l.isPresent() && !this.l.get().a($$0, $$1, $$2.cZ())) {
               return false;
            } else if (this.m.isPresent() && $$2.cP().stream().noneMatch($$2x -> this.m.get().a($$0, $$1, $$2x))) {
               return false;
            } else if (this.n.isPresent() && !this.n.get().a($$0, $$1, $$2 instanceof bpr ? ((bpr)$$2).p() : null)) {
               return false;
            } else {
               if (this.o.isPresent()) {
                  eqz $$4 = $$2.cg();
                  if ($$4 == null || !this.o.get().equals($$4.b())) {
                     return false;
                  }
               }

               return true;
            }
         }
      }
   }

   public static ekw b(apg $$0, box $$1) {
      elc $$2 = new elc.a($$0.z()).a(enh.a, $$1).a(enh.f, $$0.dk()).a(eng.m);
      return new ekw.a($$2).a(Optional.empty());
   }

   public Optional<bt> a() {
      return this.c;
   }

   public Optional<bi> b() {
      return this.d;
   }

   public Optional<ck> c() {
      return this.e;
   }

   public Optional<ck> d() {
      return this.f;
   }

   public Optional<cn> e() {
      return this.g;
   }

   public Optional<co> f() {
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

   public static class a {
      private Optional<bt> a = Optional.empty();
      private Optional<bi> b = Optional.empty();
      private Optional<ck> c = Optional.empty();
      private Optional<ck> d = Optional.empty();
      private Optional<cn> e = Optional.empty();
      private Optional<co> f = Optional.empty();
      private Optional<bp> g = Optional.empty();
      private Optional<bo> h = Optional.empty();
      private Optional<bs> i = Optional.empty();
      private Optional<br> j = Optional.empty();
      private Optional<br> k = Optional.empty();
      private Optional<br> l = Optional.empty();
      private Optional<String> m = Optional.empty();

      public static br.a a() {
         return new br.a();
      }

      public br.a a(bpd<?> $$0) {
         this.a = Optional.of(bt.a($$0));
         return this;
      }

      public br.a a(avd<bpd<?>> $$0) {
         this.a = Optional.of(bt.a($$0));
         return this;
      }

      public br.a a(bt $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public br.a a(bi $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public br.a a(ck.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public br.a b(ck.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public br.a a(cn.a $$0) {
         this.e = $$0.b();
         return this;
      }

      public br.a a(co $$0) {
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

      public br b() {
         return new br(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
      }
   }
}
