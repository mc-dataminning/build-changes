import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dme extends dny implements dol {
   public static final MapCodec<dme> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dud.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dme::new)
   );
   public static final dvo b = dve.at;
   public static final int c = 4;
   private static final ezm[] j = new ezm[]{
      dhj.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dhj.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dhj.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dhj.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dhj.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dvf k = dve.C;
   public static final dvf d = dve.j;

   @Override
   public MapCodec<dme> a() {
      return a;
   }

   public dme(dud $$0, dun.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)).b(b, Integer.valueOf(0)).b(k, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(duo $$0, ddl $$1, je $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dhl.dR);
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      eqp $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eqq.c;
      return super.a($$0).b(k, Boolean.valueOf($$2)).b(b, Integer.valueOf(4));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      eys $$4 = $$0.a($$2);
      ezm $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(dhl.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return $$1 == jj.b && !$$0.a($$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(k) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      if (!o($$0)) {
         if ($$3.a(7) == 0) {
            this.a($$1, $$2, $$0, $$3);
         }
      } else {
         if (!q($$0)) {
            $$1.a($$2, $$0.a(b), 2);
         }
      }
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(duo $$0) {
      return $$0.c(d);
   }

   private static boolean q(duo $$0) {
      return $$0.c(b) == 4;
   }

   public static duo c() {
      return b(0);
   }

   public static duo b(int $$0) {
      return dhl.E.o().b(d, Boolean.valueOf(true)).b(b, Integer.valueOf($$0));
   }
}
