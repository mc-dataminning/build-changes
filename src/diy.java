import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class diy extends dgf implements dnz {
   protected static final MapCodec<cxu> a = cxu.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<diy> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(diy::b), u()).apply($$0, diy::new));
   protected static final float c = 3.0F;
   protected static final exp d = dfw.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final cxu e;

   @Override
   public MapCodec<? extends diy> a() {
      return b;
   }

   public diy(jm<brw> $$0, float $$1, dsz.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public diy(cxu $$0, dsz.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static cxu a(jm<brw> $$0, float $$1) {
      return new cxu(List.of(new cxu.a($$0, ayn.d($$1 * 20.0F))));
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      eww $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public cxu b() {
      return this.e;
   }
}
