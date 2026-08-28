import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlw extends djl {
   public static final MapCodec<dlw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bro.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, dlw::new)
   );
   private final bro b;

   @Override
   public MapCodec<? extends dlw> a() {
      return a;
   }

   public dlw(bro $$0, dwv.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, cwo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
