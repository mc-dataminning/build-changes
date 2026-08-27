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

public class flr implements dy {
   private final flp a;
   private final eti b;
   private int c = -1;
   @Nullable
   private CompletableFuture<Suggestions> d;
   private final Set<String> e = new HashSet<>();

   public flr(flp $$0, eti $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public Collection<String> q() {
      List<String> $$0 = Lists.newArrayList();

      for (flx $$1 : this.a.o()) {
         $$0.add($$1.a().getName());
      }

      return $$0;
   }

   @Override
   public Collection<String> z() {
      if (this.e.isEmpty()) {
         return this.q();
      } else {
         Set<String> $$0 = new HashSet<>(this.q());
         $$0.addAll(this.e);
         return $$0;
      }
   }

   @Override
   public Collection<String> A() {
      return (Collection<String>)(this.b.v != null && this.b.v.c() == ejx.a.c ? Collections.singleton(((ejw)this.b.v).a().cx()) : Collections.emptyList());
   }

   @Override
   public Collection<String> r() {
      return this.a.t().J().f();
   }

   @Override
   public Stream<agm> s() {
      return this.b.ah().b().stream();
   }

   @Override
   public Stream<agm> t() {
      return this.a.l().d();
   }

   @Override
   public boolean c(int $$0) {
      fqb $$1 = this.b.s;
      return $$1 != null ? $$1.l($$0) : $$0 == 0;
   }

   @Override
   public CompletableFuture<Suggestions> a(agl<? extends is<?>> $$0, dy.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
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
      this.a.b(new adb($$1, $$0.getInput()));
      return this.d;
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.2f", $$0);
   }

   private static String a(int $$0) {
      return Integer.toString($$0);
   }

   @Override
   public Collection<dy.b> B() {
      ejx $$0 = this.b.v;
      if ($$0 != null && $$0.c() == ejx.a.b) {
         hx $$1 = ((ejv)$$0).a();
         return Collections.singleton(new dy.b(a($$1.u()), a($$1.v()), a($$1.w())));
      } else {
         return dy.super.B();
      }
   }

   @Override
   public Collection<dy.b> C() {
      ejx $$0 = this.b.v;
      if ($$0 != null && $$0.c() == ejx.a.b) {
         ejz $$1 = $$0.e();
         return Collections.singleton(new dy.b(a($$1.c), a($$1.d), a($$1.e)));
      } else {
         return dy.super.C();
      }
   }

   @Override
   public Set<agl<csf>> u() {
      return this.a.w();
   }

   @Override
   public it v() {
      return this.a.f();
   }

   @Override
   public cgi w() {
      return this.a.y();
   }

   public void a(int $$0, Suggestions $$1) {
      if ($$0 == this.c) {
         this.d.complete($$1);
         this.d = null;
         this.c = -1;
      }
   }

   public void a(zf.a $$0, List<String> $$1) {
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
