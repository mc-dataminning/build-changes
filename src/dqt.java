import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dqt extends dsn implements dtb {
   public static final MapCodec<dqt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzd.a.fieldOf("tree").forGetter($$0x -> $$0x.g), t()).apply($$0, dqt::new)
   );
   public static final eao b = eae.aw;
   public static final int c = 4;
   private static final int[] h = new int[]{13, 10, 7, 3, 0};
   private static final feq[] i = dlu.a(4, $$0 -> dlu.b(2.0, (double)h[$$0], 16.0));
   private static final eaf C = eae.I;
   public static final eaf d = eae.m;

   @Override
   public MapCodec<dqt> a() {
      return a;
   }

   public dqt(dzd $$0, dzn.d $$1) {
      super($$0, $$1);
      this.l(this.B.b().b(f, Integer.valueOf(0)).b(b, Integer.valueOf(0)).b(C, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(f).a(b).a(C).a(d);
   }

   @Override
   protected boolean b(dzo $$0, dhv $$1, iu $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dlw.ee);
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      evv $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == evw.c;
      return super.a($$0).b(C, Boolean.valueOf($$2)).b(b, Integer.valueOf(4));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      int $$4 = $$0.c(d) ? $$0.c(b) : 4;
      return i[$$4].a($$0.a($$2));
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(dlw.aS) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(C)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return $$4 == ja.b && !$$0.a($$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(C) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
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
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(dzo $$0) {
      return $$0.c(d);
   }

   private static boolean q(dzo $$0) {
      return $$0.c(b) == 4;
   }

   public static dzo c() {
      return b(0);
   }

   public static dzo b(int $$0) {
      return dlw.H.m().b(d, Boolean.valueOf(true)).b(b, Integer.valueOf($$0));
   }
}
