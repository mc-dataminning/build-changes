import com.mojang.serialization.MapCodec;

public class dmg extends diy {
   public static final MapCodec<dmg> b = b(dmg::new);
   public static final dur c = duq.w;

   @Override
   public MapCodec<dmg> a() {
      return b;
   }

   public dmg(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(a, jj.d).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(c)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(ddt $$0, je $$1) {
      if (!$$0.w_() && !$$0.R().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(dds $$0, je $$1, dua $$2) {
      jj $$3 = $$2.c(a);
      je $$4 = $$1.a($$3.g());
      erj $$5 = erf.a($$0, $$3.g(), null);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   @Override
   protected boolean f_(dua $$0) {
      return true;
   }

   @Override
   protected int b(dua $$0, dcx $$1, je $$2, jj $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dua $$0, dcx $$1, je $$2, jj $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.w_() && $$0.c(c) && !$$1.R().a($$2, this)) {
            dua $$5 = $$0.b(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(c) && $$1.R().a($$2, this)) {
            this.a($$1, $$2, $$0.b(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dua a(cyw $$0) {
      return this.o().b(a, $$0.d().g().g());
   }
}
