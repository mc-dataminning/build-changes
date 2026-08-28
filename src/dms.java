import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dms extends dom implements doz {
   public static final MapCodec<dms> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dus.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, dms::new)
   );
   public static final dwd b = dvt.at;
   public static final int c = 4;
   private static final fab[] j = new fab[]{
      dhy.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dhy.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dhy.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dhy.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dhy.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dvu k = dvt.C;
   public static final dvu d = dvt.j;

   @Override
   public MapCodec<dms> a() {
      return a;
   }

   public dms(dus $$0, dvc.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)).b(b, Integer.valueOf(0)).b(k, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dvd $$0, dea $$1, jg $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dia.dR);
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      ere $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == erf.c;
      return super.a($$0).b(k, Boolean.valueOf($$2)).b(b, Integer.valueOf(4));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      ezh $$4 = $$0.a($$2);
      fab $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(dia.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return $$1 == jl.b && !$$0.a($$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(k) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
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
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(dvd $$0) {
      return $$0.c(d);
   }

   private static boolean q(dvd $$0) {
      return $$0.c(b) == 4;
   }

   public static dvd c() {
      return b(0);
   }

   public static dvd b(int $$0) {
      return dia.E.m().b(d, Boolean.valueOf(true)).b(b, Integer.valueOf($$0));
   }
}
