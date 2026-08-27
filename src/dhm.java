import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dhm extends dgd {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private dhn e = this.g();
   private dhn f = this.g();
   private boolean g;

   public dhm(hv $$0, dip $$1) {
      this(dgf.h, $$0, $$1);
   }

   public dhm(dgf $$0, hv $$1, dip $$2) {
      super($$0, $$1, $$2);
   }

   protected dhn g() {
      return new dhn();
   }

   public boolean a(cer $$0) {
      if (this.r().b() instanceof dcy $$1) {
         elb $$2 = $$1.h(this.r());
         double $$3 = $$0.dr() - ((double)this.aB_().u() + $$2.c);
         double $$4 = $$0.dx() - ((double)this.aB_().w() + $$2.e);
         float $$5 = $$1.g(this.r());
         float $$6 = (float)(aty.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return aty.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dhn a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public dhn k() {
      return this.e;
   }

   public dhn l() {
      return this.f;
   }

   public int c() {
      return 10;
   }

   public int d() {
      return 90;
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      dhn.a.encodeStart(sx.a, this.e).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("front_text", $$1));
      dhn.a.encodeStart(sx.a, this.f).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("back_text", $$1));
      $$0.a("is_waxed", this.g);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      if ($$0.e("front_text")) {
         dhn.a.parse(sx.a, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         dhn.a.parse(sx.a, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private dhn a(dhn $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         vb $$2 = this.a($$0.a($$1, false));
         vb $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private vb a(vb $$0) {
      if (this.o instanceof amp $$1) {
         try {
            return ve.a(a(null, $$1, this.p), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(cer $$0, boolean $$1, List<ang> $$2) {
      if (!this.x() && $$0.cw().equals(this.w()) && this.o != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.o.a(this.aB_(), this.r(), this.r(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.ad().getString());
      }
   }

   public boolean a(UnaryOperator<dhn> $$0, boolean $$1) {
      dhn $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dhn a(cer $$0, List<ang> $$1, dhn $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         ang $$4 = $$1.get($$3);
         vy $$5 = $$2.a($$3, $$0.Y()).a();
         if ($$0.Y()) {
            $$2 = $$2.a($$3, vb.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, vb.b($$4.d()).b($$5), vb.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dhn $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dhn $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.y();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dhn $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.y();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, cer $$1) {
      return this.x() && this.a($$0).b($$1);
   }

   public boolean a(cer $$0, csy $$1, hv $$2, boolean $$3) {
      boolean $$4 = false;

      for (vb $$5 : this.a($$3).b($$0.Y())) {
         vy $$6 = $$5.a();
         uz $$7 = $$6.h();
         if ($$7 != null && $$7.a() == uz.a.c) {
            $$0.cL().aE().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static ds a(@Nullable cer $$0, csy $$1, hv $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.ad().getString();
      vb $$4 = (vb)($$0 == null ? vb.b("Sign") : $$0.Q_());
      return new ds(dr.a, elb.b($$2), ela.a, (amp)$$1, 2, $$3, $$4, $$1.n(), $$0);
   }

   public yv m() {
      return yv.a(this);
   }

   @Override
   public sj ax_() {
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
      this.o.a(this.aB_(), this.r(), this.r(), 3);
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
      cer $$1 = this.o.b($$0);
      return $$1 == null || $$1.i((double)this.aB_().u(), (double)this.aB_().v(), (double)this.aB_().w()) > 64.0;
   }

   public static void a(csy $$0, hv $$1, dip $$2, dhm $$3) {
      UUID $$4 = $$3.w();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dhm $$0, csy $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public arb f() {
      return arc.AQ;
   }
}
