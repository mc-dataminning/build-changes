import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class csh extends crs {
   public static final MapCodec<csh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(chz.q.fieldOf("color").forGetter(crs::b), t()).apply($$0, csh::new));
   public static final dgd b = dft.ba;
   private static final Map<chz, ctc> c = Maps.newHashMap();
   private static final eia d = ctc.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<csh> a() {
      return a;
   }

   public csh(chz $$0, dfc.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return d;
   }

   @Override
   public dfd a(clt $$0) {
      return this.o().a(b, Integer.valueOf(dgj.a($$0.i() + 180.0F)));
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return $$1 == ha.a && !$$0.a($$3, $$4) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b);
   }

   public static ctc a(chz $$0) {
      return c.getOrDefault($$0, cte.iJ);
   }
}
