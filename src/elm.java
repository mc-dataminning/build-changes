public interface elm extends elt {
   elv i();

   void f();

   void a(int var1, byte var2);

   void a(int var1, short var2);

   void a(int var1, float var2);

   @Override
   default elt a(double $$0, double $$1, double $$2) {
      if (this.i().b() != elv.b.a) {
         return this;
      } else if (this.i().a() == elv.a.a && this.i().c() == 3) {
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
   default elt a(int $$0, int $$1, int $$2, int $$3) {
      elv $$4 = this.i();
      if ($$4.b() != elv.b.c) {
         return this;
      } else if ($$4.a() == elv.a.b && $$4.c() == 4) {
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
   default elt a(float $$0, float $$1) {
      elv $$2 = this.i();
      if ($$2.b() == elv.b.d && $$2.d() == 0) {
         if ($$2.a() == elv.a.a && $$2.c() == 2) {
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
   default elt a(int $$0, int $$1) {
      return this.a((short)$$0, (short)$$1, 1);
   }

   @Override
   default elt b(int $$0, int $$1) {
      return this.a((short)$$0, (short)$$1, 2);
   }

   default elt a(short $$0, short $$1, int $$2) {
      elv $$3 = this.i();
      if ($$3.b() != elv.b.d || $$3.d() != $$2) {
         return this;
      } else if ($$3.a() == elv.a.e && $$3.c() == 2) {
         this.a(0, $$0);
         this.a(2, $$1);
         this.f();
         return this;
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   default elt a(float $$0, float $$1, float $$2) {
      elv $$3 = this.i();
      if ($$3.b() != elv.b.b) {
         return this;
      } else if ($$3.a() == elv.a.c && $$3.c() == 3) {
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
      return (byte)((int)(arw.a($$0, -1.0F, 1.0F) * 127.0F) & 0xFF);
   }
}
