import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dke extends diq {
   public static final MapCodec<dke> a = b(dke::new);
   public static final dwm b = dwl.w;
   public static final dwm c = dwl.r;

   @Override
   protected MapCodec<? extends dke> a() {
      return a;
   }

   public dke(dvu.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof arp $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, diq $$3, @Nullable etd $$4, boolean $$5) {
      if ($$1 instanceof arp $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dvv $$0, arp $$1, jh $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dvv $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? awn.fH : awn.fI, awo.e);
         }

         $$1.a($$2, $$4.b(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(dvv $$0) {
      return true;
   }

   @Override
   protected int a(dvv $$0, dfm $$1, jh $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
