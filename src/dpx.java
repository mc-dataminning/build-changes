import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dpx extends dwd implements dvd {
   protected static final MapCodec<dcp> b = dcp.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dpx> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dpx::c), t()).apply($$0, dpx::new));
   private static final ffw a = dmr.b(6.0, 0.0, 10.0);
   private final dcp d;

   @Override
   public MapCodec<? extends dpx> a() {
      return c;
   }

   public dpx(jf<bvk> $$0, float $$1, eas.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dpx(dcp $$0, eas.d $$1) {
      super($$1);
      this.d = $$0;
   }

   protected static dcp a(jf<bvk> $$0, float $$1) {
      return new dcp(List.of(new dcp.a($$0, azm.d($$1 * 20.0F))));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return a.a($$0.a($$2));
   }

   @Override
   public dcp c() {
      return this.d;
   }

   @Nullable
   public bvm b() {
      return null;
   }
}
