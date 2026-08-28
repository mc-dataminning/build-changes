import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dty extends dsm {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private dtz e = this.f();
   private dtz f = this.f();
   private boolean g;

   public dty(jh $$0, dvj $$1) {
      this(dso.h, $$0, $$1);
   }

   public dty(dso $$0, jh $$1, dvj $$2) {
      super($$0, $$1, $$2);
   }

   protected dtz f() {
      return new dtz();
   }

   public boolean a(com $$0) {
      if (this.m().b() instanceof dpe $$1) {
         ezn $$2 = $$1.o(this.m());
         double $$3 = $$0.dC() - ((double)this.aB_().u() + $$2.d);
         double $$4 = $$0.dI() - ((double)this.aB_().w() + $$2.f);
         float $$5 = $$1.h(this.m());
         float $$6 = (float)(azk.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return azk.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dtz a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public dtz j() {
      return this.e;
   }

   public dtz k() {
      return this.f;
   }

   public int b() {
      return 10;
   }

   public int c() {
      return 90;
   }

   @Override
   protected void b(uk $$0, js.a $$1) {
      super.b($$0, $$1);
      DynamicOps<vh> $$2 = $$1.a(uy.a);
      dtz.a.encodeStart($$2, this.e).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("front_text", $$1x));
      dtz.a.encodeStart($$2, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("back_text", $$1x));
      $$0.a("is_waxed", this.g);
   }

   @Override
   protected void a(uk $$0, js.a $$1) {
      super.a($$0, $$1);
      DynamicOps<vh> $$2 = $$1.a(uy.a);
      if ($$0.e("front_text")) {
         dtz.a.parse($$2, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         dtz.a.parse($$2, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private dtz a(dtz $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         xi $$2 = this.a($$0.a($$1, false));
         xi $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private xi a(xi $$0) {
      if (this.o instanceof arn $$1) {
         try {
            return xl.a(a(null, $$1, this.p), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(com $$0, boolean $$1, List<asg> $$2) {
      if (!this.v() && $$0.cH().equals(this.u()) && this.o != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.o.a(this.aB_(), this.m(), this.m(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.am().getString());
      }
   }

   public boolean a(UnaryOperator<dtz> $$0, boolean $$1) {
      dtz $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dtz a(com $$0, List<asg> $$1, dtz $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         asg $$4 = $$1.get($$3);
         yf $$5 = $$2.a($$3, $$0.ab()).a();
         if ($$0.ab()) {
            $$2 = $$2.a($$3, xi.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, xi.b($$4.d()).b($$5), xi.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dtz $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dtz $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dtz $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, com $$1) {
      return this.v() && this.a($$0).b($$1);
   }

   public boolean a(com $$0, dfb $$1, jh $$2, boolean $$3) {
      boolean $$4 = false;

      for (xi $$5 : this.a($$3).b($$0.ab())) {
         yf $$6 = $$5.a();
         xg $$7 = $$6.h();
         if ($$7 != null && $$7.a() == xg.a.c) {
            $$0.cW().aG().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static ew a(@Nullable com $$0, dfb $$1, jh $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.am().getString();
      xi $$4 = (xi)($$0 == null ? xi.b("Sign") : $$0.S_());
      return new ew(ev.a, ezn.b($$2), ezm.a, (arn)$$1, 2, $$3, $$4, $$1.o(), $$0);
   }

   public acl t() {
      return acl.a(this);
   }

   @Override
   public uk a(js.a $$0) {
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
      com $$1 = this.o.b($$0);
      return $$1 == null || !$$1.a(this.aB_(), 4.0);
   }

   public static void a(dfb $$0, jh $$1, dvj $$2, dty $$3) {
      UUID $$4 = $$3.u();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dty $$0, dfb $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public awk d() {
      return awl.Cf;
   }
}
