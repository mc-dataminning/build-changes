import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dlr extends dki {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private dls e = this.f();
   private dls f = this.f();
   private boolean g;

   public dlr(ib $$0, dnb $$1) {
      this(dkk.h, $$0, $$1);
   }

   public dlr(dkk $$0, ib $$1, dnb $$2) {
      super($$0, $$1, $$2);
   }

   protected dls f() {
      return new dls();
   }

   public boolean a(ciu $$0) {
      if (this.n().b() instanceof dhb $$1) {
         ept $$2 = $$1.m(this.n());
         double $$3 = $$0.dr() - ((double)this.aC_().u() + $$2.c);
         double $$4 = $$0.dx() - ((double)this.aC_().w() + $$2.e);
         float $$5 = $$1.g(this.n());
         float $$6 = (float)(aww.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return aww.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dls a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public dls j() {
      return this.e;
   }

   public dls k() {
      return this.f;
   }

   public int b() {
      return 10;
   }

   public int c() {
      return 90;
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      dls.a.encodeStart(to.a, this.e).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("front_text", $$1x));
      dls.a.encodeStart(to.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("back_text", $$1x));
      $$0.a("is_waxed", this.g);
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("front_text")) {
         dls.a.parse(to.a, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         dls.a.parse(to.a, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private dls a(dls $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         vu $$2 = this.a($$0.a($$1, false));
         vu $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private vu a(vu $$0) {
      if (this.o instanceof apf $$1) {
         try {
            return vx.a(a(null, $$1, this.p), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(ciu $$0, boolean $$1, List<apw> $$2) {
      if (!this.t() && $$0.cw().equals(this.s()) && this.o != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.o.a(this.aC_(), this.n(), this.n(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.ad().getString());
      }
   }

   public boolean a(UnaryOperator<dls> $$0, boolean $$1) {
      dls $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dls a(ciu $$0, List<apw> $$1, dls $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         apw $$4 = $$1.get($$3);
         wr $$5 = $$2.a($$3, $$0.Y()).a();
         if ($$0.Y()) {
            $$2 = $$2.a($$3, vu.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, vu.b($$4.d()).b($$5), vu.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dls $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dls $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.u();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dls $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.u();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, ciu $$1) {
      return this.t() && this.a($$0).b($$1);
   }

   public boolean a(ciu $$0, cxb $$1, ib $$2, boolean $$3) {
      boolean $$4 = false;

      for (vu $$5 : this.a($$3).b($$0.Y())) {
         wr $$6 = $$5.a();
         vs $$7 = $$6.h();
         if ($$7 != null && $$7.a() == vs.a.c) {
            $$0.cL().aH().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static du a(@Nullable ciu $$0, cxb $$1, ib $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.ad().getString();
      vu $$4 = (vu)($$0 == null ? vu.b("Sign") : $$0.O_());
      return new du(dt.a, ept.b($$2), eps.a, (apf)$$1, 2, $$3, $$4, $$1.o(), $$0);
   }

   public aat l() {
      return aat.a(this);
   }

   @Override
   public ta a(in.a $$0) {
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
   public UUID s() {
      return this.d;
   }

   private void u() {
      this.e();
      this.o.a(this.aC_(), this.n(), this.n(), 3);
   }

   public boolean t() {
      return this.g;
   }

   public boolean b(boolean $$0) {
      if (this.g != $$0) {
         this.g = $$0;
         this.u();
         return true;
      } else {
         return false;
      }
   }

   public boolean b(UUID $$0) {
      ciu $$1 = this.o.b($$0);
      return $$1 == null || $$1.i((double)this.aC_().u(), (double)this.aC_().v(), (double)this.aC_().w()) > 64.0;
   }

   public static void a(cxb $$0, ib $$1, dnb $$2, dlr $$3) {
      UUID $$4 = $$3.s();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dlr $$0, cxb $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public atx d() {
      return aty.BB;
   }
}
