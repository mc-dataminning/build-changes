import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmq extends dnk {
   public static final MapCodec<dmq> a = b(dmq::new);
   public static final int b = 3;
   public static final dxu c = dxl.av;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<dmq> a() {
      return a;
   }

   public dmq(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   public void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      $$1.a($$2, this, ayy.a($$1.H_(), 60, 120));
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.A($$2) > 11 - $$0.c(c) - $$0.g() && this.f($$0, $$1, $$2)) {
         ji.a $$4 = new ji.a();

         for (jn $$5 : jn.values()) {
            $$4.a($$2, $$5);
            dwv $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.f($$6, $$1, $$4)) {
               $$1.a($$4, this, ayy.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, ayy.a($$3, 20, 40));
      }
   }

   private boolean f(dwv $$0, dgg $$1, ji $$2) {
      int $$3 = $$0.c(c);
      if ($$3 < 3) {
         $$1.a($$2, $$0.b(c, Integer.valueOf($$3 + 1)), 2);
         return false;
      } else {
         this.e($$0, $$1, $$2);
         return true;
      }
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, djk $$3, @Nullable euf $$4, boolean $$5) {
      if ($$3.m().a(this) && this.a($$1, $$2, 2)) {
         this.e($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(dfl $$0, ji $$1, int $$2) {
      int $$3 = 0;
      ji.a $$4 = new ji.a();

      for (jn $$5 : jn.values()) {
         $$4.a($$1, $$5);
         if ($$0.a_($$4).a(this)) {
            if (++$$3 >= $$2) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c);
   }

   @Override
   protected cwn a(dgj $$0, ji $$1, dwv $$2, boolean $$3) {
      return cwn.j;
   }
}
