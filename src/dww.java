import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record dww(ImmutableList<dxa> c) {
   public static final dww a = new dww.a()
      .a(dwx.c, $$0 -> $$0)
      .a(dwx.d, $$0 -> $$0.a(dwz::b))
      .a(dwx.e, $$0 -> $$0.a(dwx.d, 8).a(dwz::d))
      .a(dwx.f, $$0 -> $$0.a(dwx.d, 8).a(dwz::e))
      .a(dwx.g, $$0 -> $$0.a(dwx.d, 8).a(dwx.f, 1).a(0).a(dwz::f))
      .a(dwx.h, $$0 -> $$0.a(dwx.d, 8).a(dwx.f, 1).a(0).a(dwz::g))
      .a(dwx.i, $$0 -> $$0.a(dwx.d, 8).a(0).a(dwz::h))
      .a(dwx.j, $$0 -> $$0.a(dwx.d, 8).a(dwx.i, 1).a(1).a(dwz::i))
      .a(dwx.k, $$0 -> $$0.a(dwz::j))
      .a(dwx.l, $$0 -> $$0.a(dwx.k, 1).a(dwz::k))
      .a(dwx.m, $$0 -> $$0.a(dwx.f, 1).a(dwz::l))
      .a(dwx.n, $$0 -> $$0.a(dwz::m))
      .a();
   public static final dww b = new dww.a()
      .a(dwx.c, $$0 -> $$0)
      .a(dwx.d, $$0 -> $$0.a(dwz::c))
      .a(dwx.e, $$0 -> $$0)
      .a(dwx.f, $$0 -> $$0)
      .a(dwx.g, $$0 -> $$0)
      .a(dwx.h, $$0 -> $$0)
      .a(dwx.i, $$0 -> $$0)
      .a(dwx.j, $$0 -> $$0)
      .a(dwx.k, $$0 -> $$0.a(dwz::j))
      .a(dwx.l, $$0 -> $$0.a(dwx.k, 1).a(dwz::k))
      .a(dwx.m, $$0 -> $$0)
      .a(dwx.n, $$0 -> $$0.a(dwz::m))
      .a();

   public dxa a(dwx $$0) {
      return (dxa)this.c.get($$0.b());
   }

   public ImmutableList<dxa> a() {
      return this.c;
   }

   public static class a {
      private final List<dxa> a = new ArrayList<>();

      public dww a() {
         return new dww(ImmutableList.copyOf(this.a));
      }

      public dww.a a(dwx $$0, UnaryOperator<dxa.a> $$1) {
         dxa.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new dxa.a($$0);
         } else {
            $$2 = new dxa.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
