import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dku extends djl {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private dkv e = this.f();
   private dkv f = this.f();
   private boolean g;

   public dku(ib $$0, dme $$1) {
      this(djn.h, $$0, $$1);
   }

   public dku(djn $$0, ib $$1, dme $$2) {
      super($$0, $$1, $$2);
   }

   protected dkv f() {
      return new dkv();
   }

   public boolean a(cia $$0) {
      if (this.n().b() instanceof dge $$1) {
         eov $$2 = $$1.m(this.n());
         double $$3 = $$0.do() - ((double)this.aD_().u() + $$2.c);
         double $$4 = $$0.du() - ((double)this.aD_().w() + $$2.e);
         float $$5 = $$1.g(this.n());
         float $$6 = (float)(awm.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return awm.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dkv a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public dkv j() {
      return this.e;
   }

   public dkv k() {
      return this.f;
   }

   public int b() {
      return 10;
   }

   public int c() {
      return 90;
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      super.b($$0, $$1);
      dkv.a.encodeStart(tm.a, this.e).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("front_text", $$1x));
      dkv.a.encodeStart(tm.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("back_text", $$1x));
      $$0.a("is_waxed", this.g);
   }

   @Override
   public void a(sy $$0, in.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("front_text")) {
         dkv.a.parse(tm.a, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         dkv.a.parse(tm.a, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private dkv a(dkv $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         vs $$2 = this.a($$0.a($$1, false));
         vs $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private vs a(vs $$0) {
      if (this.o instanceof apa $$1) {
         try {
            return vv.a(a(null, $$1, this.p), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(cia $$0, boolean $$1, List<apr> $$2) {
      if (!this.t() && $$0.ct().equals(this.s()) && this.o != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.o.a(this.aD_(), this.n(), this.n(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.ad().getString());
      }
   }

   public boolean a(UnaryOperator<dkv> $$0, boolean $$1) {
      dkv $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dkv a(cia $$0, List<apr> $$1, dkv $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         apr $$4 = $$1.get($$3);
         wp $$5 = $$2.a($$3, $$0.Y()).a();
         if ($$0.Y()) {
            $$2 = $$2.a($$3, vs.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, vs.b($$4.d()).b($$5), vs.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dkv $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dkv $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.u();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dkv $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.u();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, cia $$1) {
      return this.t() && this.a($$0).b($$1);
   }

   public boolean a(cia $$0, cwe $$1, ib $$2, boolean $$3) {
      boolean $$4 = false;

      for (vs $$5 : this.a($$3).b($$0.Y())) {
         wp $$6 = $$5.a();
         vq $$7 = $$6.h();
         if ($$7 != null && $$7.a() == vq.a.c) {
            $$0.cI().aH().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static du a(@Nullable cia $$0, cwe $$1, ib $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.ad().getString();
      vs $$4 = (vs)($$0 == null ? vs.b("Sign") : $$0.Q_());
      return new du(dt.a, eov.b($$2), eou.a, (apa)$$1, 2, $$3, $$4, $$1.o(), $$0);
   }

   public aap l() {
      return aap.a(this);
   }

   @Override
   public sy a(in.a $$0) {
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
      this.o.a(this.aD_(), this.n(), this.n(), 3);
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
      cia $$1 = this.o.b($$0);
      return $$1 == null || $$1.i((double)this.aD_().u(), (double)this.aD_().v(), (double)this.aD_().w()) > 64.0;
   }

   public static void a(cwe $$0, ib $$1, dme $$2, dku $$3) {
      UUID $$4 = $$3.s();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dku $$0, cwe $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public ato d() {
      return atp.Bt;
   }
}
