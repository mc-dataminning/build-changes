import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ctf(ji<eqt> c) implements ctb {
   public static final MapCodec<ctf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jt.a(mg.bd).fieldOf("structures").forGetter(ctf::b)).apply($$0, ctf::new));

   public boolean a(ctd $$0) {
      return $$0.b().a().b().a($$0.a(), this.c).b();
   }

   @Override
   public MapCodec<ctf> a() {
      return a;
   }

   public ji<eqt> b() {
      return this.c;
   }
}
