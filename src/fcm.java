import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class fcm extends fbw {
   public static final MapCodec<fcm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  fbv.e.a(dco.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  ayy.k.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fcm::new)
   );
   public static final dcp b = new dcp(0, List.of());
   private final Optional<fbv.e<dco>> c;
   private final Optional<Integer> d;

   protected fcm(List<fds> $$0, Optional<fbv.e<dco>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected daa a(daa $$0, faj $$1) {
      $$0.a(kl.aj, b, this::a);
      return $$0;
   }

   private dcp a(dcp $$0) {
      return new dcp(this.d.orElseGet($$0::a), this.c.<List<dco>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public fby<fcm> b() {
      return fbz.K;
   }
}
