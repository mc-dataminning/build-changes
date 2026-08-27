import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandExceptionType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ee implements eg<ee>, ej {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("permissions.requires.player"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wx.c("permissions.requires.entity"));
   private final ed c;
   private final eum d;
   private final aqn e;
   private final int f;
   private final String g;
   private final wx h;
   private final MinecraftServer i;
   private final boolean j;
   @Nullable
   private final brw k;
   private final eb l;
   private final eq.a m;
   private final eul n;
   private final ec o;
   private final azb p;

   public ee(ed $$0, eum $$1, eul $$2, aqn $$3, int $$4, String $$5, wx $$6, MinecraftServer $$7, @Nullable brw $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, eb.a, eq.a.a, ec.a, azb.immediate($$7));
   }

   protected ee(
      ed $$0,
      eum $$1,
      eul $$2,
      aqn $$3,
      int $$4,
      String $$5,
      wx $$6,
      MinecraftServer $$7,
      @Nullable brw $$8,
      boolean $$9,
      eb $$10,
      eq.a $$11,
      ec $$12,
      azb $$13
   ) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
      this.j = $$9;
      this.k = $$8;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
      this.l = $$10;
      this.m = $$11;
      this.n = $$2;
      this.o = $$12;
      this.p = $$13;
   }

   public ee a(ed $$0) {
      return this.c == $$0 ? this : new ee($$0, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ee a(brw $$0) {
      return this.k == $$0
         ? this
         : new ee(this.c, this.d, this.n, this.e, this.f, $$0.af().getString(), $$0.O_(), this.i, $$0, this.j, this.l, this.m, this.o, this.p);
   }

   public ee a(eum $$0) {
      return this.d.equals($$0) ? this : new ee(this.c, $$0, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ee a(eul $$0) {
      return this.n.c($$0) ? this : new ee(this.c, this.d, $$0, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ee a(eb $$0) {
      return Objects.equals(this.l, $$0)
         ? this
         : new ee(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, $$0, this.m, this.o, this.p);
   }

   public ee a(eb $$0, BinaryOperator<eb> $$1) {
      eb $$2 = $$1.apply(this.l, $$0);
      return this.a($$2);
   }

   public ee a() {
      return !this.j && !this.c.m_()
         ? new ee(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, true, this.l, this.m, this.o, this.p)
         : this;
   }

   public ee a(int $$0) {
      return $$0 == this.f ? this : new ee(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ee b(int $$0) {
      return $$0 <= this.f ? this : new ee(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ee a(eq.a $$0) {
      return $$0 == this.m ? this : new ee(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, $$0, this.o, this.p);
   }

   public ee a(aqn $$0) {
      if ($$0 == this.e) {
         return this;
      } else {
         double $$1 = duv.a(this.e.D_(), $$0.D_());
         eum $$2 = new eum(this.d.c * $$1, this.d.d, this.d.e * $$1);
         return new ee(this.c, $$2, this.n, $$0, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
      }
   }

   public ee a(brw $$0, eq.a $$1) {
      return this.b($$1.a($$0));
   }

   public ee b(eum $$0) {
      eum $$1 = this.m.a(this);
      double $$2 = $$0.c - $$1.c;
      double $$3 = $$0.d - $$1.d;
      double $$4 = $$0.e - $$1.e;
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
      float $$6 = ayf.g((float)(-(ayf.d($$3, $$5) * 180.0F / (float)Math.PI)));
      float $$7 = ayf.g((float)(ayf.d($$4, $$2) * 180.0F / (float)Math.PI) - 90.0F);
      return this.a(new eul($$6, $$7));
   }

   public ee a(ec $$0, azb $$1) {
      return $$0 == this.o && $$1 == this.p
         ? this
         : new ee(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, $$0, $$1);
   }

   public wx b() {
      return this.h;
   }

   public String c() {
      return this.g;
   }

   @Override
   public boolean c(int $$0) {
      return this.f >= $$0;
   }

   public eum d() {
      return this.d;
   }

   public aqn e() {
      return this.e;
   }

   @Nullable
   public brw f() {
      return this.k;
   }

   public brw g() throws CommandSyntaxException {
      if (this.k == null) {
         throw b.create();
      } else {
         return this.k;
      }
   }

   public aqo h() throws CommandSyntaxException {
      brw var2 = this.k;
      if (var2 instanceof aqo) {
         return (aqo)var2;
      } else {
         throw a.create();
      }
   }

   @Nullable
   public aqo i() {
      return this.k instanceof aqo $$0 ? $$0 : null;
   }

   public boolean j() {
      return this.k instanceof aqo;
   }

   public eul k() {
      return this.n;
   }

   public MinecraftServer l() {
      return this.i;
   }

   public eq.a m() {
      return this.m;
   }

   public ec n() {
      return this.o;
   }

   public azb o() {
      return this.p;
   }

   public boolean a(aqo $$0) {
      aqo $$1 = this.i();
      return $$0 == $$1 ? false : $$1 != null && $$1.Y() || $$0.Y();
   }

   public void a(xm $$0, boolean $$1, wt.a $$2) {
      if (!this.j) {
         aqo $$3 = this.i();
         if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
         } else {
            this.c.a($$2.a($$0.a()));
         }
      }
   }

   public void a(wx $$0) {
      if (!this.j) {
         aqo $$1 = this.i();
         if ($$1 != null) {
            $$1.a($$0);
         } else {
            this.c.a($$0);
         }
      }
   }

   public void a(Supplier<wx> $$0, boolean $$1) {
      boolean $$2 = this.c.l_() && !this.j;
      boolean $$3 = $$1 && this.c.U_() && !this.j;
      if ($$2 || $$3) {
         wx $$4 = $$0.get();
         if ($$2) {
            this.c.a($$4);
         }

         if ($$3) {
            this.c($$4);
         }
      }
   }

   private void c(wx $$0) {
      wx $$1 = wx.a("chat.type.admin", this.b(), $$0).a(n.h, n.u);
      if (this.i.aM().b(dav.p)) {
         for (aqo $$2 : this.i.ah().t()) {
            if ($$2 != this.c && this.i.ah().f($$2.gb())) {
               $$2.a($$1);
            }
         }
      }

      if (this.c != this.i && this.i.aM().b(dav.m)) {
         this.i.a($$1);
      }
   }

   public void b(wx $$0) {
      if (this.c.w_() && !this.j) {
         this.c.a(wx.i().b($$0).a(n.m));
      }
   }

   @Override
   public eb p() {
      return this.l;
   }

   @Override
   public Collection<String> q() {
      return Lists.newArrayList(this.i.O());
   }

   @Override
   public Collection<String> r() {
      return this.i.aK().f();
   }

   @Override
   public Stream<akn> s() {
      return le.b.s().map(avh::a);
   }

   @Override
   public Stream<akn> t() {
      return this.i.aJ().d();
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      return Suggestions.empty();
   }

   @Override
   public CompletableFuture<Suggestions> a(akm<? extends jk<?>> $$0, ej.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      return this.v().c($$0).map($$2x -> {
         this.a($$2x, $$1, $$2);
         return $$2.buildFuture();
      }).orElseGet(Suggestions::empty);
   }

   @Override
   public Set<akm<daz>> u() {
      return this.i.J();
   }

   @Override
   public jl v() {
      return this.i.bc();
   }

   @Override
   public col w() {
      return this.e.J();
   }

   @Override
   public CommandDispatcher<ee> x() {
      return this.l().aF().a();
   }

   @Override
   public void a(CommandExceptionType $$0, Message $$1, boolean $$2, @Nullable hg $$3) {
      if ($$3 != null) {
         $$3.a($$1.getString());
      }

      if (!$$2) {
         this.b(xa.a($$1));
      }
   }

   @Override
   public boolean y() {
      return this.j;
   }
}
