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

public class fh implements ArgumentType<fh.g> {
   private static final Collection<String> d = Arrays.asList("foo", "foo.bar", "foo[0]", "[0]", "[]", "{foo=bar}");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xl.c("arguments.nbtpath.node.invalid"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xl.c("arguments.nbtpath.too_deep"));
   public static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xl.b("arguments.nbtpath.nothing_found", $$0));
   static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xl.b("commands.data.modify.expected_list", $$0));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xl.b("commands.data.modify.invalid_index", $$0));
   private static final char g = '[';
   private static final char h = ']';
   private static final char i = '{';
   private static final char j = '}';
   private static final char k = '"';
   private static final char l = '\'';

   public static fh a() {
      return new fh();
   }

   public static fh.g a(CommandContext<ep> $$0, String $$1) {
      return (fh.g)$$0.getArgument($$1, fh.g.class);
   }

   public fh.g a(StringReader $$0) throws CommandSyntaxException {
      List<fh.h> $$1 = Lists.newArrayList();
      int $$2 = $$0.getCursor();
      Object2IntMap<fh.h> $$3 = new Object2IntOpenHashMap();
      boolean $$4 = true;

      while ($$0.canRead() && $$0.peek() != ' ') {
         fh.h $$5 = a($$0, $$4);
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

      return new fh.g($$0.getString().substring($$2, $$0.getCursor()), $$1.toArray(new fh.h[0]), $$3);
   }

   private static fh.h a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      return (fh.h)(switch ($$0.peek()) {
         case '"', '\'' -> a($$0, $$0.readString());
         case '[' -> {
            $$0.skip();
            int $$3 = $$0.peek();
            if ($$3 == 123) {
               ur $$4 = new vp($$0).f();
               $$0.expect(']');
               yield new fh.d($$4);
            } else if ($$3 == 93) {
               $$0.skip();
               yield fh.a.a;
            } else {
               int $$5 = $$0.readInt();
               $$0.expect(']');
               yield new fh.c($$5);
            }
         }
         case '{' -> {
            if (!$$1) {
               throw a.createWithContext($$0);
            }

            ur $$2 = new vp($$0).f();
            yield new fh.f($$2);
         }
         default -> a($$0, b($$0));
      });
   }

   private static fh.h a(StringReader $$0, String $$1) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '{') {
         ur $$2 = new vp($$0).f();
         return new fh.e($$1, $$2);
      } else {
         return new fh.b($$1);
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

   static Predicate<vo> a(ur $$0) {
      return $$1 -> vg.a($$0, $$1, true);
   }

   static class a implements fh.h {
      public static final fh.a a = new fh.a();

      private a() {
      }

      @Override
      public void a(vo $$0, List<vo> $$1) {
         if ($$0 instanceof uq) {
            $$1.addAll((uq)$$0);
         }
      }

      @Override
      public void a(vo $$0, Supplier<vo> $$1, List<vo> $$2) {
         if ($$0 instanceof uq<?> $$3) {
            if ($$3.isEmpty()) {
               vo $$4 = $$1.get();
               if ($$3.b(0, $$4)) {
                  $$2.add($$4);
               }
            } else {
               $$2.addAll((Collection<? extends vo>)$$3);
            }
         }
      }

      @Override
      public vo a() {
         return new ux();
      }

      @Override
      public int a(vo $$0, Supplier<vo> $$1) {
         if (!($$0 instanceof uq<?> $$2)) {
            return 0;
         } else {
            int $$3 = $$2.size();
            if ($$3 == 0) {
               $$2.b(0, $$1.get());
               return 1;
            } else {
               vo $$4 = $$1.get();
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
      public int a(vo $$0) {
         if ($$0 instanceof uq<?> $$1) {
            int $$2 = $$1.size();
            if ($$2 > 0) {
               $$1.clear();
               return $$2;
            }
         }

         return 0;
      }
   }

   static class b implements fh.h {
      private final String a;

      public b(String $$0) {
         this.a = $$0;
      }

      @Override
      public void a(vo $$0, List<vo> $$1) {
         if ($$0 instanceof ur) {
            vo $$2 = ((ur)$$0).c(this.a);
            if ($$2 != null) {
               $$1.add($$2);
            }
         }
      }

      @Override
      public void a(vo $$0, Supplier<vo> $$1, List<vo> $$2) {
         if ($$0 instanceof ur $$3) {
            vo $$4;
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
      public vo a() {
         return new ur();
      }

      @Override
      public int a(vo $$0, Supplier<vo> $$1) {
         if ($$0 instanceof ur $$2) {
            vo $$3 = $$1.get();
            vo $$4 = $$2.a(this.a, $$3);
            if (!$$3.equals($$4)) {
               return 1;
            }
         }

         return 0;
      }

      @Override
      public int a(vo $$0) {
         if ($$0 instanceof ur $$1 && $$1.e(this.a)) {
            $$1.r(this.a);
            return 1;
         }

         return 0;
      }
   }

   static class c implements fh.h {
      private final int a;

      public c(int $$0) {
         this.a = $$0;
      }

      @Override
      public void a(vo $$0, List<vo> $$1) {
         if ($$0 instanceof uq<?> $$2) {
            int $$3 = $$2.size();
            int $$4 = this.a < 0 ? $$3 + this.a : this.a;
            if (0 <= $$4 && $$4 < $$3) {
               $$1.add($$2.get($$4));
            }
         }
      }

      @Override
      public void a(vo $$0, Supplier<vo> $$1, List<vo> $$2) {
         this.a($$0, $$2);
      }

      @Override
      public vo a() {
         return new ux();
      }

      @Override
      public int a(vo $$0, Supplier<vo> $$1) {
         if ($$0 instanceof uq<?> $$2) {
            int $$3 = $$2.size();
            int $$4 = this.a < 0 ? $$3 + this.a : this.a;
            if (0 <= $$4 && $$4 < $$3) {
               vo $$5 = $$2.get($$4);
               vo $$6 = $$1.get();
               if (!$$6.equals($$5) && $$2.a($$4, $$6)) {
                  return 1;
               }
            }
         }

         return 0;
      }

      @Override
      public int a(vo $$0) {
         if ($$0 instanceof uq<?> $$1) {
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

   static class d implements fh.h {
      private final ur a;
      private final Predicate<vo> b;

      public d(ur $$0) {
         this.a = $$0;
         this.b = fh.a($$0);
      }

      @Override
      public void a(vo $$0, List<vo> $$1) {
         if ($$0 instanceof ux $$2) {
            $$2.stream().filter(this.b).forEach($$1::add);
         }
      }

      @Override
      public void a(vo $$0, Supplier<vo> $$1, List<vo> $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         if ($$0 instanceof ux $$4) {
            $$4.stream().filter(this.b).forEach($$2x -> {
               $$2.add($$2x);
               $$3.setTrue();
            });
            if ($$3.isFalse()) {
               ur $$5 = this.a.h();
               $$4.add($$5);
               $$2.add($$5);
            }
         }
      }

      @Override
      public vo a() {
         return new ux();
      }

      @Override
      public int a(vo $$0, Supplier<vo> $$1) {
         int $$2 = 0;
         if ($$0 instanceof ux $$3) {
            int $$4 = $$3.size();
            if ($$4 == 0) {
               $$3.add($$1.get());
               $$2++;
            } else {
               for (int $$5 = 0; $$5 < $$4; $$5++) {
                  vo $$6 = $$3.k($$5);
                  if (this.b.test($$6)) {
                     vo $$7 = $$1.get();
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
      public int a(vo $$0) {
         int $$1 = 0;
         if ($$0 instanceof ux $$2) {
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

   static class e implements fh.h {
      private final String a;
      private final ur b;
      private final Predicate<vo> c;

      public e(String $$0, ur $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = fh.a($$1);
      }

      @Override
      public void a(vo $$0, List<vo> $$1) {
         if ($$0 instanceof ur) {
            vo $$2 = ((ur)$$0).c(this.a);
            if (this.c.test($$2)) {
               $$1.add($$2);
            }
         }
      }

      @Override
      public void a(vo $$0, Supplier<vo> $$1, List<vo> $$2) {
         if ($$0 instanceof ur $$3) {
            vo $$4 = $$3.c(this.a);
            if ($$4 == null) {
               vo var6 = this.b.h();
               $$3.a(this.a, var6);
               $$2.add(var6);
            } else if (this.c.test($$4)) {
               $$2.add($$4);
            }
         }
      }

      @Override
      public vo a() {
         return new ur();
      }

      @Override
      public int a(vo $$0, Supplier<vo> $$1) {
         if ($$0 instanceof ur $$2) {
            vo $$3 = $$2.c(this.a);
            if (this.c.test($$3)) {
               vo $$4 = $$1.get();
               if (!$$4.equals($$3)) {
                  $$2.a(this.a, $$4);
                  return 1;
               }
            }
         }

         return 0;
      }

      @Override
      public int a(vo $$0) {
         if ($$0 instanceof ur $$1) {
            vo $$2 = $$1.c(this.a);
            if (this.c.test($$2)) {
               $$1.r(this.a);
               return 1;
            }
         }

         return 0;
      }
   }

   static class f implements fh.h {
      private final Predicate<vo> a;

      public f(ur $$0) {
         this.a = fh.a($$0);
      }

      @Override
      public void a(vo $$0, List<vo> $$1) {
         if ($$0 instanceof ur && this.a.test($$0)) {
            $$1.add($$0);
         }
      }

      @Override
      public void a(vo $$0, Supplier<vo> $$1, List<vo> $$2) {
         this.a($$0, $$2);
      }

      @Override
      public vo a() {
         return new ur();
      }

      @Override
      public int a(vo $$0, Supplier<vo> $$1) {
         return 0;
      }

      @Override
      public int a(vo $$0) {
         return 0;
      }
   }

   public static class g {
      private final String b;
      private final Object2IntMap<fh.h> c;
      private final fh.h[] d;
      public static final Codec<fh.g> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            fh.g $$1 = new fh().a(new StringReader($$0));
            return DataResult.success($$1);
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, fh.g::a);

      public static fh.g a(String $$0) throws CommandSyntaxException {
         return new fh().a(new StringReader($$0));
      }

      public g(String $$0, fh.h[] $$1, Object2IntMap<fh.h> $$2) {
         this.b = $$0;
         this.d = $$1;
         this.c = $$2;
      }

      public List<vo> a(vo $$0) throws CommandSyntaxException {
         List<vo> $$1 = Collections.singletonList($$0);

         for (fh.h $$2 : this.d) {
            $$1 = $$2.a($$1);
            if ($$1.isEmpty()) {
               throw this.a($$2);
            }
         }

         return $$1;
      }

      public int b(vo $$0) {
         List<vo> $$1 = Collections.singletonList($$0);

         for (fh.h $$2 : this.d) {
            $$1 = $$2.a($$1);
            if ($$1.isEmpty()) {
               return 0;
            }
         }

         return $$1.size();
      }

      private List<vo> d(vo $$0) throws CommandSyntaxException {
         List<vo> $$1 = Collections.singletonList($$0);

         for (int $$2 = 0; $$2 < this.d.length - 1; $$2++) {
            fh.h $$3 = this.d[$$2];
            int $$4 = $$2 + 1;
            $$1 = $$3.a($$1, this.d[$$4]::a);
            if ($$1.isEmpty()) {
               throw this.a($$3);
            }
         }

         return $$1;
      }

      public List<vo> a(vo $$0, Supplier<vo> $$1) throws CommandSyntaxException {
         List<vo> $$2 = this.d($$0);
         fh.h $$3 = this.d[this.d.length - 1];
         return $$3.a($$2, $$1);
      }

      private static int a(List<vo> $$0, Function<vo, Integer> $$1) {
         return $$0.stream().map($$1).reduce(0, ($$0x, $$1x) -> $$0x + $$1x);
      }

      public static boolean a(vo $$0, int $$1) {
         if ($$1 >= 512) {
            return true;
         } else {
            if ($$0 instanceof ur $$2) {
               for (String $$3 : $$2.e()) {
                  vo $$4 = $$2.c($$3);
                  if ($$4 != null && a($$4, $$1 + 1)) {
                     return true;
                  }
               }
            } else if ($$0 instanceof ux) {
               for (vo $$6 : (ux)$$0) {
                  if (a($$6, $$1 + 1)) {
                     return true;
                  }
               }
            }

            return false;
         }
      }

      public int a(vo $$0, vo $$1) throws CommandSyntaxException {
         if (a($$1, this.b())) {
            throw fh.b.create();
         } else {
            vo $$2 = $$1.d();
            List<vo> $$3 = this.d($$0);
            if ($$3.isEmpty()) {
               return 0;
            } else {
               fh.h $$4 = this.d[this.d.length - 1];
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

      public int a(int $$0, ur $$1, List<vo> $$2) throws CommandSyntaxException {
         List<vo> $$3 = new ArrayList<>($$2.size());

         for (vo $$4 : $$2) {
            vo $$5 = $$4.d();
            $$3.add($$5);
            if (a($$5, this.b())) {
               throw fh.b.create();
            }
         }

         Collection<vo> $$6 = this.a($$1, ux::new);
         int $$7 = 0;
         boolean $$8 = false;

         for (vo $$9 : $$6) {
            if (!($$9 instanceof uq<?> $$10)) {
               throw fh.e.create($$9);
            }

            boolean $$11 = false;
            int $$12 = $$0 < 0 ? $$10.size() + $$0 + 1 : $$0;

            for (vo $$13 : $$3) {
               try {
                  if ($$10.b($$12, $$8 ? $$13.d() : $$13)) {
                     $$12++;
                     $$11 = true;
                  }
               } catch (IndexOutOfBoundsException var16) {
                  throw fh.f.create($$12);
               }
            }

            $$8 = true;
            $$7 += $$11 ? 1 : 0;
         }

         return $$7;
      }

      public int c(vo $$0) {
         List<vo> $$1 = Collections.singletonList($$0);

         for (int $$2 = 0; $$2 < this.d.length - 1; $$2++) {
            $$1 = this.d[$$2].a($$1);
         }

         fh.h $$3 = this.d[this.d.length - 1];
         return a($$1, $$3::a);
      }

      private CommandSyntaxException a(fh.h $$0) {
         int $$1 = this.c.getInt($$0);
         return fh.c.create(this.b.substring(0, $$1));
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
      void a(vo var1, List<vo> var2);

      void a(vo var1, Supplier<vo> var2, List<vo> var3);

      vo a();

      int a(vo var1, Supplier<vo> var2);

      int a(vo var1);

      default List<vo> a(List<vo> $$0) {
         return this.a($$0, this::a);
      }

      default List<vo> a(List<vo> $$0, Supplier<vo> $$1) {
         return this.a($$0, ($$1x, $$2) -> this.a($$1x, $$1, $$2));
      }

      default List<vo> a(List<vo> $$0, BiConsumer<vo, List<vo>> $$1) {
         List<vo> $$2 = Lists.newArrayList();

         for (vo $$3 : $$0) {
            $$1.accept($$3, $$2);
         }

         return $$2;
      }
   }
}
