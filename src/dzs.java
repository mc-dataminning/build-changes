import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record dzs(ImmutableList<dzw> c) {
   public static final dzs a = new dzs.a()
      .a(dzt.c, $$0 -> $$0)
      .a(dzt.d, $$0 -> $$0.a(dzv::b))
      .a(dzt.e, $$0 -> $$0.a(dzt.d, 8).a(dzv::d))
      .a(dzt.f, $$0 -> $$0.a(dzt.d, 8).a(dzv::e))
      .a(dzt.g, $$0 -> $$0.a(dzt.d, 8).a(dzt.f, 1).a(0).a(dzv::f))
      .a(dzt.h, $$0 -> $$0.a(dzt.d, 8).a(dzt.f, 1).a(0).a(dzv::g))
      .a(dzt.i, $$0 -> $$0.a(dzt.d, 8).a(0).a(dzv::h))
      .a(dzt.j, $$0 -> $$0.a(dzt.d, 8).a(dzt.i, 1).a(1).a(dzv::i))
      .a(dzt.k, $$0 -> $$0.a(dzv::j))
      .a(dzt.l, $$0 -> $$0.a(dzt.k, 1).a(dzv::k))
      .a(dzt.m, $$0 -> $$0.a(dzt.f, 1).a(dzv::l))
      .a(dzt.n, $$0 -> $$0.a(dzv::m))
      .a();
   public static final dzs b = new dzs.a()
      .a(dzt.c, $$0 -> $$0)
      .a(dzt.d, $$0 -> $$0.a(dzv::c))
      .a(dzt.e, $$0 -> $$0)
      .a(dzt.f, $$0 -> $$0)
      .a(dzt.g, $$0 -> $$0)
      .a(dzt.h, $$0 -> $$0)
      .a(dzt.i, $$0 -> $$0)
      .a(dzt.j, $$0 -> $$0)
      .a(dzt.k, $$0 -> $$0.a(dzv::j))
      .a(dzt.l, $$0 -> $$0.a(dzt.k, 1).a(dzv::k))
      .a(dzt.m, $$0 -> $$0)
      .a(dzt.n, $$0 -> $$0.a(dzv::m))
      .a();

   public dzw a(dzt $$0) {
      return (dzw)this.c.get($$0.b());
   }

   public ImmutableList<dzw> a() {
      return this.c;
   }

   public static class a {
      private final List<dzw> a = new ArrayList<>();

      public dzs a() {
         return new dzs(ImmutableList.copyOf(this.a));
      }

      public dzs.a a(dzt $$0, UnaryOperator<dzw.a> $$1) {
         dzw.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new dzw.a($$0);
         } else {
            $$2 = new dzw.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
