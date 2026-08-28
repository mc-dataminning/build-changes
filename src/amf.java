import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class amf {
   private final Map<ale, ame> a = Maps.newHashMap();

   @Nullable
   public ame a(ale $$0) {
      return this.a.get($$0);
   }

   public ame a(ale $$0, xo $$1) {
      ame $$2 = new ame($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(ame $$0) {
      this.a.remove($$0.a());
   }

   public Collection<ale> a() {
      return this.a.keySet();
   }

   public Collection<ame> b() {
      return this.a.values();
   }

   public ur a(jk.a $$0) {
      ur $$1 = new ur();

      for (ame $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(ur $$0, jk.a $$1) {
      for (String $$2 : $$0.e()) {
         ale $$3 = new ale($$2);
         this.a.put($$3, ame.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(arf $$0) {
      for (ame $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(arf $$0) {
      for (ame $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
