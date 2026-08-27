import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfg extends dgu {
   public static final MapCodec<dfg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(awy.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, dfg::new)
   );
   private final awy b;

   @Override
   public MapCodec<dfg> a() {
      return a;
   }

   public dfg(awy $$0, dra.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(drb $$0, dad $$1, io $$2) {
      return this.b.a();
   }
}
