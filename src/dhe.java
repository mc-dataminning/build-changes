import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhe extends dhd {
   public static final MapCodec<dhe> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ld.e.q().fieldOf("host").forGetter(dhd::b), u()).apply($$0, dhe::new));

   @Override
   public MapCodec<dhe> a() {
      return b;
   }

   public dhe(dde $$0, dqg.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(djq.i, is.a.b));
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return djq.b($$0, $$1);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(djq.i);
   }

   @Override
   public dqh a(cwi $$0) {
      return this.n().a(djq.i, $$0.k().o());
   }
}
