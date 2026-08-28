import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
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

public class fc implements ArgumentType<fc.g> {
   private static final Collection<String> d = Arrays.asList("foo", "foo.bar", "foo[0]", "[0]", "[]", "{foo=bar}");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xc.c("arguments.nbtpath.node.invalid"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xc.c("arguments.nbtpath.too_deep"));
   public static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xc.b("arguments.nbtpath.nothing_found", $$0));
   static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xc.b("commands.data.modify.expected_list", $$0));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xc.b("commands.data.modify.invalid_index", $$0));
   private static final char g = '[';
   private static final char h = ']';
   private static final char i = '{';
   private static final char j = '}';
   private static final char k = '"';
   private static final char l = '\'';

   public static fc a() {
      return new fc();
   }

   public static fc.g a(CommandContext<ek> $$0, String $$1) {
      return (fc.g)$$0.getArgument($$1, fc.g.class);
   }

   public fc.g a(StringReader $$0) throws CommandSyntaxException {
      List<fc.h> $$1 = Lists.newArrayList();
      int $$2 = $$0.getCursor();
      Object2IntMap<fc.h> $$3 = new Object2IntOpenHashMap();
      boolean $$4 = true;

      while ($$0.canRead() && $$0.peek() != ' ') {
         fc.h $$5 = a($$0, $$4);
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

      return new fc.g($$0.getString().substring($$2, $$0.getCursor()), $$1.toArray(new fc.h[0]), $$3);
   }

   private static fc.h a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      return (fc.h)(switch ($$0.peek()) {
         case '"', '\'' -> a($$0, $$0.readString());
         case '[' -> {
            $$0.skip();
            int $$3 = $$0.peek();
            if ($$3 == 123) {
               ua $$4 = vb.c($$0);
               $$0.expect(']');
               yield new fc.d($$4);
            } else if ($$3 == 93) {
               $$0.skip();
               yield fc.a.a;
            } else {
               int $$5 = $$0.readInt();
               $$0.expect(']');
               yield new fc.c($$5);
            }
         }
         case '{' -> {
            if (!$$1) {
               throw a.createWithContext($$0);
            }

            ua $$2 = vb.c($$0);
            yield new fc.f($$2);
         }
         default -> a($$0, b($$0));
      });
   }

   private static fc.h a(StringReader $$0, String $$1) throws CommandSyntaxException {
      if ($$1.isEmpty()) {
         throw a.createWithContext($$0);
      } else if ($$0.canRead() && $$0.peek() == '{') {
         ua $$2 = vb.c($$0);
         return new fc.e($$1, $$2);
      } else {
         return new fc.b($$1);
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

   static Predicate<va> a(ua $$0) {
      return $$1 -> up.a($$0, $$1, true);
   }

   static class a implements fc.h {
      public static final fc.a a = new fc.a();

      private a() {
      }

      @Override
      public void a(va $$0, List<va> $$1) {
         if ($$0 instanceof tz $$2) {
            Iterables.addAll($$1, $$2);
         }
      }

      @Override
      public void a(va $$0, Supplier<va> $$1, List<va> $$2) {
         if ($$0 instanceof tz $$3) {
            if ($$3.isEmpty()) {
               va $$4 = $$1.get();
               if ($$3.b(0, $$4)) {
                  $$2.add($$4);
               }
            } else {
               Iterables.addAll($$2, $$3);
            }
         }
      }

      @Override
      public va a() {
         return new ug();
      }

      @Override
      public int a(va $$0, Supplier<va> $$1) {
         if (!($$0 instanceof tz $$2)) {
            return 0;
         } else {
            int $$3 = $$2.size();
            if ($$3 == 0) {
               $$2.b(0, $$1.get());
               return 1;
            } else {
               va $$4 = $$1.get();
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
      public int a(va $$0) {
         if ($$0 instanceof tz $$1) {
            int $$2 = $$1.size();
            if ($$2 > 0) {
               $$1.clear();
               return $$2;
            }
         }

         return 0;
      }
   }

   static class b implements fc.h {
      private final String a;

      public b(String $$0) {
         this.a = $$0;
      }

      @Override
      public void a(va $$0, List<va> $$1) {
         if ($$0 instanceof ua) {
            va $$2 = ((ua)$$0).a(this.a);
            if ($$2 != null) {
               $$1.add($$2);
            }
         }
      }

      @Override
      public void a(va $$0, Supplier<va> $$1, List<va> $$2) {
         if ($$0 instanceof ua $$3) {
            va $$4;
            if ($$3.b(this.a)) {
               $$4 = $$3.a(this.a);
            } else {
               $$4 = $$1.get();
               $$3.a(this.a, $$4);
            }

            $$2.add($$4);
         }
      }

      @Override
      public va a() {
         return new ua();
      }

      @Override
      public int a(va $$0, Supplier<va> $$1) {
         if ($$0 instanceof ua $$2) {
            va $$3 = $$1.get();
            va $$4 = $$2.a(this.a, $$3);
            if (!$$3.equals($$4)) {
               return 1;
            }
         }

         return 0;
      }

      @Override
      public int a(va $$0) {
         if ($$0 instanceof ua $$1 && $$1.b(this.a)) {
            $$1.r(this.a);
            return 1;
         }

         return 0;
      }
   }

   static class c implements fc.h {
      private final int a;

      public c(int $$0) {
         this.a = $$0;
      }

      @Override
      public void a(va $$0, List<va> $$1) {
         if ($$0 instanceof tz $$2) {
            int $$3 = $$2.size();
            int $$4 = this.a < 0 ? $$3 + this.a : this.a;
            if (0 <= $$4 && $$4 < $$3) {
               $$1.add($$2.c($$4));
            }
         }
      }

      @Override
      public void a(va $$0, Supplier<va> $$1, List<va> $$2) {
         this.a($$0, $$2);
      }

      @Override
      public va a() {
         return new ug();
      }

      @Override
      public int a(va $$0, Supplier<va> $$1) {
         if ($$0 instanceof tz $$2) {
            int $$3 = $$2.size();
            int $$4 = this.a < 0 ? $$3 + this.a : this.a;
            if (0 <= $$4 && $$4 < $$3) {
               va $$5 = $$2.c($$4);
               va $$6 = $$1.get();
               if (!$$6.equals($$5) && $$2.a($$4, $$6)) {
                  return 1;
               }
            }
         }

         return 0;
      }

      @Override
      public int a(va $$0) {
         if ($$0 instanceof tz $$1) {
            int $$2 = $$1.size();
            int $$3 = this.a < 0 ? $$2 + this.a : this.a;
            if (0 <= $$3 && $$3 < $$2) {
               $$1.d($$3);
               return 1;
            }
         }

         return 0;
      }
   }

   static class d implements fc.h {
      private final ua a;
      private final Predicate<va> b;

      public d(ua $$0) {
         this.a = $$0;
         this.b = fc.a($$0);
      }

      @Override
      public void a(va $$0, List<va> $$1) {
         if ($$0 instanceof ug $$2) {
            $$2.stream().filter(this.b).forEach($$1::add);
         }
      }

      @Override
      public void a(va $$0, Supplier<va> $$1, List<va> $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         if ($$0 instanceof ug $$4) {
            $$4.stream().filter(this.b).forEach($$2x -> {
               $$2.add($$2x);
               $$3.setTrue();
            });
            if ($$3.isFalse()) {
               ua $$5 = this.a.l();
               $$4.add($$5);
               $$2.add($$5);
            }
         }
      }

      @Override
      public va a() {
         return new ug();
      }

      @Override
      public int a(va $$0, Supplier<va> $$1) {
         int $$2 = 0;
         if ($$0 instanceof ug $$3) {
            int $$4 = $$3.size();
            if ($$4 == 0) {
               $$3.add($$1.get());
               $$2++;
            } else {
               for (int $$5 = 0; $$5 < $$4; $$5++) {
                  va $$6 = $$3.c($$5);
                  if (this.b.test($$6)) {
                     va $$7 = $$1.get();
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
      public int a(va $$0) {
         int $$1 = 0;
         if ($$0 instanceof ug $$2) {
            for (int $$3 = $$2.size() - 1; $$3 >= 0; $$3--) {
               if (this.b.test($$2.c($$3))) {
                  $$2.d($$3);
                  $$1++;
               }
            }
         }

         return $$1;
      }
   }

   static class e implements fc.h {
      private final String a;
      private final ua b;
      private final Predicate<va> c;

      public e(String $$0, ua $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = fc.a($$1);
      }

      @Override
      public void a(va $$0, List<va> $$1) {
         if ($$0 instanceof ua) {
            va $$2 = ((ua)$$0).a(this.a);
            if (this.c.test($$2)) {
               $$1.add($$2);
            }
         }
      }

      @Override
      public void a(va $$0, Supplier<va> $$1, List<va> $$2) {
         if ($$0 instanceof ua $$3) {
            va $$4 = $$3.a(this.a);
            if ($$4 == null) {
               va var6 = this.b.l();
               $$3.a(this.a, var6);
               $$2.add(var6);
            } else if (this.c.test($$4)) {
               $$2.add($$4);
            }
         }
      }

      @Override
      public va a() {
         return new ua();
      }

      @Override
      public int a(va $$0, Supplier<va> $$1) {
         if ($$0 instanceof ua $$2) {
            va $$3 = $$2.a(this.a);
            if (this.c.test($$3)) {
               va $$4 = $$1.get();
               if (!$$4.equals($$3)) {
                  $$2.a(this.a, $$4);
                  return 1;
               }
            }
         }

         return 0;
      }

      @Override
      public int a(va $$0) {
         if ($$0 instanceof ua $$1) {
            va $$2 = $$1.a(this.a);
            if (this.c.test($$2)) {
               $$1.r(this.a);
               return 1;
            }
         }

         return 0;
      }
   }

   static class f implements fc.h {
      private final Predicate<va> a;

      public f(ua $$0) {
         this.a = fc.a($$0);
      }

      @Override
      public void a(va $$0, List<va> $$1) {
         if ($$0 instanceof ua && this.a.test($$0)) {
            $$1.add($$0);
         }
      }

      @Override
      public void a(va $$0, Supplier<va> $$1, List<va> $$2) {
         this.a($$0, $$2);
      }

      @Override
      public va a() {
         return new ua();
      }

      @Override
      public int a(va $$0, Supplier<va> $$1) {
         return 0;
      }

      @Override
      public int a(va $$0) {
         return 0;
      }
   }

   public static class g {
      private final String b;
      private final Object2IntMap<fc.h> c;
      private final fc.h[] d;
      public static final Codec<fc.g> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            fc.g $$1 = new fc().a(new StringReader($$0));
            return DataResult.success($$1);
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, fc.g::a);

      public static fc.g a(String $$0) throws CommandSyntaxException {
         return new fc().a(new StringReader($$0));
      }

      public g(String $$0, fc.h[] $$1, Object2IntMap<fc.h> $$2) {
         this.b = $$0;
         this.d = $$1;
         this.c = $$2;
      }

      public List<va> a(va $$0) throws CommandSyntaxException {
         List<va> $$1 = Collections.singletonList($$0);

         for (fc.h $$2 : this.d) {
            $$1 = $$2.a($$1);
            if ($$1.isEmpty()) {
               throw this.a($$2);
            }
         }

         return $$1;
      }

      public int b(va $$0) {
         List<va> $$1 = Collections.singletonList($$0);

         for (fc.h $$2 : this.d) {
            $$1 = $$2.a($$1);
            if ($$1.isEmpty()) {
               return 0;
            }
         }

         return $$1.size();
      }

      private List<va> d(va $$0) throws CommandSyntaxException {
         List<va> $$1 = Collections.singletonList($$0);

         for (int $$2 = 0; $$2 < this.d.length - 1; $$2++) {
            fc.h $$3 = this.d[$$2];
            int $$4 = $$2 + 1;
            $$1 = $$3.a($$1, this.d[$$4]::a);
            if ($$1.isEmpty()) {
               throw this.a($$3);
            }
         }

         return $$1;
      }

      public List<va> a(va $$0, Supplier<va> $$1) throws CommandSyntaxException {
         List<va> $$2 = this.d($$0);
         fc.h $$3 = this.d[this.d.length - 1];
         return $$3.a($$2, $$1);
      }

      private static int a(List<va> $$0, Function<va, Integer> $$1) {
         return $$0.stream().map($$1).reduce(0, ($$0x, $$1x) -> $$0x + $$1x);
      }

      public static boolean a(va $$0, int $$1) {
         if ($$1 >= 512) {
            return true;
         } else {
            if ($$0 instanceof ua $$2) {
               for (va $$3 : $$2.h()) {
                  if (a($$3, $$1 + 1)) {
                     return true;
                  }
               }
            } else if ($$0 instanceof ug) {
               for (va $$5 : (ug)$$0) {
                  if (a($$5, $$1 + 1)) {
                     return true;
                  }
               }
            }

            return false;
         }
      }

      public int a(va $$0, va $$1) throws CommandSyntaxException {
         if (a($$1, this.b())) {
            throw fc.b.create();
         } else {
            va $$2 = $$1.d();
            List<va> $$3 = this.d($$0);
            if ($$3.isEmpty()) {
               return 0;
            } else {
               fc.h $$4 = this.d[this.d.length - 1];
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
         return this.d.length;
      }

      public int a(int $$0, ua $$1, List<va> $$2) throws CommandSyntaxException {
         List<va> $$3 = new ArrayList<>($$2.size());

         for (va $$4 : $$2) {
            va $$5 = $$4.d();
            $$3.add($$5);
            if (a($$5, this.b())) {
               throw fc.b.create();
            }
         }

         Collection<va> $$6 = this.a($$1, ug::new);
         int $$7 = 0;
         boolean $$8 = false;

         for (va $$9 : $$6) {
            if (!($$9 instanceof tz $$10)) {
               throw fc.e.create($$9);
            }

            boolean $$12 = false;
            int $$13 = $$0 < 0 ? $$10.size() + $$0 + 1 : $$0;

            for (va $$14 : $$3) {
               try {
                  if ($$10.b($$13, $$8 ? $$14.d() : $$14)) {
                     $$13++;
                     $$12 = true;
                  }
               } catch (IndexOutOfBoundsException var16) {
                  throw fc.f.create($$13);
               }
            }

            $$8 = true;
            $$7 += $$12 ? 1 : 0;
         }

         return $$7;
      }

      public int c(va $$0) {
         List<va> $$1 = Collections.singletonList($$0);

         for (int $$2 = 0; $$2 < this.d.length - 1; $$2++) {
            $$1 = this.d[$$2].a($$1);
         }

         fc.h $$3 = this.d[this.d.length - 1];
         return a($$1, $$3::a);
      }

      private CommandSyntaxException a(fc.h $$0) {
         int $$1 = this.c.getInt($$0);
         return fc.c.create(this.b.substring(0, $$1));
      }

      @Override
      public String toString() {
         return this.b;
      }

      public String a() {
         return this.b;
      }
   }

   interface h {
      void a(va var1, List<va> var2);

      void a(va var1, Supplier<va> var2, List<va> var3);

      va a();

      int a(va var1, Supplier<va> var2);

      int a(va var1);

      default List<va> a(List<va> $$0) {
         return this.a($$0, this::a);
      }

      default List<va> a(List<va> $$0, Supplier<va> $$1) {
         return this.a($$0, ($$1x, $$2) -> this.a($$1x, $$1, $$2));
      }

      default List<va> a(List<va> $$0, BiConsumer<va, List<va>> $$1) {
         List<va> $$2 = Lists.newArrayList();

         for (va $$3 : $$0) {
            $$1.accept($$3, $$2);
         }

         return $$2;
      }
   }
}
