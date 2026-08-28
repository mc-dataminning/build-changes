import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fmq(int b, int c) implements fmu {
   public static final MapCodec<fmq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayi.l.optionalFieldOf("index", 0).forGetter(fmq::b), ayi.i.fieldOf("default").forGetter(fmq::c)).apply($$0, fmq::new)
   );

   @Override
   public int a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2) {
      cza $$3 = $$0.a(kv.p);
      if ($$3 != null) {
         Integer $$4 = $$3.d(this.b);
         if ($$4 != null) {
            return axk.f($$4);
         }
      }

      return axk.f(this.c);
   }

   @Override
   public MapCodec<fmq> a() {
      return a;
   }
}
