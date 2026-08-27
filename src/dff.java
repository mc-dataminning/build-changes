import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dff extends ddx {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private dfg e = this.g();
   private dfg f = this.g();
   private boolean g;

   public dff(ht $$0, dgb $$1) {
      this(ddz.h, $$0, $$1);
   }

   public dff(ddz $$0, ht $$1, dgb $$2) {
      super($$0, $$1, $$2);
   }

   protected dfg g() {
      return new dfg();
   }

   public boolean a(ccx $$0) {
      if (this.q().b() instanceof day $$1) {
         eif $$2 = $$1.h(this.q());
         double $$3 = $$0.dq() - ((double)this.p().u() + $$2.c);
         double $$4 = $$0.dw() - ((double)this.p().w() + $$2.e);
         float $$5 = $$1.g(this.q());
         float $$6 = (float)(asy.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return asy.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dfg a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public dfg i() {
      return this.e;
   }

   public dfg j() {
      return this.f;
   }

   public int c() {
      return 10;
   }

   public int d() {
      return 90;
   }

   @Override
   protected void b(rt $$0) {
      super.b($$0);
      dfg.a.encodeStart(sf.a, this.e).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("front_text", $$1));
      dfg.a.encodeStart(sf.a, this.f).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("back_text", $$1));
      $$0.a("is_waxed", this.g);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.e("front_text")) {
         dfg.a.parse(sf.a, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         dfg.a.parse(sf.a, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private dfg a(dfg $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         ui $$2 = this.a($$0.a($$1, false));
         ui $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private ui a(ui $$0) {
      if (this.o instanceof alq $$1) {
         try {
            return ul.a(a(null, $$1, this.p), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(ccx $$0, boolean $$1, List<amh> $$2) {
      if (!this.x() && $$0.cv().equals(this.w()) && this.o != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.o.a(this.p(), this.q(), this.q(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.ab().getString());
      }
   }

   public boolean a(UnaryOperator<dfg> $$0, boolean $$1) {
      dfg $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dfg a(ccx $$0, List<amh> $$1, dfg $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         amh $$4 = $$1.get($$3);
         vf $$5 = $$2.a($$3, $$0.W()).a();
         if ($$0.W()) {
            $$2 = $$2.a($$3, ui.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, ui.b($$4.d()).b($$5), ui.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dfg $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dfg $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.y();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dfg $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.y();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, ccx $$1) {
      return this.x() && this.a($$0).b($$1);
   }

   public boolean a(ccx $$0, cqz $$1, ht $$2, boolean $$3) {
      boolean $$4 = false;

      for (ui $$5 : this.a($$3).b($$0.W())) {
         vf $$6 = $$5.a();
         ug $$7 = $$6.h();
         if ($$7 != null && $$7.a() == ug.a.c) {
            $$0.cK().aC().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static du a(@Nullable ccx $$0, cqz $$1, ht $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.ab().getString();
      ui $$4 = (ui)($$0 == null ? ui.b("Sign") : $$0.O_());
      return new du(dt.a, eif.b($$2), eie.a, (alq)$$1, 2, $$3, $$4, $$1.n(), $$0);
   }

   public yb v() {
      return yb.a(this);
   }

   @Override
   public rt av_() {
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
   public UUID w() {
      return this.d;
   }

   private void y() {
      this.e();
      this.o.a(this.p(), this.q(), this.q(), 3);
   }

   public boolean x() {
      return this.g;
   }

   public boolean b(boolean $$0) {
      if (this.g != $$0) {
         this.g = $$0;
         this.y();
         return true;
      } else {
         return false;
      }
   }

   public boolean b(UUID $$0) {
      ccx $$1 = this.o.b($$0);
      return $$1 == null || $$1.i((double)this.p().u(), (double)this.p().v(), (double)this.p().w()) > 64.0;
   }

   public static void a(cqz $$0, ht $$1, dgb $$2, dff $$3) {
      UUID $$4 = $$3.w();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dff $$0, cqz $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public aqc f() {
      return aqd.zS;
   }
}
