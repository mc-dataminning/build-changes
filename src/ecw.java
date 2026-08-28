import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record ecw(ImmutableList<eda> c) {
   public static final ecw a = new ecw.a()
      .a(ecx.c, $$0 -> $$0)
      .a(ecx.d, $$0 -> $$0.a(ecz::b))
      .a(ecx.e, $$0 -> $$0.a(ecx.d, 8).a(ecz::d))
      .a(ecx.f, $$0 -> $$0.a(ecx.d, 8).a(ecz::e))
      .a(ecx.g, $$0 -> $$0.a(ecx.d, 8).a(ecx.f, 1).a(0).a(ecz::f))
      .a(ecx.h, $$0 -> $$0.a(ecx.d, 8).a(ecx.f, 1).a(0).a(ecz::g))
      .a(ecx.i, $$0 -> $$0.a(ecx.d, 8).a(0).a(ecz::h))
      .a(ecx.j, $$0 -> $$0.a(ecx.d, 8).a(ecx.i, 1).a(1).a(ecz::i))
      .a(ecx.k, $$0 -> $$0.a(ecz::j))
      .a(ecx.l, $$0 -> $$0.a(ecx.k, 1).a(ecz::k))
      .a(ecx.m, $$0 -> $$0.a(ecx.f, 1).a(ecz::l))
      .a(ecx.n, $$0 -> $$0.a(ecz::m))
      .a();
   public static final ecw b = new ecw.a()
      .a(ecx.c, $$0 -> $$0)
      .a(ecx.d, $$0 -> $$0.a(ecz::c))
      .a(ecx.e, $$0 -> $$0)
      .a(ecx.f, $$0 -> $$0)
      .a(ecx.g, $$0 -> $$0)
      .a(ecx.h, $$0 -> $$0)
      .a(ecx.i, $$0 -> $$0)
      .a(ecx.j, $$0 -> $$0)
      .a(ecx.k, $$0 -> $$0.a(ecz::j))
      .a(ecx.l, $$0 -> $$0.a(ecx.k, 1).a(ecz::k))
      .a(ecx.m, $$0 -> $$0)
      .a(ecx.n, $$0 -> $$0.a(ecz::m))
      .a();

   public eda a(ecx $$0) {
      return (eda)this.c.get($$0.b());
   }

   public ImmutableList<eda> a() {
      return this.c;
   }

   public static class a {
      private final List<eda> a = new ArrayList<>();

      public ecw a() {
         return new ecw(ImmutableList.copyOf(this.a));
      }

      public ecw.a a(ecx $$0, UnaryOperator<eda.a> $$1) {
         eda.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new eda.a($$0);
         } else {
            $$2 = new eda.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
