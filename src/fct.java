import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fct extends fbw {
   static final MapCodec<fct> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(fep.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, fct::new));
   private final feo b;

   private fct(List<fds> $$0, feo $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<bbb<?>> a() {
      return this.b.a();
   }

   @Override
   public fby<fct> b() {
      return fbz.Q;
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      int $$2 = azq.a(this.b.a($$1), 0, 4);
      $$0.b(kl.ad, new dcy($$2));
      return $$0;
   }

   public feo c() {
      return this.b;
   }

   public static fbw.a<?> a(feo $$0) {
      return a($$1 -> new fct($$1, $$0));
   }
}
