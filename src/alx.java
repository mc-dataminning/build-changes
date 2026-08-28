import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class alx {
   private final Map<aku, alw> a = Maps.newHashMap();

   @Nullable
   public alw a(aku $$0) {
      return this.a.get($$0);
   }

   public alw a(aku $$0, wo $$1) {
      alw $$2 = new alw($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(alw $$0) {
      this.a.remove($$0.a());
   }

   public Collection<aku> a() {
      return this.a.keySet();
   }

   public Collection<alw> b() {
      return this.a.values();
   }

   public tq a(jt.a $$0) {
      tq $$1 = new tq();

      for (alw $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(tq $$0, jt.a $$1) {
      for (String $$2 : $$0.e()) {
         aku $$3 = aku.a($$2);
         this.a.put($$3, alw.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(ard $$0) {
      for (alw $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(ard $$0) {
      for (alw $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
