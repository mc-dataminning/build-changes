import com.google.common.collect.Maps;
import java.util.Map;

public class ftq extends ftp<buv, fed<buv>> {
   private static final Map<buv.a, aep> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(buv.a.b, new aep("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(buv.a.a, new aep("textures/entity/cow/red_mooshroom.png"));
   });

   public ftq(fsj.a $$0) {
      super($$0, new fed<>($$0.a(fhi.aw)), 0.7F);
      this.a(new fwm<>(this, $$0.c()));
   }

   public aep a(buv $$0) {
      return a.get($$0.q());
   }
}
