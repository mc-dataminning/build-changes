import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class did extends dfk implements dnd {
   protected static final MapCodec<cxv> a = cxv.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<did> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(did::b), u()).apply($$0, did::new));
   protected static final float c = 3.0F;
   protected static final ewm d = dfb.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final cxv e;

   @Override
   public MapCodec<? extends did> a() {
      return b;
   }

   public did(ji<bsc> $$0, float $$1, dsd.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public did(cxv $$0, dsd.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static cxv a(ji<bsc> $$0, float $$1) {
      return new cxv(List.of(new cxv.a($$0, ayz.d($$1 * 20.0F))));
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      evt $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public cxv b() {
      return this.e;
   }
}
