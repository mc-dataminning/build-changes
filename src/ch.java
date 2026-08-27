import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record ch(
   Optional<ch.b> b, Optional<aeq<cqk>> c, Optional<aeq<duz>> d, Optional<aeq<cpm>> e, Optional<Boolean> f, Optional<ce> g, Optional<at> h, Optional<bv> i
) {
   public static final Codec<ch> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqy.a(ch.b.a, "position").forGetter(ch::b),
               aqy.a(aeq.a(jc.ap), "biome").forGetter(ch::c),
               aqy.a(aeq.a(jc.az), "structure").forGetter(ch::d),
               aqy.a(aeq.a(jc.aH), "dimension").forGetter(ch::e),
               aqy.a(Codec.BOOL, "smokey").forGetter(ch::f),
               aqy.a(ce.a, "light").forGetter(ch::g),
               aqy.a(at.a, "block").forGetter(ch::h),
               aqy.a(bv.a, "fluid").forGetter(ch::i)
            )
            .apply($$0, ch::new)
   );

   static Optional<ch> a(
      Optional<ch.b> $$0,
      Optional<aeq<cqk>> $$1,
      Optional<aeq<duz>> $$2,
      Optional<aeq<cpm>> $$3,
      Optional<Boolean> $$4,
      Optional<ce> $$5,
      Optional<at> $$6,
      Optional<bv> $$7
   ) {
      return $$0.isEmpty() && $$1.isEmpty() && $$2.isEmpty() && $$3.isEmpty() && $$4.isEmpty() && $$5.isEmpty() && $$6.isEmpty() && $$7.isEmpty()
         ? Optional.empty()
         : Optional.of(new ch($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public boolean a(akk $$0, double $$1, double $$2, double $$3) {
      if (this.b.isPresent() && !this.b.get().a($$1, $$2, $$3)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$0.ac()) {
         return false;
      } else {
         gu $$4 = gu.a($$1, $$2, $$3);
         boolean $$5 = $$0.o($$4);
         if (!this.c.isPresent() || $$5 && $$0.s($$4).a(this.c.get())) {
            if (!this.d.isPresent() || $$5 && $$0.a().a($$4, this.d.get()).b()) {
               if (!this.f.isPresent() || $$5 && this.f.get() == csz.a($$0, $$4)) {
                  if (this.g.isPresent() && !this.g.get().a($$0, $$4)) {
                     return false;
                  } else {
                     return this.h.isPresent() && !this.h.get().a($$0, $$4) ? false : !this.i.isPresent() || this.i.get().a($$0, $$4);
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   public JsonElement a() {
      return ac.a(a.encodeStart(JsonOps.INSTANCE, this), IllegalStateException::new);
   }

   public static Optional<ch> a(@Nullable JsonElement $$0) {
      return $$0 != null && !$$0.isJsonNull() ? Optional.of(ac.a(a.parse(JsonOps.INSTANCE, $$0), JsonParseException::new)) : Optional.empty();
   }

   public static class a {
      private cj.c a;
      private cj.c b;
      private cj.c c;
      private Optional<aeq<cqk>> d;
      private Optional<aeq<duz>> e;
      private Optional<aeq<cpm>> f;
      private Optional<Boolean> g;
      private Optional<ce> h;
      private Optional<at> i;
      private Optional<bv> j;

      public a() {
         this.a = cj.c.c;
         this.b = cj.c.c;
         this.c = cj.c.c;
         this.d = Optional.empty();
         this.e = Optional.empty();
         this.f = Optional.empty();
         this.g = Optional.empty();
         this.h = Optional.empty();
         this.i = Optional.empty();
         this.j = Optional.empty();
      }

      public static ch.a a() {
         return new ch.a();
      }

      public static ch.a a(aeq<cqk> $$0) {
         return a().d($$0);
      }

      public static ch.a b(aeq<cpm> $$0) {
         return a().f($$0);
      }

      public static ch.a c(aeq<duz> $$0) {
         return a().e($$0);
      }

      public static ch.a a(cj.c $$0) {
         return a().c($$0);
      }

      public ch.a b(cj.c $$0) {
         this.a = $$0;
         return this;
      }

      public ch.a c(cj.c $$0) {
         this.b = $$0;
         return this;
      }

      public ch.a d(cj.c $$0) {
         this.c = $$0;
         return this;
      }

      public ch.a d(aeq<cqk> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ch.a e(aeq<duz> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public ch.a f(aeq<cpm> $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public ch.a a(ce.a $$0) {
         this.h = $$0.b();
         return this;
      }

      public ch.a a(at.a $$0) {
         this.i = $$0.b();
         return this;
      }

      public ch.a a(bv.a $$0) {
         this.j = $$0.b();
         return this;
      }

      public ch.a a(boolean $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public Optional<ch> b() {
         return ch.a(ch.b.a(this.a, this.b, this.c), this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }

   static record b(cj.c b, cj.c c, cj.c d) {
      public static final Codec<ch.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aqy.a(cj.c.d, "x", cj.c.c).forGetter(ch.b::a), aqy.a(cj.c.d, "y", cj.c.c).forGetter(ch.b::b), aqy.a(cj.c.d, "z", cj.c.c).forGetter(ch.b::c)
               )
               .apply($$0, ch.b::new)
      );

      static Optional<ch.b> a(cj.c $$0, cj.c $$1, cj.c $$2) {
         return $$0.c() && $$1.c() && $$2.c() ? Optional.empty() : Optional.of(new ch.b($$0, $$1, $$2));
      }

      public boolean a(double $$0, double $$1, double $$2) {
         return this.b.d($$0) && this.c.d($$1) && this.d.d($$2);
      }

      public cj.c a() {
         return this.b;
      }

      public cj.c b() {
         return this.c;
      }

      public cj.c c() {
         return this.d;
      }
   }
}
