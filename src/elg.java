public interface elg extends eln {
   elp i();

   void f();

   void a(int var1, byte var2);

   void a(int var1, short var2);

   void a(int var1, float var2);

   @Override
   default eln a(double $$0, double $$1, double $$2) {
      if (this.i().b() != elp.b.a) {
         return this;
      } else if (this.i().a() == elp.a.a && this.i().c() == 3) {
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
   default eln a(int $$0, int $$1, int $$2, int $$3) {
      elp $$4 = this.i();
      if ($$4.b() != elp.b.c) {
         return this;
      } else if ($$4.a() == elp.a.b && $$4.c() == 4) {
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
   default eln a(float $$0, float $$1) {
      elp $$2 = this.i();
      if ($$2.b() == elp.b.d && $$2.d() == 0) {
         if ($$2.a() == elp.a.a && $$2.c() == 2) {
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
   default eln a(int $$0, int $$1) {
      return this.a((short)$$0, (short)$$1, 1);
   }

   @Override
   default eln b(int $$0, int $$1) {
      return this.a((short)$$0, (short)$$1, 2);
   }

   default eln a(short $$0, short $$1, int $$2) {
      elp $$3 = this.i();
      if ($$3.b() != elp.b.d || $$3.d() != $$2) {
         return this;
      } else if ($$3.a() == elp.a.e && $$3.c() == 2) {
         this.a(0, $$0);
         this.a(2, $$1);
         this.f();
         return this;
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   default eln a(float $$0, float $$1, float $$2) {
      elp $$3 = this.i();
      if ($$3.b() != elp.b.b) {
         return this;
      } else if ($$3.a() == elp.a.c && $$3.c() == 3) {
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
      return (byte)((int)(asb.a($$0, -1.0F, 1.0F) * 127.0F) & 0xFF);
   }
}
