import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fqm(int b) implements fqj {
   public static final MapCodec<fqm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.i.fieldOf("default").forGetter(fqm::b)).apply($$0, fqm::new));

   public fqm() {
      this(-13083194);
   }

   @Override
   public int a(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2) {
      daz $$3 = $$0.a(kj.R);
      return $$3 != null ? axw.f($$3.a(this.b)) : axw.f(this.b);
   }

   @Override
   public MapCodec<fqm> a() {
      return a;
   }
}
