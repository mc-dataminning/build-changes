import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhj extends dez {
   public static final MapCodec<dhj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpz.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, dhj::new)
   );
   private final bpz b;

   @Override
   public MapCodec<? extends dhj> a() {
      return a;
   }

   public dhj(bpz $$0, dsb.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, cup $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
