import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dqk extends dwq implements dvq {
   protected static final MapCodec<ddc> b = ddc.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dqk> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dqk::c), t()).apply($$0, dqk::new));
   private static final fgm a = dne.b(6.0, 0.0, 10.0);
   private final ddc d;

   @Override
   public MapCodec<? extends dqk> a() {
      return c;
   }

   public dqk(jg<bvx> $$0, float $$1, ebf.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dqk(ddc $$0, ebf.d $$1) {
      super($$1);
      this.d = $$0;
   }

   protected static ddc a(jg<bvx> $$0, float $$1) {
      return new ddc(List.of(new ddc.a($$0, azq.d($$1 * 20.0F))));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return a.a($$0.a($$2));
   }

   @Override
   public ddc c() {
      return this.d;
   }

   @Nullable
   public bvz b() {
      return null;
   }
}
