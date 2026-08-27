import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqn(il<dqm> e, dow f) {
   public static final Codec<dqn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dqm.j.fieldOf("type").forGetter(dqn::a), dow.a.fieldOf("generator").forGetter(dqn::b)).apply($$0, $$0.stable(dqn::new))
   );
   public static final ajg<dqn> b = ajg.a(kj.aO, new ajh("overworld"));
   public static final ajg<dqn> c = ajg.a(kj.aO, new ajh("the_nether"));
   public static final ajg<dqn> d = ajg.a(kj.aO, new ajh("the_end"));

   public il<dqm> a() {
      return this.e;
   }

   public dow b() {
      return this.f;
   }
}
