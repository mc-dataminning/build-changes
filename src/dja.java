import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dja extends dgh implements dob {
   protected static final MapCodec<cxw> a = cxw.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dja> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dja::b), u()).apply($$0, dja::new));
   protected static final float c = 3.0F;
   protected static final exv d = dfy.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final cxw e;

   @Override
   public MapCodec<? extends dja> a() {
      return b;
   }

   public dja(jm<brx> $$0, float $$1, dtb.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dja(cxw $$0, dtb.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static cxw a(jm<brx> $$0, float $$1) {
      return new cxw(List.of(new cxw.a($$0, ayo.d($$1 * 20.0F))));
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      exc $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public cxw b() {
      return this.e;
   }
}
