import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dsf extends dua implements dup {
   public static final MapCodec<dsf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eau.a.fieldOf("tree").forGetter($$0x -> $$0x.g), t()).apply($$0, dsf::new)
   );
   public static final ecg b = ebw.aw;
   public static final int c = 4;
   private static final int[] h = new int[]{13, 10, 7, 3, 0};
   private static final fgm[] i = dne.a(4, $$0 -> dne.b(2.0, (double)h[$$0], 16.0));
   private static final ebx D = ebw.I;
   public static final ebx d = ebw.m;

   @Override
   public MapCodec<dsf> a() {
      return a;
   }

   public dsf(eau $$0, ebf.d $$1) {
      super($$0, $$1);
      this.l(this.C.b().b(f, Integer.valueOf(0)).b(b, Integer.valueOf(0)).b(D, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(f).a(b).a(D).a(d);
   }

   @Override
   protected boolean b(ebg $$0, djd $$1, iw $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dng.ei);
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      exq $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == exr.c;
      return super.a($$0).b(D, Boolean.valueOf($$2)).b(b, Integer.valueOf(4));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      int $$4 = $$0.c(d) ? $$0.c(b) : 4;
      return i[$$4].a($$0.a($$2));
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(dng.aS) : super.a($$0, $$1, $$2);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(D)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return $$4 == jc.b && !$$0.a($$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(D) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
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
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(ebg $$0) {
      return $$0.c(d);
   }

   private static boolean q(ebg $$0) {
      return $$0.c(b) == 4;
   }

   public static ebg c() {
      return b(0);
   }

   public static ebg b(int $$0) {
      return dng.H.m().b(d, Boolean.valueOf(true)).b(b, Integer.valueOf($$0));
   }
}
