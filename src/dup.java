import java.util.List;
import javax.annotation.Nullable;

public class dup extends dty implements bsp, fcl.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dup.a h;
   private dvf k;
   private cwo l = cwo.j;
   @Nullable
   protected aku<evv> i;
   protected long j;

   public dup(ji $$0, dww $$1) {
      super(dua.P, $$0, $$1);
      this.k = dvf.a;
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
      this.k = dvf.b($$0);
      if (!this.b_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cwo.a($$1, (un)$$0.p("item")).orElse(cwo.j);
         } else {
            this.l = cwo.j;
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
      return this.m().c(dxm.U);
   }

   public dvf s() {
      return this.k;
   }

   public static cwo a(dvf $$0) {
      cwo $$1 = cws.eP.n();
      $$1.b(kv.ak, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public aku<evv> aw_() {
      return this.i;
   }

   @Override
   public void a(@Nullable aku<evv> $$0) {
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
      $$0.a(kv.al, czg.a(List.of(this.l)));
   }

   @Override
   protected void a(dty.b $$0) {
      super.a($$0);
      this.k = $$0.a(kv.ak, dvf.a);
      this.l = $$0.a(kv.al, czg.a).a();
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cwo f() {
      this.d_(null);
      return this.l;
   }

   @Override
   public cwo c(int $$0) {
      this.d_(null);
      cwo $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = cwo.j;
      }

      return $$1;
   }

   @Override
   public void b(cwo $$0) {
      this.d_(null);
      this.l = $$0;
   }

   @Override
   public dty t() {
      return this;
   }

   public void a(dup.a $$0) {
      if (this.o != null && !this.o.B_()) {
         this.o.a(this.aA_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dup.a.values().length) {
         this.g = this.o.ad();
         this.h = dup.a.values()[$$1];
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
