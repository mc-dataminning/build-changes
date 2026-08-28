import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record dzt(ImmutableList<dzx> c) {
   public static final dzt a = new dzt.a()
      .a(dzu.c, $$0 -> $$0)
      .a(dzu.d, $$0 -> $$0.a(dzw::b))
      .a(dzu.e, $$0 -> $$0.a(dzu.d, 8).a(dzw::d))
      .a(dzu.f, $$0 -> $$0.a(dzu.d, 8).a(dzw::e))
      .a(dzu.g, $$0 -> $$0.a(dzu.d, 8).a(dzu.f, 1).a(0).a(dzw::f))
      .a(dzu.h, $$0 -> $$0.a(dzu.d, 8).a(dzu.f, 1).a(0).a(dzw::g))
      .a(dzu.i, $$0 -> $$0.a(dzu.d, 8).a(0).a(dzw::h))
      .a(dzu.j, $$0 -> $$0.a(dzu.d, 8).a(dzu.i, 1).a(1).a(dzw::i))
      .a(dzu.k, $$0 -> $$0.a(dzw::j))
      .a(dzu.l, $$0 -> $$0.a(dzu.k, 1).a(dzw::k))
      .a(dzu.m, $$0 -> $$0.a(dzu.f, 1).a(dzw::l))
      .a(dzu.n, $$0 -> $$0.a(dzw::m))
      .a();
   public static final dzt b = new dzt.a()
      .a(dzu.c, $$0 -> $$0)
      .a(dzu.d, $$0 -> $$0.a(dzw::c))
      .a(dzu.e, $$0 -> $$0)
      .a(dzu.f, $$0 -> $$0)
      .a(dzu.g, $$0 -> $$0)
      .a(dzu.h, $$0 -> $$0)
      .a(dzu.i, $$0 -> $$0)
      .a(dzu.j, $$0 -> $$0)
      .a(dzu.k, $$0 -> $$0.a(dzw::j))
      .a(dzu.l, $$0 -> $$0.a(dzu.k, 1).a(dzw::k))
      .a(dzu.m, $$0 -> $$0)
      .a(dzu.n, $$0 -> $$0.a(dzw::m))
      .a();

   public dzx a(dzu $$0) {
      return (dzx)this.c.get($$0.b());
   }

   public ImmutableList<dzx> a() {
      return this.c;
   }

   public static class a {
      private final List<dzx> a = new ArrayList<>();

      public dzt a() {
         return new dzt(ImmutableList.copyOf(this.a));
      }

      public dzt.a a(dzu $$0, UnaryOperator<dzx.a> $$1) {
         dzx.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new dzx.a($$0);
         } else {
            $$2 = new dzx.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
