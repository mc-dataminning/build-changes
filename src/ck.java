import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record ck(Optional<bf<dam.b, ck.a>> c) implements ea<dam> {
   public static final Codec<ck> a = RecordCodecBuilder.create($$0 -> $$0.group(bf.a(ck.a.a).optionalFieldOf("modifiers").forGetter(ck::b)).apply($$0, ck::new));

   @Override
   public kw<dam> a() {
      return kx.o;
   }

   public boolean a(cxy $$0, dam $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.b());
   }

   public Optional<bf<dam.b, ck.a>> b() {
      return this.c;
   }

   public static record a(Optional<jw<bxs>> b, Optional<ald> c, dk.c d, Optional<bxv.a> e, Optional<bwd> f) implements Predicate<dam.b> {
      public static final Codec<ck.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kh.a(me.c).optionalFieldOf("attribute").forGetter(ck.a::a),
                  ald.a.optionalFieldOf("id").forGetter(ck.a::b),
                  dk.c.d.optionalFieldOf("amount", dk.c.c).forGetter(ck.a::c),
                  bxv.a.f.optionalFieldOf("operation").forGetter(ck.a::d),
                  bwd.m.optionalFieldOf("slot").forGetter(ck.a::e)
               )
               .apply($$0, ck.a::new)
      );

      public boolean a(dam.b $$0) {
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

      public Optional<jw<bxs>> a() {
         return this.b;
      }

      public Optional<ald> b() {
         return this.c;
      }

      public dk.c c() {
         return this.d;
      }

      public Optional<bxv.a> d() {
         return this.e;
      }

      public Optional<bwd> e() {
         return this.f;
      }
   }
}
