import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class aqq {
   protected final Set<agg> a = Sets.newHashSet();
   protected final Set<agg> b = Sets.newHashSet();
   private final aqr c = new aqr();

   public void a(aqq $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(coh<?> $$0) {
      if (!$$0.b().ap_()) {
         this.a($$0.a());
      }
   }

   protected void a(agg $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable coh<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(agg $$0) {
      return this.a.contains($$0);
   }

   public void c(coh<?> $$0) {
      this.c($$0.a());
   }

   protected void c(agg $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(coh<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(coh<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(coh<?> $$0) {
      this.d($$0.a());
   }

   protected void d(agg $$0) {
      this.b.add($$0);
   }

   public boolean a(chs $$0) {
      return this.c.a($$0);
   }

   public void a(chs $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(chr<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(chs $$0) {
      return this.c.b($$0);
   }

   public void b(chs $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(aqr $$0) {
      this.c.a($$0);
   }

   public aqr a() {
      return this.c.a();
   }

   public void a(chs $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
