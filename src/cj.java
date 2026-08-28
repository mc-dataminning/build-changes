import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cj(de.d c, de.d d) implements ds<Integer> {
   public static final Codec<cj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(de.d.d.optionalFieldOf("durability", de.d.c).forGetter(cj::b), de.d.d.optionalFieldOf("damage", de.d.c).forGetter(cj::c))
            .apply($$0, cj::new)
   );

   @Override
   public kl<Integer> a() {
      return km.d;
   }

   public boolean a(cuk $$0, Integer $$1) {
      return !this.c.d($$0.o() - $$1) ? false : this.d.d($$1);
   }

   public static cj a(de.d $$0) {
      return new cj($$0, de.d.c);
   }

   public de.d b() {
      return this.c;
   }

   public de.d c() {
      return this.d;
   }
}
