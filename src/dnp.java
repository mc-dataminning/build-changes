import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dnp extends dmf {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private dnq e = this.f();
   private dnq f = this.f();
   private boolean g;

   public dnp(ib $$0, doz $$1) {
      this(dmh.h, $$0, $$1);
   }

   public dnp(dmh $$0, ib $$1, doz $$2) {
      super($$0, $$1, $$2);
   }

   protected dnq f() {
      return new dnq();
   }

   public boolean a(cjt $$0) {
      if (this.n().b() instanceof dix $$1) {
         esa $$2 = $$1.m(this.n());
         double $$3 = $$0.dr() - ((double)this.aA_().u() + $$2.c);
         double $$4 = $$0.dx() - ((double)this.aA_().w() + $$2.e);
         float $$5 = $$1.g(this.n());
         float $$6 = (float)(axk.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return axk.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dnq a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public dnq j() {
      return this.e;
   }

   public dnq k() {
      return this.f;
   }

   public int b() {
      return 10;
   }

   public int c() {
      return 90;
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      DynamicOps<uj> $$2 = $$1.a(ua.a);
      dnq.a.encodeStart($$2, this.e).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("front_text", $$1x));
      dnq.a.encodeStart($$2, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("back_text", $$1x));
      $$0.a("is_waxed", this.g);
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      DynamicOps<uj> $$2 = $$1.a(ua.a);
      if ($$0.e("front_text")) {
         dnq.a.parse($$2, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         dnq.a.parse($$2, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private dnq a(dnq $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         wg $$2 = this.a($$0.a($$1, false));
         wg $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private wg a(wg $$0) {
      if (this.o instanceof aps $$1) {
         try {
            return wj.a(a(null, $$1, this.p), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(cjt $$0, boolean $$1, List<aqk> $$2) {
      if (!this.u() && $$0.cw().equals(this.t()) && this.o != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.o.a(this.aA_(), this.n(), this.n(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.ad().getString());
      }
   }

   public boolean a(UnaryOperator<dnq> $$0, boolean $$1) {
      dnq $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dnq a(cjt $$0, List<aqk> $$1, dnq $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         aqk $$4 = $$1.get($$3);
         xd $$5 = $$2.a($$3, $$0.Y()).a();
         if ($$0.Y()) {
            $$2 = $$2.a($$3, wg.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, wg.b($$4.d()).b($$5), wg.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dnq $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dnq $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.v();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dnq $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.v();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, cjt $$1) {
      return this.u() && this.a($$0).b($$1);
   }

   public boolean a(cjt $$0, cyx $$1, ib $$2, boolean $$3) {
      boolean $$4 = false;

      for (wg $$5 : this.a($$3).b($$0.Y())) {
         xd $$6 = $$5.a();
         we $$7 = $$6.h();
         if ($$7 != null && $$7.a() == we.a.c) {
            $$0.cL().aH().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static du a(@Nullable cjt $$0, cyx $$1, ib $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.ad().getString();
      wg $$4 = (wg)($$0 == null ? wg.b("Sign") : $$0.O_());
      return new du(dt.a, esa.b($$2), erz.a, (aps)$$1, 2, $$3, $$4, $$1.o(), $$0);
   }

   public abf l() {
      return abf.a(this);
   }

   @Override
   public tm a(in.a $$0) {
      return this.d($$0);
   }

   @Override
   public boolean q() {
      return true;
   }

   public void a(@Nullable UUID $$0) {
      this.d = $$0;
   }

   @Nullable
   public UUID t() {
      return this.d;
   }

   private void v() {
      this.e();
      this.o.a(this.aA_(), this.n(), this.n(), 3);
   }

   public boolean u() {
      return this.g;
   }

   public boolean b(boolean $$0) {
      if (this.g != $$0) {
         this.g = $$0;
         this.v();
         return true;
      } else {
         return false;
      }
   }

   public boolean b(UUID $$0) {
      cjt $$1 = this.o.b($$0);
      return $$1 == null || $$1.i((double)this.aA_().u(), (double)this.aA_().v(), (double)this.aA_().w()) > 64.0;
   }

   public static void a(cyx $$0, ib $$1, doz $$2, dnp $$3) {
      UUID $$4 = $$3.t();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dnp $$0, cyx $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public aul d() {
      return aum.BE;
   }
}
