import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class fbk extends fau {
   public static final MapCodec<fbk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  fat.e.a(dbr.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  ayu.k.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fbk::new)
   );
   public static final dbs b = new dbs(0, List.of());
   private final Optional<fat.e<dbr>> c;
   private final Optional<Integer> d;

   protected fbk(List<fcq> $$0, Optional<fat.e<dbr>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected czd a(czd $$0, ezh $$1) {
      $$0.a(kj.aj, b, this::a);
      return $$0;
   }

   private dbs a(dbs $$0) {
      return new dbs(this.d.orElseGet($$0::a), this.c.<List<dbr>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public faw<fbk> b() {
      return fax.K;
   }
}
