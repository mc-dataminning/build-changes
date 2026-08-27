import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eev extends eee {
   public static final Codec<eev> a = RecordCodecBuilder.create($$0 -> a($$0).and(jd.j.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eev::new));
   private final hg<cle> b;

   private eev(List<efr> $$0, hg<cle> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eeg b() {
      return eeh.z;
   }

   @Override
   public cjh a(cjh $$0, ecs $$1) {
      clg.a($$0, this.b.a());
      return $$0;
   }

   public static eee.a<?> a(cle $$0) {
      return a($$1 -> new eev($$1, $$0.c()));
   }
}
