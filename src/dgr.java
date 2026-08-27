import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dgr extends dfi {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private dgs e = this.g();
   private dgs f = this.g();
   private boolean g;

   public dgr(hx $$0, dhn $$1) {
      this(dfk.h, $$0, $$1);
   }

   public dgr(dfk $$0, hx $$1, dhn $$2) {
      super($$0, $$1, $$2);
   }

   protected dgs g() {
      return new dgs();
   }

   public boolean a(cdz $$0) {
      if (this.r().b() instanceof dce $$1) {
         ejz $$2 = $$1.h(this.r());
         double $$3 = $$0.ds() - ((double)this.aC_().u() + $$2.c);
         double $$4 = $$0.dy() - ((double)this.aC_().w() + $$2.e);
         float $$5 = $$1.g(this.r());
         float $$6 = (float)(atq.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return atq.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dgs a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public dgs k() {
      return this.e;
   }

   public dgs l() {
      return this.f;
   }

   public int c() {
      return 10;
   }

   public int d() {
      return 90;
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      dgs.a.encodeStart(sr.a, this.e).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("front_text", $$1));
      dgs.a.encodeStart(sr.a, this.f).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("back_text", $$1));
      $$0.a("is_waxed", this.g);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.e("front_text")) {
         dgs.a.parse(sr.a, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         dgs.a.parse(sr.a, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private dgs a(dgs $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         uv $$2 = this.a($$0.a($$1, false));
         uv $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private uv a(uv $$0) {
      if (this.o instanceof ami $$1) {
         try {
            return uy.a(a(null, $$1, this.p), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(cdz $$0, boolean $$1, List<amz> $$2) {
      if (!this.x() && $$0.cw().equals(this.w()) && this.o != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.o.a(this.aC_(), this.r(), this.r(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.ad().getString());
      }
   }

   public boolean a(UnaryOperator<dgs> $$0, boolean $$1) {
      dgs $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dgs a(cdz $$0, List<amz> $$1, dgs $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         amz $$4 = $$1.get($$3);
         vs $$5 = $$2.a($$3, $$0.Y()).a();
         if ($$0.Y()) {
            $$2 = $$2.a($$3, uv.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, uv.b($$4.d()).b($$5), uv.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dgs $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dgs $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.y();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dgs $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.y();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, cdz $$1) {
      return this.x() && this.a($$0).b($$1);
   }

   public boolean a(cdz $$0, csf $$1, hx $$2, boolean $$3) {
      boolean $$4 = false;

      for (uv $$5 : this.a($$3).b($$0.Y())) {
         vs $$6 = $$5.a();
         ut $$7 = $$6.h();
         if ($$7 != null && $$7.a() == ut.a.c) {
            $$0.cL().aE().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static du a(@Nullable cdz $$0, csf $$1, hx $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.ad().getString();
      uv $$4 = (uv)($$0 == null ? uv.b("Sign") : $$0.Q_());
      return new du(dt.a, ejz.b($$2), ejy.a, (ami)$$1, 2, $$3, $$4, $$1.n(), $$0);
   }

   public yo m() {
      return yo.a(this);
   }

   @Override
   public sd ay_() {
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
      this.o.a(this.aC_(), this.r(), this.r(), 3);
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
      cdz $$1 = this.o.b($$0);
      return $$1 == null || $$1.i((double)this.aC_().u(), (double)this.aC_().v(), (double)this.aC_().w()) > 64.0;
   }

   public static void a(csf $$0, hx $$1, dhn $$2, dgr $$3) {
      UUID $$4 = $$3.w();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dgr $$0, csf $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public aqu f() {
      return aqv.Av;
   }
}
