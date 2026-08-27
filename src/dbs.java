import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dbs extends ddl implements ddy {
   public static final MapCodec<dbs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dje.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dbs::new)
   );
   public static final dkp b = dkf.at;
   public static final int c = 4;
   private static final emv[] j = new emv[]{
      cwy.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      cwy.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      cwy.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      cwy.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      cwy.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dkg k = dkf.C;
   public static final dkg d = dkf.j;

   @Override
   public MapCodec<dbs> a() {
      return a;
   }

   public dbs(dje $$0, djo.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(djp $$0, ctd $$1, hx $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(cxa.dR);
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      eez $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == efa.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      emc $$4 = $$0.n($$1, $$2);
      emv $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      return h($$0) ? $$1.a_($$2.c()).a(cxa.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return $$1 == ic.b && !$$0.a($$3, $$4) ? cxa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(k) ? efa.c.a(false) : super.c_($$0);
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
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
   public boolean b(cua $$0, hx $$1, djp $$2) {
      return !h($$2) || !n($$2);
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return h($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      if (h($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean h(djp $$0) {
      return $$0.c(d);
   }

   private static boolean n(djp $$0) {
      return $$0.c(b) == 4;
   }

   public static djp c() {
      return b(0);
   }

   public static djp b(int $$0) {
      return cxa.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
