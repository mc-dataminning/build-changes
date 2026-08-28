import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dpt extends drn implements dsb {
   public static final MapCodec<dpt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyb.a.fieldOf("tree").forGetter($$0x -> $$0x.g), t()).apply($$0, dpt::new)
   );
   public static final dzm b = dzc.aw;
   public static final int c = 4;
   private static final int[] h = new int[]{13, 10, 7, 3, 0};
   private static final fdo[] i = dku.a(4, $$0 -> dku.b(2.0, (double)h[$$0], 16.0));
   private static final dzd C = dzc.I;
   public static final dzd d = dzc.m;

   @Override
   public MapCodec<dpt> a() {
      return a;
   }

   public dpt(dyb $$0, dyl.d $$1) {
      super($$0, $$1);
      this.l(this.B.b().b(f, Integer.valueOf(0)).b(b, Integer.valueOf(0)).b(C, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(f).a(b).a(C).a(d);
   }

   @Override
   protected boolean b(dym $$0, dgv $$1, jj $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dkw.ee);
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      eut $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == euu.c;
      return super.a($$0).b(C, Boolean.valueOf($$2)).b(b, Integer.valueOf(4));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      int $$4 = $$0.c(d) ? $$0.c(b) : 4;
      return i[$$4].a($$0.a($$2));
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(dkw.aS) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(C)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return $$4 == jo.b && !$$0.a($$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(C) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
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
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(dym $$0) {
      return $$0.c(d);
   }

   private static boolean q(dym $$0) {
      return $$0.c(b) == 4;
   }

   public static dym c() {
      return b(0);
   }

   public static dym b(int $$0) {
      return dkw.H.m().b(d, Boolean.valueOf(true)).b(b, Integer.valueOf($$0));
   }
}
