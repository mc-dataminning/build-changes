import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dra extends dpp {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private drb e = this.f();
   private drb f = this.f();
   private boolean g;

   public dra(ja $$0, dsk $$1) {
      this(dpr.h, $$0, $$1);
   }

   public dra(dpr $$0, ja $$1, dsk $$2) {
      super($$0, $$1, $$2);
   }

   protected drb f() {
      return new drb();
   }

   public boolean a(cmk $$0) {
      if (this.n().b() instanceof dmh $$1) {
         ewf $$2 = $$1.m(this.n());
         double $$3 = $$0.dv() - ((double)this.az_().u() + $$2.c);
         double $$4 = $$0.dB() - ((double)this.az_().w() + $$2.e);
         float $$5 = $$1.g(this.n());
         float $$6 = (float)(ayg.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return ayg.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public drb a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public drb j() {
      return this.e;
   }

   public drb k() {
      return this.f;
   }

   public int b() {
      return 10;
   }

   public int c() {
      return 90;
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      DynamicOps<uu> $$2 = $$1.a(ul.a);
      drb.a.encodeStart($$2, this.e).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("front_text", $$1x));
      drb.a.encodeStart($$2, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("back_text", $$1x));
      $$0.a("is_waxed", this.g);
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      DynamicOps<uu> $$2 = $$1.a(ul.a);
      if ($$0.e("front_text")) {
         drb.a.parse($$2, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         drb.a.parse($$2, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private drb a(drb $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         wu $$2 = this.a($$0.a($$1, false));
         wu $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private wu a(wu $$0) {
      if (this.n instanceof aqm $$1) {
         try {
            return wx.a(a(null, $$1, this.o), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(cmk $$0, boolean $$1, List<are> $$2) {
      if (!this.v() && $$0.cA().equals(this.u()) && this.n != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.n.a(this.az_(), this.n(), this.n(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.ag().getString());
      }
   }

   public boolean a(UnaryOperator<drb> $$0, boolean $$1) {
      drb $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private drb a(cmk $$0, List<are> $$1, drb $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         are $$4 = $$1.get($$3);
         xr $$5 = $$2.a($$3, $$0.Y()).a();
         if ($$0.Y()) {
            $$2 = $$2.a($$3, wu.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, wu.b($$4.d()).b($$5), wu.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(drb $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(drb $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(drb $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, cmk $$1) {
      return this.v() && this.a($$0).b($$1);
   }

   public boolean a(cmk $$0, dcf $$1, ja $$2, boolean $$3) {
      boolean $$4 = false;

      for (wu $$5 : this.a($$3).b($$0.Y())) {
         xr $$6 = $$5.a();
         ws $$7 = $$6.h();
         if ($$7 != null && $$7.a() == ws.a.c) {
            $$0.cP().aI().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static eq a(@Nullable cmk $$0, dcf $$1, ja $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.ag().getString();
      wu $$4 = (wu)($$0 == null ? wu.b("Sign") : $$0.O_());
      return new eq(ep.a, ewf.b($$2), ewe.a, (aqm)$$1, 2, $$3, $$4, $$1.o(), $$0);
   }

   public abu l() {
      return abu.a(this);
   }

   @Override
   public tx a(jl.a $$0) {
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
      cmk $$1 = this.n.b($$0);
      return $$1 == null || !$$1.a(this.az_(), 4.0);
   }

   public static void a(dcf $$0, ja $$1, dsk $$2, dra $$3) {
      UUID $$4 = $$3.u();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dra $$0, dcf $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public avg d() {
      return avh.Ca;
   }
}
