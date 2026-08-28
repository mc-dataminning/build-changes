import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record edl(ImmutableList<edp> c) {
   public static final edl a = new edl.a()
      .a(edm.c, $$0 -> $$0)
      .a(edm.d, $$0 -> $$0.a(edo::b))
      .a(edm.e, $$0 -> $$0.a(edm.d, 8).a(edo::d))
      .a(edm.f, $$0 -> $$0.a(edm.d, 8).a(edo::e))
      .a(edm.g, $$0 -> $$0.a(edm.d, 8).a(edm.f, 1).a(0).a(edo::f))
      .a(edm.h, $$0 -> $$0.a(edm.d, 8).a(edm.f, 1).a(0).a(edo::g))
      .a(edm.i, $$0 -> $$0.a(edm.d, 8).a(0).a(edo::h))
      .a(edm.j, $$0 -> $$0.a(edm.d, 8).a(edm.i, 1).a(1).a(edo::i))
      .a(edm.k, $$0 -> $$0.a(edo::j))
      .a(edm.l, $$0 -> $$0.a(edm.k, 1).a(edo::k))
      .a(edm.m, $$0 -> $$0.a(edm.f, 1).a(edo::l))
      .a(edm.n, $$0 -> $$0.a(edo::m))
      .a();
   public static final edl b = new edl.a()
      .a(edm.c, $$0 -> $$0)
      .a(edm.d, $$0 -> $$0.a(edo::c))
      .a(edm.e, $$0 -> $$0)
      .a(edm.f, $$0 -> $$0)
      .a(edm.g, $$0 -> $$0)
      .a(edm.h, $$0 -> $$0)
      .a(edm.i, $$0 -> $$0)
      .a(edm.j, $$0 -> $$0)
      .a(edm.k, $$0 -> $$0.a(edo::j))
      .a(edm.l, $$0 -> $$0.a(edm.k, 1).a(edo::k))
      .a(edm.m, $$0 -> $$0)
      .a(edm.n, $$0 -> $$0.a(edo::m))
      .a();

   public edp a(edm $$0) {
      return (edp)this.c.get($$0.b());
   }

   public ImmutableList<edp> a() {
      return this.c;
   }

   public static class a {
      private final List<edp> a = new ArrayList<>();

      public edl a() {
         return new edl(ImmutableList.copyOf(this.a));
      }

      public edl.a a(edm $$0, UnaryOperator<edp.a> $$1) {
         edp.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new edp.a($$0);
         } else {
            $$2 = new edp.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
