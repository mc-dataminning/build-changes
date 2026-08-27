import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dps extends doi {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private dpt e = this.f();
   private dpt f = this.f();
   private boolean g;

   public dps(io $$0, drd $$1) {
      this(dok.h, $$0, $$1);
   }

   public dps(dok $$0, io $$1, drd $$2) {
      super($$0, $$1, $$2);
   }

   protected dpt f() {
      return new dpt();
   }

   public boolean a(cly $$0) {
      if (this.n().b() instanceof dla $$1) {
         eum $$2 = $$1.m(this.n());
         double $$3 = $$0.du() - ((double)this.aA_().u() + $$2.c);
         double $$4 = $$0.dA() - ((double)this.aA_().w() + $$2.e);
         float $$5 = $$1.g(this.n());
         float $$6 = (float)(ayf.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return ayf.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dpt a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public dpt j() {
      return this.e;
   }

   public dpt k() {
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
      dpt.a.encodeStart($$2, this.e).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("front_text", $$1x));
      dpt.a.encodeStart($$2, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("back_text", $$1x));
      $$0.a("is_waxed", this.g);
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      DynamicOps<va> $$2 = $$1.a(ur.a);
      if ($$0.e("front_text")) {
         dpt.a.parse($$2, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         dpt.a.parse($$2, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private dpt a(dpt $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         wx $$2 = this.a($$0.a($$1, false));
         wx $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private wx a(wx $$0) {
      if (this.n instanceof aqn $$1) {
         try {
            return xa.a(a(null, $$1, this.o), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(cly $$0, boolean $$1, List<arf> $$2) {
      if (!this.v() && $$0.cz().equals(this.u()) && this.n != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.n.a(this.aA_(), this.n(), this.n(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.af().getString());
      }
   }

   public boolean a(UnaryOperator<dpt> $$0, boolean $$1) {
      dpt $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dpt a(cly $$0, List<arf> $$1, dpt $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         arf $$4 = $$1.get($$3);
         xu $$5 = $$2.a($$3, $$0.Y()).a();
         if ($$0.Y()) {
            $$2 = $$2.a($$3, wx.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, wx.b($$4.d()).b($$5), wx.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dpt $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dpt $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dpt $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, cly $$1) {
      return this.v() && this.a($$0).b($$1);
   }

   public boolean a(cly $$0, daz $$1, io $$2, boolean $$3) {
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

   private static ee a(@Nullable cly $$0, daz $$1, io $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.af().getString();
      wx $$4 = (wx)($$0 == null ? wx.b("Sign") : $$0.O_());
      return new ee(ed.a, eum.b($$2), eul.a, (aqn)$$1, 2, $$3, $$4, $$1.o(), $$0);
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
      this.n.a(this.aA_(), this.n(), this.n(), 3);
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
      cly $$1 = this.n.b($$0);
      return $$1 == null || !$$1.a(this.aA_(), 4.0);
   }

   public static void a(daz $$0, io $$1, drd $$2, dps $$3) {
      UUID $$4 = $$3.u();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dps $$0, daz $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public avh d() {
      return avi.BX;
   }
}
