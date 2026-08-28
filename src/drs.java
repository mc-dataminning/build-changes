import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drs extends dqh {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private drt e = this.f();
   private drt f = this.f();
   private boolean g;

   public drs(jd $$0, dtc $$1) {
      this(dqj.h, $$0, $$1);
   }

   public drs(dqj $$0, jd $$1, dtc $$2) {
      super($$0, $$1, $$2);
   }

   protected drt f() {
      return new drt();
   }

   public boolean a(cmx $$0) {
      if (this.n().b() instanceof dmz $$1) {
         exa $$2 = $$1.m(this.n());
         double $$3 = $$0.du() - ((double)this.aD_().u() + $$2.c);
         double $$4 = $$0.dA() - ((double)this.aD_().w() + $$2.e);
         float $$5 = $$1.g(this.n());
         float $$6 = (float)(ayo.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return ayo.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public drt a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public drt j() {
      return this.e;
   }

   public drt k() {
      return this.f;
   }

   public int b() {
      return 10;
   }

   public int c() {
      return 90;
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
      super.b($$0, $$1);
      DynamicOps<uy> $$2 = $$1.a(up.a);
      drt.a.encodeStart($$2, this.e).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("front_text", $$1x));
      drt.a.encodeStart($$2, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("back_text", $$1x));
      $$0.a("is_waxed", this.g);
   }

   @Override
   protected void a(ub $$0, jo.a $$1) {
      super.a($$0, $$1);
      DynamicOps<uy> $$2 = $$1.a(up.a);
      if ($$0.e("front_text")) {
         drt.a.parse($$2, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         drt.a.parse($$2, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private drt a(drt $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         wz $$2 = this.a($$0.a($$1, false));
         wz $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private wz a(wz $$0) {
      if (this.n instanceof aqu $$1) {
         try {
            return xc.a(a(null, $$1, this.o), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(cmx $$0, boolean $$1, List<arm> $$2) {
      if (!this.v() && $$0.cA().equals(this.u()) && this.n != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.n.a(this.aD_(), this.n(), this.n(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.ah().getString());
      }
   }

   public boolean a(UnaryOperator<drt> $$0, boolean $$1) {
      drt $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private drt a(cmx $$0, List<arm> $$1, drt $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         arm $$4 = $$1.get($$3);
         xw $$5 = $$2.a($$3, $$0.Z()).a();
         if ($$0.Z()) {
            $$2 = $$2.a($$3, wz.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, wz.b($$4.d()).b($$5), wz.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(drt $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(drt $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(drt $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, cmx $$1) {
      return this.v() && this.a($$0).b($$1);
   }

   public boolean a(cmx $$0, dcw $$1, jd $$2, boolean $$3) {
      boolean $$4 = false;

      for (wz $$5 : this.a($$3).b($$0.Z())) {
         xw $$6 = $$5.a();
         wx $$7 = $$6.h();
         if ($$7 != null && $$7.a() == wx.a.c) {
            $$0.cP().aH().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static et a(@Nullable cmx $$0, dcw $$1, jd $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.ah().getString();
      wz $$4 = (wz)($$0 == null ? wz.b("Sign") : $$0.S_());
      return new et(es.a, exa.b($$2), ewz.a, (aqu)$$1, 2, $$3, $$4, $$1.o(), $$0);
   }

   public acb l() {
      return acb.a(this);
   }

   @Override
   public ub a(jo.a $$0) {
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
      this.n.a(this.aD_(), this.n(), this.n(), 3);
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
      cmx $$1 = this.n.b($$0);
      return $$1 == null || !$$1.a(this.aD_(), 4.0);
   }

   public static void a(dcw $$0, jd $$1, dtc $$2, drs $$3) {
      UUID $$4 = $$3.u();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(drs $$0, dcw $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public avo d() {
      return avp.Cb;
   }
}
