import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record dxz(ImmutableList<dyd> c) {
   public static final dxz a = new dxz.a()
      .a(dya.c, $$0 -> $$0)
      .a(dya.d, $$0 -> $$0.a(dyc::b))
      .a(dya.e, $$0 -> $$0.a(dya.d, 8).a(dyc::d))
      .a(dya.f, $$0 -> $$0.a(dya.d, 8).a(dyc::e))
      .a(dya.g, $$0 -> $$0.a(dya.d, 8).a(dya.f, 1).a(0).a(dyc::f))
      .a(dya.h, $$0 -> $$0.a(dya.d, 8).a(dya.f, 1).a(0).a(dyc::g))
      .a(dya.i, $$0 -> $$0.a(dya.d, 8).a(0).a(dyc::h))
      .a(dya.j, $$0 -> $$0.a(dya.d, 8).a(dya.i, 1).a(1).a(dyc::i))
      .a(dya.k, $$0 -> $$0.a(dyc::j))
      .a(dya.l, $$0 -> $$0.a(dya.k, 1).a(dyc::k))
      .a(dya.m, $$0 -> $$0.a(dya.f, 1).a(dyc::l))
      .a(dya.n, $$0 -> $$0.a(dyc::m))
      .a();
   public static final dxz b = new dxz.a()
      .a(dya.c, $$0 -> $$0)
      .a(dya.d, $$0 -> $$0.a(dyc::c))
      .a(dya.e, $$0 -> $$0)
      .a(dya.f, $$0 -> $$0)
      .a(dya.g, $$0 -> $$0)
      .a(dya.h, $$0 -> $$0)
      .a(dya.i, $$0 -> $$0)
      .a(dya.j, $$0 -> $$0)
      .a(dya.k, $$0 -> $$0.a(dyc::j))
      .a(dya.l, $$0 -> $$0.a(dya.k, 1).a(dyc::k))
      .a(dya.m, $$0 -> $$0)
      .a(dya.n, $$0 -> $$0.a(dyc::m))
      .a();

   public dyd a(dya $$0) {
      return (dyd)this.c.get($$0.b());
   }

   public ImmutableList<dyd> a() {
      return this.c;
   }

   public static class a {
      private final List<dyd> a = new ArrayList<>();

      public dxz a() {
         return new dxz(ImmutableList.copyOf(this.a));
      }

      public dxz.a a(dya $$0, UnaryOperator<dyd.a> $$1) {
         dyd.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new dyd.a($$0);
         } else {
            $$2 = new dyd.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
