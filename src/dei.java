import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dei extends dby {
   public static final MapCodec<dei> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bnf.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, dei::new)
   );
   private final bnf b;

   @Override
   public MapCodec<? extends dei> a() {
      return a;
   }

   public dei(bnf $$0, doy.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, crj $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
