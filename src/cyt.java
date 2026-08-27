import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyt extends cwj {
   public static final MapCodec<cyt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bja.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, cyt::new)
   );
   private final bja b;

   @Override
   public MapCodec<? extends cyt> a() {
      return a;
   }

   public cyt(bja $$0, diz.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, cmr $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
