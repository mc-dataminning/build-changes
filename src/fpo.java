import com.google.common.collect.Maps;
import java.util.Map;

public final class fpo extends fnu<btm, fbq<btm>> {
   private static final Map<btt, acq> a = ac.a(Maps.newEnumMap(btt.class), $$0 -> {
      $$0.put(btt.a, new acq("textures/entity/horse/horse_white.png"));
      $$0.put(btt.b, new acq("textures/entity/horse/horse_creamy.png"));
      $$0.put(btt.c, new acq("textures/entity/horse/horse_chestnut.png"));
      $$0.put(btt.d, new acq("textures/entity/horse/horse_brown.png"));
      $$0.put(btt.e, new acq("textures/entity/horse/horse_black.png"));
      $$0.put(btt.f, new acq("textures/entity/horse/horse_gray.png"));
      $$0.put(btt.g, new acq("textures/entity/horse/horse_darkbrown.png"));
   });

   public fpo(foy.a $$0) {
      super($$0, new fbq<>($$0.a(fed.aj)), 1.1F);
      this.a(new fsv(this));
      this.a(new fsu(this, $$0.f()));
   }

   public acq a(btm $$0) {
      return a.get($$0.r());
   }
}
