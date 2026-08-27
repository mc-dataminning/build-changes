import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cwi extends cua {
   public static final MapCodec<cwi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bhg.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, cwi::new)
   );
   private final bhg b;

   @Override
   public MapCodec<? extends cwi> a() {
      return a;
   }

   public cwi(bhg $$0, dga.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ckj $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
