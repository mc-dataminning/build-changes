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

public class dv implements dx<dv>, ea {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.c("permissions.requires.player"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wi.c("permissions.requires.entity"));
   private final du c;
   private final esj d;
   private final apu e;
   private final int f;
   private final String g;
   private final wi h;
   private final MinecraftServer i;
   private final boolean j;
   @Nullable
   private final bqa k;
   private final ds l;
   private final eh.a m;
   private final esi n;
   private final dt o;
   private final ayi p;

   public dv(du $$0, esj $$1, esi $$2, apu $$3, int $$4, String $$5, wi $$6, MinecraftServer $$7, @Nullable bqa $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, ds.a, eh.a.a, dt.a, ayi.immediate($$7));
   }

   protected dv(
      du $$0,
      esj $$1,
      esi $$2,
      apu $$3,
      int $$4,
      String $$5,
      wi $$6,
      MinecraftServer $$7,
      @Nullable bqa $$8,
      boolean $$9,
      ds $$10,
      eh.a $$11,
      dt $$12,
      ayi $$13
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

   public dv a(du $$0) {
      return this.c == $$0 ? this : new dv($$0, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public dv a(bqa $$0) {
      return this.k == $$0
         ? this
         : new dv(this.c, this.d, this.n, this.e, this.f, $$0.ad().getString(), $$0.O_(), this.i, $$0, this.j, this.l, this.m, this.o, this.p);
   }

   public dv a(esj $$0) {
      return this.d.equals($$0) ? this : new dv(this.c, $$0, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public dv a(esi $$0) {
      return this.n.c($$0) ? this : new dv(this.c, this.d, $$0, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public dv a(ds $$0) {
      return Objects.equals(this.l, $$0)
         ? this
         : new dv(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, $$0, this.m, this.o, this.p);
   }

   public dv a(ds $$0, BinaryOperator<ds> $$1) {
      ds $$2 = $$1.apply(this.l, $$0);
      return this.a($$2);
   }

   public dv a() {
      return !this.j && !this.c.m_()
         ? new dv(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, true, this.l, this.m, this.o, this.p)
         : this;
   }

   public dv a(int $$0) {
      return $$0 == this.f ? this : new dv(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public dv b(int $$0) {
      return $$0 <= this.f ? this : new dv(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public dv a(eh.a $$0) {
      return $$0 == this.m ? this : new dv(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, $$0, this.o, this.p);
   }

   public dv a(apu $$0) {
      if ($$0 == this.e) {
         return this;
      } else {
         double $$1 = dta.a(this.e.D_(), $$0.D_());
         esj $$2 = new esj(this.d.c * $$1, this.d.d, this.d.e * $$1);
         return new dv(this.c, $$2, this.n, $$0, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
      }
   }

   public dv a(bqa $$0, eh.a $$1) {
      return this.b($$1.a($$0));
   }

   public dv b(esj $$0) {
      esj $$1 = this.m.a(this);
      double $$2 = $$0.c - $$1.c;
      double $$3 = $$0.d - $$1.d;
      double $$4 = $$0.e - $$1.e;
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
      float $$6 = axm.g((float)(-(axm.d($$3, $$5) * 180.0F / (float)Math.PI)));
      float $$7 = axm.g((float)(axm.d($$4, $$2) * 180.0F / (float)Math.PI) - 90.0F);
      return this.a(new esi($$6, $$7));
   }

   public dv a(dt $$0, ayi $$1) {
      return $$0 == this.o && $$1 == this.p
         ? this
         : new dv(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, $$0, $$1);
   }

   public wi b() {
      return this.h;
   }

   public String c() {
      return this.g;
   }

   @Override
   public boolean c(int $$0) {
      return this.f >= $$0;
   }

   public esj d() {
      return this.d;
   }

   public apu e() {
      return this.e;
   }

   @Nullable
   public bqa f() {
      return this.k;
   }

   public bqa g() throws CommandSyntaxException {
      if (this.k == null) {
         throw b.create();
      } else {
         return this.k;
      }
   }

   public apv h() throws CommandSyntaxException {
      bqa var2 = this.k;
      if (var2 instanceof apv) {
         return (apv)var2;
      } else {
         throw a.create();
      }
   }

   @Nullable
   public apv i() {
      return this.k instanceof apv $$0 ? $$0 : null;
   }

   public boolean j() {
      return this.k instanceof apv;
   }

   public esi k() {
      return this.n;
   }

   public MinecraftServer l() {
      return this.i;
   }

   public eh.a m() {
      return this.m;
   }

   public dt n() {
      return this.o;
   }

   public ayi o() {
      return this.p;
   }

   public boolean a(apv $$0) {
      apv $$1 = this.i();
      return $$0 == $$1 ? false : $$1 != null && $$1.Y() || $$0.Y();
   }

   public void a(wx $$0, boolean $$1, we.a $$2) {
      if (!this.j) {
         apv $$3 = this.i();
         if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
         } else {
            this.c.a($$2.a($$0.a()));
         }
      }
   }

   public void a(wi $$0) {
      if (!this.j) {
         apv $$1 = this.i();
         if ($$1 != null) {
            $$1.a($$0);
         } else {
            this.c.a($$0);
         }
      }
   }

   public void a(Supplier<wi> $$0, boolean $$1) {
      boolean $$2 = this.c.l_() && !this.j;
      boolean $$3 = $$1 && this.c.U_() && !this.j;
      if ($$2 || $$3) {
         wi $$4 = $$0.get();
         if ($$2) {
            this.c.a($$4);
         }

         if ($$3) {
            this.c($$4);
         }
      }
   }

   private void c(wi $$0) {
      wi $$1 = wi.a("chat.type.admin", this.b(), $$0).a(n.h, n.u);
      if (this.i.aN().b(czc.p)) {
         for (apv $$2 : this.i.ah().t()) {
            if ($$2 != this.c && this.i.ah().f($$2.fY())) {
               $$2.a($$1);
            }
         }
      }

      if (this.c != this.i && this.i.aN().b(czc.m)) {
         this.i.a($$1);
      }
   }

   public void b(wi $$0) {
      if (this.c.w_() && !this.j) {
         this.c.a(wi.i().b($$0).a(n.m));
      }
   }

   @Override
   public ds p() {
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
   public Stream<ajv> s() {
      return kt.b.s().map(aun::a);
   }

   @Override
   public Stream<ajv> t() {
      return this.i.aJ().d();
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      return Suggestions.empty();
   }

   @Override
   public CompletableFuture<Suggestions> a(aju<? extends ja<?>> $$0, ea.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      return this.v().c($$0).map($$2x -> {
         this.a($$2x, $$1, $$2);
         return $$2.buildFuture();
      }).orElseGet(Suggestions::empty);
   }

   @Override
   public Set<aju<czg>> u() {
      return this.i.J();
   }

   @Override
   public jb v() {
      return this.i.bd();
   }

   @Override
   public cmn w() {
      return this.e.J();
   }

   @Override
   public CommandDispatcher<dv> x() {
      return this.l().aF().a();
   }

   @Override
   public void a(CommandExceptionType $$0, Message $$1, boolean $$2, @Nullable gx $$3) {
      if ($$3 != null) {
         $$3.a($$1.getString());
      }

      if (!$$2) {
         this.b(wl.a($$1));
      }
   }

   @Override
   public boolean y() {
      return this.j;
   }
}
