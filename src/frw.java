import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record frw(int b, int c) implements fsa {
   public static final MapCodec<frw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(azg.l.optionalFieldOf("index", 0).forGetter(frw::b), azg.i.fieldOf("default").forGetter(frw::c)).apply($$0, frw::new)
   );

   @Override
   public int a(dak $$0, @Nullable glo $$1, @Nullable byf $$2) {
      dct $$3 = $$0.a(kl.p);
      if ($$3 != null) {
         Integer $$4 = $$3.d(this.b);
         if ($$4 != null) {
            return ayh.f($$4);
         }
      }

      return ayh.f(this.c);
   }

   @Override
   public MapCodec<frw> a() {
      return a;
   }
}
