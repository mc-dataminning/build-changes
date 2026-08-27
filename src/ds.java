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

public class ds implements du<ds>, dx {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vg.c("permissions.requires.player"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vg.c("permissions.requires.entity"));
   private final dr c;
   private final emc d;
   private final ane e;
   private final int f;
   private final String g;
   private final vg h;
   private final MinecraftServer i;
   private final boolean j;
   @Nullable
   private final blw k;
   private final dp l;
   private final ee.a m;
   private final emb n;
   private final dq o;
   private final avn p;

   public ds(dr $$0, emc $$1, emb $$2, ane $$3, int $$4, String $$5, vg $$6, MinecraftServer $$7, @Nullable blw $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, dp.a, ee.a.a, dq.a, avn.immediate($$7));
   }

   protected ds(
      dr $$0,
      emc $$1,
      emb $$2,
      ane $$3,
      int $$4,
      String $$5,
      vg $$6,
      MinecraftServer $$7,
      @Nullable blw $$8,
      boolean $$9,
      dp $$10,
      ee.a $$11,
      dq $$12,
      avn $$13
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

   public ds a(dr $$0) {
      return this.c == $$0 ? this : new ds($$0, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ds a(blw $$0) {
      return this.k == $$0
         ? this
         : new ds(this.c, this.d, this.n, this.e, this.f, $$0.ad().getString(), $$0.Q_(), this.i, $$0, this.j, this.l, this.m, this.o, this.p);
   }

   public ds a(emc $$0) {
      return this.d.equals($$0) ? this : new ds(this.c, $$0, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ds a(emb $$0) {
      return this.n.c($$0) ? this : new ds(this.c, this.d, $$0, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ds a(dp $$0) {
      return Objects.equals(this.l, $$0)
         ? this
         : new ds(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, $$0, this.m, this.o, this.p);
   }

   public ds a(dp $$0, BinaryOperator<dp> $$1) {
      dp $$2 = $$1.apply(this.l, $$0);
      return this.a($$2);
   }

   public ds a() {
      return !this.j && !this.c.m_()
         ? new ds(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, true, this.l, this.m, this.o, this.p)
         : this;
   }

   public ds a(int $$0) {
      return $$0 == this.f ? this : new ds(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ds b(int $$0) {
      return $$0 <= this.f ? this : new ds(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ds a(ee.a $$0) {
      return $$0 == this.m ? this : new ds(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, $$0, this.o, this.p);
   }

   public ds a(ane $$0) {
      if ($$0 == this.e) {
         return this;
      } else {
         double $$1 = dmy.a(this.e.E_(), $$0.E_());
         emc $$2 = new emc(this.d.c * $$1, this.d.d, this.d.e * $$1);
         return new ds(this.c, $$2, this.n, $$0, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
      }
   }

   public ds a(blw $$0, ee.a $$1) {
      return this.b($$1.a($$0));
   }

   public ds b(emc $$0) {
      emc $$1 = this.m.a(this);
      double $$2 = $$0.c - $$1.c;
      double $$3 = $$0.d - $$1.d;
      double $$4 = $$0.e - $$1.e;
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
      float $$6 = aup.g((float)(-(aup.d($$3, $$5) * 180.0F / (float)Math.PI)));
      float $$7 = aup.g((float)(aup.d($$4, $$2) * 180.0F / (float)Math.PI) - 90.0F);
      return this.a(new emb($$6, $$7));
   }

   public ds a(dq $$0, avn $$1) {
      return $$0 == this.o && $$1 == this.p
         ? this
         : new ds(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, $$0, $$1);
   }

   public vg b() {
      return this.h;
   }

   public String c() {
      return this.g;
   }

   @Override
   public boolean c(int $$0) {
      return this.f >= $$0;
   }

   public emc d() {
      return this.d;
   }

   public ane e() {
      return this.e;
   }

   @Nullable
   public blw f() {
      return this.k;
   }

   public blw g() throws CommandSyntaxException {
      if (this.k == null) {
         throw b.create();
      } else {
         return this.k;
      }
   }

   public anf h() throws CommandSyntaxException {
      blw var2 = this.k;
      if (var2 instanceof anf) {
         return (anf)var2;
      } else {
         throw a.create();
      }
   }

   @Nullable
   public anf i() {
      return this.k instanceof anf $$0 ? $$0 : null;
   }

   public boolean j() {
      return this.k instanceof anf;
   }

   public emb k() {
      return this.n;
   }

   public MinecraftServer l() {
      return this.i;
   }

   public ee.a m() {
      return this.m;
   }

   public dq n() {
      return this.o;
   }

   public avn o() {
      return this.p;
   }

   public boolean a(anf $$0) {
      anf $$1 = this.i();
      return $$0 == $$1 ? false : $$1 != null && $$1.Y() || $$0.Y();
   }

   public void a(vv $$0, boolean $$1, vc.a $$2) {
      if (!this.j) {
         anf $$3 = this.i();
         if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
         } else {
            this.c.a($$2.a($$0.a()));
         }
      }
   }

   public void a(vg $$0) {
      if (!this.j) {
         anf $$1 = this.i();
         if ($$1 != null) {
            $$1.a($$0);
         } else {
            this.c.a($$0);
         }
      }
   }

   public void a(Supplier<vg> $$0, boolean $$1) {
      boolean $$2 = this.c.l_() && !this.j;
      boolean $$3 = $$1 && this.c.W_() && !this.j;
      if ($$2 || $$3) {
         vg $$4 = $$0.get();
         if ($$2) {
            this.c.a($$4);
         }

         if ($$3) {
            this.c($$4);
         }
      }
   }

   private void c(vg $$0) {
      vg $$1 = vg.a("chat.type.admin", this.b(), $$0).a(n.h, n.u);
      if (this.i.aK().b(ctt.p)) {
         for (anf $$2 : this.i.ae().t()) {
            if ($$2 != this.c && this.i.ae().f($$2.fR())) {
               $$2.a($$1);
            }
         }
      }

      if (this.c != this.i && this.i.aK().b(ctt.m)) {
         this.i.a($$1);
      }
   }

   public void b(vg $$0) {
      if (this.c.x_() && !this.j) {
         this.c.a(vg.i().b($$0).a(n.m));
      }
   }

   @Override
   public dp p() {
      return this.l;
   }

   @Override
   public Collection<String> q() {
      return Lists.newArrayList(this.i.L());
   }

   @Override
   public Collection<String> r() {
      return this.i.aH().f();
   }

   @Override
   public Stream<ahh> s() {
      return kd.b.s().map(ars::a);
   }

   @Override
   public Stream<ahh> t() {
      return this.i.aG().d();
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      return Suggestions.empty();
   }

   @Override
   public CompletableFuture<Suggestions> a(ahg<? extends it<?>> $$0, dx.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      return this.v().c($$0).map($$2x -> {
         this.a($$2x, $$1, $$2);
         return $$2.buildFuture();
      }).orElseGet(Suggestions::empty);
   }

   @Override
   public Set<ahg<ctx>> u() {
      return this.i.G();
   }

   @Override
   public iu v() {
      return this.i.aZ();
   }

   @Override
   public cia w() {
      return this.e.I();
   }

   @Override
   public CommandDispatcher<ds> x() {
      return this.l().aC().a();
   }

   @Override
   public void a(CommandExceptionType $$0, Message $$1, boolean $$2, @Nullable gr $$3) {
      if ($$3 != null) {
         $$3.a($$1.getString());
      }

      if (!$$2) {
         this.b(vj.a($$1));
      }
   }

   @Override
   public boolean y() {
      return this.j;
   }
}
