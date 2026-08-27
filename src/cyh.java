import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class cyh extends cvo implements ddg {
   protected static final MapCodec<List<ddg.a>> a = ddg.a.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<cyh> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(cyh::b), u()).apply($$0, cyh::new));
   protected static final float c = 3.0F;
   protected static final eks d = cvf.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final List<ddg.a> e;

   @Override
   public MapCodec<? extends cyh> a() {
      return b;
   }

   public cyh(bkg $$0, int $$1, dhm.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public cyh(List<ddg.a> $$0, dhm.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static List<ddg.a> a(bkg $$0, int $$1) {
      int $$2;
      if ($$0.a()) {
         $$2 = $$1;
      } else {
         $$2 = $$1 * 20;
      }

      return List.of(new ddg.a($$0, $$2));
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      ejz $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public List<ddg.a> b() {
      return this.e;
   }
}
