import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djb extends dja {
   public static final MapCodec<djb> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lp.e.q().fieldOf("host").forGetter(dja::b), u()).apply($$0, djb::new));

   @Override
   public MapCodec<djb> a() {
      return b;
   }

   public djb(dfb $$0, dsd.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(dln.i, je.a.b));
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return dln.b($$0, $$1);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(dln.i);
   }

   @Override
   public dse a(cyc $$0) {
      return this.o().a(dln.i, $$0.k().o());
   }
}
