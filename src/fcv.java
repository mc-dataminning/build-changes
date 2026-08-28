import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fcv(fdm b) implements fcq {
   public static final MapCodec<fcv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fdn.a.fieldOf("chance").forGetter(fcv::c)).apply($$0, fcv::new));

   @Override
   public fcr b() {
      return fcs.d;
   }

   public boolean a(ezh $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static fcq.a a(float $$0) {
      return () -> new fcv(fdj.a($$0));
   }

   public static fcq.a a(fdm $$0) {
      return () -> new fcv($$0);
   }

   public fdm c() {
      return this.b;
   }
}
