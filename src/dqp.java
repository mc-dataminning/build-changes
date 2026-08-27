import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqp(il<dqo> e, doy f) {
   public static final Codec<dqp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dqo.j.fieldOf("type").forGetter(dqp::a), doy.a.fieldOf("generator").forGetter(dqp::b)).apply($$0, $$0.stable(dqp::new))
   );
   public static final ajg<dqp> b = ajg.a(kj.aO, new ajh("overworld"));
   public static final ajg<dqp> c = ajg.a(kj.aO, new ajh("the_nether"));
   public static final ajg<dqp> d = ajg.a(kj.aO, new ajh("the_end"));

   public il<dqo> a() {
      return this.e;
   }

   public doy b() {
      return this.f;
   }
}
