import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record dv(de.d c) implements bv {
   public static final MapCodec<dv> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(de.d.d.optionalFieldOf("size", de.d.c).forGetter(dv::b)).apply($$0, dv::new)
   );

   public static dv a(de.d $$0) {
      return new dv($$0);
   }

   @Override
   public boolean a(bsh $$0, aqm $$1, @Nullable ewh $$2) {
      return $$0 instanceof cka $$3 ? this.c.d($$3.go()) : false;
   }

   @Override
   public MapCodec<dv> a() {
      return bw.d;
   }

   public de.d b() {
      return this.c;
   }
}
