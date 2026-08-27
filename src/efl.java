import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class efl extends eeu {
   public static final Codec<efl> a = RecordCodecBuilder.create($$0 -> a($$0).and(jy.j.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, efl::new));
   private final ib<cmg> b;

   private efl(List<egh> $$0, ib<cmg> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eew b() {
      return eex.z;
   }

   @Override
   public ckj a(ckj $$0, edi $$1) {
      cmi.a($$0, this.b.a());
      return $$0;
   }

   public static eeu.a<?> a(cmg $$0) {
      return a($$1 -> new efl($$1, $$0.c()));
   }
}
