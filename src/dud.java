import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dud extends dsr {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private due e = this.f();
   private due f = this.f();
   private boolean g;

   public dud(jh $$0, dvo $$1) {
      this(dst.h, $$0, $$1);
   }

   public dud(dst $$0, jh $$1, dvo $$2) {
      super($$0, $$1, $$2);
   }

   protected due f() {
      return new due();
   }

   public boolean a(cor $$0) {
      if (this.m().b() instanceof dpj $$1) {
         ezr $$2 = $$1.o(this.m());
         double $$3 = $$0.dD() - ((double)this.aB_().u() + $$2.d);
         double $$4 = $$0.dJ() - ((double)this.aB_().w() + $$2.f);
         float $$5 = $$1.h(this.m());
         float $$6 = (float)(azn.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return azn.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public due a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public due j() {
      return this.e;
   }

   public due k() {
      return this.f;
   }

   public int b() {
      return 10;
   }

   public int c() {
      return 90;
   }

   @Override
   protected void b(un $$0, js.a $$1) {
      super.b($$0, $$1);
      DynamicOps<vk> $$2 = $$1.a(vb.a);
      due.a.encodeStart($$2, this.e).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("front_text", $$1x));
      due.a.encodeStart($$2, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("back_text", $$1x));
      $$0.a("is_waxed", this.g);
   }

   @Override
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      DynamicOps<vk> $$2 = $$1.a(vb.a);
      if ($$0.e("front_text")) {
         due.a.parse($$2, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         due.a.parse($$2, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private due a(due $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         xl $$2 = this.a($$0.a($$1, false));
         xl $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private xl a(xl $$0) {
      if (this.o instanceof arq $$1) {
         try {
            return xo.a(a(null, $$1, this.p), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(cor $$0, boolean $$1, List<asj> $$2) {
      if (!this.v() && $$0.cI().equals(this.u()) && this.o != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.o.a(this.aB_(), this.m(), this.m(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.am().getString());
      }
   }

   public boolean a(UnaryOperator<due> $$0, boolean $$1) {
      due $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private due a(cor $$0, List<asj> $$1, due $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         asj $$4 = $$1.get($$3);
         yi $$5 = $$2.a($$3, $$0.ab()).a();
         if ($$0.ab()) {
            $$2 = $$2.a($$3, xl.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, xl.b($$4.d()).b($$5), xl.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(due $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(due $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(due $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, cor $$1) {
      return this.v() && this.a($$0).b($$1);
   }

   public boolean a(cor $$0, dff $$1, jh $$2, boolean $$3) {
      boolean $$4 = false;

      for (xl $$5 : this.a($$3).b($$0.ab())) {
         yi $$6 = $$5.a();
         xj $$7 = $$6.h();
         if ($$7 != null && $$7.a() == xj.a.c) {
            $$0.cX().aG().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static ew a(@Nullable cor $$0, dff $$1, jh $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.am().getString();
      xl $$4 = (xl)($$0 == null ? xl.b("Sign") : $$0.S_());
      return new ew(ev.a, ezr.b($$2), ezq.a, (arq)$$1, 2, $$3, $$4, $$1.o(), $$0);
   }

   public aco t() {
      return aco.a(this);
   }

   @Override
   public un a(js.a $$0) {
      return this.e($$0);
   }

   @Override
   public boolean p() {
      return true;
   }

   public void a(@Nullable UUID $$0) {
      this.d = $$0;
   }

   @Nullable
   public UUID u() {
      return this.d;
   }

   private void w() {
      this.e();
      this.o.a(this.aB_(), this.m(), this.m(), 3);
   }

   public boolean v() {
      return this.g;
   }

   public boolean b(boolean $$0) {
      if (this.g != $$0) {
         this.g = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   public boolean b(UUID $$0) {
      cor $$1 = this.o.b($$0);
      return $$1 == null || !$$1.a(this.aB_(), 4.0);
   }

   public static void a(dff $$0, jh $$1, dvo $$2, dud $$3) {
      UUID $$4 = $$3.u();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dud $$0, dff $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public awn d() {
      return awo.Cf;
   }
}
