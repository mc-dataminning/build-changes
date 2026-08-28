import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpz extends dno {
   public static final MapCodec<dpz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(buh.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, dpz::new)
   );
   private final buh b;

   @Override
   public MapCodec<? extends dpz> a() {
      return a;
   }

   public dpz(buh $$0, ebp.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, dak $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
