import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dik extends dfr implements dnk {
   protected static final MapCodec<cxg> a = cxg.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dik> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dik::b), u()).apply($$0, dik::new));
   protected static final float c = 3.0F;
   protected static final exa d = dfi.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final cxg e;

   @Override
   public MapCodec<? extends dik> a() {
      return b;
   }

   public dik(jj<brn> $$0, float $$1, dsk.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dik(cxg $$0, dsk.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static cxg a(jj<brn> $$0, float $$1) {
      return new cxg(List.of(new cxg.a($$0, ayg.d($$1 * 20.0F))));
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      ewh $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public cxg b() {
      return this.e;
   }
}
