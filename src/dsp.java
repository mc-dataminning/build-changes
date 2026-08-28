import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dsp extends duk implements duz {
   public static final MapCodec<dsp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebe.a.fieldOf("tree").forGetter($$0x -> $$0x.g), t()).apply($$0, dsp::new)
   );
   public static final ecq b = ecg.aw;
   public static final int c = 4;
   private static final int[] h = new int[]{13, 10, 7, 3, 0};
   private static final fgw[] i = dno.a(4, $$0 -> dno.b(2.0, (double)h[$$0], 16.0));
   private static final ech D = ecg.I;
   public static final ech d = ecg.m;

   @Override
   public MapCodec<dsp> a() {
      return a;
   }

   public dsp(ebe $$0, ebp.d $$1) {
      super($$0, $$1);
      this.l(this.C.b().b(f, Integer.valueOf(0)).b(b, Integer.valueOf(0)).b(D, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(f).a(b).a(D).a(d);
   }

   @Override
   protected boolean b(ebq $$0, djn $$1, iw $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dnq.ei);
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      eya $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eyb.c;
      return super.a($$0).b(D, Boolean.valueOf($$2)).b(b, Integer.valueOf(4));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      int $$4 = $$0.c(d) ? $$0.c(b) : 4;
      return i[$$4].a($$0.a($$2));
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(dnq.aS) : super.a($$0, $$1, $$2);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(D)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return $$4 == jc.b && !$$0.a($$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(D) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
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
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(ebq $$0) {
      return $$0.c(d);
   }

   private static boolean q(ebq $$0) {
      return $$0.c(b) == 4;
   }

   public static ebq c() {
      return b(0);
   }

   public static ebq b(int $$0) {
      return dnq.H.m().b(d, Boolean.valueOf(true)).b(b, Integer.valueOf($$0));
   }
}
