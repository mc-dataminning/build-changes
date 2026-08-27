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
   public static final Codec<br> a = avu.a(
      "EntityPredicate",
      $$0 -> RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     avu.a(bt.a, "type").forGetter(br::a),
                     avu.a(bi.a, "distance").forGetter(br::b),
                     avu.a(ck.a, "location").forGetter(br::c),
                     avu.a(ck.a, "stepping_on").forGetter(br::d),
                     avu.a(cn.a, "effects").forGetter(br::e),
                     avu.a(co.a, "nbt").forGetter(br::f),
                     avu.a(bp.a, "flags").forGetter(br::g),
                     avu.a(bo.a, "equipment").forGetter(br::h),
                     avu.a(bs.a, "type_specific").forGetter(br::i),
                     avu.a($$0, "vehicle").forGetter(br::j),
                     avu.a($$0, "passenger").forGetter(br::k),
                     avu.a($$0, "targeted_entity").forGetter(br::l),
                     avu.a(Codec.STRING, "team").forGetter(br::m)
                  )
                  .apply($$1, br::new)
         )
   );
   public static final Codec<bc> b = avu.a(bc.a, a, br::a);

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
      emx $$1 = ena.a(ejy.b.a, $$0).build();
      return new bc(List.of($$1));
   }

   public boolean a(apb $$0, @Nullable bof $$1) {
      return this.a($$0.z(), $$0.dh(), $$1);
   }

   public boolean a(apa $$0, @Nullable eov $$1, @Nullable bof $$2) {
      if ($$2 == null) {
         return false;
      } else if (this.c.isPresent() && !this.c.get().b($$2.ai())) {
         return false;
      } else {
         if ($$1 == null) {
            if (this.d.isPresent()) {
               return false;
            }
         } else if (this.d.isPresent() && !this.d.get().a($$1.c, $$1.d, $$1.e, $$2.do(), $$2.dq(), $$2.du())) {
            return false;
         }

         if (this.e.isPresent() && !this.e.get().a($$0, $$2.do(), $$2.dq(), $$2.du())) {
            return false;
         } else {
            if (this.f.isPresent()) {
               eov $$3 = eov.b($$2.aJ());
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
            } else if (this.l.isPresent() && !this.l.get().a($$0, $$1, $$2.cW())) {
               return false;
            } else if (this.m.isPresent() && $$2.cM().stream().noneMatch($$2x -> this.m.get().a($$0, $$1, $$2x))) {
               return false;
            } else if (this.n.isPresent() && !this.n.get().a($$0, $$1, $$2 instanceof boz ? ((boz)$$2).q() : null)) {
               return false;
            } else {
               if (this.o.isPresent()) {
                  eqb $$4 = $$2.cd();
                  if ($$4 == null || !this.o.get().equals($$4.b())) {
                     return false;
                  }
               }

               return true;
            }
         }
      }
   }

   public static ejy b(apb $$0, bof $$1) {
      eke $$2 = new eke.a($$0.z()).a(emj.a, $$1).a(emj.f, $$0.dh()).a(emi.m);
      return new ejy.a($$2).a(Optional.empty());
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

      public br.a a(bol<?> $$0) {
         this.a = Optional.of(bt.a($$0));
         return this;
      }

      public br.a a(aut<bol<?>> $$0) {
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
