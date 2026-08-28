import java.util.List;
import javax.annotation.Nullable;

public class dsl extends drv implements bry, fai.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dsl.a h;
   private dtb k;
   private cvs l = cvs.k;
   @Nullable
   protected ald<etq> i;
   protected long j;

   public dsl(jf $$0, dus $$1) {
      super(drx.O, $$0, $$1);
      this.k = dtb.a;
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      this.k.a($$0);
      if (!this.c_($$0) && !this.l.f()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      this.k = dtb.b($$0);
      if (!this.b_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cvs.a($$1, (vd)$$0.p("item")).orElse(cvs.k);
         } else {
            this.l = cvs.k;
         }
      }
   }

   public ach j() {
      return ach.a(this);
   }

   @Override
   public ug a(jq.a $$0) {
      return this.e($$0);
   }

   public jk k() {
      return this.m().c(dvi.R);
   }

   public dtb t() {
      return this.k;
   }

   public void c(cvs $$0) {
      this.a($$0);
   }

   public cvs u() {
      cvs $$0 = cvw.eC.v();
      $$0.b(this.r());
      return $$0;
   }

   public static cvs a(dtb $$0) {
      cvs $$1 = cvw.eC.v();
      $$1.b(ks.af, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public ald<etq> ay_() {
      return this.i;
   }

   @Override
   public void a(@Nullable ald<etq> $$0) {
      this.i = $$0;
   }

   @Override
   public long aB_() {
      return this.j;
   }

   @Override
   public void a(long $$0) {
      this.j = $$0;
   }

   @Override
   protected void a(ko.a $$0) {
      super.a($$0);
      $$0.a(ks.af, this.k);
      $$0.a(ks.ag, cyo.a(List.of(this.l)));
   }

   @Override
   protected void a(drv.b $$0) {
      super.a($$0);
      this.k = $$0.a(ks.af, dtb.a);
      this.l = $$0.a(ks.ag, cyo.a).a();
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cvs f() {
      this.e_(null);
      return this.l;
   }

   @Override
   public cvs c(int $$0) {
      this.e_(null);
      cvs $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = cvs.k;
      }

      return $$1;
   }

   @Override
   public void b(cvs $$0) {
      this.e_(null);
      this.l = $$0;
   }

   @Override
   public drv v() {
      return this;
   }

   public void a(dsl.a $$0) {
      if (this.o != null && !this.o.x_()) {
         this.o.a(this.aC_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dsl.a.values().length) {
         this.g = this.o.aa();
         this.h = dsl.a.values()[$$1];
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
