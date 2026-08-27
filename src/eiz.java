import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eiz extends eii {
   public static final Codec<eiz> a = RecordCodecBuilder.create($$0 -> a($$0).and(kd.i.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eiz::new));
   private final ih<cow> b;

   private eiz(List<ejv> $$0, ih<cow> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eik b() {
      return eil.z;
   }

   @Override
   public cmy a(cmy $$0, egw $$1) {
      coy.a($$0, this.b.a());
      return $$0;
   }

   public static eii.a<?> a(cow $$0) {
      return a($$1 -> new eiz($$1, $$0.c()));
   }
}
