import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dwv extends dwb {
   public static final MapCodec<dwv> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dwv::new));
   public static final ecc<jb> e = drd.e;
   private static final Map<jb, fgk> f = fgh.c(dnc.a(5.0, 3.0, 13.0, 11.0, 16.0));

   @Override
   public MapCodec<dwv> a() {
      return d;
   }

   protected dwv(mc $$0, ebd.d $$1) {
      super($$0, $$1);
      this.l(this.C.b().b(e, jb.c));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return o($$0);
   }

   public static fgk o(ebe $$0) {
      return f.get($$0.c(e));
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return b($$1, $$2, $$0.c(e));
   }

   public static boolean b(dka $$0, iv $$1, jb $$2) {
      iv $$3 = $$1.a($$2.g());
      ebe $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      ebe $$1 = this.m();
      dka $$2 = $$0.q();
      iv $$3 = $$0.a();
      jb[] $$4 = $$0.f();

      for (jb $$5 : $$4) {
         if ($$5.o().d()) {
            jb $$6 = $$5.g();
            $$1 = $$1.b(e, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return $$4.g() == $$0.c(e) && !$$0.a($$1, $$3) ? dne.a.m() : $$0;
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      jb $$4 = $$0.c(e);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      jb $$10 = $$4.g();
      $$1.a(ly.ah, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.c, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(e);
   }
}
