import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fqf(int b) implements fqc {
   public static final MapCodec<fqf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.i.fieldOf("default").forGetter(fqf::b)).apply($$0, fqf::new));

   public fqf() {
      this(-13083194);
   }

   @Override
   public int a(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2) {
      dau $$3 = $$0.a(kj.R);
      return $$3 != null ? axw.f($$3.a(this.b)) : axw.f(this.b);
   }

   @Override
   public MapCodec<fqf> a() {
      return a;
   }
}
