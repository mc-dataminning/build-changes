import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class djs extends dll implements dly {
   public static final MapCodec<djs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drp.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, djs::new)
   );
   public static final dta b = dsq.at;
   public static final int c = 4;
   private static final ewi[] j = new ewi[]{
      dex.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dex.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dex.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dex.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dex.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dsr k = dsq.C;
   public static final dsr d = dsq.j;

   @Override
   public MapCodec<djs> a() {
      return a;
   }

   public djs(drp $$0, drz.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dsa $$0, dbc $$1, iz $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dez.dR);
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      ent $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == enu.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      evp $$4 = $$0.n($$1, $$2);
      ewi $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      return m($$0) ? $$1.a_($$2.c()).a(dez.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return $$1 == je.b && !$$0.a($$3, $$4) ? dez.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(k) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dsa $$0, are $$1, iz $$2, azf $$3) {
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
   public boolean b(dbz $$0, iz $$1, dsa $$2) {
      return !m($$2) || !n($$2);
   }

   @Override
   public boolean a(dbw $$0, azf $$1, iz $$2, dsa $$3) {
      return m($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(are $$0, azf $$1, iz $$2, dsa $$3) {
      if (m($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean m(dsa $$0) {
      return $$0.c(d);
   }

   private static boolean n(dsa $$0) {
      return $$0.c(b) == 4;
   }

   public static dsa c() {
      return b(0);
   }

   public static dsa b(int $$0) {
      return dez.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
