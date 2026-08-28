import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record eeb(ImmutableList<eef> c) {
   public static final eeb a = new eeb.a()
      .a(eec.c, $$0 -> $$0)
      .a(eec.d, $$0 -> $$0.a(eee::b))
      .a(eec.e, $$0 -> $$0.a(eec.d, 8).a(eee::d))
      .a(eec.f, $$0 -> $$0.a(eec.d, 8).a(eee::e))
      .a(eec.g, $$0 -> $$0.a(eec.d, 8).a(eec.f, 1).a(0).a(eee::f))
      .a(eec.h, $$0 -> $$0.a(eec.d, 8).a(eec.f, 1).a(0).a(eee::g))
      .a(eec.i, $$0 -> $$0.a(eec.d, 8).a(0).a(eee::h))
      .a(eec.j, $$0 -> $$0.a(eec.d, 8).a(eec.i, 1).a(1).a(eee::i))
      .a(eec.k, $$0 -> $$0.a(eee::j))
      .a(eec.l, $$0 -> $$0.a(eec.k, 1).a(eee::k))
      .a(eec.m, $$0 -> $$0.a(eec.f, 1).a(eee::l))
      .a(eec.n, $$0 -> $$0.a(eee::m))
      .a();
   public static final eeb b = new eeb.a()
      .a(eec.c, $$0 -> $$0)
      .a(eec.d, $$0 -> $$0.a(eee::c))
      .a(eec.e, $$0 -> $$0)
      .a(eec.f, $$0 -> $$0)
      .a(eec.g, $$0 -> $$0)
      .a(eec.h, $$0 -> $$0)
      .a(eec.i, $$0 -> $$0)
      .a(eec.j, $$0 -> $$0)
      .a(eec.k, $$0 -> $$0.a(eee::j))
      .a(eec.l, $$0 -> $$0.a(eec.k, 1).a(eee::k))
      .a(eec.m, $$0 -> $$0)
      .a(eec.n, $$0 -> $$0.a(eee::m))
      .a();

   public eef a(eec $$0) {
      return (eef)this.c.get($$0.b());
   }

   public ImmutableList<eef> a() {
      return this.c;
   }

   public static class a {
      private final List<eef> a = new ArrayList<>();

      public eeb a() {
         return new eeb(ImmutableList.copyOf(this.a));
      }

      public eeb.a a(eec $$0, UnaryOperator<eef.a> $$1) {
         eef.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new eef.a($$0);
         } else {
            $$2 = new eef.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
