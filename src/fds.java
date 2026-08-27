import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContextBuilder;
import com.mojang.brigadier.context.ParsedArgument;
import com.mojang.brigadier.context.SuggestionContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class fds {
   private static final Pattern a = Pattern.compile("(\\s+)");
   private static final xd b = xd.a.a(n.m);
   private static final xd c = xd.a.a(n.h);
   private static final List<xd> d = Stream.of(n.l, n.o, n.k, n.n, n.g).map(xd.a::a).collect(ImmutableList.toImmutableList());
   final fbp e;
   private final fjo f;
   final fdy g;
   final fda h;
   private final boolean i;
   private final boolean j;
   final int k;
   final int l;
   final boolean m;
   final int n;
   private final List<aww> o = Lists.newArrayList();
   private int p;
   private int q;
   @Nullable
   private ParseResults<dz> r;
   @Nullable
   private CompletableFuture<Suggestions> s;
   @Nullable
   private fds.a t;
   private boolean u;
   boolean v;
   private boolean w = true;

   public fds(fbp $$0, fjo $$1, fdy $$2, fda $$3, boolean $$4, boolean $$5, int $$6, int $$7, boolean $$8, int $$9) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
      this.j = $$5;
      this.k = $$6;
      this.l = $$7;
      this.m = $$8;
      this.n = $$9;
      $$2.a(this::a);
   }

   public void a(boolean $$0) {
      this.u = $$0;
      if (!$$0) {
         this.t = null;
      }
   }

   public void b(boolean $$0) {
      this.w = $$0;
   }

   public boolean a(int $$0, int $$1, int $$2) {
      boolean $$3 = this.t != null;
      if ($$3 && this.t.b($$0, $$1, $$2)) {
         return true;
      } else if (this.f.aI_() != this.g || $$0 != 258 || this.w && !$$3) {
         return false;
      } else {
         this.c(true);
         return true;
      }
   }

   public boolean a(double $$0) {
      return this.t != null && this.t.a(axk.a($$0, -1.0, 1.0));
   }

   public boolean a(double $$0, double $$1, int $$2) {
      return this.t != null && this.t.a((int)$$0, (int)$$1, $$2);
   }

   public void c(boolean $$0) {
      if (this.s != null && this.s.isDone()) {
         Suggestions $$1 = this.s.join();
         if (!$$1.isEmpty()) {
            int $$2 = 0;

            for (Suggestion $$3 : $$1.getList()) {
               $$2 = Math.max($$2, this.h.b($$3.getText()));
            }

            int $$4 = axk.a(this.g.p($$1.getRange().getStart()), 0, this.g.p(0) + this.g.h() - $$2);
            int $$5 = this.m ? this.f.l - 12 : 72;
            this.t = new fds.a($$4, $$5, $$2, this.a($$1), $$0);
         }
      }
   }

   public boolean a() {
      return this.t != null;
   }

   public wg b() {
      if (this.t != null && this.t.h) {
         return this.w ? wg.c("narration.suggestion.usage.cycle.hidable") : wg.c("narration.suggestion.usage.cycle.fixed");
      } else {
         return this.w ? wg.c("narration.suggestion.usage.fill.hidable") : wg.c("narration.suggestion.usage.fill.fixed");
      }
   }

   public void c() {
      this.t = null;
   }

   private List<Suggestion> a(Suggestions $$0) {
      String $$1 = this.g.a().substring(0, this.g.e());
      int $$2 = a($$1);
      String $$3 = $$1.substring($$2).toLowerCase(Locale.ROOT);
      List<Suggestion> $$4 = Lists.newArrayList();
      List<Suggestion> $$5 = Lists.newArrayList();

      for (Suggestion $$6 : $$0.getList()) {
         if (!$$6.getText().startsWith($$3) && !$$6.getText().startsWith("minecraft:" + $$3)) {
            $$5.add($$6);
         } else {
            $$4.add($$6);
         }
      }

      $$4.addAll($$5);
      return $$4;
   }

   public void d() {
      String $$0 = this.g.a();
      if (this.r != null && !this.r.getReader().getString().equals($$0)) {
         this.r = null;
      }

      if (!this.v) {
         this.g.c(null);
         this.t = null;
      }

      this.o.clear();
      StringReader $$1 = new StringReader($$0);
      boolean $$2 = $$1.canRead() && $$1.peek() == '/';
      if ($$2) {
         $$1.skip();
      }

      boolean $$3 = this.i || $$2;
      int $$4 = this.g.e();
      if ($$3) {
         CommandDispatcher<dz> $$5 = this.e.s.ct.r();
         if (this.r == null) {
            this.r = $$5.parse($$1, this.e.s.ct.h());
         }

         int $$6 = this.j ? $$1.getCursor() : 1;
         if ($$4 >= $$6 && (this.t == null || !this.v)) {
            this.s = $$5.getCompletionSuggestions(this.r, $$4);
            this.s.thenRun(() -> {
               if (this.s.isDone()) {
                  this.f();
               }
            });
         }
      } else {
         String $$7 = $$0.substring(0, $$4);
         int $$8 = a($$7);
         Collection<String> $$9 = this.e.s.ct.h().z();
         this.s = dz.b($$9, new SuggestionsBuilder($$7, $$8));
      }
   }

   private static int a(String $$0) {
      if (Strings.isNullOrEmpty($$0)) {
         return 0;
      } else {
         int $$1 = 0;
         Matcher $$2 = a.matcher($$0);

         while ($$2.find()) {
            $$1 = $$2.end();
         }

         return $$1;
      }
   }

   private static aww a(CommandSyntaxException $$0) {
      wg $$1 = wj.a($$0.getRawMessage());
      String $$2 = $$0.getContext();
      return $$2 == null ? $$1.g() : wg.a("command.context.parse_error", $$1, $$0.getCursor(), $$2).g();
   }

   private void f() {
      boolean $$0 = false;
      if (this.g.e() == this.g.a().length()) {
         if (this.s.join().isEmpty() && !this.r.getExceptions().isEmpty()) {
            int $$1 = 0;

            for (Entry<CommandNode<dz>, CommandSyntaxException> $$2 : this.r.getExceptions().entrySet()) {
               CommandSyntaxException $$3 = $$2.getValue();
               if ($$3.getType() == CommandSyntaxException.BUILT_IN_EXCEPTIONS.literalIncorrect()) {
                  $$1++;
               } else {
                  this.o.add(a($$3));
               }
            }

            if ($$1 > 0) {
               this.o.add(a(CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().create()));
            }
         } else if (this.r.getReader().canRead()) {
            $$0 = true;
         }
      }

      this.p = 0;
      this.q = this.f.k;
      if (this.o.isEmpty() && !this.a(n.h) && $$0) {
         this.o.add(a(dv.b(this.r)));
      }

      this.t = null;
      if (this.u && this.e.m.J().c()) {
         this.c(false);
      }
   }

   private boolean a(n $$0) {
      CommandContextBuilder<dz> $$1 = this.r.getContext();
      SuggestionContext<dz> $$2 = $$1.findSuggestionContext(this.g.e());
      Map<CommandNode<dz>, String> $$3 = this.e.s.ct.r().getSmartUsage($$2.parent, this.e.s.ct.h());
      List<aww> $$4 = Lists.newArrayList();
      int $$5 = 0;
      xd $$6 = xd.a.a($$0);

      for (Entry<CommandNode<dz>, String> $$7 : $$3.entrySet()) {
         if (!($$7.getKey() instanceof LiteralCommandNode)) {
            $$4.add(aww.forward($$7.getValue(), $$6));
            $$5 = Math.max($$5, this.h.b($$7.getValue()));
         }
      }

      if (!$$4.isEmpty()) {
         this.o.addAll($$4);
         this.p = axk.a(this.g.p($$2.startPos), 0, this.g.p(0) + this.g.h() - $$5);
         this.q = $$5;
         return true;
      } else {
         return false;
      }
   }

   private aww a(String $$0, int $$1) {
      return this.r != null ? a(this.r, $$0, $$1) : aww.forward($$0, xd.a);
   }

   @Nullable
   static String a(String $$0, String $$1) {
      return $$1.startsWith($$0) ? $$1.substring($$0.length()) : null;
   }

   private static aww a(ParseResults<dz> $$0, String $$1, int $$2) {
      List<aww> $$3 = Lists.newArrayList();
      int $$4 = 0;
      int $$5 = -1;
      CommandContextBuilder<dz> $$6 = $$0.getContext().getLastChild();

      for (ParsedArgument<dz, ?> $$7 : $$6.getArguments().values()) {
         if (++$$5 >= d.size()) {
            $$5 = 0;
         }

         int $$8 = Math.max($$7.getRange().getStart() - $$2, 0);
         if ($$8 >= $$1.length()) {
            break;
         }

         int $$9 = Math.min($$7.getRange().getEnd() - $$2, $$1.length());
         if ($$9 > 0) {
            $$3.add(aww.forward($$1.substring($$4, $$8), c));
            $$3.add(aww.forward($$1.substring($$8, $$9), d.get($$5)));
            $$4 = $$9;
         }
      }

      if ($$0.getReader().canRead()) {
         int $$10 = Math.max($$0.getReader().getCursor() - $$2, 0);
         if ($$10 < $$1.length()) {
            int $$11 = Math.min($$10 + $$0.getReader().getRemainingLength(), $$1.length());
            $$3.add(aww.forward($$1.substring($$4, $$10), c));
            $$3.add(aww.forward($$1.substring($$10, $$11), b));
            $$4 = $$11;
         }
      }

      $$3.add(aww.forward($$1.substring($$4), c));
      return aww.composite($$3);
   }

   public void a(fdc $$0, int $$1, int $$2) {
      if (!this.b($$0, $$1, $$2)) {
         this.a($$0);
      }
   }

   public boolean b(fdc $$0, int $$1, int $$2) {
      if (this.t != null) {
         this.t.a($$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   public void a(fdc $$0) {
      int $$1 = 0;

      for (aww $$2 : this.o) {
         int $$3 = this.m ? this.f.l - 14 - 13 - 12 * $$1 : 72 + 12 * $$1;
         $$0.a(this.p - 1, $$3, this.p + this.q + 1, $$3 + 12, this.n);
         $$0.b(this.h, $$2, this.p, $$3 + 2, -1);
         $$1++;
      }
   }

   public wg e() {
      return (wg)(this.t != null ? wf.s.f().b(this.t.b()) : wf.a);
   }

   public class a {
      private final gae b;
      private final String c;
      private final List<Suggestion> d;
      private int e;
      private int f;
      private erz g = erz.a;
      boolean h;
      private int i;

      a(int $$1, int $$2, int $$3, List<Suggestion> $$4, boolean $$5) {
         int $$6 = $$1 - (fds.this.g.f() ? 0 : 1);
         int $$7 = fds.this.m ? $$2 - 3 - Math.min($$4.size(), fds.this.l) * 12 : $$2 - (fds.this.g.f() ? 1 : 0);
         this.b = new gae($$6, $$7, $$3 + 1, Math.min($$4.size(), fds.this.l) * 12);
         this.c = fds.this.g.a();
         this.i = $$5 ? -1 : 0;
         this.d = $$4;
         this.b(0);
      }

      public void a(fdc $$0, int $$1, int $$2) {
         int $$3 = Math.min(this.d.size(), fds.this.l);
         int $$4 = -5592406;
         boolean $$5 = this.e > 0;
         boolean $$6 = this.d.size() > this.e + $$3;
         boolean $$7 = $$5 || $$6;
         boolean $$8 = this.g.i != (float)$$1 || this.g.j != (float)$$2;
         if ($$8) {
            this.g = new erz((float)$$1, (float)$$2);
         }

         if ($$7) {
            $$0.a(this.b.a(), this.b.b() - 1, this.b.a() + this.b.c(), this.b.b(), fds.this.n);
            $$0.a(this.b.a(), this.b.b() + this.b.d(), this.b.a() + this.b.c(), this.b.b() + this.b.d() + 1, fds.this.n);
            if ($$5) {
               for (int $$9 = 0; $$9 < this.b.c(); $$9++) {
                  if ($$9 % 2 == 0) {
                     $$0.a(this.b.a() + $$9, this.b.b() - 1, this.b.a() + $$9 + 1, this.b.b(), -1);
                  }
               }
            }

            if ($$6) {
               for (int $$10 = 0; $$10 < this.b.c(); $$10++) {
                  if ($$10 % 2 == 0) {
                     $$0.a(this.b.a() + $$10, this.b.b() + this.b.d(), this.b.a() + $$10 + 1, this.b.b() + this.b.d() + 1, -1);
                  }
               }
            }
         }

         boolean $$11 = false;

         for (int $$12 = 0; $$12 < $$3; $$12++) {
            Suggestion $$13 = this.d.get($$12 + this.e);
            $$0.a(this.b.a(), this.b.b() + 12 * $$12, this.b.a() + this.b.c(), this.b.b() + 12 * $$12 + 12, fds.this.n);
            if ($$1 > this.b.a() && $$1 < this.b.a() + this.b.c() && $$2 > this.b.b() + 12 * $$12 && $$2 < this.b.b() + 12 * $$12 + 12) {
               if ($$8) {
                  this.b($$12 + this.e);
               }

               $$11 = true;
            }

            $$0.b(fds.this.h, $$13.getText(), this.b.a() + 1, this.b.b() + 2 + 12 * $$12, $$12 + this.e == this.f ? -256 : -5592406);
         }

         if ($$11) {
            Message $$14 = this.d.get(this.f).getTooltip();
            if ($$14 != null) {
               $$0.a(fds.this.h, wj.a($$14), $$1, $$2);
            }
         }
      }

      public boolean a(int $$0, int $$1, int $$2) {
         if (!this.b.b($$0, $$1)) {
            return false;
         } else {
            int $$3 = ($$1 - this.b.b()) / 12 + this.e;
            if ($$3 >= 0 && $$3 < this.d.size()) {
               this.b($$3);
               this.a();
            }

            return true;
         }
      }

      public boolean a(double $$0) {
         int $$1 = (int)(fds.this.e.n.e() * (double)fds.this.e.aO().o() / (double)fds.this.e.aO().m());
         int $$2 = (int)(fds.this.e.n.f() * (double)fds.this.e.aO().p() / (double)fds.this.e.aO().n());
         if (this.b.b($$1, $$2)) {
            this.e = axk.a((int)((double)this.e - $$0), 0, Math.max(this.d.size() - fds.this.l, 0));
            return true;
         } else {
            return false;
         }
      }

      public boolean b(int $$0, int $$1, int $$2) {
         if ($$0 == 265) {
            this.a(-1);
            this.h = false;
            return true;
         } else if ($$0 == 264) {
            this.a(1);
            this.h = false;
            return true;
         } else if ($$0 == 258) {
            if (this.h) {
               this.a(fjo.s() ? -1 : 1);
            }

            this.a();
            return true;
         } else if ($$0 == 256) {
            fds.this.c();
            fds.this.g.c(null);
            return true;
         } else {
            return false;
         }
      }

      public void a(int $$0) {
         this.b(this.f + $$0);
         int $$1 = this.e;
         int $$2 = this.e + fds.this.l - 1;
         if (this.f < $$1) {
            this.e = axk.a(this.f, 0, Math.max(this.d.size() - fds.this.l, 0));
         } else if (this.f > $$2) {
            this.e = axk.a(this.f + fds.this.k - fds.this.l, 0, Math.max(this.d.size() - fds.this.l, 0));
         }
      }

      public void b(int $$0) {
         this.f = $$0;
         if (this.f < 0) {
            this.f = this.f + this.d.size();
         }

         if (this.f >= this.d.size()) {
            this.f = this.f - this.d.size();
         }

         Suggestion $$1 = this.d.get(this.f);
         fds.this.g.c(fds.a(fds.this.g.a(), $$1.apply(this.c)));
         if (this.i != this.f) {
            fds.this.e.aY().c(this.b());
         }
      }

      public void a() {
         Suggestion $$0 = this.d.get(this.f);
         fds.this.v = true;
         fds.this.g.a($$0.apply(this.c));
         int $$1 = $$0.getRange().getStart() + $$0.getText().length();
         fds.this.g.e($$1);
         fds.this.g.i($$1);
         this.b(this.f);
         fds.this.v = false;
         this.h = true;
      }

      wg b() {
         this.i = this.f;
         Suggestion $$0 = this.d.get(this.f);
         Message $$1 = $$0.getTooltip();
         return $$1 != null
            ? wg.a("narration.suggestion.tooltip", this.f + 1, this.d.size(), $$0.getText(), wg.a($$1))
            : wg.a("narration.suggestion", this.f + 1, this.d.size(), $$0.getText());
      }
   }
}
