import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhe extends deu {
   public static final MapCodec<dhe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpu.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, dhe::new)
   );
   private final bpu b;

   @Override
   public MapCodec<? extends dhe> a() {
      return a;
   }

   public dhe(bpu $$0, drw.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, cuk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
