import java.util.List;
import javax.annotation.Nullable;

public class dnt extends dnd implements boy, euq.a {
   public static final String e = "sherds";
   public static final String f = "item";
   public static final int g = 1;
   public long h;
   @Nullable
   public dnt.a i;
   private doh l;
   private csd m = csd.i;
   @Nullable
   protected akf j;
   protected long k;

   public dnt(im $$0, dpy $$1) {
      super(dnf.O, $$0, $$1);
      this.l = doh.a;
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
      super.b($$0, $$1);
      this.l.a($$0);
      if (!this.b_($$0) && !this.m.d()) {
         $$0.a("item", this.m.a($$1));
      }
   }

   @Override
   public void a(ty $$0, ix.a $$1) {
      super.a($$0, $$1);
      this.l = doh.b($$0);
      if (!this.a_($$0)) {
         if ($$0.b("item", 10)) {
            this.m = csd.a($$1, (uv)$$0.p("item")).orElse(csd.i);
         } else {
            this.m = csd.i;
         }
      }
   }

   public abr j() {
      return abr.a(this);
   }

   @Override
   public ty a(ix.a $$0) {
      return this.d($$0);
   }

   public ir k() {
      return this.n().c(dqo.R);
   }

   public doh l() {
      return this.l;
   }

   public void b(csd $$0) {
      this.a($$0.a());
   }

   public csd t() {
      csd $$0 = csg.eC.x();
      $$0.a(this.s());
      return $$0;
   }

   public static csd a(doh $$0) {
      csd $$1 = csg.eC.x();
      $$1.b(jz.P, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public akf ax_() {
      return this.j;
   }

   @Override
   public void a(@Nullable akf $$0) {
      this.j = $$0;
   }

   @Override
   public long ay_() {
      return this.k;
   }

   @Override
   public void a(long $$0) {
      this.k = $$0;
   }

   @Override
   public void a(jv.a $$0) {
      $$0.a(jz.P, this.l);
      $$0.a(jz.Q, cux.a(List.of(this.m)));
   }

   @Override
   public void a(jv $$0) {
      this.l = $$0.a(jz.P, doh.a);
      this.m = $$0.a(jz.Q, cux.a).a();
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public csd f() {
      this.e_(null);
      return this.m;
   }

   @Override
   public csd c(int $$0) {
      this.e_(null);
      csd $$1 = this.m.a($$0);
      if (this.m.d()) {
         this.m = csd.i;
      }

      return $$1;
   }

   @Override
   public void a(csd $$0) {
      this.e_(null);
      this.m = $$0;
   }

   @Override
   public dnd u() {
      return this;
   }

   public void a(dnt.a $$0) {
      if (this.o != null && !this.o.x_()) {
         this.o.a(this.az_(), this.n().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dnt.a.values().length) {
         this.h = this.o.Y();
         this.i = dnt.a.values()[$$1];
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public static enum a {
      a(7),
      b(10);

      public final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }
}
