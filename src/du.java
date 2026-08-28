import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record du(de.d c) implements bv {
   public static final MapCodec<du> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(de.d.d.optionalFieldOf("size", de.d.c).forGetter(du::b)).apply($$0, du::new)
   );

   public static du a(de.d $$0) {
      return new du($$0);
   }

   @Override
   public boolean a(bss $$0, are $$1, @Nullable evp $$2) {
      return $$0 instanceof ckk $$3 ? this.c.d($$3.gr()) : false;
   }

   @Override
   public MapCodec<du> a() {
      return bw.d;
   }

   public de.d b() {
      return this.c;
   }
}
