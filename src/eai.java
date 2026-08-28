import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record eai(ImmutableList<eam> c) {
   public static final eai a = new eai.a()
      .a(eaj.c, $$0 -> $$0)
      .a(eaj.d, $$0 -> $$0.a(eal::b))
      .a(eaj.e, $$0 -> $$0.a(eaj.d, 8).a(eal::d))
      .a(eaj.f, $$0 -> $$0.a(eaj.d, 8).a(eal::e))
      .a(eaj.g, $$0 -> $$0.a(eaj.d, 8).a(eaj.f, 1).a(0).a(eal::f))
      .a(eaj.h, $$0 -> $$0.a(eaj.d, 8).a(eaj.f, 1).a(0).a(eal::g))
      .a(eaj.i, $$0 -> $$0.a(eaj.d, 8).a(0).a(eal::h))
      .a(eaj.j, $$0 -> $$0.a(eaj.d, 8).a(eaj.i, 1).a(1).a(eal::i))
      .a(eaj.k, $$0 -> $$0.a(eal::j))
      .a(eaj.l, $$0 -> $$0.a(eaj.k, 1).a(eal::k))
      .a(eaj.m, $$0 -> $$0.a(eaj.f, 1).a(eal::l))
      .a(eaj.n, $$0 -> $$0.a(eal::m))
      .a();
   public static final eai b = new eai.a()
      .a(eaj.c, $$0 -> $$0)
      .a(eaj.d, $$0 -> $$0.a(eal::c))
      .a(eaj.e, $$0 -> $$0)
      .a(eaj.f, $$0 -> $$0)
      .a(eaj.g, $$0 -> $$0)
      .a(eaj.h, $$0 -> $$0)
      .a(eaj.i, $$0 -> $$0)
      .a(eaj.j, $$0 -> $$0)
      .a(eaj.k, $$0 -> $$0.a(eal::j))
      .a(eaj.l, $$0 -> $$0.a(eaj.k, 1).a(eal::k))
      .a(eaj.m, $$0 -> $$0)
      .a(eaj.n, $$0 -> $$0.a(eal::m))
      .a();

   public eam a(eaj $$0) {
      return (eam)this.c.get($$0.b());
   }

   public ImmutableList<eam> a() {
      return this.c;
   }

   public static class a {
      private final List<eam> a = new ArrayList<>();

      public eai a() {
         return new eai(ImmutableList.copyOf(this.a));
      }

      public eai.a a(eaj $$0, UnaryOperator<eam.a> $$1) {
         eam.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new eam.a($$0);
         } else {
            $$2 = new eam.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
