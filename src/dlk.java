import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dlk extends dis implements dql {
   protected static final MapCodec<czg> a = czg.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dlk> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dlk::b), t()).apply($$0, dlk::new));
   protected static final float c = 3.0F;
   protected static final fal d = dij.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final czg e;

   @Override
   public MapCodec<? extends dlk> a() {
      return b;
   }

   public dlk(jq<btl> $$0, float $$1, dvn.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dlk(czg $$0, dvn.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static czg a(jq<btl> $$0, float $$1) {
      return new czg(List.of(new czg.a($$0, azn.d($$1 * 20.0F))));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      ezr $$4 = $$0.a($$2);
      return d.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   public czg b() {
      return this.e;
   }
}
