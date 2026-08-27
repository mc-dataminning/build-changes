import com.google.common.collect.Maps;
import java.util.Map;

public final class fts extends frz<bwn, ffj<bwn>> {
   private static final Map<bwu, aeu> a = ac.a(Maps.newEnumMap(bwu.class), $$0 -> {
      $$0.put(bwu.a, new aeu("textures/entity/horse/horse_white.png"));
      $$0.put(bwu.b, new aeu("textures/entity/horse/horse_creamy.png"));
      $$0.put(bwu.c, new aeu("textures/entity/horse/horse_chestnut.png"));
      $$0.put(bwu.d, new aeu("textures/entity/horse/horse_brown.png"));
      $$0.put(bwu.e, new aeu("textures/entity/horse/horse_black.png"));
      $$0.put(bwu.f, new aeu("textures/entity/horse/horse_gray.png"));
      $$0.put(bwu.g, new aeu("textures/entity/horse/horse_darkbrown.png"));
   });

   public fts(ftc.a $$0) {
      super($$0, new ffj<>($$0.a(fhw.aj)), 1.1F);
      this.a(new fwz(this));
      this.a(new fwy(this, $$0.f()));
   }

   public aeu a(bwn $$0) {
      return a.get($$0.q());
   }
}
