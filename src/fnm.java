import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fnm(int b, int c) implements fnq {
   public static final MapCodec<fnm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayi.l.optionalFieldOf("index", 0).forGetter(fnm::b), ayi.i.fieldOf("default").forGetter(fnm::c)).apply($$0, fnm::new)
   );

   @Override
   public int a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2) {
      czp $$3 = $$0.a(kv.p);
      if ($$3 != null) {
         Integer $$4 = $$3.d(this.b);
         if ($$4 != null) {
            return axk.f($$4);
         }
      }

      return axk.f(this.c);
   }

   @Override
   public MapCodec<fnm> a() {
      return a;
   }
}
