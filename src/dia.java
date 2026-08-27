import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dia extends dhz {
   public static final MapCodec<dia> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(le.e.q().fieldOf("host").forGetter(dhz::b), u()).apply($$0, dia::new));

   @Override
   public MapCodec<dia> a() {
      return b;
   }

   public dia(dea $$0, drc.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(dkm.i, it.a.b));
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return dkm.b($$0, $$1);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(dkm.i);
   }

   @Override
   public drd a(cxb $$0) {
      return this.n().a(dkm.i, $$0.k().o());
   }
}
