import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class aqg {
   protected final Set<afw> a = Sets.newHashSet();
   protected final Set<afw> b = Sets.newHashSet();
   private final aqh c = new aqh();

   public void a(aqg $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(cno<?> $$0) {
      if (!$$0.b().ap_()) {
         this.a($$0.a());
      }
   }

   protected void a(afw $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable cno<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(afw $$0) {
      return this.a.contains($$0);
   }

   public void c(cno<?> $$0) {
      this.c($$0.a());
   }

   protected void c(afw $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(cno<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(cno<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(cno<?> $$0) {
      this.d($$0.a());
   }

   protected void d(afw $$0) {
      this.b.add($$0);
   }

   public boolean a(cha $$0) {
      return this.c.a($$0);
   }

   public void a(cha $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(cgz<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(cha $$0) {
      return this.c.b($$0);
   }

   public void b(cha $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(aqh $$0) {
      this.c.a($$0);
   }

   public aqh a() {
      return this.c.a();
   }

   public void a(cha $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
