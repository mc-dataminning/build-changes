import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class die extends dgv {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private dif e = this.g();
   private dif f = this.g();
   private boolean g;

   public die(hx $$0, djh $$1) {
      this(dgx.h, $$0, $$1);
   }

   public die(dgx $$0, hx $$1, djh $$2) {
      super($$0, $$1, $$2);
   }

   protected dif g() {
      return new dif();
   }

   public boolean a(cfi $$0) {
      if (this.r().b() instanceof ddp $$1) {
         elt $$2 = $$1.h(this.r());
         double $$3 = $$0.dr() - ((double)this.aB_().u() + $$2.c);
         double $$4 = $$0.dx() - ((double)this.aB_().w() + $$2.e);
         float $$5 = $$1.g(this.r());
         float $$6 = (float)(auo.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return auo.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dif a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public dif k() {
      return this.e;
   }

   public dif l() {
      return this.f;
   }

   public int c() {
      return 10;
   }

   public int d() {
      return 90;
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      dif.a.encodeStart(tb.a, this.e).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("front_text", $$1));
      dif.a.encodeStart(tb.a, this.f).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("back_text", $$1));
      $$0.a("is_waxed", this.g);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.e("front_text")) {
         dif.a.parse(tb.a, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         dif.a.parse(tb.a, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private dif a(dif $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         vf $$2 = this.a($$0.a($$1, false));
         vf $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private vf a(vf $$0) {
      if (this.o instanceof and $$1) {
         try {
            return vi.a(a(null, $$1, this.p), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(cfi $$0, boolean $$1, List<anu> $$2) {
      if (!this.x() && $$0.cw().equals(this.w()) && this.o != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.o.a(this.aB_(), this.r(), this.r(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.ad().getString());
      }
   }

   public boolean a(UnaryOperator<dif> $$0, boolean $$1) {
      dif $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dif a(cfi $$0, List<anu> $$1, dif $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         anu $$4 = $$1.get($$3);
         wc $$5 = $$2.a($$3, $$0.Y()).a();
         if ($$0.Y()) {
            $$2 = $$2.a($$3, vf.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, vf.b($$4.d()).b($$5), vf.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dif $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dif $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.y();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dif $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.y();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, cfi $$1) {
      return this.x() && this.a($$0).b($$1);
   }

   public boolean a(cfi $$0, ctp $$1, hx $$2, boolean $$3) {
      boolean $$4 = false;

      for (vf $$5 : this.a($$3).b($$0.Y())) {
         wc $$6 = $$5.a();
         vd $$7 = $$6.h();
         if ($$7 != null && $$7.a() == vd.a.c) {
            $$0.cL().aE().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static ds a(@Nullable cfi $$0, ctp $$1, hx $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.ad().getString();
      vf $$4 = (vf)($$0 == null ? vf.b("Sign") : $$0.Q_());
      return new ds(dr.a, elt.b($$2), els.a, (and)$$1, 2, $$3, $$4, $$1.o(), $$0);
   }

   public zh m() {
      return zh.a(this);
   }

   @Override
   public sn ax_() {
      return this.q();
   }

   @Override
   public boolean u() {
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
      this.o.a(this.aB_(), this.r(), this.r(), 3);
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
      cfi $$1 = this.o.b($$0);
      return $$1 == null || $$1.i((double)this.aB_().u(), (double)this.aB_().v(), (double)this.aB_().w()) > 64.0;
   }

   public static void a(ctp $$0, hx $$1, djh $$2, die $$3) {
      UUID $$4 = $$3.w();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(die $$0, ctp $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public arr f() {
      return ars.AQ;
   }
}
