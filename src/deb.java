import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class deb extends dea {
   public static final MapCodec<deb> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ki.e.q().fieldOf("host").forGetter(dea::b), u()).apply($$0, deb::new));

   @Override
   public MapCodec<deb> a() {
      return b;
   }

   public deb(dac $$0, dna.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(dgn.i, ih.a.b));
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return dgn.b($$0, $$1);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(dgn.i);
   }

   @Override
   public dnb a(csu $$0) {
      return this.o().a(dgn.i, $$0.k().o());
   }
}
