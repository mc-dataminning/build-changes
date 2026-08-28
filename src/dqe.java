import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqe extends dqd {
   public static final MapCodec<dqe> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mf.e.q().fieldOf("host").forGetter(dqd::b), t()).apply($$0, dqe::new));

   @Override
   public MapCodec<dqe> a() {
      return b;
   }

   public dqe(dma $$0, dzy.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(dss.d, ja.a.b));
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return dss.b($$0, $$1);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(dss.d);
   }

   @Override
   public dzz a(dcr $$0) {
      return this.m().b(dss.d, $$0.k().o());
   }
}
