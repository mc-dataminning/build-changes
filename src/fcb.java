import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fcb(fcs b) implements fbw {
   public static final MapCodec<fcb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fct.a.fieldOf("chance").forGetter(fcb::c)).apply($$0, fcb::new));

   @Override
   public fbx b() {
      return fby.d;
   }

   public boolean a(eyn $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static fbw.a a(float $$0) {
      return () -> new fcb(fcp.a($$0));
   }

   public static fbw.a a(fcs $$0) {
      return () -> new fcb($$0);
   }

   public fcs c() {
      return this.b;
   }
}
