import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dra extends dsv implements dtj {
   public static final MapCodec<dra> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzn.a.fieldOf("tree").forGetter($$0x -> $$0x.g), t()).apply($$0, dra::new)
   );
   public static final eaz b = eap.aw;
   public static final int c = 4;
   private static final int[] h = new int[]{13, 10, 7, 3, 0};
   private static final ffc[] i = dma.a(4, $$0 -> dma.b(2.0, (double)h[$$0], 16.0));
   private static final eaq C = eap.I;
   public static final eaq d = eap.m;

   @Override
   public MapCodec<dra> a() {
      return a;
   }

   public dra(dzn $$0, dzy.d $$1) {
      super($$0, $$1);
      this.l(this.B.b().b(f, Integer.valueOf(0)).b(b, Integer.valueOf(0)).b(C, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(f).a(b).a(C).a(d);
   }

   @Override
   protected boolean b(dzz $$0, dib $$1, iu $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dmc.ef);
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      ewg $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ewh.c;
      return super.a($$0).b(C, Boolean.valueOf($$2)).b(b, Integer.valueOf(4));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      int $$4 = $$0.c(d) ? $$0.c(b) : 4;
      return i[$$4].a($$0.a($$2));
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(dmc.aS) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(C)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return $$4 == ja.b && !$$0.a($$1, $$3) ? dmc.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(C) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
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
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(dzz $$0) {
      return $$0.c(d);
   }

   private static boolean q(dzz $$0) {
      return $$0.c(b) == 4;
   }

   public static dzz c() {
      return b(0);
   }

   public static dzz b(int $$0) {
      return dmc.H.m().b(d, Boolean.valueOf(true)).b(b, Integer.valueOf($$0));
   }
}
