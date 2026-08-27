public interface epq extends epx {
   epz j();

   void f();

   void a(int var1, byte var2);

   void a(int var1, short var2);

   void a(int var1, float var2);

   @Override
   default epx a(double $$0, double $$1, double $$2) {
      if (this.j().b() != epz.b.a) {
         return this;
      } else if (this.j().a() == epz.a.a && this.j().c() == 3) {
         this.a(0, (float)$$0);
         this.a(4, (float)$$1);
         this.a(8, (float)$$2);
         this.f();
         return this;
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   default epx a(int $$0, int $$1, int $$2, int $$3) {
      epz $$4 = this.j();
      if ($$4.b() != epz.b.c) {
         return this;
      } else if ($$4.a() == epz.a.b && $$4.c() == 4) {
         this.a(0, (byte)$$0);
         this.a(1, (byte)$$1);
         this.a(2, (byte)$$2);
         this.a(3, (byte)$$3);
         this.f();
         return this;
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   default epx a(float $$0, float $$1) {
      epz $$2 = this.j();
      if ($$2.b() == epz.b.d && $$2.d() == 0) {
         if ($$2.a() == epz.a.a && $$2.c() == 2) {
            this.a(0, $$0);
            this.a(4, $$1);
            this.f();
            return this;
         } else {
            throw new IllegalStateException();
         }
      } else {
         return this;
      }
   }

   @Override
   default epx a(int $$0, int $$1) {
      return this.a((short)$$0, (short)$$1, 1);
   }

   @Override
   default epx b(int $$0, int $$1) {
      return this.a((short)$$0, (short)$$1, 2);
   }

   default epx a(short $$0, short $$1, int $$2) {
      epz $$3 = this.j();
      if ($$3.b() != epz.b.d || $$3.d() != $$2) {
         return this;
      } else if ($$3.a() == epz.a.e && $$3.c() == 2) {
         this.a(0, $$0);
         this.a(2, $$1);
         this.f();
         return this;
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   default epx a(float $$0, float $$1, float $$2) {
      epz $$3 = this.j();
      if ($$3.b() != epz.b.b) {
         return this;
      } else if ($$3.a() == epz.a.c && $$3.c() == 3) {
         this.a(0, a($$0));
         this.a(1, a($$1));
         this.a(2, a($$2));
         this.f();
         return this;
      } else {
         throw new IllegalStateException();
      }
   }

   static byte a(float $$0) {
      return (byte)((int)(aui.a($$0, -1.0F, 1.0F) * 127.0F) & 0xFF);
   }
}
