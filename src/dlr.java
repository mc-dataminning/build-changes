import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dlr extends diz implements dqs {
   protected static final MapCodec<czn> a = czn.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dlr> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dlr::b), t()).apply($$0, dlr::new));
   protected static final float c = 3.0F;
   protected static final fas d = diq.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final czn e;

   @Override
   public MapCodec<? extends dlr> a() {
      return b;
   }

   public dlr(jq<bto> $$0, float $$1, dvu.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dlr(czn $$0, dvu.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static czn a(jq<bto> $$0, float $$1) {
      return new czn(List.of(new czn.a($$0, azm.d($$1 * 20.0F))));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      ezy $$4 = $$0.a($$2);
      return d.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   public czn b() {
      return this.e;
   }
}
