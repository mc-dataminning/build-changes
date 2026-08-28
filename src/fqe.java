import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fqe(int b) implements fqc {
   public static final MapCodec<fqe> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.i.fieldOf("default").forGetter(fqe::b)).apply($$0, fqe::new));

   public fqe() {
      this(dbu.c.a());
   }

   @Override
   public int a(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2) {
      dbu $$3 = $$0.a(kj.L);
      return $$3 != null ? axw.f($$3.a()) : axw.f(this.b);
   }

   @Override
   public MapCodec<fqe> a() {
      return a;
   }
}
