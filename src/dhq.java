import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dhq extends djj implements djw {
   public static final MapCodec<dhq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dpn.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dhq::new)
   );
   public static final dqy b = dqo.at;
   public static final int c = 4;
   private static final ety[] j = new ety[]{
      dcv.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dcv.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dcv.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dcv.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dcv.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dqp k = dqo.C;
   public static final dqp d = dqo.j;

   @Override
   public MapCodec<dhq> a() {
      return a;
   }

   public dhq(dpn $$0, dpx.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dpy $$0, cza $$1, im $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dcx.dR);
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      elr $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == els.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      etf $$4 = $$0.n($$1, $$2);
      ety $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      return m($$0) ? $$1.a_($$2.c()).a(dcx.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return $$1 == ir.b && !$$0.a($$3, $$4) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(k) ? els.c.a(false) : super.c_($$0);
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if (!m($$0)) {
         if ($$3.a(7) == 0) {
            this.a($$1, $$2, $$0, $$3);
         }
      } else {
         if (!n($$0)) {
            $$1.a($$2, $$0.a(b), 2);
         }
      }
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      return !m($$2) || !n($$2);
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return m($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      if (m($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean m(dpy $$0) {
      return $$0.c(d);
   }

   private static boolean n(dpy $$0) {
      return $$0.c(b) == 4;
   }

   public static dpy c() {
      return b(0);
   }

   public static dpy b(int $$0) {
      return dcx.E.n().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
