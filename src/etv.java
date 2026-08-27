import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etv extends eta {
   public static final Codec<etv> a = RecordCodecBuilder.create($$0 -> a($$0).and(lh.i.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, etv::new));
   private final ja<cwp> b;

   private etv(List<euu> $$0, ja<cwp> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public etc b() {
      return etd.C;
   }

   @Override
   public cuh a(cuh $$0, erp $$1) {
      $$0.a(ke.E, cwr.a, this.b, cwr::b);
      return $$0;
   }

   public static eta.a<?> a(ja<cwp> $$0) {
      return a($$1 -> new etv($$1, $$0));
   }
}
