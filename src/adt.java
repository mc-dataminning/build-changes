import javax.annotation.Nullable;

public class adt implements zb<abm> {
   public static final ys<vu, adt> a = zb.a(adt::a, adt::new);
   private final double b;
   private final double c;
   private final double d;
   private final int e;
   private final ep.a f;
   private final ep.a g;
   private final boolean h;

   public adt(ep.a $$0, double $$1, double $$2, double $$3) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = 0;
      this.h = false;
      this.g = null;
   }

   public adt(ep.a $$0, brh $$1, ep.a $$2) {
      this.f = $$0;
      this.e = $$1.aj();
      this.g = $$2;
      etp $$3 = $$2.a($$1);
      this.b = $$3.c;
      this.c = $$3.d;
      this.d = $$3.e;
      this.h = true;
   }

   private adt(vu $$0) {
      this.f = $$0.b(ep.a.class);
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.h = $$0.readBoolean();
      if (this.h) {
         this.e = $$0.l();
         this.g = $$0.b(ep.a.class);
      } else {
         this.e = 0;
         this.g = null;
      }
   }

   private void a(vu $$0) {
      $$0.a(this.f);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.h);
      if (this.h) {
         $$0.c(this.e);
         $$0.a(this.g);
      }
   }

   @Override
   public zd<adt> a() {
      return afx.ag;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public ep.a b() {
      return this.f;
   }

   @Nullable
   public etp a(dad $$0) {
      if (this.h) {
         brh $$1 = $$0.a(this.e);
         return $$1 == null ? new etp(this.b, this.c, this.d) : this.g.a($$1);
      } else {
         return new etp(this.b, this.c, this.d);
      }
   }
}
