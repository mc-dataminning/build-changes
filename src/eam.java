import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record eam(ImmutableList<eaq> c) {
   public static final eam a = new eam.a()
      .a(ean.c, $$0 -> $$0)
      .a(ean.d, $$0 -> $$0.a(eap::b))
      .a(ean.e, $$0 -> $$0.a(ean.d, 8).a(eap::d))
      .a(ean.f, $$0 -> $$0.a(ean.d, 8).a(eap::e))
      .a(ean.g, $$0 -> $$0.a(ean.d, 8).a(ean.f, 1).a(0).a(eap::f))
      .a(ean.h, $$0 -> $$0.a(ean.d, 8).a(ean.f, 1).a(0).a(eap::g))
      .a(ean.i, $$0 -> $$0.a(ean.d, 8).a(0).a(eap::h))
      .a(ean.j, $$0 -> $$0.a(ean.d, 8).a(ean.i, 1).a(1).a(eap::i))
      .a(ean.k, $$0 -> $$0.a(eap::j))
      .a(ean.l, $$0 -> $$0.a(ean.k, 1).a(eap::k))
      .a(ean.m, $$0 -> $$0.a(ean.f, 1).a(eap::l))
      .a(ean.n, $$0 -> $$0.a(eap::m))
      .a();
   public static final eam b = new eam.a()
      .a(ean.c, $$0 -> $$0)
      .a(ean.d, $$0 -> $$0.a(eap::c))
      .a(ean.e, $$0 -> $$0)
      .a(ean.f, $$0 -> $$0)
      .a(ean.g, $$0 -> $$0)
      .a(ean.h, $$0 -> $$0)
      .a(ean.i, $$0 -> $$0)
      .a(ean.j, $$0 -> $$0)
      .a(ean.k, $$0 -> $$0.a(eap::j))
      .a(ean.l, $$0 -> $$0.a(ean.k, 1).a(eap::k))
      .a(ean.m, $$0 -> $$0)
      .a(ean.n, $$0 -> $$0.a(eap::m))
      .a();

   public eaq a(ean $$0) {
      return (eaq)this.c.get($$0.b());
   }

   public ImmutableList<eaq> a() {
      return this.c;
   }

   public static class a {
      private final List<eaq> a = new ArrayList<>();

      public eam a() {
         return new eam(ImmutableList.copyOf(this.a));
      }

      public eam.a a(ean $$0, UnaryOperator<eaq.a> $$1) {
         eaq.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new eaq.a($$0);
         } else {
            $$2 = new eaq.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
