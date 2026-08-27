import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class aup {
   protected final Set<ajt> a = Sets.newHashSet();
   protected final Set<ajt> b = Sets.newHashSet();
   private final auq c = new auq();

   public void a(aup $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(cvl<?> $$0) {
      if (!$$0.b().ao_()) {
         this.a($$0.a());
      }
   }

   protected void a(ajt $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable cvl<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(ajt $$0) {
      return this.a.contains($$0);
   }

   public void c(cvl<?> $$0) {
      this.c($$0.a());
   }

   protected void c(ajt $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(cvl<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(cvl<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(cvl<?> $$0) {
      this.d($$0.a());
   }

   protected void d(ajt $$0) {
      this.b.add($$0);
   }

   public boolean a(cod $$0) {
      return this.c.a($$0);
   }

   public void a(cod $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(coc<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(cod $$0) {
      return this.c.b($$0);
   }

   public void b(cod $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(auq $$0) {
      this.c.a($$0);
   }

   public auq a() {
      return this.c.a();
   }

   public void a(cod $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
