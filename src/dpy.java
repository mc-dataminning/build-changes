import java.util.List;
import javax.annotation.Nullable;

public class dpy extends dpi implements brd, exd.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dpy.a h;
   private dqm k;
   private cuq l;
   @Nullable
   protected ale<eqo> i;
   protected long j;

   public dpy(iz $$0, dsd $$1) {
      super(dpk.O, $$0, $$1);
      this.l = cuq.l;
      this.k = dqm.a;
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      this.k.a($$0);
      if (!this.b_($$0) && !this.l.e()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.k = dqm.b($$0);
      if (!this.a_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cuq.a($$1, (vp)$$0.p("item")).orElse(cuq.l);
         } else {
            this.l = cuq.l;
         }
      }
   }

   public acp j() {
      return acp.a(this);
   }

   @Override
   public us a(jk.a $$0) {
      return this.e($$0);
   }

   public je k() {
      return this.n().c(dst.R);
   }

   public dqm l() {
      return this.k;
   }

   public void c(cuq $$0) {
      this.a($$0);
   }

   public cuq u() {
      cuq $$0 = cut.eC.w();
      $$0.b(this.s());
      return $$0;
   }

   public static cuq a(dqm $$0) {
      cuq $$1 = cut.eC.w();
      $$1.b(km.Z, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public ale<eqo> aw_() {
      return this.i;
   }

   @Override
   public void a(@Nullable ale<eqo> $$0) {
      this.i = $$0;
   }

   @Override
   public long ax_() {
      return this.j;
   }

   @Override
   public void a(long $$0) {
      this.j = $$0;
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(km.Z, this.k);
      $$0.a(km.aa, cxm.a(List.of(this.l)));
   }

   @Override
   protected void a(dpi.b $$0) {
      super.a($$0);
      this.k = $$0.a(km.Z, dqm.a);
      this.l = $$0.a(km.aa, cxm.a).a();
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cuq f() {
      this.e_(null);
      return this.l;
   }

   @Override
   public cuq c(int $$0) {
      this.e_(null);
      cuq $$1 = this.l.a($$0);
      if (this.l.e()) {
         this.l = cuq.l;
      }

      return $$1;
   }

   @Override
   public void b(cuq $$0) {
      this.e_(null);
      this.l = $$0;
   }

   @Override
   public dpi v() {
      return this;
   }

   public void a(dpy.a $$0) {
      if (this.n != null && !this.n.x_()) {
         this.n.a(this.ay_(), this.n().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < dpy.a.values().length) {
         this.g = this.n.Z();
         this.h = dpy.a.values()[$$1];
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public static enum a {
      a(7),
      b(10);

      public final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }
}
