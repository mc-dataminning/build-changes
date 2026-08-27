import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyj extends cvz {
   public static final MapCodec<cyj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(biq.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, cyj::new)
   );
   private final biq b;

   @Override
   public MapCodec<? extends cyj> a() {
      return a;
   }

   public cyj(biq $$0, dio.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, cmh $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
