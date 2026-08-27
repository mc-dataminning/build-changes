import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class aco implements xx<aag> {
   public static final xo<uq, aco> a = xx.a(aco::a, aco::new);
   private final aco.a b;
   private final List<aiy> c;
   private final List<aiy> d;
   private final atp e;

   public aco(aco.a $$0, Collection<aiy> $$1, Collection<aiy> $$2, atp $$3) {
      this.b = $$0;
      this.c = ImmutableList.copyOf($$1);
      this.d = ImmutableList.copyOf($$2);
      this.e = $$3;
   }

   private aco(uq $$0) {
      this.b = $$0.b(aco.a.class);
      this.e = atp.a($$0);
      this.c = $$0.a(uq::s);
      if (this.b == aco.a.a) {
         this.d = $$0.a(uq::s);
      } else {
         this.d = ImmutableList.of();
      }
   }

   private void a(uq $$0) {
      $$0.a(this.b);
      this.e.b($$0);
      $$0.a(this.c, uq::a);
      if (this.b == aco.a.a) {
         $$0.a(this.d, uq::a);
      }
   }

   @Override
   public xz<aco> a() {
      return aeq.ah;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public List<aiy> b() {
      return this.c;
   }

   public List<aiy> e() {
      return this.d;
   }

   public atp f() {
      return this.e;
   }

   public aco.a g() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
