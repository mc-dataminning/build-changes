import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record een(ImmutableList<eer> c) {
   public static final een a = new een.a()
      .a(eeo.c, $$0 -> $$0)
      .a(eeo.d, $$0 -> $$0.a(eeq::b))
      .a(eeo.e, $$0 -> $$0.a(eeo.d, 8).a(eeq::d))
      .a(eeo.f, $$0 -> $$0.a(eeo.d, 8).a(eeq::e))
      .a(eeo.g, $$0 -> $$0.a(eeo.d, 8).a(eeo.f, 1).a(0).a(eeq::f))
      .a(eeo.h, $$0 -> $$0.a(eeo.d, 8).a(eeo.f, 1).a(0).a(eeq::g))
      .a(eeo.i, $$0 -> $$0.a(eeo.d, 8).a(0).a(eeq::h))
      .a(eeo.j, $$0 -> $$0.a(eeo.d, 8).a(eeo.i, 1).a(1).a(eeq::i))
      .a(eeo.k, $$0 -> $$0.a(eeq::j))
      .a(eeo.l, $$0 -> $$0.a(eeo.k, 1).a(eeq::k))
      .a(eeo.m, $$0 -> $$0.a(eeo.f, 1).a(eeq::l))
      .a(eeo.n, $$0 -> $$0.a(eeq::m))
      .a();
   public static final een b = new een.a()
      .a(eeo.c, $$0 -> $$0)
      .a(eeo.d, $$0 -> $$0.a(eeq::c))
      .a(eeo.e, $$0 -> $$0)
      .a(eeo.f, $$0 -> $$0)
      .a(eeo.g, $$0 -> $$0)
      .a(eeo.h, $$0 -> $$0)
      .a(eeo.i, $$0 -> $$0)
      .a(eeo.j, $$0 -> $$0)
      .a(eeo.k, $$0 -> $$0.a(eeq::j))
      .a(eeo.l, $$0 -> $$0.a(eeo.k, 1).a(eeq::k))
      .a(eeo.m, $$0 -> $$0)
      .a(eeo.n, $$0 -> $$0.a(eeq::m))
      .a();

   public eer a(eeo $$0) {
      return (eer)this.c.get($$0.b());
   }

   public ImmutableList<eer> a() {
      return this.c;
   }

   public static class a {
      private final List<eer> a = new ArrayList<>();

      public een a() {
         return new een(ImmutableList.copyOf(this.a));
      }

      public een.a a(eeo $$0, UnaryOperator<eer.a> $$1) {
         eer.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new eer.a($$0);
         } else {
            $$2 = new eer.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
