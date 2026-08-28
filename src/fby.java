import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fby extends fbb {
   static final MapCodec<fby> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(fdu.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, fby::new));
   private final fdt b;

   private fby(List<fcx> $$0, fdt $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.a();
   }

   @Override
   public fbd<fby> b() {
      return fbe.Q;
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      int $$2 = azm.a(this.b.a($$1), 0, 4);
      $$0.b(kk.ad, new dci($$2));
      return $$0;
   }

   public fdt c() {
      return this.b;
   }

   public static fbb.a<?> a(fdt $$0) {
      return a($$1 -> new fby($$1, $$0));
   }
}
