import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dqi extends dwo implements dvo {
   protected static final MapCodec<dda> b = dda.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dqi> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dqi::c), t()).apply($$0, dqi::new));
   private static final fgk a = dnc.b(6.0, 0.0, 10.0);
   private final dda d;

   @Override
   public MapCodec<? extends dqi> a() {
      return c;
   }

   public dqi(jf<bvv> $$0, float $$1, ebd.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dqi(dda $$0, ebd.d $$1) {
      super($$1);
      this.d = $$0;
   }

   protected static dda a(jf<bvv> $$0, float $$1) {
      return new dda(List.of(new dda.a($$0, azo.d($$1 * 20.0F))));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return a.a($$0.a($$2));
   }

   @Override
   public dda c() {
      return this.d;
   }

   @Nullable
   public bvx b() {
      return null;
   }
}
