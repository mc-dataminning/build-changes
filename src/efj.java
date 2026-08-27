import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class efj extends efw {
   public static final Codec<efj> a = dvv.a.c.fieldOf("step").xmap(efj::new, $$0 -> $$0.c).codec();
   private final dvv.a c;

   private efj(dvv.a $$0) {
      this.c = $$0;
   }

   public static efj a(dvv.a $$0) {
      return new efj($$0);
   }

   @Override
   public Stream<in> a_(efu $$0, ayg $$1, in $$2) {
      czk $$3 = new czk($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public efx<?> b() {
      return efx.o;
   }
}
