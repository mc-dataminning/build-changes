import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dlq extends dnk implements dnx {
   public static final MapCodec<dlq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtp.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dlq::new)
   );
   public static final dva b = duq.at;
   public static final int c = 4;
   private static final eyx[] j = new eyx[]{
      dgv.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dgv.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dgv.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dgv.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dgv.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dur k = duq.C;
   public static final dur d = duq.j;

   @Override
   public MapCodec<dlq> a() {
      return a;
   }

   public dlq(dtp $$0, dtz.d $$1) {
      super($$0, $$1);
      this.l(this.E.b().b(f, Integer.valueOf(0)).b(b, Integer.valueOf(0)).b(k, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dua $$0, dcx $$1, je $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dgx.dR);
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      eqb $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eqc.c;
      return super.a($$0).b(k, Boolean.valueOf($$2)).b(b, Integer.valueOf(4));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      eye $$4 = $$0.a($$2);
      eyx $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(dgx.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return $$1 == jj.b && !$$0.a($$3, $$4) ? dgx.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(k) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
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
   public boolean b(ddv $$0, je $$1, dua $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(dua $$0) {
      return $$0.c(d);
   }

   private static boolean q(dua $$0) {
      return $$0.c(b) == 4;
   }

   public static dua c() {
      return b(0);
   }

   public static dua b(int $$0) {
      return dgx.E.o().b(d, Boolean.valueOf(true)).b(b, Integer.valueOf($$0));
   }
}
