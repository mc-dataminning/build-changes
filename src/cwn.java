import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cwn extends cyb {
   public static final MapCodec<cwn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(asl.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, cwn::new)
   );
   private final asl b;

   @Override
   public MapCodec<cwn> a() {
      return a;
   }

   public cwn(asl $$0, dhm.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dhn $$0, crl $$1, hx $$2) {
      return this.b.a();
   }
}
