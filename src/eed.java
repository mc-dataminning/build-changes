import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record eed(ImmutableList<eeh> c) {
   public static final eed a = new eed.a()
      .a(eee.c, $$0 -> $$0)
      .a(eee.d, $$0 -> $$0.a(eeg::b))
      .a(eee.e, $$0 -> $$0.a(eee.d, 8).a(eeg::d))
      .a(eee.f, $$0 -> $$0.a(eee.d, 8).a(eeg::e))
      .a(eee.g, $$0 -> $$0.a(eee.d, 8).a(eee.f, 1).a(0).a(eeg::f))
      .a(eee.h, $$0 -> $$0.a(eee.d, 8).a(eee.f, 1).a(0).a(eeg::g))
      .a(eee.i, $$0 -> $$0.a(eee.d, 8).a(0).a(eeg::h))
      .a(eee.j, $$0 -> $$0.a(eee.d, 8).a(eee.i, 1).a(1).a(eeg::i))
      .a(eee.k, $$0 -> $$0.a(eeg::j))
      .a(eee.l, $$0 -> $$0.a(eee.k, 1).a(eeg::k))
      .a(eee.m, $$0 -> $$0.a(eee.f, 1).a(eeg::l))
      .a(eee.n, $$0 -> $$0.a(eeg::m))
      .a();
   public static final eed b = new eed.a()
      .a(eee.c, $$0 -> $$0)
      .a(eee.d, $$0 -> $$0.a(eeg::c))
      .a(eee.e, $$0 -> $$0)
      .a(eee.f, $$0 -> $$0)
      .a(eee.g, $$0 -> $$0)
      .a(eee.h, $$0 -> $$0)
      .a(eee.i, $$0 -> $$0)
      .a(eee.j, $$0 -> $$0)
      .a(eee.k, $$0 -> $$0.a(eeg::j))
      .a(eee.l, $$0 -> $$0.a(eee.k, 1).a(eeg::k))
      .a(eee.m, $$0 -> $$0)
      .a(eee.n, $$0 -> $$0.a(eeg::m))
      .a();

   public eeh a(eee $$0) {
      return (eeh)this.c.get($$0.b());
   }

   public ImmutableList<eeh> a() {
      return this.c;
   }

   public static class a {
      private final List<eeh> a = new ArrayList<>();

      public eed a() {
         return new eed(ImmutableList.copyOf(this.a));
      }

      public eed.a a(eee $$0, UnaryOperator<eeh.a> $$1) {
         eeh.a $$2;
         if (this.a.isEmpty()) {
            $$2 = new eeh.a($$0);
         } else {
            $$2 = new eeh.a($$0, this.a.getLast());
         }

         this.a.add($$1.apply($$2).a());
         return this;
      }
   }
}
