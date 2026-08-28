import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record dyq(ImmutableList<dyu> c) {
   public static final dyq a = new dyq.a()
      .a(dyr.c, $$0 -> $$0)
      .a(dyr.d, $$0 -> $$0.a(dyt::b))
      .a(dyr.e, $$0 -> $$0.a(dyr.d, 8).a(dyt::d))
      .a(dyr.f, $$0 -> $$0.a(dyr.d, 8).a(dyt::e))
      .a(dyr.g, $$0 -> $$0.a(dyr.d, 8).a(dyr.f, 1).a(0).a(dyt::f))
      .a(dyr.h, $$0 -> $$0.a(dyr.d, 8).a(dyr.f, 1).a(0).a(dyt::g))
      .a(dyr.i, $$0 -> $$0.a(dyr.d, 8).a(0).a(dyt::h))
      .a(dyr.j, $$0 -> $$0.a(dyr.d, 8).a(dyr.i, 1).a(1).a(dyt::i))
      .a(dyr.k, $$0 -> $$0.a(dyt::j))
      .a(dyr.l, $$0 -> $$0.a(dyr.k, 1).a(dyt::k))
      .a(dyr.m, $$0 -> $$0.a(dyr.f, 1).a(dyt::l))
      .a(dyr.n, $$0 -> $$0.a(dyt::m))
      .a();
   public static final dyq b = new dyq.a()
      .a(dyr.c, $$0 -> $$0)
      .a(dyr.d, $$0 -> $$0.a(dyt::c))
      .a(dyr.e, $$0 -> $$0)
      .a(dyr.f, $$0 -> $$0)
      .a(dyr.g, $$0 -> $$0)
      .a(dyr.h, $$0 -> $$0)
      .a(dyr.i, $$0 -> $$0)
      .a(dyr.j, $$0 -> $$0)
      .a(dyr.k, $$0 -> $$0.a(dyt::j))
      .a(dyr.l, $$0 -> $$0.a(dyr.k, 1).a(dyt::k))
      .a(dyr.m, $$0 -> $$0)
      .a(dyr.n, $$0 -> $$0.a(dyt::m))
      .a();

   public dyu a(dyr $$0) {
      return (dyu)this.c.get($$0.b());
   }

   public ImmutableList<dyu> a() {
      return this.c;
   }

   public static class a {
      private final List<dyu> a = new ArrayList<>();

      public dyq a() {
         return new dyq(ImmutableList.copyOf(this.a));
      }

      public dyq.a a(dyr $$0, UnaryOperator<dyu.a> $$1) {
         dyu.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new dyu.a($$0);
         } else {
            $$2 = new dyu.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
