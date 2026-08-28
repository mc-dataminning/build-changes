import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record co(dk.d c, dk.d d) implements ea<Integer> {
   public static final Codec<co> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dk.d.d.optionalFieldOf("durability", dk.d.c).forGetter(co::b), dk.d.d.optionalFieldOf("damage", dk.d.c).forGetter(co::c))
            .apply($$0, co::new)
   );

   @Override
   public ku<Integer> a() {
      return kv.e;
   }

   public boolean a(cwo $$0, Integer $$1) {
      return !this.c.d($$0.p() - $$1) ? false : this.d.d($$1);
   }

   public static co a(dk.d $$0) {
      return new co($$0, dk.d.c);
   }

   public dk.d b() {
      return this.c;
   }

   public dk.d c() {
      return this.d;
   }
}
