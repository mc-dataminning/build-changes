import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fqg(int b) implements fqc {
   public static final MapCodec<fqg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.i.fieldOf("default").forGetter(fqg::b)).apply($$0, fqg::new));

   @Override
   public int a(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2) {
      if ($$2 != null) {
         ffp $$3 = $$2.cr();
         if ($$3 != null) {
            n $$4 = $$3.o();
            if ($$4.f() != null) {
               return axw.f($$4.f());
            }
         }
      }

      return axw.f(this.b);
   }

   @Override
   public MapCodec<fqg> a() {
      return a;
   }
}
