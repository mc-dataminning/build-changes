import com.mojang.serialization.MapCodec;

public class ddn extends dhu {
   public static final MapCodec<ddn> a = b(ddn::new);

   @Override
   public MapCodec<ddn> a() {
      return a;
   }

   protected ddn(dph.d $$0) {
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
   public dpi a(cux $$0) {
      return a($$0.q(), $$0.a(), this.n());
   }

   public static dpi a(cym $$0, id $$1, dpi $$2) {
      dpi $$3 = $$0.a_($$1.d());
      dpi $$4 = $$0.a_($$1.c());
      dpi $$5 = $$0.a_($$1.e());
      dpi $$6 = $$0.a_($$1.h());
      dpi $$7 = $$0.a_($$1.f());
      dpi $$8 = $$0.a_($$1.g());
      dch $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(dcj.kv) || $$3.a(dcj.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(dcj.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(dcj.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(dcj.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(dcj.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(dcj.kv)));
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(dcj.kv) || $$1 == ij.a && $$2.a(dcj.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      dpi $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (ij $$5 : ij.c.a) {
         id $$6 = $$2.a($$5);
         dpi $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dpi $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(dcj.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dcj.fz);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }
}
