import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dvq(ji<dvp> e, dtu f) {
   public static final Codec<dvq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvp.j.fieldOf("type").forGetter(dvq::a), dtu.a.fieldOf("generator").forGetter(dvq::b)).apply($$0, $$0.stable(dvq::new))
   );
   public static final ala<dvq> b = ala.a(lq.aT, new alb("overworld"));
   public static final ala<dvq> c = ala.a(lq.aT, new alb("the_nether"));
   public static final ala<dvq> d = ala.a(lq.aT, new alb("the_end"));

   public ji<dvp> a() {
      return this.e;
   }

   public dtu b() {
      return this.f;
   }
}
