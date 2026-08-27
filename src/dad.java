import com.mojang.serialization.MapCodec;

public class dad extends cwv {
   public static final MapCodec<dad> b = b(dad::new);
   public static final dhn c = dhm.w;

   @Override
   public MapCodec<dad> a() {
      return b;
   }

   public dad(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, hx.d).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(a, c);
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(c)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(crt $$0, ht $$1) {
      if (!$$0.x_() && !$$0.L().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(crs $$0, ht $$1, dgw $$2) {
      hx $$3 = $$2.c(a);
      ht $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   @Override
   public boolean f_(dgw $$0) {
      return true;
   }

   @Override
   public int b(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.x_() && $$0.c(c) && !$$1.L().a($$2, this)) {
            dgw $$5 = $$0.a(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(c) && $$1.L().a($$2, this)) {
            this.a($$1, $$2, $$0.a(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dgw a(cnj $$0) {
      return this.o().a(a, $$0.d().g().g());
   }
}
