import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record csz(ji<eqi> c) implements csv {
   public static final MapCodec<csz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jt.a(mg.bc).fieldOf("structures").forGetter(csz::b)).apply($$0, csz::new));

   public boolean a(csx $$0) {
      return $$0.b().a().b().a($$0.a(), this.c).b();
   }

   @Override
   public MapCodec<csz> a() {
      return a;
   }

   public ji<eqi> b() {
      return this.c;
   }
}
