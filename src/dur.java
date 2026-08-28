import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dur extends dne implements dup {
   public static final MapCodec<dur> a = b(dur::new);
   public static final ece<eco> b = ebw.bk;
   public static final ebx c = ebw.I;
   private static final fgm d = dne.b(16.0, 0.0, 8.0);
   private static final fgm e = dne.b(16.0, 8.0, 16.0);

   @Override
   public MapCodec<? extends dur> a() {
      return a;
   }

   public dur(ebf.d $$0) {
      super($$0);
      this.l(this.m().b(b, eco.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(ebg $$0) {
      return $$0.c(b) != eco.c;
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return switch ((eco)$$0.c(b)) {
         case a -> e;
         case b -> d;
         case c -> fgj.b();
      };
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      iw $$1 = $$0.a();
      ebg $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, eco.c).b(c, Boolean.valueOf(false));
      } else {
         exq $$3 = $$0.q().b_($$1);
         ebg $$4 = this.m().b(b, eco.b).b(c, Boolean.valueOf($$3.a() == exr.c));
         jc $$5 = $$0.k();
         return $$5 != jc.a && ($$5 == jc.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, eco.a);
      }
   }

   @Override
   protected boolean a(ebg $$0, ddt $$1) {
      daa $$2 = $$1.n();
      eco $$3 = $$0.c(b);
      if ($$3 == eco.c || !$$2.a(this.h())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         jc $$5 = $$1.k();
         return $$3 == eco.b ? $$5 == jc.b || $$4 && $$5.o().d() : $$5 == jc.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(c) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dka $$0, iw $$1, ebg $$2, exq $$3) {
      return $$2.c(b) != eco.c ? dup.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable bxw $$0, djd $$1, iw $$2, ebg $$3, exp $$4) {
      return $$3.c(b) != eco.c ? dup.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.y().a(axl.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
