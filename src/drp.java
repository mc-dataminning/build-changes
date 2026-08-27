import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record drp(int b, int c, int d) implements dqs {
   public static final Codec<drp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asg.j.fieldOf("spread_width").forGetter(drp::a), asg.j.fieldOf("spread_height").forGetter(drp::b), asg.j.fieldOf("max_height").forGetter(drp::c)
            )
            .apply($$0, drp::new)
   );

   public int a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
