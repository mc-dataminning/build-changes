import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dmf extends dop {
   public static final MapCodec<dmf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ead.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.f),
               t()
            )
            .apply($$0, dmf::new)
   );
   public static final eaf b = eae.A;
   private final ead d;
   private final int f;
   private final Function<dzo, feq> g;

   @Override
   public MapCodec<dmf> a() {
      return a;
   }

   protected dmf(ead $$0, int $$1, dzn.d $$2) {
      super($$2.a($$0.g()));
      this.d = $$0;
      this.l(this.B.b().b(e, ja.c).b(b, Boolean.valueOf(false)).b(c, dzz.b));
      this.f = $$1;
      this.g = this.b();
   }

   private Function<dzo, feq> b() {
      feq $$0 = dlu.a(14.0);
      feq $$1 = dlu.a(12.0);
      Map<dzz, Map<ja, feq>> $$2 = fen.e(dlu.b(6.0, 4.0, 8.0, 16.0));
      return this.a($$3 -> fen.a($$2.get($$3.c(c)).get($$3.c(e)), $$3.c(b) ? $$0 : $$1, fea.e));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.g.apply($$0);
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if ($$0.c(b)) {
         return bty.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return bty.a;
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, dii $$3, BiConsumer<cys, iu> $$4) {
      if ($$3.g() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(dzo $$0, dip $$1, iu $$2, @Nullable cqs $$3) {
      $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.f);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, eeo.a, $$2);
   }

   protected void a(@Nullable cqs $$0, diq $$1, iu $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), awm.e);
   }

   protected awk a(boolean $$0) {
      return $$0 ? this.d.o() : this.d.n();
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, boolean $$3) {
      if (!$$3 && $$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected int a(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dzo $$0) {
      return true;
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
      if (!$$1.C && this.d.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dzo $$0, dip $$1, iu $$2) {
      cqz $$3 = this.d.e() ? $$1.a(cqz.class, $$0.f($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? eeo.a : eeo.e, $$2);
      }

      if ($$4) {
         $$1.a(new iu($$2), this, this.f);
      }
   }

   private void e(dzo $$0, dip $$1, iu $$2) {
      ja $$3 = n($$0).g();
      exd $$4 = ewz.a($$1, $$3, $$3.o().d() ? ja.b : $$0.c(e));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(e, b, c);
   }
}
