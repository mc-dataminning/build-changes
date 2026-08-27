import com.google.common.collect.Maps;
import java.util.Map;

public final class fsz extends frg<bwj, fev<bwj>> {
   private static final Map<bwq, aep> a = ac.a(Maps.newEnumMap(bwq.class), $$0 -> {
      $$0.put(bwq.a, new aep("textures/entity/horse/horse_white.png"));
      $$0.put(bwq.b, new aep("textures/entity/horse/horse_creamy.png"));
      $$0.put(bwq.c, new aep("textures/entity/horse/horse_chestnut.png"));
      $$0.put(bwq.d, new aep("textures/entity/horse/horse_brown.png"));
      $$0.put(bwq.e, new aep("textures/entity/horse/horse_black.png"));
      $$0.put(bwq.f, new aep("textures/entity/horse/horse_gray.png"));
      $$0.put(bwq.g, new aep("textures/entity/horse/horse_darkbrown.png"));
   });

   public fsz(fsj.a $$0) {
      super($$0, new fev<>($$0.a(fhi.aj)), 1.1F);
      this.a(new fwg(this));
      this.a(new fwf(this, $$0.f()));
   }

   public aep a(bwj $$0) {
      return a.get($$0.q());
   }
}
