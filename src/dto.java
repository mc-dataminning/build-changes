import java.util.List;
import javax.annotation.Nullable;

public class dto extends dsy implements bsq, fbk.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dto.a h;
   private due k;
   private cwm l = cwm.k;
   @Nullable
   protected ali<eus> i;
   protected long j;

   public dto(jh $$0, dvv $$1) {
      super(dta.O, $$0, $$1);
      this.k = due.a;
   }

   @Override
   protected void b(ul $$0, js.a $$1) {
      super.b($$0, $$1);
      this.k.a($$0);
      if (!this.c_($$0) && !this.l.f()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   protected void a(ul $$0, js.a $$1) {
      super.a($$0, $$1);
      this.k = due.b($$0);
      if (!this.b_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cwm.a($$1, (vi)$$0.p("item")).orElse(cwm.k);
         } else {
            this.l = cwm.k;
         }
      }
   }

   public acm j() {
      return acm.a(this);
   }

   @Override
   public ul a(js.a $$0) {
      return this.e($$0);
   }

   public jm k() {
      return this.m().c(dwl.R);
   }

   public due t() {
      return this.k;
   }

   public void c(cwm $$0) {
      this.a($$0);
   }

   public cwm u() {
      cwm $$0 = cwq.eC.o();
      $$0.b(this.r());
      return $$0;
   }

   public static cwm a(due $$0) {
      cwm $$1 = cwq.eC.o();
      $$1.b(ku.ak, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public ali<eus> aw_() {
      return this.i;
   }

   @Override
   public void a(@Nullable ali<eus> $$0) {
      this.i = $$0;
   }

   @Override
   public long az_() {
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
      $$0.a(ku.al, cze.a(List.of(this.l)));
   }

   @Override
   protected void a(dsy.b $$0) {
      super.a($$0);
      this.k = $$0.a(ku.ak, due.a);
      this.l = $$0.a(ku.al, cze.a).a();
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cwm f() {
      this.d_(null);
      return this.l;
   }

   @Override
   public cwm c(int $$0) {
      this.d_(null);
      cwm $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = cwm.k;
      }

      return $$1;
   }

   @Override
   public void b(cwm $$0) {
      this.d_(null);
      this.l = $$0;
   }

   @Override
   public dsy v() {
      return this;
   }

   public void a(dto.a $$0) {
      if (this.o != null && !this.o.A_()) {
         this.o.a(this.aA_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dto.a.values().length) {
         this.g = this.o.ab();
         this.h = dto.a.values()[$$1];
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
