import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqr extends dqq {
   public static final MapCodec<dqr> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mg.e.q().fieldOf("host").forGetter(dqq::b), t()).apply($$0, dqr::new));

   @Override
   public MapCodec<dqr> a() {
      return b;
   }

   public dqr(dmm $$0, ean.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(dtf.d, jb.a.b));
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return dtf.b($$0, $$1);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(dtf.d);
   }

   @Override
   public eao a(ddd $$0) {
      return this.m().b(dtf.d, $$0.k().o());
   }
}
