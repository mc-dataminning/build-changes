import com.google.common.collect.Maps;
import java.util.Map;

public class ftv extends ftu<bux, feh<bux>> {
   private static final Map<bux.a, aer> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bux.a.b, new aer("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(bux.a.a, new aer("textures/entity/cow/red_mooshroom.png"));
   });

   public ftv(fso.a $$0) {
      super($$0, new feh<>($$0.a(fhm.aw)), 0.7F);
      this.a(new fwr<>(this, $$0.c()));
   }

   public aer a(bux $$0) {
      return a.get($$0.q());
   }
}
