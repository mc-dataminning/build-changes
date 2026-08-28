import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class awc {
   protected final Set<ale> a = Sets.newHashSet();
   protected final Set<ale> b = Sets.newHashSet();
   private final awd c = new awd();

   public void a(awc $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(cyw<?> $$0) {
      if (!$$0.b().an_()) {
         this.a($$0.a());
      }
   }

   protected void a(ale $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable cyw<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(ale $$0) {
      return this.a.contains($$0);
   }

   public void c(cyw<?> $$0) {
      this.c($$0.a());
   }

   protected void c(ale $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(cyw<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(cyw<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(cyw<?> $$0) {
      this.d($$0.a());
   }

   protected void d(ale $$0) {
      this.b.add($$0);
   }

   public boolean a(crh $$0) {
      return this.c.a($$0);
   }

   public void a(crh $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(crg<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(crh $$0) {
      return this.c.b($$0);
   }

   public void b(crh $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(awd $$0) {
      this.c.a($$0);
   }

   public awd a() {
      return this.c.a();
   }

   public void a(crh $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
