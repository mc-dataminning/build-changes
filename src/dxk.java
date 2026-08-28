import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record dxk(ImmutableList<dxo> c) {
   public static final dxk a = new dxk.a()
      .a(dxl.c, $$0 -> $$0)
      .a(dxl.d, $$0 -> $$0.a(dxn::b))
      .a(dxl.e, $$0 -> $$0.a(dxl.d, 8).a(dxn::d))
      .a(dxl.f, $$0 -> $$0.a(dxl.d, 8).a(dxn::e))
      .a(dxl.g, $$0 -> $$0.a(dxl.d, 8).a(dxl.f, 1).a(0).a(dxn::f))
      .a(dxl.h, $$0 -> $$0.a(dxl.d, 8).a(dxl.f, 1).a(0).a(dxn::g))
      .a(dxl.i, $$0 -> $$0.a(dxl.d, 8).a(0).a(dxn::h))
      .a(dxl.j, $$0 -> $$0.a(dxl.d, 8).a(dxl.i, 1).a(1).a(dxn::i))
      .a(dxl.k, $$0 -> $$0.a(dxn::j))
      .a(dxl.l, $$0 -> $$0.a(dxl.k, 1).a(dxn::k))
      .a(dxl.m, $$0 -> $$0.a(dxl.f, 1).a(dxn::l))
      .a(dxl.n, $$0 -> $$0.a(dxn::m))
      .a();
   public static final dxk b = new dxk.a()
      .a(dxl.c, $$0 -> $$0)
      .a(dxl.d, $$0 -> $$0.a(dxn::c))
      .a(dxl.e, $$0 -> $$0)
      .a(dxl.f, $$0 -> $$0)
      .a(dxl.g, $$0 -> $$0)
      .a(dxl.h, $$0 -> $$0)
      .a(dxl.i, $$0 -> $$0)
      .a(dxl.j, $$0 -> $$0)
      .a(dxl.k, $$0 -> $$0.a(dxn::j))
      .a(dxl.l, $$0 -> $$0.a(dxl.k, 1).a(dxn::k))
      .a(dxl.m, $$0 -> $$0)
      .a(dxl.n, $$0 -> $$0.a(dxn::m))
      .a();

   public dxo a(dxl $$0) {
      return (dxo)this.c.get($$0.b());
   }

   public ImmutableList<dxo> a() {
      return this.c;
   }

   public static class a {
      private final List<dxo> a = new ArrayList<>();

      public dxk a() {
         return new dxk(ImmutableList.copyOf(this.a));
      }

      public dxk.a a(dxl $$0, UnaryOperator<dxo.a> $$1) {
         dxo.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new dxo.a($$0);
         } else {
            $$2 = new dxo.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
