import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dny extends dle implements dtc {
   protected static final MapCodec<daw> b = daw.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dny> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dny::c), t()).apply($$0, dny::new));
   private static final fdo a = dku.b(6.0, 0.0, 10.0);
   private final daw d;

   @Override
   public MapCodec<? extends dny> a() {
      return c;
   }

   public dny(js<buu> $$0, float $$1, dyl.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dny(daw $$0, dyl.d $$1) {
      super($$1);
      this.d = $$0;
   }

   protected static daw a(js<buu> $$0, float $$1) {
      return new daw(List.of(new daw.a($$0, azk.d($$1 * 20.0F))));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return a.a($$0.a($$2));
   }

   @Override
   public daw c() {
      return this.d;
   }

   @Nullable
   public buw b() {
      return null;
   }
}
