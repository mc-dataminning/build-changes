import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dqs extends dpi {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private dqt e = this.f();
   private dqt f = this.f();
   private boolean g;

   public dqs(iz $$0, dsd $$1) {
      this(dpk.h, $$0, $$1);
   }

   public dqs(dpk $$0, iz $$1, dsd $$2) {
      super($$0, $$1, $$2);
   }

   protected dqt f() {
      return new dqt();
   }

   public boolean a(cmy $$0) {
      if (this.n().b() instanceof dma $$1) {
         evs $$2 = $$1.m(this.n());
         double $$3 = $$0.du() - ((double)this.ay_().u() + $$2.c);
         double $$4 = $$0.dA() - ((double)this.ay_().w() + $$2.e);
         float $$5 = $$1.g(this.n());
         float $$6 = (float)(ayz.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return ayz.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dqt a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public dqt j() {
      return this.e;
   }

   public dqt k() {
      return this.f;
   }

   public int b() {
      return 10;
   }

   public int c() {
      return 90;
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      DynamicOps<vp> $$2 = $$1.a(vg.a);
      dqt.a.encodeStart($$2, this.e).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("front_text", $$1x));
      dqt.a.encodeStart($$2, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("back_text", $$1x));
      $$0.a("is_waxed", this.g);
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      DynamicOps<vp> $$2 = $$1.a(vg.a);
      if ($$0.e("front_text")) {
         dqt.a.parse($$2, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         dqt.a.parse($$2, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private dqt a(dqt $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         xp $$2 = this.a($$0.a($$1, false));
         xp $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private xp a(xp $$0) {
      if (this.n instanceof arf $$1) {
         try {
            return xs.a(a(null, $$1, this.o), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(cmy $$0, boolean $$1, List<arx> $$2) {
      if (!this.v() && $$0.cz().equals(this.u()) && this.n != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.n.a(this.ay_(), this.n(), this.n(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.af().getString());
      }
   }

   public boolean a(UnaryOperator<dqt> $$0, boolean $$1) {
      dqt $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dqt a(cmy $$0, List<arx> $$1, dqt $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         arx $$4 = $$1.get($$3);
         ym $$5 = $$2.a($$3, $$0.Y()).a();
         if ($$0.Y()) {
            $$2 = $$2.a($$3, xp.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, xp.b($$4.d()).b($$5), xp.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dqt $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dqt $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dqt $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, cmy $$1) {
      return this.v() && this.a($$0).b($$1);
   }

   public boolean a(cmy $$0, dbz $$1, iz $$2, boolean $$3) {
      boolean $$4 = false;

      for (xp $$5 : this.a($$3).b($$0.Y())) {
         ym $$6 = $$5.a();
         xn $$7 = $$6.h();
         if ($$7 != null && $$7.a() == xn.a.c) {
            $$0.cO().aH().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static ep a(@Nullable cmy $$0, dbz $$1, iz $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.af().getString();
      xp $$4 = (xp)($$0 == null ? xp.b("Sign") : $$0.O_());
      return new ep(eo.a, evs.b($$2), evr.a, (arf)$$1, 2, $$3, $$4, $$1.o(), $$0);
   }

   public acp l() {
      return acp.a(this);
   }

   @Override
   public us a(jk.a $$0) {
      return this.e($$0);
   }

   @Override
   public boolean q() {
      return true;
   }

   public void a(@Nullable UUID $$0) {
      this.d = $$0;
   }

   @Nullable
   public UUID u() {
      return this.d;
   }

   private void w() {
      this.e();
      this.n.a(this.ay_(), this.n(), this.n(), 3);
   }

   public boolean v() {
      return this.g;
   }

   public boolean b(boolean $$0) {
      if (this.g != $$0) {
         this.g = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   public boolean b(UUID $$0) {
      cmy $$1 = this.n.b($$0);
      return $$1 == null || !$$1.a(this.ay_(), 4.0);
   }

   public static void a(dbz $$0, iz $$1, dsd $$2, dqs $$3) {
      UUID $$4 = $$3.u();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dqs $$0, dbz $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public avz d() {
      return awa.BX;
   }
}
