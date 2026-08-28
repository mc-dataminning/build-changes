import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpp extends dne {
   public static final MapCodec<dpp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bty.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, dpp::new)
   );
   private final bty b;

   @Override
   public MapCodec<? extends dpp> a() {
      return a;
   }

   public dpp(bty $$0, ebf.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, daa $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
