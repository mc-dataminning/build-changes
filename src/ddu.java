import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddu(ddg d) implements ddq {
   public static final MapCodec<ddu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddg.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, ddu::new));

   @Override
   public void a(arc $$0, int $$1, dcy $$2, buk $$3, fba $$4) {
      $$3.d(this.d.a($$1));
   }

   @Override
   public MapCodec<ddu> a() {
      return a;
   }

   public ddg b() {
      return this.d;
   }
}
