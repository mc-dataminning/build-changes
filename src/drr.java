import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drr extends dqc {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private drs e = this.f();
   private drs f = this.f();
   private boolean g;

   public drr(ir $$0, dtc $$1) {
      this(dqe.i, $$0, $$1);
   }

   public drr(dqe $$0, ir $$1, dtc $$2) {
      super($$0, $$1, $$2);
   }

   protected drs f() {
      return new drs();
   }

   public boolean a(cly $$0) {
      if (this.n().b() instanceof dmq $$1) {
         ewu $$2 = $$1.m(this.n());
         double $$3 = $$0.dz() - ((double)this.az_().u() + $$2.c);
         double $$4 = $$0.dF() - ((double)this.az_().w() + $$2.e);
         float $$5 = $$1.g(this.n());
         float $$6 = (float)(aym.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return aym.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public drs a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public drs j() {
      return this.e;
   }

   public drs k() {
      return this.f;
   }

   public int b() {
      return 10;
   }

   public int c() {
      return 90;
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      DynamicOps<vh> $$2 = $$1.a(uy.a);
      drs.a.encodeStart($$2, this.e).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("front_text", $$1x));
      drs.a.encodeStart($$2, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("back_text", $$1x));
      $$0.a("is_waxed", this.g);
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      DynamicOps<vh> $$2 = $$1.a(uy.a);
      if ($$0.e("front_text")) {
         drs.a.parse($$2, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         drs.a.parse($$2, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private drs a(drs $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         xe $$2 = this.a($$0.a($$1, false));
         xe $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private xe a(xe $$0) {
      if (this.n instanceof aqt $$1) {
         try {
            return xh.a(a(null, $$1, this.o), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(cly $$0, boolean $$1, List<arl> $$2) {
      if (!this.u() && $$0.cE().equals(this.t()) && this.n != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.n.a(this.az_(), this.n(), this.n(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.af().getString());
      }
   }

   public boolean a(UnaryOperator<drs> $$0, boolean $$1) {
      drs $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private drs a(cly $$0, List<arl> $$1, drs $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         arl $$4 = $$1.get($$3);
         yb $$5 = $$2.a($$3, $$0.aa()).a();
         if ($$0.aa()) {
            $$2 = $$2.a($$3, xe.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, xe.b($$4.d()).b($$5), xe.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(drs $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(drs $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.v();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(drs $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.v();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, cly $$1) {
      return this.u() && this.a($$0).b($$1);
   }

   public boolean a(cly $$0, dca $$1, ir $$2, boolean $$3) {
      boolean $$4 = false;

      for (xe $$5 : this.a($$3).b($$0.aa())) {
         yb $$6 = $$5.a();
         xc $$7 = $$6.h();
         if ($$7 != null && $$7.a() == xc.a.c) {
            $$0.cT().aH().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static eh a(@Nullable cly $$0, dca $$1, ir $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.af().getString();
      xe $$4 = (xe)($$0 == null ? xe.b("Sign") : $$0.P_());
      return new eh(eg.a, ewu.b($$2), ewt.a, (aqt)$$1, 2, $$3, $$4, $$1.o(), $$0);
   }

   public ace l() {
      return ace.a(this);
   }

   @Override
   public uk a(jc.a $$0) {
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
      this.n.a(this.az_(), this.n(), this.n(), 3);
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
      cly $$1 = this.n.c($$0);
      return $$1 == null || $$1.i((double)this.az_().u(), (double)this.az_().v(), (double)this.az_().w()) > 64.0;
   }

   public static void a(dca $$0, ir $$1, dtc $$2, drr $$3) {
      UUID $$4 = $$3.t();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(drr $$0, dca $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public avn d() {
      return avo.Cv;
   }
}
