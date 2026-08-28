import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dko extends dhv implements dpp {
   protected static final MapCodec<cyx> a = cyx.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dko> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dko::b), t()).apply($$0, dko::new));
   protected static final float c = 3.0F;
   protected static final ezq d = dhm.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final cyx e;

   @Override
   public MapCodec<? extends dko> a() {
      return b;
   }

   public dko(jo<bsw> $$0, float $$1, dur.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dko(cyx $$0, dur.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static cyx a(jo<bsw> $$0, float $$1) {
      return new cyx(List.of(new cyx.a($$0, azf.d($$1 * 20.0F))));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      eyw $$4 = $$0.a($$2);
      return d.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   public cyx b() {
      return this.e;
   }
}
