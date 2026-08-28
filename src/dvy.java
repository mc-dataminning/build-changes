import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record dvy(ImmutableList<dwc> c) {
   public static final dvy a = new dvy.a()
      .a(dvz.c, $$0 -> $$0)
      .a(dvz.d, $$0 -> $$0.a(dwb::b))
      .a(dvz.e, $$0 -> $$0.a(dvz.d, 8).a(dwb::d))
      .a(dvz.f, $$0 -> $$0.a(dvz.d, 8).a(dwb::e))
      .a(dvz.g, $$0 -> $$0.a(dvz.d, 8).a(dvz.f, 1).a(0).a(dwb::f))
      .a(dvz.h, $$0 -> $$0.a(dvz.d, 8).a(dvz.f, 1).a(0).a(dwb::g))
      .a(dvz.i, $$0 -> $$0.a(dvz.d, 8).a(0).a(dwb::h))
      .a(dvz.j, $$0 -> $$0.a(dvz.d, 8).a(dvz.i, 1).a(1).a(dwb::i))
      .a(dvz.k, $$0 -> $$0.a(dwb::j))
      .a(dvz.l, $$0 -> $$0.a(dvz.k, 1).a(dwb::k))
      .a(dvz.m, $$0 -> $$0.a(dvz.f, 1).a(dwb::l))
      .a(dvz.n, $$0 -> $$0.a(dwb::m))
      .a();
   public static final dvy b = new dvy.a()
      .a(dvz.c, $$0 -> $$0)
      .a(dvz.d, $$0 -> $$0.a(dwb::c))
      .a(dvz.e, $$0 -> $$0)
      .a(dvz.f, $$0 -> $$0)
      .a(dvz.g, $$0 -> $$0)
      .a(dvz.h, $$0 -> $$0)
      .a(dvz.i, $$0 -> $$0)
      .a(dvz.j, $$0 -> $$0)
      .a(dvz.k, $$0 -> $$0.a(dwb::j))
      .a(dvz.l, $$0 -> $$0.a(dvz.k, 1).a(dwb::k))
      .a(dvz.m, $$0 -> $$0)
      .a(dvz.n, $$0 -> $$0.a(dwb::m))
      .a();

   public dwc a(dvz $$0) {
      return (dwc)this.c.get($$0.b());
   }

   public ImmutableList<dwc> a() {
      return this.c;
   }

   public static class a {
      private final List<dwc> a = new ArrayList<>();

      public dvy a() {
         return new dvy(ImmutableList.copyOf(this.a));
      }

      public dvy.a a(dvz $$0, UnaryOperator<dwc.a> $$1) {
         dwc.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new dwc.a($$0);
         } else {
            $$2 = new dwc.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
