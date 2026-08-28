import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eiw implements eid {
   public static final Codec<eiw> a = ayi.c(emr.c).fieldOf("features").xmap(eiw::new, $$0 -> $$0.b).codec();
   public final jv<emr> b;

   public eiw(jv<emr> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<efl<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
