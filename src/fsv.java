import com.google.common.collect.Maps;
import java.util.Map;

public class fsv extends ftg<btm, fbq<btm>> {
   private static final Map<bto, acq> a = ac.a(Maps.newEnumMap(bto.class), $$0 -> {
      $$0.put(bto.a, null);
      $$0.put(bto.b, new acq("textures/entity/horse/horse_markings_white.png"));
      $$0.put(bto.c, new acq("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(bto.d, new acq("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(bto.e, new acq("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public fsv(fqt<btm, fbq<btm>> $$0) {
      super($$0);
   }

   public void a(eij $$0, fjx $$1, int $$2, btm $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      acq $$10 = a.get($$3.fY());
      if ($$10 != null && !$$3.cb()) {
         ein $$11 = $$1.getBuffer(fkf.h($$10));
         this.c().a($$0, $$11, $$2, fpz.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
