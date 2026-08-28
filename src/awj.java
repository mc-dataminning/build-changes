import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class awj {
   protected final Set<ale> a = Sets.newHashSet();
   protected final Set<ale> b = Sets.newHashSet();
   private final awk c = new awk();

   public void a(awj $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(dam<?> $$0) {
      if (!$$0.b().aq_()) {
         this.a($$0.a());
      }
   }

   protected void a(ale $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable dam<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(ale $$0) {
      return this.a.contains($$0);
   }

   public void c(dam<?> $$0) {
      this.c($$0.a());
   }

   protected void c(ale $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(dam<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(dam<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(dam<?> $$0) {
      this.d($$0.a());
   }

   protected void d(ale $$0) {
      this.b.add($$0);
   }

   public boolean a(csp $$0) {
      return this.c.a($$0);
   }

   public void a(csp $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean b(csp $$0) {
      return this.c.b($$0);
   }

   public void b(csp $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(awk $$0) {
      this.c.a($$0);
   }

   public awk a() {
      return this.c.a();
   }

   public void a(csp $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
