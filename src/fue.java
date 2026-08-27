import com.google.common.collect.Maps;
import java.util.Map;

public class fue extends fud<buw, fem<buw>> {
   private static final Map<buw.a, aer> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(buw.a.b, new aer("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(buw.a.a, new aer("textures/entity/cow/red_mooshroom.png"));
   });

   public fue(fsx.a $$0) {
      super($$0, new fem<>($$0.a(fhr.aw)), 0.7F);
      this.a(new fxa<>(this, $$0.c()));
   }

   public aer a(buw $$0) {
      return a.get($$0.q());
   }
}
