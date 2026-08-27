import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class arp {
   protected final Set<ahd> a = Sets.newHashSet();
   protected final Set<ahd> b = Sets.newHashSet();
   private final arq c = new arq();

   public void a(arp $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(cpx<?> $$0) {
      if (!$$0.b().aq_()) {
         this.a($$0.a());
      }
   }

   protected void a(ahd $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable cpx<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(ahd $$0) {
      return this.a.contains($$0);
   }

   public void c(cpx<?> $$0) {
      this.c($$0.a());
   }

   protected void c(ahd $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(cpx<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(cpx<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(cpx<?> $$0) {
      this.d($$0.a());
   }

   protected void d(ahd $$0) {
      this.b.add($$0);
   }

   public boolean a(cji $$0) {
      return this.c.a($$0);
   }

   public void a(cji $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(cjh<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(cji $$0) {
      return this.c.b($$0);
   }

   public void b(cji $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(arq $$0) {
      this.c.a($$0);
   }

   public arq a() {
      return this.c.a();
   }

   public void a(cji $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
