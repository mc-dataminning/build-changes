import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dde extends ddd {
   public static final MapCodec<dde> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kh.e.q().fieldOf("host").forGetter(ddd::b), u()).apply($$0, dde::new));

   @Override
   public MapCodec<dde> a() {
      return b;
   }

   public dde(czf $$0, dmd.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(dfq.i, ih.a.b));
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return dfq.b($$0, $$1);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(dfq.i);
   }

   @Override
   public dme a(crx $$0) {
      return this.o().a(dfq.i, $$0.k().o());
   }
}
