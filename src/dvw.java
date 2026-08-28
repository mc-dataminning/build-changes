import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record dvw(ImmutableList<dwa> c) {
   public static final dvw a = new dvw.a()
      .a(dvx.c, $$0 -> $$0)
      .a(dvx.d, $$0 -> $$0.a(dvz::b))
      .a(dvx.e, $$0 -> $$0.a(dvx.d, 8).a(dvz::d))
      .a(dvx.f, $$0 -> $$0.a(dvx.d, 8).a(dvz::e))
      .a(dvx.g, $$0 -> $$0.a(dvx.d, 8).a(dvx.f, 1).a(0).a(dvz::f))
      .a(dvx.h, $$0 -> $$0.a(dvx.d, 8).a(dvx.f, 1).a(0).a(dvz::g))
      .a(dvx.i, $$0 -> $$0.a(dvx.d, 8).a(0).a(dvz::h))
      .a(dvx.j, $$0 -> $$0.a(dvx.d, 8).a(dvx.i, 1).a(1).a(dvz::i))
      .a(dvx.k, $$0 -> $$0.a(dvz::j))
      .a(dvx.l, $$0 -> $$0.a(dvx.k, 1).a(dvz::k))
      .a(dvx.m, $$0 -> $$0.a(dvx.f, 1).a(dvz::l))
      .a(dvx.n, $$0 -> $$0.a(dvz::m))
      .a();
   public static final dvw b = new dvw.a()
      .a(dvx.c, $$0 -> $$0)
      .a(dvx.d, $$0 -> $$0.a(dvz::c))
      .a(dvx.e, $$0 -> $$0)
      .a(dvx.f, $$0 -> $$0)
      .a(dvx.g, $$0 -> $$0)
      .a(dvx.h, $$0 -> $$0)
      .a(dvx.i, $$0 -> $$0)
      .a(dvx.j, $$0 -> $$0)
      .a(dvx.k, $$0 -> $$0.a(dvz::j))
      .a(dvx.l, $$0 -> $$0.a(dvx.k, 1).a(dvz::k))
      .a(dvx.m, $$0 -> $$0)
      .a(dvx.n, $$0 -> $$0.a(dvz::m))
      .a();

   public dwa a(dvx $$0) {
      return (dwa)this.c.get($$0.b());
   }

   public ImmutableList<dwa> a() {
      return this.c;
   }

   public static class a {
      private final List<dwa> a = new ArrayList<>();

      public dvw a() {
         return new dvw(ImmutableList.copyOf(this.a));
      }

      public dvw.a a(dvx $$0, UnaryOperator<dwa.a> $$1) {
         dwa.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new dwa.a($$0);
         } else {
            $$2 = new dwa.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
