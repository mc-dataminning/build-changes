import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fsl(int b, int c) implements fsp {
   public static final MapCodec<fsl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayy.l.optionalFieldOf("index", 0).forGetter(fsl::b), ayy.i.fieldOf("default").forGetter(fsl::c)).apply($$0, fsl::new)
   );

   @Override
   public int a(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2) {
      dcj $$3 = $$0.a(kl.p);
      if ($$3 != null) {
         Integer $$4 = $$3.d(this.b);
         if ($$4 != null) {
            return aya.f($$4);
         }
      }

      return aya.f(this.c);
   }

   @Override
   public MapCodec<fsl> a() {
      return a;
   }
}
