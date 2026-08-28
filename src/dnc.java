import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dnc extends dpn {
   public static final MapCodec<dnc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ebi.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.f),
               t()
            )
            .apply($$0, dnc::new)
   );
   public static final ebk b = ebj.A;
   private final ebi d;
   private final int f;
   private final Function<eat, ffw> g;

   @Override
   public MapCodec<dnc> a() {
      return a;
   }

   protected dnc(ebi $$0, int $$1, eas.d $$2) {
      super($$2.a($$0.g()));
      this.d = $$0;
      this.l(this.C.b().b(e, jb.c).b(b, Boolean.valueOf(false)).b(c, ebe.b));
      this.f = $$1;
      this.g = this.b();
   }

   private Function<eat, ffw> b() {
      ffw $$0 = dmr.a(14.0);
      ffw $$1 = dmr.a(12.0);
      Map<ebe, Map<jb, ffw>> $$2 = fft.e(dmr.b(6.0, 4.0, 8.0, 16.0));
      return this.a($$3 -> fft.a($$2.get($$3.c(c)).get($$3.c(e)), $$3.c(b) ? $$0 : $$1, ffg.e));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.g.apply($$0);
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if ($$0.c(b)) {
         return bug.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return bug.a;
      }
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, djf $$3, BiConsumer<czn, iv> $$4) {
      if ($$3.g() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(eat $$0, djm $$1, iv $$2, @Nullable crm $$3) {
      $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.f);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, eft.a, $$2);
   }

   protected void a(@Nullable crm $$0, djn $$1, iv $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), awo.e);
   }

   protected awm a(boolean $$0) {
      return $$0 ? this.d.o() : this.d.n();
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, boolean $$3) {
      if (!$$3 && $$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected int a(eat $$0, diq $$1, iv $$2, jb $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(eat $$0, diq $$1, iv $$2, jb $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(eat $$0) {
      return true;
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, bwi $$3, bxb $$4) {
      if (!$$1.C && this.d.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(eat $$0, djm $$1, iv $$2) {
      cru $$3 = this.d.e() ? $$1.a(cru.class, $$0.f($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? eft.a : eft.e, $$2);
      }

      if ($$4) {
         $$1.a(new iv($$2), this, this.f);
      }
   }

   private void e(eat $$0, djm $$1, iv $$2) {
      jb $$3 = n($$0).g();
      eyi $$4 = eye.a($$1, $$3, $$3.o().d() ? jb.b : $$0.c(e));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(e, b, c);
   }
}
