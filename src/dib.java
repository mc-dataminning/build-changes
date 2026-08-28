import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dib extends dfi implements dnb {
   protected static final MapCodec<cxt> a = cxt.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dib> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dib::b), u()).apply($$0, dib::new));
   protected static final float c = 3.0F;
   protected static final ewk d = dez.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final cxt e;

   @Override
   public MapCodec<? extends dib> a() {
      return b;
   }

   public dib(ji<bsa> $$0, float $$1, dsb.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dib(cxt $$0, dsb.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static cxt a(ji<bsa> $$0, float $$1) {
      return new cxt(List.of(new cxt.a($$0, ayz.d($$1 * 20.0F))));
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      evr $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public cxt b() {
      return this.e;
   }
}
