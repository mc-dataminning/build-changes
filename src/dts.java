import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dts extends dsg {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private dtt e = this.f();
   private dtt f = this.f();
   private boolean g;

   public dts(jg $$0, dvd $$1) {
      this(dsi.h, $$0, $$1);
   }

   public dts(dsi $$0, jg $$1, dvd $$2) {
      super($$0, $$1, $$2);
   }

   protected dtt f() {
      return new dtt();
   }

   public boolean a(coh $$0) {
      if (this.m().b() instanceof doy $$1) {
         ezh $$2 = $$1.o(this.m());
         double $$3 = $$0.dC() - ((double)this.aC_().u() + $$2.d);
         double $$4 = $$0.dI() - ((double)this.aC_().w() + $$2.f);
         float $$5 = $$1.h(this.m());
         float $$6 = (float)(azj.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return azj.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dtt a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public dtt j() {
      return this.e;
   }

   public dtt k() {
      return this.f;
   }

   public int b() {
      return 10;
   }

   public int c() {
      return 90;
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
      super.b($$0, $$1);
      DynamicOps<vg> $$2 = $$1.a(ux.a);
      dtt.a.encodeStart($$2, this.e).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("front_text", $$1x));
      dtt.a.encodeStart($$2, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("back_text", $$1x));
      $$0.a("is_waxed", this.g);
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      DynamicOps<vg> $$2 = $$1.a(ux.a);
      if ($$0.e("front_text")) {
         dtt.a.parse($$2, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         dtt.a.parse($$2, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private dtt a(dtt $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         xh $$2 = this.a($$0.a($$1, false));
         xh $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private xh a(xh $$0) {
      if (this.o instanceof arm $$1) {
         try {
            return xk.a(a(null, $$1, this.p), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(coh $$0, boolean $$1, List<asf> $$2) {
      if (!this.v() && $$0.cH().equals(this.u()) && this.o != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.o.a(this.aC_(), this.m(), this.m(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.al().getString());
      }
   }

   public boolean a(UnaryOperator<dtt> $$0, boolean $$1) {
      dtt $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dtt a(coh $$0, List<asf> $$1, dtt $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         asf $$4 = $$1.get($$3);
         ye $$5 = $$2.a($$3, $$0.ab()).a();
         if ($$0.ab()) {
            $$2 = $$2.a($$3, xh.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, xh.b($$4.d()).b($$5), xh.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dtt $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dtt $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dtt $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, coh $$1) {
      return this.v() && this.a($$0).b($$1);
   }

   public boolean a(coh $$0, dev $$1, jg $$2, boolean $$3) {
      boolean $$4 = false;

      for (xh $$5 : this.a($$3).b($$0.ab())) {
         ye $$6 = $$5.a();
         xf $$7 = $$6.h();
         if ($$7 != null && $$7.a() == xf.a.c) {
            $$0.cW().aG().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static ev a(@Nullable coh $$0, dev $$1, jg $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.al().getString();
      xh $$4 = (xh)($$0 == null ? xh.b("Sign") : $$0.S_());
      return new ev(eu.a, ezh.b($$2), ezg.a, (arm)$$1, 2, $$3, $$4, $$1.o(), $$0);
   }

   public ack t() {
      return ack.a(this);
   }

   @Override
   public uj a(jr.a $$0) {
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
      coh $$1 = this.o.b($$0);
      return $$1 == null || !$$1.a(this.aC_(), 4.0);
   }

   public static void a(dev $$0, jg $$1, dvd $$2, dts $$3) {
      UUID $$4 = $$3.u();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dts $$0, dev $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public awj d() {
      return awk.Cf;
   }
}
