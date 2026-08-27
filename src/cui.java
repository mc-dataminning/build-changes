import com.mojang.serialization.MapCodec;

public class cui extends cyo {
   public static final MapCodec<cui> a = b(cui::new);

   @Override
   public MapCodec<cui> a() {
      return a;
   }

   protected cui(dfc.d $$0) {
      super(0.3125F, $$0);
      this.k(
         this.E
            .b()
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
            .a(f, Boolean.valueOf(false))
            .a(g, Boolean.valueOf(false))
      );
   }

   @Override
   public dfd a(clt $$0) {
      return a($$0.q(), $$0.a(), this.o());
   }

   public static dfd a(cph $$0, gw $$1, dfd $$2) {
      dfd $$3 = $$0.a_($$1.d());
      dfd $$4 = $$0.a_($$1.c());
      dfd $$5 = $$0.a_($$1.e());
      dfd $$6 = $$0.a_($$1.h());
      dfd $$7 = $$0.a_($$1.f());
      dfd $$8 = $$0.a_($$1.g());
      ctc $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(cte.kv) || $$3.a(cte.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(cte.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(cte.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(cte.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(cte.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(cte.kv)));
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(cte.kv) || $$1 == ha.a && $$2.a(cte.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      dfd $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (ha $$5 : ha.c.a) {
         gw $$6 = $$2.a($$5);
         dfd $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dfd $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(cte.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(cte.fz);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }
}
