import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record ecl(ImmutableList<ecp> c) {
   public static final ecl a = new ecl.a()
      .a(ecm.c, $$0 -> $$0)
      .a(ecm.d, $$0 -> $$0.a(eco::b))
      .a(ecm.e, $$0 -> $$0.a(ecm.d, 8).a(eco::d))
      .a(ecm.f, $$0 -> $$0.a(ecm.d, 8).a(eco::e))
      .a(ecm.g, $$0 -> $$0.a(ecm.d, 8).a(ecm.f, 1).a(0).a(eco::f))
      .a(ecm.h, $$0 -> $$0.a(ecm.d, 8).a(ecm.f, 1).a(0).a(eco::g))
      .a(ecm.i, $$0 -> $$0.a(ecm.d, 8).a(0).a(eco::h))
      .a(ecm.j, $$0 -> $$0.a(ecm.d, 8).a(ecm.i, 1).a(1).a(eco::i))
      .a(ecm.k, $$0 -> $$0.a(eco::j))
      .a(ecm.l, $$0 -> $$0.a(ecm.k, 1).a(eco::k))
      .a(ecm.m, $$0 -> $$0.a(ecm.f, 1).a(eco::l))
      .a(ecm.n, $$0 -> $$0.a(eco::m))
      .a();
   public static final ecl b = new ecl.a()
      .a(ecm.c, $$0 -> $$0)
      .a(ecm.d, $$0 -> $$0.a(eco::c))
      .a(ecm.e, $$0 -> $$0)
      .a(ecm.f, $$0 -> $$0)
      .a(ecm.g, $$0 -> $$0)
      .a(ecm.h, $$0 -> $$0)
      .a(ecm.i, $$0 -> $$0)
      .a(ecm.j, $$0 -> $$0)
      .a(ecm.k, $$0 -> $$0.a(eco::j))
      .a(ecm.l, $$0 -> $$0.a(ecm.k, 1).a(eco::k))
      .a(ecm.m, $$0 -> $$0)
      .a(ecm.n, $$0 -> $$0.a(eco::m))
      .a();

   public ecp a(ecm $$0) {
      return (ecp)this.c.get($$0.b());
   }

   public ImmutableList<ecp> a() {
      return this.c;
   }

   public static class a {
      private final List<ecp> a = new ArrayList<>();

      public ecl a() {
         return new ecl(ImmutableList.copyOf(this.a));
      }

      public ecl.a a(ecm $$0, UnaryOperator<ecp.a> $$1) {
         ecp.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new ecp.a($$0);
         } else {
            $$2 = new ecp.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
