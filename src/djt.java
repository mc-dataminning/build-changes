import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class djt extends dlm implements dlz {
   public static final MapCodec<djt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drq.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, djt::new)
   );
   public static final dtb b = dsr.at;
   public static final int c = 4;
   private static final ewj[] j = new ewj[]{
      dey.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dey.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dey.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dey.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dey.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dss k = dsr.C;
   public static final dss d = dsr.j;

   @Override
   public MapCodec<djt> a() {
      return a;
   }

   public djt(drq $$0, dsa.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dsb $$0, dbd $$1, iz $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dfa.dR);
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      enu $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == env.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      evq $$4 = $$0.n($$1, $$2);
      ewj $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      return m($$0) ? $$1.a_($$2.c()).a(dfa.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return $$1 == je.b && !$$0.a($$3, $$4) ? dfa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(k) ? env.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
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
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      return !m($$2) || !n($$2);
   }

   @Override
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return m($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
      if (m($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean m(dsb $$0) {
      return $$0.c(d);
   }

   private static boolean n(dsb $$0) {
      return $$0.c(b) == 4;
   }

   public static dsb c() {
      return b(0);
   }

   public static dsb b(int $$0) {
      return dfa.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
