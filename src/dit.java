import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dit extends dkm implements dkz {
   public static final MapCodec<dit> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqq.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dit::new)
   );
   public static final dsb b = drr.at;
   public static final int c = 4;
   private static final evd[] j = new evd[]{
      ddy.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      ddy.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      ddy.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      ddy.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      ddy.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final drs k = drr.C;
   public static final drs d = drr.j;

   @Override
   public MapCodec<dit> a() {
      return a;
   }

   public dit(dqq $$0, dra.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(drb $$0, dad $$1, io $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dea.dR);
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      emu $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == emv.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      euk $$4 = $$0.n($$1, $$2);
      evd $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      return m($$0) ? $$1.a_($$2.c()).a(dea.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return $$1 == it.b && !$$0.a($$3, $$4) ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(k) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
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
   public boolean b(dba $$0, io $$1, drb $$2) {
      return !m($$2) || !n($$2);
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return m($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      if (m($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean m(drb $$0) {
      return $$0.c(d);
   }

   private static boolean n(drb $$0) {
      return $$0.c(b) == 4;
   }

   public static drb c() {
      return b(0);
   }

   public static drb b(int $$0) {
      return dea.E.n().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
