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

public class ek implements ArgumentType<ek.g> {
   private static final Collection<String> d = Arrays.asList("foo", "foo.bar", "foo[0]", "[0]", "[]", "{foo=bar}");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vf.c("arguments.nbtpath.node.invalid"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vf.c("arguments.nbtpath.too_deep"));
   public static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vf.b("arguments.nbtpath.nothing_found", $$0));
   static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> vf.b("commands.data.modify.expected_list", $$0));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> vf.b("commands.data.modify.invalid_index", $$0));
   private static final char g = '[';
   private static final char h = ']';
   private static final char i = '{';
   private static final char j = '}';
   private static final char k = '"';
   private static final char l = '\'';

   public static ek a() {
      return new ek();
   }

   public static ek.g a(CommandContext<ds> $$0, String $$1) {
      return (ek.g)$$0.getArgument($$1, ek.g.class);
   }

   public ek.g a(StringReader $$0) throws CommandSyntaxException {
      List<ek.h> $$1 = Lists.newArrayList();
      int $$2 = $$0.getCursor();
      Object2IntMap<ek.h> $$3 = new Object2IntOpenHashMap();
      boolean $$4 = true;

      while ($$0.canRead() && $$0.peek() != ' ') {
         ek.h $$5 = a($$0, $$4);
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

      return new ek.g($$0.getString().substring($$2, $$0.getCursor()), $$1.toArray(new ek.h[0]), $$3);
   }

   private static ek.h a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      return (ek.h)(switch ($$0.peek()) {
         case '"', '\'' -> a($$0, $$0.readString());
         case '[' -> {
            $$0.skip();
            int $$3 = $$0.peek();
            if ($$3 == 123) {
               sn $$4 = new tl($$0).f();
               $$0.expect(']');
               yield new ek.d($$4);
            } else if ($$3 == 93) {
               $$0.skip();
               yield ek.a.a;
            } else {
               int $$5 = $$0.readInt();
               $$0.expect(']');
               yield new ek.c($$5);
            }
         }
         case '{' -> {
            if (!$$1) {
               throw a.createWithContext($$0);
            }

            sn $$2 = new tl($$0).f();
            yield new ek.f($$2);
         }
         default -> a($$0, b($$0));
      });
   }

   private static ek.h a(StringReader $$0, String $$1) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '{') {
         sn $$2 = new tl($$0).f();
         return new ek.e($$1, $$2);
      } else {
         return new ek.b($$1);
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

   static Predicate<tk> a(sn $$0) {
      return $$1 -> tc.a($$0, $$1, true);
   }

   static class a implements ek.h {
      public static final ek.a a = new ek.a();

      private a() {
      }

      @Override
      public void a(tk $$0, List<tk> $$1) {
         if ($$0 instanceof sm) {
            $$1.addAll((sm)$$0);
         }
      }

      @Override
      public void a(tk $$0, Supplier<tk> $$1, List<tk> $$2) {
         if ($$0 instanceof sm<?> $$3) {
            if ($$3.isEmpty()) {
               tk $$4 = $$1.get();
               if ($$3.b(0, $$4)) {
                  $$2.add($$4);
               }
            } else {
               $$2.addAll((Collection<? extends tk>)$$3);
            }
         }
      }

      @Override
      public tk a() {
         return new st();
      }

      @Override
      public int a(tk $$0, Supplier<tk> $$1) {
         if (!($$0 instanceof sm<?> $$2)) {
            return 0;
         } else {
            int $$3 = $$2.size();
            if ($$3 == 0) {
               $$2.b(0, $$1.get());
               return 1;
            } else {
               tk $$4 = $$1.get();
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
      public int a(tk $$0) {
         if ($$0 instanceof sm<?> $$1) {
            int $$2 = $$1.size();
            if ($$2 > 0) {
               $$1.clear();
               return $$2;
            }
         }

         return 0;
      }
   }

   static class b implements ek.h {
      private final String a;

      public b(String $$0) {
         this.a = $$0;
      }

      @Override
      public void a(tk $$0, List<tk> $$1) {
         if ($$0 instanceof sn) {
            tk $$2 = ((sn)$$0).c(this.a);
            if ($$2 != null) {
               $$1.add($$2);
            }
         }
      }

      @Override
      public void a(tk $$0, Supplier<tk> $$1, List<tk> $$2) {
         if ($$0 instanceof sn $$3) {
            tk $$4;
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
      public tk a() {
         return new sn();
      }

      @Override
      public int a(tk $$0, Supplier<tk> $$1) {
         if ($$0 instanceof sn $$2) {
            tk $$3 = $$1.get();
            tk $$4 = $$2.a(this.a, $$3);
            if (!$$3.equals($$4)) {
               return 1;
            }
         }

         return 0;
      }

      @Override
      public int a(tk $$0) {
         if ($$0 instanceof sn $$1 && $$1.e(this.a)) {
            $$1.r(this.a);
            return 1;
         }

         return 0;
      }
   }

   static class c implements ek.h {
      private final int a;

      public c(int $$0) {
         this.a = $$0;
      }

      @Override
      public void a(tk $$0, List<tk> $$1) {
         if ($$0 instanceof sm<?> $$2) {
            int $$3 = $$2.size();
            int $$4 = this.a < 0 ? $$3 + this.a : this.a;
            if (0 <= $$4 && $$4 < $$3) {
               $$1.add($$2.get($$4));
            }
         }
      }

      @Override
      public void a(tk $$0, Supplier<tk> $$1, List<tk> $$2) {
         this.a($$0, $$2);
      }

      @Override
      public tk a() {
         return new st();
      }

      @Override
      public int a(tk $$0, Supplier<tk> $$1) {
         if ($$0 instanceof sm<?> $$2) {
            int $$3 = $$2.size();
            int $$4 = this.a < 0 ? $$3 + this.a : this.a;
            if (0 <= $$4 && $$4 < $$3) {
               tk $$5 = $$2.get($$4);
               tk $$6 = $$1.get();
               if (!$$6.equals($$5) && $$2.a($$4, $$6)) {
                  return 1;
               }
            }
         }

         return 0;
      }

      @Override
      public int a(tk $$0) {
         if ($$0 instanceof sm<?> $$1) {
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

   static class d implements ek.h {
      private final sn a;
      private final Predicate<tk> b;

      public d(sn $$0) {
         this.a = $$0;
         this.b = ek.a($$0);
      }

      @Override
      public void a(tk $$0, List<tk> $$1) {
         if ($$0 instanceof st $$2) {
            $$2.stream().filter(this.b).forEach($$1::add);
         }
      }

      @Override
      public void a(tk $$0, Supplier<tk> $$1, List<tk> $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         if ($$0 instanceof st $$4) {
            $$4.stream().filter(this.b).forEach($$2x -> {
               $$2.add($$2x);
               $$3.setTrue();
            });
            if ($$3.isFalse()) {
               sn $$5 = this.a.h();
               $$4.add($$5);
               $$2.add($$5);
            }
         }
      }

      @Override
      public tk a() {
         return new st();
      }

      @Override
      public int a(tk $$0, Supplier<tk> $$1) {
         int $$2 = 0;
         if ($$0 instanceof st $$3) {
            int $$4 = $$3.size();
            if ($$4 == 0) {
               $$3.add($$1.get());
               $$2++;
            } else {
               for (int $$5 = 0; $$5 < $$4; $$5++) {
                  tk $$6 = $$3.k($$5);
                  if (this.b.test($$6)) {
                     tk $$7 = $$1.get();
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
      public int a(tk $$0) {
         int $$1 = 0;
         if ($$0 instanceof st $$2) {
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

   static class e implements ek.h {
      private final String a;
      private final sn b;
      private final Predicate<tk> c;

      public e(String $$0, sn $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = ek.a($$1);
      }

      @Override
      public void a(tk $$0, List<tk> $$1) {
         if ($$0 instanceof sn) {
            tk $$2 = ((sn)$$0).c(this.a);
            if (this.c.test($$2)) {
               $$1.add($$2);
            }
         }
      }

      @Override
      public void a(tk $$0, Supplier<tk> $$1, List<tk> $$2) {
         if ($$0 instanceof sn $$3) {
            tk $$4 = $$3.c(this.a);
            if ($$4 == null) {
               tk var6 = this.b.h();
               $$3.a(this.a, var6);
               $$2.add(var6);
            } else if (this.c.test($$4)) {
               $$2.add($$4);
            }
         }
      }

      @Override
      public tk a() {
         return new sn();
      }

      @Override
      public int a(tk $$0, Supplier<tk> $$1) {
         if ($$0 instanceof sn $$2) {
            tk $$3 = $$2.c(this.a);
            if (this.c.test($$3)) {
               tk $$4 = $$1.get();
               if (!$$4.equals($$3)) {
                  $$2.a(this.a, $$4);
                  return 1;
               }
            }
         }

         return 0;
      }

      @Override
      public int a(tk $$0) {
         if ($$0 instanceof sn $$1) {
            tk $$2 = $$1.c(this.a);
            if (this.c.test($$2)) {
               $$1.r(this.a);
               return 1;
            }
         }

         return 0;
      }
   }

   static class f implements ek.h {
      private final Predicate<tk> a;

      public f(sn $$0) {
         this.a = ek.a($$0);
      }

      @Override
      public void a(tk $$0, List<tk> $$1) {
         if ($$0 instanceof sn && this.a.test($$0)) {
            $$1.add($$0);
         }
      }

      @Override
      public void a(tk $$0, Supplier<tk> $$1, List<tk> $$2) {
         this.a($$0, $$2);
      }

      @Override
      public tk a() {
         return new sn();
      }

      @Override
      public int a(tk $$0, Supplier<tk> $$1) {
         return 0;
      }

      @Override
      public int a(tk $$0) {
         return 0;
      }
   }

   public static class g {
      private final String a;
      private final Object2IntMap<ek.h> b;
      private final ek.h[] c;

      public g(String $$0, ek.h[] $$1, Object2IntMap<ek.h> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public List<tk> a(tk $$0) throws CommandSyntaxException {
         List<tk> $$1 = Collections.singletonList($$0);

         for (ek.h $$2 : this.c) {
            $$1 = $$2.a($$1);
            if ($$1.isEmpty()) {
               throw this.a($$2);
            }
         }

         return $$1;
      }

      public int b(tk $$0) {
         List<tk> $$1 = Collections.singletonList($$0);

         for (ek.h $$2 : this.c) {
            $$1 = $$2.a($$1);
            if ($$1.isEmpty()) {
               return 0;
            }
         }

         return $$1.size();
      }

      private List<tk> d(tk $$0) throws CommandSyntaxException {
         List<tk> $$1 = Collections.singletonList($$0);

         for (int $$2 = 0; $$2 < this.c.length - 1; $$2++) {
            ek.h $$3 = this.c[$$2];
            int $$4 = $$2 + 1;
            $$1 = $$3.a($$1, this.c[$$4]::a);
            if ($$1.isEmpty()) {
               throw this.a($$3);
            }
         }

         return $$1;
      }

      public List<tk> a(tk $$0, Supplier<tk> $$1) throws CommandSyntaxException {
         List<tk> $$2 = this.d($$0);
         ek.h $$3 = this.c[this.c.length - 1];
         return $$3.a($$2, $$1);
      }

      private static int a(List<tk> $$0, Function<tk, Integer> $$1) {
         return $$0.stream().map($$1).reduce(0, ($$0x, $$1x) -> $$0x + $$1x);
      }

      public static boolean a(tk $$0, int $$1) {
         if ($$1 >= 512) {
            return true;
         } else {
            if ($$0 instanceof sn $$2) {
               for (String $$3 : $$2.e()) {
                  tk $$4 = $$2.c($$3);
                  if ($$4 != null && a($$4, $$1 + 1)) {
                     return true;
                  }
               }
            } else if ($$0 instanceof st) {
               for (tk $$6 : (st)$$0) {
                  if (a($$6, $$1 + 1)) {
                     return true;
                  }
               }
            }

            return false;
         }
      }

      public int a(tk $$0, tk $$1) throws CommandSyntaxException {
         if (a($$1, this.b())) {
            throw ek.b.create();
         } else {
            tk $$2 = $$1.d();
            List<tk> $$3 = this.d($$0);
            if ($$3.isEmpty()) {
               return 0;
            } else {
               ek.h $$4 = this.c[this.c.length - 1];
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

      public int a(int $$0, sn $$1, List<tk> $$2) throws CommandSyntaxException {
         List<tk> $$3 = new ArrayList<>($$2.size());

         for (tk $$4 : $$2) {
            tk $$5 = $$4.d();
            $$3.add($$5);
            if (a($$5, this.b())) {
               throw ek.b.create();
            }
         }

         Collection<tk> $$6 = this.a($$1, st::new);
         int $$7 = 0;
         boolean $$8 = false;

         for (tk $$9 : $$6) {
            if (!($$9 instanceof sm<?> $$10)) {
               throw ek.e.create($$9);
            }

            boolean $$11 = false;
            int $$12 = $$0 < 0 ? $$10.size() + $$0 + 1 : $$0;

            for (tk $$13 : $$3) {
               try {
                  if ($$10.b($$12, $$8 ? $$13.d() : $$13)) {
                     $$12++;
                     $$11 = true;
                  }
               } catch (IndexOutOfBoundsException var16) {
                  throw ek.f.create($$12);
               }
            }

            $$8 = true;
            $$7 += $$11 ? 1 : 0;
         }

         return $$7;
      }

      public int c(tk $$0) {
         List<tk> $$1 = Collections.singletonList($$0);

         for (int $$2 = 0; $$2 < this.c.length - 1; $$2++) {
            $$1 = this.c[$$2].a($$1);
         }

         ek.h $$3 = this.c[this.c.length - 1];
         return a($$1, $$3::a);
      }

      private CommandSyntaxException a(ek.h $$0) {
         int $$1 = this.b.getInt($$0);
         return ek.c.create(this.a.substring(0, $$1));
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
      void a(tk var1, List<tk> var2);

      void a(tk var1, Supplier<tk> var2, List<tk> var3);

      tk a();

      int a(tk var1, Supplier<tk> var2);

      int a(tk var1);

      default List<tk> a(List<tk> $$0) {
         return this.a($$0, this::a);
      }

      default List<tk> a(List<tk> $$0, Supplier<tk> $$1) {
         return this.a($$0, ($$1x, $$2) -> this.a($$1x, $$1, $$2));
      }

      default List<tk> a(List<tk> $$0, BiConsumer<tk, List<tk>> $$1) {
         List<tk> $$2 = Lists.newArrayList();

         for (tk $$3 : $$0) {
            $$1.accept($$3, $$2);
         }

         return $$2;
      }
   }
}
