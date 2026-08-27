import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Deque;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dn {
   private final dn.c[] a;
   final acq b;

   public dn(acq $$0, dn.c[] $$1) {
      this.b = $$0;
      this.a = $$1;
   }

   public acq a() {
      return this.b;
   }

   public dn.c[] b() {
      return this.a;
   }

   public static dn a(acq $$0, CommandDispatcher<ds> $$1, ds $$2, List<String> $$3) {
      List<dn.c> $$4 = Lists.newArrayListWithCapacity($$3.size());

      for (int $$5 = 0; $$5 < $$3.size(); $$5++) {
         int $$6 = $$5 + 1;
         String $$7 = $$3.get($$5).trim();
         StringReader $$8 = new StringReader($$7);
         if ($$8.canRead() && $$8.peek() != '#') {
            if ($$8.peek() == '/') {
               $$8.skip();
               if ($$8.peek() == '/') {
                  throw new IllegalArgumentException(
                     "Unknown or invalid command '" + $$7 + "' on line " + $$6 + " (if you intended to make a comment, use '#' not '//')"
                  );
               }

               String $$9 = $$8.readUnquotedString();
               throw new IllegalArgumentException(
                  "Unknown or invalid command '" + $$7 + "' on line " + $$6 + " (did you mean '" + $$9 + "'? Do not use a preceding forwards slash.)"
               );
            }

            try {
               ParseResults<ds> $$10 = $$1.parse($$8, $$2);
               if ($$10.getReader().canRead()) {
                  throw dt.a($$10);
               }

               $$4.add(new dn.b($$10));
            } catch (CommandSyntaxException var10) {
               throw new IllegalArgumentException("Whilst parsing command on line " + $$6 + ": " + var10.getMessage());
            }
         }
      }

      return new dn($$0, $$4.toArray(new dn.c[0]));
   }

   public static class a {
      public static final dn.a a = new dn.a((acq)null);
      @Nullable
      private final acq b;
      private boolean c;
      private Optional<dn> d = Optional.empty();

      public a(@Nullable acq $$0) {
         this.b = $$0;
      }

      public a(dn $$0) {
         this.c = true;
         this.b = null;
         this.d = Optional.of($$0);
      }

      public Optional<dn> a(ade $$0) {
         if (!this.c) {
            if (this.b != null) {
               this.d = $$0.a(this.b);
            }

            this.c = true;
         }

         return this.d;
      }

      @Nullable
      public acq a() {
         return this.d.<acq>map($$0 -> $$0.b).orElse(this.b);
      }
   }

   public static class b implements dn.c {
      private final ParseResults<ds> a;

      public b(ParseResults<ds> $$0) {
         this.a = $$0;
      }

      @Override
      public void execute(ade $$0, ds $$1, Deque<ade.b> $$2, int $$3, int $$4, @Nullable ade.c $$5) throws CommandSyntaxException {
         if ($$5 != null) {
            String $$6 = this.a.getReader().getString();
            $$5.a($$4, $$6);
            int $$7 = this.a($$0, $$1);
            $$5.a($$4, $$6, $$7);
         } else {
            this.a($$0, $$1);
         }
      }

      private int a(ade $$0, ds $$1) throws CommandSyntaxException {
         return $$0.b().execute(dt.a(this.a, $$1x -> $$1));
      }

      @Override
      public String toString() {
         return this.a.getReader().getString();
      }
   }

   @FunctionalInterface
   public interface c {
      void execute(ade var1, ds var2, Deque<ade.b> var3, int var4, int var5, @Nullable ade.c var6) throws CommandSyntaxException;
   }

   public static class d implements dn.c {
      private final dn.a a;

      public d(dn $$0) {
         this.a = new dn.a($$0);
      }

      @Override
      public void execute(ade $$0, ds $$1, Deque<ade.b> $$2, int $$3, int $$4, @Nullable ade.c $$5) {
         ac.a(this.a.a($$0), $$5x -> {
            dn.c[] $$6 = $$5x.b();
            if ($$5 != null) {
               $$5.a($$4, $$5x.a(), $$6.length);
            }

            int $$7 = $$3 - $$2.size();
            int $$8 = Math.min($$6.length, $$7);

            for (int $$9 = $$8 - 1; $$9 >= 0; $$9--) {
               $$2.addFirst(new ade.b($$1, $$4 + 1, $$6[$$9]));
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
}
