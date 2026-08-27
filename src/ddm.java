import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ddm extends dff implements dfs {
   public static final MapCodec<ddm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dky.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, ddm::new)
   );
   public static final dmj b = dlz.at;
   public static final int c = 4;
   private static final eos[] j = new eos[]{
      cys.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      cys.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      cys.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      cys.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      cys.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dma k = dlz.C;
   public static final dma d = dlz.j;

   @Override
   public MapCodec<ddm> a() {
      return a;
   }

   public ddm(dky $$0, dli.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dlj $$0, cux $$1, hz $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(cyu.dR);
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      egw $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == egx.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      enz $$4 = $$0.n($$1, $$2);
      eos $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      return m($$0) ? $$1.a_($$2.c()).a(cyu.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return $$1 == ie.b && !$$0.a($$3, $$4) ? cyu.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(k) ? egx.c.a(false) : super.c_($$0);
   }

   @Override
   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
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
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      return !m($$2) || !n($$2);
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return m($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      if (m($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean m(dlj $$0) {
      return $$0.c(d);
   }

   private static boolean n(dlj $$0) {
      return $$0.c(b) == 4;
   }

   public static dlj c() {
      return b(0);
   }

   public static dlj b(int $$0) {
      return cyu.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
