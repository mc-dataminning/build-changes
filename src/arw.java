import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class arw {
   protected final Set<ahh> a = Sets.newHashSet();
   protected final Set<ahh> b = Sets.newHashSet();
   private final arx c = new arx();

   public void a(arw $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(cqm<?> $$0) {
      if (!$$0.b().as_()) {
         this.a($$0.a());
      }
   }

   protected void a(ahh $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable cqm<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(ahh $$0) {
      return this.a.contains($$0);
   }

   public void c(cqm<?> $$0) {
      this.c($$0.a());
   }

   protected void c(ahh $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(cqm<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(cqm<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(cqm<?> $$0) {
      this.d($$0.a());
   }

   protected void d(ahh $$0) {
      this.b.add($$0);
   }

   public boolean a(cjx $$0) {
      return this.c.a($$0);
   }

   public void a(cjx $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(cjw<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(cjx $$0) {
      return this.c.b($$0);
   }

   public void b(cjx $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(arx $$0) {
      this.c.a($$0);
   }

   public arx a() {
      return this.c.a();
   }

   public void a(cjx $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
