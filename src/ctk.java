import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ctk(ji<erb> c) implements ctg {
   public static final MapCodec<ctk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jt.a(mg.be).fieldOf("structures").forGetter(ctk::b)).apply($$0, ctk::new));

   public boolean a(cti $$0) {
      return $$0.b().a().b().a($$0.a(), this.c).b();
   }

   @Override
   public MapCodec<ctk> a() {
      return a;
   }

   public ji<erb> b() {
      return this.c;
   }
}
