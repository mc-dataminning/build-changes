import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ddy extends dcq {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private ddz e = this.f();
   private ddz f = this.f();
   private boolean g;

   public ddy(gw $$0, dfe $$1) {
      this(dcs.h, $$0, $$1);
   }

   public ddy(dcs $$0, gw $$1, dfe $$2) {
      super($$0, $$1, $$2);
   }

   protected ddz f() {
      return new ddz();
   }

   public boolean a(cbp $$0) {
      if (this.q().b() instanceof czq $$1) {
         ehi $$2 = $$1.h(this.q());
         double $$3 = $$0.dp() - ((double)this.p().u() + $$2.c);
         double $$4 = $$0.dv() - ((double)this.p().w() + $$2.e);
         float $$5 = $$1.g(this.q());
         float $$6 = (float)(ars.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return ars.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public ddz b(cbp $$0) {
      return this.a(this.a($$0));
   }

   public ddz a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public ddz g() {
      return this.e;
   }

   public ddz i() {
      return this.f;
   }

   public int c() {
      return 10;
   }

   public int d() {
      return 90;
   }

   @Override
   protected void b(qu $$0) {
      super.b($$0);
      ddz.a.encodeStart(rf.a, this.e).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("front_text", $$1));
      ddz.a.encodeStart(rf.a, this.f).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("back_text", $$1));
      $$0.a("is_waxed", this.g);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      if ($$0.e("front_text")) {
         ddz.a.parse(rf.a, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         ddz.a.parse(rf.a, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private ddz a(ddz $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         ti $$2 = this.a($$0.a($$1, false));
         ti $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private ti a(ti $$0) {
      if (this.o instanceof akn $$1) {
         try {
            return tk.a(a(null, $$1, this.p), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(cbp $$0, boolean $$1, List<ald> $$2) {
      if (!this.w() && $$0.cv().equals(this.v()) && this.o != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.o.a(this.p(), this.q(), this.q(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.ab().getString());
      }
   }

   public boolean a(UnaryOperator<ddz> $$0, boolean $$1) {
      ddz $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private ddz a(cbp $$0, List<ald> $$1, ddz $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         ald $$4 = $$1.get($$3);
         ue $$5 = $$2.a($$3, $$0.W()).a();
         if ($$0.W()) {
            $$2 = $$2.a($$3, ti.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, ti.b($$4.d()).b($$5), ti.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(ddz $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(ddz $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.x();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(ddz $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.x();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, cbp $$1) {
      return this.w() && this.a($$0).b($$1);
   }

   public boolean a(cbp $$0, cpq $$1, gw $$2, boolean $$3) {
      boolean $$4 = false;

      for (ti $$5 : this.a($$3).b($$0.W())) {
         ue $$6 = $$5.a();
         tg $$7 = $$6.h();
         if ($$7 != null && $$7.a() == tg.a.c) {
            $$0.cK().aC().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static dt a(@Nullable cbp $$0, cpq $$1, gw $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.ab().getString();
      ti $$4 = (ti)($$0 == null ? ti.b("Sign") : $$0.H_());
      return new dt(ds.a, ehi.b($$2), ehh.a, (akn)$$1, 2, $$3, $$4, $$1.n(), $$0);
   }

   public xa j() {
      return xa.a(this);
   }

   @Override
   public qu an_() {
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
      cbp $$1 = this.o.b($$0);
      return $$1 == null || $$1.i((double)this.p().u(), (double)this.p().v(), (double)this.p().w()) > 64.0;
   }

   public static void a(cpq $$0, gw $$1, dfe $$2, ddy $$3) {
      UUID $$4 = $$3.v();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(ddy $$0, cpq $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }
}
