import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbi extends dcw {
   public static final MapCodec<dbi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(avq.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, dbi::new)
   );
   private final avq b;

   @Override
   public MapCodec<dbi> a() {
      return a;
   }

   public dbi(avq $$0, dmy.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dmz $$0, cwf $$1, ib $$2) {
      return this.b.a();
   }
}
