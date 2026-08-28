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

public class ep implements er<ep>, eu {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xp.c("permissions.requires.player"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xp.c("permissions.requires.entity"));
   private final eo c;
   private final evt d;
   private final arf e;
   private final int f;
   private final String g;
   private final xp h;
   private final MinecraftServer i;
   private final boolean j;
   @Nullable
   private final bsw k;
   private final em l;
   private final fb.a m;
   private final evs n;
   private final en o;
   private final azw p;

   public ep(eo $$0, evt $$1, evs $$2, arf $$3, int $$4, String $$5, xp $$6, MinecraftServer $$7, @Nullable bsw $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, em.a, fb.a.a, en.a, azw.immediate($$7));
   }

   protected ep(
      eo $$0,
      evt $$1,
      evs $$2,
      arf $$3,
      int $$4,
      String $$5,
      xp $$6,
      MinecraftServer $$7,
      @Nullable bsw $$8,
      boolean $$9,
      em $$10,
      fb.a $$11,
      en $$12,
      azw $$13
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

   public ep a(eo $$0) {
      return this.c == $$0 ? this : new ep($$0, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ep a(bsw $$0) {
      return this.k == $$0
         ? this
         : new ep(this.c, this.d, this.n, this.e, this.f, $$0.af().getString(), $$0.O_(), this.i, $$0, this.j, this.l, this.m, this.o, this.p);
   }

   public ep a(evt $$0) {
      return this.d.equals($$0) ? this : new ep(this.c, $$0, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ep a(evs $$0) {
      return this.n.c($$0) ? this : new ep(this.c, this.d, $$0, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ep a(em $$0) {
      return Objects.equals(this.l, $$0)
         ? this
         : new ep(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, $$0, this.m, this.o, this.p);
   }

   public ep a(em $$0, BinaryOperator<em> $$1) {
      em $$2 = $$1.apply(this.l, $$0);
      return this.a($$2);
   }

   public ep a() {
      return !this.j && !this.c.m_()
         ? new ep(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, true, this.l, this.m, this.o, this.p)
         : this;
   }

   public ep a(int $$0) {
      return $$0 == this.f ? this : new ep(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ep b(int $$0) {
      return $$0 <= this.f ? this : new ep(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ep a(fb.a $$0) {
      return $$0 == this.m ? this : new ep(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, $$0, this.o, this.p);
   }

   public ep a(arf $$0) {
      if ($$0 == this.e) {
         return this;
      } else {
         double $$1 = dvw.a(this.e.D_(), $$0.D_());
         evt $$2 = new evt(this.d.c * $$1, this.d.d, this.d.e * $$1);
         return new ep(this.c, $$2, this.n, $$0, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
      }
   }

   public ep a(bsw $$0, fb.a $$1) {
      return this.b($$1.a($$0));
   }

   public ep b(evt $$0) {
      evt $$1 = this.m.a(this);
      double $$2 = $$0.c - $$1.c;
      double $$3 = $$0.d - $$1.d;
      double $$4 = $$0.e - $$1.e;
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
      float $$6 = ayz.g((float)(-(ayz.d($$3, $$5) * 180.0F / (float)Math.PI)));
      float $$7 = ayz.g((float)(ayz.d($$4, $$2) * 180.0F / (float)Math.PI) - 90.0F);
      return this.a(new evs($$6, $$7));
   }

   public ep a(en $$0, azw $$1) {
      return $$0 == this.o && $$1 == this.p
         ? this
         : new ep(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, $$0, $$1);
   }

   public xp b() {
      return this.h;
   }

   public String c() {
      return this.g;
   }

   @Override
   public boolean c(int $$0) {
      return this.f >= $$0;
   }

   public evt d() {
      return this.d;
   }

   public arf e() {
      return this.e;
   }

   @Nullable
   public bsw f() {
      return this.k;
   }

   public bsw g() throws CommandSyntaxException {
      if (this.k == null) {
         throw b.create();
      } else {
         return this.k;
      }
   }

   public arg h() throws CommandSyntaxException {
      bsw var2 = this.k;
      if (var2 instanceof arg) {
         return (arg)var2;
      } else {
         throw a.create();
      }
   }

   @Nullable
   public arg i() {
      return this.k instanceof arg $$0 ? $$0 : null;
   }

   public boolean j() {
      return this.k instanceof arg;
   }

   public evs k() {
      return this.n;
   }

   public MinecraftServer l() {
      return this.i;
   }

   public fb.a m() {
      return this.m;
   }

   public en n() {
      return this.o;
   }

   public azw o() {
      return this.p;
   }

   public boolean a(arg $$0) {
      arg $$1 = this.i();
      return $$0 == $$1 ? false : $$1 != null && $$1.Y() || $$0.Y();
   }

   public void a(ye $$0, boolean $$1, xl.a $$2) {
      if (!this.j) {
         arg $$3 = this.i();
         if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
         } else {
            this.c.a($$2.a($$0.a()));
         }
      }
   }

   public void a(xp $$0) {
      if (!this.j) {
         arg $$1 = this.i();
         if ($$1 != null) {
            $$1.a($$0);
         } else {
            this.c.a($$0);
         }
      }
   }

   public void a(Supplier<xp> $$0, boolean $$1) {
      boolean $$2 = this.c.l_() && !this.j;
      boolean $$3 = $$1 && this.c.U_() && !this.j;
      if ($$2 || $$3) {
         xp $$4 = $$0.get();
         if ($$2) {
            this.c.a($$4);
         }

         if ($$3) {
            this.c($$4);
         }
      }
   }

   private void c(xp $$0) {
      xp $$1 = xp.a("chat.type.admin", this.b(), $$0).a(n.h, n.u);
      if (this.i.aM().b(dbw.p)) {
         for (arg $$2 : this.i.ah().t()) {
            if ($$2 != this.c && this.i.ah().f($$2.gb())) {
               $$2.a($$1);
            }
         }
      }

      if (this.c != this.i && this.i.aM().b(dbw.m)) {
         this.i.a($$1);
      }
   }

   public void b(xp $$0) {
      if (this.c.w_() && !this.j) {
         this.c.a(xp.i().b($$0).a(n.m));
      }
   }

   @Override
   public em p() {
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
   public Stream<alf> s() {
      return lp.b.s().map(avz::a);
   }

   @Override
   public Stream<alf> t() {
      return this.i.aJ().e();
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      return Suggestions.empty();
   }

   @Override
   public CompletableFuture<Suggestions> a(ale<? extends jv<?>> $$0, eu.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      return this.v().c($$0).map($$2x -> {
         this.a($$2x, $$1, $$2);
         return $$2.buildFuture();
      }).orElseGet(Suggestions::empty);
   }

   @Override
   public Set<ale<dca>> u() {
      return this.i.J();
   }

   @Override
   public jw v() {
      return this.i.bc();
   }

   @Override
   public cpn w() {
      return this.e.J();
   }

   @Override
   public CommandDispatcher<ep> x() {
      return this.l().aF().a();
   }

   @Override
   public void a(CommandExceptionType $$0, Message $$1, boolean $$2, @Nullable hr $$3) {
      if ($$3 != null) {
         $$3.a($$1.getString());
      }

      if (!$$2) {
         this.b(xs.a($$1));
      }
   }

   @Override
   public boolean y() {
      return this.j;
   }
}
