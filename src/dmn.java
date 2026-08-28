import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dmn extends dju implements drr {
   protected static final MapCodec<czo> b = czo.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dmn> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dmn::c), t()).apply($$0, dmn::new));
   protected static final float d = 3.0F;
   protected static final fbs e = djk.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final czo a;

   @Override
   public MapCodec<? extends dmn> a() {
      return c;
   }

   public dmn(jr<btm> $$0, float $$1, dwu.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dmn(czo $$0, dwu.d $$1) {
      super($$1);
      this.a = $$0;
   }

   protected static czo a(jr<btm> $$0, float $$1) {
      return new czo(List.of(new czo.a($$0, ayy.d($$1 * 20.0F))));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      fay $$4 = $$0.a($$2);
      return e.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   public czo c() {
      return this.a;
   }

   @Nullable
   public bto b() {
      return null;
   }
}
