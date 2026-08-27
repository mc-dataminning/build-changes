import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class eu implements ArgumentType<eu.g> {
   private static final Collection<String> d = Arrays.asList("foo", "foo.bar", "foo[0]", "[0]", "[]", "{foo=bar}");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("arguments.nbtpath.node.invalid"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ws.c("arguments.nbtpath.too_deep"));
   public static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ws.b("arguments.nbtpath.nothing_found", $$0));
   static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> ws.b("commands.data.modify.expected_list", $$0));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> ws.b("commands.data.modify.invalid_index", $$0));
   private static final char g = '[';
   private static final char h = ']';
   private static final char i = '{';
   private static final char j = '}';
   private static final char k = '"';
   private static final char l = '\'';

   public static eu a() {
      return new eu();
   }

   public static eu.g a(CommandContext<ec> $$0, String $$1) {
      return (eu.g)$$0.getArgument($$1, eu.g.class);
   }

   public eu.g a(StringReader $$0) throws CommandSyntaxException {
      List<eu.h> $$1 = Lists.newArrayList();
      int $$2 = $$0.getCursor();
      Object2IntMap<eu.h> $$3 = new Object2IntOpenHashMap();
      boolean $$4 = true;

      while ($$0.canRead() && $$0.peek() != ' ') {
         eu.h $$5 = a($$0, $$4);
         $$1.add($$5);
         $$3.put($$5, $$0.getCursor() - $$2);
         $$4 = false;
         if ($$0.canRead()) {
            char $$6 = $$0.peek();
            if ($$6 != ' ' && $$6 != '[' && $$6 != '{') {
               $$0.expect('.');
            }
         }
      }

      return new eu.g($$0.getString().substring($$2, $$0.getCursor()), $$1.toArray(new eu.h[0]), $$3);
   }

   private static eu.h a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      return (eu.h)(switch ($$0.peek()) {
         case '"', '\'' -> a($$0, $$0.readString());
         case '[' -> {
            $$0.skip();
            int $$3 = $$0.peek();
            if ($$3 == 123) {
               ty $$4 = new uw($$0).f();
               $$0.expect(']');
               yield new eu.d($$4);
            } else if ($$3 == 93) {
               $$0.skip();
               yield eu.a.a;
            } else {
               int $$5 = $$0.readInt();
               $$0.expect(']');
               yield new eu.c($$5);
            }
         }
         case '{' -> {
            if (!$$1) {
               throw a.createWithContext($$0);
            }

            ty $$2 = new uw($$0).f();
            yield new eu.f($$2);
         }
         default -> a($$0, b($$0));
      });
   }

   private static eu.h a(StringReader $$0, String $$1) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '{') {
         ty $$2 = new uw($$0).f();
         return new eu.e($$1, $$2);
      } else {
         return new eu.b($$1);
      }
   }

   private static String b(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();

      while ($$0.canRead() && a($$0.peek())) {
         $$0.skip();
      }

      if ($$0.getCursor() == $$1) {
         throw a.createWithContext($$0);
      } else {
         return $$0.getString().substring($$1, $$0.getCursor());
      }
   }

   public Collection<String> getExamples() {
      return d;
   }

   private static boolean a(char $$0) {
      return $$0 != ' ' && $$0 != '"' && $$0 != '\'' && $$0 != '[' && $$0 != ']' && $$0 != '.' && $$0 != '{' && $$0 != '}';
   }

   static Predicate<uv> a(ty $$0) {
      return $$1 -> un.a($$0, $$1, true);
   }

   static class a implements eu.h {
      public static final eu.a a = new eu.a();

      private a() {
      }

      @Override
      public void a(uv $$0, List<uv> $$1) {
         if ($$0 instanceof tx) {
            $$1.addAll((tx)$$0);
         }
      }

      @Override
      public void a(uv $$0, Supplier<uv> $$1, List<uv> $$2) {
         if ($$0 instanceof tx<?> $$3) {
            if ($$3.isEmpty()) {
               uv $$4 = $$1.get();
               if ($$3.b(0, $$4)) {
                  $$2.add($$4);
               }
            } else {
               $$2.addAll((Collection<? extends uv>)$$3);
            }
         }
      }

      @Override
      public uv a() {
         return new ue();
      }

      @Override
      public int a(uv $$0, Supplier<uv> $$1) {
         if (!($$0 instanceof tx<?> $$2)) {
            return 0;
         } else {
            int $$3 = $$2.size();
            if ($$3 == 0) {
               $$2.b(0, $$1.get());
               return 1;
            } else {
               uv $$4 = $$1.get();
               int $$5 = $$3 - (int)$$2.stream().filter($$4::equals).count();
               if ($$5 == 0) {
                  return 0;
               } else {
                  $$2.clear();
                  if (!$$2.b(0, $$4)) {
                     return 0;
                  } else {
                     for (int $$6 = 1; $$6 < $$3; $$6++) {
                        $$2.b($$6, $$1.get());
                     }

                     return $$5;
                  }
               }
            }
         }
      }

      @Override
      public int a(uv $$0) {
         if ($$0 instanceof tx<?> $$1) {
            int $$2 = $$1.size();
            if ($$2 > 0) {
               $$1.clear();
               return $$2;
            }
         }

         return 0;
      }
   }

   static class b implements eu.h {
      private final String a;

      public b(String $$0) {
         this.a = $$0;
      }

      @Override
      public void a(uv $$0, List<uv> $$1) {
         if ($$0 instanceof ty) {
            uv $$2 = ((ty)$$0).c(this.a);
            if ($$2 != null) {
               $$1.add($$2);
            }
         }
      }

      @Override
      public void a(uv $$0, Supplier<uv> $$1, List<uv> $$2) {
         if ($$0 instanceof ty $$3) {
            uv $$4;
            if ($$3.e(this.a)) {
               $$4 = $$3.c(this.a);
            } else {
               $$4 = $$1.get();
               $$3.a(this.a, $$4);
            }

            $$2.add($$4);
         }
      }

      @Override
      public uv a() {
         return new ty();
      }

      @Override
      public int a(uv $$0, Supplier<uv> $$1) {
         if ($$0 instanceof ty $$2) {
            uv $$3 = $$1.get();
            uv $$4 = $$2.a(this.a, $$3);
            if (!$$3.equals($$4)) {
               return 1;
            }
         }

         return 0;
      }

      @Override
      public int a(uv $$0) {
         if ($$0 instanceof ty $$1 && $$1.e(this.a)) {
            $$1.r(this.a);
            return 1;
         }

         return 0;
      }
   }

   static class c implements eu.h {
      private final int a;

      public c(int $$0) {
         this.a = $$0;
      }

      @Override
      public void a(uv $$0, List<uv> $$1) {
         if ($$0 instanceof tx<?> $$2) {
            int $$3 = $$2.size();
            int $$4 = this.a < 0 ? $$3 + this.a : this.a;
            if (0 <= $$4 && $$4 < $$3) {
               $$1.add($$2.get($$4));
            }
         }
      }

      @Override
      public void a(uv $$0, Supplier<uv> $$1, List<uv> $$2) {
         this.a($$0, $$2);
      }

      @Override
      public uv a() {
         return new ue();
      }

      @Override
      public int a(uv $$0, Supplier<uv> $$1) {
         if ($$0 instanceof tx<?> $$2) {
            int $$3 = $$2.size();
            int $$4 = this.a < 0 ? $$3 + this.a : this.a;
            if (0 <= $$4 && $$4 < $$3) {
               uv $$5 = $$2.get($$4);
               uv $$6 = $$1.get();
               if (!$$6.equals($$5) && $$2.a($$4, $$6)) {
                  return 1;
               }
            }
         }

         return 0;
      }

      @Override
      public int a(uv $$0) {
         if ($$0 instanceof tx<?> $$1) {
            int $$2 = $$1.size();
            int $$3 = this.a < 0 ? $$2 + this.a : this.a;
            if (0 <= $$3 && $$3 < $$2) {
               $$1.c($$3);
               return 1;
            }
         }

         return 0;
      }
   }

   static class d implements eu.h {
      private final ty a;
      private final Predicate<uv> b;

      public d(ty $$0) {
         this.a = $$0;
         this.b = eu.a($$0);
      }

      @Override
      public void a(uv $$0, List<uv> $$1) {
         if ($$0 instanceof ue $$2) {
            $$2.stream().filter(this.b).forEach($$1::add);
         }
      }

      @Override
      public void a(uv $$0, Supplier<uv> $$1, List<uv> $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         if ($$0 instanceof ue $$4) {
            $$4.stream().filter(this.b).forEach($$2x -> {
               $$2.add($$2x);
               $$3.setTrue();
            });
            if ($$3.isFalse()) {
               ty $$5 = this.a.h();
               $$4.add($$5);
               $$2.add($$5);
            }
         }
      }

      @Override
      public uv a() {
         return new ue();
      }

      @Override
      public int a(uv $$0, Supplier<uv> $$1) {
         int $$2 = 0;
         if ($$0 instanceof ue $$3) {
            int $$4 = $$3.size();
            if ($$4 == 0) {
               $$3.add($$1.get());
               $$2++;
            } else {
               for (int $$5 = 0; $$5 < $$4; $$5++) {
                  uv $$6 = $$3.k($$5);
                  if (this.b.test($$6)) {
                     uv $$7 = $$1.get();
                     if (!$$7.equals($$6) && $$3.a($$5, $$7)) {
                        $$2++;
                     }
                  }
               }
            }
         }

         return $$2;
      }

      @Override
      public int a(uv $$0) {
         int $$1 = 0;
         if ($$0 instanceof ue $$2) {
            for (int $$3 = $$2.size() - 1; $$3 >= 0; $$3--) {
               if (this.b.test($$2.k($$3))) {
                  $$2.c($$3);
                  $$1++;
               }
            }
         }

         return $$1;
      }
   }

   static class e implements eu.h {
      private final String a;
      private final ty b;
      private final Predicate<uv> c;

      public e(String $$0, ty $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = eu.a($$1);
      }

      @Override
      public void a(uv $$0, List<uv> $$1) {
         if ($$0 instanceof ty) {
            uv $$2 = ((ty)$$0).c(this.a);
            if (this.c.test($$2)) {
               $$1.add($$2);
            }
         }
      }

      @Override
      public void a(uv $$0, Supplier<uv> $$1, List<uv> $$2) {
         if ($$0 instanceof ty $$3) {
            uv $$4 = $$3.c(this.a);
            if ($$4 == null) {
               uv var6 = this.b.h();
               $$3.a(this.a, var6);
               $$2.add(var6);
            } else if (this.c.test($$4)) {
               $$2.add($$4);
            }
         }
      }

      @Override
      public uv a() {
         return new ty();
      }

      @Override
      public int a(uv $$0, Supplier<uv> $$1) {
         if ($$0 instanceof ty $$2) {
            uv $$3 = $$2.c(this.a);
            if (this.c.test($$3)) {
               uv $$4 = $$1.get();
               if (!$$4.equals($$3)) {
                  $$2.a(this.a, $$4);
                  return 1;
               }
            }
         }

         return 0;
      }

      @Override
      public int a(uv $$0) {
         if ($$0 instanceof ty $$1) {
            uv $$2 = $$1.c(this.a);
            if (this.c.test($$2)) {
               $$1.r(this.a);
               return 1;
            }
         }

         return 0;
      }
   }

   static class f implements eu.h {
      private final Predicate<uv> a;

      public f(ty $$0) {
         this.a = eu.a($$0);
      }

      @Override
      public void a(uv $$0, List<uv> $$1) {
         if ($$0 instanceof ty && this.a.test($$0)) {
            $$1.add($$0);
         }
      }

      @Override
      public void a(uv $$0, Supplier<uv> $$1, List<uv> $$2) {
         this.a($$0, $$2);
      }

      @Override
      public uv a() {
         return new ty();
      }

      @Override
      public int a(uv $$0, Supplier<uv> $$1) {
         return 0;
      }

      @Override
      public int a(uv $$0) {
         return 0;
      }
   }

   public static class g {
      private final String a;
      private final Object2IntMap<eu.h> b;
      private final eu.h[] c;

      public g(String $$0, eu.h[] $$1, Object2IntMap<eu.h> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public List<uv> a(uv $$0) throws CommandSyntaxException {
         List<uv> $$1 = Collections.singletonList($$0);

         for (eu.h $$2 : this.c) {
            $$1 = $$2.a($$1);
            if ($$1.isEmpty()) {
               throw this.a($$2);
            }
         }

         return $$1;
      }

      public int b(uv $$0) {
         List<uv> $$1 = Collections.singletonList($$0);

         for (eu.h $$2 : this.c) {
            $$1 = $$2.a($$1);
            if ($$1.isEmpty()) {
               return 0;
            }
         }

         return $$1.size();
      }

      private List<uv> d(uv $$0) throws CommandSyntaxException {
         List<uv> $$1 = Collections.singletonList($$0);

         for (int $$2 = 0; $$2 < this.c.length - 1; $$2++) {
            eu.h $$3 = this.c[$$2];
            int $$4 = $$2 + 1;
            $$1 = $$3.a($$1, this.c[$$4]::a);
            if ($$1.isEmpty()) {
               throw this.a($$3);
            }
         }

         return $$1;
      }

      public List<uv> a(uv $$0, Supplier<uv> $$1) throws CommandSyntaxException {
         List<uv> $$2 = this.d($$0);
         eu.h $$3 = this.c[this.c.length - 1];
         return $$3.a($$2, $$1);
      }

      private static int a(List<uv> $$0, Function<uv, Integer> $$1) {
         return $$0.stream().map($$1).reduce(0, ($$0x, $$1x) -> $$0x + $$1x);
      }

      public static boolean a(uv $$0, int $$1) {
         if ($$1 >= 512) {
            return true;
         } else {
            if ($$0 instanceof ty $$2) {
               for (String $$3 : $$2.e()) {
                  uv $$4 = $$2.c($$3);
                  if ($$4 != null && a($$4, $$1 + 1)) {
                     return true;
                  }
               }
            } else if ($$0 instanceof ue) {
               for (uv $$6 : (ue)$$0) {
                  if (a($$6, $$1 + 1)) {
                     return true;
                  }
               }
            }

            return false;
         }
      }

      public int a(uv $$0, uv $$1) throws CommandSyntaxException {
         if (a($$1, this.b())) {
            throw eu.b.create();
         } else {
            uv $$2 = $$1.d();
            List<uv> $$3 = this.d($$0);
            if ($$3.isEmpty()) {
               return 0;
            } else {
               eu.h $$4 = this.c[this.c.length - 1];
               MutableBoolean $$5 = new MutableBoolean(false);
               return a($$3, $$3x -> $$4.a($$3x, () -> {
                     if ($$5.isFalse()) {
                        $$5.setTrue();
                        return $$2;
                     } else {
                        return $$2.d();
                     }
                  }));
            }
         }
      }

      private int b() {
         return this.c.length;
      }

      public int a(int $$0, ty $$1, List<uv> $$2) throws CommandSyntaxException {
         List<uv> $$3 = new ArrayList<>($$2.size());

         for (uv $$4 : $$2) {
            uv $$5 = $$4.d();
            $$3.add($$5);
            if (a($$5, this.b())) {
               throw eu.b.create();
            }
         }

         Collection<uv> $$6 = this.a($$1, ue::new);
         int $$7 = 0;
         boolean $$8 = false;

         for (uv $$9 : $$6) {
            if (!($$9 instanceof tx<?> $$10)) {
               throw eu.e.create($$9);
            }

            boolean $$11 = false;
            int $$12 = $$0 < 0 ? $$10.size() + $$0 + 1 : $$0;

            for (uv $$13 : $$3) {
               try {
                  if ($$10.b($$12, $$8 ? $$13.d() : $$13)) {
                     $$12++;
                     $$11 = true;
                  }
               } catch (IndexOutOfBoundsException var16) {
                  throw eu.f.create($$12);
               }
            }

            $$8 = true;
            $$7 += $$11 ? 1 : 0;
         }

         return $$7;
      }

      public int c(uv $$0) {
         List<uv> $$1 = Collections.singletonList($$0);

         for (int $$2 = 0; $$2 < this.c.length - 1; $$2++) {
            $$1 = this.c[$$2].a($$1);
         }

         eu.h $$3 = this.c[this.c.length - 1];
         return a($$1, $$3::a);
      }

      private CommandSyntaxException a(eu.h $$0) {
         int $$1 = this.b.getInt($$0);
         return eu.c.create(this.a.substring(0, $$1));
      }

      @Override
      public String toString() {
         return this.a;
      }

      public String a() {
         return this.a;
      }
   }

   interface h {
      void a(uv var1, List<uv> var2);

      void a(uv var1, Supplier<uv> var2, List<uv> var3);

      uv a();

      int a(uv var1, Supplier<uv> var2);

      int a(uv var1);

      default List<uv> a(List<uv> $$0) {
         return this.a($$0, this::a);
      }

      default List<uv> a(List<uv> $$0, Supplier<uv> $$1) {
         return this.a($$0, ($$1x, $$2) -> this.a($$1x, $$1, $$2));
      }

      default List<uv> a(List<uv> $$0, BiConsumer<uv, List<uv>> $$1) {
         List<uv> $$2 = Lists.newArrayList();

         for (uv $$3 : $$0) {
            $$1.accept($$3, $$2);
         }

         return $$2;
      }
   }
}
