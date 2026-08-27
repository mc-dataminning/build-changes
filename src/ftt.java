import com.google.common.collect.Maps;
import java.util.Map;

public final class ftt extends fsa<bwy, ffj<bwy>> {
   private static final Map<bxf, aez> a = ac.a(Maps.newEnumMap(bxf.class), $$0 -> {
      $$0.put(bxf.a, new aez("textures/entity/horse/horse_white.png"));
      $$0.put(bxf.b, new aez("textures/entity/horse/horse_creamy.png"));
      $$0.put(bxf.c, new aez("textures/entity/horse/horse_chestnut.png"));
      $$0.put(bxf.d, new aez("textures/entity/horse/horse_brown.png"));
      $$0.put(bxf.e, new aez("textures/entity/horse/horse_black.png"));
      $$0.put(bxf.f, new aez("textures/entity/horse/horse_gray.png"));
      $$0.put(bxf.g, new aez("textures/entity/horse/horse_darkbrown.png"));
   });

   public ftt(ftd.a $$0) {
      super($$0, new ffj<>($$0.a(fhw.aj)), 1.1F);
      this.a(new fxa(this));
      this.a(new fwz(this, $$0.f()));
   }

   public aez a(bwy $$0) {
      return a.get($$0.t());
   }
}
