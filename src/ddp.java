import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddp(jg<awq> c) implements ddo {
   public static final MapCodec<ddp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(awq.b.fieldOf("sound").forGetter(ddp::b)).apply($$0, ddp::new));
   public static final za<wn, ddp> b = za.a(awq.d, ddp::b, ddp::new);

   @Override
   public ddo.a<ddp> a() {
      return ddo.a.e;
   }

   @Override
   public boolean a(djz $$0, daa $$1, bxw $$2) {
      $$0.a(null, $$2.dv(), this.c.a(), $$2.dm(), 1.0F, 1.0F);
      return true;
   }

   public jg<awq> b() {
      return this.c;
   }
}
