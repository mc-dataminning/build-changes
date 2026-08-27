import com.google.common.collect.Lists;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class fil implements du {
   private final fij a;
   private final eqm b;
   private int c = -1;
   @Nullable
   private CompletableFuture<Suggestions> d;
   private final Set<String> e = new HashSet<>();

   public fil(fij $$0, eqm $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public Collection<String> q() {
      List<String> $$0 = Lists.newArrayList();

      for (fiq $$1 : this.a.n()) {
         $$0.add($$1.a().getName());
      }

      return $$0;
   }

   @Override
   public Collection<String> x() {
      if (this.e.isEmpty()) {
         return this.q();
      } else {
         Set<String> $$0 = new HashSet<>(this.q());
         $$0.addAll(this.e);
         return $$0;
      }
   }

   @Override
   public Collection<String> y() {
      return (Collection<String>)(this.b.y != null && this.b.y.c() == ehc.a.c ? Collections.singleton(((ehb)this.b.y).a().cw()) : Collections.emptyList());
   }

   @Override
   public Collection<String> r() {
      return this.a.s().I().f();
   }

   @Override
   public Stream<aer> s() {
      return this.b.ai().b().stream();
   }

   @Override
   public Stream<aer> t() {
      return this.a.k().d();
   }

   @Override
   public boolean c(int $$0) {
      fmn $$1 = this.b.v;
      return $$1 != null ? $$1.l($$0) : $$0 == 0;
   }

   @Override
   public CompletableFuture<Suggestions> a(aeq<? extends hr<?>> $$0, du.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      return this.v().c($$0).map($$2x -> {
         this.a($$2x, $$1, $$2);
         return $$2.buildFuture();
      }).orElseGet(() -> this.a($$3));
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      if (this.d != null) {
         this.d.cancel(false);
      }

      this.d = new CompletableFuture<>();
      int $$1 = ++this.c;
      this.a.b(new abj($$1, $$0.getInput()));
      return this.d;
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.2f", $$0);
   }

   private static String a(int $$0) {
      return Integer.toString($$0);
   }

   @Override
   public Collection<du.b> z() {
      ehc $$0 = this.b.y;
      if ($$0 != null && $$0.c() == ehc.a.b) {
         gu $$1 = ((eha)$$0).a();
         return Collections.singleton(new du.b(a($$1.u()), a($$1.v()), a($$1.w())));
      } else {
         return du.super.z();
      }
   }

   @Override
   public Collection<du.b> A() {
      ehc $$0 = this.b.y;
      if ($$0 != null && $$0.c() == ehc.a.b) {
         ehe $$1 = $$0.e();
         return Collections.singleton(new du.b(a($$1.c), a($$1.d), a($$1.e)));
      } else {
         return du.super.A();
      }
   }

   @Override
   public Set<aeq<cpm>> u() {
      return this.a.v();
   }

   @Override
   public hs v() {
      return this.a.f();
   }

   @Override
   public cdv w() {
      return this.a.x();
   }

   public void a(int $$0, Suggestions $$1) {
      if ($$0 == this.c) {
         this.d.complete($$1);
         this.d = null;
         this.c = -1;
      }
   }

   public void a(xo.a $$0, List<String> $$1) {
      switch ($$0) {
         case a:
            this.e.addAll($$1);
            break;
         case b:
            $$1.forEach(this.e::remove);
            break;
         case c:
            this.e.clear();
            this.e.addAll($$1);
      }
   }
}
