import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ej extends dv<ej.a> {
   @Override
   public Codec<ej.a> a() {
      return ej.a.a;
   }

   public void a(arh $$0, cvl $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bg> b, Optional<cs> c) implements dv.a {
      public static final Codec<ej.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(ej.a::a), cs.a.optionalFieldOf("item").forGetter(ej.a::b)).apply($$0, ej.a::new)
      );

      public static ao<ej.a> a(bv.a $$0, cs.a $$1) {
         return an.W.a(new ej.a(Optional.of(bv.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(cvl $$0) {
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
