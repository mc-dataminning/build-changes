import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnm extends dnl {
   public static final MapCodec<dnm> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mb.e.q().fieldOf("host").forGetter(dnl::b), t()).apply($$0, dnm::new));

   @Override
   public MapCodec<dnm> a() {
      return b;
   }

   public dnm(djk $$0, dwu.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(dqb.i, jn.a.b));
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return dqb.b($$0, $$1);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(dqb.i);
   }

   @Override
   public dwv a(dae $$0) {
      return this.m().b(dqb.i, $$0.k().o());
   }
}
