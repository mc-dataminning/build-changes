import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmg extends diq implements dpr {
   public static final MapCodec<dmg> a = b(dmg::new);
   private static final dwm c = dwl.C;
   protected static final fas b = diq.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dmg> a() {
      return a;
   }

   protected dmg(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(c);
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(c) ? erw.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      dvv $$1 = super.a($$0);
      if ($$1 != null) {
         erv $$2 = $$0.q().b_($$0.a());
         return $$1.b(c, Boolean.valueOf($$2.a() == erw.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      jh $$3 = $$2.d();
      dvv $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, jm.a);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return b;
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$4 == jm.b && !this.a($$0, $$1, $$3)) {
         return dis.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, erw.c, erw.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
