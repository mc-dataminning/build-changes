import com.mojang.serialization.MapCodec;

public class djw extends dod {
   public static final MapCodec<djw> a = b(djw::new);

   @Override
   public MapCodec<djw> a() {
      return a;
   }

   protected djw(dvu.d $$0) {
      super(0.3125F, $$0);
      this.l(
         this.F
            .b()
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
            .b(g, Boolean.valueOf(false))
      );
   }

   @Override
   public dvv a(dad $$0) {
      return a($$0.q(), $$0.a(), this.m());
   }

   public static dvv a(der $$0, jh $$1, dvv $$2) {
      dvv $$3 = $$0.a_($$1.e());
      dvv $$4 = $$0.a_($$1.d());
      dvv $$5 = $$0.a_($$1.f());
      dvv $$6 = $$0.a_($$1.i());
      dvv $$7 = $$0.a_($$1.g());
      dvv $$8 = $$0.a_($$1.h());
      diq $$9 = $$2.b();
      return $$2.c(g, Boolean.valueOf($$3.a($$9) || $$3.a(dis.kv) || $$3.a(dis.fz)))
         .c(f, Boolean.valueOf($$4.a($$9) || $$4.a(dis.kv)))
         .c(b, Boolean.valueOf($$5.a($$9) || $$5.a(dis.kv)))
         .c(c, Boolean.valueOf($$6.a($$9) || $$6.a(dis.kv)))
         .c(d, Boolean.valueOf($$7.a($$9) || $$7.a(dis.kv)))
         .c(e, Boolean.valueOf($$8.a($$9) || $$8.a(dis.kv)));
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$8 = $$6.a(this) || $$6.a(dis.kv) || $$4 == jm.a && $$6.a(dis.fz);
         return $$0.b(h.get($$4), Boolean.valueOf($$8));
      }
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      dvv $$3 = $$1.a_($$2.e());
      boolean $$4 = !$$1.a_($$2.d()).l() && !$$3.l();

      for (jm $$5 : jm.c.a) {
         jh $$6 = $$2.a($$5);
         dvv $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dvv $$8 = $$1.a_($$6.e());
            if ($$8.a(this) || $$8.a(dis.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dis.fz);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }
}
