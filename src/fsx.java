import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fsx extends ftg<brx, fbu<brx>> {
   private static final Map<brx.a, acq> a = ImmutableMap.of(
      brx.a.b,
      new acq("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      brx.a.c,
      new acq("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      brx.a.d,
      new acq("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public fsx(fqt<brx, fbu<brx>> $$0) {
      super($$0);
   }

   public void a(eij $$0, fjx $$1, int $$2, brx $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cb()) {
         brx.a $$10 = $$3.r();
         if ($$10 != brx.a.a) {
            acq $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
