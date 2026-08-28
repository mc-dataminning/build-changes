import java.util.List;
import javax.annotation.Nullable;

public class dth extends dsr implements bsn, fbd.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dth.a h;
   private dtx k;
   private cwf l = cwf.k;
   @Nullable
   protected alk<eul> i;
   protected long j;

   public dth(jh $$0, dvo $$1) {
      super(dst.O, $$0, $$1);
      this.k = dtx.a;
   }

   @Override
   protected void b(un $$0, js.a $$1) {
      super.b($$0, $$1);
      this.k.a($$0);
      if (!this.c_($$0) && !this.l.f()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      this.k = dtx.b($$0);
      if (!this.b_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cwf.a($$1, (vk)$$0.p("item")).orElse(cwf.k);
         } else {
            this.l = cwf.k;
         }
      }
   }

   public aco j() {
      return aco.a(this);
   }

   @Override
   public un a(js.a $$0) {
      return this.e($$0);
   }

   public jm k() {
      return this.m().c(dwe.R);
   }

   public dtx t() {
      return this.k;
   }

   public void c(cwf $$0) {
      this.a($$0);
   }

   public cwf u() {
      cwf $$0 = cwj.eC.o();
      $$0.b(this.r());
      return $$0;
   }

   public static cwf a(dtx $$0) {
      cwf $$1 = cwj.eC.o();
      $$1.b(ku.ak, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public alk<eul> ax_() {
      return this.i;
   }

   @Override
   public void a(@Nullable alk<eul> $$0) {
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
      $$0.a(ku.al, cyx.a(List.of(this.l)));
   }

   @Override
   protected void a(dsr.b $$0) {
      super.a($$0);
      this.k = $$0.a(ku.ak, dtx.a);
      this.l = $$0.a(ku.al, cyx.a).a();
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cwf f() {
      this.e_(null);
      return this.l;
   }

   @Override
   public cwf c(int $$0) {
      this.e_(null);
      cwf $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = cwf.k;
      }

      return $$1;
   }

   @Override
   public void b(cwf $$0) {
      this.e_(null);
      this.l = $$0;
   }

   @Override
   public dsr v() {
      return this;
   }

   public void a(dth.a $$0) {
      if (this.o != null && !this.o.y_()) {
         this.o.a(this.aB_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dth.a.values().length) {
         this.g = this.o.aa();
         this.h = dth.a.values()[$$1];
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
