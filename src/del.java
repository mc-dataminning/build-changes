import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record del(ddx d) implements deh {
   public static final MapCodec<del> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddx.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, del::new));

   @Override
   public void a(arx $$0, int $$1, ddp $$2, bvb $$3, fbr $$4) {
      $$3.d(this.d.a($$1));
   }

   @Override
   public MapCodec<del> a() {
      return a;
   }

   public ddx b() {
      return this.d;
   }
}
