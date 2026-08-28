import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dqu extends dxa implements dwa {
   protected static final MapCodec<ddm> b = ddm.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dqu> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dqu::c), t()).apply($$0, dqu::new));
   private static final fgw a = dno.b(6.0, 0.0, 10.0);
   private final ddm d;

   @Override
   public MapCodec<? extends dqu> a() {
      return c;
   }

   public dqu(jg<bwg> $$0, float $$1, ebp.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dqu(ddm $$0, ebp.d $$1) {
      super($$1);
      this.d = $$0;
   }

   protected static ddm a(jg<bwg> $$0, float $$1) {
      return new ddm(List.of(new ddm.a($$0, azz.d($$1 * 20.0F))));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return a.a($$0.a($$2));
   }

   @Override
   public ddm c() {
      return this.d;
   }

   @Nullable
   public bwi b() {
      return null;
   }
}
