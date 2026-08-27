import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class aqu {
   protected final Set<agi> a = Sets.newHashSet();
   protected final Set<agi> b = Sets.newHashSet();
   private final aqv c = new aqv();

   public void a(aqu $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(coq<?> $$0) {
      if (!$$0.b().ap_()) {
         this.a($$0.a());
      }
   }

   protected void a(agi $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable coq<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(agi $$0) {
      return this.a.contains($$0);
   }

   public void c(coq<?> $$0) {
      this.c($$0.a());
   }

   protected void c(agi $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(coq<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(coq<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(coq<?> $$0) {
      this.d($$0.a());
   }

   protected void d(agi $$0) {
      this.b.add($$0);
   }

   public boolean a(cia $$0) {
      return this.c.a($$0);
   }

   public void a(cia $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(chz<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(cia $$0) {
      return this.c.b($$0);
   }

   public void b(cia $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(aqv $$0) {
      this.c.a($$0);
   }

   public aqv a() {
      return this.c.a();
   }

   public void a(cia $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
