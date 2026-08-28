import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dnk extends dpe implements dpr {
   public static final MapCodec<dnk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvk.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, dnk::new)
   );
   public static final dwu b = dwl.at;
   public static final int c = 4;
   private static final fas[] j = new fas[]{
      diq.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      diq.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      diq.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      diq.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      diq.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dwm k = dwl.C;
   public static final dwm d = dwl.j;

   @Override
   public MapCodec<dnk> a() {
      return a;
   }

   public dnk(dvk $$0, dvu.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)).b(b, Integer.valueOf(0)).b(k, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dvv $$0, der $$1, jh $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dis.dR);
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      erv $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == erw.c;
      return super.a($$0).b(k, Boolean.valueOf($$2)).b(b, Integer.valueOf(4));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      ezy $$4 = $$0.a($$2);
      fas $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(dis.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(k)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return $$4 == jm.b && !$$0.a($$1, $$3) ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(k) ? erw.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if (!o($$0)) {
         if ($$3.a(7) == 0) {
            this.a($$1, $$2, $$0, $$3);
         }
      } else {
         if (!q($$0)) {
            $$1.a($$2, $$0.a(b), 2);
         }
      }
   }

   @Override
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(dvv $$0) {
      return $$0.c(d);
   }

   private static boolean q(dvv $$0) {
      return $$0.c(b) == 4;
   }

   public static dvv c() {
      return b(0);
   }

   public static dvv b(int $$0) {
      return dis.E.m().b(d, Boolean.valueOf(true)).b(b, Integer.valueOf($$0));
   }
}
