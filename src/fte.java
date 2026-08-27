import com.google.common.collect.Maps;
import java.util.Map;

public final class fte extends frl<bwl, fez<bwl>> {
   private static final Map<bws, aer> a = ac.a(Maps.newEnumMap(bws.class), $$0 -> {
      $$0.put(bws.a, new aer("textures/entity/horse/horse_white.png"));
      $$0.put(bws.b, new aer("textures/entity/horse/horse_creamy.png"));
      $$0.put(bws.c, new aer("textures/entity/horse/horse_chestnut.png"));
      $$0.put(bws.d, new aer("textures/entity/horse/horse_brown.png"));
      $$0.put(bws.e, new aer("textures/entity/horse/horse_black.png"));
      $$0.put(bws.f, new aer("textures/entity/horse/horse_gray.png"));
      $$0.put(bws.g, new aer("textures/entity/horse/horse_darkbrown.png"));
   });

   public fte(fso.a $$0) {
      super($$0, new fez<>($$0.a(fhm.aj)), 1.1F);
      this.a(new fwl(this));
      this.a(new fwk(this, $$0.f()));
   }

   public aer a(bwl $$0) {
      return a.get($$0.q());
   }
}
