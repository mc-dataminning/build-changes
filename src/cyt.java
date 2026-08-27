import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cyt extends dam implements daz {
   public static final MapCodec<cyt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfq.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, cyt::new)
   );
   public static final dhb b = dgr.at;
   public static final int c = 4;
   private static final eiy[] j = new eiy[]{
      cua.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      cua.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      cua.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      cua.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      cua.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dgs k = dgr.C;
   public static final dgs d = dgr.j;

   @Override
   public MapCodec<cyt> a() {
      return a;
   }

   public cyt(dfq $$0, dga.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean d(dgb $$0, cqf $$1, ht $$2) {
      return super.d($$0, $$1, $$2) || $$0.a(cuc.dR);
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      ebe $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ebf.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      eif $$4 = $$0.n($$1, $$2);
      eiy $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      return h($$0) ? $$1.a_($$2.c()).a(cuc.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return $$1 == hx.b && !$$0.a($$3, $$4) ? cuc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(k) ? ebf.c.a(false) : super.c_($$0);
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if (!h($$0)) {
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
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      return !h($$2) || !n($$2);
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return h($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      if (h($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean h(dgb $$0) {
      return $$0.c(d);
   }

   private static boolean n(dgb $$0) {
      return $$0.c(b) == 4;
   }

   public static dgb c() {
      return b(0);
   }

   public static dgb b(int $$0) {
      return cuc.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
