import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class cwc extends ctl implements dbc {
   protected static final MapCodec<List<dbc.a>> a = dbc.a.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<cwc> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(cwc::b), t()).apply($$0, cwc::new));
   protected static final float c = 3.0F;
   protected static final eia d = ctc.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final List<dbc.a> e;

   @Override
   public MapCodec<? extends cwc> a() {
      return b;
   }

   public cwc(bih $$0, int $$1, dfc.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public cwc(List<dbc.a> $$0, dfc.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static List<dbc.a> a(bih $$0, int $$1) {
      int $$2;
      if ($$0.a()) {
         $$2 = $$1;
      } else {
         $$2 = $$1 * 20;
      }

      return List.of(new dbc.a($$0, $$2));
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      ehh $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public List<dbc.a> b() {
      return this.e;
   }
}
