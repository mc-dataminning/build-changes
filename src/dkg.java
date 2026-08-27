import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dkg extends dix {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   @Nullable
   private UUID d;
   private dkh e = this.g();
   private dkh f = this.g();
   private boolean g;

   public dkg(hz $$0, dlj $$1) {
      this(diz.h, $$0, $$1);
   }

   public dkg(diz $$0, hz $$1, dlj $$2) {
      super($$0, $$1, $$2);
   }

   protected dkh g() {
      return new dkh();
   }

   public boolean a(chl $$0) {
      if (this.r().b() instanceof dfr $$1) {
         enz $$2 = $$1.m(this.r());
         double $$3 = $$0.dr() - ((double)this.aE_().u() + $$2.c);
         double $$4 = $$0.dx() - ((double)this.aE_().w() + $$2.e);
         float $$5 = $$1.g(this.r());
         float $$6 = (float)(awi.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return awi.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public dkh a(boolean $$0) {
      return $$0 ? this.e : this.f;
   }

   public dkh k() {
      return this.e;
   }

   public dkh l() {
      return this.f;
   }

   public int c() {
      return 10;
   }

   public int d() {
      return 90;
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      dkh.a.encodeStart(tk.a, this.e).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("front_text", $$1));
      dkh.a.encodeStart(tk.a, this.f).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("back_text", $$1));
      $$0.a("is_waxed", this.g);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.e("front_text")) {
         dkh.a.parse(tk.a, $$0.p("front_text")).resultOrPartial(a::error).ifPresent($$0x -> this.e = this.a($$0x));
      }

      if ($$0.e("back_text")) {
         dkh.a.parse(tk.a, $$0.p("back_text")).resultOrPartial(a::error).ifPresent($$0x -> this.f = this.a($$0x));
      }

      this.g = $$0.q("is_waxed");
   }

   private dkh a(dkh $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         vq $$2 = this.a($$0.a($$1, false));
         vq $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private vq a(vq $$0) {
      if (this.o instanceof aow $$1) {
         try {
            return vt.a(a(null, $$1, this.p), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(chl $$0, boolean $$1, List<apn> $$2) {
      if (!this.x() && $$0.cw().equals(this.w()) && this.o != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.o.a(this.aE_(), this.r(), this.r(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.ad().getString());
      }
   }

   public boolean a(UnaryOperator<dkh> $$0, boolean $$1) {
      dkh $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private dkh a(chl $$0, List<apn> $$1, dkh $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         apn $$4 = $$1.get($$3);
         wn $$5 = $$2.a($$3, $$0.Y()).a();
         if ($$0.Y()) {
            $$2 = $$2.a($$3, vq.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, vq.b($$4.d()).b($$5), vq.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(dkh $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(dkh $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.y();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(dkh $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.y();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, chl $$1) {
      return this.x() && this.a($$0).b($$1);
   }

   public boolean a(chl $$0, cvr $$1, hz $$2, boolean $$3) {
      boolean $$4 = false;

      for (vq $$5 : this.a($$3).b($$0.Y())) {
         wn $$6 = $$5.a();
         vo $$7 = $$6.h();
         if ($$7 != null && $$7.a() == vo.a.c) {
            $$0.cL().aG().a(a($$0, $$1, $$2), $$7.b());
            $$4 = true;
         }
      }

      return $$4;
   }

   private static du a(@Nullable chl $$0, cvr $$1, hz $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.ad().getString();
      vq $$4 = (vq)($$0 == null ? vq.b("Sign") : $$0.Q_());
      return new du(dt.a, enz.b($$2), eny.a, (aow)$$1, 2, $$3, $$4, $$1.o(), $$0);
   }

   public aan m() {
      return aan.a(this);
   }

   @Override
   public sw aA_() {
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
      this.o.a(this.aE_(), this.r(), this.r(), 3);
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
      chl $$1 = this.o.b($$0);
      return $$1 == null || $$1.i((double)this.aE_().u(), (double)this.aE_().v(), (double)this.aE_().w()) > 64.0;
   }

   public static void a(cvr $$0, hz $$1, dlj $$2, dkg $$3) {
      UUID $$4 = $$3.w();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(dkg $$0, cvr $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public atk f() {
      return atl.Bg;
   }
}
