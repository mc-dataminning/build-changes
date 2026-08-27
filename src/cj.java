import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record cj(
   Optional<cj.b> b, Optional<afv<crx>> c, Optional<afv<dwa>> d, Optional<afv<cqz>> e, Optional<Boolean> f, Optional<cg> g, Optional<av> h, Optional<bx> i
) {
   public static final Codec<cj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asg.a(cj.b.a, "position").forGetter(cj::b),
               asg.a(afv.a(jz.aq), "biome").forGetter(cj::c),
               asg.a(afv.a(jz.aA), "structure").forGetter(cj::d),
               asg.a(afv.a(jz.aI), "dimension").forGetter(cj::e),
               asg.a(Codec.BOOL, "smokey").forGetter(cj::f),
               asg.a(cg.a, "light").forGetter(cj::g),
               asg.a(av.a, "block").forGetter(cj::h),
               asg.a(bx.a, "fluid").forGetter(cj::i)
            )
            .apply($$0, cj::new)
   );

   private static Optional<cj> a(
      Optional<cj.b> $$0,
      Optional<afv<crx>> $$1,
      Optional<afv<dwa>> $$2,
      Optional<afv<cqz>> $$3,
      Optional<Boolean> $$4,
      Optional<cg> $$5,
      Optional<av> $$6,
      Optional<bx> $$7
   ) {
      return $$0.isEmpty() && $$1.isEmpty() && $$2.isEmpty() && $$3.isEmpty() && $$4.isEmpty() && $$5.isEmpty() && $$6.isEmpty() && $$7.isEmpty()
         ? Optional.empty()
         : Optional.of(new cj($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public boolean a(alq $$0, double $$1, double $$2, double $$3) {
      if (this.b.isPresent() && !this.b.get().a($$1, $$2, $$3)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$0.ac()) {
         return false;
      } else {
         ht $$4 = ht.a($$1, $$2, $$3);
         boolean $$5 = $$0.o($$4);
         if (!this.c.isPresent() || $$5 && $$0.s($$4).a(this.c.get())) {
            if (!this.d.isPresent() || $$5 && $$0.a().a($$4, this.d.get()).b()) {
               if (!this.f.isPresent() || $$5 && this.f.get() == cuo.a($$0, $$4)) {
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

   public static Optional<cj> a(@Nullable JsonElement $$0) {
      return $$0 != null && !$$0.isJsonNull() ? Optional.of(ac.a(a.parse(JsonOps.INSTANCE, $$0), JsonParseException::new)) : Optional.empty();
   }

   public static class a {
      private cl.c a;
      private cl.c b;
      private cl.c c;
      private Optional<afv<crx>> d;
      private Optional<afv<dwa>> e;
      private Optional<afv<cqz>> f;
      private Optional<Boolean> g;
      private Optional<cg> h;
      private Optional<av> i;
      private Optional<bx> j;

      public a() {
         this.a = cl.c.c;
         this.b = cl.c.c;
         this.c = cl.c.c;
         this.d = Optional.empty();
         this.e = Optional.empty();
         this.f = Optional.empty();
         this.g = Optional.empty();
         this.h = Optional.empty();
         this.i = Optional.empty();
         this.j = Optional.empty();
      }

      public static cj.a a() {
         return new cj.a();
      }

      public static cj.a a(afv<crx> $$0) {
         return a().d($$0);
      }

      public static cj.a b(afv<cqz> $$0) {
         return a().f($$0);
      }

      public static cj.a c(afv<dwa> $$0) {
         return a().e($$0);
      }

      public static cj.a a(cl.c $$0) {
         return a().c($$0);
      }

      public cj.a b(cl.c $$0) {
         this.a = $$0;
         return this;
      }

      public cj.a c(cl.c $$0) {
         this.b = $$0;
         return this;
      }

      public cj.a d(cl.c $$0) {
         this.c = $$0;
         return this;
      }

      public cj.a d(afv<crx> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public cj.a e(afv<dwa> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public cj.a f(afv<cqz> $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public cj.a a(cg.a $$0) {
         this.h = Optional.of($$0.b());
         return this;
      }

      public cj.a a(av.a $$0) {
         this.i = Optional.of($$0.b());
         return this;
      }

      public cj.a a(bx.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public cj.a a(boolean $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public cj b() {
         Optional<cj.b> $$0 = cj.b.a(this.a, this.b, this.c);
         return new cj($$0, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }

   static record b(cl.c b, cl.c c, cl.c d) {
      public static final Codec<cj.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  asg.a(cl.c.d, "x", cl.c.c).forGetter(cj.b::a), asg.a(cl.c.d, "y", cl.c.c).forGetter(cj.b::b), asg.a(cl.c.d, "z", cl.c.c).forGetter(cj.b::c)
               )
               .apply($$0, cj.b::new)
      );

      static Optional<cj.b> a(cl.c $$0, cl.c $$1, cl.c $$2) {
         return $$0.c() && $$1.c() && $$2.c() ? Optional.empty() : Optional.of(new cj.b($$0, $$1, $$2));
      }

      public boolean a(double $$0, double $$1, double $$2) {
         return this.b.d($$0) && this.c.d($$1) && this.d.d($$2);
      }

      public cl.c a() {
         return this.b;
      }

      public cl.c b() {
         return this.c;
      }

      public cl.c c() {
         return this.d;
      }
   }
}
