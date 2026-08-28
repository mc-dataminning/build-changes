import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record eaq(ImmutableList<eau> c) {
   public static final eaq a = new eaq.a()
      .a(ear.c, $$0 -> $$0)
      .a(ear.d, $$0 -> $$0.a(eat::b))
      .a(ear.e, $$0 -> $$0.a(ear.d, 8).a(eat::d))
      .a(ear.f, $$0 -> $$0.a(ear.d, 8).a(eat::e))
      .a(ear.g, $$0 -> $$0.a(ear.d, 8).a(ear.f, 1).a(0).a(eat::f))
      .a(ear.h, $$0 -> $$0.a(ear.d, 8).a(ear.f, 1).a(0).a(eat::g))
      .a(ear.i, $$0 -> $$0.a(ear.d, 8).a(0).a(eat::h))
      .a(ear.j, $$0 -> $$0.a(ear.d, 8).a(ear.i, 1).a(1).a(eat::i))
      .a(ear.k, $$0 -> $$0.a(eat::j))
      .a(ear.l, $$0 -> $$0.a(ear.k, 1).a(eat::k))
      .a(ear.m, $$0 -> $$0.a(ear.f, 1).a(eat::l))
      .a(ear.n, $$0 -> $$0.a(eat::m))
      .a();
   public static final eaq b = new eaq.a()
      .a(ear.c, $$0 -> $$0)
      .a(ear.d, $$0 -> $$0.a(eat::c))
      .a(ear.e, $$0 -> $$0)
      .a(ear.f, $$0 -> $$0)
      .a(ear.g, $$0 -> $$0)
      .a(ear.h, $$0 -> $$0)
      .a(ear.i, $$0 -> $$0)
      .a(ear.j, $$0 -> $$0)
      .a(ear.k, $$0 -> $$0.a(eat::j))
      .a(ear.l, $$0 -> $$0.a(ear.k, 1).a(eat::k))
      .a(ear.m, $$0 -> $$0)
      .a(ear.n, $$0 -> $$0.a(eat::m))
      .a();

   public eau a(ear $$0) {
      return (eau)this.c.get($$0.b());
   }

   public ImmutableList<eau> a() {
      return this.c;
   }

   public static class a {
      private final List<eau> a = new ArrayList<>();

      public eaq a() {
         return new eaq(ImmutableList.copyOf(this.a));
      }

      public eaq.a a(ear $$0, UnaryOperator<eau.a> $$1) {
         eau.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new eau.a($$0);
         } else {
            $$2 = new eau.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
