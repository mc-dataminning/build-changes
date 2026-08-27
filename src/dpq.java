import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpq extends dog {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private dpr e = this.f();
   private dpr f = this.f();
   private boolean g;

   public dpq(io $$0, drb $$1) {
      this(doi.h, $$0, $$1);
   }

   public dpq(doi $$0, io $$1, drb $$2) {
      super($$0, $$1, $$2);
   }

   protected dpr f() {
      return new dpr();
   }

   public boolean a(clw $$0) {
      if (this.n().b() instanceof dky $$1) {
         euk $$2 = $$1.m(this.n());
         double $$3 = $$0.du() - ((double)this.az_().u() + $$2.c);
         double $$4 = $$0.dA() - ((double)this.az_().w() + $$2.e);
         float $$5 = $$1.g(this.n());
         float $$6 = (float)(ayd.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return ayd.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dpr a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public dpr j() {
      return this.e;
   }

   public dpr k() {
      return this.f;
   }

   public int b() {
      return 10;
   }

   public int c() {
      return 90;
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      DynamicOps<va> $$2 = $$1.a(ur.a);
      dpr.a.encodeStart($$2, this.e).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("front_text", $$1x));
      dpr.a.encodeStart($$2, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("back_text", $$1x));
      $$0.a("is_waxed", this.g);
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      DynamicOps<va> $$2 = $$1.a(ur.a);
      if ($$0.e("front_text")) {
         dpr.a.parse($$2, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         dpr.a.parse($$2, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private dpr a(dpr $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         wx $$2 = this.a($$0.a($$1, false));
         wx $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private wx a(wx $$0) {
      if (this.n instanceof aqm $$1) {
         try {
            return xa.a(a(null, $$1, this.o), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(clw $$0, boolean $$1, List<are> $$2) {
      if (!this.v() && $$0.cz().equals(this.u()) && this.n != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.n.a(this.az_(), this.n(), this.n(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.af().getString());
      }
   }

   public boolean a(UnaryOperator<dpr> $$0, boolean $$1) {
      dpr $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dpr a(clw $$0, List<are> $$1, dpr $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         are $$4 = $$1.get($$3);
         xu $$5 = $$2.a($$3, $$0.Y()).a();
         if ($$0.Y()) {
            $$2 = $$2.a($$3, wx.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, wx.b($$4.d()).b($$5), wx.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dpr $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dpr $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dpr $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, clw $$1) {
      return this.v() && this.a($$0).b($$1);
   }

   public boolean a(clw $$0, dax $$1, io $$2, boolean $$3) {
      boolean $$4 = false;

      for (wx $$5 : this.a($$3).b($$0.Y())) {
         xu $$6 = $$5.a();
         wv $$7 = $$6.h();
         if ($$7 != null && $$7.a() == wv.a.c) {
            $$0.cO().aH().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static ee a(@Nullable clw $$0, dax $$1, io $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.af().getString();
      wx $$4 = (wx)($$0 == null ? wx.b("Sign") : $$0.O_());
      return new ee(ed.a, euk.b($$2), euj.a, (aqm)$$1, 2, $$3, $$4, $$1.o(), $$0);
   }

   public abx l() {
      return abx.a(this);
   }

   @Override
   public ud a(iz.a $$0) {
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
      this.n.a(this.az_(), this.n(), this.n(), 3);
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
      clw $$1 = this.n.b($$0);
      return $$1 == null || $$1.i((double)this.az_().u(), (double)this.az_().v(), (double)this.az_().w()) > 64.0;
   }

   public static void a(dax $$0, io $$1, drb $$2, dpq $$3) {
      UUID $$4 = $$3.u();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dpq $$0, dax $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public avg d() {
      return avh.BX;
   }
}
