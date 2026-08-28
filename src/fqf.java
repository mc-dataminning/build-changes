import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fqf(int b, int c) implements fqj {
   public static final MapCodec<fqf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayu.l.optionalFieldOf("index", 0).forGetter(fqf::b), ayu.i.fieldOf("default").forGetter(fqf::c)).apply($$0, fqf::new)
   );

   @Override
   public int a(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2) {
      dbm $$3 = $$0.a(kj.p);
      if ($$3 != null) {
         Integer $$4 = $$3.d(this.b);
         if ($$4 != null) {
            return axw.f($$4);
         }
      }

      return axw.f(this.c);
   }

   @Override
   public MapCodec<fqf> a() {
      return a;
   }
}
