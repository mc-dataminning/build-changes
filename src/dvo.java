import java.util.List;
import javax.annotation.Nullable;

public class dvo extends dux implements btp, fdk.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dvo.a h;
   private dwe k;
   private cxp l = cxp.j;
   @Nullable
   protected aly<ewu> i;
   protected long j;

   public dvo(jh $$0, dxv $$1) {
      super(duz.P, $$0, $$1);
      this.k = dwe.a;
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      this.k.a($$0);
      if (!this.c_($$0) && !this.l.f()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.k = dwe.b($$0);
      if (!this.b_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cxp.a($$1, (vu)$$0.p("item")).orElse(cxp.j);
         } else {
            this.l = cxp.j;
         }
      }
   }

   public acy j() {
      return acy.a(this);
   }

   @Override
   public ux a(js.a $$0) {
      return this.e($$0);
   }

   public jm k() {
      return this.m().c(dyl.S);
   }

   public dwe t() {
      return this.k;
   }

   public void c(cxp $$0) {
      this.a($$0);
   }

   public cxp u() {
      cxp $$0 = cxt.eN.n();
      $$0.b(this.r());
      return $$0;
   }

   public static cxp a(dwe $$0) {
      cxp $$1 = cxt.eN.n();
      $$1.b(ku.ak, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public aly<ewu> ax_() {
      return this.i;
   }

   @Override
   public void a(@Nullable aly<ewu> $$0) {
      this.i = $$0;
   }

   @Override
   public long aA_() {
      return this.j;
   }

   @Override
   public void a(long $$0) {
      this.j = $$0;
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.ak, this.k);
      $$0.a(ku.al, dah.a(List.of(this.l)));
   }

   @Override
   protected void a(dux.b $$0) {
      super.a($$0);
      this.k = $$0.a(ku.ak, dwe.a);
      this.l = $$0.a(ku.al, dah.a).a();
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cxp f() {
      this.d_(null);
      return this.l;
   }

   @Override
   public cxp c(int $$0) {
      this.d_(null);
      cxp $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = cxp.j;
      }

      return $$1;
   }

   @Override
   public void b(cxp $$0) {
      this.d_(null);
      this.l = $$0;
   }

   @Override
   public dux v() {
      return this;
   }

   public void a(dvo.a $$0) {
      if (this.o != null && !this.o.B_()) {
         this.o.a(this.aB_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dvo.a.values().length) {
         this.g = this.o.ac();
         this.h = dvo.a.values()[$$1];
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
