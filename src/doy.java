import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class doy extends dme implements duc {
   protected static final MapCodec<dbu> b = dbu.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<doy> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(doy::c), t()).apply($$0, doy::new));
   private static final feq a = dlu.b(6.0, 0.0, 10.0);
   private final dbu d;

   @Override
   public MapCodec<? extends doy> a() {
      return c;
   }

   public doy(je<bvc> $$0, float $$1, dzn.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public doy(dbu $$0, dzn.d $$1) {
      super($$1);
      this.d = $$0;
   }

   protected static dbu a(je<bvc> $$0, float $$1) {
      return new dbu(List.of(new dbu.a($$0, azk.d($$1 * 20.0F))));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return a.a($$0.a($$2));
   }

   @Override
   public dbu c() {
      return this.d;
   }

   @Nullable
   public bve b() {
      return null;
   }
}
