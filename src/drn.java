import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class drn extends dti implements dtx {
   public static final MapCodec<drn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eac.a.fieldOf("tree").forGetter($$0x -> $$0x.g), t()).apply($$0, drn::new)
   );
   public static final ebo b = ebe.aw;
   public static final int c = 4;
   private static final int[] h = new int[]{13, 10, 7, 3, 0};
   private static final ffr[] i = dmm.a(4, $$0 -> dmm.b(2.0, (double)h[$$0], 16.0));
   private static final ebf D = ebe.I;
   public static final ebf d = ebe.m;

   @Override
   public MapCodec<drn> a() {
      return a;
   }

   public drn(eac $$0, ean.d $$1) {
      super($$0, $$1);
      this.l(this.C.b().b(f, Integer.valueOf(0)).b(b, Integer.valueOf(0)).b(D, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(f).a(b).a(D).a(d);
   }

   @Override
   protected boolean b(eao $$0, din $$1, iv $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dmo.ei);
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      ewv $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eww.c;
      return super.a($$0).b(D, Boolean.valueOf($$2)).b(b, Integer.valueOf(4));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      int $$4 = $$0.c(d) ? $$0.c(b) : 4;
      return i[$$4].a($$0.a($$2));
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(dmo.aS) : super.a($$0, $$1, $$2);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(D)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return $$4 == jb.b && !$$0.a($$1, $$3) ? dmo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(D) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
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
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(eao $$0) {
      return $$0.c(d);
   }

   private static boolean q(eao $$0) {
      return $$0.c(b) == 4;
   }

   public static eao c() {
      return b(0);
   }

   public static eao b(int $$0) {
      return dmo.H.m().b(d, Boolean.valueOf(true)).b(b, Integer.valueOf($$0));
   }
}
