import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dbq extends cyx implements dgp {
   protected static final MapCodec<List<dgp.a>> a = dgp.a.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dbq> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dbq::b), u()).apply($$0, dbq::new));
   protected static final float c = 3.0F;
   protected static final eol d = cyo.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final List<dgp.a> e;

   @Override
   public MapCodec<? extends dbq> a() {
      return b;
   }

   public dbq(ij<bmz> $$0, int $$1, dle.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dbq(List<dgp.a> $$0, dle.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static List<dgp.a> a(ij<bmz> $$0, int $$1) {
      return List.of(new dgp.a($$0, $$1 * 20));
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      ens $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public List<dgp.a> b() {
      return this.e;
   }
}
