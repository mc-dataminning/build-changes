import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record dxo(ImmutableList<dxs> c) {
   public static final dxo a = new dxo.a()
      .a(dxp.c, $$0 -> $$0)
      .a(dxp.d, $$0 -> $$0.a(dxr::b))
      .a(dxp.e, $$0 -> $$0.a(dxp.d, 8).a(dxr::d))
      .a(dxp.f, $$0 -> $$0.a(dxp.d, 8).a(dxr::e))
      .a(dxp.g, $$0 -> $$0.a(dxp.d, 8).a(dxp.f, 1).a(0).a(dxr::f))
      .a(dxp.h, $$0 -> $$0.a(dxp.d, 8).a(dxp.f, 1).a(0).a(dxr::g))
      .a(dxp.i, $$0 -> $$0.a(dxp.d, 8).a(0).a(dxr::h))
      .a(dxp.j, $$0 -> $$0.a(dxp.d, 8).a(dxp.i, 1).a(1).a(dxr::i))
      .a(dxp.k, $$0 -> $$0.a(dxr::j))
      .a(dxp.l, $$0 -> $$0.a(dxp.k, 1).a(dxr::k))
      .a(dxp.m, $$0 -> $$0.a(dxp.f, 1).a(dxr::l))
      .a(dxp.n, $$0 -> $$0.a(dxr::m))
      .a();
   public static final dxo b = new dxo.a()
      .a(dxp.c, $$0 -> $$0)
      .a(dxp.d, $$0 -> $$0.a(dxr::c))
      .a(dxp.e, $$0 -> $$0)
      .a(dxp.f, $$0 -> $$0)
      .a(dxp.g, $$0 -> $$0)
      .a(dxp.h, $$0 -> $$0)
      .a(dxp.i, $$0 -> $$0)
      .a(dxp.j, $$0 -> $$0)
      .a(dxp.k, $$0 -> $$0.a(dxr::j))
      .a(dxp.l, $$0 -> $$0.a(dxp.k, 1).a(dxr::k))
      .a(dxp.m, $$0 -> $$0)
      .a(dxp.n, $$0 -> $$0.a(dxr::m))
      .a();

   public dxs a(dxp $$0) {
      return (dxs)this.c.get($$0.b());
   }

   public ImmutableList<dxs> a() {
      return this.c;
   }

   public static class a {
      private final List<dxs> a = new ArrayList<>();

      public dxo a() {
         return new dxo(ImmutableList.copyOf(this.a));
      }

      public dxo.a a(dxp $$0, UnaryOperator<dxs.a> $$1) {
         dxs.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new dxs.a($$0);
         } else {
            $$2 = new dxs.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
