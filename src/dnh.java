import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dnh extends dko implements dsj {
   protected static final MapCodec<dal> a = dal.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dnh> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dnh::b), t()).apply($$0, dnh::new));
   protected static final float c = 3.0F;
   protected static final fcm d = dke.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final dal e;

   @Override
   public MapCodec<? extends dnh> a() {
      return b;
   }

   public dnh(jq<bui> $$0, float $$1, dxm.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dnh(dal $$0, dxm.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static dal a(jq<bui> $$0, float $$1) {
      return new dal(List.of(new dal.a($$0, bae.d($$1 * 20.0F))));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      fbs $$4 = $$0.a($$2);
      return d.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   public dal b() {
      return this.e;
   }
}
