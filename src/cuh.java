import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cuh(jk<esd> c) implements cud {
   public static final MapCodec<cuh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jv.a(mi.be).fieldOf("structures").forGetter(cuh::b)).apply($$0, cuh::new));

   public boolean a(cuf $$0) {
      return $$0.b().a().b().a($$0.a(), this.c).b();
   }

   @Override
   public MapCodec<cuh> a() {
      return a;
   }

   public jk<esd> b() {
      return this.c;
   }
}
