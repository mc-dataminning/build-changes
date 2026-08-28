import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqk extends dqj {
   public static final MapCodec<dqk> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mf.e.q().fieldOf("host").forGetter(dqj::b), t()).apply($$0, dqk::new));

   @Override
   public MapCodec<dqk> a() {
      return b;
   }

   public dqk(dmf $$0, eag.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(dsy.d, ja.a.b));
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return dsy.b($$0, $$1);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(dsy.d);
   }

   @Override
   public eah a(dcw $$0) {
      return this.m().b(dsy.d, $$0.k().o());
   }
}
