import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class div extends dko implements dlb {
   public static final MapCodec<div> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqs.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, div::new)
   );
   public static final dsd b = drt.at;
   public static final int c = 4;
   private static final evf[] j = new evf[]{
      dea.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dea.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dea.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dea.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dea.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dru k = drt.C;
   public static final dru d = drt.j;

   @Override
   public MapCodec<div> a() {
      return a;
   }

   public div(dqs $$0, drc.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(drd $$0, daf $$1, io $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dec.dR);
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      emw $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == emx.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      eum $$4 = $$0.n($$1, $$2);
      evf $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      return m($$0) ? $$1.a_($$2.c()).a(dec.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return $$1 == it.b && !$$0.a($$3, $$4) ? dec.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(k) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
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
   public boolean b(dbc $$0, io $$1, drd $$2) {
      return !m($$2) || !n($$2);
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return m($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      if (m($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean m(drd $$0) {
      return $$0.c(d);
   }

   private static boolean n(drd $$0) {
      return $$0.c(b) == 4;
   }

   public static drd c() {
      return b(0);
   }

   public static drd b(int $$0) {
      return dec.E.n().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
