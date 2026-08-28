import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlv extends djk {
   public static final MapCodec<dlv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(brn.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, dlv::new)
   );
   private final brn b;

   @Override
   public MapCodec<? extends dlv> a() {
      return a;
   }

   public dlv(brn $$0, dwu.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, cwn $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
