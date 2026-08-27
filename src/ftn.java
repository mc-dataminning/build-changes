import com.google.common.collect.Maps;
import java.util.Map;

public final class ftn extends fru<bwk, ffe<bwk>> {
   private static final Map<bwr, aer> a = ac.a(Maps.newEnumMap(bwr.class), $$0 -> {
      $$0.put(bwr.a, new aer("textures/entity/horse/horse_white.png"));
      $$0.put(bwr.b, new aer("textures/entity/horse/horse_creamy.png"));
      $$0.put(bwr.c, new aer("textures/entity/horse/horse_chestnut.png"));
      $$0.put(bwr.d, new aer("textures/entity/horse/horse_brown.png"));
      $$0.put(bwr.e, new aer("textures/entity/horse/horse_black.png"));
      $$0.put(bwr.f, new aer("textures/entity/horse/horse_gray.png"));
      $$0.put(bwr.g, new aer("textures/entity/horse/horse_darkbrown.png"));
   });

   public ftn(fsx.a $$0) {
      super($$0, new ffe<>($$0.a(fhr.aj)), 1.1F);
      this.a(new fwu(this));
      this.a(new fwt(this, $$0.f()));
   }

   public aer a(bwk $$0) {
      return a.get($$0.q());
   }
}
