import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class drl implements dqs {
   public static final Codec<drl> a = asg.b(dve.c).fieldOf("features").xmap(drl::new, $$0 -> $$0.b).codec();
   public final ig<dve> b;

   public drl(ig<dve> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<dob<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
