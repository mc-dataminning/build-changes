import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dth extends drv {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private dti e = this.f();
   private dti f = this.f();
   private boolean g;

   public dth(jf $$0, dus $$1) {
      this(drx.h, $$0, $$1);
   }

   public dth(drx $$0, jf $$1, dus $$2) {
      super($$0, $$1, $$2);
   }

   protected dti f() {
      return new dti();
   }

   public boolean a(cnx $$0) {
      if (this.m().b() instanceof don $$1) {
         eyw $$2 = $$1.o(this.m());
         double $$3 = $$0.dx() - ((double)this.aC_().u() + $$2.d);
         double $$4 = $$0.dD() - ((double)this.aC_().w() + $$2.f);
         float $$5 = $$1.h(this.m());
         float $$6 = (float)(azf.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return azf.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dti a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public dti j() {
      return this.e;
   }

   public dti k() {
      return this.f;
   }

   public int b() {
      return 10;
   }

   public int c() {
      return 90;
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      DynamicOps<vd> $$2 = $$1.a(uu.a);
      dti.a.encodeStart($$2, this.e).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("front_text", $$1x));
      dti.a.encodeStart($$2, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("back_text", $$1x));
      $$0.a("is_waxed", this.g);
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      DynamicOps<vd> $$2 = $$1.a(uu.a);
      if ($$0.e("front_text")) {
         dti.a.parse($$2, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         dti.a.parse($$2, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private dti a(dti $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         xe $$2 = this.a($$0.a($$1, false));
         xe $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private xe a(xe $$0) {
      if (this.o instanceof arj $$1) {
         try {
            return xh.a(a(null, $$1, this.p), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(cnx $$0, boolean $$1, List<asb> $$2) {
      if (!this.v() && $$0.cD().equals(this.u()) && this.o != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.o.a(this.aC_(), this.m(), this.m(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.aj().getString());
      }
   }

   public boolean a(UnaryOperator<dti> $$0, boolean $$1) {
      dti $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dti a(cnx $$0, List<asb> $$1, dti $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         asb $$4 = $$1.get($$3);
         yb $$5 = $$2.a($$3, $$0.ab()).a();
         if ($$0.ab()) {
            $$2 = $$2.a($$3, xe.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, xe.b($$4.d()).b($$5), xe.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dti $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dti $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dti $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, cnx $$1) {
      return this.v() && this.a($$0).b($$1);
   }

   public boolean a(cnx $$0, dej $$1, jf $$2, boolean $$3) {
      boolean $$4 = false;

      for (xe $$5 : this.a($$3).b($$0.ab())) {
         yb $$6 = $$5.a();
         xc $$7 = $$6.h();
         if ($$7 != null && $$7.a() == xc.a.c) {
            $$0.cS().aG().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static eu a(@Nullable cnx $$0, dej $$1, jf $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.aj().getString();
      xe $$4 = (xe)($$0 == null ? xe.b("Sign") : $$0.R_());
      return new eu(et.a, eyw.b($$2), eyv.a, (arj)$$1, 2, $$3, $$4, $$1.o(), $$0);
   }

   public ach t() {
      return ach.a(this);
   }

   @Override
   public ug a(jq.a $$0) {
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
      this.o.a(this.aC_(), this.m(), this.m(), 3);
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
      cnx $$1 = this.o.b($$0);
      return $$1 == null || !$$1.a(this.aC_(), 4.0);
   }

   public static void a(dej $$0, jf $$1, dus $$2, dth $$3) {
      UUID $$4 = $$3.u();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dth $$0, dej $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public awf d() {
      return awg.Ch;
   }
}
