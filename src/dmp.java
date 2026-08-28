import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dmp extends djw implements drt {
   protected static final MapCodec<czq> b = czq.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dmp> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dmp::c), t()).apply($$0, dmp::new));
   protected static final float d = 3.0F;
   protected static final fbu e = djm.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final czq a;

   @Override
   public MapCodec<? extends dmp> a() {
      return c;
   }

   public dmp(jr<btn> $$0, float $$1, dww.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dmp(czq $$0, dww.d $$1) {
      super($$1);
      this.a = $$0;
   }

   protected static czq a(jr<btn> $$0, float $$1) {
      return new czq(List.of(new czq.a($$0, ayz.d($$1 * 20.0F))));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      fba $$4 = $$0.a($$2);
      return e.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   public czq c() {
      return this.a;
   }

   @Nullable
   public btp b() {
      return null;
   }
}
