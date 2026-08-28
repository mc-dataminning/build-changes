import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fcd extends fbg {
   static final MapCodec<fcd> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(fdz.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, fcd::new));
   private final fdy b;

   private fcd(List<fdc> $$0, fdy $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.a();
   }

   @Override
   public fbi<fcd> b() {
      return fbj.Q;
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      int $$2 = azm.a(this.b.a($$1), 0, 4);
      $$0.b(kk.ad, new dcl($$2));
      return $$0;
   }

   public fdy c() {
      return this.b;
   }

   public static fbg.a<?> a(fdy $$0) {
      return a($$1 -> new fcd($$1, $$0));
   }
}
