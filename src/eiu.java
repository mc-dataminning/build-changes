import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eiu implements eib {
   public static final Codec<eiu> a = ayi.c(emp.c).fieldOf("features").xmap(eiu::new, $$0 -> $$0.b).codec();
   public final jv<emp> b;

   public eiu(jv<emp> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<efj<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
