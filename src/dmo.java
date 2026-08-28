import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dmo extends djv implements drs {
   protected static final MapCodec<czp> b = czp.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dmo> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dmo::c), t()).apply($$0, dmo::new));
   protected static final float d = 3.0F;
   protected static final fbt e = djl.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final czp a;

   @Override
   public MapCodec<? extends dmo> a() {
      return c;
   }

   public dmo(jr<btn> $$0, float $$1, dwv.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dmo(czp $$0, dwv.d $$1) {
      super($$1);
      this.a = $$0;
   }

   protected static czp a(jr<btn> $$0, float $$1) {
      return new czp(List.of(new czp.a($$0, ayz.d($$1 * 20.0F))));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      faz $$4 = $$0.a($$2);
      return e.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   public czp c() {
      return this.a;
   }

   @Nullable
   public btp b() {
      return null;
   }
}
