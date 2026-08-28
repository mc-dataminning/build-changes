import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhk(dhe d) implements dho {
   public static final MapCodec<dhk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dhe.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, dhk::new));

   @Override
   public void a(asb $$0, int $$1, dgw $$2, bxe $$3, fgc $$4) {
      dak $$5 = $$2.a();
      if ($$5.c(kl.d) && $$5.c(kl.e)) {
         asc $$7 = $$2.c() instanceof asc $$6 ? $$6 : null;
         int $$8 = (int)this.d.a($$1);
         $$5.a($$8, $$0, $$7, $$2.d());
      }
   }

   @Override
   public MapCodec<dhk> a() {
      return a;
   }

   public dhe b() {
      return this.d;
   }
}
