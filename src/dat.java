import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dat extends dcm implements dcz {
   public static final MapCodec<dat> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(die.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dat::new)
   );
   public static final djp b = djf.at;
   public static final int c = 4;
   private static final elu[] j = new elu[]{
      cvz.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      cvz.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      cvz.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      cvz.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      cvz.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final djg k = djf.C;
   public static final djg d = djf.j;

   @Override
   public MapCodec<dat> a() {
      return a;
   }

   public dat(die $$0, dio.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dip $$0, cse $$1, hv $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(cwb.dR);
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      edz $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eea.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      elb $$4 = $$0.n($$1, $$2);
      elu $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      return h($$0) ? $$1.a_($$2.c()).a(cwb.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return $$1 == ia.b && !$$0.a($$3, $$4) ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(k) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
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
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      return !h($$2) || !n($$2);
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return h($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      if (h($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean h(dip $$0) {
      return $$0.c(d);
   }

   private static boolean n(dip $$0) {
      return $$0.c(b) == 4;
   }

   public static dip c() {
      return b(0);
   }

   public static dip b(int $$0) {
      return cwb.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
