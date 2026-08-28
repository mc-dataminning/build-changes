import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmq extends dke {
   public static final MapCodec<dmq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bsj.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, dmq::new)
   );
   private final bsj b;

   @Override
   public MapCodec<? extends dmq> a() {
      return a;
   }

   public dmq(bsj $$0, dxm.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, cxk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
