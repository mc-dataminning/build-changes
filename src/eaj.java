import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record eaj(ImmutableList<ean> c) {
   public static final eaj a = new eaj.a()
      .a(eak.c, $$0 -> $$0)
      .a(eak.d, $$0 -> $$0.a(eam::b))
      .a(eak.e, $$0 -> $$0.a(eak.d, 8).a(eam::d))
      .a(eak.f, $$0 -> $$0.a(eak.d, 8).a(eam::e))
      .a(eak.g, $$0 -> $$0.a(eak.d, 8).a(eak.f, 1).a(0).a(eam::f))
      .a(eak.h, $$0 -> $$0.a(eak.d, 8).a(eak.f, 1).a(0).a(eam::g))
      .a(eak.i, $$0 -> $$0.a(eak.d, 8).a(0).a(eam::h))
      .a(eak.j, $$0 -> $$0.a(eak.d, 8).a(eak.i, 1).a(1).a(eam::i))
      .a(eak.k, $$0 -> $$0.a(eam::j))
      .a(eak.l, $$0 -> $$0.a(eak.k, 1).a(eam::k))
      .a(eak.m, $$0 -> $$0.a(eak.f, 1).a(eam::l))
      .a(eak.n, $$0 -> $$0.a(eam::m))
      .a();
   public static final eaj b = new eaj.a()
      .a(eak.c, $$0 -> $$0)
      .a(eak.d, $$0 -> $$0.a(eam::c))
      .a(eak.e, $$0 -> $$0)
      .a(eak.f, $$0 -> $$0)
      .a(eak.g, $$0 -> $$0)
      .a(eak.h, $$0 -> $$0)
      .a(eak.i, $$0 -> $$0)
      .a(eak.j, $$0 -> $$0)
      .a(eak.k, $$0 -> $$0.a(eam::j))
      .a(eak.l, $$0 -> $$0.a(eak.k, 1).a(eam::k))
      .a(eak.m, $$0 -> $$0)
      .a(eak.n, $$0 -> $$0.a(eam::m))
      .a();

   public ean a(eak $$0) {
      return (ean)this.c.get($$0.b());
   }

   public ImmutableList<ean> a() {
      return this.c;
   }

   public static class a {
      private final List<ean> a = new ArrayList<>();

      public eaj a() {
         return new eaj(ImmutableList.copyOf(this.a));
      }

      public eaj.a a(eak $$0, UnaryOperator<ean.a> $$1) {
         ean.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new ean.a($$0);
         } else {
            $$2 = new ean.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
