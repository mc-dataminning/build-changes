import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record dyf(ImmutableList<dyj> c) {
   public static final dyf a = new dyf.a()
      .a(dyg.c, $$0 -> $$0)
      .a(dyg.d, $$0 -> $$0.a(dyi::b))
      .a(dyg.e, $$0 -> $$0.a(dyg.d, 8).a(dyi::d))
      .a(dyg.f, $$0 -> $$0.a(dyg.d, 8).a(dyi::e))
      .a(dyg.g, $$0 -> $$0.a(dyg.d, 8).a(dyg.f, 1).a(0).a(dyi::f))
      .a(dyg.h, $$0 -> $$0.a(dyg.d, 8).a(dyg.f, 1).a(0).a(dyi::g))
      .a(dyg.i, $$0 -> $$0.a(dyg.d, 8).a(0).a(dyi::h))
      .a(dyg.j, $$0 -> $$0.a(dyg.d, 8).a(dyg.i, 1).a(1).a(dyi::i))
      .a(dyg.k, $$0 -> $$0.a(dyi::j))
      .a(dyg.l, $$0 -> $$0.a(dyg.k, 1).a(dyi::k))
      .a(dyg.m, $$0 -> $$0.a(dyg.f, 1).a(dyi::l))
      .a(dyg.n, $$0 -> $$0.a(dyi::m))
      .a();
   public static final dyf b = new dyf.a()
      .a(dyg.c, $$0 -> $$0)
      .a(dyg.d, $$0 -> $$0.a(dyi::c))
      .a(dyg.e, $$0 -> $$0)
      .a(dyg.f, $$0 -> $$0)
      .a(dyg.g, $$0 -> $$0)
      .a(dyg.h, $$0 -> $$0)
      .a(dyg.i, $$0 -> $$0)
      .a(dyg.j, $$0 -> $$0)
      .a(dyg.k, $$0 -> $$0.a(dyi::j))
      .a(dyg.l, $$0 -> $$0.a(dyg.k, 1).a(dyi::k))
      .a(dyg.m, $$0 -> $$0)
      .a(dyg.n, $$0 -> $$0.a(dyi::m))
      .a();

   public dyj a(dyg $$0) {
      return (dyj)this.c.get($$0.b());
   }

   public ImmutableList<dyj> a() {
      return this.c;
   }

   public static class a {
      private final List<dyj> a = new ArrayList<>();

      public dyf a() {
         return new dyf(ImmutableList.copyOf(this.a));
      }

      public dyf.a a(dyg $$0, UnaryOperator<dyj.a> $$1) {
         dyj.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new dyj.a($$0);
         } else {
            $$2 = new dyj.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
