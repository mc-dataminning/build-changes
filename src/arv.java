import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class arv {
   protected final Set<ahg> a = Sets.newHashSet();
   protected final Set<ahg> b = Sets.newHashSet();
   private final arw c = new arw();

   public void a(arv $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(cqe<?> $$0) {
      if (!$$0.b().aq_()) {
         this.a($$0.a());
      }
   }

   protected void a(ahg $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable cqe<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(ahg $$0) {
      return this.a.contains($$0);
   }

   public void c(cqe<?> $$0) {
      this.c($$0.a());
   }

   protected void c(ahg $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(cqe<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(cqe<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(cqe<?> $$0) {
      this.d($$0.a());
   }

   protected void d(ahg $$0) {
      this.b.add($$0);
   }

   public boolean a(cjp $$0) {
      return this.c.a($$0);
   }

   public void a(cjp $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(cjo<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(cjp $$0) {
      return this.c.b($$0);
   }

   public void b(cjp $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(arw $$0) {
      this.c.a($$0);
   }

   public arw a() {
      return this.c.a();
   }

   public void a(cjp $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
