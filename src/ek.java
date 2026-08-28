import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ek extends dw<ek.a> {
   @Override
   public Codec<ek.a> a() {
      return ek.a.a;
   }

   public void a(ark $$0, cvs $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bg> b, Optional<cs> c) implements dw.a {
      public static final Codec<ek.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(ek.a::a), cs.a.optionalFieldOf("item").forGetter(ek.a::b)).apply($$0, ek.a::new)
      );

      public static ao<ek.a> a(bv.a $$0, cs.a $$1) {
         return an.W.a(new ek.a(Optional.of(bv.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(cvs $$0) {
         return !this.c.isPresent() || this.c.get().a($$0);
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<cs> b() {
         return this.c;
      }
   }
}
