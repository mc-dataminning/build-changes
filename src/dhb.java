import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dhb extends diu implements djh {
   public static final MapCodec<dhb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dox.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dhb::new)
   );
   public static final dqi b = dpy.at;
   public static final int c = 4;
   private static final etc[] j = new etc[]{
      dch.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dch.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dch.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dch.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dch.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dpz k = dpy.C;
   public static final dpz d = dpy.j;

   @Override
   public MapCodec<dhb> a() {
      return a;
   }

   public dhb(dox $$0, dph.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dpi $$0, cym $$1, id $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dcj.dR);
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      elb $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == elc.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      esj $$4 = $$0.n($$1, $$2);
      etc $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      return m($$0) ? $$1.a_($$2.c()).a(dcj.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return $$1 == ij.b && !$$0.a($$3, $$4) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(k) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
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
   public boolean b(czj $$0, id $$1, dpi $$2) {
      return !m($$2) || !n($$2);
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return m($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      if (m($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean m(dpi $$0) {
      return $$0.c(d);
   }

   private static boolean n(dpi $$0) {
      return $$0.c(b) == 4;
   }

   public static dpi c() {
      return b(0);
   }

   public static dpi b(int $$0) {
      return dcj.E.n().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
