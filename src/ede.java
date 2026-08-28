import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record ede(ImmutableList<edi> c) {
   public static final ede a = new ede.a()
      .a(edf.c, $$0 -> $$0)
      .a(edf.d, $$0 -> $$0.a(edh::b))
      .a(edf.e, $$0 -> $$0.a(edf.d, 8).a(edh::d))
      .a(edf.f, $$0 -> $$0.a(edf.d, 8).a(edh::e))
      .a(edf.g, $$0 -> $$0.a(edf.d, 8).a(edf.f, 1).a(0).a(edh::f))
      .a(edf.h, $$0 -> $$0.a(edf.d, 8).a(edf.f, 1).a(0).a(edh::g))
      .a(edf.i, $$0 -> $$0.a(edf.d, 8).a(0).a(edh::h))
      .a(edf.j, $$0 -> $$0.a(edf.d, 8).a(edf.i, 1).a(1).a(edh::i))
      .a(edf.k, $$0 -> $$0.a(edh::j))
      .a(edf.l, $$0 -> $$0.a(edf.k, 1).a(edh::k))
      .a(edf.m, $$0 -> $$0.a(edf.f, 1).a(edh::l))
      .a(edf.n, $$0 -> $$0.a(edh::m))
      .a();
   public static final ede b = new ede.a()
      .a(edf.c, $$0 -> $$0)
      .a(edf.d, $$0 -> $$0.a(edh::c))
      .a(edf.e, $$0 -> $$0)
      .a(edf.f, $$0 -> $$0)
      .a(edf.g, $$0 -> $$0)
      .a(edf.h, $$0 -> $$0)
      .a(edf.i, $$0 -> $$0)
      .a(edf.j, $$0 -> $$0)
      .a(edf.k, $$0 -> $$0.a(edh::j))
      .a(edf.l, $$0 -> $$0.a(edf.k, 1).a(edh::k))
      .a(edf.m, $$0 -> $$0)
      .a(edf.n, $$0 -> $$0.a(edh::m))
      .a();

   public edi a(edf $$0) {
      return (edi)this.c.get($$0.b());
   }

   public ImmutableList<edi> a() {
      return this.c;
   }

   public static class a {
      private final List<edi> a = new ArrayList<>();

      public ede a() {
         return new ede(ImmutableList.copyOf(this.a));
      }

      public ede.a a(edf $$0, UnaryOperator<edi.a> $$1) {
         edi.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new edi.a($$0);
         } else {
            $$2 = new edi.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
