import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class due extends dmr implements duc {
   public static final MapCodec<due> a = b(due::new);
   public static final ebr<ecb> b = ebj.bk;
   public static final ebk c = ebj.I;
   private static final ffw d = dmr.b(16.0, 0.0, 8.0);
   private static final ffw e = dmr.b(16.0, 8.0, 16.0);

   @Override
   public MapCodec<? extends due> a() {
      return a;
   }

   public due(eas.d $$0) {
      super($$0);
      this.l(this.m().b(b, ecb.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(eat $$0) {
      return $$0.c(b) != ecb.c;
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return switch ((ecb)$$0.c(b)) {
         case a -> e;
         case b -> d;
         case c -> fft.b();
      };
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      iv $$1 = $$0.a();
      eat $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, ecb.c).b(c, Boolean.valueOf(false));
      } else {
         exa $$3 = $$0.q().b_($$1);
         eat $$4 = this.m().b(b, ecb.b).b(c, Boolean.valueOf($$3.a() == exb.c));
         jb $$5 = $$0.k();
         return $$5 != jb.a && ($$5 == jb.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, ecb.a);
      }
   }

   @Override
   protected boolean a(eat $$0, ddg $$1) {
      czn $$2 = $$1.n();
      ecb $$3 = $$0.c(b);
      if ($$3 == ecb.c || !$$2.a(this.h())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         jb $$5 = $$1.k();
         return $$3 == ecb.b ? $$5 == jb.b || $$4 && $$5.o().d() : $$5 == jb.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(c) ? exb.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(djn $$0, iv $$1, eat $$2, exa $$3) {
      return $$2.c(b) != ecb.c ? duc.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable bxj $$0, diq $$1, iv $$2, eat $$3, ewz $$4) {
      return $$3.c(b) != ecb.c ? duc.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.y().a(axh.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
