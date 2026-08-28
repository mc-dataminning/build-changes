import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eg extends dx<eg.a> {
   @Override
   public Codec<eg.a> a() {
      return eg.a.a;
   }

   public void a(arn $$0, cgm $$1) {
      etw $$2 = bv.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bg> b, Optional<bg> c) implements dx.a {
      public static final Codec<eg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(eg.a::a), bv.b.optionalFieldOf("entity").forGetter(eg.a::c)).apply($$0, eg.a::new)
      );

      public static ao<eg.a> b() {
         return an.y.a(new eg.a(Optional.empty(), Optional.empty()));
      }

      public static ao<eg.a> a(bv.a $$0) {
         return an.y.a(new eg.a(Optional.empty(), Optional.of(bv.a($$0))));
      }

      public boolean a(etw $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bh $$0) {
         dx.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
