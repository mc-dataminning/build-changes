import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record bp(
   Optional<br> c,
   Optional<bg> d,
   Optional<ci> e,
   Optional<ci> f,
   Optional<cl> g,
   Optional<cm> h,
   Optional<bn> i,
   Optional<bm> j,
   Optional<bq> k,
   Optional<bp> l,
   Optional<bp> m,
   Optional<bp> n,
   Optional<String> o
) {
   public static final Codec<bp> a = atg.a(
      "EntityPredicate",
      $$0 -> RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     atg.a(br.a, "type").forGetter(bp::a),
                     atg.a(bg.a, "distance").forGetter(bp::b),
                     atg.a(ci.a, "location").forGetter(bp::c),
                     atg.a(ci.a, "stepping_on").forGetter(bp::d),
                     atg.a(cl.a, "effects").forGetter(bp::e),
                     atg.a(cm.a, "nbt").forGetter(bp::f),
                     atg.a(bn.a, "flags").forGetter(bp::g),
                     atg.a(bm.a, "equipment").forGetter(bp::h),
                     atg.a(bq.a, "type_specific").forGetter(bp::i),
                     atg.a($$0, "vehicle").forGetter(bp::j),
                     atg.a($$0, "passenger").forGetter(bp::k),
                     atg.a($$0, "targeted_entity").forGetter(bp::l),
                     atg.a(Codec.STRING, "team").forGetter(bp::m)
                  )
                  .apply($$1, bp::new)
         )
   );
   public static final Codec<bb> b = atg.a(bb.a, a, bp::a);

   public static bb a(bp.a $$0) {
      return a($$0.b());
   }

   public static Optional<bb> a(Optional<bp> $$0) {
      return $$0.map(bp::a);
   }

   public static List<bb> a(bp.a... $$0) {
      return Stream.of($$0).map(bp::a).toList();
   }

   public static bb a(bp $$0) {
      ejd $$1 = ejg.a(ege.b.a, $$0).build();
      return new bb(List.of($$1));
   }

   public boolean a(amq $$0, @Nullable blf $$1) {
      return this.a($$0.z(), $$0.dk(), $$1);
   }

   public boolean a(amp $$0, @Nullable elb $$1, @Nullable blf $$2) {
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
               elb $$3 = elb.b($$2.aJ());
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
            } else if (this.n.isPresent() && !this.n.get().a($$0, $$1, $$2 instanceof blx ? ((blx)$$2).q() : null)) {
               return false;
            } else {
               if (this.o.isPresent()) {
                  emc $$4 = $$2.cg();
                  if ($$4 == null || !this.o.get().equals($$4.b())) {
                     return false;
                  }
               }

               return true;
            }
         }
      }
   }

   public static ege b(amq $$0, blf $$1) {
      egk $$2 = new egk.a($$0.z()).a(eip.a, $$1).a(eip.f, $$0.dk()).a(eio.l);
      return new ege.a($$2).a(Optional.empty());
   }

   public Optional<br> a() {
      return this.c;
   }

   public Optional<bg> b() {
      return this.d;
   }

   public Optional<ci> c() {
      return this.e;
   }

   public Optional<ci> d() {
      return this.f;
   }

   public Optional<cl> e() {
      return this.g;
   }

   public Optional<cm> f() {
      return this.h;
   }

   public Optional<bn> g() {
      return this.i;
   }

   public Optional<bm> h() {
      return this.j;
   }

   public Optional<bq> i() {
      return this.k;
   }

   public Optional<bp> j() {
      return this.l;
   }

   public Optional<bp> k() {
      return this.m;
   }

   public Optional<bp> l() {
      return this.n;
   }

   public Optional<String> m() {
      return this.o;
   }

   public static class a {
      private Optional<br> a = Optional.empty();
      private Optional<bg> b = Optional.empty();
      private Optional<ci> c = Optional.empty();
      private Optional<ci> d = Optional.empty();
      private Optional<cl> e = Optional.empty();
      private Optional<cm> f = Optional.empty();
      private Optional<bn> g = Optional.empty();
      private Optional<bm> h = Optional.empty();
      private Optional<bq> i = Optional.empty();
      private Optional<bp> j = Optional.empty();
      private Optional<bp> k = Optional.empty();
      private Optional<bp> l = Optional.empty();
      private Optional<String> m = Optional.empty();

      public static bp.a a() {
         return new bp.a();
      }

      public bp.a a(blj<?> $$0) {
         this.a = Optional.of(br.a($$0));
         return this;
      }

      public bp.a a(asg<blj<?>> $$0) {
         this.a = Optional.of(br.a($$0));
         return this;
      }

      public bp.a a(br $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public bp.a a(bg $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public bp.a a(ci.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bp.a b(ci.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public bp.a a(cl.a $$0) {
         this.e = $$0.b();
         return this;
      }

      public bp.a a(cm $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public bp.a a(bn.a $$0) {
         this.g = Optional.of($$0.b());
         return this;
      }

      public bp.a a(bm.a $$0) {
         this.h = Optional.of($$0.b());
         return this;
      }

      public bp.a a(bm $$0) {
         this.h = Optional.of($$0);
         return this;
      }

      public bp.a a(bq $$0) {
         this.i = Optional.of($$0);
         return this;
      }

      public bp.a a(bp.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public bp.a b(bp.a $$0) {
         this.k = Optional.of($$0.b());
         return this;
      }

      public bp.a c(bp.a $$0) {
         this.l = Optional.of($$0.b());
         return this;
      }

      public bp.a a(String $$0) {
         this.m = Optional.of($$0);
         return this;
      }

      public bp b() {
         return new bp(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
      }
   }
}
