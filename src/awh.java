import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class awh {
   protected final Set<alc> a = Sets.newHashSet();
   protected final Set<alc> b = Sets.newHashSet();
   private final awi c = new awi();

   public void a(awh $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(daj<?> $$0) {
      if (!$$0.b().ap_()) {
         this.a($$0.a());
      }
   }

   protected void a(alc $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable daj<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(alc $$0) {
      return this.a.contains($$0);
   }

   public void c(daj<?> $$0) {
      this.c($$0.a());
   }

   protected void c(alc $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(daj<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(daj<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(daj<?> $$0) {
      this.d($$0.a());
   }

   protected void d(alc $$0) {
      this.b.add($$0);
   }

   public boolean a(csm $$0) {
      return this.c.a($$0);
   }

   public void a(csm $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean b(csm $$0) {
      return this.c.b($$0);
   }

   public void b(csm $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(awi $$0) {
      this.c.a($$0);
   }

   public awi a() {
      return this.c.a();
   }

   public void a(csm $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
