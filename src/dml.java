import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dml extends dov {
   public static final MapCodec<dml> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eao.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.f),
               t()
            )
            .apply($$0, dml::new)
   );
   public static final eaq b = eap.A;
   private final eao d;
   private final int f;
   private final Function<dzz, ffc> g;

   @Override
   public MapCodec<dml> a() {
      return a;
   }

   protected dml(eao $$0, int $$1, dzy.d $$2) {
      super($$2.a($$0.g()));
      this.d = $$0;
      this.l(this.B.b().b(e, ja.c).b(b, Boolean.valueOf(false)).b(c, eak.b));
      this.f = $$1;
      this.g = this.b();
   }

   private Function<dzz, ffc> b() {
      ffc $$0 = dma.a(14.0);
      ffc $$1 = dma.a(12.0);
      Map<eak, Map<ja, ffc>> $$2 = fez.e(dma.b(6.0, 4.0, 8.0, 16.0));
      return this.a($$3 -> fez.a($$2.get($$3.c(c)).get($$3.c(e)), $$3.c(b) ? $$0 : $$1, fem.e));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return this.g.apply($$0);
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if ($$0.c(b)) {
         return bub.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return bub.a;
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, dio $$3, BiConsumer<cyy, iu> $$4) {
      if ($$3.g() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(dzz $$0, div $$1, iu $$2, @Nullable cqy $$3) {
      $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.f);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, eez.a, $$2);
   }

   protected void a(@Nullable cqy $$0, diw $$1, iu $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), awo.e);
   }

   protected awm a(boolean $$0) {
      return $$0 ? this.d.o() : this.d.n();
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, boolean $$3) {
      if (!$$3 && $$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected int a(dzz $$0, dib $$1, iu $$2, ja $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dzz $$0, dib $$1, iu $$2, ja $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dzz $$0) {
      return true;
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, bwd $$3) {
      if (!$$1.C && this.d.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dzz $$0, div $$1, iu $$2) {
      crf $$3 = this.d.e() ? $$1.a(crf.class, $$0.f($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? eez.a : eez.e, $$2);
      }

      if ($$4) {
         $$1.a(new iu($$2), this, this.f);
      }
   }

   private void e(dzz $$0, div $$1, iu $$2) {
      ja $$3 = n($$0).g();
      exo $$4 = exk.a($$1, $$3, $$3.o().d() ? ja.b : $$0.c(e));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(e, b, c);
   }
}
