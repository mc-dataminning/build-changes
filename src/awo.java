import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class awo {
   protected final Set<ali> a = Sets.newHashSet();
   protected final Set<ali> b = Sets.newHashSet();
   private final awp c = new awp();

   public void a(awo $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(dar<?> $$0) {
      if (!$$0.b().ap_()) {
         this.a($$0.a());
      }
   }

   protected void a(ali $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable dar<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(ali $$0) {
      return this.a.contains($$0);
   }

   public void c(dar<?> $$0) {
      this.c($$0.a());
   }

   protected void c(ali $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(dar<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(dar<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(dar<?> $$0) {
      this.d($$0.a());
   }

   protected void d(ali $$0) {
      this.b.add($$0);
   }

   public boolean a(cte $$0) {
      return this.c.a($$0);
   }

   public void a(cte $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean b(cte $$0) {
      return this.c.b($$0);
   }

   public void b(cte $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(awp $$0) {
      this.c.a($$0);
   }

   public awp a() {
      return this.c.a();
   }

   public void a(cte $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
