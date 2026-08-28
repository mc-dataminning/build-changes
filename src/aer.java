import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class aer implements zv<ach> {
   public static final zm<wl, aer> a = zv.a(aer::a, aer::new);
   private final aer.a b;
   private final List<ale> c;
   private final List<ale> d;
   private final awd e;

   public aer(aer.a $$0, Collection<ale> $$1, Collection<ale> $$2, awd $$3) {
      this.b = $$0;
      this.c = ImmutableList.copyOf($$1);
      this.d = ImmutableList.copyOf($$2);
      this.e = $$3;
   }

   private aer(wl $$0) {
      this.b = $$0.b(aer.a.class);
      this.e = awd.a($$0);
      this.c = $$0.a(wl::q);
      if (this.b == aer.a.a) {
         this.d = $$0.a(wl::q);
      } else {
         this.d = ImmutableList.of();
      }
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      this.e.b($$0);
      $$0.a(this.c, wl::a);
      if (this.b == aer.a.a) {
         $$0.a(this.d, wl::a);
      }
   }

   @Override
   public zx<aer> a() {
      return agt.ai;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public List<ale> b() {
      return this.c;
   }

   public List<ale> e() {
      return this.d;
   }

   public awd f() {
      return this.e;
   }

   public aer.a g() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
