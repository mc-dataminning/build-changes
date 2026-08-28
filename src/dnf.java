import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnf extends dku {
   public static final MapCodec<dnf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bsv.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, dnf::new)
   );
   private final bsv b;

   @Override
   public MapCodec<? extends dnf> a() {
      return a;
   }

   public dnf(bsv $$0, dyl.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, cxy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
