import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.datafixers.util.Either;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fi {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ti.c("argument.block.tag.disallowed"));
   public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ti.a("argument.block.id.invalid", $$0));
   public static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> ti.a("argument.block.property.unknown", $$0, $$1));
   public static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> ti.a("argument.block.property.duplicate", $$1, $$0));
   public static final Dynamic3CommandExceptionType e = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> ti.a("argument.block.property.invalid", $$0, $$2, $$1)
   );
   public static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> ti.a("argument.block.property.novalue", $$0, $$1));
   public static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(ti.c("argument.block.property.unclosed"));
   public static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> ti.a("arguments.block.tag.unknown", $$0));
   private static final char i = '[';
   private static final char j = '{';
   private static final char k = ']';
   private static final char l = '=';
   private static final char m = ',';
   private static final char n = '#';
   private static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> o = SuggestionsBuilder::buildFuture;
   private final hi<csq> p;
   private final StringReader q;
   private final boolean r;
   private final boolean s;
   private final Map<dgh<?>, Comparable<?>> t = Maps.newHashMap();
   private final Map<String, String> u = Maps.newHashMap();
   private aeu v = new aeu("");
   @Nullable
   private dff<csq, dfe> w;
   @Nullable
   private dfe x;
   @Nullable
   private qu y;
   @Nullable
   private hk<csq> z;
   private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> A = o;

   private fi(hi<csq> $$0, StringReader $$1, boolean $$2, boolean $$3) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.s = $$3;
   }

   public static fi.a a(hi<csq> $$0, String $$1, boolean $$2) throws CommandSyntaxException {
      return a($$0, new StringReader($$1), $$2);
   }

   public static fi.a a(hi<csq> $$0, StringReader $$1, boolean $$2) throws CommandSyntaxException {
      int $$3 = $$1.getCursor();

      try {
         fi $$4 = new fi($$0, $$1, false, $$2);
         $$4.a();
         return new fi.a($$4.x, $$4.t, $$4.y);
      } catch (CommandSyntaxException var5) {
         $$1.setCursor($$3);
         throw var5;
      }
   }

   public static Either<fi.a, fi.b> b(hi<csq> $$0, String $$1, boolean $$2) throws CommandSyntaxException {
      return b($$0, new StringReader($$1), $$2);
   }

   public static Either<fi.a, fi.b> b(hi<csq> $$0, StringReader $$1, boolean $$2) throws CommandSyntaxException {
      int $$3 = $$1.getCursor();

      try {
         fi $$4 = new fi($$0, $$1, true, $$2);
         $$4.a();
         return $$4.z != null ? Either.right(new fi.b($$4.z, $$4.u, $$4.y)) : Either.left(new fi.a($$4.x, $$4.t, $$4.y));
      } catch (CommandSyntaxException var5) {
         $$1.setCursor($$3);
         throw var5;
      }
   }

   public static CompletableFuture<Suggestions> a(hi<csq> $$0, SuggestionsBuilder $$1, boolean $$2, boolean $$3) {
      StringReader $$4 = new StringReader($$1.getInput());
      $$4.setCursor($$1.getStart());
      fi $$5 = new fi($$0, $$4, $$2, $$3);

      try {
         $$5.a();
      } catch (CommandSyntaxException var7) {
      }

      return $$5.A.apply($$1.createOffset($$4.getCursor()));
   }

   private void a() throws CommandSyntaxException {
      if (this.r) {
         this.A = this::l;
      } else {
         this.A = this::k;
      }

      if (this.q.canRead() && this.q.peek() == '#') {
         this.d();
         this.A = this::h;
         if (this.q.canRead() && this.q.peek() == '[') {
            this.f();
            this.A = this::e;
         }
      } else {
         this.c();
         this.A = this::i;
         if (this.q.canRead() && this.q.peek() == '[') {
            this.e();
            this.A = this::e;
         }
      }

      if (this.s && this.q.canRead() && this.q.peek() == '{') {
         this.A = o;
         this.g();
      }
   }

   private CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      if ($$0.getRemaining().isEmpty()) {
         $$0.suggest(String.valueOf(']'));
      }

      return this.c($$0);
   }

   private CompletableFuture<Suggestions> b(SuggestionsBuilder $$0) {
      if ($$0.getRemaining().isEmpty()) {
         $$0.suggest(String.valueOf(']'));
      }

      return this.d($$0);
   }

   private CompletableFuture<Suggestions> c(SuggestionsBuilder $$0) {
      String $$1 = $$0.getRemaining().toLowerCase(Locale.ROOT);

      for (dgh<?> $$2 : this.x.B()) {
         if (!this.t.containsKey($$2) && $$2.f().startsWith($$1)) {
            $$0.suggest($$2.f() + "=");
         }
      }

      return $$0.buildFuture();
   }

   private CompletableFuture<Suggestions> d(SuggestionsBuilder $$0) {
      String $$1 = $$0.getRemaining().toLowerCase(Locale.ROOT);
      if (this.z != null) {
         for (hg<csq> $$2 : this.z) {
            for (dgh<?> $$3 : $$2.a().l().d()) {
               if (!this.u.containsKey($$3.f()) && $$3.f().startsWith($$1)) {
                  $$0.suggest($$3.f() + "=");
               }
            }
         }
      }

      return $$0.buildFuture();
   }

   private CompletableFuture<Suggestions> e(SuggestionsBuilder $$0) {
      if ($$0.getRemaining().isEmpty() && this.b()) {
         $$0.suggest(String.valueOf('{'));
      }

      return $$0.buildFuture();
   }

   private boolean b() {
      if (this.x != null) {
         return this.x.t();
      } else {
         if (this.z != null) {
            for (hg<csq> $$0 : this.z) {
               if ($$0.a().n().t()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private CompletableFuture<Suggestions> f(SuggestionsBuilder $$0) {
      if ($$0.getRemaining().isEmpty()) {
         $$0.suggest(String.valueOf('='));
      }

      return $$0.buildFuture();
   }

   private CompletableFuture<Suggestions> g(SuggestionsBuilder $$0) {
      if ($$0.getRemaining().isEmpty()) {
         $$0.suggest(String.valueOf(']'));
      }

      if ($$0.getRemaining().isEmpty() && this.t.size() < this.x.B().size()) {
         $$0.suggest(String.valueOf(','));
      }

      return $$0.buildFuture();
   }

   private static <T extends Comparable<T>> SuggestionsBuilder a(SuggestionsBuilder $$0, dgh<T> $$1) {
      for (T $$2 : $$1.a()) {
         if ($$2 instanceof Integer $$3) {
            $$0.suggest($$3);
         } else {
            $$0.suggest($$1.a($$2));
         }
      }

      return $$0;
   }

   private CompletableFuture<Suggestions> a(SuggestionsBuilder $$0, String $$1) {
      boolean $$2 = false;
      if (this.z != null) {
         for (hg<csq> $$3 : this.z) {
            csq $$4 = $$3.a();
            dgh<?> $$5 = $$4.l().a($$1);
            if ($$5 != null) {
               a($$0, $$5);
            }

            if (!$$2) {
               for (dgh<?> $$6 : $$4.l().d()) {
                  if (!this.u.containsKey($$6.f())) {
                     $$2 = true;
                     break;
                  }
               }
            }
         }
      }

      if ($$2) {
         $$0.suggest(String.valueOf(','));
      }

      $$0.suggest(String.valueOf(']'));
      return $$0.buildFuture();
   }

   private CompletableFuture<Suggestions> h(SuggestionsBuilder $$0) {
      if ($$0.getRemaining().isEmpty() && this.z != null) {
         boolean $$1 = false;
         boolean $$2 = false;

         for (hg<csq> $$3 : this.z) {
            csq $$4 = $$3.a();
            $$1 |= !$$4.l().d().isEmpty();
            $$2 |= $$4.n().t();
            if ($$1 && $$2) {
               break;
            }
         }

         if ($$1) {
            $$0.suggest(String.valueOf('['));
         }

         if ($$2) {
            $$0.suggest(String.valueOf('{'));
         }
      }

      return $$0.buildFuture();
   }

   private CompletableFuture<Suggestions> i(SuggestionsBuilder $$0) {
      if ($$0.getRemaining().isEmpty()) {
         if (!this.w.d().isEmpty()) {
            $$0.suggest(String.valueOf('['));
         }

         if (this.x.t()) {
            $$0.suggest(String.valueOf('{'));
         }
      }

      return $$0.buildFuture();
   }

   private CompletableFuture<Suggestions> j(SuggestionsBuilder $$0) {
      return dw.a(this.p.e().map(aqd::b), $$0, String.valueOf('#'));
   }

   private CompletableFuture<Suggestions> k(SuggestionsBuilder $$0) {
      return dw.a(this.p.c().map(aet::a), $$0);
   }

   private CompletableFuture<Suggestions> l(SuggestionsBuilder $$0) {
      this.j($$0);
      this.k($$0);
      return $$0.buildFuture();
   }

   private void c() throws CommandSyntaxException {
      int $$0 = this.q.getCursor();
      this.v = aeu.a(this.q);
      csq $$1 = this.p.a(aet.a(je.e, this.v)).orElseThrow(() -> {
         this.q.setCursor($$0);
         return b.createWithContext(this.q, this.v.toString());
      }).a();
      this.w = $$1.l();
      this.x = $$1.n();
   }

   private void d() throws CommandSyntaxException {
      if (!this.r) {
         throw a.createWithContext(this.q);
      } else {
         int $$0 = this.q.getCursor();
         this.q.expect('#');
         this.A = this::j;
         aeu $$1 = aeu.a(this.q);
         this.z = this.p.a(aqd.a(je.e, $$1)).orElseThrow(() -> {
            this.q.setCursor($$0);
            return h.createWithContext(this.q, $$1.toString());
         });
      }
   }

   private void e() throws CommandSyntaxException {
      this.q.skip();
      this.A = this::a;
      this.q.skipWhitespace();

      while (this.q.canRead() && this.q.peek() != ']') {
         this.q.skipWhitespace();
         int $$0 = this.q.getCursor();
         String $$1 = this.q.readString();
         dgh<?> $$2 = this.w.a($$1);
         if ($$2 == null) {
            this.q.setCursor($$0);
            throw c.createWithContext(this.q, this.v.toString(), $$1);
         }

         if (this.t.containsKey($$2)) {
            this.q.setCursor($$0);
            throw d.createWithContext(this.q, this.v.toString(), $$1);
         }

         this.q.skipWhitespace();
         this.A = this::f;
         if (!this.q.canRead() || this.q.peek() != '=') {
            throw f.createWithContext(this.q, this.v.toString(), $$1);
         }

         this.q.skip();
         this.q.skipWhitespace();
         this.A = $$1x -> a($$1x, $$2).buildFuture();
         int $$3 = this.q.getCursor();
         this.a($$2, this.q.readString(), $$3);
         this.A = this::g;
         this.q.skipWhitespace();
         if (this.q.canRead()) {
            if (this.q.peek() != ',') {
               if (this.q.peek() != ']') {
                  throw g.createWithContext(this.q);
               }
               break;
            }

            this.q.skip();
            this.A = this::c;
         }
      }

      if (this.q.canRead()) {
         this.q.skip();
      } else {
         throw g.createWithContext(this.q);
      }
   }

   private void f() throws CommandSyntaxException {
      this.q.skip();
      this.A = this::b;
      int $$0 = -1;
      this.q.skipWhitespace();

      while (this.q.canRead() && this.q.peek() != ']') {
         this.q.skipWhitespace();
         int $$1 = this.q.getCursor();
         String $$2 = this.q.readString();
         if (this.u.containsKey($$2)) {
            this.q.setCursor($$1);
            throw d.createWithContext(this.q, this.v.toString(), $$2);
         }

         this.q.skipWhitespace();
         if (!this.q.canRead() || this.q.peek() != '=') {
            this.q.setCursor($$1);
            throw f.createWithContext(this.q, this.v.toString(), $$2);
         }

         this.q.skip();
         this.q.skipWhitespace();
         this.A = $$1x -> this.a($$1x, $$2);
         $$0 = this.q.getCursor();
         String $$3 = this.q.readString();
         this.u.put($$2, $$3);
         this.q.skipWhitespace();
         if (this.q.canRead()) {
            $$0 = -1;
            if (this.q.peek() != ',') {
               if (this.q.peek() != ']') {
                  throw g.createWithContext(this.q);
               }
               break;
            }

            this.q.skip();
            this.A = this::d;
         }
      }

      if (this.q.canRead()) {
         this.q.skip();
      } else {
         if ($$0 >= 0) {
            this.q.setCursor($$0);
         }

         throw g.createWithContext(this.q);
      }
   }

   private void g() throws CommandSyntaxException {
      this.y = new ro(this.q).f();
   }

   private <T extends Comparable<T>> void a(dgh<T> $$0, String $$1, int $$2) throws CommandSyntaxException {
      Optional<T> $$3 = $$0.b($$1);
      if ($$3.isPresent()) {
         this.x = this.x.a($$0, $$3.get());
         this.t.put($$0, $$3.get());
      } else {
         this.q.setCursor($$2);
         throw e.createWithContext(this.q, this.v.toString(), $$0.f(), $$1);
      }
   }

   public static String a(dfe $$0) {
      StringBuilder $$1 = new StringBuilder($$0.c().e().map($$0x -> $$0x.a().toString()).orElse("air"));
      if (!$$0.B().isEmpty()) {
         $$1.append('[');
         boolean $$2 = false;

         for (UnmodifiableIterator var3 = $$0.C().entrySet().iterator(); var3.hasNext(); $$2 = true) {
            Entry<dgh<?>, Comparable<?>> $$3 = (Entry<dgh<?>, Comparable<?>>)var3.next();
            if ($$2) {
               $$1.append(',');
            }

            a($$1, $$3.getKey(), $$3.getValue());
         }

         $$1.append(']');
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> void a(StringBuilder $$0, dgh<T> $$1, Comparable<?> $$2) {
      $$0.append($$1.f());
      $$0.append('=');
      $$0.append($$1.a((T)$$2));
   }

   public static record a(dfe a, Map<dgh<?>, Comparable<?>> b, @Nullable qu c) {
   }

   public static record b(hk<csq> a, Map<String, String> b, @Nullable qu c) {
   }
}
