import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eiy extends eii {
   public static final Codec<eiy> a = RecordCodecBuilder.create($$0 -> a($$0).and(tl.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, eiy::new));
   private final sn b;

   private eiy(List<ejv> $$0, sn $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eik b() {
      return eil.g;
   }

   @Override
   public cmy a(cmy $$0, egw $$1) {
      $$0.w().a(this.b);
      return $$0;
   }

   @Deprecated
   public static eii.a<?> a(sn $$0) {
      return a($$1 -> new eiy($$1, $$0));
   }
}
