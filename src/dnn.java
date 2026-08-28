import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dnn extends dpy {
   public static final MapCodec<dnn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ebt.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.f),
               t()
            )
            .apply($$0, dnn::new)
   );
   public static final ebv b = ebu.A;
   private final ebt d;
   private final int f;
   private final Function<ebe, fgk> g;

   @Override
   public MapCodec<dnn> a() {
      return a;
   }

   protected dnn(ebt $$0, int $$1, ebd.d $$2) {
      super($$2.a($$0.g()));
      this.d = $$0;
      this.l(this.C.b().b(e, jb.c).b(b, Boolean.valueOf(false)).b(c, ebp.b));
      this.f = $$1;
      this.g = this.b();
   }

   private Function<ebe, fgk> b() {
      fgk $$0 = dnc.a(14.0);
      fgk $$1 = dnc.a(12.0);
      Map<ebp, Map<jb, fgk>> $$2 = fgh.e(dnc.b(6.0, 4.0, 8.0, 16.0));
      return this.a($$3 -> fgh.a($$2.get($$3.c(c)).get($$3.c(e)), $$3.c(b) ? $$0 : $$1, ffu.e));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.g.apply($$0);
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if ($$0.c(b)) {
         return bur.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return bur.a;
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, djq $$3, BiConsumer<czy, iv> $$4) {
      if ($$3.g() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(ebe $$0, djx $$1, iv $$2, @Nullable crx $$3) {
      $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.f);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, ege.a, $$2);
   }

   protected void a(@Nullable crx $$0, djy $$1, iv $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), awq.e);
   }

   protected awo a(boolean $$0) {
      return $$0 ? this.d.o() : this.d.n();
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
      if (!$$3 && $$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected int a(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(ebe $$0) {
      return true;
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
      if (!$$1.C && this.d.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(ebe $$0, djx $$1, iv $$2) {
      csf $$3 = this.d.e() ? $$1.a(csf.class, $$0.f($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? ege.a : ege.e, $$2);
      }

      if ($$4) {
         $$1.a(new iv($$2), this, this.f);
      }
   }

   private void e(ebe $$0, djx $$1, iv $$2) {
      jb $$3 = n($$0).g();
      eyw $$4 = eys.a($$1, $$3, $$3.o().d() ? jb.b : $$0.c(e));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(e, b, c);
   }
}
