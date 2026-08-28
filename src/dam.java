import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dam(int c, boolean d) {
   public static final Codec<dam> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.l.optionalFieldOf("damage_per_attack", 1).forGetter(dam::a), Codec.BOOL.optionalFieldOf("can_disable_blocking", false).forGetter(dam::b)
            )
            .apply($$0, dam::new)
   );
   public static final yn<wa, dam> b = yn.a(yl.h, dam::a, yl.b, dam::b, dam::new);

   public int a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
