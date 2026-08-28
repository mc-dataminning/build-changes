import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dmh extends dob implements doo {
   public static final MapCodec<dmh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(duh.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, dmh::new)
   );
   public static final dvs b = dvi.at;
   public static final int c = 4;
   private static final ezq[] j = new ezq[]{
      dhm.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dhm.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dhm.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dhm.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dhm.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dvj k = dvi.C;
   public static final dvj d = dvi.j;

   @Override
   public MapCodec<dmh> a() {
      return a;
   }

   public dmh(duh $$0, dur.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)).b(b, Integer.valueOf(0)).b(k, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dus $$0, ddo $$1, jf $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dho.dR);
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      eqt $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == equ.c;
      return super.a($$0).b(k, Boolean.valueOf($$2)).b(b, Integer.valueOf(4));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      eyw $$4 = $$0.a($$2);
      ezq $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(dho.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return $$1 == jk.b && !$$0.a($$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(k) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
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
   public boolean b(dem $$0, jf $$1, dus $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(dus $$0) {
      return $$0.c(d);
   }

   private static boolean q(dus $$0) {
      return $$0.c(b) == 4;
   }

   public static dus c() {
      return b(0);
   }

   public static dus b(int $$0) {
      return dho.E.n().b(d, Boolean.valueOf(true)).b(b, Integer.valueOf($$0));
   }
}
