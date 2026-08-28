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

public class fl implements ArgumentType<fl.g> {
   private static final Collection<String> d = Arrays.asList("foo", "foo.bar", "foo[0]", "[0]", "[]", "{foo=bar}");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wz.c("arguments.nbtpath.node.invalid"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wz.c("arguments.nbtpath.too_deep"));
   public static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wz.b("arguments.nbtpath.nothing_found", $$0));
   static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wz.b("commands.data.modify.expected_list", $$0));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> wz.b("commands.data.modify.invalid_index", $$0));
   private static final char g = '[';
   private static final char h = ']';
   private static final char i = '{';
   private static final char j = '}';
   private static final char k = '"';
   private static final char l = '\'';

   public static fl a() {
      return new fl();
   }

   public static fl.g a(CommandContext<et> $$0, String $$1) {
      return (fl.g)$$0.getArgument($$1, fl.g.class);
   }

   public fl.g a(StringReader $$0) throws CommandSyntaxException {
      List<fl.h> $$1 = Lists.newArrayList();
      int $$2 = $$0.getCursor();
      Object2IntMap<fl.h> $$3 = new Object2IntOpenHashMap();
      boolean $$4 = true;

      while ($$0.canRead() && $$0.peek() != ' ') {
         fl.h $$5 = a($$0, $$4);
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

      return new fl.g($$0.getString().substring($$2, $$0.getCursor()), $$1.toArray(new fl.h[0]), $$3);
   }

   private static fl.h a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      return (fl.h)(switch ($$0.peek()) {
         case '"', '\'' -> a($$0, $$0.readString());
         case '[' -> {
            $$0.skip();
            int $$3 = $$0.peek();
            if ($$3 == 123) {
               ub $$4 = new uz($$0).f();
               $$0.expect(']');
               yield new fl.d($$4);
            } else if ($$3 == 93) {
               $$0.skip();
               yield fl.a.a;
            } else {
               int $$5 = $$0.readInt();
               $$0.expect(']');
               yield new fl.c($$5);
            }
         }
         case '{' -> {
            if (!$$1) {
               throw a.createWithContext($$0);
            }

            ub $$2 = new uz($$0).f();
            yield new fl.f($$2);
         }
         default -> a($$0, b($$0));
      });
   }

   private static fl.h a(StringReader $$0, String $$1) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '{') {
         ub $$2 = new uz($$0).f();
         return new fl.e($$1, $$2);
      } else {
         return new fl.b($$1);
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

   static Predicate<uy> a(ub $$0) {
      return $$1 -> uq.a($$0, $$1, true);
   }

   static class a implements fl.h {
      public static final fl.a a = new fl.a();

      private a() {
      }

      @Override
      public void a(uy $$0, List<uy> $$1) {
         if ($$0 instanceof ua) {
            $$1.addAll((ua)$$0);
         }
      }

      @Override
      public void a(uy $$0, Supplier<uy> $$1, List<uy> $$2) {
         if ($$0 instanceof ua<?> $$3) {
            if ($$3.isEmpty()) {
               uy $$4 = $$1.get();
               if ($$3.b(0, $$4)) {
                  $$2.add($$4);
               }
            } else {
               $$2.addAll((Collection<? extends uy>)$$3);
            }
         }
      }

      @Override
      public uy a() {
         return new uh();
      }

      @Override
      public int a(uy $$0, Supplier<uy> $$1) {
         if (!($$0 instanceof ua<?> $$2)) {
            return 0;
         } else {
            int $$3 = $$2.size();
            if ($$3 == 0) {
               $$2.b(0, $$1.get());
               return 1;
            } else {
               uy $$4 = $$1.get();
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
      public int a(uy $$0) {
         if ($$0 instanceof ua<?> $$1) {
            int $$2 = $$1.size();
            if ($$2 > 0) {
               $$1.clear();
               return $$2;
            }
         }

         return 0;
      }
   }

   static class b implements fl.h {
      private final String a;

      public b(String $$0) {
         this.a = $$0;
      }

      @Override
      public void a(uy $$0, List<uy> $$1) {
         if ($$0 instanceof ub) {
            uy $$2 = ((ub)$$0).c(this.a);
            if ($$2 != null) {
               $$1.add($$2);
            }
         }
      }

      @Override
      public void a(uy $$0, Supplier<uy> $$1, List<uy> $$2) {
         if ($$0 instanceof ub $$3) {
            uy $$4;
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
      public uy a() {
         return new ub();
      }

      @Override
      public int a(uy $$0, Supplier<uy> $$1) {
         if ($$0 instanceof ub $$2) {
            uy $$3 = $$1.get();
            uy $$4 = $$2.a(this.a, $$3);
            if (!$$3.equals($$4)) {
               return 1;
            }
         }

         return 0;
      }

      @Override
      public int a(uy $$0) {
         if ($$0 instanceof ub $$1 && $$1.e(this.a)) {
            $$1.r(this.a);
            return 1;
         }

         return 0;
      }
   }

   static class c implements fl.h {
      private final int a;

      public c(int $$0) {
         this.a = $$0;
      }

      @Override
      public void a(uy $$0, List<uy> $$1) {
         if ($$0 instanceof ua<?> $$2) {
            int $$3 = $$2.size();
            int $$4 = this.a < 0 ? $$3 + this.a : this.a;
            if (0 <= $$4 && $$4 < $$3) {
               $$1.add($$2.get($$4));
            }
         }
      }

      @Override
      public void a(uy $$0, Supplier<uy> $$1, List<uy> $$2) {
         this.a($$0, $$2);
      }

      @Override
      public uy a() {
         return new uh();
      }

      @Override
      public int a(uy $$0, Supplier<uy> $$1) {
         if ($$0 instanceof ua<?> $$2) {
            int $$3 = $$2.size();
            int $$4 = this.a < 0 ? $$3 + this.a : this.a;
            if (0 <= $$4 && $$4 < $$3) {
               uy $$5 = $$2.get($$4);
               uy $$6 = $$1.get();
               if (!$$6.equals($$5) && $$2.a($$4, $$6)) {
                  return 1;
               }
            }
         }

         return 0;
      }

      @Override
      public int a(uy $$0) {
         if ($$0 instanceof ua<?> $$1) {
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

   static class d implements fl.h {
      private final ub a;
      private final Predicate<uy> b;

      public d(ub $$0) {
         this.a = $$0;
         this.b = fl.a($$0);
      }

      @Override
      public void a(uy $$0, List<uy> $$1) {
         if ($$0 instanceof uh $$2) {
            $$2.stream().filter(this.b).forEach($$1::add);
         }
      }

      @Override
      public void a(uy $$0, Supplier<uy> $$1, List<uy> $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         if ($$0 instanceof uh $$4) {
            $$4.stream().filter(this.b).forEach($$2x -> {
               $$2.add($$2x);
               $$3.setTrue();
            });
            if ($$3.isFalse()) {
               ub $$5 = this.a.i();
               $$4.add($$5);
               $$2.add($$5);
            }
         }
      }

      @Override
      public uy a() {
         return new uh();
      }

      @Override
      public int a(uy $$0, Supplier<uy> $$1) {
         int $$2 = 0;
         if ($$0 instanceof uh $$3) {
            int $$4 = $$3.size();
            if ($$4 == 0) {
               $$3.add($$1.get());
               $$2++;
            } else {
               for (int $$5 = 0; $$5 < $$4; $$5++) {
                  uy $$6 = $$3.k($$5);
                  if (this.b.test($$6)) {
                     uy $$7 = $$1.get();
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
      public int a(uy $$0) {
         int $$1 = 0;
         if ($$0 instanceof uh $$2) {
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

   static class e implements fl.h {
      private final String a;
      private final ub b;
      private final Predicate<uy> c;

      public e(String $$0, ub $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = fl.a($$1);
      }

      @Override
      public void a(uy $$0, List<uy> $$1) {
         if ($$0 instanceof ub) {
            uy $$2 = ((ub)$$0).c(this.a);
            if (this.c.test($$2)) {
               $$1.add($$2);
            }
         }
      }

      @Override
      public void a(uy $$0, Supplier<uy> $$1, List<uy> $$2) {
         if ($$0 instanceof ub $$3) {
            uy $$4 = $$3.c(this.a);
            if ($$4 == null) {
               uy var6 = this.b.i();
               $$3.a(this.a, var6);
               $$2.add(var6);
            } else if (this.c.test($$4)) {
               $$2.add($$4);
            }
         }
      }

      @Override
      public uy a() {
         return new ub();
      }

      @Override
      public int a(uy $$0, Supplier<uy> $$1) {
         if ($$0 instanceof ub $$2) {
            uy $$3 = $$2.c(this.a);
            if (this.c.test($$3)) {
               uy $$4 = $$1.get();
               if (!$$4.equals($$3)) {
                  $$2.a(this.a, $$4);
                  return 1;
               }
            }
         }

         return 0;
      }

      @Override
      public int a(uy $$0) {
         if ($$0 instanceof ub $$1) {
            uy $$2 = $$1.c(this.a);
            if (this.c.test($$2)) {
               $$1.r(this.a);
               return 1;
            }
         }

         return 0;
      }
   }

   static class f implements fl.h {
      private final Predicate<uy> a;

      public f(ub $$0) {
         this.a = fl.a($$0);
      }

      @Override
      public void a(uy $$0, List<uy> $$1) {
         if ($$0 instanceof ub && this.a.test($$0)) {
            $$1.add($$0);
         }
      }

      @Override
      public void a(uy $$0, Supplier<uy> $$1, List<uy> $$2) {
         this.a($$0, $$2);
      }

      @Override
      public uy a() {
         return new ub();
      }

      @Override
      public int a(uy $$0, Supplier<uy> $$1) {
         return 0;
      }

      @Override
      public int a(uy $$0) {
         return 0;
      }
   }

   public static class g {
      private final String b;
      private final Object2IntMap<fl.h> c;
      private final fl.h[] d;
      public static final Codec<fl.g> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            fl.g $$1 = new fl().a(new StringReader($$0));
            return DataResult.success($$1);
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, fl.g::a);

      public static fl.g a(String $$0) throws CommandSyntaxException {
         return new fl().a(new StringReader($$0));
      }

      public g(String $$0, fl.h[] $$1, Object2IntMap<fl.h> $$2) {
         this.b = $$0;
         this.d = $$1;
         this.c = $$2;
      }

      public List<uy> a(uy $$0) throws CommandSyntaxException {
         List<uy> $$1 = Collections.singletonList($$0);

         for (fl.h $$2 : this.d) {
            $$1 = $$2.a($$1);
            if ($$1.isEmpty()) {
               throw this.a($$2);
            }
         }

         return $$1;
      }

      public int b(uy $$0) {
         List<uy> $$1 = Collections.singletonList($$0);

         for (fl.h $$2 : this.d) {
            $$1 = $$2.a($$1);
            if ($$1.isEmpty()) {
               return 0;
            }
         }

         return $$1.size();
      }

      private List<uy> d(uy $$0) throws CommandSyntaxException {
         List<uy> $$1 = Collections.singletonList($$0);

         for (int $$2 = 0; $$2 < this.d.length - 1; $$2++) {
            fl.h $$3 = this.d[$$2];
            int $$4 = $$2 + 1;
            $$1 = $$3.a($$1, this.d[$$4]::a);
            if ($$1.isEmpty()) {
               throw this.a($$3);
            }
         }

         return $$1;
      }

      public List<uy> a(uy $$0, Supplier<uy> $$1) throws CommandSyntaxException {
         List<uy> $$2 = this.d($$0);
         fl.h $$3 = this.d[this.d.length - 1];
         return $$3.a($$2, $$1);
      }

      private static int a(List<uy> $$0, Function<uy, Integer> $$1) {
         return $$0.stream().map($$1).reduce(0, ($$0x, $$1x) -> $$0x + $$1x);
      }

      public static boolean a(uy $$0, int $$1) {
         if ($$1 >= 512) {
            return true;
         } else {
            if ($$0 instanceof ub $$2) {
               for (String $$3 : $$2.e()) {
                  uy $$4 = $$2.c($$3);
                  if ($$4 != null && a($$4, $$1 + 1)) {
                     return true;
                  }
               }
            } else if ($$0 instanceof uh) {
               for (uy $$6 : (uh)$$0) {
                  if (a($$6, $$1 + 1)) {
                     return true;
                  }
               }
            }

            return false;
         }
      }

      public int a(uy $$0, uy $$1) throws CommandSyntaxException {
         if (a($$1, this.b())) {
            throw fl.b.create();
         } else {
            uy $$2 = $$1.d();
            List<uy> $$3 = this.d($$0);
            if ($$3.isEmpty()) {
               return 0;
            } else {
               fl.h $$4 = this.d[this.d.length - 1];
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

      public int a(int $$0, ub $$1, List<uy> $$2) throws CommandSyntaxException {
         List<uy> $$3 = new ArrayList<>($$2.size());

         for (uy $$4 : $$2) {
            uy $$5 = $$4.d();
            $$3.add($$5);
            if (a($$5, this.b())) {
               throw fl.b.create();
            }
         }

         Collection<uy> $$6 = this.a($$1, uh::new);
         int $$7 = 0;
         boolean $$8 = false;

         for (uy $$9 : $$6) {
            if (!($$9 instanceof ua<?> $$10)) {
               throw fl.e.create($$9);
            }

            boolean $$11 = false;
            int $$12 = $$0 < 0 ? $$10.size() + $$0 + 1 : $$0;

            for (uy $$13 : $$3) {
               try {
                  if ($$10.b($$12, $$8 ? $$13.d() : $$13)) {
                     $$12++;
                     $$11 = true;
                  }
               } catch (IndexOutOfBoundsException var16) {
                  throw fl.f.create($$12);
               }
            }

            $$8 = true;
            $$7 += $$11 ? 1 : 0;
         }

         return $$7;
      }

      public int c(uy $$0) {
         List<uy> $$1 = Collections.singletonList($$0);

         for (int $$2 = 0; $$2 < this.d.length - 1; $$2++) {
            $$1 = this.d[$$2].a($$1);
         }

         fl.h $$3 = this.d[this.d.length - 1];
         return a($$1, $$3::a);
      }

      private CommandSyntaxException a(fl.h $$0) {
         int $$1 = this.c.getInt($$0);
         return fl.c.create(this.b.substring(0, $$1));
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
      void a(uy var1, List<uy> var2);

      void a(uy var1, Supplier<uy> var2, List<uy> var3);

      uy a();

      int a(uy var1, Supplier<uy> var2);

      int a(uy var1);

      default List<uy> a(List<uy> $$0) {
         return this.a($$0, this::a);
      }

      default List<uy> a(List<uy> $$0, Supplier<uy> $$1) {
         return this.a($$0, ($$1x, $$2) -> this.a($$1x, $$1, $$2));
      }

      default List<uy> a(List<uy> $$0, BiConsumer<uy, List<uy>> $$1) {
         List<uy> $$2 = Lists.newArrayList();

         for (uy $$3 : $$0) {
            $$1.accept($$3, $$2);
         }

         return $$2;
      }
   }
}
