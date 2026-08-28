import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dvc extends dma {
   public static final MapCodec<dvc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mf.e.q().fieldOf("hook").forGetter($$0x -> $$0x.S), t()).apply($$0, dvc::new)
   );
   public static final eaq b = eap.A;
   public static final eaq c = eap.a;
   public static final eaq d = eap.g;
   public static final eaq e = drt.b;
   public static final eaq f = drt.c;
   public static final eaq g = drt.d;
   public static final eaq h = drt.e;
   private static final Map<ja, eaq> i = dnx.f;
   private static final ffc C = dma.b(16.0, 1.0, 2.5);
   private static final ffc Q = dma.b(16.0, 0.0, 8.0);
   private static final int R = 10;
   private final dma S;

   @Override
   public MapCodec<dvc> a() {
      return a;
   }

   public dvc(dma $$0, dzy.d $$1) {
      super($$1);
      this.l(
         this.B
            .b()
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
            .b(g, Boolean.valueOf(false))
            .b(h, Boolean.valueOf(false))
      );
      this.S = $$0;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return $$0.c(c) ? C : Q;
   }

   @Override
   public dzz a(dcr $$0) {
      dib $$1 = $$0.q();
      iu $$2 = $$0.a();
      return this.m()
         .b(e, Boolean.valueOf(this.a($$1.a_($$2.f()), ja.c)))
         .b(f, Boolean.valueOf(this.a($$1.a_($$2.i()), ja.f)))
         .b(g, Boolean.valueOf(this.a($$1.a_($$2.g()), ja.d)))
         .b(h, Boolean.valueOf(this.a($$1.a_($$2.h()), ja.e)));
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return $$4.o().d() ? $$0.b(i.get($$4), Boolean.valueOf(this.a($$6, $$4))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, boolean $$3) {
      if (!$$3) {
         this.a($$1, $$2, $$0.b(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dzz a(div $$0, iu $$1, dzz $$2, cqy $$3) {
      if (!$$0.C && !$$3.fa().f() && $$3.fa().a(czc.sY)) {
         $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 260);
         $$0.a($$3, eez.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(div $$0, iu $$1, dzz $$2) {
      for (ja $$3 : new ja[]{ja.d, ja.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            iu $$5 = $$1.a($$3, $$4);
            dzz $$6 = $$0.a_($$5);
            if ($$6.a(this.S)) {
               if ($$6.c(dvd.b) == $$3.g()) {
                  dvd.a($$0, $$5, $$6, false, true, $$4, $$2);
               }
               break;
            }

            if (!$$6.a(this)) {
               break;
            }
         }
      }
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, bwd $$3) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, bwd $$3) {
      if (!$$1.C) {
         if (!$$0.c(b)) {
            this.a($$1, $$2, List.of($$3));
         }
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(div $$0, iu $$1) {
      dzz $$2 = $$0.a_($$1);
      List<? extends bwd> $$3 = $$0.a_(null, $$2.f($$0, $$1).a().a($$1));
      this.a($$0, $$1, $$3);
   }

   private void a(div $$0, iu $$1, List<? extends bwd> $$2) {
      dzz $$3 = $$0.a_($$1);
      boolean $$4 = $$3.c(b);
      boolean $$5 = false;
      if (!$$2.isEmpty()) {
         for (bwd $$6 : $$2) {
            if (!$$6.g_()) {
               $$5 = true;
               break;
            }
         }
      }

      if ($$5 != $$4) {
         $$3 = $$3.b(b, Boolean.valueOf($$5));
         $$0.a($$1, $$3, 3);
         this.a($$0, $$1, $$3);
      }

      if ($$5) {
         $$0.a(new iu($$1), this, 10);
      }
   }

   public boolean a(dzz $$0, ja $$1) {
      return $$0.a(this.S) ? $$0.c(dvd.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      switch ($$1) {
         case c:
            return $$0.b(e, $$0.c(g)).b(f, $$0.c(h)).b(g, $$0.c(e)).b(h, $$0.c(f));
         case d:
            return $$0.b(e, $$0.c(f)).b(f, $$0.c(g)).b(g, $$0.c(h)).b(h, $$0.c(e));
         case b:
            return $$0.b(e, $$0.c(h)).b(f, $$0.c(e)).b(g, $$0.c(f)).b(h, $$0.c(g));
         default:
            return $$0;
      }
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      switch ($$1) {
         case b:
            return $$0.b(e, $$0.c(g)).b(g, $$0.c(e));
         case c:
            return $$0.b(f, $$0.c(h)).b(h, $$0.c(f));
         default:
            return super.a($$0, $$1);
      }
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
