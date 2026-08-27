import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dds extends dck {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private ddt e = this.f();
   private ddt f = this.f();
   private boolean g;

   public dds(gv $$0, dey $$1) {
      this(dcm.h, $$0, $$1);
   }

   public dds(dcm $$0, gv $$1, dey $$2) {
      super($$0, $$1, $$2);
   }

   protected ddt f() {
      return new ddt();
   }

   public boolean a(cbl $$0) {
      if (this.q().b() instanceof czk $$1) {
         ehf $$2 = $$1.h(this.q());
         double $$3 = $$0.dp() - ((double)this.p().u() + $$2.c);
         double $$4 = $$0.dv() - ((double)this.p().w() + $$2.e);
         float $$5 = $$1.g(this.q());
         float $$6 = (float)(aro.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return aro.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public ddt b(cbl $$0) {
      return this.a(this.a($$0));
   }

   public ddt a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public ddt g() {
      return this.e;
   }

   public ddt i() {
      return this.f;
   }

   public int c() {
      return 10;
   }

   public int d() {
      return 90;
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      ddt.a.encodeStart(rd.a, this.e).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("front_text", $$1));
      ddt.a.encodeStart(rd.a, this.f).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("back_text", $$1));
      $$0.a("is_waxed", this.g);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.e("front_text")) {
         ddt.a.parse(rd.a, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         ddt.a.parse(rd.a, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private ddt a(ddt $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         te $$2 = this.a($$0.a($$1, false));
         te $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private te a(te $$0) {
      if (this.o instanceof aki $$1) {
         try {
            return tg.a(a(null, $$1, this.p), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(cbl $$0, boolean $$1, List<aky> $$2) {
      if (!this.w() && $$0.cv().equals(this.v()) && this.o != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.o.a(this.p(), this.q(), this.q(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.ab().getString());
      }
   }

   public boolean a(UnaryOperator<ddt> $$0, boolean $$1) {
      ddt $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private ddt a(cbl $$0, List<aky> $$1, ddt $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         aky $$4 = $$1.get($$3);
         ua $$5 = $$2.a($$3, $$0.W()).a();
         if ($$0.W()) {
            $$2 = $$2.a($$3, te.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, te.b($$4.d()).b($$5), te.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(ddt $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(ddt $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.x();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(ddt $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.x();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, cbl $$1) {
      return this.w() && this.a($$0).b($$1);
   }

   public boolean a(cbl $$0, cpk $$1, gv $$2, boolean $$3) {
      boolean $$4 = false;

      for (te $$5 : this.a($$3).b($$0.W())) {
         ua $$6 = $$5.a();
         tc $$7 = $$6.h();
         if ($$7 != null && $$7.a() == tc.a.c) {
            $$0.cK().aC().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static ds a(@Nullable cbl $$0, cpk $$1, gv $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.ab().getString();
      te $$4 = (te)($$0 == null ? te.b("Sign") : $$0.H_());
      return new ds(dr.a, ehf.b($$2), ehe.a, (aki)$$1, 2, $$3, $$4, $$1.n(), $$0);
   }

   public ww j() {
      return ww.a(this);
   }

   @Override
   public qs ao_() {
      return this.o();
   }

   @Override
   public boolean t() {
      return true;
   }

   public void a(@Nullable UUID $$0) {
      this.d = $$0;
   }

   @Nullable
   public UUID v() {
      return this.d;
   }

   private void x() {
      this.e();
      this.o.a(this.p(), this.q(), this.q(), 3);
   }

   public boolean w() {
      return this.g;
   }

   public boolean b(boolean $$0) {
      if (this.g != $$0) {
         this.g = $$0;
         this.x();
         return true;
      } else {
         return false;
      }
   }

   public boolean b(UUID $$0) {
      cbl $$1 = this.o.b($$0);
      return $$1 == null || $$1.i((double)this.p().u(), (double)this.p().v(), (double)this.p().w()) > 64.0;
   }

   public static void a(cpk $$0, gv $$1, dey $$2, dds $$3) {
      UUID $$4 = $$3.v();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dds $$0, cpk $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }
}
