import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dng extends dkn implements dsk {
   protected static final MapCodec<dah> b = dah.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dng> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dng::c), t()).apply($$0, dng::new));
   protected static final float d = 3.0F;
   protected static final fcl e = dkd.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final dah a;

   @Override
   public MapCodec<? extends dng> a() {
      return c;
   }

   public dng(jq<bue> $$0, float $$1, dxn.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dng(dah $$0, dxn.d $$1) {
      super($$1);
      this.a = $$0;
   }

   protected static dah a(jq<bue> $$0, float $$1) {
      return new dah(List.of(new dah.a($$0, azu.d($$1 * 20.0F))));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      fbr $$4 = $$0.a($$2);
      return e.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   public dah c() {
      return this.a;
   }

   @Nullable
   public bug b() {
      return null;
   }
}
