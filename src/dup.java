import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dup extends dnc implements dun {
   public static final MapCodec<dup> a = b(dup::new);
   public static final ecc<ecm> b = ebu.bk;
   public static final ebv c = ebu.I;
   private static final fgk d = dnc.b(16.0, 0.0, 8.0);
   private static final fgk e = dnc.b(16.0, 8.0, 16.0);

   @Override
   public MapCodec<? extends dup> a() {
      return a;
   }

   public dup(ebd.d $$0) {
      super($$0);
      this.l(this.m().b(b, ecm.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(ebe $$0) {
      return $$0.c(b) != ecm.c;
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return switch ((ecm)$$0.c(b)) {
         case a -> e;
         case b -> d;
         case c -> fgh.b();
      };
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      iv $$1 = $$0.a();
      ebe $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, ecm.c).b(c, Boolean.valueOf(false));
      } else {
         exo $$3 = $$0.q().b_($$1);
         ebe $$4 = this.m().b(b, ecm.b).b(c, Boolean.valueOf($$3.a() == exp.c));
         jb $$5 = $$0.k();
         return $$5 != jb.a && ($$5 == jb.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, ecm.a);
      }
   }

   @Override
   protected boolean a(ebe $$0, ddr $$1) {
      czy $$2 = $$1.n();
      ecm $$3 = $$0.c(b);
      if ($$3 == ecm.c || !$$2.a(this.h())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         jb $$5 = $$1.k();
         return $$3 == ecm.b ? $$5 == jb.b || $$4 && $$5.o().d() : $$5 == jb.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(c) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(djy $$0, iv $$1, ebe $$2, exo $$3) {
      return $$2.c(b) != ecm.c ? dun.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable bxu $$0, djb $$1, iv $$2, ebe $$3, exn $$4) {
      return $$3.c(b) != ecm.c ? dun.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.y().a(axj.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
