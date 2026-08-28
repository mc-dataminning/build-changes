import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dsd extends dty implements dun {
   public static final MapCodec<dsd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eas.a.fieldOf("tree").forGetter($$0x -> $$0x.g), t()).apply($$0, dsd::new)
   );
   public static final ece b = ebu.aw;
   public static final int c = 4;
   private static final int[] h = new int[]{13, 10, 7, 3, 0};
   private static final fgk[] i = dnc.a(4, $$0 -> dnc.b(2.0, (double)h[$$0], 16.0));
   private static final ebv D = ebu.I;
   public static final ebv d = ebu.m;

   @Override
   public MapCodec<dsd> a() {
      return a;
   }

   public dsd(eas $$0, ebd.d $$1) {
      super($$0, $$1);
      this.l(this.C.b().b(f, Integer.valueOf(0)).b(b, Integer.valueOf(0)).b(D, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(f).a(b).a(D).a(d);
   }

   @Override
   protected boolean b(ebe $$0, djb $$1, iv $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dne.ei);
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      exo $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == exp.c;
      return super.a($$0).b(D, Boolean.valueOf($$2)).b(b, Integer.valueOf(4));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      int $$4 = $$0.c(d) ? $$0.c(b) : 4;
      return i[$$4].a($$0.a($$2));
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(dne.aS) : super.a($$0, $$1, $$2);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(D)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return $$4 == jb.b && !$$0.a($$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(D) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
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
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(ebe $$0) {
      return $$0.c(d);
   }

   private static boolean q(ebe $$0) {
      return $$0.c(b) == 4;
   }

   public static ebe c() {
      return b(0);
   }

   public static ebe b(int $$0) {
      return dne.H.m().b(d, Boolean.valueOf(true)).b(b, Integer.valueOf($$0));
   }
}
