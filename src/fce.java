import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fce extends fbg {
   public static final MapCodec<fce> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(dbh.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, fce::new));
   private final jf<dbh> b;

   private fce(List<fdc> $$0, jf<dbh> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fbi<fce> b() {
      return fbj.F;
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      $$0.a(kk.R, dbj.a, this.b, dbj::b);
      return $$0;
   }

   public static fbg.a<?> a(jf<dbh> $$0) {
      return a($$1 -> new fce($$1, $$0));
   }
}
