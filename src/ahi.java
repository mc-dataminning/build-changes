import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class ahi {
   private final Map<agi, ahh> a = Maps.newHashMap();

   @Nullable
   public ahh a(agi $$0) {
      return this.a.get($$0);
   }

   public ahh a(agi $$0, ur $$1) {
      ahh $$2 = new ahh($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(ahh $$0) {
      this.a.remove($$0.a());
   }

   public Collection<agi> a() {
      return this.a.keySet();
   }

   public Collection<ahh> b() {
      return this.a.values();
   }

   public rz c() {
      rz $$0 = new rz();

      for (ahh $$1 : this.a.values()) {
         $$0.a($$1.a().toString(), $$1.f());
      }

      return $$0;
   }

   public void a(rz $$0) {
      for (String $$1 : $$0.e()) {
         agi $$2 = new agi($$1);
         this.a.put($$2, ahh.a($$0.p($$1), $$2));
      }
   }

   public void a(amf $$0) {
      for (ahh $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(amf $$0) {
      for (ahh $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
