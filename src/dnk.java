import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dnk extends dmq implements dqb {
   public static final MapCodec<dnk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               mh.e.q().fieldOf("turns_into").forGetter(dnk::b),
               mh.b.q().fieldOf("brush_sound").forGetter(dnk::c),
               mh.b.q().fieldOf("brush_completed_sound").forGetter(dnk::d),
               t()
            )
            .apply($$0, dnk::new)
   );
   private static final ecg c = ebw.by;
   public static final int b = 2;
   private final dne d;
   private final awq e;
   private final awq f;

   @Override
   public MapCodec<dnk> a() {
      return a;
   }

   public dnk(dne $$0, awq $$1, awq $$2, ebf.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c);
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      $$2.a($$3, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if ($$1.c_($$2) instanceof dyj $$4) {
         $$4.a($$1);
      }

      if (dqc.n($$1.a_($$2.e())) && $$2.v() >= $$1.K_()) {
         cod $$5 = cod.a($$1, $$2, $$0);
         $$5.g();
      }
   }

   @Override
   public void a(djz $$0, iw $$1, cod $$2) {
      ffs $$3 = $$2.cR().f();
      $$0.c(2001, iw.a((jq)$$3), dne.j($$2.j()));
      $$0.a($$2, egg.f, $$3);
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      if ($$3.a(16) == 0) {
         iw $$4 = $$2.e();
         if (dqc.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new lr(lz.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dyj($$0, $$1);
   }

   public dne b() {
      return this.d;
   }

   public awq c() {
      return this.e;
   }

   public awq d() {
      return this.f;
   }
}
