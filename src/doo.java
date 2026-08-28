import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doo extends doy {
   public static final MapCodec<doo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("open").forGetter($$0x -> $$0x.f.c), t()).apply($$0, doo::new)
   );
   private static final int d = 3;
   private static final int e = 2;
   private final doo.a f;

   @Override
   public MapCodec<? extends doo> a() {
      return a;
   }

   public doo(doo.a $$0, dzn.d $$1) {
      super($$0.d, $$0.e, $$1);
      this.f = $$0;
   }

   public doo(boolean $$0, dzn.d $$1) {
      super(doo.a.a($$0).d, doo.a.a($$0).e, $$1);
      this.f = doo.a.a($$0);
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      if (this.f.d() && $$3.a(700) == 0) {
         dzo $$4 = $$1.a_($$2.e());
         if ($$4.a(dlw.ua)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awl.jh, awm.e, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.f.c().f, awm.e, 1.0F, 1.0F);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.f.c().g, awm.e, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean c(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if (!$$1.B_().j()) {
         return false;
      } else if (dnp.a($$1) == this.f.c) {
         return false;
      } else {
         doo.a $$4 = this.f.c();
         $$1.a($$2, $$4.b(), 3);
         $$1.a(eeo.c, $$2, eeo.a.a($$0));
         $$4.a($$1, $$2, $$3);
         iu.c($$2.b(-3, -2, -3), $$2.b(3, 2, 3)).forEach($$4x -> {
            dzo $$5 = $$1.a_($$4x);
            if ($$5 == $$0) {
               double $$6 = Math.sqrt($$2.j($$4x));
               int $$7 = $$3.a((int)($$6 * 5.0), (int)($$6 * 10.0));
               $$1.a($$4x, $$0.b(), $$7);
            }
         });
         return true;
      }
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
      if (!$$1.w_() && $$1.an() != btv.a && $$3 instanceof cip $$4 && cip.c($$0) && !$$4.b(bvg.s)) {
         $$4.a(this.b());
      }
   }

   @Override
   public bve b() {
      return new bve(bvg.s, 25);
   }

   public static enum a {
      a(true, bvg.o, 11.0F, awl.jd, awl.je, 16545810),
      b(false, bvg.i, 7.0F, awl.jf, awl.jg, 6250335);

      final boolean c;
      final je<bvc> d;
      final float e;
      final awk f;
      final awk g;
      private final int h;

      private a(final boolean $$0, final je<bvc> $$1, final float $$2, final awk $$3, final awk $$4, final int $$5) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
         this.h = $$5;
      }

      public dlu a() {
         return this.c ? dlw.ud : dlw.ue;
      }

      public dzo b() {
         return this.a().m();
      }

      public doo.a c() {
         return a(!this.c);
      }

      public boolean d() {
         return this.c;
      }

      public static doo.a a(boolean $$0) {
         return $$0 ? a : b;
      }

      public void a(aro $$0, iu $$1, azt $$2) {
         fdw $$3 = $$1.b();
         double $$4 = 0.5 + $$2.j();
         fdw $$5 = new fdw($$2.j() - 0.5, $$2.j() + 1.0, $$2.j() - 0.5);
         fdw $$6 = $$3.e($$5.c($$4));
         mc $$7 = new mc($$6, this.h, (int)(20.0 * $$4));
         $$0.a($$7, $$3.d, $$3.e, $$3.f, 1, 0.0, 0.0, 0.0, 0.0);
      }

      public awk e() {
         return this.f;
      }
   }
}
