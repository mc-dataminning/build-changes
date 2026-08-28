import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class awg {
   protected final Set<alb> a = Sets.newHashSet();
   protected final Set<alb> b = Sets.newHashSet();
   private final awh c = new awh();

   public void a(awg $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(czv<?> $$0) {
      if (!$$0.b().ar_()) {
         this.a($$0.a());
      }
   }

   protected void a(alb $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable czv<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(alb $$0) {
      return this.a.contains($$0);
   }

   public void c(czv<?> $$0) {
      this.c($$0.a());
   }

   protected void c(alb $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(czv<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(czv<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(czv<?> $$0) {
      this.d($$0.a());
   }

   protected void d(alb $$0) {
      this.b.add($$0);
   }

   public boolean a(csg $$0) {
      return this.c.a($$0);
   }

   public void a(csg $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean b(csg $$0) {
      return this.c.b($$0);
   }

   public void b(csg $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(awh $$0) {
      this.c.a($$0);
   }

   public awh a() {
      return this.c.a();
   }

   public void a(csg $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
