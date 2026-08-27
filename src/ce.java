import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ce(cu.d c, cu.d d) implements di<Integer> {
   public static final Codec<ce> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axu.a(cu.d.d, "durability", cu.d.c).forGetter(ce::b), axu.a(cu.d.d, "damage", cu.d.c).forGetter(ce::c)).apply($$0, ce::new)
   );

   @Override
   public kd<Integer> a() {
      return ke.d;
   }

   public boolean a(cuh $$0, Integer $$1) {
      return !this.c.d($$0.n() - $$1) ? false : this.d.d($$1);
   }

   public static ce a(cu.d $$0) {
      return new ce($$0, cu.d.c);
   }

   public cu.d b() {
      return this.c;
   }

   public cu.d c() {
      return this.d;
   }
}
