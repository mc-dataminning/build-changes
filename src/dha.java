import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dha(dgu d) implements dhe {
   public static final MapCodec<dha> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgu.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, dha::new));

   @Override
   public void a(aru $$0, int $$1, dgm $$2, bwv $$3, ffs $$4) {
      daa $$5 = $$2.a();
      if ($$5.c(kl.d) && $$5.c(kl.e)) {
         arv $$7 = $$2.c() instanceof arv $$6 ? $$6 : null;
         int $$8 = (int)this.d.a($$1);
         $$5.a($$8, $$0, $$7, $$2.d());
      }
   }

   @Override
   public MapCodec<dha> a() {
      return a;
   }

   public dgu b() {
      return this.d;
   }
}
