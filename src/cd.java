import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cd(ct.d c, ct.d d) implements dg<Integer> {
   public static final Codec<cd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ct.d.d.optionalFieldOf("durability", ct.d.c).forGetter(cd::b), ct.d.d.optionalFieldOf("damage", ct.d.c).forGetter(cd::c))
            .apply($$0, cd::new)
   );

   @Override
   public ka<Integer> a() {
      return kb.d;
   }

   public boolean a(ctq $$0, Integer $$1) {
      return !this.c.d($$0.o() - $$1) ? false : this.d.d($$1);
   }

   public static cd a(ct.d $$0) {
      return new cd($$0, ct.d.c);
   }

   public ct.d b() {
      return this.c;
   }

   public ct.d c() {
      return this.d;
   }
}
