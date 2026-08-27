import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;

public class dp {
   private final dp.d[] a;
   final aey b;

   public dp(aey $$0, dp.d[] $$1) {
      this.b = $$0;
      this.a = $$1;
   }

   public aey a() {
      return this.b;
   }

   public dp.d[] b() {
      return this.a;
   }

   public dp a(@Nullable qy $$0, CommandDispatcher<dt> $$1, dt $$2) throws dv {
      return this;
   }

   private static boolean a(CharSequence $$0) {
      int $$1 = $$0.length();
      return $$1 > 0 && $$0.charAt($$1 - 1) == '\\';
   }

   public static dp a(aey $$0, CommandDispatcher<dt> $$1, dt $$2, List<String> $$3) {
      List<dp.d> $$4 = new ArrayList<>($$3.size());
      Set<String> $$5 = new ObjectArraySet();

      for (int $$6 = 0; $$6 < $$3.size(); $$6++) {
         int $$7 = $$6 + 1;
         String $$8 = $$3.get($$6).trim();
         String $$11;
         if (a((CharSequence)$$8)) {
            StringBuilder $$9 = new StringBuilder($$8);

            do {
               if (++$$6 == $$3.size()) {
                  throw new IllegalArgumentException("Line continuation at end of file");
               }

               $$9.deleteCharAt($$9.length() - 1);
               String $$10 = $$3.get($$6).trim();
               $$9.append($$10);
            } while (a($$9));

            $$11 = $$9.toString();
         } else {
            $$11 = $$8;
         }

         StringReader $$13 = new StringReader($$11);
         if ($$13.canRead() && $$13.peek() != '#') {
            if ($$13.peek() == '/') {
               $$13.skip();
               if ($$13.peek() == '/') {
                  throw new IllegalArgumentException(
                     "Unknown or invalid command '" + $$11 + "' on line " + $$7 + " (if you intended to make a comment, use '#' not '//')"
                  );
               }

               String $$14 = $$13.readUnquotedString();
               throw new IllegalArgumentException(
                  "Unknown or invalid command '" + $$11 + "' on line " + $$7 + " (did you mean '" + $$14 + "'? Do not use a preceding forwards slash.)"
               );
            }

            if ($$13.peek() == '$') {
               dp.f $$15 = a($$11.substring(1), $$7);
               $$4.add($$15);
               $$5.addAll($$15.a());
            } else {
               try {
                  ParseResults<dt> $$16 = $$1.parse($$13, $$2);
                  if ($$16.getReader().canRead()) {
                     throw du.a($$16);
                  }

                  $$4.add(new dp.b($$16));
               } catch (CommandSyntaxException var12) {
                  throw new IllegalArgumentException("Whilst parsing command on line " + $$7 + ": " + var12.getMessage());
               }
            }
         }
      }

      return (dp)($$5.isEmpty() ? new dp($$0, $$4.toArray(dp.d[]::new)) : new dp.c($$0, $$4.toArray(dp.d[]::new), List.copyOf($$5)));
   }

   @VisibleForTesting
   public static dp.f a(String $$0, int $$1) {
      Builder<String> $$2 = ImmutableList.builder();
      Builder<String> $$3 = ImmutableList.builder();
      int $$4 = $$0.length();
      int $$5 = 0;
      int $$6 = $$0.indexOf(36);

      while ($$6 != -1) {
         if ($$6 != $$4 - 1 && $$0.charAt($$6 + 1) == '(') {
            $$2.add($$0.substring($$5, $$6));
            int $$7 = $$0.indexOf(41, $$6 + 1);
            if ($$7 == -1) {
               throw new IllegalArgumentException("Unterminated macro variable in macro '" + $$0 + "' on line " + $$1);
            }

            String $$8 = $$0.substring($$6 + 2, $$7);
            if (!a($$8)) {
               throw new IllegalArgumentException("Invalid macro variable name '" + $$8 + "' on line " + $$1);
            }

            $$3.add($$8);
            $$5 = $$7 + 1;
            $$6 = $$0.indexOf(36, $$5);
         } else {
            $$6 = $$0.indexOf(36, $$6 + 1);
         }
      }

      if ($$5 == 0) {
         throw new IllegalArgumentException("Macro without variables on line " + $$1);
      } else {
         if ($$5 != $$4) {
            $$2.add($$0.substring($$5));
         }

         return new dp.f($$2.build(), $$3.build());
      }
   }

   private static boolean a(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         char $$2 = $$0.charAt($$1);
         if (!Character.isLetterOrDigit($$2) && $$2 != '_') {
            return false;
         }
      }

      return true;
   }

   public static class a {
      public static final dp.a a = new dp.a((aey)null);
      @Nullable
      private final aey b;
      private boolean c;
      private Optional<dp> d = Optional.empty();

      public a(@Nullable aey $$0) {
         this.b = $$0;
      }

      public a(dp $$0) {
         this.c = true;
         this.b = null;
         this.d = Optional.of($$0);
      }

      public Optional<dp> a(afm $$0) {
         if (!this.c) {
            if (this.b != null) {
               this.d = $$0.a(this.b);
            }

            this.c = true;
         }

         return this.d;
      }

      @Nullable
      public aey a() {
         return this.d.<aey>map($$0 -> $$0.b).orElse(this.b);
      }
   }

   public static class b implements dp.d {
      private final ParseResults<dt> a;

      public b(ParseResults<dt> $$0) {
         this.a = $$0;
      }

      @Override
      public void execute(afm $$0, dt $$1, Deque<afm.b> $$2, int $$3, int $$4, @Nullable afm.c $$5) throws CommandSyntaxException {
         if ($$5 != null) {
            String $$6 = this.a.getReader().getString();
            $$5.a($$4, $$6);
            int $$7 = this.a($$0, $$1);
            $$5.a($$4, $$6, $$7);
         } else {
            this.a($$0, $$1);
         }
      }

      private int a(afm $$0, dt $$1) throws CommandSyntaxException {
         return $$0.b().execute(du.a(this.a, $$1x -> $$1));
      }

      @Override
      public String toString() {
         return this.a.getReader().getString();
      }
   }

   static class c extends dp {
      private static final DecimalFormat a = new DecimalFormat("#");
      private final List<String> b;
      private static final int c = 8;
      private final Object2ObjectLinkedOpenHashMap<List<String>, dp> d = new Object2ObjectLinkedOpenHashMap(8, 0.25F);

      public c(aey $$0, dp.d[] $$1, List<String> $$2) {
         super($$0, $$1);
         this.b = $$2;
      }

      @Override
      public dp a(@Nullable qy $$0, CommandDispatcher<dt> $$1, dt $$2) throws dv {
         if ($$0 == null) {
            throw new dv(tn.a("commands.function.error.missing_arguments", this.a()));
         } else {
            List<String> $$3 = new ArrayList<>(this.b.size());

            for (String $$4 : this.b) {
               if (!$$0.e($$4)) {
                  throw new dv(tn.a("commands.function.error.missing_argument", this.a(), $$4));
               }

               $$3.add(a($$0.c($$4)));
            }

            dp $$5 = (dp)this.d.getAndMoveToLast($$3);
            if ($$5 != null) {
               return $$5;
            } else {
               if (this.d.size() >= 8) {
                  this.d.removeFirst();
               }

               dp $$6 = this.a($$3, $$1, $$2);
               if ($$6 != null) {
                  this.d.put($$3, $$6);
               }

               return $$6;
            }
         }
      }

      private static String a(rs $$0) {
         if ($$0 instanceof rb $$1) {
            return a.format((double)$$1.k());
         } else if ($$0 instanceof qz $$2) {
            return a.format($$2.j());
         } else if ($$0 instanceof qw $$3) {
            return String.valueOf($$3.i());
         } else if ($$0 instanceof rn $$4) {
            return String.valueOf($$4.h());
         } else {
            return $$0 instanceof rg $$5 ? String.valueOf($$5.f()) : $$0.r_();
         }
      }

      private dp a(List<String> $$0, CommandDispatcher<dt> $$1, dt $$2) throws dv {
         dp.d[] $$3 = this.b();
         dp.d[] $$4 = new dp.d[$$3.length];

         for (int $$5 = 0; $$5 < $$3.length; $$5++) {
            dp.d $$6 = $$3[$$5];
            if (!($$6 instanceof dp.f $$7)) {
               $$4[$$5] = $$6;
            } else {
               List<String> $$8 = $$7.a();
               List<String> $$9 = new ArrayList<>($$8.size());

               for (String $$10 : $$8) {
                  $$9.add($$0.get(this.b.indexOf($$10)));
               }

               String $$11 = $$7.a($$9);

               try {
                  ParseResults<dt> $$12 = $$1.parse($$11, $$2);
                  if ($$12.getReader().canRead()) {
                     throw du.a($$12);
                  }

                  $$4[$$5] = new dp.b($$12);
               } catch (CommandSyntaxException var13) {
                  throw new dv(tn.a("commands.function.error.parse", this.a(), $$11, var13.getMessage()));
               }
            }
         }

         aey $$14 = this.a();
         return new dp(new aey($$14.b(), $$14.a() + "/" + $$0.hashCode()), $$4);
      }

      static {
         a.setMaximumFractionDigits(15);
         a.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
      }
   }

   @FunctionalInterface
   public interface d {
      void execute(afm var1, dt var2, Deque<afm.b> var3, int var4, int var5, @Nullable afm.c var6) throws CommandSyntaxException;
   }

   public static class e implements dp.d {
      private final dp.a a;

      public e(dp $$0) {
         this.a = new dp.a($$0);
      }

      @Override
      public void execute(afm $$0, dt $$1, Deque<afm.b> $$2, int $$3, int $$4, @Nullable afm.c $$5) {
         ac.a(this.a.a($$0), $$5x -> {
            dp.d[] $$6 = $$5x.b();
            if ($$5 != null) {
               $$5.a($$4, $$5x.a(), $$6.length);
            }

            int $$7 = $$3 - $$2.size();
            int $$8 = Math.min($$6.length, $$7);

            for (int $$9 = $$8 - 1; $$9 >= 0; $$9--) {
               $$2.addFirst(new afm.b($$1, $$4 + 1, $$6[$$9]));
            }
         }, () -> {
            if ($$5 != null) {
               $$5.a($$4, this.a.a(), -1);
            }
         });
      }

      @Override
      public String toString() {
         return "function " + this.a.a();
      }
   }

   public static class f implements dp.d {
      private final List<String> a;
      private final List<String> b;

      public f(List<String> $$0, List<String> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public List<String> a() {
         return this.b;
      }

      public String a(List<String> $$0) {
         StringBuilder $$1 = new StringBuilder();

         for (int $$2 = 0; $$2 < this.b.size(); $$2++) {
            $$1.append(this.a.get($$2)).append($$0.get($$2));
         }

         if (this.a.size() > this.b.size()) {
            $$1.append(this.a.get(this.a.size() - 1));
         }

         return $$1.toString();
      }

      @Override
      public void execute(afm $$0, dt $$1, Deque<afm.b> $$2, int $$3, int $$4, @Nullable afm.c $$5) throws CommandSyntaxException {
         throw new IllegalStateException("Tried to execute an uninstantiated macro");
      }
   }
}
