import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class drg extends dtb implements dtq {
   public static final MapCodec<drg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzv.a.fieldOf("tree").forGetter($$0x -> $$0x.g), t()).apply($$0, drg::new)
   );
   public static final ebh b = eax.aw;
   public static final int c = 4;
   private static final int[] h = new int[]{13, 10, 7, 3, 0};
   private static final ffk[] i = dmf.a(4, $$0 -> dmf.b(2.0, (double)h[$$0], 16.0));
   private static final eay D = eax.I;
   public static final eay d = eax.m;

   @Override
   public MapCodec<drg> a() {
      return a;
   }

   public drg(dzv $$0, eag.d $$1) {
      super($$0, $$1);
      this.l(this.C.b().b(f, Integer.valueOf(0)).b(b, Integer.valueOf(0)).b(D, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(f).a(b).a(D).a(d);
   }

   @Override
   protected boolean b(eah $$0, dig $$1, iu $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dmh.ei);
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      ewo $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ewp.c;
      return super.a($$0).b(D, Boolean.valueOf($$2)).b(b, Integer.valueOf(4));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      int $$4 = $$0.c(d) ? $$0.c(b) : 4;
      return i[$$4].a($$0.a($$2));
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(dmh.aS) : super.a($$0, $$1, $$2);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(D)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      return $$4 == ja.b && !$$0.a($$1, $$3) ? dmh.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(D) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
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
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(eah $$0) {
      return $$0.c(d);
   }

   private static boolean q(eah $$0) {
      return $$0.c(b) == 4;
   }

   public static eah c() {
      return b(0);
   }

   public static eah b(int $$0) {
      return dmh.H.m().b(d, Boolean.valueOf(true)).b(b, Integer.valueOf($$0));
   }
}
