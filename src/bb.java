import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bb extends dl<bb.a> {
   @Override
   public Codec<bb.a> a() {
      return bb.a.a;
   }

   public void a(asc $$0, jg<dce> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bj> b, Optional<jg<dce>> c) implements dl.a {
      public static final Codec<bb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bz.b.optionalFieldOf("player").forGetter(bb.a::a), dce.a.optionalFieldOf("potion").forGetter(bb.a::c)).apply($$0, bb.a::new)
      );

      public static ar<bb.a> b() {
         return aq.l.a(new bb.a(Optional.empty(), Optional.empty()));
      }

      public boolean a(jg<dce> $$0) {
         return !this.c.isPresent() || this.c.get().equals($$0);
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
