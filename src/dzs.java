import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dzs extends dye {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   private static final boolean d = false;
   @Nullable
   private UUID e;
   private dzt f;
   private dzt g;
   private boolean h = false;

   public dzs(iw $$0, ebg $$1) {
      this(dyg.h, $$0, $$1);
   }

   public dzs(dyg $$0, iw $$1, ebg $$2) {
      super($$0, $$1, $$2);
      this.f = this.f();
      this.g = this.f();
   }

   protected dzt f() {
      return new dzt();
   }

   public boolean a(crz $$0) {
      if (this.m().b() instanceof duo $$1) {
         ffs $$2 = $$1.o(this.m());
         double $$3 = $$0.dA() - ((double)this.aB_().u() + $$2.d);
         double $$4 = $$0.dG() - ((double)this.aB_().w() + $$2.f);
         float $$5 = $$1.h(this.m());
         float $$6 = (float)(azq.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return azq.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dzt a(boolean $$0) {
      return $$0 ? this.f : this.g;
   }

   public dzt j() {
      return this.f;
   }

   public dzt k() {
      return this.g;
   }

   public int a() {
      return 10;
   }

   public int c() {
      return 90;
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      DynamicOps<va> $$2 = $$1.a(uo.a);
      $$0.a("front_text", dzt.a, $$2, this.f);
      $$0.a("back_text", dzt.a, $$2, this.g);
      $$0.a("is_waxed", this.h);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      DynamicOps<va> $$2 = $$1.a(uo.a);
      this.f = $$0.<dzt>a("front_text", dzt.a, $$2).map(this::a).orElseGet(dzt::new);
      this.g = $$0.<dzt>a("back_text", dzt.a, $$2).map(this::a).orElseGet(dzt::new);
      this.h = $$0.b("is_waxed", false);
   }

   private dzt a(dzt $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         xc $$2 = this.a($$0.a($$1, false));
         xc $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private xc a(xc $$0) {
      if (this.n instanceof aru $$1) {
         try {
            return xf.a(a(null, $$1, this.o), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(crz $$0, boolean $$1, List<asn> $$2) {
      if (!this.u() && $$0.cG().equals(this.t()) && this.n != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.n.a(this.aB_(), this.m(), this.m(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.ai().getString());
      }
   }

   public boolean a(UnaryOperator<dzt> $$0, boolean $$1) {
      dzt $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dzt a(crz $$0, List<asn> $$1, dzt $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         asn $$4 = $$1.get($$3);
         xz $$5 = $$2.a($$3, $$0.X()).a();
         if ($$0.X()) {
            $$2 = $$2.a($$3, xc.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, xc.b($$4.d()).b($$5), xc.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dzt $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dzt $$0) {
      if ($$0 != this.g) {
         this.g = $$0;
         this.v();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dzt $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.v();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, crz $$1) {
      return this.u() && this.a($$0).b($$1);
   }

   public boolean a(crz $$0, djz $$1, iw $$2, boolean $$3) {
      boolean $$4 = false;

      for (xc $$5 : this.a($$3).b($$0.X())) {
         xz $$6 = $$5.a();
         xa $$7 = $$6.i();
         if ($$7 instanceof xa.f) {
            xa.f var12 = (xa.f)$$7;
            xa.f var10000 = var12;

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

   private static ek a(@Nullable crz $$0, djz $$1, iw $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.ai().getString();
      xc $$4 = (xc)($$0 == null ? xc.b("Sign") : $$0.m_());
      return new ek(ej.a, ffs.b($$2), ffr.a, (aru)$$1, 2, $$3, $$4, $$1.p(), $$0);
   }

   public ace s() {
      return ace.a(this);
   }

   @Override
   public ua a(ji.a $$0) {
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
      crz $$1 = this.n.a($$0);
      return $$1 == null || !$$1.a(this.aB_(), 4.0);
   }

   public static void a(djz $$0, iw $$1, ebg $$2, dzs $$3) {
      UUID $$4 = $$3.t();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dzs $$0, djz $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public awq d() {
      return awr.Df;
   }
}
