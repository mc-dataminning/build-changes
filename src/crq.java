import java.util.List;

public abstract class crq extends ctd {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int q = 4;
   private static final int s = 3;
   private static final int t = 30;
   private static final int u = 30;
   private static final int v = 39;
   final brw w;
   private final csa x;
   protected final dfb r;
   private final dav<? extends czw> y;
   private final cte z;

   protected crq(csx<?> $$0, dav<? extends czw> $$1, cte $$2, int $$3, col $$4) {
      this($$0, $$1, $$2, $$3, $$4, new bsk(3), new ctk(4));
   }

   protected crq(csx<?> $$0, dav<? extends czw> $$1, cte $$2, int $$3, col $$4, brw $$5, csa $$6) {
      super($$0, $$3);
      this.y = $$1;
      this.z = $$2;
      a($$5, 3);
      a($$6, 4);
      this.w = $$5;
      this.x = $$6;
      this.r = $$4.k.dX();
      this.a(new ctl($$5, 0, 56, 17));
      this.a(new csl(this, $$5, 1, 56, 53));
      this.a(new csn($$4.k, $$5, 2, 116, 35));
      this.c($$4, 8, 84);
      this.a($$6);
   }

   @Override
   public void a(cos $$0) {
      if (this.w instanceof ctq) {
         ((ctq)this.w).fillStackedContents($$0);
      }
   }

   public ctl l() {
      return this.k.get(2);
   }

   @Override
   public boolean b(com $$0) {
      return this.w.a($$0);
   }

   @Override
   public cwb b(com $$0, int $$1) {
      cwb $$2 = cwb.k;
      ctl $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwb $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cwb.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cwb.k;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cwb.k;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cwb.k;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cwb.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cwb.k;
         }

         if ($$4.f()) {
            $$3.e(cwb.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwb.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cwb $$0) {
      return this.r.r().a(this.y, new dbf($$0), this.r).isPresent();
   }

   protected boolean d(cwb $$0) {
      return this.r.L().a($$0);
   }

   public float m() {
      int $$0 = this.x.a(2);
      int $$1 = this.x.a(3);
      return $$1 != 0 && $$0 != 0 ? azk.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float n() {
      int $$0 = this.x.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return azk.a((float)this.x.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean o() {
      return this.x.a(0) > 0;
   }

   @Override
   public cte ao_() {
      return this.z;
   }

   @Override
   public ctd.a a(boolean $$0, boolean $$1, dar<?> $$2, col $$3) {
      final List<ctl> $$4 = List.of(this.b(0), this.b(2));
      return aku.a(new aku.a<czw>() {
         @Override
         public void a(cos $$0) {
            crq.this.a($$0);
         }

         @Override
         public void a() {
            $$4.forEach($$0 -> $$0.f(cwb.k));
         }

         @Override
         public boolean a(dar<czw> $$0) {
            return $$0.b().a(new dbf(crq.this.w.a(0)), crq.this.r);
         }
      }, 1, 1, List.of(this.b(0)), $$4, $$3, (dar<czw>)$$2, $$0, $$1);
   }
}
