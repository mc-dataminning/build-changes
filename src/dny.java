import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dny extends dmo {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private dnz e = this.f();
   private dnz f = this.f();
   private boolean g;

   public dny(id $$0, dpi $$1) {
      this(dmq.h, $$0, $$1);
   }

   public dny(dmq $$0, id $$1, dpi $$2) {
      super($$0, $$1, $$2);
   }

   protected dnz f() {
      return new dnz();
   }

   public boolean a(cka $$0) {
      if (this.n().b() instanceof djg $$1) {
         esj $$2 = $$1.m(this.n());
         double $$3 = $$0.dr() - ((double)this.az_().u() + $$2.c);
         double $$4 = $$0.dx() - ((double)this.az_().w() + $$2.e);
         float $$5 = $$1.g(this.n());
         float $$6 = (float)(axm.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return axm.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dnz a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public dnz j() {
      return this.e;
   }

   public dnz k() {
      return this.f;
   }

   public int b() {
      return 10;
   }

   public int c() {
      return 90;
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
      super.b($$0, $$1);
      DynamicOps<ul> $$2 = $$1.a(uc.a);
      dnz.a.encodeStart($$2, this.e).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("front_text", $$1x));
      dnz.a.encodeStart($$2, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("back_text", $$1x));
      $$0.a("is_waxed", this.g);
   }

   @Override
   public void a(to $$0, ip.a $$1) {
      super.a($$0, $$1);
      DynamicOps<ul> $$2 = $$1.a(uc.a);
      if ($$0.e("front_text")) {
         dnz.a.parse($$2, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         dnz.a.parse($$2, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private dnz a(dnz $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         wi $$2 = this.a($$0.a($$1, false));
         wi $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private wi a(wi $$0) {
      if (this.o instanceof apu $$1) {
         try {
            return wl.a(a(null, $$1, this.p), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(cka $$0, boolean $$1, List<aqm> $$2) {
      if (!this.u() && $$0.cw().equals(this.t()) && this.o != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.o.a(this.az_(), this.n(), this.n(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.ad().getString());
      }
   }

   public boolean a(UnaryOperator<dnz> $$0, boolean $$1) {
      dnz $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dnz a(cka $$0, List<aqm> $$1, dnz $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         aqm $$4 = $$1.get($$3);
         xf $$5 = $$2.a($$3, $$0.Y()).a();
         if ($$0.Y()) {
            $$2 = $$2.a($$3, wi.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, wi.b($$4.d()).b($$5), wi.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dnz $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dnz $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.v();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dnz $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.v();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, cka $$1) {
      return this.u() && this.a($$0).b($$1);
   }

   public boolean a(cka $$0, czg $$1, id $$2, boolean $$3) {
      boolean $$4 = false;

      for (wi $$5 : this.a($$3).b($$0.Y())) {
         xf $$6 = $$5.a();
         wg $$7 = $$6.h();
         if ($$7 != null && $$7.a() == wg.a.c) {
            $$0.cL().aH().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static dv a(@Nullable cka $$0, czg $$1, id $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.ad().getString();
      wi $$4 = (wi)($$0 == null ? wi.b("Sign") : $$0.O_());
      return new dv(du.a, esj.b($$2), esi.a, (apu)$$1, 2, $$3, $$4, $$1.o(), $$0);
   }

   public abh l() {
      return abh.a(this);
   }

   @Override
   public to a(ip.a $$0) {
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
      this.o.a(this.az_(), this.n(), this.n(), 3);
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
      cka $$1 = this.o.b($$0);
      return $$1 == null || $$1.i((double)this.az_().u(), (double)this.az_().v(), (double)this.az_().w()) > 64.0;
   }

   public static void a(czg $$0, id $$1, dpi $$2, dny $$3) {
      UUID $$4 = $$3.t();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dny $$0, czg $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public aun d() {
      return auo.BE;
   }
}
