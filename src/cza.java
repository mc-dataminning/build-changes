import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cza extends cwq {
   public static final MapCodec<cza> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bjg.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, cza::new)
   );
   private final bjg b;

   @Override
   public MapCodec<? extends cza> a() {
      return a;
   }

   public cza(bjg $$0, djg.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, cmy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
