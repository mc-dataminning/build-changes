import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlx extends djm {
   public static final MapCodec<dlx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bro.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, dlx::new)
   );
   private final bro b;

   @Override
   public MapCodec<? extends dlx> a() {
      return a;
   }

   public dlx(bro $$0, dww.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, cwp $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
