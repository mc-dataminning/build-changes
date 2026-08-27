import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class aox {
   protected final Set<aep> a = Sets.newHashSet();
   protected final Set<aep> b = Sets.newHashSet();
   private final aoy c = new aoy();

   public void a(aox $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(clz<?> $$0) {
      if (!$$0.ai_()) {
         this.a($$0.e());
      }
   }

   protected void a(aep $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable clz<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.e());
   }

   public boolean b(aep $$0) {
      return this.a.contains($$0);
   }

   public void c(clz<?> $$0) {
      this.c($$0.e());
   }

   protected void c(aep $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(clz<?> $$0) {
      return this.b.contains($$0.e());
   }

   public void e(clz<?> $$0) {
      this.b.remove($$0.e());
   }

   public void f(clz<?> $$0) {
      this.d($$0.e());
   }

   protected void d(aep $$0) {
      this.b.add($$0);
   }

   public boolean a(cfn $$0) {
      return this.c.a($$0);
   }

   public void a(cfn $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(cfm<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(cfn $$0) {
      return this.c.b($$0);
   }

   public void b(cfn $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(aoy $$0) {
      this.c.a($$0);
   }

   public aoy a() {
      return this.c.a();
   }

   public void a(cfn $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
