import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dow extends dnm {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private dox e = this.f();
   private dox f = this.f();
   private boolean g;

   public dow(in $$0, dqh $$1) {
      this(dno.h, $$0, $$1);
   }

   public dow(dno $$0, in $$1, dqh $$2) {
      super($$0, $$1, $$2);
   }

   protected dox f() {
      return new dox();
   }

   public boolean a(clh $$0) {
      if (this.n().b() instanceof dke $$1) {
         etp $$2 = $$1.m(this.n());
         double $$3 = $$0.ds() - ((double)this.az_().u() + $$2.c);
         double $$4 = $$0.dy() - ((double)this.az_().w() + $$2.e);
         float $$5 = $$1.g(this.n());
         float $$6 = (float)(axz.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return axz.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dox a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public dox j() {
      return this.e;
   }

   public dox k() {
      return this.f;
   }

   public int b() {
      return 10;
   }

   public int c() {
      return 90;
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      DynamicOps<ux> $$2 = $$1.a(uo.a);
      dox.a.encodeStart($$2, this.e).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("front_text", $$1x));
      dox.a.encodeStart($$2, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("back_text", $$1x));
      $$0.a("is_waxed", this.g);
   }

   @Override
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      DynamicOps<ux> $$2 = $$1.a(uo.a);
      if ($$0.e("front_text")) {
         dox.a.parse($$2, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         dox.a.parse($$2, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private dox a(dox $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         wu $$2 = this.a($$0.a($$1, false));
         wu $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private wu a(wu $$0) {
      if (this.n instanceof aqh $$1) {
         try {
            return wx.a(a(null, $$1, this.o), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(clh $$0, boolean $$1, List<aqz> $$2) {
      if (!this.u() && $$0.cx().equals(this.t()) && this.n != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.n.a(this.az_(), this.n(), this.n(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.ad().getString());
      }
   }

   public boolean a(UnaryOperator<dox> $$0, boolean $$1) {
      dox $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dox a(clh $$0, List<aqz> $$1, dox $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         aqz $$4 = $$1.get($$3);
         xr $$5 = $$2.a($$3, $$0.Y()).a();
         if ($$0.Y()) {
            $$2 = $$2.a($$3, wu.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, wu.b($$4.d()).b($$5), wu.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dox $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dox $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.v();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dox $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.v();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, clh $$1) {
      return this.u() && this.a($$0).b($$1);
   }

   public boolean a(clh $$0, dad $$1, in $$2, boolean $$3) {
      boolean $$4 = false;

      for (wu $$5 : this.a($$3).b($$0.Y())) {
         xr $$6 = $$5.a();
         ws $$7 = $$6.h();
         if ($$7 != null && $$7.a() == ws.a.c) {
            $$0.cM().aH().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static ed a(@Nullable clh $$0, dad $$1, in $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.ad().getString();
      wu $$4 = (wu)($$0 == null ? wu.b("Sign") : $$0.O_());
      return new ed(ec.a, etp.b($$2), eto.a, (aqh)$$1, 2, $$3, $$4, $$1.o(), $$0);
   }

   public abt l() {
      return abt.a(this);
   }

   @Override
   public ua a(iy.a $$0) {
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
      clh $$1 = this.n.b($$0);
      return $$1 == null || $$1.i((double)this.az_().u(), (double)this.az_().v(), (double)this.az_().w()) > 64.0;
   }

   public static void a(dad $$0, in $$1, dqh $$2, dow $$3) {
      UUID $$4 = $$3.t();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dow $$0, dad $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public avb d() {
      return avc.BM;
   }
}
