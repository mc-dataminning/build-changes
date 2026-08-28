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

public class ej implements el<ej>, eo {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("permissions.requires.player"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("permissions.requires.entity"));
   private final ei d;
   private final fex e;
   private final arq f;
   private final int g;
   private final String h;
   private final wy i;
   private final MinecraftServer j;
   private final boolean k;
   @Nullable
   private final bwi l;
   private final eg m;
   private final ev.a n;
   private final few o;
   private final eh p;
   private final bam q;

   public ej(ei $$0, fex $$1, few $$2, arq $$3, int $$4, String $$5, wy $$6, MinecraftServer $$7, @Nullable bwi $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, eg.a, ev.a.a, eh.a, bam.immediate($$7));
   }

   protected ej(
      ei $$0,
      fex $$1,
      few $$2,
      arq $$3,
      int $$4,
      String $$5,
      wy $$6,
      MinecraftServer $$7,
      @Nullable bwi $$8,
      boolean $$9,
      eg $$10,
      ev.a $$11,
      eh $$12,
      bam $$13
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

   public ej a(ei $$0) {
      return this.d == $$0 ? this : new ej($$0, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
   }

   public ej a(bwi $$0) {
      return this.l == $$0
         ? this
         : new ej(this.d, this.e, this.o, this.f, this.g, $$0.ai().getString(), $$0.m_(), this.j, $$0, this.k, this.m, this.n, this.p, this.q);
   }

   public ej a(fex $$0) {
      return this.e.equals($$0) ? this : new ej(this.d, $$0, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
   }

   public ej a(few $$0) {
      return this.o.c($$0) ? this : new ej(this.d, this.e, $$0, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
   }

   public ej a(eg $$0) {
      return Objects.equals(this.m, $$0)
         ? this
         : new ej(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, $$0, this.n, this.p, this.q);
   }

   public ej a(eg $$0, BinaryOperator<eg> $$1) {
      eg $$2 = $$1.apply(this.m, $$0);
      return this.a($$2);
   }

   public ej a() {
      return !this.k && !this.d.o_()
         ? new ej(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, true, this.m, this.n, this.p, this.q)
         : this;
   }

   public ej a(int $$0) {
      return $$0 == this.g ? this : new ej(this.d, this.e, this.o, this.f, $$0, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
   }

   public ej b(int $$0) {
      return $$0 <= this.g ? this : new ej(this.d, this.e, this.o, this.f, $$0, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
   }

   public ej a(ev.a $$0) {
      return $$0 == this.n ? this : new ej(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, $$0, this.p, this.q);
   }

   public ej a(arq $$0) {
      if ($$0 == this.f) {
         return this;
      } else {
         double $$1 = eel.a(this.f.B_(), $$0.B_());
         fex $$2 = new fex(this.e.d * $$1, this.e.e, this.e.f * $$1);
         return new ej(this.d, $$2, this.o, $$0, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
      }
   }

   public ej a(bwi $$0, ev.a $$1) {
      return this.b($$1.a($$0));
   }

   public ej b(fex $$0) {
      fex $$1 = this.n.a(this);
      double $$2 = $$0.d - $$1.d;
      double $$3 = $$0.e - $$1.e;
      double $$4 = $$0.f - $$1.f;
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
      float $$6 = azm.h((float)(-(azm.d($$3, $$5) * 180.0F / (float)Math.PI)));
      float $$7 = azm.h((float)(azm.d($$4, $$2) * 180.0F / (float)Math.PI) - 90.0F);
      return this.a(new few($$6, $$7));
   }

   public ej a(eh $$0, bam $$1) {
      return $$0 == this.p && $$1 == this.q
         ? this
         : new ej(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, $$0, $$1);
   }

   public wy b() {
      return this.i;
   }

   public String c() {
      return this.h;
   }

   @Override
   public boolean c(int $$0) {
      return this.g >= $$0;
   }

   public fex d() {
      return this.e;
   }

   public arq e() {
      return this.f;
   }

   @Nullable
   public bwi f() {
      return this.l;
   }

   public bwi g() throws CommandSyntaxException {
      if (this.l == null) {
         throw b.create();
      } else {
         return this.l;
      }
   }

   public arr h() throws CommandSyntaxException {
      bwi var2 = this.l;
      if (var2 instanceof arr) {
         return (arr)var2;
      } else {
         throw a.create();
      }
   }

   @Nullable
   public arr i() {
      return this.l instanceof arr $$0 ? $$0 : null;
   }

   public boolean j() {
      return this.l instanceof arr;
   }

   public few k() {
      return this.o;
   }

   public MinecraftServer l() {
      return this.j;
   }

   public ev.a m() {
      return this.n;
   }

   public eh n() {
      return this.p;
   }

   public bam o() {
      return this.q;
   }

   public boolean a(arr $$0) {
      arr $$1 = this.i();
      return $$0 == $$1 ? false : $$1 != null && $$1.X() || $$0.X();
   }

   public void a(xn $$0, boolean $$1, wu.a $$2) {
      if (!this.k) {
         arr $$3 = this.i();
         if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
         } else {
            this.d.a($$2.a($$0.a()));
         }
      }
   }

   public void a(wy $$0) {
      if (!this.k) {
         arr $$1 = this.i();
         if ($$1 != null) {
            $$1.a($$0);
         } else {
            this.d.a($$0);
         }
      }
   }

   public void a(Supplier<wy> $$0, boolean $$1) {
      boolean $$2 = this.d.t_() && !this.k;
      boolean $$3 = $$1 && this.d.c() && !this.k;
      if ($$2 || $$3) {
         wy $$4 = $$0.get();
         if ($$2) {
            this.d.a($$4);
         }

         if ($$3) {
            this.c($$4);
         }
      }
   }

   private void c(wy $$0) {
      wy $$1 = wy.a("chat.type.admin", this.b(), $$0).a(o.h, o.u);
      if (this.j.aL().c(djd.q)) {
         for (arr $$2 : this.j.ag().t()) {
            if ($$2.z() != this.d && this.j.ag().f($$2.gh())) {
               $$2.a($$1);
            }
         }
      }

      if (this.d != this.j && this.j.aL().c(djd.n)) {
         this.j.a($$1);
      }
   }

   public void b(wy $$0) {
      if (this.d.u_() && !this.k) {
         this.d.a(wy.i().b($$0).a(o.m));
      }
   }

   @Override
   public eg p() {
      return this.m;
   }

   @Override
   public Collection<String> q() {
      return Lists.newArrayList(this.j.P());
   }

   @Override
   public Collection<String> r() {
      return this.j.aJ().e();
   }

   @Override
   public Stream<alg> s() {
      return mg.b.s().map(awm::a);
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      return Suggestions.empty();
   }

   @Override
   public CompletableFuture<Suggestions> a(alf<? extends js<?>> $$0, eo.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      if ($$0 == mh.bu) {
         return eo.a(this.j.aI().d().stream().map($$0x -> $$0x.a().a()), $$2);
      } else if ($$0 == mh.bt) {
         Collection<aj> $$4 = this.j.aD().b();
         return eo.a($$4.stream().map(aj::a), $$2);
      } else {
         return this.u().a($$0).map($$2x -> {
            this.a($$2x, $$1, $$2);
            return $$2.buildFuture();
         }).orElseGet(Suggestions::empty);
      }
   }

   @Override
   public Set<alf<djh>> t() {
      return this.j.K();
   }

   @Override
   public jt u() {
      return this.j.ba();
   }

   @Override
   public cut v() {
      return this.f.K();
   }

   @Override
   public CommandDispatcher<ej> w() {
      return this.l().aE().a();
   }

   @Override
   public void a(CommandExceptionType $$0, Message $$1, boolean $$2, @Nullable hn $$3) {
      if ($$3 != null) {
         $$3.a($$1.getString());
      }

      if (!$$2) {
         this.b(xb.a($$1));
      }
   }

   @Override
   public boolean x() {
      return this.k;
   }
}
