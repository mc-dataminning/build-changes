import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgd(dfx d) implements dgh {
   public static final MapCodec<dgd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfx.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, dgd::new));

   @Override
   public void a(arq $$0, int $$1, dfp $$2, bwf $$3, feq $$4) {
      czd $$5 = $$2.a();
      if ($$5.c(kj.d) && $$5.c(kj.e)) {
         arr $$7 = $$2.c() instanceof arr $$6 ? $$6 : null;
         int $$8 = (int)this.d.a($$1);
         $$5.a($$8, $$0, $$7, $$2.d());
      }
   }

   @Override
   public MapCodec<dgd> a() {
      return a;
   }

   public dfx b() {
      return this.d;
   }
}
