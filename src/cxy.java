import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cxy extends cxx {
   public static final MapCodec<cxy> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jy.f.q().fieldOf("host").forGetter(cxx::b), t()).apply($$0, cxy::new));

   @Override
   public MapCodec<cxy> a() {
      return b;
   }

   public cxy(cua $$0, dga.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(dak.i, hx.a.b));
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return dak.b($$0, $$1);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(dak.i);
   }

   @Override
   public dgb a(cmr $$0) {
      return this.o().a(dak.i, $$0.k().o());
   }
}
