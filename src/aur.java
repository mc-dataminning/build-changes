import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class aur {
   protected final Set<ajv> a = Sets.newHashSet();
   protected final Set<ajv> b = Sets.newHashSet();
   private final aus c = new aus();

   public void a(aur $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(cvu<?> $$0) {
      if (!$$0.b().an_()) {
         this.a($$0.a());
      }
   }

   protected void a(ajv $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable cvu<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(ajv $$0) {
      return this.a.contains($$0);
   }

   public void c(cvu<?> $$0) {
      this.c($$0.a());
   }

   protected void c(ajv $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(cvu<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(cvu<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(cvu<?> $$0) {
      this.d($$0.a());
   }

   protected void d(ajv $$0) {
      this.b.add($$0);
   }

   public boolean a(cok $$0) {
      return this.c.a($$0);
   }

   public void a(cok $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(coj<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(cok $$0) {
      return this.c.b($$0);
   }

   public void b(cok $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(aus $$0) {
      this.c.a($$0);
   }

   public aus a() {
      return this.c.a();
   }

   public void a(cok $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
