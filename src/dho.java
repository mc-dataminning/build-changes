import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dho extends dhn {
   public static final MapCodec<dho> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpf.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, dho::new)
   );

   @Override
   public MapCodec<dho> a() {
      return c;
   }

   public dho(bpf $$0, dtb.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected int f(dtc $$0, dbg $$1, ir $$2) {
      return 2;
   }
}
