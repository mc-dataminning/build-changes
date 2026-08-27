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

public class ev implements ArgumentType<ev.g> {
   private static final Collection<String> d = Arrays.asList("foo", "foo.bar", "foo[0]", "[0]", "[]", "{foo=bar}");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("arguments.nbtpath.node.invalid"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("arguments.nbtpath.too_deep"));
   public static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wu.b("arguments.nbtpath.nothing_found", $$0));
   static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wu.b("commands.data.modify.expected_list", $$0));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> wu.b("commands.data.modify.invalid_index", $$0));
   private static final char g = '[';
   private static final char h = ']';
   private static final char i = '{';
   private static final char j = '}';
   private static final char k = '"';
   private static final char l = '\'';

   public static ev a() {
      return new ev();
   }

   public static ev.g a(CommandContext<ed> $$0, String $$1) {
      return (ev.g)$$0.getArgument($$1, ev.g.class);
   }

   public ev.g a(StringReader $$0) throws CommandSyntaxException {
      List<ev.h> $$1 = Lists.newArrayList();
      int $$2 = $$0.getCursor();
      Object2IntMap<ev.h> $$3 = new Object2IntOpenHashMap();
      boolean $$4 = true;

      while ($$0.canRead() && $$0.peek() != ' ') {
         ev.h $$5 = a($$0, $$4);
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

      return new ev.g($$0.getString().substring($$2, $$0.getCursor()), $$1.toArray(new ev.h[0]), $$3);
   }

   private static ev.h a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      return (ev.h)(switch ($$0.peek()) {
         case '"', '\'' -> a($$0, $$0.readString());
         case '[' -> {
            $$0.skip();
            int $$3 = $$0.peek();
            if ($$3 == 123) {
               ua $$4 = new uy($$0).f();
               $$0.expect(']');
               yield new ev.d($$4);
            } else if ($$3 == 93) {
               $$0.skip();
               yield ev.a.a;
            } else {
               int $$5 = $$0.readInt();
               $$0.expect(']');
               yield new ev.c($$5);
            }
         }
         case '{' -> {
            if (!$$1) {
               throw a.createWithContext($$0);
            }

            ua $$2 = new uy($$0).f();
            yield new ev.f($$2);
         }
         default -> a($$0, b($$0));
      });
   }

   private static ev.h a(StringReader $$0, String $$1) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '{') {
         ua $$2 = new uy($$0).f();
         return new ev.e($$1, $$2);
      } else {
         return new ev.b($$1);
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

   static Predicate<ux> a(ua $$0) {
      return $$1 -> up.a($$0, $$1, true);
   }

   static class a implements ev.h {
      public static final ev.a a = new ev.a();

      private a() {
      }

      @Override
      public void a(ux $$0, List<ux> $$1) {
         if ($$0 instanceof tz) {
            $$1.addAll((tz)$$0);
         }
      }

      @Override
      public void a(ux $$0, Supplier<ux> $$1, List<ux> $$2) {
         if ($$0 instanceof tz<?> $$3) {
            if ($$3.isEmpty()) {
               ux $$4 = $$1.get();
               if ($$3.b(0, $$4)) {
                  $$2.add($$4);
               }
            } else {
               $$2.addAll((Collection<? extends ux>)$$3);
            }
         }
      }

      @Override
      public ux a() {
         return new ug();
      }

      @Override
      public int a(ux $$0, Supplier<ux> $$1) {
         if (!($$0 instanceof tz<?> $$2)) {
            return 0;
         } else {
            int $$3 = $$2.size();
            if ($$3 == 0) {
               $$2.b(0, $$1.get());
               return 1;
            } else {
               ux $$4 = $$1.get();
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
      public int a(ux $$0) {
         if ($$0 instanceof tz<?> $$1) {
            int $$2 = $$1.size();
            if ($$2 > 0) {
               $$1.clear();
               return $$2;
            }
         }

         return 0;
      }
   }

   static class b implements ev.h {
      private final String a;

      public b(String $$0) {
         this.a = $$0;
      }

      @Override
      public void a(ux $$0, List<ux> $$1) {
         if ($$0 instanceof ua) {
            ux $$2 = ((ua)$$0).c(this.a);
            if ($$2 != null) {
               $$1.add($$2);
            }
         }
      }

      @Override
      public void a(ux $$0, Supplier<ux> $$1, List<ux> $$2) {
         if ($$0 instanceof ua $$3) {
            ux $$4;
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
      public ux a() {
         return new ua();
      }

      @Override
      public int a(ux $$0, Supplier<ux> $$1) {
         if ($$0 instanceof ua $$2) {
            ux $$3 = $$1.get();
            ux $$4 = $$2.a(this.a, $$3);
            if (!$$3.equals($$4)) {
               return 1;
            }
         }

         return 0;
      }

      @Override
      public int a(ux $$0) {
         if ($$0 instanceof ua $$1 && $$1.e(this.a)) {
            $$1.r(this.a);
            return 1;
         }

         return 0;
      }
   }

   static class c implements ev.h {
      private final int a;

      public c(int $$0) {
         this.a = $$0;
      }

      @Override
      public void a(ux $$0, List<ux> $$1) {
         if ($$0 instanceof tz<?> $$2) {
            int $$3 = $$2.size();
            int $$4 = this.a < 0 ? $$3 + this.a : this.a;
            if (0 <= $$4 && $$4 < $$3) {
               $$1.add($$2.get($$4));
            }
         }
      }

      @Override
      public void a(ux $$0, Supplier<ux> $$1, List<ux> $$2) {
         this.a($$0, $$2);
      }

      @Override
      public ux a() {
         return new ug();
      }

      @Override
      public int a(ux $$0, Supplier<ux> $$1) {
         if ($$0 instanceof tz<?> $$2) {
            int $$3 = $$2.size();
            int $$4 = this.a < 0 ? $$3 + this.a : this.a;
            if (0 <= $$4 && $$4 < $$3) {
               ux $$5 = $$2.get($$4);
               ux $$6 = $$1.get();
               if (!$$6.equals($$5) && $$2.a($$4, $$6)) {
                  return 1;
               }
            }
         }

         return 0;
      }

      @Override
      public int a(ux $$0) {
         if ($$0 instanceof tz<?> $$1) {
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

   static class d implements ev.h {
      private final ua a;
      private final Predicate<ux> b;

      public d(ua $$0) {
         this.a = $$0;
         this.b = ev.a($$0);
      }

      @Override
      public void a(ux $$0, List<ux> $$1) {
         if ($$0 instanceof ug $$2) {
            $$2.stream().filter(this.b).forEach($$1::add);
         }
      }

      @Override
      public void a(ux $$0, Supplier<ux> $$1, List<ux> $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         if ($$0 instanceof ug $$4) {
            $$4.stream().filter(this.b).forEach($$2x -> {
               $$2.add($$2x);
               $$3.setTrue();
            });
            if ($$3.isFalse()) {
               ua $$5 = this.a.h();
               $$4.add($$5);
               $$2.add($$5);
            }
         }
      }

      @Override
      public ux a() {
         return new ug();
      }

      @Override
      public int a(ux $$0, Supplier<ux> $$1) {
         int $$2 = 0;
         if ($$0 instanceof ug $$3) {
            int $$4 = $$3.size();
            if ($$4 == 0) {
               $$3.add($$1.get());
               $$2++;
            } else {
               for (int $$5 = 0; $$5 < $$4; $$5++) {
                  ux $$6 = $$3.k($$5);
                  if (this.b.test($$6)) {
                     ux $$7 = $$1.get();
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
      public int a(ux $$0) {
         int $$1 = 0;
         if ($$0 instanceof ug $$2) {
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

   static class e implements ev.h {
      private final String a;
      private final ua b;
      private final Predicate<ux> c;

      public e(String $$0, ua $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = ev.a($$1);
      }

      @Override
      public void a(ux $$0, List<ux> $$1) {
         if ($$0 instanceof ua) {
            ux $$2 = ((ua)$$0).c(this.a);
            if (this.c.test($$2)) {
               $$1.add($$2);
            }
         }
      }

      @Override
      public void a(ux $$0, Supplier<ux> $$1, List<ux> $$2) {
         if ($$0 instanceof ua $$3) {
            ux $$4 = $$3.c(this.a);
            if ($$4 == null) {
               ux var6 = this.b.h();
               $$3.a(this.a, var6);
               $$2.add(var6);
            } else if (this.c.test($$4)) {
               $$2.add($$4);
            }
         }
      }

      @Override
      public ux a() {
         return new ua();
      }

      @Override
      public int a(ux $$0, Supplier<ux> $$1) {
         if ($$0 instanceof ua $$2) {
            ux $$3 = $$2.c(this.a);
            if (this.c.test($$3)) {
               ux $$4 = $$1.get();
               if (!$$4.equals($$3)) {
                  $$2.a(this.a, $$4);
                  return 1;
               }
            }
         }

         return 0;
      }

      @Override
      public int a(ux $$0) {
         if ($$0 instanceof ua $$1) {
            ux $$2 = $$1.c(this.a);
            if (this.c.test($$2)) {
               $$1.r(this.a);
               return 1;
            }
         }

         return 0;
      }
   }

   static class f implements ev.h {
      private final Predicate<ux> a;

      public f(ua $$0) {
         this.a = ev.a($$0);
      }

      @Override
      public void a(ux $$0, List<ux> $$1) {
         if ($$0 instanceof ua && this.a.test($$0)) {
            $$1.add($$0);
         }
      }

      @Override
      public void a(ux $$0, Supplier<ux> $$1, List<ux> $$2) {
         this.a($$0, $$2);
      }

      @Override
      public ux a() {
         return new ua();
      }

      @Override
      public int a(ux $$0, Supplier<ux> $$1) {
         return 0;
      }

      @Override
      public int a(ux $$0) {
         return 0;
      }
   }

   public static class g {
      private final String b;
      private final Object2IntMap<ev.h> c;
      private final ev.h[] d;
      public static final Codec<ev.g> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            ev.g $$1 = new ev().a(new StringReader($$0));
            return DataResult.success($$1);
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, ev.g::a);

      public static ev.g a(String $$0) throws CommandSyntaxException {
         return new ev().a(new StringReader($$0));
      }

      public g(String $$0, ev.h[] $$1, Object2IntMap<ev.h> $$2) {
         this.b = $$0;
         this.d = $$1;
         this.c = $$2;
      }

      public List<ux> a(ux $$0) throws CommandSyntaxException {
         List<ux> $$1 = Collections.singletonList($$0);

         for (ev.h $$2 : this.d) {
            $$1 = $$2.a($$1);
            if ($$1.isEmpty()) {
               throw this.a($$2);
            }
         }

         return $$1;
      }

      public int b(ux $$0) {
         List<ux> $$1 = Collections.singletonList($$0);

         for (ev.h $$2 : this.d) {
            $$1 = $$2.a($$1);
            if ($$1.isEmpty()) {
               return 0;
            }
         }

         return $$1.size();
      }

      private List<ux> d(ux $$0) throws CommandSyntaxException {
         List<ux> $$1 = Collections.singletonList($$0);

         for (int $$2 = 0; $$2 < this.d.length - 1; $$2++) {
            ev.h $$3 = this.d[$$2];
            int $$4 = $$2 + 1;
            $$1 = $$3.a($$1, this.d[$$4]::a);
            if ($$1.isEmpty()) {
               throw this.a($$3);
            }
         }

         return $$1;
      }

      public List<ux> a(ux $$0, Supplier<ux> $$1) throws CommandSyntaxException {
         List<ux> $$2 = this.d($$0);
         ev.h $$3 = this.d[this.d.length - 1];
         return $$3.a($$2, $$1);
      }

      private static int a(List<ux> $$0, Function<ux, Integer> $$1) {
         return $$0.stream().map($$1).reduce(0, ($$0x, $$1x) -> $$0x + $$1x);
      }

      public static boolean a(ux $$0, int $$1) {
         if ($$1 >= 512) {
            return true;
         } else {
            if ($$0 instanceof ua $$2) {
               for (String $$3 : $$2.e()) {
                  ux $$4 = $$2.c($$3);
                  if ($$4 != null && a($$4, $$1 + 1)) {
                     return true;
                  }
               }
            } else if ($$0 instanceof ug) {
               for (ux $$6 : (ug)$$0) {
                  if (a($$6, $$1 + 1)) {
                     return true;
                  }
               }
            }

            return false;
         }
      }

      public int a(ux $$0, ux $$1) throws CommandSyntaxException {
         if (a($$1, this.b())) {
            throw ev.b.create();
         } else {
            ux $$2 = $$1.d();
            List<ux> $$3 = this.d($$0);
            if ($$3.isEmpty()) {
               return 0;
            } else {
               ev.h $$4 = this.d[this.d.length - 1];
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

      public int a(int $$0, ua $$1, List<ux> $$2) throws CommandSyntaxException {
         List<ux> $$3 = new ArrayList<>($$2.size());

         for (ux $$4 : $$2) {
            ux $$5 = $$4.d();
            $$3.add($$5);
            if (a($$5, this.b())) {
               throw ev.b.create();
            }
         }

         Collection<ux> $$6 = this.a($$1, ug::new);
         int $$7 = 0;
         boolean $$8 = false;

         for (ux $$9 : $$6) {
            if (!($$9 instanceof tz<?> $$10)) {
               throw ev.e.create($$9);
            }

            boolean $$11 = false;
            int $$12 = $$0 < 0 ? $$10.size() + $$0 + 1 : $$0;

            for (ux $$13 : $$3) {
               try {
                  if ($$10.b($$12, $$8 ? $$13.d() : $$13)) {
                     $$12++;
                     $$11 = true;
                  }
               } catch (IndexOutOfBoundsException var16) {
                  throw ev.f.create($$12);
               }
            }

            $$8 = true;
            $$7 += $$11 ? 1 : 0;
         }

         return $$7;
      }

      public int c(ux $$0) {
         List<ux> $$1 = Collections.singletonList($$0);

         for (int $$2 = 0; $$2 < this.d.length - 1; $$2++) {
            $$1 = this.d[$$2].a($$1);
         }

         ev.h $$3 = this.d[this.d.length - 1];
         return a($$1, $$3::a);
      }

      private CommandSyntaxException a(ev.h $$0) {
         int $$1 = this.c.getInt($$0);
         return ev.c.create(this.b.substring(0, $$1));
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
      void a(ux var1, List<ux> var2);

      void a(ux var1, Supplier<ux> var2, List<ux> var3);

      ux a();

      int a(ux var1, Supplier<ux> var2);

      int a(ux var1);

      default List<ux> a(List<ux> $$0) {
         return this.a($$0, this::a);
      }

      default List<ux> a(List<ux> $$0, Supplier<ux> $$1) {
         return this.a($$0, ($$1x, $$2) -> this.a($$1x, $$1, $$2));
      }

      default List<ux> a(List<ux> $$0, BiConsumer<ux, List<ux>> $$1) {
         List<ux> $$2 = Lists.newArrayList();

         for (ux $$3 : $$0) {
            $$1.accept($$3, $$2);
         }

         return $$2;
      }
   }
}
