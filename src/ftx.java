import com.google.common.collect.Maps;
import java.util.Map;

public final class ftx extends fse<bws, ffo<bws>> {
   private static final Map<bwz, aex> a = ac.a(Maps.newEnumMap(bwz.class), $$0 -> {
      $$0.put(bwz.a, new aex("textures/entity/horse/horse_white.png"));
      $$0.put(bwz.b, new aex("textures/entity/horse/horse_creamy.png"));
      $$0.put(bwz.c, new aex("textures/entity/horse/horse_chestnut.png"));
      $$0.put(bwz.d, new aex("textures/entity/horse/horse_brown.png"));
      $$0.put(bwz.e, new aex("textures/entity/horse/horse_black.png"));
      $$0.put(bwz.f, new aex("textures/entity/horse/horse_gray.png"));
      $$0.put(bwz.g, new aex("textures/entity/horse/horse_darkbrown.png"));
   });

   public ftx(fth.a $$0) {
      super($$0, new ffo<>($$0.a(fib.aj)), 1.1F);
      this.a(new fxe(this));
      this.a(new fxd(this, $$0.f()));
   }

   public aex a(bws $$0) {
      return a.get($$0.t());
   }
}
