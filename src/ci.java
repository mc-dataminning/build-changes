import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record ci(Optional<bd<cym.b, ci.a>> c) implements dy<cym> {
   public static final Codec<ci> a = RecordCodecBuilder.create($$0 -> $$0.group(bd.a(ci.a.a).optionalFieldOf("modifiers").forGetter(ci::b)).apply($$0, ci::new));

   @Override
   public ks<cym> a() {
      return kt.o;
   }

   public boolean a(cvx $$0, cym $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.b());
   }

   public Optional<bd<cym.b, ci.a>> b() {
      return this.c;
   }

   public static record a(Optional<jt<bvy>> b, Optional<alh> c, di.c d, Optional<bwb.a> e, Optional<bui> f) implements Predicate<cym.b> {
      public static final Codec<ci.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ke.a(ly.c).optionalFieldOf("attribute").forGetter(ci.a::a),
                  alh.a.optionalFieldOf("id").forGetter(ci.a::b),
                  di.c.d.optionalFieldOf("amount", di.c.c).forGetter(ci.a::c),
                  bwb.a.f.optionalFieldOf("operation").forGetter(ci.a::d),
                  bui.l.optionalFieldOf("slot").forGetter(ci.a::e)
               )
               .apply($$0, ci.a::new)
      );

      public boolean a(cym.b $$0) {
         if (this.b.isPresent() && !this.b.get().a($$0.a())) {
            return false;
         } else if (this.c.isPresent() && !this.c.get().equals($$0.b().b())) {
            return false;
         } else if (!this.d.d($$0.b().c())) {
            return false;
         } else {
            return this.e.isPresent() && this.e.get() != $$0.b().d() ? false : !this.f.isPresent() || this.f.get() == $$0.c();
         }
      }

      public Optional<jt<bvy>> a() {
         return this.b;
      }

      public Optional<alh> b() {
         return this.c;
      }

      public di.c c() {
         return this.d;
      }

      public Optional<bwb.a> d() {
         return this.e;
      }

      public Optional<bui> e() {
         return this.f;
      }
   }
}
