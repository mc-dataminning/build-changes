import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dim extends dhd {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private din e = this.g();
   private din f = this.g();
   private boolean g;

   public dim(hx $$0, djp $$1) {
      this(dhf.h, $$0, $$1);
   }

   public dim(dhf $$0, hx $$1, djp $$2) {
      super($$0, $$1, $$2);
   }

   protected din g() {
      return new din();
   }

   public boolean a(cfq $$0) {
      if (this.r().b() instanceof ddx $$1) {
         emc $$2 = $$1.h(this.r());
         double $$3 = $$0.dq() - ((double)this.aE_().u() + $$2.c);
         double $$4 = $$0.dw() - ((double)this.aE_().w() + $$2.e);
         float $$5 = $$1.g(this.r());
         float $$6 = (float)(aup.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return aup.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public din a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public din k() {
      return this.e;
   }

   public din l() {
      return this.f;
   }

   public int c() {
      return 10;
   }

   public int d() {
      return 90;
   }

   @Override
   protected void b(so $$0) {
      super.b($$0);
      din.a.encodeStart(tc.a, this.e).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("front_text", $$1));
      din.a.encodeStart(tc.a, this.f).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("back_text", $$1));
      $$0.a("is_waxed", this.g);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.e("front_text")) {
         din.a.parse(tc.a, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         din.a.parse(tc.a, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private din a(din $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         vg $$2 = this.a($$0.a($$1, false));
         vg $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private vg a(vg $$0) {
      if (this.o instanceof ane $$1) {
         try {
            return vj.a(a(null, $$1, this.p), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(cfq $$0, boolean $$1, List<anv> $$2) {
      if (!this.x() && $$0.cw().equals(this.w()) && this.o != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.o.a(this.aE_(), this.r(), this.r(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.ad().getString());
      }
   }

   public boolean a(UnaryOperator<din> $$0, boolean $$1) {
      din $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private din a(cfq $$0, List<anv> $$1, din $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         anv $$4 = $$1.get($$3);
         wd $$5 = $$2.a($$3, $$0.Y()).a();
         if ($$0.Y()) {
            $$2 = $$2.a($$3, vg.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, vg.b($$4.d()).b($$5), vg.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(din $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(din $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.y();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(din $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.y();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, cfq $$1) {
      return this.x() && this.a($$0).b($$1);
   }

   public boolean a(cfq $$0, ctx $$1, hx $$2, boolean $$3) {
      boolean $$4 = false;

      for (vg $$5 : this.a($$3).b($$0.Y())) {
         wd $$6 = $$5.a();
         ve $$7 = $$6.h();
         if ($$7 != null && $$7.a() == ve.a.c) {
            $$0.cL().aE().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static ds a(@Nullable cfq $$0, ctx $$1, hx $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.ad().getString();
      vg $$4 = (vg)($$0 == null ? vg.b("Sign") : $$0.Q_());
      return new ds(dr.a, emc.b($$2), emb.a, (ane)$$1, 2, $$3, $$4, $$1.o(), $$0);
   }

   public zi m() {
      return zi.a(this);
   }

   @Override
   public so aA_() {
      return this.q();
   }

   @Override
   public boolean u() {
      return true;
   }

   public void a(@Nullable UUID $$0) {
      this.d = $$0;
   }

   @Nullable
   public UUID w() {
      return this.d;
   }

   private void y() {
      this.e();
      this.o.a(this.aE_(), this.r(), this.r(), 3);
   }

   public boolean x() {
      return this.g;
   }

   public boolean b(boolean $$0) {
      if (this.g != $$0) {
         this.g = $$0;
         this.y();
         return true;
      } else {
         return false;
      }
   }

   public boolean b(UUID $$0) {
      cfq $$1 = this.o.b($$0);
      return $$1 == null || $$1.i((double)this.aE_().u(), (double)this.aE_().v(), (double)this.aE_().w()) > 64.0;
   }

   public static void a(ctx $$0, hx $$1, djp $$2, dim $$3) {
      UUID $$4 = $$3.w();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dim $$0, ctx $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public ars f() {
      return art.Bf;
   }
}
