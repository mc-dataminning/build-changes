import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fql(int b) implements fqj {
   public static final MapCodec<fql> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.i.fieldOf("default").forGetter(fql::b)).apply($$0, fql::new));

   public fql() {
      this(dbz.c.a());
   }

   @Override
   public int a(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2) {
      dbz $$3 = $$0.a(kj.L);
      return $$3 != null ? axw.f($$3.a()) : axw.f(this.b);
   }

   @Override
   public MapCodec<fql> a() {
      return a;
   }
}
