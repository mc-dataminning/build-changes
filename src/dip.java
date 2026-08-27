import com.mojang.serialization.MapCodec;

public class dip extends dfh {
   public static final MapCodec<dip> b = b(dip::new);
   public static final dqy c = dqx.w;

   @Override
   public MapCodec<dip> a() {
      return b;
   }

   public dip(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, is.d).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(c)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(dae $$0, in $$1) {
      if (!$$0.x_() && !$$0.O().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(dad $$0, in $$1, dqh $$2) {
      is $$3 = $$2.c(a);
      in $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   @Override
   protected boolean e_(dqh $$0) {
      return true;
   }

   @Override
   protected int b(dqh $$0, czj $$1, in $$2, is $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dqh $$0, czj $$1, in $$2, is $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.x_() && $$0.c(c) && !$$1.O().a($$2, this)) {
            dqh $$5 = $$0.a(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(c) && $$1.O().a($$2, this)) {
            this.a($$1, $$2, $$0.a(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dqh a(cwi $$0) {
      return this.n().a(a, $$0.d().g().g());
   }
}
