import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dha extends dgh implements djq {
   public static final MapCodec<dha> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lu.e.q().fieldOf("turns_into").forGetter(dha::b),
               lu.b.q().fieldOf("brush_sound").forGetter(dha::c),
               lu.b.q().fieldOf("brush_completed_sound").forGetter(dha::d),
               u()
            )
            .apply($$0, dha::new)
   );
   private static final dva c = duq.bv;
   public static final int b = 2;
   private final dgv d;
   private final awc e;
   private final awc f;

   @Override
   public MapCodec<dha> a() {
      return a;
   }

   public dha(dgv $$0, awc $$1, awc $$2, dtz.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.E.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(c);
   }

   @Override
   public dnc a_(dua $$0) {
      return dnc.c;
   }

   @Override
   public void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$1.c_($$2) instanceof dri $$4) {
         $$4.b();
      }

      if (djr.n($$1.a_($$2.e())) && $$2.v() >= $$1.G_()) {
         cjy $$5 = cjy.a($$1, $$2, $$0);
         $$5.o();
      }
   }

   @Override
   public void a(dds $$0, je $$1, cjy $$2) {
      eye $$3 = $$2.cO().f();
      $$0.c(2001, je.a((jx)$$3), dgv.j($$2.q()));
      $$0.a($$2, dyx.f, $$3);
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      if ($$3.a(16) == 0) {
         je $$4 = $$2.e();
         if (djr.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new lf(ln.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dre a(je $$0, dua $$1) {
      return new dri($$0, $$1);
   }

   public dgv b() {
      return this.d;
   }

   public awc c() {
      return this.e;
   }

   public awc d() {
      return this.f;
   }
}
