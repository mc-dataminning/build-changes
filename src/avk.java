import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class avk {
   protected final Set<akm> a = Sets.newHashSet();
   protected final Set<akm> b = Sets.newHashSet();
   private final avl c = new avl();

   public void a(avk $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(cxw<?> $$0) {
      if (!$$0.b().an_()) {
         this.a($$0.a());
      }
   }

   protected void a(akm $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable cxw<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(akm $$0) {
      return this.a.contains($$0);
   }

   public void c(cxw<?> $$0) {
      this.c($$0.a());
   }

   protected void c(akm $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(cxw<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(cxw<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(cxw<?> $$0) {
      this.d($$0.a());
   }

   protected void d(akm $$0) {
      this.b.add($$0);
   }

   public boolean a(cqh $$0) {
      return this.c.a($$0);
   }

   public void a(cqh $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(cqg<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(cqh $$0) {
      return this.c.b($$0);
   }

   public void b(cqh $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(avl $$0) {
      this.c.a($$0);
   }

   public avl a() {
      return this.c.a();
   }

   public void a(cqh $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
