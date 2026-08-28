import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dhz extends dfg implements dmz {
   protected static final MapCodec<cxr> a = cxr.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dhz> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dhz::b), u()).apply($$0, dhz::new));
   protected static final float c = 3.0F;
   protected static final ewi d = dex.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final cxr e;

   @Override
   public MapCodec<? extends dhz> a() {
      return b;
   }

   public dhz(ji<bry> $$0, float $$1, drz.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dhz(cxr $$0, drz.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static cxr a(ji<bry> $$0, float $$1) {
      return new cxr(List.of(new cxr.a($$0, ayx.d($$1 * 20.0F))));
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      evp $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public cxr b() {
      return this.e;
   }
}
