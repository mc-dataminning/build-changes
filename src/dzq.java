import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record dzq(ImmutableList<dzu> c) {
   public static final dzq a = new dzq.a()
      .a(dzr.c, $$0 -> $$0)
      .a(dzr.d, $$0 -> $$0.a(dzt::b))
      .a(dzr.e, $$0 -> $$0.a(dzr.d, 8).a(dzt::d))
      .a(dzr.f, $$0 -> $$0.a(dzr.d, 8).a(dzt::e))
      .a(dzr.g, $$0 -> $$0.a(dzr.d, 8).a(dzr.f, 1).a(0).a(dzt::f))
      .a(dzr.h, $$0 -> $$0.a(dzr.d, 8).a(dzr.f, 1).a(0).a(dzt::g))
      .a(dzr.i, $$0 -> $$0.a(dzr.d, 8).a(0).a(dzt::h))
      .a(dzr.j, $$0 -> $$0.a(dzr.d, 8).a(dzr.i, 1).a(1).a(dzt::i))
      .a(dzr.k, $$0 -> $$0.a(dzt::j))
      .a(dzr.l, $$0 -> $$0.a(dzr.k, 1).a(dzt::k))
      .a(dzr.m, $$0 -> $$0.a(dzr.f, 1).a(dzt::l))
      .a(dzr.n, $$0 -> $$0.a(dzt::m))
      .a();
   public static final dzq b = new dzq.a()
      .a(dzr.c, $$0 -> $$0)
      .a(dzr.d, $$0 -> $$0.a(dzt::c))
      .a(dzr.e, $$0 -> $$0)
      .a(dzr.f, $$0 -> $$0)
      .a(dzr.g, $$0 -> $$0)
      .a(dzr.h, $$0 -> $$0)
      .a(dzr.i, $$0 -> $$0)
      .a(dzr.j, $$0 -> $$0)
      .a(dzr.k, $$0 -> $$0.a(dzt::j))
      .a(dzr.l, $$0 -> $$0.a(dzr.k, 1).a(dzt::k))
      .a(dzr.m, $$0 -> $$0)
      .a(dzr.n, $$0 -> $$0.a(dzt::m))
      .a();

   public dzu a(dzr $$0) {
      return (dzu)this.c.get($$0.b());
   }

   public ImmutableList<dzu> a() {
      return this.c;
   }

   public static class a {
      private final List<dzu> a = new ArrayList<>();

      public dzq a() {
         return new dzq(ImmutableList.copyOf(this.a));
      }

      public dzq.a a(dzr $$0, UnaryOperator<dzu.a> $$1) {
         dzu.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new dzu.a($$0);
         } else {
            $$2 = new dzu.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
