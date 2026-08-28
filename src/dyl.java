import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dyl extends dwx {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private dym e = this.f();
   private dym f = this.f();
   private boolean g;

   public dyl(iu $$0, dzz $$1) {
      this(dwz.h, $$0, $$1);
   }

   public dyl(dwz $$0, iu $$1, dzz $$2) {
      super($$0, $$1, $$2);
   }

   protected dym f() {
      return new dym();
   }

   public boolean a(cqy $$0) {
      if (this.m().b() instanceof dti $$1) {
         fei $$2 = $$1.o(this.m());
         double $$3 = $$0.dA() - ((double)this.aw_().u() + $$2.d);
         double $$4 = $$0.dG() - ((double)this.aw_().w() + $$2.f);
         float $$5 = $$1.h(this.m());
         float $$6 = (float)(azm.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return azm.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dym a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public dym j() {
      return this.e;
   }

   public dym k() {
      return this.f;
   }

   public int a() {
      return 10;
   }

   public int c() {
      return 90;
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      DynamicOps<uw> $$2 = $$1.a(un.a);
      $$0.a("front_text", dym.a, $$2, this.e);
      $$0.a("back_text", dym.a, $$2, this.f);
      $$0.a("is_waxed", this.g);
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      DynamicOps<uw> $$2 = $$1.a(un.a);
      this.e = $$0.<dym>a("front_text", dym.a, $$2).map(this::a).orElseGet(dym::new);
      this.f = $$0.<dym>a("back_text", dym.a, $$2).map(this::a).orElseGet(dym::new);
      this.g = $$0.q("is_waxed");
   }

   private dym a(dym $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         wy $$2 = this.a($$0.a($$1, false));
         wy $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private wy a(wy $$0) {
      if (this.n instanceof arq $$1) {
         try {
            return xb.a(a(null, $$1, this.o), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(cqy $$0, boolean $$1, List<asj> $$2) {
      if (!this.u() && $$0.cG().equals(this.t()) && this.n != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.n.a(this.aw_(), this.m(), this.m(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.al().getString());
      }
   }

   public boolean a(UnaryOperator<dym> $$0, boolean $$1) {
      dym $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dym a(cqy $$0, List<asj> $$1, dym $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         asj $$4 = $$1.get($$3);
         xv $$5 = $$2.a($$3, $$0.aa()).a();
         if ($$0.aa()) {
            $$2 = $$2.a($$3, wy.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, wy.b($$4.d()).b($$5), wy.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dym $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dym $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.v();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dym $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.v();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, cqy $$1) {
      return this.u() && this.a($$0).b($$1);
   }

   public boolean a(cqy $$0, div $$1, iu $$2, boolean $$3) {
      boolean $$4 = false;

      for (wy $$5 : this.a($$3).b($$0.aa())) {
         xv $$6 = $$5.a();
         ww $$7 = $$6.i();
         if ($$7 instanceof ww.f) {
            ww.f var12 = (ww.f)$$7;
            ww.f var10000 = var12;

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

   private static ei a(@Nullable cqy $$0, div $$1, iu $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.al().getString();
      wy $$4 = (wy)($$0 == null ? wy.b("Sign") : $$0.m_());
      return new ei(eh.a, fei.b($$2), feh.a, (arq)$$1, 2, $$3, $$4, $$1.p(), $$0);
   }

   public aca s() {
      return aca.a(this);
   }

   @Override
   public tz a(jg.a $$0) {
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
      cqy $$1 = this.n.a($$0);
      return $$1 == null || !$$1.a(this.aw_(), 4.0);
   }

   public static void a(div $$0, iu $$1, dzz $$2, dyl $$3) {
      UUID $$4 = $$3.t();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dyl $$0, div $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public awm d() {
      return awn.Dc;
   }
}
