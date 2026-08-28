import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dwc extends dup {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private dwd e = this.f();
   private dwd f = this.f();
   private boolean g;

   public dwc(jh $$0, dxn $$1) {
      this(dur.h, $$0, $$1);
   }

   public dwc(dur $$0, jh $$1, dxn $$2) {
      super($$0, $$1, $$2);
   }

   protected dwd f() {
      return new dwd();
   }

   public boolean a(cps $$0) {
      if (this.m().b() instanceof drh $$1) {
         fbs $$2 = $$1.o(this.m());
         double $$3 = $$0.dA() - ((double)this.aB_().u() + $$2.d);
         double $$4 = $$0.dG() - ((double)this.aB_().w() + $$2.f);
         float $$5 = $$1.h(this.m());
         float $$6 = (float)(bae.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return bae.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dwd a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public dwd j() {
      return this.e;
   }

   public dwd k() {
      return this.f;
   }

   public int b() {
      return 10;
   }

   public int c() {
      return 90;
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      DynamicOps<vu> $$2 = $$1.a(vl.a);
      dwd.a.encodeStart($$2, this.e).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("front_text", $$1x));
      dwd.a.encodeStart($$2, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("back_text", $$1x));
      $$0.a("is_waxed", this.g);
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      DynamicOps<vu> $$2 = $$1.a(vl.a);
      if ($$0.e("front_text")) {
         dwd.a.parse($$2, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         dwd.a.parse($$2, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private dwd a(dwd $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         xv $$2 = this.a($$0.a($$1, false));
         xv $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private xv a(xv $$0) {
      if (this.o instanceof ash $$1) {
         try {
            return xy.a(a(null, $$1, this.p), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(cps $$0, boolean $$1, List<ata> $$2) {
      if (!this.v() && $$0.cG().equals(this.u()) && this.o != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.o.a(this.aB_(), this.m(), this.m(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.al().getString());
      }
   }

   public boolean a(UnaryOperator<dwd> $$0, boolean $$1) {
      dwd $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dwd a(cps $$0, List<ata> $$1, dwd $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         ata $$4 = $$1.get($$3);
         ys $$5 = $$2.a($$3, $$0.aa()).a();
         if ($$0.aa()) {
            $$2 = $$2.a($$3, xv.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, xv.b($$4.d()).b($$5), xv.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dwd $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dwd $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dwd $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, cps $$1) {
      return this.v() && this.a($$0).b($$1);
   }

   public boolean a(cps $$0, dha $$1, jh $$2, boolean $$3) {
      boolean $$4 = false;

      for (xv $$5 : this.a($$3).b($$0.aa())) {
         ys $$6 = $$5.a();
         xt $$7 = $$6.h();
         if ($$7 != null && $$7.a() == xt.a.c) {
            $$0.cV().aG().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static ew a(@Nullable cps $$0, dha $$1, jh $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.al().getString();
      xv $$4 = (xv)($$0 == null ? xv.b("Sign") : $$0.p_());
      return new ew(ev.a, fbs.b($$2), fbr.a, (ash)$$1, 2, $$3, $$4, $$1.p(), $$0);
   }

   public acy t() {
      return acy.a(this);
   }

   @Override
   public ux a(js.a $$0) {
      return this.e($$0);
   }

   @Override
   public boolean p() {
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
      this.o.a(this.aB_(), this.m(), this.m(), 3);
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
      cps $$1 = this.o.b($$0);
      return $$1 == null || !$$1.a(this.aB_(), 4.0);
   }

   public static void a(dha $$0, jh $$1, dxn $$2, dwc $$3) {
      UUID $$4 = $$3.u();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dwc $$0, dha $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public axe d() {
      return axf.Cz;
   }
}
