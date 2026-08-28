import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record deu(deo d) implements dey {
   public static final MapCodec<deu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(deo.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, deu::new));

   @Override
   public void a(arn $$0, int $$1, deg $$2, bvs $$3, fcu $$4) {
      cxy $$5 = $$2.a();
      if ($$5.c(kx.d) && $$5.c(kx.e)) {
         aro $$7 = $$2.c() instanceof aro $$6 ? $$6 : null;
         int $$8 = (int)this.d.a($$1);
         $$5.a($$8, $$0, $$7, $$2.d());
      }
   }

   @Override
   public MapCodec<deu> a() {
      return a;
   }

   public deo b() {
      return this.d;
   }
}
