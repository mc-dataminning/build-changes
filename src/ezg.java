import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ezg(ezx b) implements ezb {
   public static final MapCodec<ezg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ezy.a.fieldOf("chance").forGetter(ezg::c)).apply($$0, ezg::new));

   @Override
   public ezc b() {
      return ezd.d;
   }

   public boolean a(evs $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static ezb.a a(float $$0) {
      return () -> new ezg(ezu.a($$0));
   }

   public static ezb.a a(ezx $$0) {
      return () -> new ezg($$0);
   }

   public ezx c() {
      return this.b;
   }
}
