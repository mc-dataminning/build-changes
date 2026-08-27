enum eyy {
   a(
      new eyy.a(
         new aey("advancements/tab_above_left_selected"), new aey("advancements/tab_above_middle_selected"), new aey("advancements/tab_above_right_selected")
      ),
      new eyy.a(new aey("advancements/tab_above_left"), new aey("advancements/tab_above_middle"), new aey("advancements/tab_above_right")),
      28,
      32,
      8
   ),
   b(
      new eyy.a(
         new aey("advancements/tab_below_left_selected"), new aey("advancements/tab_below_middle_selected"), new aey("advancements/tab_below_right_selected")
      ),
      new eyy.a(new aey("advancements/tab_below_left"), new aey("advancements/tab_below_middle"), new aey("advancements/tab_below_right")),
      28,
      32,
      8
   ),
   c(
      new eyy.a(
         new aey("advancements/tab_left_top_selected"), new aey("advancements/tab_left_middle_selected"), new aey("advancements/tab_left_bottom_selected")
      ),
      new eyy.a(new aey("advancements/tab_left_top"), new aey("advancements/tab_left_middle"), new aey("advancements/tab_left_bottom")),
      32,
      28,
      5
   ),
   d(
      new eyy.a(
         new aey("advancements/tab_right_top_selected"), new aey("advancements/tab_right_middle_selected"), new aey("advancements/tab_right_bottom_selected")
      ),
      new eyy.a(new aey("advancements/tab_right_top"), new aey("advancements/tab_right_middle"), new aey("advancements/tab_right_bottom")),
      32,
      28,
      5
   );

   private final eyy.a e;
   private final eyy.a f;
   private final int g;
   private final int h;
   private final int i;

   private eyy(eyy.a $$0, eyy.a $$1, int $$2, int $$3, int $$4) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
   }

   public int a() {
      return this.i;
   }

   public void a(esh $$0, int $$1, int $$2, boolean $$3, int $$4) {
      eyy.a $$5 = $$3 ? this.e : this.f;
      aey $$6;
      if ($$4 == 0) {
         $$6 = $$5.a();
      } else if ($$4 == this.i - 1) {
         $$6 = $$5.c();
      } else {
         $$6 = $$5.b();
      }

      $$0.a($$6, $$1 + this.a($$4), $$2 + this.b($$4), this.g, this.h);
   }

   public void a(esh $$0, int $$1, int $$2, int $$3, cjh $$4) {
      int $$5 = $$1 + this.a($$3);
      int $$6 = $$2 + this.b($$3);
      switch (this) {
         case a:
            $$5 += 6;
            $$6 += 9;
            break;
         case b:
            $$5 += 6;
            $$6 += 6;
            break;
         case c:
            $$5 += 10;
            $$6 += 5;
            break;
         case d:
            $$5 += 6;
            $$6 += 5;
      }

      $$0.b($$4, $$5, $$6);
   }

   public int a(int $$0) {
      switch (this) {
         case a:
            return (this.g + 4) * $$0;
         case b:
            return (this.g + 4) * $$0;
         case c:
            return -this.g + 4;
         case d:
            return 248;
         default:
            throw new UnsupportedOperationException("Don't know what this tab type is!" + this);
      }
   }

   public int b(int $$0) {
      switch (this) {
         case a:
            return -this.h + 4;
         case b:
            return 136;
         case c:
            return this.h * $$0;
         case d:
            return this.h * $$0;
         default:
            throw new UnsupportedOperationException("Don't know what this tab type is!" + this);
      }
   }

   public boolean a(int $$0, int $$1, int $$2, double $$3, double $$4) {
      int $$5 = $$0 + this.a($$2);
      int $$6 = $$1 + this.b($$2);
      return $$3 > (double)$$5 && $$3 < (double)($$5 + this.g) && $$4 > (double)$$6 && $$4 < (double)($$6 + this.h);
   }

   static record a(aey a, aey b, aey c) {
   }
}
