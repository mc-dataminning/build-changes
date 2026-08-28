import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record eap(ImmutableList<eat> c) {
   public static final eap a = new eap.a()
      .a(eaq.c, $$0 -> $$0)
      .a(eaq.d, $$0 -> $$0.a(eas::b))
      .a(eaq.e, $$0 -> $$0.a(eaq.d, 8).a(eas::d))
      .a(eaq.f, $$0 -> $$0.a(eaq.d, 8).a(eas::e))
      .a(eaq.g, $$0 -> $$0.a(eaq.d, 8).a(eaq.f, 1).a(0).a(eas::f))
      .a(eaq.h, $$0 -> $$0.a(eaq.d, 8).a(eaq.f, 1).a(0).a(eas::g))
      .a(eaq.i, $$0 -> $$0.a(eaq.d, 8).a(0).a(eas::h))
      .a(eaq.j, $$0 -> $$0.a(eaq.d, 8).a(eaq.i, 1).a(1).a(eas::i))
      .a(eaq.k, $$0 -> $$0.a(eas::j))
      .a(eaq.l, $$0 -> $$0.a(eaq.k, 1).a(eas::k))
      .a(eaq.m, $$0 -> $$0.a(eaq.f, 1).a(eas::l))
      .a(eaq.n, $$0 -> $$0.a(eas::m))
      .a();
   public static final eap b = new eap.a()
      .a(eaq.c, $$0 -> $$0)
      .a(eaq.d, $$0 -> $$0.a(eas::c))
      .a(eaq.e, $$0 -> $$0)
      .a(eaq.f, $$0 -> $$0)
      .a(eaq.g, $$0 -> $$0)
      .a(eaq.h, $$0 -> $$0)
      .a(eaq.i, $$0 -> $$0)
      .a(eaq.j, $$0 -> $$0)
      .a(eaq.k, $$0 -> $$0.a(eas::j))
      .a(eaq.l, $$0 -> $$0.a(eaq.k, 1).a(eas::k))
      .a(eaq.m, $$0 -> $$0)
      .a(eaq.n, $$0 -> $$0.a(eas::m))
      .a();

   public eat a(eaq $$0) {
      return (eat)this.c.get($$0.b());
   }

   public ImmutableList<eat> a() {
      return this.c;
   }

   public static class a {
      private final List<eat> a = new ArrayList<>();

      public eap a() {
         return new eap(ImmutableList.copyOf(this.a));
      }

      public eap.a a(eaq $$0, UnaryOperator<eat.a> $$1) {
         eat.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new eat.a($$0);
         } else {
            $$2 = new eat.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
