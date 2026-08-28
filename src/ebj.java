import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record ebj(ImmutableList<ebn> c) {
   public static final ebj a = new ebj.a()
      .a(ebk.c, $$0 -> $$0)
      .a(ebk.d, $$0 -> $$0.a(ebm::b))
      .a(ebk.e, $$0 -> $$0.a(ebk.d, 8).a(ebm::d))
      .a(ebk.f, $$0 -> $$0.a(ebk.d, 8).a(ebm::e))
      .a(ebk.g, $$0 -> $$0.a(ebk.d, 8).a(ebk.f, 1).a(0).a(ebm::f))
      .a(ebk.h, $$0 -> $$0.a(ebk.d, 8).a(ebk.f, 1).a(0).a(ebm::g))
      .a(ebk.i, $$0 -> $$0.a(ebk.d, 8).a(0).a(ebm::h))
      .a(ebk.j, $$0 -> $$0.a(ebk.d, 8).a(ebk.i, 1).a(1).a(ebm::i))
      .a(ebk.k, $$0 -> $$0.a(ebm::j))
      .a(ebk.l, $$0 -> $$0.a(ebk.k, 1).a(ebm::k))
      .a(ebk.m, $$0 -> $$0.a(ebk.f, 1).a(ebm::l))
      .a(ebk.n, $$0 -> $$0.a(ebm::m))
      .a();
   public static final ebj b = new ebj.a()
      .a(ebk.c, $$0 -> $$0)
      .a(ebk.d, $$0 -> $$0.a(ebm::c))
      .a(ebk.e, $$0 -> $$0)
      .a(ebk.f, $$0 -> $$0)
      .a(ebk.g, $$0 -> $$0)
      .a(ebk.h, $$0 -> $$0)
      .a(ebk.i, $$0 -> $$0)
      .a(ebk.j, $$0 -> $$0)
      .a(ebk.k, $$0 -> $$0.a(ebm::j))
      .a(ebk.l, $$0 -> $$0.a(ebk.k, 1).a(ebm::k))
      .a(ebk.m, $$0 -> $$0)
      .a(ebk.n, $$0 -> $$0.a(ebm::m))
      .a();

   public ebn a(ebk $$0) {
      return (ebn)this.c.get($$0.b());
   }

   public ImmutableList<ebn> a() {
      return this.c;
   }

   public static class a {
      private final List<ebn> a = new ArrayList<>();

      public ebj a() {
         return new ebj(ImmutableList.copyOf(this.a));
      }

      public ebj.a a(ebk $$0, UnaryOperator<ebn.a> $$1) {
         ebn.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new ebn.a($$0);
         } else {
            $$2 = new ebn.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
