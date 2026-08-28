import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class duk extends dsy {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private dul e = this.f();
   private dul f = this.f();
   private boolean g;

   public duk(jh $$0, dvv $$1) {
      this(dta.h, $$0, $$1);
   }

   public duk(dta $$0, jh $$1, dvv $$2) {
      super($$0, $$1, $$2);
   }

   protected dul f() {
      return new dul();
   }

   public boolean a(cou $$0) {
      if (this.m().b() instanceof dpq $$1) {
         ezy $$2 = $$1.o(this.m());
         double $$3 = $$0.dA() - ((double)this.aA_().u() + $$2.d);
         double $$4 = $$0.dG() - ((double)this.aA_().w() + $$2.f);
         float $$5 = $$1.h(this.m());
         float $$6 = (float)(azm.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return azm.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dul a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public dul j() {
      return this.e;
   }

   public dul k() {
      return this.f;
   }

   public int b() {
      return 10;
   }

   public int c() {
      return 90;
   }

   @Override
   protected void b(ul $$0, js.a $$1) {
      super.b($$0, $$1);
      DynamicOps<vi> $$2 = $$1.a(uz.a);
      dul.a.encodeStart($$2, this.e).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("front_text", $$1x));
      dul.a.encodeStart($$2, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$0.a("back_text", $$1x));
      $$0.a("is_waxed", this.g);
   }

   @Override
   protected void a(ul $$0, js.a $$1) {
      super.a($$0, $$1);
      DynamicOps<vi> $$2 = $$1.a(uz.a);
      if ($$0.e("front_text")) {
         dul.a.parse($$2, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         dul.a.parse($$2, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private dul a(dul $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         xj $$2 = this.a($$0.a($$1, false));
         xj $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private xj a(xj $$0) {
      if (this.o instanceof arp $$1) {
         try {
            return xm.a(a(null, $$1, this.p), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(cou $$0, boolean $$1, List<asi> $$2) {
      if (!this.v() && $$0.cG().equals(this.u()) && this.o != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.o.a(this.aA_(), this.m(), this.m(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.al().getString());
      }
   }

   public boolean a(UnaryOperator<dul> $$0, boolean $$1) {
      dul $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dul a(cou $$0, List<asi> $$1, dul $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         asi $$4 = $$1.get($$3);
         yg $$5 = $$2.a($$3, $$0.aa()).a();
         if ($$0.aa()) {
            $$2 = $$2.a($$3, xj.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, xj.b($$4.d()).b($$5), xj.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dul $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dul $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dul $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.w();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, cou $$1) {
      return this.v() && this.a($$0).b($$1);
   }

   public boolean a(cou $$0, dfm $$1, jh $$2, boolean $$3) {
      boolean $$4 = false;

      for (xj $$5 : this.a($$3).b($$0.aa())) {
         yg $$6 = $$5.a();
         xh $$7 = $$6.h();
         if ($$7 != null && $$7.a() == xh.a.c) {
            $$0.cV().aG().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static ew a(@Nullable cou $$0, dfm $$1, jh $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.al().getString();
      xj $$4 = (xj)($$0 == null ? xj.b("Sign") : $$0.o_());
      return new ew(ev.a, ezy.b($$2), ezx.a, (arp)$$1, 2, $$3, $$4, $$1.p(), $$0);
   }

   public acm t() {
      return acm.a(this);
   }

   @Override
   public ul a(js.a $$0) {
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
      this.o.a(this.aA_(), this.m(), this.m(), 3);
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
      cou $$1 = this.o.b($$0);
      return $$1 == null || !$$1.a(this.aA_(), 4.0);
   }

   public static void a(dfm $$0, jh $$1, dvv $$2, duk $$3) {
      UUID $$4 = $$3.u();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(duk $$0, dfm $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public awm d() {
      return awn.Cf;
   }
}
