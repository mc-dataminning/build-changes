import com.mojang.serialization.MapCodec;

public class cvz extends dag {
   public static final MapCodec<cvz> a = b(cvz::new);

   @Override
   public MapCodec<cvz> a() {
      return a;
   }

   protected cvz(dgv.d $$0) {
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
   public dgw a(cnj $$0) {
      return a($$0.q(), $$0.a(), this.o());
   }

   public static dgw a(cqy $$0, ht $$1, dgw $$2) {
      dgw $$3 = $$0.a_($$1.d());
      dgw $$4 = $$0.a_($$1.c());
      dgw $$5 = $$0.a_($$1.e());
      dgw $$6 = $$0.a_($$1.h());
      dgw $$7 = $$0.a_($$1.f());
      dgw $$8 = $$0.a_($$1.g());
      cut $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(cuv.kv) || $$3.a(cuv.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(cuv.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(cuv.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(cuv.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(cuv.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(cuv.kv)));
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(cuv.kv) || $$1 == hx.a && $$2.a(cuv.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      dgw $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (hx $$5 : hx.c.a) {
         ht $$6 = $$2.a($$5);
         dgw $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dgw $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(cuv.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(cuv.fz);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }
}
