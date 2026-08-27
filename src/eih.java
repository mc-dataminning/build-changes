import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eih extends ehq {
   public static final Codec<eih> a = RecordCodecBuilder.create($$0 -> a($$0).and(kb.i.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eih::new));
   private final ie<coe> b;

   private eih(List<ejd> $$0, ie<coe> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ehs b() {
      return eht.z;
   }

   @Override
   public cmh a(cmh $$0, ege $$1) {
      cog.a($$0, this.b.a());
      return $$0;
   }

   public static ehq.a<?> a(coe $$0) {
      return a($$1 -> new eih($$1, $$0.c()));
   }
}
