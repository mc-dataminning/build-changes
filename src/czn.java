import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class czn extends dbg implements dbt {
   public static final MapCodec<czn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgl.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, czn::new)
   );
   public static final dhw b = dhm.at;
   public static final int c = 4;
   private static final ekb[] j = new ekb[]{
      cut.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      cut.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      cut.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      cut.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      cut.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dhn k = dhm.C;
   public static final dhn d = dhm.j;

   @Override
   public MapCodec<czn> a() {
      return a;
   }

   public czn(dgl $$0, dgv.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean d(dgw $$0, cqy $$1, ht $$2) {
      return super.d($$0, $$1, $$2) || $$0.a(cuv.dR);
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      ecg $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ech.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      eji $$4 = $$0.n($$1, $$2);
      ekb $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      return h($$0) ? $$1.a_($$2.c()).a(cuv.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return $$1 == hx.b && !$$0.a($$3, $$4) ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(k) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
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
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      return !h($$2) || !n($$2);
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return h($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      if (h($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean h(dgw $$0) {
      return $$0.c(d);
   }

   private static boolean n(dgw $$0) {
      return $$0.c(b) == 4;
   }

   public static dgw c() {
      return b(0);
   }

   public static dgw b(int $$0) {
      return cuv.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
