import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dbd extends dcw implements ddj {
   public static final MapCodec<dbd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dip.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dbd::new)
   );
   public static final dka b = djq.at;
   public static final int c = 4;
   private static final emf[] j = new emf[]{
      cwj.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      cwj.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      cwj.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      cwj.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      cwj.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final djr k = djq.C;
   public static final djr d = djq.j;

   @Override
   public MapCodec<dbd> a() {
      return a;
   }

   public dbd(dip $$0, diz.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dja $$0, cso $$1, hx $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(cwl.dR);
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      eek $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eel.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      elm $$4 = $$0.n($$1, $$2);
      emf $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      return h($$0) ? $$1.a_($$2.c()).a(cwl.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return $$1 == ic.b && !$$0.a($$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(k) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
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
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      return !h($$2) || !n($$2);
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return h($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      if (h($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean h(dja $$0) {
      return $$0.c(d);
   }

   private static boolean n(dja $$0) {
      return $$0.c(b) == 4;
   }

   public static dja c() {
      return b(0);
   }

   public static dja b(int $$0) {
      return cwl.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
