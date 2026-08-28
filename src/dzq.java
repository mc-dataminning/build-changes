import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dzq extends dyc {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   private static final boolean d = false;
   @Nullable
   private UUID e;
   private dzr f;
   private dzr g;
   private boolean h = false;

   public dzq(iv $$0, ebe $$1) {
      this(dye.h, $$0, $$1);
   }

   public dzq(dye $$0, iv $$1, ebe $$2) {
      super($$0, $$1, $$2);
      this.f = this.f();
      this.g = this.f();
   }

   protected dzr f() {
      return new dzr();
   }

   public boolean a(crx $$0) {
      if (this.m().b() instanceof dum $$1) {
         ffq $$2 = $$1.o(this.m());
         double $$3 = $$0.dA() - ((double)this.aB_().u() + $$2.d);
         double $$4 = $$0.dG() - ((double)this.aB_().w() + $$2.f);
         float $$5 = $$1.h(this.m());
         float $$6 = (float)(azo.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return azo.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dzr a(boolean $$0) {
      return $$0 ? this.f : this.g;
   }

   public dzr j() {
      return this.f;
   }

   public dzr k() {
      return this.g;
   }

   public int a() {
      return 10;
   }

   public int c() {
      return 90;
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      DynamicOps<uy> $$2 = $$1.a(un.a);
      $$0.a("front_text", dzr.a, $$2, this.f);
      $$0.a("back_text", dzr.a, $$2, this.g);
      $$0.a("is_waxed", this.h);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      DynamicOps<uy> $$2 = $$1.a(un.a);
      this.f = $$0.<dzr>a("front_text", dzr.a, $$2).map(this::a).orElseGet(dzr::new);
      this.g = $$0.<dzr>a("back_text", dzr.a, $$2).map(this::a).orElseGet(dzr::new);
      this.h = $$0.b("is_waxed", false);
   }

   private dzr a(dzr $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         xa $$2 = this.a($$0.a($$1, false));
         xa $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private xa a(xa $$0) {
      if (this.n instanceof ars $$1) {
         try {
            return xd.a(a(null, $$1, this.o), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(crx $$0, boolean $$1, List<asl> $$2) {
      if (!this.u() && $$0.cG().equals(this.t()) && this.n != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.n.a(this.aB_(), this.m(), this.m(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.ai().getString());
      }
   }

   public boolean a(UnaryOperator<dzr> $$0, boolean $$1) {
      dzr $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dzr a(crx $$0, List<asl> $$1, dzr $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         asl $$4 = $$1.get($$3);
         xx $$5 = $$2.a($$3, $$0.X()).a();
         if ($$0.X()) {
            $$2 = $$2.a($$3, xa.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, xa.b($$4.d()).b($$5), xa.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dzr $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dzr $$0) {
      if ($$0 != this.g) {
         this.g = $$0;
         this.v();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dzr $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.v();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, crx $$1) {
      return this.u() && this.a($$0).b($$1);
   }

   public boolean a(crx $$0, djx $$1, iv $$2, boolean $$3) {
      boolean $$4 = false;

      for (xa $$5 : this.a($$3).b($$0.X())) {
         xx $$6 = $$5.a();
         wy $$7 = $$6.i();
         if ($$7 instanceof wy.f) {
            wy.f var12 = (wy.f)$$7;
            wy.f var10000 = var12;

            try {
               var16 = var10000.b();
            } catch (Throwable var15) {
               throw new MatchException(var15.toString(), var15);
            }

            String var14 = var16;
            $$0.cV().aG().a(a($$0, $$1, $$2), var14);
            $$4 = true;
         }
      }

      return $$4;
   }

   private static ej a(@Nullable crx $$0, djx $$1, iv $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.ai().getString();
      xa $$4 = (xa)($$0 == null ? xa.b("Sign") : $$0.m_());
      return new ej(ei.a, ffq.b($$2), ffp.a, (ars)$$1, 2, $$3, $$4, $$1.p(), $$0);
   }

   public acc s() {
      return acc.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      return this.e($$0);
   }

   public void a(@Nullable UUID $$0) {
      this.e = $$0;
   }

   @Nullable
   public UUID t() {
      return this.e;
   }

   private void v() {
      this.e();
      this.n.a(this.aB_(), this.m(), this.m(), 3);
   }

   public boolean u() {
      return this.h;
   }

   public boolean b(boolean $$0) {
      if (this.h != $$0) {
         this.h = $$0;
         this.v();
         return true;
      } else {
         return false;
      }
   }

   public boolean b(UUID $$0) {
      crx $$1 = this.n.a($$0);
      return $$1 == null || !$$1.a(this.aB_(), 4.0);
   }

   public static void a(djx $$0, iv $$1, ebe $$2, dzq $$3) {
      UUID $$4 = $$3.t();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dzq $$0, djx $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public awo d() {
      return awp.Df;
   }
}
