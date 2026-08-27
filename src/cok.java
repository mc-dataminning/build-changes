public class cok extends cod {
   private static final int k = 9;
   private final bpf l;
   private final int m;

   private cok(cpl<?> $$0, int $$1, clg $$2, int $$3) {
      this($$0, $$1, $$2, new bpv(9 * $$3), $$3);
   }

   public static cok a(int $$0, clg $$1) {
      return new cok(cpl.a, $$0, $$1, 1);
   }

   public static cok b(int $$0, clg $$1) {
      return new cok(cpl.b, $$0, $$1, 2);
   }

   public static cok c(int $$0, clg $$1) {
      return new cok(cpl.c, $$0, $$1, 3);
   }

   public static cok d(int $$0, clg $$1) {
      return new cok(cpl.d, $$0, $$1, 4);
   }

   public static cok e(int $$0, clg $$1) {
      return new cok(cpl.e, $$0, $$1, 5);
   }

   public static cok f(int $$0, clg $$1) {
      return new cok(cpl.f, $$0, $$1, 6);
   }

   public static cok a(int $$0, clg $$1, bpf $$2) {
      return new cok(cpl.c, $$0, $$1, $$2, 3);
   }

   public static cok b(int $$0, clg $$1, bpf $$2) {
      return new cok(cpl.f, $$0, $$1, $$2, 6);
   }

   public cok(cpl<?> $$0, int $$1, clg $$2, bpf $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.l);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cpz($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cpz($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cpz($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(clh $$0) {
      return this.l.a($$0);
   }

   @Override
   public csz a(clh $$0, int $$1) {
      csz $$2 = csz.i;
      cpz $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         csz $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return csz.i;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return csz.i;
         }

         if ($$4.d()) {
            $$3.e(csz.i);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(clh $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public bpf l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
