import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dls extends dgc {
   public static final MapCodec<dls> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfh.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), kk.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, dls::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dvo g = dve.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dfh.c j;

   @Override
   public MapCodec<dls> a() {
      return d;
   }

   public dls(dfh.c $$0, kk.a $$1, dun.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.l(this.F.b().b(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(duo $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(eqo $$0) {
      return $$0 == eqq.c && this.j == dfh.c.b;
   }

   @Override
   protected double b(duo $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, bto $$3) {
      if (!$$1.B && $$3.bV() && this.a($$0, $$2, $$3)) {
         $$3.aF();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(duo $$0, deg $$1, je $$2) {
      if (this.j == dfh.c.c) {
         d(dhl.fu.o().b(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(duo $$0, deg $$1, je $$2) {
      int $$3 = $$0.c(g) - 1;
      duo $$4 = $$3 == 0 ? dhl.ft.o() : $$0.b(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dzl.c, $$2, dzl.a.a($$4));
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, dfh.c $$3) {
      if (die.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         duo $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dzl.c, $$2, dzl.a.a($$4));
      }
   }

   @Override
   protected int a(duo $$0, deg $$1, je $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, eqo $$3) {
      if (!this.d($$0)) {
         duo $$4 = $$0.b(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dzl.c, $$2, dzl.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
