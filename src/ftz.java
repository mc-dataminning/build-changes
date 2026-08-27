import com.google.common.collect.Maps;
import java.util.Map;

public final class ftz extends fsg<bwu, ffq<bwu>> {
   private static final Map<bxb, aey> a = ac.a(Maps.newEnumMap(bxb.class), $$0 -> {
      $$0.put(bxb.a, new aey("textures/entity/horse/horse_white.png"));
      $$0.put(bxb.b, new aey("textures/entity/horse/horse_creamy.png"));
      $$0.put(bxb.c, new aey("textures/entity/horse/horse_chestnut.png"));
      $$0.put(bxb.d, new aey("textures/entity/horse/horse_brown.png"));
      $$0.put(bxb.e, new aey("textures/entity/horse/horse_black.png"));
      $$0.put(bxb.f, new aey("textures/entity/horse/horse_gray.png"));
      $$0.put(bxb.g, new aey("textures/entity/horse/horse_darkbrown.png"));
   });

   public ftz(ftj.a $$0) {
      super($$0, new ffq<>($$0.a(fid.aj)), 1.1F);
      this.a(new fxg(this));
      this.a(new fxf(this, $$0.f()));
   }

   public aey a(bwu $$0) {
      return a.get($$0.t());
   }
}
