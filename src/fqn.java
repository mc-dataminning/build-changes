import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fqn(int b) implements fqj {
   public static final MapCodec<fqn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.i.fieldOf("default").forGetter(fqn::b)).apply($$0, fqn::new));

   @Override
   public int a(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2) {
      if ($$2 != null) {
         ffx $$3 = $$2.cr();
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
   public MapCodec<fqn> a() {
      return a;
   }
}
