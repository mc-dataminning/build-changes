import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class arf {
   protected final Set<agt> a = Sets.newHashSet();
   protected final Set<agt> b = Sets.newHashSet();
   private final arg c = new arg();

   public void a(arf $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(cpn<?> $$0) {
      if (!$$0.b().aq_()) {
         this.a($$0.a());
      }
   }

   protected void a(agt $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable cpn<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(agt $$0) {
      return this.a.contains($$0);
   }

   public void c(cpn<?> $$0) {
      this.c($$0.a());
   }

   protected void c(agt $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(cpn<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(cpn<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(cpn<?> $$0) {
      this.d($$0.a());
   }

   protected void d(agt $$0) {
      this.b.add($$0);
   }

   public boolean a(ciy $$0) {
      return this.c.a($$0);
   }

   public void a(ciy $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(cix<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(ciy $$0) {
      return this.c.b($$0);
   }

   public void b(ciy $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(arg $$0) {
      this.c.a($$0);
   }

   public arg a() {
      return this.c.a();
   }

   public void a(ciy $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
