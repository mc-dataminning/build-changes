import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cuf(ji<avy> e, int f, float g) {
   public static final Codec<cuf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avy.b.fieldOf("sound_event").forGetter(cuf::a), ayf.l.fieldOf("use_duration").forGetter(cuf::b), ayf.m.fieldOf("range").forGetter(cuf::c)
            )
            .apply($$0, cuf::new)
   );
   public static final zm<wz, cuf> b = zm.a(avy.d, cuf::a, zk.g, cuf::b, zk.i, cuf::c, cuf::new);
   public static final Codec<ji<cuf>> c = ala.a(lq.E, a);
   public static final zm<wz, ji<cuf>> d = zk.a(lq.E, b);

   public ji<avy> a() {
      return this.e;
   }

   public int b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }
}
