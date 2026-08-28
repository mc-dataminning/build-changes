import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class djp extends dli implements dlv {
   public static final MapCodec<djp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drm.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, djp::new)
   );
   public static final dsx b = dsn.at;
   public static final int c = 4;
   private static final ewf[] j = new ewf[]{
      deu.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      deu.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      deu.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      deu.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      deu.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dso k = dsn.C;
   public static final dso d = dsn.j;

   @Override
   public MapCodec<djp> a() {
      return a;
   }

   public djp(drm $$0, drw.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(drx $$0, daz $$1, iz $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dew.dR);
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      enq $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == enr.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      evm $$4 = $$0.n($$1, $$2);
      ewf $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      return m($$0) ? $$1.a_($$2.c()).a(dew.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return $$1 == je.b && !$$0.a($$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(k) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
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
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      return !m($$2) || !n($$2);
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return m($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      if (m($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean m(drx $$0) {
      return $$0.c(d);
   }

   private static boolean n(drx $$0) {
      return $$0.c(b) == 4;
   }

   public static drx c() {
      return b(0);
   }

   public static drx b(int $$0) {
      return dew.E.n().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
