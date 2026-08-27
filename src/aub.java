import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class aub {
   protected final Set<ajh> a = Sets.newHashSet();
   protected final Set<ajh> b = Sets.newHashSet();
   private final auc c = new auc();

   public void a(aub $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(ctp<?> $$0) {
      if (!$$0.b().aq_()) {
         this.a($$0.a());
      }
   }

   protected void a(ajh $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable ctp<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(ajh $$0) {
      return this.a.contains($$0);
   }

   public void c(ctp<?> $$0) {
      this.c($$0.a());
   }

   protected void c(ajh $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(ctp<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(ctp<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(ctp<?> $$0) {
      this.d($$0.a());
   }

   protected void d(ajh $$0) {
      this.b.add($$0);
   }

   public boolean a(cnc $$0) {
      return this.c.a($$0);
   }

   public void a(cnc $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(cnb<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(cnc $$0) {
      return this.c.b($$0);
   }

   public void b(cnc $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(auc $$0) {
      this.c.a($$0);
   }

   public auc a() {
      return this.c.a();
   }

   public void a(cnc $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
