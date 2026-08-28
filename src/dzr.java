import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record dzr(ImmutableList<dzv> c) {
   public static final dzr a = new dzr.a()
      .a(dzs.c, $$0 -> $$0)
      .a(dzs.d, $$0 -> $$0.a(dzu::b))
      .a(dzs.e, $$0 -> $$0.a(dzs.d, 8).a(dzu::d))
      .a(dzs.f, $$0 -> $$0.a(dzs.d, 8).a(dzu::e))
      .a(dzs.g, $$0 -> $$0.a(dzs.d, 8).a(dzs.f, 1).a(0).a(dzu::f))
      .a(dzs.h, $$0 -> $$0.a(dzs.d, 8).a(dzs.f, 1).a(0).a(dzu::g))
      .a(dzs.i, $$0 -> $$0.a(dzs.d, 8).a(0).a(dzu::h))
      .a(dzs.j, $$0 -> $$0.a(dzs.d, 8).a(dzs.i, 1).a(1).a(dzu::i))
      .a(dzs.k, $$0 -> $$0.a(dzu::j))
      .a(dzs.l, $$0 -> $$0.a(dzs.k, 1).a(dzu::k))
      .a(dzs.m, $$0 -> $$0.a(dzs.f, 1).a(dzu::l))
      .a(dzs.n, $$0 -> $$0.a(dzu::m))
      .a();
   public static final dzr b = new dzr.a()
      .a(dzs.c, $$0 -> $$0)
      .a(dzs.d, $$0 -> $$0.a(dzu::c))
      .a(dzs.e, $$0 -> $$0)
      .a(dzs.f, $$0 -> $$0)
      .a(dzs.g, $$0 -> $$0)
      .a(dzs.h, $$0 -> $$0)
      .a(dzs.i, $$0 -> $$0)
      .a(dzs.j, $$0 -> $$0)
      .a(dzs.k, $$0 -> $$0.a(dzu::j))
      .a(dzs.l, $$0 -> $$0.a(dzs.k, 1).a(dzu::k))
      .a(dzs.m, $$0 -> $$0)
      .a(dzs.n, $$0 -> $$0.a(dzu::m))
      .a();

   public dzv a(dzs $$0) {
      return (dzv)this.c.get($$0.b());
   }

   public ImmutableList<dzv> a() {
      return this.c;
   }

   public static class a {
      private final List<dzv> a = new ArrayList<>();

      public dzr a() {
         return new dzr(ImmutableList.copyOf(this.a));
      }

      public dzr.a a(dzs $$0, UnaryOperator<dzv.a> $$1) {
         dzv.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new dzv.a($$0);
         } else {
            $$2 = new dzv.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
