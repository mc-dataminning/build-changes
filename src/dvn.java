import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dvn extends dua {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private dvo e = this.f();
   private dvo f = this.f();
   private boolean g;

   public dvn(ji $$0, dwy $$1) {
      this(duc.h, $$0, $$1);
   }

   public dvn(duc $$0, ji $$1, dwy $$2) {
      super($$0, $$1, $$2);
   }

   protected dvo f() {
      return new dvo();
   }

   public boolean a(coy $$0) {
      if (this.m().b() instanceof dqs $$1) {
         fbb $$2 = $$1.o(this.m());
         double $$3 = $$0.dA() - ((double)this.aA_().u() + $$2.d);
         double $$4 = $$0.dG() - ((double)this.aA_().w() + $$2.f);
         float $$5 = $$1.h(this.m());
         float $$6 = (float)(ayz.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return ayz.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dvo a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public dvo j() {
      return this.e;
   }

   public dvo k() {
      return this.f;
   }

   public int b() {
      return 10;
   }

   public int c() {
      return 90;
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      DynamicOps<un> $$2 = $$1.a(ue.a);
      dvo.a.encodeStart($$2, this.e).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("front_text", $$1x));
      dvo.a.encodeStart($$2, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("back_text", $$1x));
      $$0.a("is_waxed", this.g);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      DynamicOps<un> $$2 = $$1.a(ue.a);
      if ($$0.e("front_text")) {
         dvo.a.parse($$2, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         dvo.a.parse($$2, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private dvo a(dvo $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         wp $$2 = this.a($$0.a($$1, false));
         wp $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private wp a(wp $$0) {
      if (this.n instanceof ard $$1) {
         try {
            return ws.a(a(null, $$1, this.o), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(coy $$0, boolean $$1, List<arw> $$2) {
      if (!this.u() && $$0.cG().equals(this.t()) && this.n != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.n.a(this.aA_(), this.m(), this.m(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.al().getString());
      }
   }

   public boolean a(UnaryOperator<dvo> $$0, boolean $$1) {
      dvo $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dvo a(coy $$0, List<arw> $$1, dvo $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         arw $$4 = $$1.get($$3);
         xm $$5 = $$2.a($$3, $$0.aa()).a();
         if ($$0.aa()) {
            $$2 = $$2.a($$3, wp.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, wp.b($$4.d()).b($$5), wp.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dvo $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dvo $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.v();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dvo $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.v();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, coy $$1) {
      return this.u() && this.a($$0).b($$1);
   }

   public boolean a(coy $$0, dgj $$1, ji $$2, boolean $$3) {
      boolean $$4 = false;

      for (wp $$5 : this.a($$3).b($$0.aa())) {
         xm $$6 = $$5.a();
         wn $$7 = $$6.i();
         if ($$7 != null && $$7.a() == wn.a.c) {
            $$0.cV().aG().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static ex a(@Nullable coy $$0, dgj $$1, ji $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.al().getString();
      wp $$4 = (wp)($$0 == null ? wp.b("Sign") : $$0.p_());
      return new ex(ew.a, fbb.b($$2), fba.a, (ard)$$1, 2, $$3, $$4, $$1.p(), $$0);
   }

   public abs s() {
      return abs.a(this);
   }

   @Override
   public tq a(jt.a $$0) {
      return this.e($$0);
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
      this.n.a(this.aA_(), this.m(), this.m(), 3);
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
      coy $$1 = this.n.b($$0);
      return $$1 == null || !$$1.a(this.aA_(), 4.0);
   }

   public static void a(dgj $$0, ji $$1, dwy $$2, dvn $$3) {
      UUID $$4 = $$3.t();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dvn $$0, dgj $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public avz d() {
      return awa.CP;
   }
}
