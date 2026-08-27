import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dii extends dfl implements dnt {
   protected static final MapCodec<cxv> a = cxv.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dii> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dii::getSuspiciousEffects), u()).apply($$0, dii::new));
   protected static final float c = 3.0F;
   protected static final exn d = dfc.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final cxv g;

   @Override
   public MapCodec<? extends dii> a() {
      return b;
   }

   public dii(ja<brf> $$0, float $$1, dtb.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dii(cxv $$0, dtb.d $$1) {
      super($$1);
      this.g = $$0;
   }

   protected static cxv a(ja<brf> $$0, float $$1) {
      return new cxv(List.of(new cxv.a($$0, aym.d($$1 * 20.0F))));
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      ewu $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public cxv getSuspiciousEffects() {
      return this.g;
   }
}
