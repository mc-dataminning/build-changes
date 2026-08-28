import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dij extends dfq implements dnj {
   protected static final MapCodec<cxf> a = cxf.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dij> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dij::b), u()).apply($$0, dij::new));
   protected static final float c = 3.0F;
   protected static final ewy d = dfh.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final cxf e;

   @Override
   public MapCodec<? extends dij> a() {
      return b;
   }

   public dij(jj<brm> $$0, float $$1, dsj.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dij(cxf $$0, dsj.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static cxf a(jj<brm> $$0, float $$1) {
      return new cxf(List.of(new cxf.a($$0, ayg.d($$1 * 20.0F))));
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      ewf $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public cxf b() {
      return this.e;
   }
}
