import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bzy extends cam {
   private static final cef d = cef.b().a(8.0).d();
   protected final cfe a;
   private final Class<? extends cfe> e;
   protected final dbx b;
   @Nullable
   protected cfe c;
   private int f;
   private final double g;

   public bzy(cfe $$0, double $$1) {
      this($$0, $$1, (Class<? extends cfe>)$$0.getClass());
   }

   public bzy(cfe $$0, double $$1, Class<? extends cfe> $$2) {
      this.a = $$0;
      this.b = $$0.dP();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(cam.a.a, cam.a.b));
   }

   @Override
   public boolean a() {
      if (!this.a.gu()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      return this.c.bD() && this.c.gu() && this.f < 60 && !this.c.gn();
   }

   @Override
   public void d() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void e() {
      this.a.G().a(this.c, 10.0F, (float)this.a.aa());
      this.a.K().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.g(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private cfe h() {
      List<? extends cfe> $$0 = this.b.a(this.e, d, this.a, this.a.cK().g(8.0));
      double $$1 = Double.MAX_VALUE;
      cfe $$2 = null;

      for (cfe $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gn() && this.a.g($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.g($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((are)this.b, this.c);
   }
}
