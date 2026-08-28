import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cug(ji<avy> e, int f, float g) {
   public static final Codec<cug> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avy.b.fieldOf("sound_event").forGetter(cug::a), ayg.l.fieldOf("use_duration").forGetter(cug::b), ayg.m.fieldOf("range").forGetter(cug::c)
            )
            .apply($$0, cug::new)
   );
   public static final zm<wz, cug> b = zm.a(avy.d, cug::a, zk.g, cug::b, zk.i, cug::c, cug::new);
   public static final Codec<ji<cug>> c = ala.a(lq.E, a);
   public static final zm<wz, ji<cug>> d = zk.a(lq.E, b);

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
