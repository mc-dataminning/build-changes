import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dqt implements dqa {
   public static final Codec<dqt> a = arg.b(dum.c).fieldOf("features").xmap(dqt::new, $$0 -> $$0.b).codec();
   public final hk<dum> b;

   public dqt(hk<dum> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<dnj<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
