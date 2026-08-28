public record cqw(boolean c, boolean d, boolean e, boolean f, boolean g, boolean h, boolean i) {
   private static final byte j = 1;
   private static final byte k = 2;
   private static final byte l = 4;
   private static final byte m = 8;
   private static final byte n = 16;
   private static final byte o = 32;
   private static final byte p = 64;
   public static final yw<vu, cqw> a = new yw<vu, cqw>() {
      public void a(vu $$0, cqw $$1) {
         byte $$2 = 0;
         $$2 = (byte)($$2 | ($$1.a() ? 1 : 0));
         $$2 = (byte)($$2 | ($$1.b() ? 2 : 0));
         $$2 = (byte)($$2 | ($$1.c() ? 4 : 0));
         $$2 = (byte)($$2 | ($$1.d() ? 8 : 0));
         $$2 = (byte)($$2 | ($$1.e() ? 16 : 0));
         $$2 = (byte)($$2 | ($$1.f() ? 32 : 0));
         $$2 = (byte)($$2 | ($$1.g() ? 64 : 0));
         $$0.l($$2);
      }

      public cqw a(vu $$0) {
         byte $$1 = $$0.readByte();
         boolean $$2 = ($$1 & 1) != 0;
         boolean $$3 = ($$1 & 2) != 0;
         boolean $$4 = ($$1 & 4) != 0;
         boolean $$5 = ($$1 & 8) != 0;
         boolean $$6 = ($$1 & 16) != 0;
         boolean $$7 = ($$1 & 32) != 0;
         boolean $$8 = ($$1 & 64) != 0;
         return new cqw($$2, $$3, $$4, $$5, $$6, $$7, $$8);
      }
   };
   public static cqw b = new cqw(false, false, false, false, false, false, false);

   public boolean a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }

   public boolean e() {
      return this.g;
   }

   public boolean f() {
      return this.h;
   }

   public boolean g() {
      return this.i;
   }
}
