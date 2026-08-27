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

public class em implements ArgumentType<em.g> {
   private static final Collection<String> d = Arrays.asList("foo", "foo.bar", "foo[0]", "[0]", "[]", "{foo=bar}");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vu.c("arguments.nbtpath.node.invalid"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vu.c("arguments.nbtpath.too_deep"));
   public static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vu.b("arguments.nbtpath.nothing_found", $$0));
   static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> vu.b("commands.data.modify.expected_list", $$0));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> vu.b("commands.data.modify.invalid_index", $$0));
   private static final char g = '[';
   private static final char h = ']';
   private static final char i = '{';
   private static final char j = '}';
   private static final char k = '"';
   private static final char l = '\'';

   public static em a() {
      return new em();
   }

   public static em.g a(CommandContext<du> $$0, String $$1) {
      return (em.g)$$0.getArgument($$1, em.g.class);
   }

   public em.g a(StringReader $$0) throws CommandSyntaxException {
      List<em.h> $$1 = Lists.newArrayList();
      int $$2 = $$0.getCursor();
      Object2IntMap<em.h> $$3 = new Object2IntOpenHashMap();
      boolean $$4 = true;

      while ($$0.canRead() && $$0.peek() != ' ') {
         em.h $$5 = a($$0, $$4);
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

      return new em.g($$0.getString().substring($$2, $$0.getCursor()), $$1.toArray(new em.h[0]), $$3);
   }

   private static em.h a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      return (em.h)(switch ($$0.peek()) {
         case '"', '\'' -> a($$0, $$0.readString());
         case '[' -> {
            $$0.skip();
            int $$3 = $$0.peek();
            if ($$3 == 123) {
               ta $$4 = new ty($$0).f();
               $$0.expect(']');
               yield new em.d($$4);
            } else if ($$3 == 93) {
               $$0.skip();
               yield em.a.a;
            } else {
               int $$5 = $$0.readInt();
               $$0.expect(']');
               yield new em.c($$5);
            }
         }
         case '{' -> {
            if (!$$1) {
               throw a.createWithContext($$0);
            }

            ta $$2 = new ty($$0).f();
            yield new em.f($$2);
         }
         default -> a($$0, b($$0));
      });
   }

   private static em.h a(StringReader $$0, String $$1) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '{') {
         ta $$2 = new ty($$0).f();
         return new em.e($$1, $$2);
      } else {
         return new em.b($$1);
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

   static Predicate<tx> a(ta $$0) {
      return $$1 -> tp.a($$0, $$1, true);
   }

   static class a implements em.h {
      public static final em.a a = new em.a();

      private a() {
      }

      @Override
      public void a(tx $$0, List<tx> $$1) {
         if ($$0 instanceof sz) {
            $$1.addAll((sz)$$0);
         }
      }

      @Override
      public void a(tx $$0, Supplier<tx> $$1, List<tx> $$2) {
         if ($$0 instanceof sz<?> $$3) {
            if ($$3.isEmpty()) {
               tx $$4 = $$1.get();
               if ($$3.b(0, $$4)) {
                  $$2.add($$4);
               }
            } else {
               $$2.addAll((Collection<? extends tx>)$$3);
            }
         }
      }

      @Override
      public tx a() {
         return new tg();
      }

      @Override
      public int a(tx $$0, Supplier<tx> $$1) {
         if (!($$0 instanceof sz<?> $$2)) {
            return 0;
         } else {
            int $$3 = $$2.size();
            if ($$3 == 0) {
               $$2.b(0, $$1.get());
               return 1;
            } else {
               tx $$4 = $$1.get();
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
      public int a(tx $$0) {
         if ($$0 instanceof sz<?> $$1) {
            int $$2 = $$1.size();
            if ($$2 > 0) {
               $$1.clear();
               return $$2;
            }
         }

         return 0;
      }
   }

   static class b implements em.h {
      private final String a;

      public b(String $$0) {
         this.a = $$0;
      }

      @Override
      public void a(tx $$0, List<tx> $$1) {
         if ($$0 instanceof ta) {
            tx $$2 = ((ta)$$0).c(this.a);
            if ($$2 != null) {
               $$1.add($$2);
            }
         }
      }

      @Override
      public void a(tx $$0, Supplier<tx> $$1, List<tx> $$2) {
         if ($$0 instanceof ta $$3) {
            tx $$4;
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
      public tx a() {
         return new ta();
      }

      @Override
      public int a(tx $$0, Supplier<tx> $$1) {
         if ($$0 instanceof ta $$2) {
            tx $$3 = $$1.get();
            tx $$4 = $$2.a(this.a, $$3);
            if (!$$3.equals($$4)) {
               return 1;
            }
         }

         return 0;
      }

      @Override
      public int a(tx $$0) {
         if ($$0 instanceof ta $$1 && $$1.e(this.a)) {
            $$1.r(this.a);
            return 1;
         }

         return 0;
      }
   }

   static class c implements em.h {
      private final int a;

      public c(int $$0) {
         this.a = $$0;
      }

      @Override
      public void a(tx $$0, List<tx> $$1) {
         if ($$0 instanceof sz<?> $$2) {
            int $$3 = $$2.size();
            int $$4 = this.a < 0 ? $$3 + this.a : this.a;
            if (0 <= $$4 && $$4 < $$3) {
               $$1.add($$2.get($$4));
            }
         }
      }

      @Override
      public void a(tx $$0, Supplier<tx> $$1, List<tx> $$2) {
         this.a($$0, $$2);
      }

      @Override
      public tx a() {
         return new tg();
      }

      @Override
      public int a(tx $$0, Supplier<tx> $$1) {
         if ($$0 instanceof sz<?> $$2) {
            int $$3 = $$2.size();
            int $$4 = this.a < 0 ? $$3 + this.a : this.a;
            if (0 <= $$4 && $$4 < $$3) {
               tx $$5 = $$2.get($$4);
               tx $$6 = $$1.get();
               if (!$$6.equals($$5) && $$2.a($$4, $$6)) {
                  return 1;
               }
            }
         }

         return 0;
      }

      @Override
      public int a(tx $$0) {
         if ($$0 instanceof sz<?> $$1) {
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

   static class d implements em.h {
      private final ta a;
      private final Predicate<tx> b;

      public d(ta $$0) {
         this.a = $$0;
         this.b = em.a($$0);
      }

      @Override
      public void a(tx $$0, List<tx> $$1) {
         if ($$0 instanceof tg $$2) {
            $$2.stream().filter(this.b).forEach($$1::add);
         }
      }

      @Override
      public void a(tx $$0, Supplier<tx> $$1, List<tx> $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         if ($$0 instanceof tg $$4) {
            $$4.stream().filter(this.b).forEach($$2x -> {
               $$2.add($$2x);
               $$3.setTrue();
            });
            if ($$3.isFalse()) {
               ta $$5 = this.a.h();
               $$4.add($$5);
               $$2.add($$5);
            }
         }
      }

      @Override
      public tx a() {
         return new tg();
      }

      @Override
      public int a(tx $$0, Supplier<tx> $$1) {
         int $$2 = 0;
         if ($$0 instanceof tg $$3) {
            int $$4 = $$3.size();
            if ($$4 == 0) {
               $$3.add($$1.get());
               $$2++;
            } else {
               for (int $$5 = 0; $$5 < $$4; $$5++) {
                  tx $$6 = $$3.k($$5);
                  if (this.b.test($$6)) {
                     tx $$7 = $$1.get();
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
      public int a(tx $$0) {
         int $$1 = 0;
         if ($$0 instanceof tg $$2) {
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

   static class e implements em.h {
      private final String a;
      private final ta b;
      private final Predicate<tx> c;

      public e(String $$0, ta $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = em.a($$1);
      }

      @Override
      public void a(tx $$0, List<tx> $$1) {
         if ($$0 instanceof ta) {
            tx $$2 = ((ta)$$0).c(this.a);
            if (this.c.test($$2)) {
               $$1.add($$2);
            }
         }
      }

      @Override
      public void a(tx $$0, Supplier<tx> $$1, List<tx> $$2) {
         if ($$0 instanceof ta $$3) {
            tx $$4 = $$3.c(this.a);
            if ($$4 == null) {
               tx var6 = this.b.h();
               $$3.a(this.a, var6);
               $$2.add(var6);
            } else if (this.c.test($$4)) {
               $$2.add($$4);
            }
         }
      }

      @Override
      public tx a() {
         return new ta();
      }

      @Override
      public int a(tx $$0, Supplier<tx> $$1) {
         if ($$0 instanceof ta $$2) {
            tx $$3 = $$2.c(this.a);
            if (this.c.test($$3)) {
               tx $$4 = $$1.get();
               if (!$$4.equals($$3)) {
                  $$2.a(this.a, $$4);
                  return 1;
               }
            }
         }

         return 0;
      }

      @Override
      public int a(tx $$0) {
         if ($$0 instanceof ta $$1) {
            tx $$2 = $$1.c(this.a);
            if (this.c.test($$2)) {
               $$1.r(this.a);
               return 1;
            }
         }

         return 0;
      }
   }

   static class f implements em.h {
      private final Predicate<tx> a;

      public f(ta $$0) {
         this.a = em.a($$0);
      }

      @Override
      public void a(tx $$0, List<tx> $$1) {
         if ($$0 instanceof ta && this.a.test($$0)) {
            $$1.add($$0);
         }
      }

      @Override
      public void a(tx $$0, Supplier<tx> $$1, List<tx> $$2) {
         this.a($$0, $$2);
      }

      @Override
      public tx a() {
         return new ta();
      }

      @Override
      public int a(tx $$0, Supplier<tx> $$1) {
         return 0;
      }

      @Override
      public int a(tx $$0) {
         return 0;
      }
   }

   public static class g {
      private final String a;
      private final Object2IntMap<em.h> b;
      private final em.h[] c;

      public g(String $$0, em.h[] $$1, Object2IntMap<em.h> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public List<tx> a(tx $$0) throws CommandSyntaxException {
         List<tx> $$1 = Collections.singletonList($$0);

         for (em.h $$2 : this.c) {
            $$1 = $$2.a($$1);
            if ($$1.isEmpty()) {
               throw this.a($$2);
            }
         }

         return $$1;
      }

      public int b(tx $$0) {
         List<tx> $$1 = Collections.singletonList($$0);

         for (em.h $$2 : this.c) {
            $$1 = $$2.a($$1);
            if ($$1.isEmpty()) {
               return 0;
            }
         }

         return $$1.size();
      }

      private List<tx> d(tx $$0) throws CommandSyntaxException {
         List<tx> $$1 = Collections.singletonList($$0);

         for (int $$2 = 0; $$2 < this.c.length - 1; $$2++) {
            em.h $$3 = this.c[$$2];
            int $$4 = $$2 + 1;
            $$1 = $$3.a($$1, this.c[$$4]::a);
            if ($$1.isEmpty()) {
               throw this.a($$3);
            }
         }

         return $$1;
      }

      public List<tx> a(tx $$0, Supplier<tx> $$1) throws CommandSyntaxException {
         List<tx> $$2 = this.d($$0);
         em.h $$3 = this.c[this.c.length - 1];
         return $$3.a($$2, $$1);
      }

      private static int a(List<tx> $$0, Function<tx, Integer> $$1) {
         return $$0.stream().map($$1).reduce(0, ($$0x, $$1x) -> $$0x + $$1x);
      }

      public static boolean a(tx $$0, int $$1) {
         if ($$1 >= 512) {
            return true;
         } else {
            if ($$0 instanceof ta $$2) {
               for (String $$3 : $$2.e()) {
                  tx $$4 = $$2.c($$3);
                  if ($$4 != null && a($$4, $$1 + 1)) {
                     return true;
                  }
               }
            } else if ($$0 instanceof tg) {
               for (tx $$6 : (tg)$$0) {
                  if (a($$6, $$1 + 1)) {
                     return true;
                  }
               }
            }

            return false;
         }
      }

      public int a(tx $$0, tx $$1) throws CommandSyntaxException {
         if (a($$1, this.b())) {
            throw em.b.create();
         } else {
            tx $$2 = $$1.d();
            List<tx> $$3 = this.d($$0);
            if ($$3.isEmpty()) {
               return 0;
            } else {
               em.h $$4 = this.c[this.c.length - 1];
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

      public int a(int $$0, ta $$1, List<tx> $$2) throws CommandSyntaxException {
         List<tx> $$3 = new ArrayList<>($$2.size());

         for (tx $$4 : $$2) {
            tx $$5 = $$4.d();
            $$3.add($$5);
            if (a($$5, this.b())) {
               throw em.b.create();
            }
         }

         Collection<tx> $$6 = this.a($$1, tg::new);
         int $$7 = 0;
         boolean $$8 = false;

         for (tx $$9 : $$6) {
            if (!($$9 instanceof sz<?> $$10)) {
               throw em.e.create($$9);
            }

            boolean $$11 = false;
            int $$12 = $$0 < 0 ? $$10.size() + $$0 + 1 : $$0;

            for (tx $$13 : $$3) {
               try {
                  if ($$10.b($$12, $$8 ? $$13.d() : $$13)) {
                     $$12++;
                     $$11 = true;
                  }
               } catch (IndexOutOfBoundsException var16) {
                  throw em.f.create($$12);
               }
            }

            $$8 = true;
            $$7 += $$11 ? 1 : 0;
         }

         return $$7;
      }

      public int c(tx $$0) {
         List<tx> $$1 = Collections.singletonList($$0);

         for (int $$2 = 0; $$2 < this.c.length - 1; $$2++) {
            $$1 = this.c[$$2].a($$1);
         }

         em.h $$3 = this.c[this.c.length - 1];
         return a($$1, $$3::a);
      }

      private CommandSyntaxException a(em.h $$0) {
         int $$1 = this.b.getInt($$0);
         return em.c.create(this.a.substring(0, $$1));
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
      void a(tx var1, List<tx> var2);

      void a(tx var1, Supplier<tx> var2, List<tx> var3);

      tx a();

      int a(tx var1, Supplier<tx> var2);

      int a(tx var1);

      default List<tx> a(List<tx> $$0) {
         return this.a($$0, this::a);
      }

      default List<tx> a(List<tx> $$0, Supplier<tx> $$1) {
         return this.a($$0, ($$1x, $$2) -> this.a($$1x, $$1, $$2));
      }

      default List<tx> a(List<tx> $$0, BiConsumer<tx, List<tx>> $$1) {
         List<tx> $$2 = Lists.newArrayList();

         for (tx $$3 : $$0) {
            $$1.accept($$3, $$2);
         }

         return $$2;
      }
   }
}
