import com.google.common.collect.Maps;
import java.util.Map;

public final class ftx extends fse<bws, ffo<bws>> {
   private static final Map<bwz, aew> a = ac.a(Maps.newEnumMap(bwz.class), $$0 -> {
      $$0.put(bwz.a, new aew("textures/entity/horse/horse_white.png"));
      $$0.put(bwz.b, new aew("textures/entity/horse/horse_creamy.png"));
      $$0.put(bwz.c, new aew("textures/entity/horse/horse_chestnut.png"));
      $$0.put(bwz.d, new aew("textures/entity/horse/horse_brown.png"));
      $$0.put(bwz.e, new aew("textures/entity/horse/horse_black.png"));
      $$0.put(bwz.f, new aew("textures/entity/horse/horse_gray.png"));
      $$0.put(bwz.g, new aew("textures/entity/horse/horse_darkbrown.png"));
   });

   public ftx(fth.a $$0) {
      super($$0, new ffo<>($$0.a(fib.aj)), 1.1F);
      this.a(new fxe(this));
      this.a(new fxd(this, $$0.f()));
   }

   public aew a(bws $$0) {
      return a.get($$0.t());
   }
}
