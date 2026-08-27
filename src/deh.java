import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class deh extends dcz {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private dei e = this.f();
   private dei f = this.f();
   private boolean g;

   public deh(gw $$0, dfd $$1) {
      this(ddb.h, $$0, $$1);
   }

   public deh(ddb $$0, gw $$1, dfd $$2) {
      super($$0, $$1, $$2);
   }

   protected dei f() {
      return new dei();
   }

   public boolean a(cca $$0) {
      if (this.q().b() instanceof daa $$1) {
         ehh $$2 = $$1.h(this.q());
         double $$3 = $$0.dq() - ((double)this.p().u() + $$2.c);
         double $$4 = $$0.dw() - ((double)this.p().w() + $$2.e);
         float $$5 = $$1.g(this.q());
         float $$6 = (float)(asb.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return asb.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dei b(cca $$0) {
      return this.a(this.a($$0));
   }

   public dei a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public dei g() {
      return this.e;
   }

   public dei i() {
      return this.f;
   }

   public int c() {
      return 10;
   }

   public int d() {
      return 90;
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      dei.a.encodeStart(ri.a, this.e).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("front_text", $$1));
      dei.a.encodeStart(ri.a, this.f).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("back_text", $$1));
      $$0.a("is_waxed", this.g);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.e("front_text")) {
         dei.a.parse(ri.a, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         dei.a.parse(ri.a, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private dei a(dei $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         tl $$2 = this.a($$0.a($$1, false));
         tl $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private tl a(tl $$0) {
      if (this.o instanceof akt $$1) {
         try {
            return to.a(a(null, $$1, this.p), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(cca $$0, boolean $$1, List<alk> $$2) {
      if (!this.w() && $$0.cv().equals(this.v()) && this.o != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.o.a(this.p(), this.q(), this.q(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.ab().getString());
      }
   }

   public boolean a(UnaryOperator<dei> $$0, boolean $$1) {
      dei $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dei a(cca $$0, List<alk> $$1, dei $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         alk $$4 = $$1.get($$3);
         ui $$5 = $$2.a($$3, $$0.W()).a();
         if ($$0.W()) {
            $$2 = $$2.a($$3, tl.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, tl.b($$4.d()).b($$5), tl.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dei $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dei $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.x();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dei $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.x();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, cca $$1) {
      return this.w() && this.a($$0).b($$1);
   }

   public boolean a(cca $$0, cqb $$1, gw $$2, boolean $$3) {
      boolean $$4 = false;

      for (tl $$5 : this.a($$3).b($$0.W())) {
         ui $$6 = $$5.a();
         tj $$7 = $$6.h();
         if ($$7 != null && $$7.a() == tj.a.c) {
            $$0.cK().aC().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static dt a(@Nullable cca $$0, cqb $$1, gw $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.ab().getString();
      tl $$4 = (tl)($$0 == null ? tl.b("Sign") : $$0.N_());
      return new dt(ds.a, ehh.b($$2), ehg.a, (akt)$$1, 2, $$3, $$4, $$1.n(), $$0);
   }

   public xe j() {
      return xe.a(this);
   }

   @Override
   public qw as_() {
      return this.o();
   }

   @Override
   public boolean t() {
      return true;
   }

   public void a(@Nullable UUID $$0) {
      this.d = $$0;
   }

   @Nullable
   public UUID v() {
      return this.d;
   }

   private void x() {
      this.e();
      this.o.a(this.p(), this.q(), this.q(), 3);
   }

   public boolean w() {
      return this.g;
   }

   public boolean b(boolean $$0) {
      if (this.g != $$0) {
         this.g = $$0;
         this.x();
         return true;
      } else {
         return false;
      }
   }

   public boolean b(UUID $$0) {
      cca $$1 = this.o.b($$0);
      return $$1 == null || $$1.i((double)this.p().u(), (double)this.p().v(), (double)this.p().w()) > 64.0;
   }

   public static void a(cqb $$0, gw $$1, dfd $$2, deh $$3) {
      UUID $$4 = $$3.v();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(deh $$0, cqb $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }
}
