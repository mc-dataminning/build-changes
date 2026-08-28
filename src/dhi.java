import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhi extends dey {
   public static final MapCodec<dhi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpy.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, dhi::new)
   );
   private final bpy b;

   @Override
   public MapCodec<? extends dhi> a() {
      return a;
   }

   public dhi(bpy $$0, dsa.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, cuo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
