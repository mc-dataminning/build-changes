import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dte extends drs {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private dtf e = this.f();
   private dtf f = this.f();
   private boolean g;

   public dte(je $$0, duo $$1) {
      this(dru.h, $$0, $$1);
   }

   public dte(dru $$0, je $$1, duo $$2) {
      super($$0, $$1, $$2);
   }

   protected dtf f() {
      return new dtf();
   }

   public boolean a(cnu $$0) {
      if (this.m().b() instanceof dok $$1) {
         eys $$2 = $$1.o(this.m());
         double $$3 = $$0.dx() - ((double)this.aB_().u() + $$2.d);
         double $$4 = $$0.dD() - ((double)this.aB_().w() + $$2.f);
         float $$5 = $$1.h(this.m());
         float $$6 = (float)(azd.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return azd.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dtf a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public dtf j() {
      return this.e;
   }

   public dtf k() {
      return this.f;
   }

   public int b() {
      return 10;
   }

   public int c() {
      return 90;
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      DynamicOps<vc> $$2 = $$1.a(ut.a);
      dtf.a.encodeStart($$2, this.e).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("front_text", $$1x));
      dtf.a.encodeStart($$2, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("back_text", $$1x));
      $$0.a("is_waxed", this.g);
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      DynamicOps<vc> $$2 = $$1.a(ut.a);
      if ($$0.e("front_text")) {
         dtf.a.parse($$2, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         dtf.a.parse($$2, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private dtf a(dtf $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         xd $$2 = this.a($$0.a($$1, false));
         xd $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private xd a(xd $$0) {
      if (this.o instanceof arh $$1) {
         try {
            return xg.a(a(null, $$1, this.p), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(cnu $$0, boolean $$1, List<arz> $$2) {
      if (!this.v() && $$0.cD().equals(this.u()) && this.o != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.o.a(this.aB_(), this.m(), this.m(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.aj().getString());
      }
   }

   public boolean a(UnaryOperator<dtf> $$0, boolean $$1) {
      dtf $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dtf a(cnu $$0, List<arz> $$1, dtf $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         arz $$4 = $$1.get($$3);
         ya $$5 = $$2.a($$3, $$0.ab()).a();
         if ($$0.ab()) {
            $$2 = $$2.a($$3, xd.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, xd.b($$4.d()).b($$5), xd.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dtf $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dtf $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dtf $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, cnu $$1) {
      return this.v() && this.a($$0).b($$1);
   }

   public boolean a(cnu $$0, deg $$1, je $$2, boolean $$3) {
      boolean $$4 = false;

      for (xd $$5 : this.a($$3).b($$0.ab())) {
         ya $$6 = $$5.a();
         xb $$7 = $$6.h();
         if ($$7 != null && $$7.a() == xb.a.c) {
            $$0.cS().aG().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static et a(@Nullable cnu $$0, deg $$1, je $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.aj().getString();
      xd $$4 = (xd)($$0 == null ? xd.b("Sign") : $$0.Q_());
      return new et(es.a, eys.b($$2), eyr.a, (arh)$$1, 2, $$3, $$4, $$1.o(), $$0);
   }

   public acg t() {
      return acg.a(this);
   }

   @Override
   public uf a(jp.a $$0) {
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
      cnu $$1 = this.o.b($$0);
      return $$1 == null || !$$1.a(this.aB_(), 4.0);
   }

   public static void a(deg $$0, je $$1, duo $$2, dte $$3) {
      UUID $$4 = $$3.u();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dte $$0, deg $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public awd d() {
      return awe.Ch;
   }
}
