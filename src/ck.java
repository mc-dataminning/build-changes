import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record ck(Optional<bf<cze.b, ck.a>> c) implements ea<cze> {
   public static final Codec<ck> a = RecordCodecBuilder.create($$0 -> $$0.group(bf.a(ck.a.a).optionalFieldOf("modifiers").forGetter(ck::b)).apply($$0, ck::new));

   @Override
   public ku<cze> a() {
      return kv.o;
   }

   public boolean a(cwn $$0, cze $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.b());
   }

   public Optional<bf<cze.b, ck.a>> b() {
      return this.c;
   }

   public static record a(Optional<jv<bwi>> b, Optional<aku> c, dk.c d, Optional<bwl.a> e, Optional<bus> f) implements Predicate<cze.b> {
      public static final Codec<ck.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kg.a(mc.c).optionalFieldOf("attribute").forGetter(ck.a::a),
                  aku.a.optionalFieldOf("id").forGetter(ck.a::b),
                  dk.c.d.optionalFieldOf("amount", dk.c.c).forGetter(ck.a::c),
                  bwl.a.f.optionalFieldOf("operation").forGetter(ck.a::d),
                  bus.l.optionalFieldOf("slot").forGetter(ck.a::e)
               )
               .apply($$0, ck.a::new)
      );

      public boolean a(cze.b $$0) {
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

      public Optional<jv<bwi>> a() {
         return this.b;
      }

      public Optional<aku> b() {
         return this.c;
      }

      public dk.c c() {
         return this.d;
      }

      public Optional<bwl.a> d() {
         return this.e;
      }

      public Optional<bus> e() {
         return this.f;
      }
   }
}
