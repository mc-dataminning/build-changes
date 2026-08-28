import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface eu {
   Collection<String> q();

   default Collection<String> z() {
      return this.q();
   }

   default Collection<String> A() {
      return Collections.emptyList();
   }

   Collection<String> r();

   Stream<alb> s();

   Stream<alb> t();

   CompletableFuture<Suggestions> a(CommandContext<?> var1);

   default Collection<eu.b> B() {
      return Collections.singleton(eu.b.b);
   }

   default Collection<eu.b> C() {
      return Collections.singleton(eu.b.b);
   }

   Set<ala<dbt>> u();

   jw v();

   cpg w();

   default void a(jv<?> $$0, eu.a $$1, SuggestionsBuilder $$2) {
      if ($$1.a()) {
         a($$0.j().map(axb::b), $$2, "#");
      }

      if ($$1.b()) {
         a($$0.e(), $$2);
      }
   }

   CompletableFuture<Suggestions> a(ala<? extends jv<?>> var1, eu.a var2, SuggestionsBuilder var3, CommandContext<?> var4);

   boolean c(int var1);

   static <T> void a(Iterable<T> $$0, String $$1, Function<T, alb> $$2, Consumer<T> $$3) {
      boolean $$4 = $$1.indexOf(58) > -1;

      for (T $$5 : $$0) {
         alb $$6 = $$2.apply($$5);
         if ($$4) {
            String $$7 = $$6.toString();
            if (a($$1, $$7)) {
               $$3.accept($$5);
            }
         } else if (a($$1, $$6.b()) || $$6.b().equals("minecraft") && a($$1, $$6.a())) {
            $$3.accept($$5);
         }
      }
   }

   static <T> void a(Iterable<T> $$0, String $$1, String $$2, Function<T, alb> $$3, Consumer<T> $$4) {
      if ($$1.isEmpty()) {
         $$0.forEach($$4);
      } else {
         String $$5 = Strings.commonPrefix($$1, $$2);
         if (!$$5.isEmpty()) {
            String $$6 = $$1.substring($$5.length());
            a($$0, $$6, $$3, $$4);
         }
      }
   }

   static CompletableFuture<Suggestions> a(Iterable<alb> $$0, SuggestionsBuilder $$1, String $$2) {
      String $$3 = $$1.getRemaining().toLowerCase(Locale.ROOT);
      a($$0, $$3, $$2, $$0x -> $$0x, $$2x -> $$1.suggest($$2 + $$2x));
      return $$1.buildFuture();
   }

   static CompletableFuture<Suggestions> a(Stream<alb> $$0, SuggestionsBuilder $$1, String $$2) {
      return a($$0::iterator, $$1, $$2);
   }

   static CompletableFuture<Suggestions> a(Iterable<alb> $$0, SuggestionsBuilder $$1) {
      String $$2 = $$1.getRemaining().toLowerCase(Locale.ROOT);
      a($$0, $$2, $$0x -> $$0x, $$1x -> $$1.suggest($$1x.toString()));
      return $$1.buildFuture();
   }

   static <T> CompletableFuture<Suggestions> a(Iterable<T> $$0, SuggestionsBuilder $$1, Function<T, alb> $$2, Function<T, Message> $$3) {
      String $$4 = $$1.getRemaining().toLowerCase(Locale.ROOT);
      a($$0, $$4, $$2, $$3x -> $$1.suggest($$2.apply((T)$$3x).toString(), $$3.apply((T)$$3x)));
      return $$1.buildFuture();
   }

   static CompletableFuture<Suggestions> a(Stream<alb> $$0, SuggestionsBuilder $$1) {
      return a($$0::iterator, $$1);
   }

   static <T> CompletableFuture<Suggestions> a(Stream<T> $$0, SuggestionsBuilder $$1, Function<T, alb> $$2, Function<T, Message> $$3) {
      return a($$0::iterator, $$1, $$2, $$3);
   }

   static CompletableFuture<Suggestions> a(String $$0, Collection<eu.b> $$1, SuggestionsBuilder $$2, Predicate<String> $$3) {
      List<String> $$4 = Lists.newArrayList();
      if (Strings.isNullOrEmpty($$0)) {
         for (eu.b $$5 : $$1) {
            String $$6 = $$5.c + " " + $$5.d + " " + $$5.e;
            if ($$3.test($$6)) {
               $$4.add($$5.c);
               $$4.add($$5.c + " " + $$5.d);
               $$4.add($$6);
            }
         }
      } else {
         String[] $$7 = $$0.split(" ");
         if ($$7.length == 1) {
            for (eu.b $$8 : $$1) {
               String $$9 = $$7[0] + " " + $$8.d + " " + $$8.e;
               if ($$3.test($$9)) {
                  $$4.add($$7[0] + " " + $$8.d);
                  $$4.add($$9);
               }
            }
         } else if ($$7.length == 2) {
            for (eu.b $$10 : $$1) {
               String $$11 = $$7[0] + " " + $$7[1] + " " + $$10.e;
               if ($$3.test($$11)) {
                  $$4.add($$11);
               }
            }
         }
      }

      return b($$4, $$2);
   }

   static CompletableFuture<Suggestions> b(String $$0, Collection<eu.b> $$1, SuggestionsBuilder $$2, Predicate<String> $$3) {
      List<String> $$4 = Lists.newArrayList();
      if (Strings.isNullOrEmpty($$0)) {
         for (eu.b $$5 : $$1) {
            String $$6 = $$5.c + " " + $$5.e;
            if ($$3.test($$6)) {
               $$4.add($$5.c);
               $$4.add($$6);
            }
         }
      } else {
         String[] $$7 = $$0.split(" ");
         if ($$7.length == 1) {
            for (eu.b $$8 : $$1) {
               String $$9 = $$7[0] + " " + $$8.e;
               if ($$3.test($$9)) {
                  $$4.add($$9);
               }
            }
         }
      }

      return b($$4, $$2);
   }

   static CompletableFuture<Suggestions> b(Iterable<String> $$0, SuggestionsBuilder $$1) {
      String $$2 = $$1.getRemaining().toLowerCase(Locale.ROOT);

      for (String $$3 : $$0) {
         if (a($$2, $$3.toLowerCase(Locale.ROOT))) {
            $$1.suggest($$3);
         }
      }

      return $$1.buildFuture();
   }

   static CompletableFuture<Suggestions> b(Stream<String> $$0, SuggestionsBuilder $$1) {
      String $$2 = $$1.getRemaining().toLowerCase(Locale.ROOT);
      $$0.filter($$1x -> a($$2, $$1x.toLowerCase(Locale.ROOT))).forEach($$1::suggest);
      return $$1.buildFuture();
   }

   static CompletableFuture<Suggestions> a(String[] $$0, SuggestionsBuilder $$1) {
      String $$2 = $$1.getRemaining().toLowerCase(Locale.ROOT);

      for (String $$3 : $$0) {
         if (a($$2, $$3.toLowerCase(Locale.ROOT))) {
            $$1.suggest($$3);
         }
      }

      return $$1.buildFuture();
   }

   static <T> CompletableFuture<Suggestions> b(Iterable<T> $$0, SuggestionsBuilder $$1, Function<T, String> $$2, Function<T, Message> $$3) {
      String $$4 = $$1.getRemaining().toLowerCase(Locale.ROOT);

      for (T $$5 : $$0) {
         String $$6 = $$2.apply($$5);
         if (a($$4, $$6.toLowerCase(Locale.ROOT))) {
            $$1.suggest($$6, $$3.apply($$5));
         }
      }

      return $$1.buildFuture();
   }

   static boolean a(String $$0, String $$1) {
      for (int $$2 = 0; !$$1.startsWith($$0, $$2); $$2++) {
         int $$3 = $$1.indexOf(46, $$2);
         int $$4 = $$1.indexOf(95, $$2);
         if (Math.max($$3, $$4) < 0) {
            return false;
         }

         if ($$3 >= 0 && $$4 >= 0) {
            $$2 = Math.min($$4, $$3);
         } else {
            $$2 = $$3 >= 0 ? $$3 : $$4;
         }
      }

      return true;
   }

   public static enum a {
      a,
      b,
      c;

      public boolean a() {
         return this == a || this == c;
      }

      public boolean b() {
         return this == b || this == c;
      }
   }

   public static class b {
      public static final eu.b a = new eu.b("^", "^", "^");
      public static final eu.b b = new eu.b("~", "~", "~");
      public final String c;
      public final String d;
      public final String e;

      public b(String $$0, String $$1, String $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }
   }
}
