import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class amk {
   protected final Set<acq> a = Sets.newHashSet();
   protected final Set<acq> b = Sets.newHashSet();
   private final aml c = new aml();

   public void a(amk $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(cjc<?> $$0) {
      if (!$$0.ai_()) {
         this.a($$0.e());
      }
   }

   protected void a(acq $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable cjc<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.e());
   }

   public boolean b(acq $$0) {
      return this.a.contains($$0);
   }

   public void c(cjc<?> $$0) {
      this.c($$0.e());
   }

   protected void c(acq $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(cjc<?> $$0) {
      return this.b.contains($$0.e());
   }

   public void e(cjc<?> $$0) {
      this.b.remove($$0.e());
   }

   public void f(cjc<?> $$0) {
      this.d($$0.e());
   }

   protected void d(acq $$0) {
      this.b.add($$0);
   }

   public boolean a(ccq $$0) {
      return this.c.a($$0);
   }

   public void a(ccq $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(ccp<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(ccq $$0) {
      return this.c.b($$0);
   }

   public void b(ccq $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(aml $$0) {
      this.c.a($$0);
   }

   public aml a() {
      return this.c.a();
   }

   public void a(ccq $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
