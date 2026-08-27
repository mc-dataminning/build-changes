import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class ali {
   private final Map<akh, alh> a = Maps.newHashMap();

   @Nullable
   public alh a(akh $$0) {
      return this.a.get($$0);
   }

   public alh a(akh $$0, wu $$1) {
      alh $$2 = new alh($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(alh $$0) {
      this.a.remove($$0.a());
   }

   public Collection<akh> a() {
      return this.a.keySet();
   }

   public Collection<alh> b() {
      return this.a.values();
   }

   public ua a(iy.a $$0) {
      ua $$1 = new ua();

      for (alh $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(ua $$0, iy.a $$1) {
      for (String $$2 : $$0.e()) {
         akh $$3 = new akh($$2);
         this.a.put($$3, alh.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(aqi $$0) {
      for (alh $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(aqi $$0) {
      for (alh $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
