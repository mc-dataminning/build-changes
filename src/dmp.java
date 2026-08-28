import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmp extends dke {
   public static final MapCodec<dmp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bsd.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, dmp::new)
   );
   private final bsd b;

   @Override
   public MapCodec<? extends dmp> a() {
      return a;
   }

   public dmp(bsd $$0, dxp.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, cxh $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
