import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ck(
   Optional<ck.b> b, Optional<ir<daf>> c, Optional<ir<efq>> d, Optional<aju<czg>> e, Optional<Boolean> f, Optional<ch> g, Optional<av> h, Optional<by> i
) {
   public static final Codec<ck> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awu.a(ck.b.a, "position").forGetter(ck::a),
               awu.a(jc.a(ku.aw), "biomes").forGetter(ck::b),
               awu.a(jc.a(ku.aG), "structures").forGetter(ck::c),
               awu.a(aju.a(ku.aP), "dimension").forGetter(ck::d),
               awu.a(Codec.BOOL, "smokey").forGetter(ck::e),
               awu.a(ch.a, "light").forGetter(ck::f),
               awu.a(av.a, "block").forGetter(ck::g),
               awu.a(by.a, "fluid").forGetter(ck::h)
            )
            .apply($$0, ck::new)
   );

   public boolean a(apu $$0, double $$1, double $$2, double $$3) {
      if (this.b.isPresent() && !this.b.get().a($$1, $$2, $$3)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$0.ae()) {
         return false;
      } else {
         id $$4 = id.a($$1, $$2, $$3);
         boolean $$5 = $$0.p($$4);
         if (!this.c.isPresent() || $$5 && this.c.get().a($$0.t($$4))) {
            if (!this.d.isPresent() || $$5 && $$0.a().a($$4, this.d.get()).b()) {
               if (!this.f.isPresent() || $$5 && this.f.get() == dcv.a($$0, $$4)) {
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

   public Optional<ck.b> a() {
      return this.b;
   }

   public Optional<ir<daf>> b() {
      return this.c;
   }

   public Optional<ir<efq>> c() {
      return this.d;
   }

   public Optional<aju<czg>> d() {
      return this.e;
   }

   public Optional<Boolean> e() {
      return this.f;
   }

   public Optional<ch> f() {
      return this.g;
   }

   public Optional<av> g() {
      return this.h;
   }

   public Optional<by> h() {
      return this.i;
   }

   public static class a {
      private cm.c a;
      private cm.c b;
      private cm.c c;
      private Optional<ir<daf>> d;
      private Optional<ir<efq>> e;
      private Optional<aju<czg>> f;
      private Optional<Boolean> g;
      private Optional<ch> h;
      private Optional<av> i;
      private Optional<by> j;

      public a() {
         this.a = cm.c.c;
         this.b = cm.c.c;
         this.c = cm.c.c;
         this.d = Optional.empty();
         this.e = Optional.empty();
         this.f = Optional.empty();
         this.g = Optional.empty();
         this.h = Optional.empty();
         this.i = Optional.empty();
         this.j = Optional.empty();
      }

      public static ck.a a() {
         return new ck.a();
      }

      public static ck.a a(in<daf> $$0) {
         return a().a(ir.a($$0));
      }

      public static ck.a a(aju<czg> $$0) {
         return a().b($$0);
      }

      public static ck.a b(in<efq> $$0) {
         return a().b(ir.a($$0));
      }

      public static ck.a a(cm.c $$0) {
         return a().c($$0);
      }

      public ck.a b(cm.c $$0) {
         this.a = $$0;
         return this;
      }

      public ck.a c(cm.c $$0) {
         this.b = $$0;
         return this;
      }

      public ck.a d(cm.c $$0) {
         this.c = $$0;
         return this;
      }

      public ck.a a(ir<daf> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ck.a b(ir<efq> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public ck.a b(aju<czg> $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public ck.a a(ch.a $$0) {
         this.h = Optional.of($$0.b());
         return this;
      }

      public ck.a a(av.a $$0) {
         this.i = Optional.of($$0.b());
         return this;
      }

      public ck.a a(by.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public ck.a a(boolean $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public ck b() {
         Optional<ck.b> $$0 = ck.b.a(this.a, this.b, this.c);
         return new ck($$0, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }

   static record b(cm.c b, cm.c c, cm.c d) {
      public static final Codec<ck.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awu.a(cm.c.d, "x", cm.c.c).forGetter(ck.b::a), awu.a(cm.c.d, "y", cm.c.c).forGetter(ck.b::b), awu.a(cm.c.d, "z", cm.c.c).forGetter(ck.b::c)
               )
               .apply($$0, ck.b::new)
      );

      static Optional<ck.b> a(cm.c $$0, cm.c $$1, cm.c $$2) {
         return $$0.c() && $$1.c() && $$2.c() ? Optional.empty() : Optional.of(new ck.b($$0, $$1, $$2));
      }

      public boolean a(double $$0, double $$1, double $$2) {
         return this.b.d($$0) && this.c.d($$1) && this.d.d($$2);
      }

      public cm.c a() {
         return this.b;
      }

      public cm.c b() {
         return this.c;
      }

      public cm.c c() {
         return this.d;
      }
   }
}
