import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record dvh(ImmutableList<dvl> c) {
   public static final dvh a = new dvh.a()
      .a(dvi.c, $$0 -> $$0)
      .a(dvi.d, $$0 -> $$0.a(dvk::b))
      .a(dvi.e, $$0 -> $$0.a(dvi.d, 8).a(dvk::d))
      .a(dvi.f, $$0 -> $$0.a(dvi.d, 8).a(dvk::e))
      .a(dvi.g, $$0 -> $$0.a(dvi.d, 8).a(dvi.f, 1).a(0).a(dvk::f))
      .a(dvi.h, $$0 -> $$0.a(dvi.d, 8).a(dvi.f, 1).a(0).a(dvk::g))
      .a(dvi.i, $$0 -> $$0.a(dvi.d, 8).a(0).a(dvk::h))
      .a(dvi.j, $$0 -> $$0.a(dvi.d, 8).a(dvi.i, 1).a(1).a(dvk::i))
      .a(dvi.k, $$0 -> $$0.a(dvk::j))
      .a(dvi.l, $$0 -> $$0.a(dvi.k, 1).a(dvk::k))
      .a(dvi.m, $$0 -> $$0.a(dvi.f, 1).a(dvk::l))
      .a(dvi.n, $$0 -> $$0.a(dvk::m))
      .a();
   public static final dvh b = new dvh.a()
      .a(dvi.c, $$0 -> $$0)
      .a(dvi.d, $$0 -> $$0.a(dvk::c))
      .a(dvi.e, $$0 -> $$0)
      .a(dvi.f, $$0 -> $$0)
      .a(dvi.g, $$0 -> $$0)
      .a(dvi.h, $$0 -> $$0)
      .a(dvi.i, $$0 -> $$0)
      .a(dvi.j, $$0 -> $$0)
      .a(dvi.k, $$0 -> $$0.a(dvk::j))
      .a(dvi.l, $$0 -> $$0.a(dvi.k, 1).a(dvk::k))
      .a(dvi.m, $$0 -> $$0)
      .a(dvi.n, $$0 -> $$0.a(dvk::m))
      .a();

   public dvl a(dvi $$0) {
      return (dvl)this.c.get($$0.b());
   }

   public ImmutableList<dvl> a() {
      return this.c;
   }

   public static class a {
      private final List<dvl> a = new ArrayList<>();

      public dvh a() {
         return new dvh(ImmutableList.copyOf(this.a));
      }

      public dvh.a a(dvi $$0, UnaryOperator<dvl.a> $$1) {
         dvl.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new dvl.a($$0);
         } else {
            $$2 = new dvl.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
