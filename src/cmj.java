import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cmj(ih<arl> b, int c, float d) {
   public static final Codec<cmj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arl.b.fieldOf("sound_event").forGetter(cmj::a), atq.j.fieldOf("use_duration").forGetter(cmj::b), atq.k.fieldOf("range").forGetter(cmj::c)
            )
            .apply($$0, cmj::new)
   );

   public ih<arl> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }
}
