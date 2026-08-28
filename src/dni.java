import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dni extends dko implements dsm {
   protected static final MapCodec<dag> b = dag.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dni> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dni::c), t()).apply($$0, dni::new));
   private static final fcr a = dke.b(6.0, 0.0, 10.0);
   private final dag d;

   @Override
   public MapCodec<? extends dni> a() {
      return c;
   }

   public dni(jr<buc> $$0, float $$1, dxp.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dni(dag $$0, dxp.d $$1) {
      super($$1);
      this.d = $$0;
   }

   protected static dag a(jr<buc> $$0, float $$1) {
      return new dag(List.of(new dag.a($$0, ayz.d($$1 * 20.0F))));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return a.a($$0.a($$2));
   }

   @Override
   public dag c() {
      return this.d;
   }

   @Nullable
   public bue b() {
      return null;
   }
}
