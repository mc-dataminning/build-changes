import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record dyj(ImmutableList<dyn> c) {
   public static final dyj a = new dyj.a()
      .a(dyk.c, $$0 -> $$0)
      .a(dyk.d, $$0 -> $$0.a(dym::b))
      .a(dyk.e, $$0 -> $$0.a(dyk.d, 8).a(dym::d))
      .a(dyk.f, $$0 -> $$0.a(dyk.d, 8).a(dym::e))
      .a(dyk.g, $$0 -> $$0.a(dyk.d, 8).a(dyk.f, 1).a(0).a(dym::f))
      .a(dyk.h, $$0 -> $$0.a(dyk.d, 8).a(dyk.f, 1).a(0).a(dym::g))
      .a(dyk.i, $$0 -> $$0.a(dyk.d, 8).a(0).a(dym::h))
      .a(dyk.j, $$0 -> $$0.a(dyk.d, 8).a(dyk.i, 1).a(1).a(dym::i))
      .a(dyk.k, $$0 -> $$0.a(dym::j))
      .a(dyk.l, $$0 -> $$0.a(dyk.k, 1).a(dym::k))
      .a(dyk.m, $$0 -> $$0.a(dyk.f, 1).a(dym::l))
      .a(dyk.n, $$0 -> $$0.a(dym::m))
      .a();
   public static final dyj b = new dyj.a()
      .a(dyk.c, $$0 -> $$0)
      .a(dyk.d, $$0 -> $$0.a(dym::c))
      .a(dyk.e, $$0 -> $$0)
      .a(dyk.f, $$0 -> $$0)
      .a(dyk.g, $$0 -> $$0)
      .a(dyk.h, $$0 -> $$0)
      .a(dyk.i, $$0 -> $$0)
      .a(dyk.j, $$0 -> $$0)
      .a(dyk.k, $$0 -> $$0.a(dym::j))
      .a(dyk.l, $$0 -> $$0.a(dyk.k, 1).a(dym::k))
      .a(dyk.m, $$0 -> $$0)
      .a(dyk.n, $$0 -> $$0.a(dym::m))
      .a();

   public dyn a(dyk $$0) {
      return (dyn)this.c.get($$0.b());
   }

   public ImmutableList<dyn> a() {
      return this.c;
   }

   public static class a {
      private final List<dyn> a = new ArrayList<>();

      public dyj a() {
         return new dyj(ImmutableList.copyOf(this.a));
      }

      public dyj.a a(dyk $$0, UnaryOperator<dyn.a> $$1) {
         dyn.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new dyn.a($$0);
         } else {
            $$2 = new dyn.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
