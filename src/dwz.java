import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dwz extends dvl {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private dxa e = this.f();
   private dxa f = this.f();
   private boolean g;

   public dwz(jj $$0, dym $$1) {
      this(dvn.h, $$0, $$1);
   }

   public dwz(dvn $$0, jj $$1, dym $$2) {
      super($$0, $$1, $$2);
   }

   protected dxa f() {
      return new dxa();
   }

   public boolean a(cqi $$0) {
      if (this.m().b() instanceof dsa $$1) {
         fcu $$2 = $$1.o(this.m());
         double $$3 = $$0.dA() - ((double)this.aw_().u() + $$2.d);
         double $$4 = $$0.dG() - ((double)this.aw_().w() + $$2.f);
         float $$5 = $$1.h(this.m());
         float $$6 = (float)(azk.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return azk.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dxa a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public dxa j() {
      return this.e;
   }

   public dxa k() {
      return this.f;
   }

   public int a() {
      return 10;
   }

   public int c() {
      return 90;
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
      super.b($$0, $$1);
      DynamicOps<ut> $$2 = $$1.a(uk.a);
      dxa.a.encodeStart($$2, this.e).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("front_text", $$1x));
      dxa.a.encodeStart($$2, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("back_text", $$1x));
      $$0.a("is_waxed", this.g);
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      DynamicOps<ut> $$2 = $$1.a(uk.a);
      if ($$0.e("front_text")) {
         dxa.a.parse($$2, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         dxa.a.parse($$2, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private dxa a(dxa $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         wv $$2 = this.a($$0.a($$1, false));
         wv $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private wv a(wv $$0) {
      if (this.n instanceof arn $$1) {
         try {
            return wy.a(a(null, $$1, this.o), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(cqi $$0, boolean $$1, List<asg> $$2) {
      if (!this.u() && $$0.cG().equals(this.t()) && this.n != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.n.a(this.aw_(), this.m(), this.m(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.al().getString());
      }
   }

   public boolean a(UnaryOperator<dxa> $$0, boolean $$1) {
      dxa $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dxa a(cqi $$0, List<asg> $$1, dxa $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         asg $$4 = $$1.get($$3);
         xs $$5 = $$2.a($$3, $$0.aa()).a();
         if ($$0.aa()) {
            $$2 = $$2.a($$3, wv.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, wv.b($$4.d()).b($$5), wv.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dxa $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dxa $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.v();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dxa $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.v();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, cqi $$1) {
      return this.u() && this.a($$0).b($$1);
   }

   public boolean a(cqi $$0, dhp $$1, jj $$2, boolean $$3) {
      boolean $$4 = false;

      for (wv $$5 : this.a($$3).b($$0.aa())) {
         xs $$6 = $$5.a();
         wt $$7 = $$6.i();
         if ($$7 instanceof wt.f) {
            wt.f var12 = (wt.f)$$7;
            wt.f var10000 = var12;

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

   private static ex a(@Nullable cqi $$0, dhp $$1, jj $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.al().getString();
      wv $$4 = (wv)($$0 == null ? wv.b("Sign") : $$0.m_());
      return new ex(ew.a, fcu.b($$2), fct.a, (arn)$$1, 2, $$3, $$4, $$1.p(), $$0);
   }

   public abx s() {
      return abx.a(this);
   }

   @Override
   public tw a(ju.a $$0) {
      return this.e($$0);
   }

   public void a(@Nullable UUID $$0) {
      this.d = $$0;
   }

   @Nullable
   public UUID t() {
      return this.d;
   }

   private void v() {
      this.e();
      this.n.a(this.aw_(), this.m(), this.m(), 3);
   }

   public boolean u() {
      return this.g;
   }

   public boolean b(boolean $$0) {
      if (this.g != $$0) {
         this.g = $$0;
         this.v();
         return true;
      } else {
         return false;
      }
   }

   public boolean b(UUID $$0) {
      cqi $$1 = this.n.a($$0);
      return $$1 == null || !$$1.a(this.aw_(), 4.0);
   }

   public static void a(dhp $$0, jj $$1, dym $$2, dwz $$3) {
      UUID $$4 = $$3.t();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dwz $$0, dhp $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public awj d() {
      return awk.CZ;
   }
}
