import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dvq extends duw {
   public static final MapCodec<dvq> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dvq::new));
   public static final eax<ja> e = dqa.e;
   private static final Map<ja, ffc> f = fez.c(dma.a(5.0, 3.0, 13.0, 11.0, 16.0));

   @Override
   public MapCodec<dvq> a() {
      return d;
   }

   protected dvq(mb $$0, dzy.d $$1) {
      super($$0, $$1);
      this.l(this.B.b().b(e, ja.c));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return o($$0);
   }

   public static ffc o(dzz $$0) {
      return f.get($$0.c(e));
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return b($$1, $$2, $$0.c(e));
   }

   public static boolean b(diy $$0, iu $$1, ja $$2) {
      iu $$3 = $$1.a($$2.g());
      dzz $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      dzz $$1 = this.m();
      diy $$2 = $$0.q();
      iu $$3 = $$0.a();
      ja[] $$4 = $$0.f();

      for (ja $$5 : $$4) {
         if ($$5.o().d()) {
            ja $$6 = $$5.g();
            $$1 = $$1.b(e, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return $$4.g() == $$0.c(e) && !$$0.a($$1, $$3) ? dmc.a.m() : $$0;
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      ja $$4 = $$0.c(e);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      ja $$10 = $$4.g();
      $$1.a(lx.ah, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.c, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(e);
   }
}
