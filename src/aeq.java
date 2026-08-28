import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class aeq implements zq<acf> {
   public static final zh<wg, aeq> a = zq.a(aeq::a, aeq::new);
   private final aeq.a b;
   private final List<alj> c;
   private final List<alj> d;
   private final awr e;

   public aeq(aeq.a $$0, Collection<alj> $$1, Collection<alj> $$2, awr $$3) {
      this.b = $$0;
      this.c = ImmutableList.copyOf($$1);
      this.d = ImmutableList.copyOf($$2);
      this.e = $$3;
   }

   private aeq(wg $$0) {
      this.b = $$0.b(aeq.a.class);
      this.e = awr.a($$0);
      this.c = $$0.a(wg::q);
      if (this.b == aeq.a.a) {
         this.d = $$0.a(wg::q);
      } else {
         this.d = ImmutableList.of();
      }
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      this.e.b($$0);
      $$0.a(this.c, wg::a);
      if (this.b == aeq.a.a) {
         $$0.a(this.d, wg::a);
      }
   }

   @Override
   public zs<aeq> a() {
      return agu.aj;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public List<alj> b() {
      return this.c;
   }

   public List<alj> e() {
      return this.d;
   }

   public awr f() {
      return this.e;
   }

   public aeq.a g() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
