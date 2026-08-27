import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class egd extends egq {
   public static final MapCodec<egd> a = dwp.a.c.fieldOf("step").xmap(egd::new, $$0 -> $$0.c);
   private final dwp.a c;

   private egd(dwp.a $$0) {
      this.c = $$0;
   }

   public static egd a(dwp.a $$0) {
      return new egd($$0);
   }

   @Override
   public Stream<io> a_(ego $$0, ayk $$1, io $$2) {
      dae $$3 = new dae($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public egr<?> b() {
      return egr.o;
   }
}
