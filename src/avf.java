import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class avf {
   protected final Set<akh> a = Sets.newHashSet();
   protected final Set<akh> b = Sets.newHashSet();
   private final avg c = new avg();

   public void a(avf $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(cxf<?> $$0) {
      if (!$$0.b().an_()) {
         this.a($$0.a());
      }
   }

   protected void a(akh $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable cxf<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(akh $$0) {
      return this.a.contains($$0);
   }

   public void c(cxf<?> $$0) {
      this.c($$0.a());
   }

   protected void c(akh $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(cxf<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(cxf<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(cxf<?> $$0) {
      this.d($$0.a());
   }

   protected void d(akh $$0) {
      this.b.add($$0);
   }

   public boolean a(cps $$0) {
      return this.c.a($$0);
   }

   public void a(cps $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(cpr<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(cps $$0) {
      return this.c.b($$0);
   }

   public void b(cps $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(avg $$0) {
      this.c.a($$0);
   }

   public avg a() {
      return this.c.a();
   }

   public void a(cps $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
