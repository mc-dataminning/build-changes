import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class duz extends dqa implements dtj {
   public static final MapCodec<duz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eao.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.h), t()).apply($$0, duz::new)
   );
   public static final eaq b = eap.y;
   public static final eax<eay> c = eap.ai;
   public static final eaq d = eap.A;
   public static final eaq f = eap.I;
   private static final Map<ja, ffc> g = fez.d(dma.c(16.0, 13.0, 16.0));
   private final eao h;

   @Override
   public MapCodec<? extends duz> a() {
      return a;
   }

   protected duz(eao $$0, dzy.d $$1) {
      super($$1.a($$0.g()));
      this.h = $$0;
      this.l(this.B.b().b(e, ja.c).b(b, Boolean.valueOf(false)).b(c, eay.b).b(d, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return g.get($$0.c(b) ? $$0.c(e) : ($$0.c(c) == eay.a ? ja.a : ja.b));
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      switch ($$1) {
         case a:
            return $$0.c(b);
         case b:
            return $$0.c(f);
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if (!this.h.c()) {
         return bub.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bub.a;
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, dio $$3, BiConsumer<cyy, iu> $$4) {
      if ($$3.g() && this.h.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dzz $$0, div $$1, iu $$2, @Nullable cqy $$3) {
      dzz $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(f)) {
         $$1.a($$2, ewh.c, ewh.c.a($$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cqy $$0, div $$1, iu $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.h.k() : this.h.j(), awo.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? eez.h : eez.d, $$2);
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dma $$3, @Nullable exo $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.D($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(f)) {
               $$1.a($$2, ewh.c, ewh.c.a($$1));
            }
         }
      }
   }

   @Override
   public dzz a(dcr $$0) {
      dzz $$1 = this.m();
      ewg $$2 = $$0.q().b_($$0.a());
      ja $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(e, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? eay.a : eay.b);
      } else {
         $$1 = $$1.b(e, $$0.g().g()).b(c, $$3 == ja.b ? eay.b : eay.a);
      }

      if ($$0.q().D($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(f, Boolean.valueOf($$2.a() == ewh.c));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(e, b, c, d, f);
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(f) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected eao q() {
      return this.h;
   }
}
