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

public class fb implements ArgumentType<fb.g> {
   private static final Collection<String> d = Arrays.asList("foo", "foo.bar", "foo[0]", "[0]", "[]", "{foo=bar}");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xa.c("arguments.nbtpath.node.invalid"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xa.c("arguments.nbtpath.too_deep"));
   public static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xa.b("arguments.nbtpath.nothing_found", $$0));
   static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xa.b("commands.data.modify.expected_list", $$0));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xa.b("commands.data.modify.invalid_index", $$0));
   private static final char g = '[';
   private static final char h = ']';
   private static final char i = '{';
   private static final char j = '}';
   private static final char k = '"';
   private static final char l = '\'';

   public static fb a() {
      return new fb();
   }

   public static fb.g a(CommandContext<ej> $$0, String $$1) {
      return (fb.g)$$0.getArgument($$1, fb.g.class);
   }

   public fb.g a(StringReader $$0) throws CommandSyntaxException {
      List<fb.h> $$1 = Lists.newArrayList();
      int $$2 = $$0.getCursor();
      Object2IntMap<fb.h> $$3 = new Object2IntOpenHashMap();
      boolean $$4 = true;

      while ($$0.canRead() && $$0.peek() != ' ') {
         fb.h $$5 = a($$0, $$4);
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

      return new fb.g($$0.getString().substring($$2, $$0.getCursor()), $$1.toArray(new fb.h[0]), $$3);
   }

   private static fb.h a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      return (fb.h)(switch ($$0.peek()) {
         case '"', '\'' -> a($$0, $$0.readString());
         case '[' -> {
            $$0.skip();
            int $$3 = $$0.peek();
            if ($$3 == 123) {
               tz $$4 = uz.c($$0);
               $$0.expect(']');
               yield new fb.d($$4);
            } else if ($$3 == 93) {
               $$0.skip();
               yield fb.a.a;
            } else {
               int $$5 = $$0.readInt();
               $$0.expect(']');
               yield new fb.c($$5);
            }
         }
         case '{' -> {
            if (!$$1) {
               throw a.createWithContext($$0);
            }

            tz $$2 = uz.c($$0);
            yield new fb.f($$2);
         }
         default -> a($$0, b($$0));
      });
   }

   private static fb.h a(StringReader $$0, String $$1) throws CommandSyntaxException {
      if ($$1.isEmpty()) {
         throw a.createWithContext($$0);
      } else if ($$0.canRead() && $$0.peek() == '{') {
         tz $$2 = uz.c($$0);
         return new fb.e($$1, $$2);
      } else {
         return new fb.b($$1);
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

   static Predicate<uy> a(tz $$0) {
      return $$1 -> uo.a($$0, $$1, true);
   }

   static class a implements fb.h {
      public static final fb.a a = new fb.a();

      private a() {
      }

      @Override
      public void a(uy $$0, List<uy> $$1) {
         if ($$0 instanceof ty $$2) {
            Iterables.addAll($$1, $$2);
         }
      }

      @Override
      public void a(uy $$0, Supplier<uy> $$1, List<uy> $$2) {
         if ($$0 instanceof ty $$3) {
            if ($$3.isEmpty()) {
               uy $$4 = $$1.get();
               if ($$3.b(0, $$4)) {
                  $$2.add($$4);
               }
            } else {
               Iterables.addAll($$2, $$3);
            }
         }
      }

      @Override
      public uy a() {
         return new uf();
      }

      @Override
      public int a(uy $$0, Supplier<uy> $$1) {
         if (!($$0 instanceof ty $$2)) {
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
         if ($$0 instanceof ty $$1) {
            int $$2 = $$1.size();
            if ($$2 > 0) {
               $$1.clear();
               return $$2;
            }
         }

         return 0;
      }
   }

   static class b implements fb.h {
      private final String a;

      public b(String $$0) {
         this.a = $$0;
      }

      @Override
      public void a(uy $$0, List<uy> $$1) {
         if ($$0 instanceof tz) {
            uy $$2 = ((tz)$$0).a(this.a);
            if ($$2 != null) {
               $$1.add($$2);
            }
         }
      }

      @Override
      public void a(uy $$0, Supplier<uy> $$1, List<uy> $$2) {
         if ($$0 instanceof tz $$3) {
            uy $$4;
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
      public uy a() {
         return new tz();
      }

      @Override
      public int a(uy $$0, Supplier<uy> $$1) {
         if ($$0 instanceof tz $$2) {
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
         if ($$0 instanceof tz $$1 && $$1.b(this.a)) {
            $$1.r(this.a);
            return 1;
         }

         return 0;
      }
   }

   static class c implements fb.h {
      private final int a;

      public c(int $$0) {
         this.a = $$0;
      }

      @Override
      public void a(uy $$0, List<uy> $$1) {
         if ($$0 instanceof ty $$2) {
            int $$3 = $$2.size();
            int $$4 = this.a < 0 ? $$3 + this.a : this.a;
            if (0 <= $$4 && $$4 < $$3) {
               $$1.add($$2.c($$4));
            }
         }
      }

      @Override
      public void a(uy $$0, Supplier<uy> $$1, List<uy> $$2) {
         this.a($$0, $$2);
      }

      @Override
      public uy a() {
         return new uf();
      }

      @Override
      public int a(uy $$0, Supplier<uy> $$1) {
         if ($$0 instanceof ty $$2) {
            int $$3 = $$2.size();
            int $$4 = this.a < 0 ? $$3 + this.a : this.a;
            if (0 <= $$4 && $$4 < $$3) {
               uy $$5 = $$2.c($$4);
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
         if ($$0 instanceof ty $$1) {
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

   static class d implements fb.h {
      private final tz a;
      private final Predicate<uy> b;

      public d(tz $$0) {
         this.a = $$0;
         this.b = fb.a($$0);
      }

      @Override
      public void a(uy $$0, List<uy> $$1) {
         if ($$0 instanceof uf $$2) {
            $$2.stream().filter(this.b).forEach($$1::add);
         }
      }

      @Override
      public void a(uy $$0, Supplier<uy> $$1, List<uy> $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         if ($$0 instanceof uf $$4) {
            $$4.stream().filter(this.b).forEach($$2x -> {
               $$2.add($$2x);
               $$3.setTrue();
            });
            if ($$3.isFalse()) {
               tz $$5 = this.a.l();
               $$4.add($$5);
               $$2.add($$5);
            }
         }
      }

      @Override
      public uy a() {
         return new uf();
      }

      @Override
      public int a(uy $$0, Supplier<uy> $$1) {
         int $$2 = 0;
         if ($$0 instanceof uf $$3) {
            int $$4 = $$3.size();
            if ($$4 == 0) {
               $$3.add($$1.get());
               $$2++;
            } else {
               for (int $$5 = 0; $$5 < $$4; $$5++) {
                  uy $$6 = $$3.c($$5);
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
         if ($$0 instanceof uf $$2) {
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

   static class e implements fb.h {
      private final String a;
      private final tz b;
      private final Predicate<uy> c;

      public e(String $$0, tz $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = fb.a($$1);
      }

      @Override
      public void a(uy $$0, List<uy> $$1) {
         if ($$0 instanceof tz) {
            uy $$2 = ((tz)$$0).a(this.a);
            if (this.c.test($$2)) {
               $$1.add($$2);
            }
         }
      }

      @Override
      public void a(uy $$0, Supplier<uy> $$1, List<uy> $$2) {
         if ($$0 instanceof tz $$3) {
            uy $$4 = $$3.a(this.a);
            if ($$4 == null) {
               uy var6 = this.b.l();
               $$3.a(this.a, var6);
               $$2.add(var6);
            } else if (this.c.test($$4)) {
               $$2.add($$4);
            }
         }
      }

      @Override
      public uy a() {
         return new tz();
      }

      @Override
      public int a(uy $$0, Supplier<uy> $$1) {
         if ($$0 instanceof tz $$2) {
            uy $$3 = $$2.a(this.a);
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
         if ($$0 instanceof tz $$1) {
            uy $$2 = $$1.a(this.a);
            if (this.c.test($$2)) {
               $$1.r(this.a);
               return 1;
            }
         }

         return 0;
      }
   }

   static class f implements fb.h {
      private final Predicate<uy> a;

      public f(tz $$0) {
         this.a = fb.a($$0);
      }

      @Override
      public void a(uy $$0, List<uy> $$1) {
         if ($$0 instanceof tz && this.a.test($$0)) {
            $$1.add($$0);
         }
      }

      @Override
      public void a(uy $$0, Supplier<uy> $$1, List<uy> $$2) {
         this.a($$0, $$2);
      }

      @Override
      public uy a() {
         return new tz();
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
      private final Object2IntMap<fb.h> c;
      private final fb.h[] d;
      public static final Codec<fb.g> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            fb.g $$1 = new fb().a(new StringReader($$0));
            return DataResult.success($$1);
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, fb.g::a);

      public static fb.g a(String $$0) throws CommandSyntaxException {
         return new fb().a(new StringReader($$0));
      }

      public g(String $$0, fb.h[] $$1, Object2IntMap<fb.h> $$2) {
         this.b = $$0;
         this.d = $$1;
         this.c = $$2;
      }

      public List<uy> a(uy $$0) throws CommandSyntaxException {
         List<uy> $$1 = Collections.singletonList($$0);

         for (fb.h $$2 : this.d) {
            $$1 = $$2.a($$1);
            if ($$1.isEmpty()) {
               throw this.a($$2);
            }
         }

         return $$1;
      }

      public int b(uy $$0) {
         List<uy> $$1 = Collections.singletonList($$0);

         for (fb.h $$2 : this.d) {
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
            fb.h $$3 = this.d[$$2];
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
         fb.h $$3 = this.d[this.d.length - 1];
         return $$3.a($$2, $$1);
      }

      private static int a(List<uy> $$0, Function<uy, Integer> $$1) {
         return $$0.stream().map($$1).reduce(0, ($$0x, $$1x) -> $$0x + $$1x);
      }

      public static boolean a(uy $$0, int $$1) {
         if ($$1 >= 512) {
            return true;
         } else {
            if ($$0 instanceof tz $$2) {
               for (uy $$3 : $$2.h()) {
                  if (a($$3, $$1 + 1)) {
                     return true;
                  }
               }
            } else if ($$0 instanceof uf) {
               for (uy $$5 : (uf)$$0) {
                  if (a($$5, $$1 + 1)) {
                     return true;
                  }
               }
            }

            return false;
         }
      }

      public int a(uy $$0, uy $$1) throws CommandSyntaxException {
         if (a($$1, this.b())) {
            throw fb.b.create();
         } else {
            uy $$2 = $$1.d();
            List<uy> $$3 = this.d($$0);
            if ($$3.isEmpty()) {
               return 0;
            } else {
               fb.h $$4 = this.d[this.d.length - 1];
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

      public int a(int $$0, tz $$1, List<uy> $$2) throws CommandSyntaxException {
         List<uy> $$3 = new ArrayList<>($$2.size());

         for (uy $$4 : $$2) {
            uy $$5 = $$4.d();
            $$3.add($$5);
            if (a($$5, this.b())) {
               throw fb.b.create();
            }
         }

         Collection<uy> $$6 = this.a($$1, uf::new);
         int $$7 = 0;
         boolean $$8 = false;

         for (uy $$9 : $$6) {
            if (!($$9 instanceof ty $$10)) {
               throw fb.e.create($$9);
            }

            boolean $$12 = false;
            int $$13 = $$0 < 0 ? $$10.size() + $$0 + 1 : $$0;

            for (uy $$14 : $$3) {
               try {
                  if ($$10.b($$13, $$8 ? $$14.d() : $$14)) {
                     $$13++;
                     $$12 = true;
                  }
               } catch (IndexOutOfBoundsException var16) {
                  throw fb.f.create($$13);
               }
            }

            $$8 = true;
            $$7 += $$12 ? 1 : 0;
         }

         return $$7;
      }

      public int c(uy $$0) {
         List<uy> $$1 = Collections.singletonList($$0);

         for (int $$2 = 0; $$2 < this.d.length - 1; $$2++) {
            $$1 = this.d[$$2].a($$1);
         }

         fb.h $$3 = this.d[this.d.length - 1];
         return a($$1, $$3::a);
      }

      private CommandSyntaxException a(fb.h $$0) {
         int $$1 = this.c.getInt($$0);
         return fb.c.create(this.b.substring(0, $$1));
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
