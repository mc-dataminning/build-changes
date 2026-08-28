import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dlf extends din implements dqg {
   protected static final MapCodec<czc> a = czc.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dlf> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dlf::b), t()).apply($$0, dlf::new));
   protected static final float c = 3.0F;
   protected static final fah d = die.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final czc e;

   @Override
   public MapCodec<? extends dlf> a() {
      return b;
   }

   public dlf(jq<bth> $$0, float $$1, dvi.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dlf(czc $$0, dvi.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static czc a(jq<bth> $$0, float $$1) {
      return new czc(List.of(new czc.a($$0, azk.d($$1 * 20.0F))));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      ezn $$4 = $$0.a($$2);
      return d.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   public czc b() {
      return this.e;
   }
}
