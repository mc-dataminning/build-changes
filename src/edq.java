import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record edq(ImmutableList<edu> c) {
   public static final edq a = new edq.a()
      .a(edr.c, $$0 -> $$0)
      .a(edr.d, $$0 -> $$0.a(edt::b))
      .a(edr.e, $$0 -> $$0.a(edr.d, 8).a(edt::d))
      .a(edr.f, $$0 -> $$0.a(edr.d, 8).a(edt::e))
      .a(edr.g, $$0 -> $$0.a(edr.d, 8).a(edr.f, 1).a(0).a(edt::f))
      .a(edr.h, $$0 -> $$0.a(edr.d, 8).a(edr.f, 1).a(0).a(edt::g))
      .a(edr.i, $$0 -> $$0.a(edr.d, 8).a(0).a(edt::h))
      .a(edr.j, $$0 -> $$0.a(edr.d, 8).a(edr.i, 1).a(1).a(edt::i))
      .a(edr.k, $$0 -> $$0.a(edt::j))
      .a(edr.l, $$0 -> $$0.a(edr.k, 1).a(edt::k))
      .a(edr.m, $$0 -> $$0.a(edr.f, 1).a(edt::l))
      .a(edr.n, $$0 -> $$0.a(edt::m))
      .a();
   public static final edq b = new edq.a()
      .a(edr.c, $$0 -> $$0)
      .a(edr.d, $$0 -> $$0.a(edt::c))
      .a(edr.e, $$0 -> $$0)
      .a(edr.f, $$0 -> $$0)
      .a(edr.g, $$0 -> $$0)
      .a(edr.h, $$0 -> $$0)
      .a(edr.i, $$0 -> $$0)
      .a(edr.j, $$0 -> $$0)
      .a(edr.k, $$0 -> $$0.a(edt::j))
      .a(edr.l, $$0 -> $$0.a(edr.k, 1).a(edt::k))
      .a(edr.m, $$0 -> $$0)
      .a(edr.n, $$0 -> $$0.a(edt::m))
      .a();

   public edu a(edr $$0) {
      return (edu)this.c.get($$0.b());
   }

   public ImmutableList<edu> a() {
      return this.c;
   }

   public static class a {
      private final List<edu> a = new ArrayList<>();

      public edq a() {
         return new edq(ImmutableList.copyOf(this.a));
      }

      public edq.a a(edr $$0, UnaryOperator<edu.a> $$1) {
         edu.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new edu.a($$0);
         } else {
            $$2 = new edu.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
