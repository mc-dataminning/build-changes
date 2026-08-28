import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpk extends dic implements dpr {
   public static final MapCodec<dpk> a = b(dpk::new);
   public static final dwm b = dwl.F;
   public static final dwm c = dwl.C;
   public static final dwm d = dwl.G;
   protected static final fas e = diq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(jm.a.b);

   @Override
   public MapCodec<dpk> a() {
      return a;
   }

   public dpk(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dfm $$0, jh $$1, dvv $$2, bul $$3) {
      if ($$0 instanceof arp $$4) {
         arq $$5 = dui.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dta.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if ($$1 instanceof arp $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dta.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dta.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.c;
   }

   @Override
   protected fas b(dvv $$0, der $$1, jh $$2, fad $$3) {
      return e;
   }

   @Override
   protected fas d_(dvv $$0) {
      return e;
   }

   @Override
   protected boolean g_(dvv $$0) {
      return true;
   }

   @Nullable
   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dui($$0, $$1);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      return this.m().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == erw.c));
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(c) ? erw.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, cwm $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, brm.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return !$$0.C ? dic.a($$2, dta.L, ($$0x, $$1x, $$2x, $$3) -> eba.c.a($$0x, $$3.go(), $$3.gp())) : null;
   }
}
