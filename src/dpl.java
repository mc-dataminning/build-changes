import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dpl extends dvr implements dur {
   protected static final MapCodec<dcf> b = dcf.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dpl> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dpl::c), t()).apply($$0, dpl::new));
   private static final ffk a = dmf.b(6.0, 0.0, 10.0);
   private final dcf d;

   @Override
   public MapCodec<? extends dpl> a() {
      return c;
   }

   public dpl(je<bvh> $$0, float $$1, eag.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dpl(dcf $$0, eag.d $$1) {
      super($$1);
      this.d = $$0;
   }

   protected static dcf a(je<bvh> $$0, float $$1) {
      return new dcf(List.of(new dcf.a($$0, azm.d($$1 * 20.0F))));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return a.a($$0.a($$2));
   }

   @Override
   public dcf c() {
      return this.d;
   }

   @Nullable
   public bvj b() {
      return null;
   }
}
