import java.util.List;
import javax.annotation.Nullable;

public class dur extends dua implements bsr, fcn.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dur.a h;
   private dvh k;
   private cwq l = cwq.j;
   @Nullable
   protected aku<evx> i;
   protected long j;

   public dur(ji $$0, dwy $$1) {
      super(duc.P, $$0, $$1);
      this.k = dvh.a;
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      this.k.a($$0);
      if (!this.c_($$0) && !this.l.f()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.k = dvh.b($$0);
      if (!this.b_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cwq.a($$1, (un)$$0.p("item")).orElse(cwq.j);
         } else {
            this.l = cwq.j;
         }
      }
   }

   public abs j() {
      return abs.a(this);
   }

   @Override
   public tq a(jt.a $$0) {
      return this.e($$0);
   }

   public jn k() {
      return this.m().c(dxo.U);
   }

   public dvh s() {
      return this.k;
   }

   public static cwq a(dvh $$0) {
      cwq $$1 = cwu.eP.n();
      $$1.b(kv.ak, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public aku<evx> aw_() {
      return this.i;
   }

   @Override
   public void a(@Nullable aku<evx> $$0) {
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
   protected void a(kr.a $$0) {
      super.a($$0);
      $$0.a(kv.ak, this.k);
      $$0.a(kv.al, czi.a(List.of(this.l)));
   }

   @Override
   protected void a(dua.b $$0) {
      super.a($$0);
      this.k = $$0.a(kv.ak, dvh.a);
      this.l = $$0.a(kv.al, czi.a).a();
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cwq f() {
      this.d_(null);
      return this.l;
   }

   @Override
   public cwq c(int $$0) {
      this.d_(null);
      cwq $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = cwq.j;
      }

      return $$1;
   }

   @Override
   public void b(cwq $$0) {
      this.d_(null);
      this.l = $$0;
   }

   @Override
   public dua t() {
      return this;
   }

   public void a(dur.a $$0) {
      if (this.n != null && !this.n.B_()) {
         this.n.a(this.aA_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < dur.a.values().length) {
         this.g = this.n.ad();
         this.h = dur.a.values()[$$1];
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
