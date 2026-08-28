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

public class ex implements ez<ex>, fc {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wp.c("permissions.requires.player"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wp.c("permissions.requires.entity"));
   private final ew d;
   private final faz e;
   private final ard f;
   private final int g;
   private final String h;
   private final wp i;
   private final MinecraftServer j;
   private final boolean k;
   @Nullable
   private final buk l;
   private final eu m;
   private final fj.a n;
   private final fay o;
   private final ev p;
   private final azx q;

   public ex(ew $$0, faz $$1, fay $$2, ard $$3, int $$4, String $$5, wp $$6, MinecraftServer $$7, @Nullable buk $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, eu.a, fj.a.a, ev.a, azx.immediate($$7));
   }

   protected ex(
      ew $$0,
      faz $$1,
      fay $$2,
      ard $$3,
      int $$4,
      String $$5,
      wp $$6,
      MinecraftServer $$7,
      @Nullable buk $$8,
      boolean $$9,
      eu $$10,
      fj.a $$11,
      ev $$12,
      azx $$13
   ) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$3;
      this.k = $$9;
      this.l = $$8;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.j = $$7;
      this.m = $$10;
      this.n = $$11;
      this.o = $$2;
      this.p = $$12;
      this.q = $$13;
   }

   public ex a(ew $$0) {
      return this.d == $$0 ? this : new ex($$0, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
   }

   public ex a(buk $$0) {
      return this.l == $$0
         ? this
         : new ex(this.d, this.e, this.o, this.f, this.g, $$0.al().getString(), $$0.p_(), this.j, $$0, this.k, this.m, this.n, this.p, this.q);
   }

   public ex a(faz $$0) {
      return this.e.equals($$0) ? this : new ex(this.d, $$0, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
   }

   public ex a(fay $$0) {
      return this.o.c($$0) ? this : new ex(this.d, this.e, $$0, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
   }

   public ex a(eu $$0) {
      return Objects.equals(this.m, $$0)
         ? this
         : new ex(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, $$0, this.n, this.p, this.q);
   }

   public ex a(eu $$0, BinaryOperator<eu> $$1) {
      eu $$2 = $$1.apply(this.m, $$0);
      return this.a($$2);
   }

   public ex a() {
      return !this.k && !this.d.t_()
         ? new ex(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, true, this.m, this.n, this.p, this.q)
         : this;
   }

   public ex a(int $$0) {
      return $$0 == this.g ? this : new ex(this.d, this.e, this.o, this.f, $$0, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
   }

   public ex b(int $$0) {
      return $$0 <= this.g ? this : new ex(this.d, this.e, this.o, this.f, $$0, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
   }

   public ex a(fj.a $$0) {
      return $$0 == this.n ? this : new ex(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, $$0, this.p, this.q);
   }

   public ex a(ard $$0) {
      if ($$0 == this.f) {
         return this;
      } else {
         double $$1 = ear.a(this.f.G_(), $$0.G_());
         faz $$2 = new faz(this.e.d * $$1, this.e.e, this.e.f * $$1);
         return new ex(this.d, $$2, this.o, $$0, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
      }
   }

   public ex a(buk $$0, fj.a $$1) {
      return this.b($$1.a($$0));
   }

   public ex b(faz $$0) {
      faz $$1 = this.n.a(this);
      double $$2 = $$0.d - $$1.d;
      double $$3 = $$0.e - $$1.e;
      double $$4 = $$0.f - $$1.f;
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
      float $$6 = ayz.h((float)(-(ayz.d($$3, $$5) * 180.0F / (float)Math.PI)));
      float $$7 = ayz.h((float)(ayz.d($$4, $$2) * 180.0F / (float)Math.PI) - 90.0F);
      return this.a(new fay($$6, $$7));
   }

   public ex a(ev $$0, azx $$1) {
      return $$0 == this.p && $$1 == this.q
         ? this
         : new ex(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, $$0, $$1);
   }

   public wp b() {
      return this.i;
   }

   public String c() {
      return this.h;
   }

   @Override
   public boolean c(int $$0) {
      return this.g >= $$0;
   }

   public faz d() {
      return this.e;
   }

   public ard e() {
      return this.f;
   }

   @Nullable
   public buk f() {
      return this.l;
   }

   public buk g() throws CommandSyntaxException {
      if (this.l == null) {
         throw b.create();
      } else {
         return this.l;
      }
   }

   public are h() throws CommandSyntaxException {
      buk var2 = this.l;
      if (var2 instanceof are) {
         return (are)var2;
      } else {
         throw a.create();
      }
   }

   @Nullable
   public are i() {
      return this.l instanceof are $$0 ? $$0 : null;
   }

   public boolean j() {
      return this.l instanceof are;
   }

   public fay k() {
      return this.o;
   }

   public MinecraftServer l() {
      return this.j;
   }

   public fj.a m() {
      return this.n;
   }

   public ev n() {
      return this.p;
   }

   public azx o() {
      return this.q;
   }

   public boolean a(are $$0) {
      are $$1 = this.i();
      return $$0 == $$1 ? false : $$1 != null && $$1.aa() || $$0.aa();
   }

   public void a(xe $$0, boolean $$1, wl.a $$2) {
      if (!this.k) {
         are $$3 = this.i();
         if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
         } else {
            this.d.a($$2.a($$0.a()));
         }
      }
   }

   public void a(wp $$0) {
      if (!this.k) {
         are $$1 = this.i();
         if ($$1 != null) {
            $$1.a($$0);
         } else {
            this.d.a($$0);
         }
      }
   }

   public void a(Supplier<wp> $$0, boolean $$1) {
      boolean $$2 = this.d.y_() && !this.k;
      boolean $$3 = $$1 && this.d.c() && !this.k;
      if ($$2 || $$3) {
         wp $$4 = $$0.get();
         if ($$2) {
            this.d.a($$4);
         }

         if ($$3) {
            this.c($$4);
         }
      }
   }

   private void c(wp $$0) {
      wp $$1 = wp.a("chat.type.admin", this.b(), $$0).a(n.h, n.u);
      if (this.j.aL().b(dgd.p)) {
         for (are $$2 : this.j.ag().t()) {
            if ($$2.z() != this.d && this.j.ag().f($$2.gh())) {
               $$2.a($$1);
            }
         }
      }

      if (this.d != this.j && this.j.aL().b(dgd.m)) {
         this.j.a($$1);
      }
   }

   public void b(wp $$0) {
      if (this.d.z_() && !this.k) {
         this.d.a(wp.i().b($$0).a(n.m));
      }
   }

   @Override
   public eu p() {
      return this.m;
   }

   @Override
   public Collection<String> q() {
      return Lists.newArrayList(this.j.P());
   }

   @Override
   public Collection<String> r() {
      return this.j.aJ().f();
   }

   @Override
   public Stream<akv> s() {
      return mb.b.s().map(avz::a);
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      return Suggestions.empty();
   }

   @Override
   public CompletableFuture<Suggestions> a(aku<? extends ke<?>> $$0, fc.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      if ($$0 == mc.bk) {
         return fc.a(this.j.aI().e().stream().map($$0x -> $$0x.a().a()), $$2);
      } else if ($$0 == mc.bj) {
         Collection<ai> $$4 = this.j.aD().b();
         return fc.a($$4.stream().map(ai::a), $$2);
      } else {
         return this.u().a($$0).map($$2x -> {
            this.a($$2x, $$1, $$2);
            return $$2.buildFuture();
         }).orElseGet(Suggestions::empty);
      }
   }

   @Override
   public Set<aku<dgh>> t() {
      return this.j.K();
   }

   @Override
   public kf u() {
      return this.j.ba();
   }

   @Override
   public crs v() {
      return this.f.K();
   }

   @Override
   public CommandDispatcher<ex> w() {
      return this.l().aE().a();
   }

   @Override
   public void a(CommandExceptionType $$0, Message $$1, boolean $$2, @Nullable ia $$3) {
      if ($$3 != null) {
         $$3.a($$1.getString());
      }

      if (!$$2) {
         this.b(ws.a($$1));
      }
   }

   @Override
   public boolean x() {
      return this.k;
   }
}
