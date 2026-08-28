import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fpy(int b, int c) implements fqc {
   public static final MapCodec<fpy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayu.l.optionalFieldOf("index", 0).forGetter(fpy::b), ayu.i.fieldOf("default").forGetter(fpy::c)).apply($$0, fpy::new)
   );

   @Override
   public int a(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2) {
      dbh $$3 = $$0.a(kj.p);
      if ($$3 != null) {
         Integer $$4 = $$3.d(this.b);
         if ($$4 != null) {
            return axw.f($$4);
         }
      }

      return axw.f(this.c);
   }

   @Override
   public MapCodec<fpy> a() {
      return a;
   }
}
