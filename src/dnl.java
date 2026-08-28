import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnl extends diq implements dpr {
   public static final MapCodec<dnl> a = b(dnl::new);
   public static final dwm b = dwl.C;

   @Override
   public MapCodec<dnl> a() {
      return a;
   }

   protected dnl(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(dvv $$0, dvv $$1, jm $$2) {
      return $$1.a(dis.ac) && $$2.o() == jm.a.b;
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      erv $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == erw.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(b) ? erw.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
   }
}
