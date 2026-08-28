import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class drs extends dtn implements duc {
   public static final MapCodec<drs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eah.a.fieldOf("tree").forGetter($$0x -> $$0x.g), t()).apply($$0, drs::new)
   );
   public static final ebt b = ebj.aw;
   public static final int c = 4;
   private static final int[] h = new int[]{13, 10, 7, 3, 0};
   private static final ffw[] i = dmr.a(4, $$0 -> dmr.b(2.0, (double)h[$$0], 16.0));
   private static final ebk D = ebj.I;
   public static final ebk d = ebj.m;

   @Override
   public MapCodec<drs> a() {
      return a;
   }

   public drs(eah $$0, eas.d $$1) {
      super($$0, $$1);
      this.l(this.C.b().b(f, Integer.valueOf(0)).b(b, Integer.valueOf(0)).b(D, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(f).a(b).a(D).a(d);
   }

   @Override
   protected boolean b(eat $$0, diq $$1, iv $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dmt.ei);
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      exa $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == exb.c;
      return super.a($$0).b(D, Boolean.valueOf($$2)).b(b, Integer.valueOf(4));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      int $$4 = $$0.c(d) ? $$0.c(b) : 4;
      return i[$$4].a($$0.a($$2));
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(dmt.aS) : super.a($$0, $$1, $$2);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(D)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return $$4 == jb.b && !$$0.a($$1, $$3) ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(D) ? exb.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
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
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(eat $$0) {
      return $$0.c(d);
   }

   private static boolean q(eat $$0) {
      return $$0.c(b) == 4;
   }

   public static eat c() {
      return b(0);
   }

   public static eat b(int $$0) {
      return dmt.H.m().b(d, Boolean.valueOf(true)).b(b, Integer.valueOf($$0));
   }
}
