import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dnp extends dqa {
   public static final MapCodec<dnp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ebv.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.f),
               t()
            )
            .apply($$0, dnp::new)
   );
   public static final ebx b = ebw.A;
   private final ebv d;
   private final int f;
   private final Function<ebg, fgm> g;

   @Override
   public MapCodec<dnp> a() {
      return a;
   }

   protected dnp(ebv $$0, int $$1, ebf.d $$2) {
      super($$2.a($$0.g()));
      this.d = $$0;
      this.l(this.C.b().b(e, jc.c).b(b, Boolean.valueOf(false)).b(c, ebr.b));
      this.f = $$1;
      this.g = this.b();
   }

   private Function<ebg, fgm> b() {
      fgm $$0 = dne.a(14.0);
      fgm $$1 = dne.a(12.0);
      Map<ebr, Map<jc, fgm>> $$2 = fgj.e(dne.b(6.0, 4.0, 8.0, 16.0));
      return this.a($$3 -> fgj.a($$2.get($$3.c(c)).get($$3.c(e)), $$3.c(b) ? $$0 : $$1, ffw.e));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.g.apply($$0);
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if ($$0.c(b)) {
         return but.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return but.a;
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, djs $$3, BiConsumer<daa, iw> $$4) {
      if ($$3.g() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(ebg $$0, djz $$1, iw $$2, @Nullable crz $$3) {
      $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.f);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, egg.a, $$2);
   }

   protected void a(@Nullable crz $$0, dka $$1, iw $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), aws.e);
   }

   protected awq a(boolean $$0) {
      return $$0 ? this.d.o() : this.d.n();
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
      if (!$$3 && $$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected int a(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(ebg $$0) {
      return true;
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, bwv $$3, bxo $$4) {
      if (!$$1.C && this.d.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(ebg $$0, djz $$1, iw $$2) {
      csh $$3 = this.d.e() ? $$1.a(csh.class, $$0.f($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? egg.a : egg.e, $$2);
      }

      if ($$4) {
         $$1.a(new iw($$2), this, this.f);
      }
   }

   private void e(ebg $$0, djz $$1, iw $$2) {
      jc $$3 = n($$0).g();
      eyy $$4 = eyu.a($$1, $$3, $$3.o().d() ? jc.b : $$0.c(e));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(e, b, c);
   }
}
