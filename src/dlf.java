import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dlf extends dnp {
   public static final MapCodec<dlf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dzb.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.f),
               t()
            )
            .apply($$0, dlf::new)
   );
   public static final dzd b = dzc.A;
   private final dzb d;
   private final int f;
   private final Function<dym, fdo> g;

   @Override
   public MapCodec<dlf> a() {
      return a;
   }

   protected dlf(dzb $$0, int $$1, dyl.d $$2) {
      super($$2.a($$0.g()));
      this.d = $$0;
      this.l(this.B.b().b(e, jo.c).b(b, Boolean.valueOf(false)).b(c, dyx.b));
      this.f = $$1;
      this.g = this.b();
   }

   private Function<dym, fdo> b() {
      fdo $$0 = dku.a(14.0);
      fdo $$1 = dku.a(12.0);
      Map<dyx, Map<jo, fdo>> $$2 = fdl.e(dku.b(6.0, 4.0, 8.0, 16.0));
      return this.a($$3 -> fdl.a($$2.get($$3.c(c)).get($$3.c(e)), $$3.c(b) ? $$0 : $$1, fcy.e));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.g.apply($$0);
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if ($$0.c(b)) {
         return btq.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return btq.a;
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, dhi $$3, BiConsumer<cxy, jj> $$4) {
      if ($$3.g() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(dym $$0, dhp $$1, jj $$2, @Nullable cqi $$3) {
      $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.f);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, edm.a, $$2);
   }

   protected void a(@Nullable cqi $$0, dhq $$1, jj $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), awl.e);
   }

   protected awj a(boolean $$0) {
      return $$0 ? this.d.o() : this.d.n();
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      if (!$$3 && $$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected int a(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dym $$0) {
      return true;
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, bvs $$3) {
      if (!$$1.C && this.d.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dym $$0, dhp $$1, jj $$2) {
      cqp $$3 = this.d.e() ? $$1.a(cqp.class, $$0.f($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? edm.a : edm.e, $$2);
      }

      if ($$4) {
         $$1.a(new jj($$2), this, this.f);
      }
   }

   private void e(dym $$0, dhp $$1, jj $$2) {
      jo $$3 = n($$0).g();
      ewb $$4 = evx.a($$1, $$3, $$3.o().d() ? jo.b : $$0.c(e));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(e, b, c);
   }
}
