import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcf(dbr d) implements dcb {
   public static final MapCodec<dcf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbr.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, dcf::new));

   @Override
   public void a(arh $$0, int $$1, dbj $$2, bto $$3, eys $$4) {
      $$3.d(this.d.a($$1));
   }

   @Override
   public MapCodec<dcf> a() {
      return a;
   }

   public dbr b() {
      return this.d;
   }
}
