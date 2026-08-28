import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dru extends drc implements dpr {
   public static final MapCodec<dru> a = b(dru::new);
   public static final dwm c = dwl.C;

   @Override
   protected MapCodec<? extends dru> a() {
      return a;
   }

   protected dru(dvu.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      erv $$1 = $$0.q().b_($$0.a());
      return super.a($$0).b(c, Boolean.valueOf($$1.b(erw.c)));
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(c) ? erw.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(c);
   }
}
