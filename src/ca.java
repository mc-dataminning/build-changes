import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ca extends dv<ca.a> {
   @Override
   public Codec<ca.a> a() {
      return ca.a.a;
   }

   public void a(aqu $$0, cuo $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bg> b, Optional<cs> c) implements dv.a {
      public static final Codec<ca.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(ca.a::a), cs.a.optionalFieldOf("item").forGetter(ca.a::b)).apply($$0, ca.a::new)
      );

      public static ao<ca.a> a(cs.a $$0) {
         return an.k.a(new ca.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(cuo $$0) {
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
