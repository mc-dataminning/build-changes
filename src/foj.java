import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record foj(int b, int c) implements fon {
   public static final MapCodec<foj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ays.l.optionalFieldOf("index", 0).forGetter(foj::b), ays.i.fieldOf("default").forGetter(foj::c)).apply($$0, foj::new)
   );

   @Override
   public int a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2) {
      daf $$3 = $$0.a(kx.p);
      if ($$3 != null) {
         Integer $$4 = $$3.d(this.b);
         if ($$4 != null) {
            return axu.f($$4);
         }
      }

      return axu.f(this.c);
   }

   @Override
   public MapCodec<foj> a() {
      return a;
   }
}
