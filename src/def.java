import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class def extends dcx {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private deg e = this.f();
   private deg f = this.f();
   private boolean g;

   public def(gw $$0, dfl $$1) {
      this(dcz.h, $$0, $$1);
   }

   public def(dcz $$0, gw $$1, dfl $$2) {
      super($$0, $$1, $$2);
   }

   protected deg f() {
      return new deg();
   }

   public boolean a(cbw $$0) {
      if (this.q().b() instanceof czx $$1) {
         ehp $$2 = $$1.h(this.q());
         double $$3 = $$0.dq() - ((double)this.p().u() + $$2.c);
         double $$4 = $$0.dw() - ((double)this.p().w() + $$2.e);
         float $$5 = $$1.g(this.q());
         float $$6 = (float)(ary.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return ary.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public deg b(cbw $$0) {
      return this.a(this.a($$0));
   }

   public deg a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public deg g() {
      return this.e;
   }

   public deg i() {
      return this.f;
   }

   public int c() {
      return 10;
   }

   public int d() {
      return 90;
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      deg.a.encodeStart(rk.a, this.e).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("front_text", $$1));
      deg.a.encodeStart(rk.a, this.f).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("back_text", $$1));
      $$0.a("is_waxed", this.g);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.e("front_text")) {
         deg.a.parse(rk.a, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         deg.a.parse(rk.a, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private deg a(deg $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         tn $$2 = this.a($$0.a($$1, false));
         tn $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private tn a(tn $$0) {
      if (this.o instanceof aks $$1) {
         try {
            return tp.a(a(null, $$1, this.p), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(cbw $$0, boolean $$1, List<alj> $$2) {
      if (!this.w() && $$0.cv().equals(this.v()) && this.o != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.o.a(this.p(), this.q(), this.q(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.ab().getString());
      }
   }

   public boolean a(UnaryOperator<deg> $$0, boolean $$1) {
      deg $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private deg a(cbw $$0, List<alj> $$1, deg $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         alj $$4 = $$1.get($$3);
         uj $$5 = $$2.a($$3, $$0.W()).a();
         if ($$0.W()) {
            $$2 = $$2.a($$3, tn.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, tn.b($$4.d()).b($$5), tn.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(deg $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(deg $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.x();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(deg $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.x();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, cbw $$1) {
      return this.w() && this.a($$0).b($$1);
   }

   public boolean a(cbw $$0, cpx $$1, gw $$2, boolean $$3) {
      boolean $$4 = false;

      for (tn $$5 : this.a($$3).b($$0.W())) {
         uj $$6 = $$5.a();
         tl $$7 = $$6.h();
         if ($$7 != null && $$7.a() == tl.a.c) {
            $$0.cK().aC().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static dt a(@Nullable cbw $$0, cpx $$1, gw $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.ab().getString();
      tn $$4 = (tn)($$0 == null ? tn.b("Sign") : $$0.N_());
      return new dt(ds.a, ehp.b($$2), eho.a, (aks)$$1, 2, $$3, $$4, $$1.n(), $$0);
   }

   public xf j() {
      return xf.a(this);
   }

   @Override
   public qy as_() {
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
      cbw $$1 = this.o.b($$0);
      return $$1 == null || $$1.i((double)this.p().u(), (double)this.p().v(), (double)this.p().w()) > 64.0;
   }

   public static void a(cpx $$0, gw $$1, dfl $$2, def $$3) {
      UUID $$4 = $$3.v();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(def $$0, cpx $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }
}
