import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dpa extends dqa {
   public static final MapCodec<dpa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebn.a.fieldOf("wood_type").forGetter($$0x -> $$0x.R), t()).apply($$0, dpa::new)
   );
   public static final eaq b = eap.y;
   public static final eaq c = eap.A;
   public static final eaq d = eap.t;
   private static final Map<ja.a, ffc> f = fez.a(dma.a(16.0, 16.0, 4.0));
   private static final Map<ja.a, ffc> g = Maps.newEnumMap(af.a(f, (Function<? super ffc, ffc>)($$0 -> fez.a($$0, dma.b(16.0, 13.0, 16.0), fem.e))));
   private static final Map<ja.a, ffc> h = fez.a(dma.a(16.0, 4.0, 0.0, 24.0));
   private static final Map<ja.a, ffc> i = fez.a(dma.a(16.0, 4.0, 5.0, 24.0));
   private static final Map<ja.a, ffc> C = fez.a(fez.a(dma.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dma.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0)));
   private static final Map<ja.a, ffc> Q = Maps.newEnumMap(af.a(C, (Function<? super ffc, ffc>)($$0 -> $$0.a(0.0, -0.1875, 0.0).d())));
   private final ebn R;

   @Override
   public MapCodec<dpa> a() {
      return a;
   }

   public dpa(ebn $$0, dzy.d $$1) {
      super($$1.a($$0.d()));
      this.R = $$0;
      this.l(this.B.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      ja.a $$4 = $$0.c(e).o();
      return ($$0.c(d) ? g : f).get($$4);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      ja.a $$8 = $$4.o();
      if ($$0.c(e).h().o() != $$8) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$9 = this.o($$6) || this.o($$1.a_($$3.a($$4.g())));
         return $$0.b(d, Boolean.valueOf($$9));
      }
   }

   @Override
   protected ffc b_(dzz $$0, dib $$1, iu $$2) {
      ja.a $$3 = $$0.c(e).o();
      return $$0.c(b) ? fez.a() : i.get($$3);
   }

   @Override
   protected ffc b(dzz $$0, dib $$1, iu $$2, fen $$3) {
      ja.a $$4 = $$0.c(e).o();
      return $$0.c(b) ? fez.a() : h.get($$4);
   }

   @Override
   protected ffc d_(dzz $$0) {
      ja.a $$1 = $$0.c(e).o();
      return ($$0.c(d) ? Q : C).get($$1);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      switch ($$1) {
         case a:
            return $$0.c(b);
         case b:
            return false;
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   public dzz a(dcr $$0) {
      div $$1 = $$0.q();
      iu $$2 = $$0.a();
      boolean $$3 = $$1.D($$2);
      ja $$4 = $$0.g();
      ja.a $$5 = $$4.o();
      boolean $$6 = $$5 == ja.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == ja.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.m().b(e, $$4).b(b, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(d, Boolean.valueOf($$6));
   }

   private boolean o(dzz $$0) {
      return $$0.a(axc.N);
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         ja $$5 = $$3.cO();
         if ($$0.c(e) == $$5.g()) {
            $$0 = $$0.b(e, $$5);
         }

         $$0 = $$0.b(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.R.g() : this.R.f(), awo.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? eez.h : eez.d, $$2);
      return bub.a;
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, dio $$3, BiConsumer<cyy, iu> $$4) {
      if ($$3.g() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.b(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.R.f() : this.R.g(), awo.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? eez.d : eez.h, $$2, eez.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dma $$3, @Nullable exo $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.D($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)).b(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.R.g() : this.R.f(), awo.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? eez.h : eez.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(e, b, c, d);
   }

   public static boolean a(dzz $$0, ja $$1) {
      return $$0.c(e).o() == $$1.h().o();
   }
}
