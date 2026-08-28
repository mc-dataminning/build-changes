import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class djv extends dlo implements dmb {
   public static final MapCodec<djv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drs.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, djv::new)
   );
   public static final dtd b = dst.at;
   public static final int c = 4;
   private static final ewl[] j = new ewl[]{
      dfa.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dfa.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dfa.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dfa.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dfa.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dsu k = dst.C;
   public static final dsu d = dst.j;

   @Override
   public MapCodec<djv> a() {
      return a;
   }

   public djv(drs $$0, dsc.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dsd $$0, dbf $$1, iz $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dfc.dR);
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      enw $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == enx.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      evs $$4 = $$0.n($$1, $$2);
      ewl $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      return m($$0) ? $$1.a_($$2.c()).a(dfc.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return $$1 == je.b && !$$0.a($$3, $$4) ? dfc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(k) ? enx.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
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
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      return !m($$2) || !n($$2);
   }

   @Override
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return m($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
      if (m($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean m(dsd $$0) {
      return $$0.c(d);
   }

   private static boolean n(dsd $$0) {
      return $$0.c(b) == 4;
   }

   public static dsd c() {
      return b(0);
   }

   public static dsd b(int $$0) {
      return dfc.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
