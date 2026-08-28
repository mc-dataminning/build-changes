import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ezw(fan b) implements ezr {
   public static final MapCodec<ezw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fao.a.fieldOf("chance").forGetter(ezw::c)).apply($$0, ezw::new));

   @Override
   public ezs b() {
      return ezt.d;
   }

   public boolean a(ewi $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static ezr.a a(float $$0) {
      return () -> new ezw(fak.a($$0));
   }

   public static ezr.a a(fan $$0) {
      return () -> new ezw($$0);
   }

   public fan c() {
      return this.b;
   }
}
