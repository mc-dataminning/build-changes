import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dmq extends dpb {
   public static final MapCodec<dmq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eaw.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.f),
               t()
            )
            .apply($$0, dmq::new)
   );
   public static final eay b = eax.A;
   private final eaw d;
   private final int f;
   private final Function<eah, ffk> g;

   @Override
   public MapCodec<dmq> a() {
      return a;
   }

   protected dmq(eaw $$0, int $$1, eag.d $$2) {
      super($$2.a($$0.g()));
      this.d = $$0;
      this.l(this.C.b().b(e, ja.c).b(b, Boolean.valueOf(false)).b(c, eas.b));
      this.f = $$1;
      this.g = this.b();
   }

   private Function<eah, ffk> b() {
      ffk $$0 = dmf.a(14.0);
      ffk $$1 = dmf.a(12.0);
      Map<eas, Map<ja, ffk>> $$2 = ffh.e(dmf.b(6.0, 4.0, 8.0, 16.0));
      return this.a($$3 -> ffh.a($$2.get($$3.c(c)).get($$3.c(e)), $$3.c(b) ? $$0 : $$1, feu.e));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.g.apply($$0);
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if ($$0.c(b)) {
         return bud.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return bud.a;
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, dit $$3, BiConsumer<czd, iu> $$4) {
      if ($$3.g() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(eah $$0, dja $$1, iu $$2, @Nullable crc $$3) {
      $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.f);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, efh.a, $$2);
   }

   protected void a(@Nullable crc $$0, djb $$1, iu $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), awo.e);
   }

   protected awm a(boolean $$0) {
      return $$0 ? this.d.o() : this.d.n();
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, boolean $$3) {
      if (!$$3 && $$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected int a(eah $$0, dig $$1, iu $$2, ja $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(eah $$0, dig $$1, iu $$2, ja $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(eah $$0) {
      return true;
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, bwf $$3) {
      if (!$$1.C && this.d.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(eah $$0, dja $$1, iu $$2) {
      crk $$3 = this.d.e() ? $$1.a(crk.class, $$0.f($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? efh.a : efh.e, $$2);
      }

      if ($$4) {
         $$1.a(new iu($$2), this, this.f);
      }
   }

   private void e(eah $$0, dja $$1, iu $$2) {
      ja $$3 = n($$0).g();
      exw $$4 = exs.a($$1, $$3, $$3.o().d() ? ja.b : $$0.c(e));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(e, b, c);
   }
}
