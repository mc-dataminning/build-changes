import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record dvg(ImmutableList<dvk> c) {
   public static final dvg a = new dvg.a()
      .a(dvh.c, $$0 -> $$0)
      .a(dvh.d, $$0 -> $$0.a(dvj::b))
      .a(dvh.e, $$0 -> $$0.a(dvh.d, 8).a(dvj::d))
      .a(dvh.f, $$0 -> $$0.a(dvh.d, 8).a(dvj::e))
      .a(dvh.g, $$0 -> $$0.a(dvh.d, 8).a(dvh.f, 1).a(0).a(dvj::f))
      .a(dvh.h, $$0 -> $$0.a(dvh.d, 8).a(dvh.f, 1).a(0).a(dvj::g))
      .a(dvh.i, $$0 -> $$0.a(dvh.d, 8).a(0).a(dvj::h))
      .a(dvh.j, $$0 -> $$0.a(dvh.d, 8).a(dvh.i, 1).a(1).a(dvj::i))
      .a(dvh.k, $$0 -> $$0.a(dvj::j))
      .a(dvh.l, $$0 -> $$0.a(dvh.k, 1).a(dvj::k))
      .a(dvh.m, $$0 -> $$0.a(dvh.f, 1).a(dvj::l))
      .a(dvh.n, $$0 -> $$0.a(dvj::m))
      .a();
   public static final dvg b = new dvg.a()
      .a(dvh.c, $$0 -> $$0)
      .a(dvh.d, $$0 -> $$0.a(dvj::c))
      .a(dvh.e, $$0 -> $$0)
      .a(dvh.f, $$0 -> $$0)
      .a(dvh.g, $$0 -> $$0)
      .a(dvh.h, $$0 -> $$0)
      .a(dvh.i, $$0 -> $$0)
      .a(dvh.j, $$0 -> $$0)
      .a(dvh.k, $$0 -> $$0.a(dvj::j))
      .a(dvh.l, $$0 -> $$0.a(dvh.k, 1).a(dvj::k))
      .a(dvh.m, $$0 -> $$0)
      .a(dvh.n, $$0 -> $$0.a(dvj::m))
      .a();

   public dvk a(dvh $$0) {
      return (dvk)this.c.get($$0.b());
   }

   public ImmutableList<dvk> a() {
      return this.c;
   }

   public static class a {
      private final List<dvk> a = new ArrayList<>();

      public dvg a() {
         return new dvg(ImmutableList.copyOf(this.a));
      }

      public dvg.a a(dvh $$0, UnaryOperator<dvk.a> $$1) {
         dvk.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new dvk.a($$0);
         } else {
            $$2 = new dvk.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
